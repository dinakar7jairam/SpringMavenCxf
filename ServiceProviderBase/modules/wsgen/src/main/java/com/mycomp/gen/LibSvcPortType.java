package com.mycomp.gen;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2.2
 * Fri Sep 20 11:24:03 EDT 2013
 * Generated source version: 2.2.2
 * 
 */
 
@WebService(targetNamespace = "http://www.mycomp.com/services/libsvc", name = "LibSvcPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface LibSvcPortType {

    @WebResult(name = "ResponseList", targetNamespace = "http://www.mycomp.com/services/libsvc", partName = "ResponseList")
    @WebMethod
    public ResponseList execute(
        @WebParam(partName = "RequestList", name = "RequestList", targetNamespace = "http://www.mycomp.com/services/libsvc")
        RequestList requestList
    ) throws Fault_Exception;
}
