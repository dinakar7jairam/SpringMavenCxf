/**
 * 
 */
package com.mycomp.model;

import static com.mycomp.utils.StringUtils.isNull;

import java.io.Serializable;
import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class GaaQueueError.
 * 
 * @author Dinakaran Jayaraman
 */
public class AppError implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The partition id. */
	private int partitionId;

	/** The request id. */
	private long requestId;

	/** The error id. */
	private long errorId;

	/** The error type. */
	private String errorType;

	/** The module. */
	private String module;

	/** The short error msg. */
	private String shortErrorMsg;

	/** The long error msg. */
	private String longErrorMsg;

	/** The anlys date. */
	private Date anlysDate;

	/**
	 * Gets the partition id.
	 * 
	 * @return the partition id
	 */
	public int getPartitionId() {
		return partitionId;
	}

	/**
	 * Sets the partition id.
	 * 
	 * @param partitionId
	 *            the new partition id
	 */
	public void setPartitionId(int partitionId) {
		this.partitionId = partitionId;
	}

	/**
	 * Gets the request id.
	 * 
	 * @return the request id
	 */
	public long getRequestId() {
		return requestId;
	}

	/**
	 * Sets the request id.
	 * 
	 * @param requestId
	 *            the new request id
	 */
	public void setRequestId(long requestId) {
		this.requestId = requestId;
	}

	/**
	 * Gets the error id.
	 * 
	 * @return the error id
	 */
	public long getErrorId() {
		return errorId;
	}

	/**
	 * Sets the error id.
	 * 
	 * @param errorId
	 *            the new error id
	 */
	public void setErrorId(long errorId) {
		this.errorId = errorId;
	}

	/**
	 * Gets the error type.
	 * 
	 * @return the error type
	 */
	public String getErrorType() {
		return errorType;
	}

	/**
	 * Sets the error type.
	 * 
	 * @param errorType
	 *            the new error type
	 */
	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

	/**
	 * Gets the module.
	 * 
	 * @return the module
	 */
	public String getModule() {
		return module;
	}

	/**
	 * Sets the module.
	 * 
	 * @param module
	 *            the new module
	 */
	public void setModule(String module) {
		this.module = module;
	}

	/**
	 * Gets the short error msg.
	 * 
	 * @return the short error msg
	 */
	public String getShortErrorMsg() {
		return shortErrorMsg;
	}

	/**
	 * Sets the short error msg.
	 * 
	 * @param shortErrorMsg
	 *            the new short error msg
	 */
	public void setShortErrorMsg(String shortErrorMsg) {
		//Only 256 chars are allowed.
		if(!isNull(shortErrorMsg)){
			this.shortErrorMsg = shortErrorMsg.substring(0,255);
		}
		this.shortErrorMsg = shortErrorMsg;
	}

	/**
	 * Gets the long error msg.
	 * 
	 * @return the long error msg
	 */
	public String getLongErrorMsg() {
		return longErrorMsg;
	}

	/**
	 * Sets the long error msg.
	 * 
	 * @param longErrorMsg
	 *            the new long error msg
	 */
	public void setLongErrorMsg(String longErrorMsg) {
		this.longErrorMsg = longErrorMsg;
	}

	/**
	 * Gets the anlys date.
	 * 
	 * @return the anlys date
	 */
	public Date getAnlysDate() {
		return anlysDate;
	}

	/**
	 * Sets the anlys date.
	 * 
	 * @param anlysDate
	 *            the new anlys date
	 */
	public void setAnlysDate(Date anlysDate) {
		this.anlysDate = anlysDate;
	}

	/**
	 * Gets the serialversionuid.
	 * 
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((anlysDate == null) ? 0 : anlysDate.hashCode());
		result = prime * result + (int) (errorId ^ (errorId >>> 32));
		result = prime * result
				+ ((errorType == null) ? 0 : errorType.hashCode());
		result = prime * result
				+ ((longErrorMsg == null) ? 0 : longErrorMsg.hashCode());
		result = prime * result + ((module == null) ? 0 : module.hashCode());
		result = prime * result + partitionId;
		result = prime * result + (int) (requestId ^ (requestId >>> 32));
		result = prime * result
				+ ((shortErrorMsg == null) ? 0 : shortErrorMsg.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AppError other = (AppError) obj;
		if (anlysDate == null) {
			if (other.anlysDate != null)
				return false;
		} else if (!anlysDate.equals(other.anlysDate))
			return false;
		if (errorId != other.errorId)
			return false;
		if (errorType == null) {
			if (other.errorType != null)
				return false;
		} else if (!errorType.equals(other.errorType))
			return false;
		if (longErrorMsg == null) {
			if (other.longErrorMsg != null)
				return false;
		} else if (!longErrorMsg.equals(other.longErrorMsg))
			return false;
		if (module == null) {
			if (other.module != null)
				return false;
		} else if (!module.equals(other.module))
			return false;
		if (partitionId != other.partitionId)
			return false;
		if (requestId != other.requestId)
			return false;
		if (shortErrorMsg == null) {
			if (other.shortErrorMsg != null)
				return false;
		} else if (!shortErrorMsg.equals(other.shortErrorMsg))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GaaQueueError [partitionId=");
		builder.append(partitionId);
		builder.append(", requestId=");
		builder.append(requestId);
		builder.append(", errorId=");
		builder.append(errorId);
		builder.append(", errorType=");
		builder.append(errorType);
		builder.append(", module=");
		builder.append(module);
		builder.append(", shortErrorMsg=");
		builder.append(shortErrorMsg);
		builder.append(", longErrorMsg=");
		builder.append(longErrorMsg);
		builder.append(", anlysDate=");
		builder.append(anlysDate);
		builder.append("]");
		return builder.toString();
	}

}
