/**
 * 
 */
package com.mycomp.exception;

// TODO: Auto-generated Javadoc
/**
 * The Class WSException.
 * 
 * @author Dinakaran Jayaraman
 */
public class WSException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The error. */
	private String error;

	/**
	 * Instantiates a new wS exception.
	 * 
	 * @param error
	 *            the error
	 */
	public WSException(String error) {
		super(error);
		this.error = error;
	}

	/**
	 * Gets the error.
	 * 
	 * @return the error
	 */
	public String getError() {
		return error;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WSException <error=");
		builder.append(error);
		builder.append(">");
		return builder.toString();
	}

}
