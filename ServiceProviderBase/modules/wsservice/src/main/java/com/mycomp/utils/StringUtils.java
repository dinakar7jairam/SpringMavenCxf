/*
 * 
 */
package com.mycomp.utils;

// TODO: Auto-generated Javadoc
/**
 * The Class StringUtils.
 */
public class StringUtils {

	/**
	 * Gets the padded string.
	 * 
	 * @param inputString
	 *            the input string
	 * @param expectedSize
	 *            the expected size
	 * @param stringToPad
	 *            the string to pad
	 * @return the padded string
	 */
	public static String getPaddedString(String inputString, int expectedSize,
			String stringToPad) {
		StringBuilder outputString = new StringBuilder();
		for (int actualSize = inputString.length(); actualSize < expectedSize; actualSize++) {
			outputString.append(stringToPad);
		}
		outputString.append(inputString);
		return outputString.toString();
	}

	/**
	 * Gets the pre padded string.
	 * 
	 * @param inputString
	 *            the input string
	 * @param expectedSize
	 *            the expected size
	 * @param stringToPad
	 *            the string to pad
	 * @return the pre padded string
	 */
	public static String getPrePaddedString(String inputString,
			int expectedSize, String stringToPad) {
		StringBuilder outputString = new StringBuilder();
		outputString.append(inputString);
		for (int actualSize = inputString.length(); actualSize < expectedSize; actualSize++) {
			outputString.append(stringToPad);
		}
		return outputString.toString();
	}

	/**
	 * Checks if is null.
	 * 
	 * @param obj
	 *            the obj
	 * @return true, if is null
	 */
	public static boolean isNull(Object obj) {
		boolean isNull = Boolean.FALSE;
		if (obj == null) {
			isNull = Boolean.TRUE;
		}
		return isNull;
	}
}
