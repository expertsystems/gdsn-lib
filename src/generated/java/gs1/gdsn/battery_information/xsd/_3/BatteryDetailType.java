
package gs1.gdsn.battery_information.xsd._3;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.gdsn.gdsn_common.xsd._3.TradeItemMaterialType;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;
import gs1.shared.shared_common.xsd._3.TimeMeasurementType;


/**
 * <p>Java class for BatteryDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatteryDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="areBatteriesBuiltIn" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="batteryTechnologyTypeCode" type="{urn:gs1:gdsn:battery_information:xsd:3}BatteryTechnologyTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="batteryTypeCode" type="{urn:gs1:gdsn:battery_information:xsd:3}BatteryTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="batteryWeight" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="quantityOfBatteriesBuiltIn" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="quantityOfBatteriesRequired" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="batteryTypeQualifierCode" type="{urn:gs1:gdsn:battery_information:xsd:3}BatteryTypeQualifierCodeType" minOccurs="0"/&gt;
 *         &lt;element name="batteryWattHourRating" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="maximumBatteryLife" type="{urn:gs1:shared:shared_common:xsd:3}TimeMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="batteryCapacity" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="batteryVoltage" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isBatteryRechargeable" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="quantityOfBatteriesIncluded" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="batteryMaterials" type="{urn:gs1:gdsn:gdsn_common:xsd:3}TradeItemMaterialType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "BatteryDetailType", propOrder = {
    "areBatteriesBuiltIn",
    "batteryTechnologyTypeCode",
    "batteryTypeCode",
    "batteryWeight",
    "quantityOfBatteriesBuiltIn",
    "quantityOfBatteriesRequired",
    "batteryTypeQualifierCode",
    "batteryWattHourRating",
    "maximumBatteryLife",
    "batteryCapacity",
    "batteryVoltage",
    "isBatteryRechargeable",
    "quantityOfBatteriesIncluded",
    "batteryMaterials",
    "avpList"
})
public class BatteryDetailType {

    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType areBatteriesBuiltIn;
    protected List<BatteryTechnologyTypeCodeType> batteryTechnologyTypeCode;
    protected BatteryTypeCodeType batteryTypeCode;
    protected MeasurementType batteryWeight;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantityOfBatteriesBuiltIn;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantityOfBatteriesRequired;
    protected BatteryTypeQualifierCodeType batteryTypeQualifierCode;
    protected BigDecimal batteryWattHourRating;
    protected TimeMeasurementType maximumBatteryLife;
    protected List<MeasurementType> batteryCapacity;
    protected List<MeasurementType> batteryVoltage;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isBatteryRechargeable;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantityOfBatteriesIncluded;
    protected List<TradeItemMaterialType> batteryMaterials;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the areBatteriesBuiltIn property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getAreBatteriesBuiltIn() {
        return areBatteriesBuiltIn;
    }

    /**
     * Sets the value of the areBatteriesBuiltIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setAreBatteriesBuiltIn(NonBinaryLogicEnumerationType value) {
        this.areBatteriesBuiltIn = value;
    }

    /**
     * Gets the value of the batteryTechnologyTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batteryTechnologyTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatteryTechnologyTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatteryTechnologyTypeCodeType }
     * 
     * 
     */
    public List<BatteryTechnologyTypeCodeType> getBatteryTechnologyTypeCode() {
        if (batteryTechnologyTypeCode == null) {
            batteryTechnologyTypeCode = new ArrayList<BatteryTechnologyTypeCodeType>();
        }
        return this.batteryTechnologyTypeCode;
    }

    /**
     * Gets the value of the batteryTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BatteryTypeCodeType }
     *     
     */
    public BatteryTypeCodeType getBatteryTypeCode() {
        return batteryTypeCode;
    }

    /**
     * Sets the value of the batteryTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatteryTypeCodeType }
     *     
     */
    public void setBatteryTypeCode(BatteryTypeCodeType value) {
        this.batteryTypeCode = value;
    }

    /**
     * Gets the value of the batteryWeight property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getBatteryWeight() {
        return batteryWeight;
    }

    /**
     * Sets the value of the batteryWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setBatteryWeight(MeasurementType value) {
        this.batteryWeight = value;
    }

    /**
     * Gets the value of the quantityOfBatteriesBuiltIn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityOfBatteriesBuiltIn() {
        return quantityOfBatteriesBuiltIn;
    }

    /**
     * Sets the value of the quantityOfBatteriesBuiltIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityOfBatteriesBuiltIn(BigInteger value) {
        this.quantityOfBatteriesBuiltIn = value;
    }

    /**
     * Gets the value of the quantityOfBatteriesRequired property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityOfBatteriesRequired() {
        return quantityOfBatteriesRequired;
    }

    /**
     * Sets the value of the quantityOfBatteriesRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityOfBatteriesRequired(BigInteger value) {
        this.quantityOfBatteriesRequired = value;
    }

    /**
     * Gets the value of the batteryTypeQualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link BatteryTypeQualifierCodeType }
     *     
     */
    public BatteryTypeQualifierCodeType getBatteryTypeQualifierCode() {
        return batteryTypeQualifierCode;
    }

    /**
     * Sets the value of the batteryTypeQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatteryTypeQualifierCodeType }
     *     
     */
    public void setBatteryTypeQualifierCode(BatteryTypeQualifierCodeType value) {
        this.batteryTypeQualifierCode = value;
    }

    /**
     * Gets the value of the batteryWattHourRating property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBatteryWattHourRating() {
        return batteryWattHourRating;
    }

    /**
     * Sets the value of the batteryWattHourRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBatteryWattHourRating(BigDecimal value) {
        this.batteryWattHourRating = value;
    }

    /**
     * Gets the value of the maximumBatteryLife property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasurementType }
     *     
     */
    public TimeMeasurementType getMaximumBatteryLife() {
        return maximumBatteryLife;
    }

    /**
     * Sets the value of the maximumBatteryLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasurementType }
     *     
     */
    public void setMaximumBatteryLife(TimeMeasurementType value) {
        this.maximumBatteryLife = value;
    }

    /**
     * Gets the value of the batteryCapacity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batteryCapacity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatteryCapacity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getBatteryCapacity() {
        if (batteryCapacity == null) {
            batteryCapacity = new ArrayList<MeasurementType>();
        }
        return this.batteryCapacity;
    }

    /**
     * Gets the value of the batteryVoltage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batteryVoltage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatteryVoltage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getBatteryVoltage() {
        if (batteryVoltage == null) {
            batteryVoltage = new ArrayList<MeasurementType>();
        }
        return this.batteryVoltage;
    }

    /**
     * Gets the value of the isBatteryRechargeable property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsBatteryRechargeable() {
        return isBatteryRechargeable;
    }

    /**
     * Sets the value of the isBatteryRechargeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsBatteryRechargeable(NonBinaryLogicEnumerationType value) {
        this.isBatteryRechargeable = value;
    }

    /**
     * Gets the value of the quantityOfBatteriesIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityOfBatteriesIncluded() {
        return quantityOfBatteriesIncluded;
    }

    /**
     * Sets the value of the quantityOfBatteriesIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityOfBatteriesIncluded(BigInteger value) {
        this.quantityOfBatteriesIncluded = value;
    }

    /**
     * Gets the value of the batteryMaterials property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batteryMaterials property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatteryMaterials().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeItemMaterialType }
     * 
     * 
     */
    public List<TradeItemMaterialType> getBatteryMaterials() {
        if (batteryMaterials == null) {
            batteryMaterials = new ArrayList<TradeItemMaterialType>();
        }
        return this.batteryMaterials;
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
