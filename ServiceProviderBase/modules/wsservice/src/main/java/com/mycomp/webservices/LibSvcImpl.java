/**
 * 
 */
package com.mycomp.webservices;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.mycomp.gen.RequestList;
import com.mycomp.gen.ResponseList;

// TODO: Auto-generated Javadoc
/**
 * The Class LibSvc.
 * 
 * @author Dinakaran Jayaraman
 */
@WebService(endpointInterface = "com.mycomp.webservices.LibSvc")
public class LibSvcImpl implements LibSvc {

	@Override
	public ResponseList execute(RequestList requestList) {
		return requestProcessor.executeRequest(requestList);
		//return null;
	}

	/** The request processor. */
	@Autowired
	private RequestProcessor requestProcessor;

}
