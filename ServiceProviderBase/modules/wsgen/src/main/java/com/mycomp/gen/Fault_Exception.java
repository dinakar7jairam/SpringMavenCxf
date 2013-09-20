
package com.mycomp.gen;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.2.2
 * Fri Sep 20 11:24:03 EDT 2013
 * Generated source version: 2.2.2
 * 
 */

@WebFault(name = "Fault", targetNamespace = "http://www.mycomp.com/services/libsvc")
public class Fault_Exception extends Exception {
    public static final long serialVersionUID = 20130920112403L;
    
    private com.mycomp.gen.Fault fault;

    public Fault_Exception() {
        super();
    }
    
    public Fault_Exception(String message) {
        super(message);
    }
    
    public Fault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Fault_Exception(String message, com.mycomp.gen.Fault fault) {
        super(message);
        this.fault = fault;
    }

    public Fault_Exception(String message, com.mycomp.gen.Fault fault, Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }

    public com.mycomp.gen.Fault getFaultInfo() {
        return this.fault;
    }
}
