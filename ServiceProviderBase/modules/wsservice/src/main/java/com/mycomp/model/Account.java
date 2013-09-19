/**
 * 
 */
package com.mycomp.model;

import java.io.Serializable;
import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class Account.
 * 
 * @author Dinakaran Jayaraman
 */
public class Account implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The account code. */
	private String accountCode;

	/** The account desc. */
	private String accountDesc;

	/** The rpt def id. */
	private long rptDefId;

	/** The start date. */
	private Date startDate;

	/** The end date. */
	private Date endDate;

	/**
	 * Gets the start date.
	 * 
	 * @return the start date
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * Sets the start date.
	 * 
	 * @param startDate
	 *            the new start date
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * Gets the end date.
	 * 
	 * @return the end date
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * Sets the end date.
	 * 
	 * @param endDate
	 *            the new end date
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * Gets the account code.
	 * 
	 * @return the accountCode
	 */
	public String getAccountCode() {
		return accountCode;
	}

	/**
	 * Sets the account code.
	 * 
	 * @param accountCode
	 *            the accountCode to set
	 */
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	/**
	 * Gets the account desc.
	 * 
	 * @return the accountDesc
	 */
	public String getAccountDesc() {
		return accountDesc;
	}

	/**
	 * Sets the account desc.
	 * 
	 * @param accountDesc
	 *            the accountDesc to set
	 */
	public void setAccountDesc(String accountDesc) {
		this.accountDesc = accountDesc;
	}

	/**
	 * Gets the rpt def id.
	 * 
	 * @return the rptDefId
	 */
	public long getRptDefId() {
		return rptDefId;
	}

	/**
	 * Sets the rpt def id.
	 * 
	 * @param rptDefId
	 *            the rptDefId to set
	 */
	public void setRptDefId(long rptDefId) {
		this.rptDefId = rptDefId;
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
				+ ((accountCode == null) ? 0 : accountCode.hashCode());
		result = prime * result
				+ ((accountDesc == null) ? 0 : accountDesc.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + (int) (rptDefId ^ (rptDefId >>> 32));
		result = prime * result
				+ ((startDate == null) ? 0 : startDate.hashCode());
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
		Account other = (Account) obj;
		if (accountCode == null) {
			if (other.accountCode != null)
				return false;
		} else if (!accountCode.equals(other.accountCode))
			return false;
		if (accountDesc == null) {
			if (other.accountDesc != null)
				return false;
		} else if (!accountDesc.equals(other.accountDesc))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (rptDefId != other.rptDefId)
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
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
		return "Account [accountCode=" + accountCode + ", accountDesc="
				+ accountDesc + ", rptDefId=" + rptDefId + ", startDate="
				+ startDate + ", endDate=" + endDate + "]";
	}

}
