/**
 * 
 */
package com.mycomp.service;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating AttrService objects.
 * 
 * @author Dinakaran Jayaraman
 */
public interface LibServiceFactory {

	/**
	 * Gets the service.
	 * 
	 * @param serviceName
	 *            the service name
	 * @return the service
	 */
	public LibService getService(String serviceName);
}