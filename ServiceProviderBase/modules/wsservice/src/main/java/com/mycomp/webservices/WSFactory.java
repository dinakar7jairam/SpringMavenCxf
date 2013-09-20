/**
 * 
 */
package com.mycomp.webservices;

import com.mycomp.SpringContext;
import com.mycomp.context.AppStrategy;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating WS objects.
 * 
 * @author Dinakaran Jayaraman
 */
public class WSFactory {

	/**
	 * Gets the strategy.
	 * 
	 * @param name
	 *            the name
	 * @return the strategy
	 */
	public static AppStrategy getStrategy(String name) {
		String className = name.substring(name.lastIndexOf(".") + 1);
		System.out.println("className:"+className);
		return (AppStrategy) SpringContext.getBean(className);
	}
}
