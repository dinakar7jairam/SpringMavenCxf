
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
 *         &lt;element name="appName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="appRequestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="immediate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="requests" type="{http://www.mycomp.com/services/libsvc}Request" maxOccurs="unbounded"/>
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
    "appName",
    "appRequestId",
    "immediate",
    "requests"
})
@XmlRootElement(name = "RequestList")
public class RequestList {

    @XmlElement(required = true)
    protected String appName;
    @XmlElement(required = true)
    protected String appRequestId;
    @XmlElement(defaultValue = "0")
    protected int immediate;
    @XmlElement(required = true)
    protected List<Request> requests;

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
     * Gets the value of the immediate property.
     * 
     */
    public int getImmediate() {
        return immediate;
    }

    /**
     * Sets the value of the immediate property.
     * 
     */
    public void setImmediate(int value) {
        this.immediate = value;
    }

    /**
     * Gets the value of the requests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Request }
     * 
     * 
     */
    public List<Request> getRequests() {
        if (requests == null) {
            requests = new ArrayList<Request>();
        }
        return this.requests;
    }

}
