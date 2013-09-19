
package com.mycomp.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serverResponseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="appName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appRequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responses" type="{http://www.mycomp.com/services/libsvc}Response" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serverResponseId",
    "appName",
    "appRequestId",
    "responses"
})
@XmlRootElement(name = "ResponseList")
public class ResponseList {

    @XmlElement(required = true)
    protected String serverResponseId;
    protected String appName;
    protected String appRequestId;
    @XmlElement(required = true)
    protected List<Response> responses;

    /**
     * Gets the value of the serverResponseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerResponseId() {
        return serverResponseId;
    }

    /**
     * Sets the value of the serverResponseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerResponseId(String value) {
        this.serverResponseId = value;
    }

    /**
     * Gets the value of the appName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppName() {
        return appName;
    }

    /**
     * Sets the value of the appName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppName(String value) {
        this.appName = value;
    }

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
     * Gets the value of the responses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Response }
     * 
     * 
     */
    public List<Response> getResponses() {
        if (responses == null) {
            responses = new ArrayList<Response>();
        }
        return this.responses;
    }

}
