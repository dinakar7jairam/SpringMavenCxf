package com.mycomp.utils;

/**
 * 
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Class LibProperties.
 * 
 * @author Dinakaran Jayaraman
 */
public final class LibProperties {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LogManager
			.getLogger(LibProperties.class);

	private LibProperties() {
		throw new AssertionError();
	}

	/** The config. */
	private static Configuration config = null;

	/** The props. */
	public static Properties props;

	private static final String LIB_TEST_USER = "john@acme.net, John, Adams";
	
	private static final String LIB_TEST_BOOKS = "Daisy's Defining Day ,May B., Peak, Almost Home, Nightsong, Huff & Puff";

	private static final String MAPPING_DYN_VNDR_SEC_CODES_IN_SQL = "mapping.inputvndrseccode.sql";

	private static final String MAPPING_VNDR_SEC_CODES_MAX_SIZE = "mapping.vndrseccode.maxsize";

	/**
	 * Inits the.
	 * 
	 * @param propertiesFile
	 *            the properties file
	 * @throws ConfigurationException
	 *             the configuration exception
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static void init(String propertiesFile)
			throws ConfigurationException, IOException {
		config = new PropertiesConfiguration(propertiesFile);
		setProperties(propertiesFile);
	}

	/**
	 * Sets the properties.
	 * 
	 * @param propertiesFile
	 *            the new properties
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	private static void setProperties(final String propertiesFile)
			throws IOException {
		props = new Properties();
		LOGGER.debug("Reading {} ",propertiesFile);
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(propertiesFile);
			props.load(fileInputStream);
			fileInputStream.close();
		} finally {
			if (fileInputStream != null) {
				fileInputStream.close();
			}
		}
	}
	
	public static String [] getTestUserDetails(){
		String libTestUserArray[] = config
				.getStringArray(LIB_TEST_USER);
		return libTestUserArray;
	}

	public static Set<String> getLibTestBooks() {
		String libTestBooks = config.getString(LIB_TEST_BOOKS, "");
		if (libTestBooks.length() == 0) {
			return Collections.emptySet();
		}
		String libTestBooksArray[] = config
				.getStringArray(LIB_TEST_BOOKS);
		Set<String> libTestBooksSet = new LinkedHashSet<String>(
				Arrays.asList(libTestBooksArray));
		return libTestBooksSet;
	}

	public static String getDynVndrSecCodesInSqlClause() {
		return config.getString(MAPPING_DYN_VNDR_SEC_CODES_IN_SQL, "");
	}

	public static long getVndrSecCodesMaxSize() {
		return config.getLong(MAPPING_VNDR_SEC_CODES_MAX_SIZE);
	}

}
