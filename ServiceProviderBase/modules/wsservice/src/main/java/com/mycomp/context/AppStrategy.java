/**
 * 
 */
package com.mycomp.context;


import com.mycomp.gen.Request;
import com.mycomp.gen.Response;
import com.mycomp.model.LogInfo;

// TODO: Auto-generated Javadoc
/**
 * The Interface AppStrategy.
 * 
 * @author Dinakaran Jayaraman
 */
public interface AppStrategy {

	Response getWSResponse(Request request, LogInfo logInfo)
			throws Exception;

}
