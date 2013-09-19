/**
 * 
 */
package com.mycomp.service;

// TODO: Auto-generated Javadoc
/**
 * The Interface IdManager.
 * 
 * @author Dinakaran Jayaraman
 */
public interface IdManager extends LibService {

	/**
	 * Gets the ws server request id.
	 * 
	 * @return the ws server request id
	 */
	String getWsServerRequestId();

	/**
	 * Gets the ws server response id.
	 * 
	 * @return the ws server response id
	 */
	String getWsServerResponseId();

	/**
	 * Gets the queue request id.
	 * 
	 * @return the queue request id
	 */
	long getQueueRequestId();

	/**
	 * Gets the queue submitter id.
	 * 
	 * @return the queue submitter id
	 */
	String getQueueSubmitterId();
}
