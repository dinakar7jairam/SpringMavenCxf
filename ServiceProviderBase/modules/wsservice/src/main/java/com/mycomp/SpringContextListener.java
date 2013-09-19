/**
 * 
 */
package com.mycomp;

import javax.servlet.ServletContextEvent;

import org.springframework.web.context.ContextLoaderListener;

// TODO: Auto-generated Javadoc
/**
 * The listener interface for receiving springContext events. The class that is
 * interested in processing a springContext event implements this interface, and
 * the object created with that class is registered with a component using the
 * component's <code>addSpringContextListener<code> method. When
 * the springContext event occurs, that object's appropriate
 * method is invoked.
 * 
 * @author Dinakaran Jayaraman
 */
public final class SpringContextListener extends ContextLoaderListener {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.servlet.ServletContextListener#contextInitialized(javax.servlet
	 * .ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent arg0) {
		super.contextInitialized(arg0);
		SpringContext.getInstance(arg0.getServletContext());
	}

}
