
package gs1.gdsn.packaging_marking.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeItemIdentificationMarkingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemIdentificationMarkingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeItemIdentificationMarkingTypeCode" type="{urn:gs1:gdsn:packaging_marking:xsd:3}TradeItemIdentificationMarkingTypeCodeType"/&gt;
 *         &lt;element name="tradeItemIdentificationMarkingValue" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemIdentificationMarkingType", propOrder = {
    "tradeItemIdentificationMarkingTypeCode",
    "tradeItemIdentificationMarkingValue"
})
public class TradeItemIdentificationMarkingType {

    @XmlElement(required = true)
    protected TradeItemIdentificationMarkingTypeCodeType tradeItemIdentificationMarkingTypeCode;
    protected String tradeItemIdentificationMarkingValue;

    /**
     * Gets the value of the tradeItemIdentificationMarkingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemIdentificationMarkingTypeCodeType }
     *     
     */
    public TradeItemIdentificationMarkingTypeCodeType getTradeItemIdentificationMarkingTypeCode() {
        return tradeItemIdentificationMarkingTypeCode;
    }

    /**
     * Sets the value of the tradeItemIdentificationMarkingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemIdentificationMarkingTypeCodeType }
     *     
     */
    public void setTradeItemIdentificationMarkingTypeCode(TradeItemIdentificationMarkingTypeCodeType value) {
        this.tradeItemIdentificationMarkingTypeCode = value;
    }

    /**
     * Gets the value of the tradeItemIdentificationMarkingValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeItemIdentificationMarkingValue() {
        return tradeItemIdentificationMarkingValue;
    }

    /**
     * Sets the value of the tradeItemIdentificationMarkingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeItemIdentificationMarkingValue(String value) {
        this.tradeItemIdentificationMarkingValue = value;
    }

}
