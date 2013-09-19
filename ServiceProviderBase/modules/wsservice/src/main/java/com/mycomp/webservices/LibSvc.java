package com.mycomp.webservices;

import javax.jws.WebService;

import com.mycomp.gen.RequestList;
import com.mycomp.gen.ResponseList;

@WebService
public interface LibSvc {
	public ResponseList execute(RequestList requestList);
}
