/**
 * 
 */
package com.mycomp.aspects;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

import org.aspectj.lang.JoinPoint;

import com.mycomp.model.AppError;
import com.mycomp.utils.AppLogger;

// TODO: Auto-generated Javadoc
/**
 * The Class ErrorAspect.
 * 
 * @author Dinakaran Jayaraman
 */

public class AppErrorAspect {
	/** The logger. */
	private static final AppLogger LOGGER = AppLogger.getLogger(AppErrorAspect.class);

	/**
	 * After throwing.
	 * 
	 * @param joinPoint
	 *            the join point
	 * @param error
	 *            the error
	 */
	public void afterThrowing(JoinPoint joinPoint, Throwable error) {
		LOGGER.info("Inside After Throwing:{}" , error);
		long requestId = -1;
		Object obj = joinPoint.getArgs()[0];
		if (obj instanceof AppError) {
			AppError reportContext = (AppError) obj;
			requestId = reportContext.getRequestId();
			LOGGER.info("requestId:{}" , requestId);
			String shortErrorMsg = error.getMessage();
			if (shortErrorMsg == null) {
				shortErrorMsg = error.toString();
			}
			Writer w = new StringWriter();
			error.printStackTrace(new PrintWriter(w));
			String longErrorMsg = w.toString();
			AppError queueError = new AppError();


		}
	}

}
