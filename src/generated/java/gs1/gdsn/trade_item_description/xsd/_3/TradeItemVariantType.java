
package gs1.gdsn.trade_item_description.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description1000Type;
import gs1.shared.shared_common.xsd._3.Description500Type;


/**
 * <p>Java class for TradeItemVariantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemVariantType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeItemVariantTypeCode" type="{urn:gs1:gdsn:trade_item_description:xsd:3}TradeItemVariantTypeCodeType"/&gt;
 *         &lt;element name="tradeItemVariantValue" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="tradeItemVariantStatement" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemVariantType", propOrder = {
    "tradeItemVariantTypeCode",
    "tradeItemVariantValue",
    "tradeItemVariantStatement"
})
public class TradeItemVariantType {

    @XmlElement(required = true)
    protected TradeItemVariantTypeCodeType tradeItemVariantTypeCode;
    @XmlElement(required = true)
    protected List<Description500Type> tradeItemVariantValue;
    protected List<Description1000Type> tradeItemVariantStatement;

    /**
     * Gets the value of the tradeItemVariantTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemVariantTypeCodeType }
     *     
     */
    public TradeItemVariantTypeCodeType getTradeItemVariantTypeCode() {
        return tradeItemVariantTypeCode;
    }

    /**
     * Sets the value of the tradeItemVariantTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemVariantTypeCodeType }
     *     
     */
    public void setTradeItemVariantTypeCode(TradeItemVariantTypeCodeType value) {
        this.tradeItemVariantTypeCode = value;
    }

    /**
     * Gets the value of the tradeItemVariantValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemVariantValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemVariantValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getTradeItemVariantValue() {
        if (tradeItemVariantValue == null) {
            tradeItemVariantValue = new ArrayList<Description500Type>();
        }
        return this.tradeItemVariantValue;
    }

    /**
     * Gets the value of the tradeItemVariantStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemVariantStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemVariantStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getTradeItemVariantStatement() {
        if (tradeItemVariantStatement == null) {
            tradeItemVariantStatement = new ArrayList<Description1000Type>();
        }
        return this.tradeItemVariantStatement;
    }

}
