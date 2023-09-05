
package gs1.gdsn.safety_data_sheet.xsd._3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.gdsn.gdsn_common.xsd._3.MeasurementPrecisionCodeType;


/**
 * <p>Java class for SpecificGravityInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecificGravityInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="specificGravity" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="specificGravityReferenceMaterialCode" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}SpecificGravityReferenceMaterialCodeType"/&gt;
 *         &lt;element name="specificGravityLowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="specificGravityMeasurementPrecision" type="{urn:gs1:gdsn:gdsn_common:xsd:3}MeasurementPrecisionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="specificGravityUpperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
@XmlType(name = "SpecificGravityInformationType", propOrder = {
    "specificGravity",
    "specificGravityReferenceMaterialCode",
    "specificGravityLowerValue",
    "specificGravityMeasurementPrecision",
    "specificGravityUpperValue",
    "avpList"
})
public class SpecificGravityInformationType {

    @XmlElement(required = true)
    protected BigDecimal specificGravity;
    @XmlElement(required = true)
    protected SpecificGravityReferenceMaterialCodeType specificGravityReferenceMaterialCode;
    protected BigDecimal specificGravityLowerValue;
    protected MeasurementPrecisionCodeType specificGravityMeasurementPrecision;
    protected BigDecimal specificGravityUpperValue;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the specificGravity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpecificGravity() {
        return specificGravity;
    }

    /**
     * Sets the value of the specificGravity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpecificGravity(BigDecimal value) {
        this.specificGravity = value;
    }

    /**
     * Gets the value of the specificGravityReferenceMaterialCode property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificGravityReferenceMaterialCodeType }
     *     
     */
    public SpecificGravityReferenceMaterialCodeType getSpecificGravityReferenceMaterialCode() {
        return specificGravityReferenceMaterialCode;
    }

    /**
     * Sets the value of the specificGravityReferenceMaterialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificGravityReferenceMaterialCodeType }
     *     
     */
    public void setSpecificGravityReferenceMaterialCode(SpecificGravityReferenceMaterialCodeType value) {
        this.specificGravityReferenceMaterialCode = value;
    }

    /**
     * Gets the value of the specificGravityLowerValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpecificGravityLowerValue() {
        return specificGravityLowerValue;
    }

    /**
     * Sets the value of the specificGravityLowerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpecificGravityLowerValue(BigDecimal value) {
        this.specificGravityLowerValue = value;
    }

    /**
     * Gets the value of the specificGravityMeasurementPrecision property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public MeasurementPrecisionCodeType getSpecificGravityMeasurementPrecision() {
        return specificGravityMeasurementPrecision;
    }

    /**
     * Sets the value of the specificGravityMeasurementPrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public void setSpecificGravityMeasurementPrecision(MeasurementPrecisionCodeType value) {
        this.specificGravityMeasurementPrecision = value;
    }

    /**
     * Gets the value of the specificGravityUpperValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpecificGravityUpperValue() {
        return specificGravityUpperValue;
    }

    /**
     * Sets the value of the specificGravityUpperValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpecificGravityUpperValue(BigDecimal value) {
        this.specificGravityUpperValue = value;
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
