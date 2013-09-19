/**
 * 
 */
package com.mycomp.context;



import java.util.Date;

import com.mycomp.gen.AccountResult;
import com.mycomp.gen.GetAccountRequest;
import com.mycomp.gen.GetAccountRequestInfo;
import com.mycomp.gen.GetAccountResponse;
import com.mycomp.gen.GetAccountResponseInfo;
import com.mycomp.gen.Request;
import com.mycomp.gen.Response;
import com.mycomp.model.LogInfo;
import com.mycomp.model.vo.AccountVO;
import com.mycomp.utils.AppLogger;


// TODO: Auto-generated Javadoc
/**
 * The Class GetAccountImpl.
 * 
 * @author Dinakaran Jayaraman
 */
public class GetAccountImpl extends TemplateStrategyImpl {


	@Override
	public Response getWSResponse(Request request, LogInfo logInfo) {
		String emailId = getEmailId(request);
		StringBuilder logMsg = new StringBuilder().append(
				"Input emailId is:").append(emailId);
		String serverRequestId = getServerRequesId();
		String requestId = request.getRequestId();
		logInfo.setServerRequestId(serverRequestId);
		logInfo.setClientRequestId(requestId);
		logInfo.setLogMessage(logMsg.toString());
		logger.log(AppLogger.INFO, logInfo);
		AccountVO account = null;
		try {
			account = getAccountService().getAccount(emailId);
			logMsg = new StringBuilder()
					.append("getAccount response for the emailId ")
					.append(emailId).append(" is ").append(account);
			logInfo.setLogMessage(logMsg.toString());
			logger.log(AppLogger.INFO, logInfo);

			AccountResult result = null;//

			return buildResponseObject(serverRequestId, requestId, result);
		} catch (Throwable t) {
			logInfo.setLogMessage(t.getMessage());
			logger.log(AppLogger.ERROR, logInfo, t);
			return handleWSErrorResponse(t.getMessage(), serverRequestId,
					requestId);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.putnam.attr.context.TemplateStrategyImpl#buildResponseObject(java
	 * .lang.String, java.lang.String, java.lang.Object)
	 */
	protected Response buildResponseObject(String serverRequestId,
			String requestId, Object resultObject) {
		GetAccountResponseInfo responseInfo = new GetAccountResponseInfo();
		responseInfo.setAccount((AccountResult)resultObject);
		GetAccountResponse response = new GetAccountResponse();
		response.setGetAccountResponseInfo(responseInfo);
		response.setServerRequestId(serverRequestId);
		return response;
	}

	/**
	 * Gets the account code.
	 * 
	 * @param request
	 *            the request
	 * @return the accountcode
	 */
	private String getEmailId(Request request) {
		GetAccountRequest getAccountRequest = (GetAccountRequest) request;
		GetAccountRequestInfo requestInfo = getAccountRequest.getGetAccountRequestInfo();
		return requestInfo.getEmailId();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GetAccount");
		return builder.toString();
	}

}
