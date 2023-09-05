
package gs1.gdsn.software_system_requirements.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for SoftwareSystemRequirementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoftwareSystemRequirementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requiredHardwarePerformance" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="requiredStorageCapacity" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="requiredSystemMemoryCapacity" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="requiredVideoMemoryCapacity" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="systemRequirementsQualifierCode" type="{urn:gs1:gdsn:software_system_requirements:xsd:3}SystemRequirementsQualifierTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="avpList" type="{urn:gs1:gdsn:gdsn_common:xsd:3}GS1_AttributeValuePairListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoftwareSystemRequirementsType", propOrder = {
    "requiredHardwarePerformance",
    "requiredStorageCapacity",
    "requiredSystemMemoryCapacity",
    "requiredVideoMemoryCapacity",
    "systemRequirementsQualifierCode",
    "avpList"
})
public class SoftwareSystemRequirementsType {

    protected MeasurementType requiredHardwarePerformance;
    protected MeasurementType requiredStorageCapacity;
    protected MeasurementType requiredSystemMemoryCapacity;
    protected MeasurementType requiredVideoMemoryCapacity;
    protected SystemRequirementsQualifierTypeCodeType systemRequirementsQualifierCode;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the requiredHardwarePerformance property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getRequiredHardwarePerformance() {
        return requiredHardwarePerformance;
    }

    /**
     * Sets the value of the requiredHardwarePerformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setRequiredHardwarePerformance(MeasurementType value) {
        this.requiredHardwarePerformance = value;
    }

    /**
     * Gets the value of the requiredStorageCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getRequiredStorageCapacity() {
        return requiredStorageCapacity;
    }

    /**
     * Sets the value of the requiredStorageCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setRequiredStorageCapacity(MeasurementType value) {
        this.requiredStorageCapacity = value;
    }

    /**
     * Gets the value of the requiredSystemMemoryCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getRequiredSystemMemoryCapacity() {
        return requiredSystemMemoryCapacity;
    }

    /**
     * Sets the value of the requiredSystemMemoryCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setRequiredSystemMemoryCapacity(MeasurementType value) {
        this.requiredSystemMemoryCapacity = value;
    }

    /**
     * Gets the value of the requiredVideoMemoryCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getRequiredVideoMemoryCapacity() {
        return requiredVideoMemoryCapacity;
    }

    /**
     * Sets the value of the requiredVideoMemoryCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setRequiredVideoMemoryCapacity(MeasurementType value) {
        this.requiredVideoMemoryCapacity = value;
    }

    /**
     * Gets the value of the systemRequirementsQualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link SystemRequirementsQualifierTypeCodeType }
     *     
     */
    public SystemRequirementsQualifierTypeCodeType getSystemRequirementsQualifierCode() {
        return systemRequirementsQualifierCode;
    }

    /**
     * Sets the value of the systemRequirementsQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemRequirementsQualifierTypeCodeType }
     *     
     */
    public void setSystemRequirementsQualifierCode(SystemRequirementsQualifierTypeCodeType value) {
        this.systemRequirementsQualifierCode = value;
    }

    /**
     * Gets the value of the avpList property.
     * 
     * @return
     *     possible object is
     *     {@link GS1AttributeValuePairListType }
     *     
     */
    public GS1AttributeValuePairListType getAvpList() {
        return avpList;
    }

    /**
     * Sets the value of the avpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GS1AttributeValuePairListType }
     *     
     */
    public void setAvpList(GS1AttributeValuePairListType value) {
        this.avpList = value;
    }

}
