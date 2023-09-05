
package gs1.gdsn.physical_resource_usage.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for PhysicalResourceUsageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalResourceUsageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="physicalResourceUsageMeasurementTypeCode" type="{urn:gs1:gdsn:physical_resource_usage:xsd:3}PhysicalResourceUsageMeasurementTypeCodeType"/&gt;
 *         &lt;element name="physicalResourceUsageMeasurementBasis" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="physicalResourceUsage" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="runModeCode" type="{urn:gs1:gdsn:physical_resource_usage:xsd:3}RunModeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalResourceUsageType", propOrder = {
    "physicalResourceUsageMeasurementTypeCode",
    "physicalResourceUsageMeasurementBasis",
    "physicalResourceUsage",
    "runModeCode"
})
public class PhysicalResourceUsageType {

    @XmlElement(required = true)
    protected PhysicalResourceUsageMeasurementTypeCodeType physicalResourceUsageMeasurementTypeCode;
    protected MeasurementType physicalResourceUsageMeasurementBasis;
    protected MeasurementType physicalResourceUsage;
    protected RunModeCodeType runModeCode;

    /**
     * Gets the value of the physicalResourceUsageMeasurementTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalResourceUsageMeasurementTypeCodeType }
     *     
     */
    public PhysicalResourceUsageMeasurementTypeCodeType getPhysicalResourceUsageMeasurementTypeCode() {
        return physicalResourceUsageMeasurementTypeCode;
    }

    /**
     * Sets the value of the physicalResourceUsageMeasurementTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalResourceUsageMeasurementTypeCodeType }
     *     
     */
    public void setPhysicalResourceUsageMeasurementTypeCode(PhysicalResourceUsageMeasurementTypeCodeType value) {
        this.physicalResourceUsageMeasurementTypeCode = value;
    }

    /**
     * Gets the value of the physicalResourceUsageMeasurementBasis property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getPhysicalResourceUsageMeasurementBasis() {
        return physicalResourceUsageMeasurementBasis;
    }

    /**
     * Sets the value of the physicalResourceUsageMeasurementBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setPhysicalResourceUsageMeasurementBasis(MeasurementType value) {
        this.physicalResourceUsageMeasurementBasis = value;
    }

    /**
     * Gets the value of the physicalResourceUsage property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getPhysicalResourceUsage() {
        return physicalResourceUsage;
    }

    /**
     * Sets the value of the physicalResourceUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setPhysicalResourceUsage(MeasurementType value) {
        this.physicalResourceUsage = value;
    }

    /**
     * Gets the value of the runModeCode property.
     * 
     * @return
     *     possible object is
     *     {@link RunModeCodeType }
     *     
     */
    public RunModeCodeType getRunModeCode() {
        return runModeCode;
    }

    /**
     * Sets the value of the runModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunModeCodeType }
     *     
     */
    public void setRunModeCode(RunModeCodeType value) {
        this.runModeCode = value;
    }

}
