/**
 * 
 */
package com.mycomp.context;


import com.mycomp.gen.ErrorResponse;
import com.mycomp.gen.ErrorResponseInfo;
import com.mycomp.gen.Request;
import com.mycomp.gen.Response;
import com.mycomp.model.LogInfo;
import com.mycomp.service.IdManager;
import com.mycomp.utils.AppLogger;
import com.mycomp.webservices.WSFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class AttrContext.
 * 
 * @author Dinakaran Jayaraman
 */
public class AppContext {

	/** The logger. */
	protected final AppLogger logger = AppLogger
			.getLogger(getClass());


	private AppStrategy appStrategy;

	/** The request. */
	private Request request;

	/** The id manager. */
	private IdManager idManager;

	/**
	 * Instantiates a new attr context.
	 * 
	 * @param request
	 *            the request
	 * @param idManager
	 *            the id manager
	 */
	public AppContext(Request request, IdManager idManager) {
		this.request = request;
		this.idManager = idManager;
		this.appStrategy = WSFactory.getStrategy(request.getClass().getName());
	}

	/**
	 * Execute strategy.
	 * 
	 * @param logInfo
	 *            the log info
	 * @return the wS response
	 */
	public Response executeStrategy(LogInfo logInfo) {
		StringBuilder logMsg = new StringBuilder().append("executeStrategy");
		String serverRequestId = getServerRequesId();
		String requestId = request.getRequestId();
		logInfo.setServerRequestId(serverRequestId);
		logInfo.setClientRequestId(requestId);
		logInfo.setLogMessage(logMsg.toString());
		logger.log(AppLogger.INFO, logInfo);
		Response response = null;
		try {
			response = appStrategy.getWSResponse(request, logInfo);
		} catch (Throwable e) {
			logInfo.setLogMessage(e.getMessage());
			logger.log(AppLogger.ERROR, logInfo, e);
			response = handleWSErrorResponse(e.getMessage(), serverRequestId,
					requestId);
		}
		return response;
	}

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
	private Response handleWSErrorResponse(String message,
			String serverRequestId, String requestId) {
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
	private String getServerRequesId() {
		return getIdManager().getWsServerRequestId();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(appStrategy.toString());
		return builder.toString();
	}

	/**
	 * Gets the id manager.
	 * 
	 * @return the id manager
	 */
	public IdManager getIdManager() {
		return idManager;
	}

	/**
	 * Sets the id manager.
	 * 
	 * @param idManager
	 *            the new id manager
	 */
	public void setIdManager(IdManager idManager) {
		this.idManager = idManager;
	}

}
