/**
 * 
 */
package com.mycomp.dao;

import org.springframework.stereotype.Repository;

import com.mycomp.model.vo.AccountVO;

/**
 * @author Dinakaran Jayaraman
 *
 */
@Repository
public final class AccountDaoImpl extends AbstractDaoImpl implements AccountDao {

	/* (non-Javadoc)
	 * @see com.mycomp.dao.AccountDao#getAccount(java.lang.String)
	 */
	@Override
	public AccountVO getAccount(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

}
