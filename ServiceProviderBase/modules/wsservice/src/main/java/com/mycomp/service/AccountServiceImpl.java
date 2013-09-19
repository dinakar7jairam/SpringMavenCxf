/**
 * 
 */
package com.mycomp.service;

import org.springframework.stereotype.Service;

import com.mycomp.exception.AccountUnavailableException;
import com.mycomp.model.vo.AccountVO;

/**
 * @author Dinakaran Jayaraman
 *
 */
@Service
public class AccountServiceImpl implements AccountService {


	/* (non-Javadoc)
	 * @see com.mycomp.service.AccountService#getAccount(java.lang.String)
	 */
	@Override
	public AccountVO getAccount(String emailId)
			throws AccountUnavailableException {
		return null;
	}

}
