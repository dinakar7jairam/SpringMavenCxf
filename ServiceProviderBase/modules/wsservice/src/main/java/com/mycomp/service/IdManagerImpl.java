/**
 * 
 */
package com.mycomp.service;

import com.mycomp.utils.IdGenerator;

// TODO: Auto-generated Javadoc
/**
 * The Class IdManagerImpl.
 * 
 * @author Dinakaran Jayaraman
 */
public class IdManagerImpl implements IdManager {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.putnam.attr.service.IdManager#getWsServerRequestId()
	 */

	public String getWsServerRequestId() {
		return IdGenerator.getServerRequestId();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.putnam.attr.service.IdManager#getWsServerResponseId()
	 */

	public String getWsServerResponseId() {
		return IdGenerator.getServerResponseId();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.putnam.attr.service.IdManager#getQueueRequestId()
	 */

	public long getQueueRequestId() {
		return IdGenerator.getQueueRequestId();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.putnam.attr.service.IdManager#getQueueSubmitterId()
	 */

	public String getQueueSubmitterId() {
		return IdGenerator.getQueueSubmitterId();
	}

}
