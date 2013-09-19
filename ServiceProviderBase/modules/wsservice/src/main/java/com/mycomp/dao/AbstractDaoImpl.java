/**
 * 
 */
package com.mycomp.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author Dinakaran Jayaraman
 *
 */
public abstract class AbstractDaoImpl {

	/** The jdbc template. */
	private JdbcTemplate jdbcTemplate;

	/**
	 * Creates the template.
	 * 
	 * @param dataSource
	 *            the data source
	 */
	@Autowired
	public void createTemplate(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	/**
	 * @return the jdbcTemplate
	 */
	public final JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
}
