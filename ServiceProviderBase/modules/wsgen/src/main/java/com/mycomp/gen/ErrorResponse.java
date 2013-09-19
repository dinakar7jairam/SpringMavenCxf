
package com.mycomp.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mycomp.com/services/libsvc}Response">
 *       &lt;sequence>
 *         &lt;element name="errorResponseInfo" type="{http://www.mycomp.com/services/libsvc}ErrorResponseInfo"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorResponse", propOrder = {
    "errorResponseInfo"
})
public class ErrorResponse
    extends Response
{

    @XmlElement(required = true)
    protected ErrorResponseInfo errorResponseInfo;

    /**
     * Gets the value of the errorResponseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorResponseInfo }
     *     
     */
    public ErrorResponseInfo getErrorResponseInfo() {
        return errorResponseInfo;
    }

    /**
     * Sets the value of the errorResponseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorResponseInfo }
     *     
     */
    public void setErrorResponseInfo(ErrorResponseInfo value) {
        this.errorResponseInfo = value;
    }

}
