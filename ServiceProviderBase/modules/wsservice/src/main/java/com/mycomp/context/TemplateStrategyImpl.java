/**
 * 
 */
package com.mycomp.context;

import static com.mycomp.utils.Constants.ID_MANAGER;

import org.springframework.beans.factory.annotation.Autowired;

import com.mycomp.SpringContext;
import com.mycomp.gen.ErrorResponse;
import com.mycomp.gen.ErrorResponseInfo;
import com.mycomp.gen.Request;
import com.mycomp.gen.Response;
import com.mycomp.model.LogInfo;
import com.mycomp.service.AccountService;
import com.mycomp.service.IdManager;
import com.mycomp.utils.AppLogger;

// TODO: Auto-generated Javadoc
/**
 * The Class TemplateStrategyImpl.
 * 
 * @author Dinakaran Jayaraman
 */
public abstract class TemplateStrategyImpl implements AppStrategy {

	/** The logger. */
	protected final AppLogger logger = AppLogger
			.getLogger(getClass());

	/** The id manager. */
	private IdManager idManager;

	private AccountService accountService;
	
	/**
	 * Gets the id manager.
	 * 
	 * @return the idManager
	 */
	protected IdManager getIdManager() {
		if (idManager == null) {
			idManager = (IdManager) SpringContext.getBean(ID_MANAGER);
		}
		return idManager;
	}

	@Autowired
	protected AccountService getAccountService(){
		return accountService;
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
	protected Response handleWSErrorResponse(String message,
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
	protected String getServerRequesId() {
		return getIdManager().getWsServerRequestId();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.putnam.attr.context.AttrStrategy#getWSResponse(com.putnam.attr.client
	 * .WSRequest, com.putnam.attr.model.LogInfo)
	 */
	public abstract Response getWSResponse(Request request, LogInfo logInfo)
			throws Exception;

	/**
	 * Builds the response object.
	 * 
	 * @param serverRequestId
	 *            the server request id
	 * @param clientRequestId
	 *            the client request id
	 * @param resultObject
	 *            the result object
	 * @return the wS response
	 */
	protected abstract Response buildResponseObject(String serverRequestId,
			String clientRequestId, Object resultObject);
}
