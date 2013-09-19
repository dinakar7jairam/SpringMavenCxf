
package com.mycomp.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appRequestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serverRequestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", propOrder = {
    "appRequestId",
    "serverRequestId"
})
@XmlSeeAlso({
    GetAccountResponse.class,
    ErrorResponse.class
})
public class Response {

    @XmlElement(required = true)
    protected String appRequestId;
    @XmlElement(required = true)
    protected String serverRequestId;

    /**
     * Gets the value of the appRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppRequestId() {
        return appRequestId;
    }

    /**
     * Sets the value of the appRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppRequestId(String value) {
        this.appRequestId = value;
    }

    /**
     * Gets the value of the serverRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerRequestId() {
        return serverRequestId;
    }

    /**
     * Sets the value of the serverRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerRequestId(String value) {
        this.serverRequestId = value;
    }

}
