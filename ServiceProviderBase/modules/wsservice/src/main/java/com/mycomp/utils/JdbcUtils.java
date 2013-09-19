/**
 * 
 */
package com.mycomp.utils;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;

// TODO: Auto-generated Javadoc
/**
 * The Class JdbcUtils.
 * 
 * @author Dinakaran Jayaraman
 */
public final class JdbcUtils {

	/**
	 * Checks if is column exists.
	 * 
	 * @param metaData
	 *            the meta data
	 * @param columnName
	 *            the column name
	 * @return true, if checks if is column exists
	 * @throws SQLException
	 *             the SQL exception
	 */
	public static boolean isColumnExists(ResultSetMetaData metaData,
			String columnName) throws SQLException {
		int columnCount = metaData.getColumnCount();
		
		for (int i = 1; i < columnCount + 1; i++) {
			if (metaData.getColumnName(i).equals(columnName)) {
				return true;
			}
		}
		return false;
	}
}
