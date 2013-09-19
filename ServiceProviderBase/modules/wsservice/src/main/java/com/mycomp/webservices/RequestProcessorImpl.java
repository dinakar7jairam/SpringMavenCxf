/**
 * 
 */
package com.mycomp.webservices;

import java.util.List;

import com.mycomp.SpringContext;
import com.mycomp.context.AppContext;
import com.mycomp.gen.Request;
import com.mycomp.gen.RequestList;
import com.mycomp.gen.ResponseList;
import com.mycomp.model.LogInfo;
import com.mycomp.service.IdManager;
import com.mycomp.utils.AppLogger;

// TODO: Auto-generated Javadoc
/**
 * The Class RequestProcessorImpl.
 * 
 * @author Dinakaran Jayaraman
 */
public class RequestProcessorImpl implements RequestProcessor {

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.putnam.attr.webservices.RequestProcessor#submitRequest(com.putnam
	 * .attr.client.WSRequestList)
	 */

	public ResponseList executeRequest(RequestList wsRequestList) {
		String clientId = wsRequestList.getAppName();
		String appName = wsRequestList.getAppName() != null ? wsRequestList.getAppName() : "DEMO";
		String clientRequestId = wsRequestList.getAppRequestId();
		ResponseList wsResponseList = new ResponseList();
		wsResponseList.setServerResponseId(getServerResponseId());
		wsResponseList.setAppRequestId(clientRequestId);
		LogInfo logInfo = new LogInfo();
		List<Request> requests = wsRequestList.getRequests();
		for (Request request : requests) {
			long startTime = System.currentTimeMillis();
			AppContext context = new AppContext(request, getIdManager());
			wsResponseList.getResponses().add(context.executeStrategy(logInfo));
			long endTime = System.currentTimeMillis();
			logInfo.setLogMessage(getExecutionTimeMessage(context.toString(),
					startTime, endTime));
			logger.log(AppLogger.INFO, logInfo);
		}
		return wsResponseList;
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
	private LogInfo getLogInfo(String serverResponseId, String clientRequestId,
			String clientAppName, String logMessage) {
		LogInfo logInfo = new LogInfo();
		logInfo.setAppName(clientAppName);
		logInfo.setClientRequestId(clientRequestId);
		logInfo.setServerResponseId(serverResponseId);
		logInfo.setLogMessage(logMessage);
		return logInfo;
	}

	/**
	 * Gets the execution time message.
	 * 
	 * @param msg
	 *            the msg
	 * @param startTime
	 *            the start time
	 * @param endTime
	 *            the end time
	 * @return the execution time message
	 */
	private String getExecutionTimeMessage(String msg, long startTime,
			long endTime) {
		long executionTime = (endTime - startTime) / 1000;
		StringBuilder logMsgBuilder = new StringBuilder();
		logMsgBuilder.append("Execution time in seconds for ").append(msg)
				.append(" is ").append(executionTime);
		return logMsgBuilder.toString();
	}
}
