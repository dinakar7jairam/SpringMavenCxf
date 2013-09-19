
package com.mycomp.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAccountResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAccountResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mycomp.com/services/libsvc}Response">
 *       &lt;sequence>
 *         &lt;element name="getAccountResponseInfo" type="{http://www.mycomp.com/services/libsvc}GetAccountResponseInfo"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccountResponse", propOrder = {
    "getAccountResponseInfo"
})
public class GetAccountResponse
    extends Response
{

    @XmlElement(required = true)
    protected GetAccountResponseInfo getAccountResponseInfo;

    /**
     * Gets the value of the getAccountResponseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GetAccountResponseInfo }
     *     
     */
    public GetAccountResponseInfo getGetAccountResponseInfo() {
        return getAccountResponseInfo;
    }

    /**
     * Sets the value of the getAccountResponseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAccountResponseInfo }
     *     
     */
    public void setGetAccountResponseInfo(GetAccountResponseInfo value) {
        this.getAccountResponseInfo = value;
    }

}
