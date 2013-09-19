/**
 * 
 */
package com.mycomp.dao;

import com.mycomp.model.vo.AccountVO;

/**
 * @author Dinakaran Jayaraman
 *
 */
public interface AccountDao {

	AccountVO getAccount(String emailId);
}
