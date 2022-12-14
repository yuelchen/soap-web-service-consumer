
package com.yuelchen.soap.dataset;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datasetName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="datasetDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="datasetFieldsCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "datasetName",
    "datasetDescription",
    "datasetFieldsCount"
})
@XmlRootElement(name = "DatasetRequest")
public class DatasetRequest {

    @XmlElement(required = true)
    protected String datasetName;
    @XmlElement(required = true)
    protected String datasetDescription;
    protected int datasetFieldsCount;

    /**
     * Gets the value of the datasetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetName() {
        return datasetName;
    }

    /**
     * Sets the value of the datasetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetName(String value) {
        this.datasetName = value;
    }

    /**
     * Gets the value of the datasetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetDescription() {
        return datasetDescription;
    }

    /**
     * Sets the value of the datasetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetDescription(String value) {
        this.datasetDescription = value;
    }

    /**
     * Gets the value of the datasetFieldsCount property.
     * 
     */
    public int getDatasetFieldsCount() {
        return datasetFieldsCount;
    }

    /**
     * Sets the value of the datasetFieldsCount property.
     * 
     */
    public void setDatasetFieldsCount(int value) {
        this.datasetFieldsCount = value;
    }

}
