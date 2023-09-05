
package gs1.gdsn.trade_item_data_carrier_and_identification.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;


/**
 * <p>Java class for GS1TradeItemIdentificationKeyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GS1TradeItemIdentificationKeyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gs1TradeItemIdentificationKeyCode" type="{urn:gs1:gdsn:trade_item_data_carrier_and_identification:xsd:3}GS1TradeItemIdentificationKeyTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="gs1TradeItemIdentificationKeyValue" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isBarCodeDerivable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isBarCodeOnPackageVariableMeasureBarCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "GS1TradeItemIdentificationKeyType", propOrder = {
    "gs1TradeItemIdentificationKeyCode",
    "gs1TradeItemIdentificationKeyValue",
    "isBarCodeDerivable",
    "isBarCodeOnPackageVariableMeasureBarCode",
    "avpList"
})
public class GS1TradeItemIdentificationKeyType {

    protected GS1TradeItemIdentificationKeyTypeCodeType gs1TradeItemIdentificationKeyCode;
    protected String gs1TradeItemIdentificationKeyValue;
    protected Boolean isBarCodeDerivable;
    protected Boolean isBarCodeOnPackageVariableMeasureBarCode;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the gs1TradeItemIdentificationKeyCode property.
     * 
     * @return
     *     possible object is
     *     {@link GS1TradeItemIdentificationKeyTypeCodeType }
     *     
     */
    public GS1TradeItemIdentificationKeyTypeCodeType getGs1TradeItemIdentificationKeyCode() {
        return gs1TradeItemIdentificationKeyCode;
    }

    /**
     * Sets the value of the gs1TradeItemIdentificationKeyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GS1TradeItemIdentificationKeyTypeCodeType }
     *     
     */
    public void setGs1TradeItemIdentificationKeyCode(GS1TradeItemIdentificationKeyTypeCodeType value) {
        this.gs1TradeItemIdentificationKeyCode = value;
    }

    /**
     * Gets the value of the gs1TradeItemIdentificationKeyValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGs1TradeItemIdentificationKeyValue() {
        return gs1TradeItemIdentificationKeyValue;
    }

    /**
     * Sets the value of the gs1TradeItemIdentificationKeyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGs1TradeItemIdentificationKeyValue(String value) {
        this.gs1TradeItemIdentificationKeyValue = value;
    }

    /**
     * Gets the value of the isBarCodeDerivable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBarCodeDerivable() {
        return isBarCodeDerivable;
    }

    /**
     * Sets the value of the isBarCodeDerivable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBarCodeDerivable(Boolean value) {
        this.isBarCodeDerivable = value;
    }

    /**
     * Gets the value of the isBarCodeOnPackageVariableMeasureBarCode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBarCodeOnPackageVariableMeasureBarCode() {
        return isBarCodeOnPackageVariableMeasureBarCode;
    }

    /**
     * Sets the value of the isBarCodeOnPackageVariableMeasureBarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBarCodeOnPackageVariableMeasureBarCode(Boolean value) {
        this.isBarCodeOnPackageVariableMeasureBarCode = value;
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
