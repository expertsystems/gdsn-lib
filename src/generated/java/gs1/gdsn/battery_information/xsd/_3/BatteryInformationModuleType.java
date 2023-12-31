
package gs1.gdsn.battery_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;


/**
 * <p>Java class for BatteryInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatteryInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="areBatteriesIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="areBatteriesRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="powerSupplyTypeCode" type="{urn:gs1:gdsn:battery_information:xsd:3}PowerSupplyTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="batteryDetail" type="{urn:gs1:gdsn:battery_information:xsd:3}BatteryDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "BatteryInformationModuleType", propOrder = {
    "areBatteriesIncluded",
    "areBatteriesRequired",
    "powerSupplyTypeCode",
    "batteryDetail",
    "avpList"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:battery_information:xsd:3")
public class BatteryInformationModuleType {

    protected Boolean areBatteriesIncluded;
    protected Boolean areBatteriesRequired;
    protected List<PowerSupplyTypeCodeType> powerSupplyTypeCode;
    protected List<BatteryDetailType> batteryDetail;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the areBatteriesIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAreBatteriesIncluded() {
        return areBatteriesIncluded;
    }

    /**
     * Sets the value of the areBatteriesIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAreBatteriesIncluded(Boolean value) {
        this.areBatteriesIncluded = value;
    }

    /**
     * Gets the value of the areBatteriesRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAreBatteriesRequired() {
        return areBatteriesRequired;
    }

    /**
     * Sets the value of the areBatteriesRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAreBatteriesRequired(Boolean value) {
        this.areBatteriesRequired = value;
    }

    /**
     * Gets the value of the powerSupplyTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the powerSupplyTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPowerSupplyTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PowerSupplyTypeCodeType }
     * 
     * 
     */
    public List<PowerSupplyTypeCodeType> getPowerSupplyTypeCode() {
        if (powerSupplyTypeCode == null) {
            powerSupplyTypeCode = new ArrayList<PowerSupplyTypeCodeType>();
        }
        return this.powerSupplyTypeCode;
    }

    /**
     * Gets the value of the batteryDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batteryDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatteryDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatteryDetailType }
     * 
     * 
     */
    public List<BatteryDetailType> getBatteryDetail() {
        if (batteryDetail == null) {
            batteryDetail = new ArrayList<BatteryDetailType>();
        }
        return this.batteryDetail;
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
