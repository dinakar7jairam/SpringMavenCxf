
package com.mycomp.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAccountRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAccountRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mycomp.com/services/libsvc}Request">
 *       &lt;sequence>
 *         &lt;element name="getAccountRequestInfo" type="{http://www.mycomp.com/services/libsvc}GetAccountRequestInfo"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccountRequest", propOrder = {
    "getAccountRequestInfo"
})
public class GetAccountRequest
    extends Request
{

    @XmlElement(required = true)
    protected GetAccountRequestInfo getAccountRequestInfo;

    /**
     * Gets the value of the getAccountRequestInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GetAccountRequestInfo }
     *     
     */
    public GetAccountRequestInfo getGetAccountRequestInfo() {
        return getAccountRequestInfo;
    }

    /**
     * Sets the value of the getAccountRequestInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAccountRequestInfo }
     *     
     */
    public void setGetAccountRequestInfo(GetAccountRequestInfo value) {
        this.getAccountRequestInfo = value;
    }

}
