/**
 * 
 */
package com.mycomp.utils;

import static com.mycomp.utils.Constants.*;
import static com.mycomp.utils.StringUtils.isNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;


// TODO: Auto-generated Javadoc
/**
 * The Class DateUtils.
 * 
 * @author Dinakaran Jayaraman
 */
public final class DateUtils {

	private static final AppLogger LOGGER = AppLogger.getLogger(DateUtils.class);

	/**
	 * Gets the requested period last date.
	 * 
	 * @param periodType
	 *            the period type
	 * @param periodCode
	 *            the period code
	 * @param endDateYear
	 *            the end date year
	 * @return the requested period last date
	 */
	public static Date getRequestedPeriodLastDate(String periodType,
			int periodCode, int endDateYear) {
		Calendar cal = Calendar.getInstance();
		Calendar cal1 = Calendar.getInstance();
		cal.set(Calendar.YEAR, endDateYear);

		if (PERIOD_TYPE_WEEKLY.equals(periodType)) {
			return getWeeklyEndDate(cal, periodCode);
		}

		if (PERIOD_TYPE_YEARLY.equals(periodType)) {
			if(cal1.get(Calendar.YEAR) == cal.get(Calendar.YEAR))
			{
				periodCode = cal.get(Calendar.MONTH) + 1;
			}
			else
			{
				periodCode = 12;
			}
		}
		cal.set(Calendar.MONTH, getPeriodTypeEndMonth(periodType, periodCode));
		cal.set(Calendar.DATE, 1);
		cal.add(Calendar.MONTH, 1);
		cal.add(Calendar.DATE, -1);
		return cal.getTime();
	}

	/**
	 * Gets the weekly end date.
	 * 
	 * @param cal
	 *            the cal
	 * @param periodCode
	 *            the period code
	 * @return the weekly end date
	 */
	private static Date getWeeklyEndDate(Calendar cal, int periodCode) {
		periodCode = periodCode + 1;
		LOGGER.info("getWeeklyEndDate-periodCode:{}", periodCode);
		cal.set(Calendar.DAY_OF_WEEK, periodCode);
		LOGGER.info("getWeeklyEndDate-weekOfYear:{}", Calendar.WEEK_OF_YEAR);
		cal.set(Calendar.WEEK_OF_YEAR, cal.get(Calendar.WEEK_OF_YEAR));
		LOGGER.info("getWeeklyEndDate-weeklyEndDate:{}", cal.getTime());
		return cal.getTime();
	}

	/**
	 * Gets the weekly start date.
	 * 
	 * @param cal
	 *            the cal
	 * @return the weekly start date
	 */
	private static Date getWeeklyStartDate(Calendar cal) {
		cal.set(Calendar.DAY_OF_WEEK, cal.get(Calendar.DAY_OF_WEEK) + 1);
		cal.set(Calendar.WEEK_OF_YEAR, cal.get(Calendar.WEEK_OF_YEAR) - 1);
		return cal.getTime();
	}

	/**
	 * Gets the period type end month.
	 * 
	 * @param periodType
	 *            the period type
	 * @param periodCode
	 *            the period code
	 * @return the period type end month
	 */
	private static int getPeriodTypeEndMonth(String periodType, int periodCode) {
		LOGGER.info("periodType:{}", periodType);
		LOGGER.info("periodCode:{}", periodCode);
		if (PERIOD_TYPE_QUARTERLY.equals(periodType)) {
			switch (periodCode) {
			case PERIOD_CODE_Q1:
				return Calendar.MARCH;
			case PERIOD_CODE_Q2:
				return Calendar.JUNE;
			case PERIOD_CODE_Q3:
				return Calendar.SEPTEMBER;
			case PERIOD_CODE_Q4:
				return Calendar.DECEMBER;
			}
		} else if (PERIOD_TYPE_MONTHLY.equals(periodType)
				|| PERIOD_TYPE_YEARLY.equals(periodType)) {
			periodCode = periodCode - 1;
			if (periodCode < Calendar.JANUARY || periodCode > Calendar.DECEMBER) {
				throw new IllegalArgumentException(
						"Incorrect period code for period type MTD. Should be between Calendar.JANUARY and Calendar.DECEMBER.");
			}

			return periodCode;
		}
		throw new IllegalArgumentException(
				"Incorrect Arguments for determining the period type end month. Period Type: "
						+ periodType + " Period Code: " + periodCode);
	}

	/**
	 * Gets the start date.
	 * 
	 * @param endDate
	 *            the end date
	 * @param periodType
	 *            the period type
	 * @return the start date
	 */
	public static Date getStartDateFromEndDate(Date endDate, String periodType) {
		Date startDate = null;
		Calendar cal = Calendar.getInstance();
		cal.setTime(endDate);

		if (PERIOD_TYPE_WEEKLY.equals(periodType)) {
			return getWeeklyStartDate(cal);
		} else if (PERIOD_TYPE_MONTHLY.equals(periodType)) {
			startDate = getMTDStartDate(cal);
		} else if (PERIOD_TYPE_QUARTERLY.equals(periodType)) {
			startDate = getQTDStartDate(cal);
		} else if (PERIOD_TYPE_YEARLY.equals(periodType)) {
			startDate = getYTDStartDate(cal);
		}

		return startDate;
	}

	/**
	 * Gets the yTD start date.
	 * 
	 * @param cal
	 *            the cal
	 * @return the yTD start date
	 */
	private static Date getYTDStartDate(Calendar cal) {
		cal.add(Calendar.DATE, (cal.get(Calendar.DAY_OF_YEAR) * -1) + 1);
		return cal.getTime();
	}

	/**
	 * Gets the qTD start date.
	 * 
	 * @param cal
	 *            the cal
	 * @return the qTD start date
	 */
	private static Date getQTDStartDate(Calendar cal) {
		cal.set(Calendar.MONTH, getQTDMonth(cal));
		cal.set(Calendar.DAY_OF_MONTH, 1);
		return cal.getTime();
	}

	/**
	 * Gets the qTD month.
	 * 
	 * @param cal
	 *            the cal
	 * @return the qTD month
	 */
	private static int getQTDMonth(Calendar cal) {
		switch (cal.get(Calendar.MONTH)) {
		case Calendar.JANUARY:
		case Calendar.FEBRUARY:
		case Calendar.MARCH:
			return Calendar.JANUARY;
		case Calendar.APRIL:
		case Calendar.MAY:
		case Calendar.JUNE:
			return Calendar.APRIL;
		case Calendar.JULY:
		case Calendar.AUGUST:
		case Calendar.SEPTEMBER:
			return Calendar.JULY;
		case Calendar.OCTOBER:
		case Calendar.NOVEMBER:
		case Calendar.DECEMBER:
			return Calendar.OCTOBER;
		default:
			return -1;
		}
	}

	/**
	 * Gets the mTD start date.
	 * 
	 * @param cal
	 *            the cal
	 * @return the mTD start date
	 */
	private static Date getMTDStartDate(Calendar cal) {
		cal.add(Calendar.DAY_OF_MONTH, (cal.get(Calendar.DAY_OF_MONTH) - 1)
				* -1);
		return cal.getTime();
	}

	/**
	 * Gets the months.
	 * 
	 * @return the months
	 */
	public static List<Integer> getMonths() {
		Calendar cal = Calendar.getInstance();
		int maxMonth = cal.get(Calendar.MONTH) + 1;
		List<Integer> quarters = new ArrayList<Integer>();
		for (int i = 1; i <= maxMonth; i++) {
			quarters.add(i);
		}
		return quarters;
	}

	/**
	 * Gets the quarters.
	 * 
	 * @return the quarters
	 */
	public static List<Integer> getQuarters() {
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH);
		List<Integer> quarters = new ArrayList<Integer>();
		if (month >= Calendar.MARCH) {
			quarters.add(1);
		}
		if (month >= Calendar.JUNE) {
			quarters.add(2);
		}
		if (month >= Calendar.SEPTEMBER) {
			quarters.add(3);
		}
		if (month == Calendar.DECEMBER) {
			quarters.add(4);
		}

		return quarters;
	}

	/**
	 * Gets the years.
	 * 
	 * @return the years
	 */
	public static List<Integer> getYears() {
		List<Integer> year = new ArrayList<Integer>();
		Calendar cal = Calendar.getInstance();
		year.add(cal.get(Calendar.YEAR));
		return year;
	}

	/**
	 * Gets the weekday.
	 * 
	 * @return the weekday
	 */
	public static List<Integer> getWeekday() {
		List<Integer> weekday = new ArrayList<Integer>();
		Calendar cal = Calendar.getInstance();
		weekday.add(cal.get(Calendar.DAY_OF_WEEK) - 1);
		return weekday;
	}

	/**
	 * Gets the date fromyyyy m mdd string.
	 * 
	 * @param dateString
	 *            the date string
	 * @return the date fromyyyy m mdd string
	 * @throws ParseException
	 *             the parse exception
	 */
	public static Date getDateFromyyyyMMddString(String dateString)
			throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = sdf.parse(dateString);
		return date;
	}

	/**
	 * Gets the date fromdd mm myy string.
	 * 
	 * @param dateString
	 *            the date string
	 * @return the date fromdd mm myy string
	 * @throws ParseException
	 *             the parse exception
	 */
	public static Date getDateFromddMMMyyString(String dateString)
			throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy");
		Date date = sdf.parse(dateString);
		return date;
	}

	/**
	 * Gets the yyyy m mdd string from date.
	 * 
	 * @param date
	 *            the date
	 * @return the yyyy m mdd string from date
	 * @throws ParseException
	 *             the parse exception
	 */
	public static String getyyyyMMddStringFromDate(Date date)
			throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return sdf.format(date);
	}

	/**
	 * Gets the current end date year.
	 * 
	 * @return the current end date year
	 */
	public static int getCurrentEndDateYear() {
		Calendar cal = Calendar.getInstance();
		return cal.get(Calendar.YEAR);
	}

	/**
	 * Gets the current year.
	 * 
	 * @param cal
	 *            the cal
	 * @return the current year
	 */
	public static int getCurrentYear(Calendar cal) {
		return cal.get(Calendar.YEAR);
	}

	/**
	 * Gets the current month.
	 * 
	 * @param cal
	 *            the cal
	 * @return the current month
	 */
	public static int getCurrentMonth(Calendar cal) {
		return cal.get(Calendar.MONTH) + 1;
	}

	/**
	 * Gets the current weekday.
	 * 
	 * @param cal
	 *            the cal
	 * @return the current weekday
	 */
	public static int getCurrentWeekday(Calendar cal) {
		return cal.get(Calendar.DAY_OF_WEEK) - 1;
	}

	/**
	 * Gets the current quarter.
	 * 
	 * @param cal
	 *            the cal
	 * @return the current quarter
	 */
	public static int getCurrentQuarter(Calendar cal) {
		int month = cal.get(Calendar.MONTH);
		if (month <= Calendar.MARCH) {
			return 1;
		} else if (month <= Calendar.JUNE) {
			return 2;
		} else if (month <= Calendar.SEPTEMBER) {
			return 3;
		} else if (month <= Calendar.DECEMBER) {
			return 4;
		} else {
			return -1;
		}
	}

	/**
	 * Gets the last week day ofthe month.
	 * 
	 * @param lbd
	 *            the lbd
	 * @return the last week day ofthe month
	 */
	public static Date getLastWeekDayOftheMonth(Date lbd) {
		Calendar cal = getLastDayOfTheMonth(lbd);
		if (isWeekDay(cal)) {
			return cal.getTime();
		}
		while (!isWeekDay(cal)) {
			cal = getPreviousDay(cal);
		}
		return cal.getTime();
	}

	/**
	 * Gets the last day of the month.
	 * 
	 * @param lbd
	 *            the lbd
	 * @return the last day of the month
	 */
	public static Calendar getLastDayOfTheMonth(Date lbd) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(lbd);
		cal.set(Calendar.DATE, cal.getActualMaximum(Calendar.DATE));
		return cal;
	}

	/**
	 * Checks if is week day.
	 * 
	 * @param cal
	 *            the cal
	 * @return true, if is week day
	 */
	public static boolean isWeekDay(Calendar cal) {
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		switch (dayOfWeek) {
		case Calendar.SATURDAY:
		case Calendar.SUNDAY:
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	/**
	 * Gets the next day.
	 * 
	 * @param cal
	 *            the cal
	 * @return the next day
	 */
	public static Calendar getPreviousDay(Calendar cal) {
		cal.add(Calendar.DATE, -1);
		return cal;
	}

	/**
	 * Gets the date part alone.
	 * 
	 * @param date
	 *            the date
	 * @return the date part alone
	 */
	public static Date getDatePartAlone(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.clear(Calendar.HOUR);
		cal.clear(Calendar.MINUTE);
		cal.clear(Calendar.SECOND);
		cal.clear(Calendar.MILLISECOND);
		return date;
	}

	/**
	 * Gets the current date.
	 * 
	 * @return the current date
	 */
	public static Date getCurrentDate() {
		Calendar cal = Calendar.getInstance();
		cal.clear(Calendar.HOUR);
		cal.clear(Calendar.MINUTE);
		cal.clear(Calendar.SECOND);
		cal.clear(Calendar.MILLISECOND);
		return cal.getTime();
	}

	/**
	 * Gets the partition id.
	 * 
	 * @return the partition id
	 */
	public static int getPartitionId() {
		Calendar cal = Calendar.getInstance();
		int weekOfYear = cal.get(Calendar.WEEK_OF_YEAR);
		int partitionId = weekOfYear % 4;
		return partitionId;
	}

	/**
	 * Checks if is future date.
	 * 
	 * @param date
	 *            the date
	 * @return true, if checks if is future date
	 */
	public static boolean isFutureDate(Date date) {
		Calendar cal = Calendar.getInstance();
		long currentTime = cal.getTimeInMillis();
		cal.setTime(date);
		long inputTime = cal.getTimeInMillis();
		if (inputTime > currentTime) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	/**
	 * Checks if is past date.
	 * 
	 * @param date
	 *            the date
	 * @return true, if is past date
	 */
	public static boolean isPastDate(Date date) {
		Calendar cal = Calendar.getInstance();
		long currentTime = cal.getTimeInMillis();
		cal.setTime(date);
		long inputTime = cal.getTimeInMillis();
		if (inputTime < currentTime) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	/**
	 * Gets the xml date.
	 * 
	 * @param utilDate
	 *            the util date
	 * @return the xml date
	 * @throws DatatypeConfigurationException
	 *             the datatype configuration exception
	 */
	public static XMLGregorianCalendar getXmlDate(Date utilDate)
			throws DatatypeConfigurationException {
		if (utilDate == null) {
			return null;
		}
		GregorianCalendar gregDate = new GregorianCalendar();
		gregDate.setTimeInMillis(utilDate.getTime());
		XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance()
				.newXMLGregorianCalendar(gregDate);
		return xmlDate;
	}

	/**
	 * Gets the util date.
	 * 
	 * @param xmlDate
	 *            the xml date
	 * @return the util date
	 * @throws DatatypeConfigurationException
	 *             the datatype configuration exception
	 */
	public static Date getUtilDate(XMLGregorianCalendar xmlDate)
			throws DatatypeConfigurationException {
		if (xmlDate == null) {
			return null;
		}
		return xmlDate.toGregorianCalendar().getTime();
	}

	/**
	 * Gets the sql date from util date.
	 * 
	 * @param utilDate
	 *            the util date
	 * @return the sql date from util date
	 */
	public static java.sql.Date getSqlDateFromUtilDate(Date utilDate) {
		java.sql.Date startDate = null;
		if (isNull(utilDate)) {
			return startDate;
		}
		startDate = new java.sql.Date(utilDate.getTime());
		return startDate;
	}
}
