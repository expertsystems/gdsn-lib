
package gs1.gdsn.safety_data_sheet.xsd._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.gdsn.gdsn_common.xsd._3.PhaseOfMatterCodeType;
import gs1.shared.shared_common.xsd._3.Description1000Type;
import gs1.shared.shared_common.xsd._3.TemperatureMeasurementType;


/**
 * <p>Java class for PhysicalChemicalPropertyInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalChemicalPropertyInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="autoIgnitionTemperature" type="{urn:gs1:shared:shared_common:xsd:3}TemperatureMeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="boilingPoint" type="{urn:gs1:shared:shared_common:xsd:3}TemperatureMeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="freezingMeltingPoint" type="{urn:gs1:shared:shared_common:xsd:3}TemperatureMeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lowerExplosiveLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="physicalFormDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="physicalStateCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}PhaseOfMatterCodeType" minOccurs="0"/&gt;
 *         &lt;element name="upperExplosiveLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="waterSolubilityTypeCode" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}WaterSolubilityTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="flashPoint" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}FlashPointType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pHInformation" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}PHInformationType" minOccurs="0"/&gt;
 *         &lt;element name="specificGravityInformation" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}SpecificGravityInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PhysicalChemicalPropertyInformationType", propOrder = {
    "autoIgnitionTemperature",
    "boilingPoint",
    "freezingMeltingPoint",
    "lowerExplosiveLimit",
    "physicalFormDescription",
    "physicalStateCode",
    "upperExplosiveLimit",
    "waterSolubilityTypeCode",
    "flashPoint",
    "phInformation",
    "specificGravityInformation",
    "avpList"
})
public class PhysicalChemicalPropertyInformationType {

    protected List<TemperatureMeasurementType> autoIgnitionTemperature;
    protected List<TemperatureMeasurementType> boilingPoint;
    protected List<TemperatureMeasurementType> freezingMeltingPoint;
    protected BigDecimal lowerExplosiveLimit;
    protected List<Description1000Type> physicalFormDescription;
    protected PhaseOfMatterCodeType physicalStateCode;
    protected BigDecimal upperExplosiveLimit;
    protected WaterSolubilityTypeCodeType waterSolubilityTypeCode;
    protected List<FlashPointType> flashPoint;
    @XmlElement(name = "pHInformation")
    protected PHInformationType phInformation;
    protected List<SpecificGravityInformationType> specificGravityInformation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the autoIgnitionTemperature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoIgnitionTemperature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoIgnitionTemperature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemperatureMeasurementType }
     * 
     * 
     */
    public List<TemperatureMeasurementType> getAutoIgnitionTemperature() {
        if (autoIgnitionTemperature == null) {
            autoIgnitionTemperature = new ArrayList<TemperatureMeasurementType>();
        }
        return this.autoIgnitionTemperature;
    }

    /**
     * Gets the value of the boilingPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boilingPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoilingPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemperatureMeasurementType }
     * 
     * 
     */
    public List<TemperatureMeasurementType> getBoilingPoint() {
        if (boilingPoint == null) {
            boilingPoint = new ArrayList<TemperatureMeasurementType>();
        }
        return this.boilingPoint;
    }

    /**
     * Gets the value of the freezingMeltingPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freezingMeltingPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreezingMeltingPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemperatureMeasurementType }
     * 
     * 
     */
    public List<TemperatureMeasurementType> getFreezingMeltingPoint() {
        if (freezingMeltingPoint == null) {
            freezingMeltingPoint = new ArrayList<TemperatureMeasurementType>();
        }
        return this.freezingMeltingPoint;
    }

    /**
     * Gets the value of the lowerExplosiveLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLowerExplosiveLimit() {
        return lowerExplosiveLimit;
    }

    /**
     * Sets the value of the lowerExplosiveLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLowerExplosiveLimit(BigDecimal value) {
        this.lowerExplosiveLimit = value;
    }

    /**
     * Gets the value of the physicalFormDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalFormDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalFormDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getPhysicalFormDescription() {
        if (physicalFormDescription == null) {
            physicalFormDescription = new ArrayList<Description1000Type>();
        }
        return this.physicalFormDescription;
    }

    /**
     * Gets the value of the physicalStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseOfMatterCodeType }
     *     
     */
    public PhaseOfMatterCodeType getPhysicalStateCode() {
        return physicalStateCode;
    }

    /**
     * Sets the value of the physicalStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseOfMatterCodeType }
     *     
     */
    public void setPhysicalStateCode(PhaseOfMatterCodeType value) {
        this.physicalStateCode = value;
    }

    /**
     * Gets the value of the upperExplosiveLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpperExplosiveLimit() {
        return upperExplosiveLimit;
    }

    /**
     * Sets the value of the upperExplosiveLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUpperExplosiveLimit(BigDecimal value) {
        this.upperExplosiveLimit = value;
    }

    /**
     * Gets the value of the waterSolubilityTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link WaterSolubilityTypeCodeType }
     *     
     */
    public WaterSolubilityTypeCodeType getWaterSolubilityTypeCode() {
        return waterSolubilityTypeCode;
    }

    /**
     * Sets the value of the waterSolubilityTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterSolubilityTypeCodeType }
     *     
     */
    public void setWaterSolubilityTypeCode(WaterSolubilityTypeCodeType value) {
        this.waterSolubilityTypeCode = value;
    }

    /**
     * Gets the value of the flashPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flashPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlashPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlashPointType }
     * 
     * 
     */
    public List<FlashPointType> getFlashPoint() {
        if (flashPoint == null) {
            flashPoint = new ArrayList<FlashPointType>();
        }
        return this.flashPoint;
    }

    /**
     * Gets the value of the phInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PHInformationType }
     *     
     */
    public PHInformationType getPHInformation() {
        return phInformation;
    }

    /**
     * Sets the value of the phInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PHInformationType }
     *     
     */
    public void setPHInformation(PHInformationType value) {
        this.phInformation = value;
    }

    /**
     * Gets the value of the specificGravityInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specificGravityInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificGravityInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecificGravityInformationType }
     * 
     * 
     */
    public List<SpecificGravityInformationType> getSpecificGravityInformation() {
        if (specificGravityInformation == null) {
            specificGravityInformation = new ArrayList<SpecificGravityInformationType>();
        }
        return this.specificGravityInformation;
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
