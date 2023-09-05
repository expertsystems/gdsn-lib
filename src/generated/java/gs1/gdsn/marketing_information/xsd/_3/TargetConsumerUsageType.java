
package gs1.gdsn.marketing_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for TargetConsumerUsageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetConsumerUsageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="targetConsumerMinimumUsage" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="targetConsumerMaximumUsage" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="targetConsumerUsageTypeCode" type="{urn:gs1:gdsn:marketing_information:xsd:3}TargetConsumerUsageTypeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetConsumerUsageType", propOrder = {
    "targetConsumerMinimumUsage",
    "targetConsumerMaximumUsage",
    "targetConsumerUsageTypeCode"
})
public class TargetConsumerUsageType {

    protected MeasurementType targetConsumerMinimumUsage;
    protected MeasurementType targetConsumerMaximumUsage;
    protected TargetConsumerUsageTypeCodeType targetConsumerUsageTypeCode;

    /**
     * Gets the value of the targetConsumerMinimumUsage property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getTargetConsumerMinimumUsage() {
        return targetConsumerMinimumUsage;
    }

    /**
     * Sets the value of the targetConsumerMinimumUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setTargetConsumerMinimumUsage(MeasurementType value) {
        this.targetConsumerMinimumUsage = value;
    }

    /**
     * Gets the value of the targetConsumerMaximumUsage property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getTargetConsumerMaximumUsage() {
        return targetConsumerMaximumUsage;
    }

    /**
     * Sets the value of the targetConsumerMaximumUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setTargetConsumerMaximumUsage(MeasurementType value) {
        this.targetConsumerMaximumUsage = value;
    }

    /**
     * Gets the value of the targetConsumerUsageTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TargetConsumerUsageTypeCodeType }
     *     
     */
    public TargetConsumerUsageTypeCodeType getTargetConsumerUsageTypeCode() {
        return targetConsumerUsageTypeCode;
    }

    /**
     * Sets the value of the targetConsumerUsageTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetConsumerUsageTypeCodeType }
     *     
     */
    public void setTargetConsumerUsageTypeCode(TargetConsumerUsageTypeCodeType value) {
        this.targetConsumerUsageTypeCode = value;
    }

}
