/**
 * 
 */
package com.mycomp.model;

// TODO: Auto-generated Javadoc
/**
 * The Class LogInfo.
 * 
 * @author Dinakaran Jayaraman
 */
public class LogInfo {

	/** The server response id. */
	private String serverResponseId;

	/** The client request id. */
	private String clientRequestId;

	/** The app name. */
	private String appName;

	/** The server request id. */
	private String serverRequestId;

	/** The log message. */
	private String logMessage;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LogInfo [serverResponseId=");
		builder.append(serverResponseId);
		if (clientRequestId != null && !clientRequestId.trim().equals("")) {
			builder.append(", clientRequestId=");
			builder.append(clientRequestId);
		}
		if (serverRequestId != null && !serverRequestId.trim().equals("")) {
			builder.append(", serverRequestId=");
			builder.append(serverRequestId);
		}
		if (appName != null && !appName.trim().equals("")) {
			builder.append(", appName=");
			builder.append(appName);
		}

		builder.append("] - ");
		if (logMessage != null && !logMessage.trim().equals("")) {
			builder.append(logMessage);
		}
		return builder.toString();
	}

	/**
	 * Gets the server response id.
	 * 
	 * @return the server response id
	 */
	public String getServerResponseId() {
		return serverResponseId;
	}

	/**
	 * Sets the server response id.
	 * 
	 * @param serverResponseId
	 *            the new server response id
	 */
	public void setServerResponseId(String serverResponseId) {
		this.serverResponseId = serverResponseId;
	}

	/**
	 * Gets the client request id.
	 * 
	 * @return the client request id
	 */
	public String getClientRequestId() {
		return clientRequestId;
	}

	/**
	 * Sets the client request id.
	 * 
	 * @param clientRequestId
	 *            the new client request id
	 */
	public void setClientRequestId(String clientRequestId) {
		this.clientRequestId = clientRequestId;
	}

	/**
	 * Gets the app name.
	 * 
	 * @return the app name
	 */
	public String getAppName() {
		return appName;
	}

	/**
	 * Sets the app name.
	 * 
	 * @param appName
	 *            the new app name
	 */
	public void setAppName(String appName) {
		this.appName = appName;
	}

	/**
	 * Gets the server request id.
	 * 
	 * @return the server request id
	 */
	public String getServerRequestId() {
		return serverRequestId;
	}

	/**
	 * Sets the server request id.
	 * 
	 * @param serverRequestId
	 *            the new server request id
	 */
	public void setServerRequestId(String serverRequestId) {
		this.serverRequestId = serverRequestId;
	}

	/**
	 * Gets the log message.
	 * 
	 * @return the log message
	 */
	public String getLogMessage() {
		return logMessage;
	}

	/**
	 * Sets the log message.
	 * 
	 * @param logMessage
	 *            the new log message
	 */
	public void setLogMessage(String logMessage) {
		this.logMessage = logMessage;
	}

}
