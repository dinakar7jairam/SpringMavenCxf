/**
 * 
 */
package com.putnam.attr;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

// TODO: Auto-generated Javadoc
/**
 * The Class AbstractCoreTest.
 * 
 * @author Dinakaran Jayaraman
 */

@ContextConfiguration(locations = { "classpath:test/testContext.xml" })
@TransactionConfiguration(transactionManager = "txManager")
public class AbstractCoreTest extends
		AbstractTransactionalJUnit4SpringContextTests {

	

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.test.context.junit4.
	 * AbstractTransactionalJUnit4SpringContextTests
	 * #setDataSource(javax.sql.DataSource)
	 */

	public void setDataSource(
			@Qualifier(value = "dataSource") DataSource dataSource) {
		this.simpleJdbcTemplate = new SimpleJdbcTemplate(dataSource);
	}
}
