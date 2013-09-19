/**
 * 
 */
package com.mycomp.utils;

import java.util.Calendar;
import java.util.GregorianCalendar;

// TODO: Auto-generated Javadoc
/**
 * The Class IdGenerator.
 * 
 * @author Dinakaran Jayaraman
 */

public class IdGenerator {

	/** The Constant expectedSizeTwo. */
	private final static int expectedSizeTwo = 2;

	/** The Constant expectedSizeThree. */
	private final static int expectedSizeThree = 3;

	/** The Constant stringToPad. */
	private final static String stringToPad = "0";

	/**
	 * Gets the queue submitter id.
	 * 
	 * @return the queue submitter id
	 */
	public static String getQueueSubmitterId() {
		StringBuilder sb = new StringBuilder().append("Sub").append(getId());
		return sb.toString();
	}

	/**
	 * Gets the queue request id.
	 * 
	 * @return the queue request id
	 */
	public static long getQueueRequestId() {
		return Long.parseLong(getId());
	}

	/**
	 * Gets the server request id.
	 * 
	 * @return the server request id
	 */
	public static String getServerRequestId() {
		StringBuilder sb = new StringBuilder().append("R").append(getId());
		return sb.toString();
	}

	/**
	 * Gets the server response id.
	 * 
	 * @return the server response id
	 */
	public static String getServerResponseId() {
		StringBuilder sb = new StringBuilder().append("S").append(getId());
		return sb.toString();
	}

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	private static String getId() {
		GregorianCalendar gc1 = new GregorianCalendar();
		int year = gc1.get(Calendar.YEAR);
		int month = gc1.get(Calendar.MONTH) + 1;
		int day = gc1.get(Calendar.DAY_OF_MONTH);
		int hour = gc1.get(Calendar.HOUR_OF_DAY);
		int minute = gc1.get(Calendar.MINUTE);
		int second = gc1.get(Calendar.SECOND);
		int millisecond = gc1.get(Calendar.MILLISECOND);

		StringBuilder idString = new StringBuilder()
				.append(String.valueOf(year))
				.append(StringUtils.getPaddedString(String.valueOf(month),
						expectedSizeTwo, stringToPad))
				.append(StringUtils.getPaddedString(String.valueOf(day),
						expectedSizeTwo, stringToPad))
				.append(StringUtils.getPaddedString(String.valueOf(hour),
						expectedSizeTwo, stringToPad))
				.append(StringUtils.getPaddedString(String.valueOf(minute),
						expectedSizeTwo, stringToPad))
				.append(StringUtils.getPaddedString(String.valueOf(second),
						expectedSizeTwo, stringToPad))
				.append(StringUtils.getPaddedString(
						String.valueOf(millisecond), expectedSizeThree,
						stringToPad));

		return idString.toString();
	}

}
