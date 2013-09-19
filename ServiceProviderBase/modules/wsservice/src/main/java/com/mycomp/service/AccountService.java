/**
 * 
 */
package com.mycomp.service;

import com.mycomp.exception.AccountUnavailableException;
import com.mycomp.model.vo.AccountVO;

/**
 * @author Dinakaran Jayaraman
 *
 */
public interface AccountService extends LibService {

	AccountVO getAccount(String emailId) throws AccountUnavailableException;
}
