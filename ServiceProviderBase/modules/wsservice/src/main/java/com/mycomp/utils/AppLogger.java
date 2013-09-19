/**
 * 
 */
package com.mycomp.utils;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hsqldb.server.ServerAcl.AclFormatException;

import com.mycomp.model.LogInfo;

// TODO: Auto-generated Javadoc
/**
 * The Class AttributionLogger.
 * 
 * @author Dinakaran Jayaraman
 */
public final class AppLogger {

	private Logger LOGGER ;

	/** The Constant DEBUG. */
	public final static int DEBUG = 1;

	/** The Constant INFO. */
	public final static int INFO = 2;

	/** The Constant ERROR. */
	public final static int ERROR = 3;

	/** The Constant FATAL. */
	public final static int FATAL = 4;

	/**
	 * Instantiates a new attribution logger.
	 * 
	 * @param loggerName
	 *            the logger name
	 */
	private AppLogger(String loggerName) {
		LOGGER = LogManager
				.getLogger(loggerName);
	}

	/**
	 * Gets the logger.
	 * 
	 * @param classReference
	 *            the class reference
	 * @return the logger
	 */
	public static AppLogger getLogger(
			@SuppressWarnings("rawtypes") Class classReference) {
		return new AppLogger(classReference.getName());
	}

	/**
	 * Log msg.
	 * 
	 * @param logLevel
	 *            the log level
	 * @param logMessage
	 *            the log message
	 * @param t
	 *            the t
	 */
	private void logMsg(int logLevel, String logMessage, Throwable t) {
		switch (logLevel) {
		case DEBUG:
			LOGGER.debug(logMessage);
			break;
		case INFO:
			LOGGER.info(logMessage);
			break;
		case ERROR:
			// logger.error(logMessage,t);
			LOGGER.info(logMessage);
			break;
		case FATAL:
			LOGGER.fatal(logMessage, t);
			break;
		default:
			LOGGER.debug(logMessage);
		}
	}

	/**
	 * Log.
	 * 
	 * @param logLevel
	 *            the log level
	 * @param logInfo
	 *            the log info
	 */
	public void log(int logLevel, LogInfo logInfo) {
		logMsg(logLevel, logInfo.toString(), null);
	}

	/**
	 * Log.
	 * 
	 * @param logLevel
	 *            the log level
	 * @param logInfo
	 *            the log info
	 * @param t
	 *            the t
	 */
	public void log(int logLevel, LogInfo logInfo, Throwable t) {
		logMsg(logLevel, logInfo.toString(), t);
	}

	/**
	 * Log.
	 * 
	 * @param logMessage
	 *            the log message
	 */
	public void log(String logMessage) {
		LOGGER.debug(logMessage);
	}
	
	public void info(Object ... logMessage) {
		LOGGER.info(logMessage);
	}

	public void error(String message, Throwable t) {
	LOGGER.error(message, t);
	}
}
