
package gs1.gdsn.trade_item.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.DisplayTypeCodeType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for DisplayUnitInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisplayUnitInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="displayTypeCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}DisplayTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="hasDisplayReadyPackaging" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemADisplayUnit" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
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
@XmlType(name = "DisplayUnitInformationType", propOrder = {
    "displayTypeCode",
    "hasDisplayReadyPackaging",
    "isTradeItemADisplayUnit",
    "avpList"
})
public class DisplayUnitInformationType {

    protected DisplayTypeCodeType displayTypeCode;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType hasDisplayReadyPackaging;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isTradeItemADisplayUnit;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the displayTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayTypeCodeType }
     *     
     */
    public DisplayTypeCodeType getDisplayTypeCode() {
        return displayTypeCode;
    }

    /**
     * Sets the value of the displayTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayTypeCodeType }
     *     
     */
    public void setDisplayTypeCode(DisplayTypeCodeType value) {
        this.displayTypeCode = value;
    }

    /**
     * Gets the value of the hasDisplayReadyPackaging property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getHasDisplayReadyPackaging() {
        return hasDisplayReadyPackaging;
    }

    /**
     * Sets the value of the hasDisplayReadyPackaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setHasDisplayReadyPackaging(NonBinaryLogicEnumerationType value) {
        this.hasDisplayReadyPackaging = value;
    }

    /**
     * Gets the value of the isTradeItemADisplayUnit property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsTradeItemADisplayUnit() {
        return isTradeItemADisplayUnit;
    }

    /**
     * Sets the value of the isTradeItemADisplayUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsTradeItemADisplayUnit(NonBinaryLogicEnumerationType value) {
        this.isTradeItemADisplayUnit = value;
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
