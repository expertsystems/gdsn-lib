
package gs1.gdsn.sales_information.xsd._3;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import gs1.shared.shared_common.xsd._3.AmountType;
import gs1.shared.shared_common.xsd._3.QuantityType;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for TradeItemPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemPriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeItemPrice" type="{urn:gs1:shared:shared_common:xsd:3}AmountType"/&gt;
 *         &lt;element name="priceBasisQuantity" type="{urn:gs1:shared:shared_common:xsd:3}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="priceEffectiveEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="priceEffectiveStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="sheetName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tradeItemPriceTypeCode" type="{urn:gs1:gdsn:sales_information:xsd:3}TradeItemPriceTypeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemPriceType", propOrder = {
    "tradeItemPrice",
    "priceBasisQuantity",
    "priceEffectiveEndDate",
    "priceEffectiveStartDate",
    "sheetName",
    "tradeItemPriceTypeCode"
})
public class TradeItemPriceType {

    @XmlElement(required = true)
    protected AmountType tradeItemPrice;
    protected QuantityType priceBasisQuantity;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime priceEffectiveEndDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime priceEffectiveStartDate;
    protected String sheetName;
    protected TradeItemPriceTypeCodeType tradeItemPriceTypeCode;

    /**
     * Gets the value of the tradeItemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTradeItemPrice() {
        return tradeItemPrice;
    }

    /**
     * Sets the value of the tradeItemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTradeItemPrice(AmountType value) {
        this.tradeItemPrice = value;
    }

    /**
     * Gets the value of the priceBasisQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getPriceBasisQuantity() {
        return priceBasisQuantity;
    }

    /**
     * Sets the value of the priceBasisQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setPriceBasisQuantity(QuantityType value) {
        this.priceBasisQuantity = value;
    }

    /**
     * Gets the value of the priceEffectiveEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getPriceEffectiveEndDate() {
        return priceEffectiveEndDate;
    }

    /**
     * Sets the value of the priceEffectiveEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceEffectiveEndDate(LocalDateTime value) {
        this.priceEffectiveEndDate = value;
    }

    /**
     * Gets the value of the priceEffectiveStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getPriceEffectiveStartDate() {
        return priceEffectiveStartDate;
    }

    /**
     * Sets the value of the priceEffectiveStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceEffectiveStartDate(LocalDateTime value) {
        this.priceEffectiveStartDate = value;
    }

    /**
     * Gets the value of the sheetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSheetName() {
        return sheetName;
    }

    /**
     * Sets the value of the sheetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSheetName(String value) {
        this.sheetName = value;
    }

    /**
     * Gets the value of the tradeItemPriceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemPriceTypeCodeType }
     *     
     */
    public TradeItemPriceTypeCodeType getTradeItemPriceTypeCode() {
        return tradeItemPriceTypeCode;
    }

    /**
     * Sets the value of the tradeItemPriceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemPriceTypeCodeType }
     *     
     */
    public void setTradeItemPriceTypeCode(TradeItemPriceTypeCodeType value) {
        this.tradeItemPriceTypeCode = value;
    }

}
