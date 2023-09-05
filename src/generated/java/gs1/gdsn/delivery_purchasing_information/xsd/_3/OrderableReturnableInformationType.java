
package gs1.gdsn.delivery_purchasing_information.xsd._3;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for OrderableReturnableInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderableReturnableInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="firstReturnableDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="isNonSoldTradeItemReturnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="lastReturnableDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="orderableReturnableConditionsCode" type="{urn:gs1:gdsn:delivery_purchasing_information:xsd:3}OrderableReturnableConditionsCodeType" minOccurs="0"/&gt;
 *         &lt;element name="returnGoodsPolicyCode" type="{urn:gs1:gdsn:delivery_purchasing_information:xsd:3}RightOfReturnForNonSoldTradeItemCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderableReturnableInformationType", propOrder = {
    "firstReturnableDateTime",
    "isNonSoldTradeItemReturnable",
    "lastReturnableDateTime",
    "orderableReturnableConditionsCode",
    "returnGoodsPolicyCode"
})
public class OrderableReturnableInformationType {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime firstReturnableDateTime;
    protected Boolean isNonSoldTradeItemReturnable;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime lastReturnableDateTime;
    protected OrderableReturnableConditionsCodeType orderableReturnableConditionsCode;
    protected RightOfReturnForNonSoldTradeItemCodeType returnGoodsPolicyCode;

    /**
     * Gets the value of the firstReturnableDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getFirstReturnableDateTime() {
        return firstReturnableDateTime;
    }

    /**
     * Sets the value of the firstReturnableDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstReturnableDateTime(LocalDateTime value) {
        this.firstReturnableDateTime = value;
    }

    /**
     * Gets the value of the isNonSoldTradeItemReturnable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNonSoldTradeItemReturnable() {
        return isNonSoldTradeItemReturnable;
    }

    /**
     * Sets the value of the isNonSoldTradeItemReturnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNonSoldTradeItemReturnable(Boolean value) {
        this.isNonSoldTradeItemReturnable = value;
    }

    /**
     * Gets the value of the lastReturnableDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getLastReturnableDateTime() {
        return lastReturnableDateTime;
    }

    /**
     * Sets the value of the lastReturnableDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastReturnableDateTime(LocalDateTime value) {
        this.lastReturnableDateTime = value;
    }

    /**
     * Gets the value of the orderableReturnableConditionsCode property.
     * 
     * @return
     *     possible object is
     *     {@link OrderableReturnableConditionsCodeType }
     *     
     */
    public OrderableReturnableConditionsCodeType getOrderableReturnableConditionsCode() {
        return orderableReturnableConditionsCode;
    }

    /**
     * Sets the value of the orderableReturnableConditionsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderableReturnableConditionsCodeType }
     *     
     */
    public void setOrderableReturnableConditionsCode(OrderableReturnableConditionsCodeType value) {
        this.orderableReturnableConditionsCode = value;
    }

    /**
     * Gets the value of the returnGoodsPolicyCode property.
     * 
     * @return
     *     possible object is
     *     {@link RightOfReturnForNonSoldTradeItemCodeType }
     *     
     */
    public RightOfReturnForNonSoldTradeItemCodeType getReturnGoodsPolicyCode() {
        return returnGoodsPolicyCode;
    }

    /**
     * Sets the value of the returnGoodsPolicyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RightOfReturnForNonSoldTradeItemCodeType }
     *     
     */
    public void setReturnGoodsPolicyCode(RightOfReturnForNonSoldTradeItemCodeType value) {
        this.returnGoodsPolicyCode = value;
    }

}
