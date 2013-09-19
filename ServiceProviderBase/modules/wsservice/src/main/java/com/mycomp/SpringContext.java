/*
 * 
 */
package com.mycomp;

import javax.servlet.ServletContext;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.mycomp.utils.AppLogger;


// TODO: Auto-generated Javadoc
/**
 * The Class SpringContext.
 */
public final class SpringContext {

	private static final AppLogger LOGGER = AppLogger.getLogger(SpringContext.class);

	/** The context. */
	private static WebApplicationContext context;

	/** The instance. */
	private static SpringContext instance;

	/**
	 * Instantiates a new spring context.
	 * 
	 * @param servletContext
	 *            the servlet context
	 */
	private SpringContext(ServletContext servletContext) {
		LOGGER.info("Initializing SpringContext object.");
		context = (WebApplicationContext) WebApplicationContextUtils
				.getWebApplicationContext(servletContext);
	}

	/**
	 * Gets the single instance of SpringContext.
	 * 
	 * @param servletContext
	 *            the servlet context
	 * @return single instance of SpringContext
	 */
	protected static SpringContext getInstance(ServletContext servletContext) {
		if (null == instance) {
			instance = new SpringContext(servletContext);
		}
		return instance;
	}

	/**
	 * Gets the bean.
	 * 
	 * @param bean
	 *            the bean
	 * @return the bean
	 */
	public static Object getBean(String bean) {
		return context.getBean(bean);
	}

}
