
package gs1.gdsn.trade_item_temperature_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;


/**
 * <p>Java class for TradeItemTemperatureInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemTemperatureInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeItemTemperatureConditionTypeCode" type="{urn:gs1:gdsn:trade_item_temperature_information:xsd:3}TradeItemTemperatureConditionTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemTemperatureInformation" type="{urn:gs1:gdsn:trade_item_temperature_information:xsd:3}TradeItemTemperatureInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TradeItemTemperatureInformationModuleType", propOrder = {
    "tradeItemTemperatureConditionTypeCode",
    "tradeItemTemperatureInformation",
    "avpList"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:trade_item_temperature_information:xsd:3")
public class TradeItemTemperatureInformationModuleType {

    protected TradeItemTemperatureConditionTypeCodeType tradeItemTemperatureConditionTypeCode;
    protected List<TradeItemTemperatureInformationType> tradeItemTemperatureInformation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the tradeItemTemperatureConditionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemTemperatureConditionTypeCodeType }
     *     
     */
    public TradeItemTemperatureConditionTypeCodeType getTradeItemTemperatureConditionTypeCode() {
        return tradeItemTemperatureConditionTypeCode;
    }

    /**
     * Sets the value of the tradeItemTemperatureConditionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemTemperatureConditionTypeCodeType }
     *     
     */
    public void setTradeItemTemperatureConditionTypeCode(TradeItemTemperatureConditionTypeCodeType value) {
        this.tradeItemTemperatureConditionTypeCode = value;
    }

    /**
     * Gets the value of the tradeItemTemperatureInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemTemperatureInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemTemperatureInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeItemTemperatureInformationType }
     * 
     * 
     */
    public List<TradeItemTemperatureInformationType> getTradeItemTemperatureInformation() {
        if (tradeItemTemperatureInformation == null) {
            tradeItemTemperatureInformation = new ArrayList<TradeItemTemperatureInformationType>();
        }
        return this.tradeItemTemperatureInformation;
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
