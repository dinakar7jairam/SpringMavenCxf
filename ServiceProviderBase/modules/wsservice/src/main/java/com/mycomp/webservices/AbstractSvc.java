/**
 * 
 */
package com.mycomp.webservices;

import java.util.List;

import com.mycomp.SpringContext;
import com.mycomp.gen.ErrorResponse;
import com.mycomp.gen.ErrorResponseInfo;
import com.mycomp.gen.Fault_Exception;
import com.mycomp.gen.Request;
import com.mycomp.gen.RequestList;
import com.mycomp.gen.Response;
import com.mycomp.gen.ResponseList;
import com.mycomp.model.LogInfo;
import com.mycomp.service.IdManager;
import com.mycomp.utils.AppLogger;

// TODO: Auto-generated Javadoc
/**
 * The Class TemplateWS.
 * 
 * @author Dinakaran Jayaraman
 */
public abstract class AbstractSvc {

	/** The logger. */
	protected final AppLogger logger = AppLogger
			.getLogger(getClass());


	/** The id manager. */
	private IdManager idManager;

	/**
	 * Gets the id manager.
	 * 
	 * @return the idManager
	 */
	protected IdManager getIdManager() {
		if (idManager == null) {
			idManager = (IdManager) SpringContext.getBean("idManager");
		}
		return idManager;
	}

	/**
	 * Execute ws call.
	 * 
	 * @param arg0
	 *            the arg0
	 * @return the wS response list
	 * @throws WSFault_Exception
	 *             the wS fault_ exception
	 */
	protected ResponseList executeWSCall(RequestList arg0)
			throws Fault_Exception {
		// TODO Check the usage of the below 3 properties with Carlos.
		long startTime = System.currentTimeMillis();
		ResponseList wsResponseList = new ResponseList();
		wsResponseList.setServerResponseId(getServerResponseId());
		String appName = "Some service";
		LogInfo logInfo = getLogInfo(wsResponseList.getServerResponseId(),
				 appName, this.toString());
		logger.log(AppLogger.INFO, logInfo);

		List<Request> requests = arg0.getRequests();
		for (Request request : requests) {
			wsResponseList.getResponses().add(
					this.getWSResponse(request, logInfo));
		}
		long endTime = System.currentTimeMillis();
		logInfo.setLogMessage(getExecutionTimeMessage(startTime, endTime));
		logger.log(AppLogger.INFO, logInfo);
		return wsResponseList;
	}

	/**
	 * Gets the wS response.
	 * 
	 * @param request
	 *            the request
	 * @param logInfo
	 *            the log info
	 * @return the wS response
	 */
	protected abstract Response getWSResponse(Request request,
			LogInfo logInfo);

	/**
	 * Handle ws error response.
	 * 
	 * @param message
	 *            the message
	 * @param serverRequestId
	 *            the server request id
	 * @param clientRequestId
	 *            the client request id
	 * @return the wS response
	 */
	protected Response handleWSErrorResponse(String message,
			String serverRequestId, String clientRequestId) {
		ErrorResponseInfo wsErrorResponseInfo = new ErrorResponseInfo();
		// TODO Define some error codes and send back that as Error Message
		wsErrorResponseInfo.setMessage(message);
		ErrorResponse wsErrorResponse = new ErrorResponse();
		wsErrorResponse.setErrorResponseInfo(wsErrorResponseInfo);
		wsErrorResponse.setServerRequestId(serverRequestId);
		return wsErrorResponse;
	}

	/**
	 * Gets the server reques id.
	 * 
	 * @return the server reques id
	 */
	protected String getServerRequesId() {
		return getIdManager().getWsServerRequestId();
	}

	/**
	 * Gets the server response id.
	 * 
	 * @return the server response id
	 */
	private String getServerResponseId() {
		return getIdManager().getWsServerResponseId();
	}

	/**
	 * Gets the log info.
	 * 
	 * @param serverResponseId
	 *            the server response id
	 * @param clientRequestId
	 *            the client request id
	 * @param clientAppName
	 *            the client app name
	 * @param logMessage
	 *            the log message
	 * @return the log info
	 */
	private LogInfo getLogInfo(String serverResponseId, 
			String clientAppName, String logMessage) {
		LogInfo logInfo = new LogInfo();
		logInfo.setAppName(clientAppName);
		logInfo.setServerResponseId(serverResponseId);
		logInfo.setLogMessage(logMessage);
		return logInfo;
	}

	/**
	 * Gets the execution time message.
	 * 
	 * @param startTime
	 *            the start time
	 * @param endTime
	 *            the end time
	 * @return the execution time message
	 */
	private String getExecutionTimeMessage(long startTime, long endTime) {
		long executionTime = (endTime - startTime) / 1000;
		StringBuilder logMsgBuilder = new StringBuilder();
		logMsgBuilder.append("Execution time in seconds for ")
				.append(this.toString()).append(" is ").append(executionTime);
		return logMsgBuilder.toString();
	}
}
