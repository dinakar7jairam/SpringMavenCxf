/**
 * 
 */
package com.mycomp.exception;

/**
 * @author Dinakaran Jayaraman
 *
 */
public final class AccountUnavailableException extends LibSvcException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String emailId;
	
	/**
	 * @param message
	 */
	public AccountUnavailableException(String message, String emailId) {
		super(message);
		this.emailId = emailId;
	}

	public String getInputEmailId(){
		return emailId;
	}

}
