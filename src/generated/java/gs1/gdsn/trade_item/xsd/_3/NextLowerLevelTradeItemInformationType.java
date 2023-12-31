
package gs1.gdsn.trade_item.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NextLowerLevelTradeItemInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NextLowerLevelTradeItemInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="quantityOfChildren" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="totalQuantityOfNextLowerLevelTradeItem" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="childTradeItem" type="{urn:gs1:gdsn:trade_item:xsd:3}ChildTradeItemType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NextLowerLevelTradeItemInformationType", propOrder = {
    "quantityOfChildren",
    "totalQuantityOfNextLowerLevelTradeItem",
    "childTradeItem"
})
public class NextLowerLevelTradeItemInformationType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantityOfChildren;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalQuantityOfNextLowerLevelTradeItem;
    @XmlElement(required = true)
    protected List<ChildTradeItemType> childTradeItem;

    /**
     * Gets the value of the quantityOfChildren property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityOfChildren() {
        return quantityOfChildren;
    }

    /**
     * Sets the value of the quantityOfChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityOfChildren(BigInteger value) {
        this.quantityOfChildren = value;
    }

    /**
     * Gets the value of the totalQuantityOfNextLowerLevelTradeItem property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalQuantityOfNextLowerLevelTradeItem() {
        return totalQuantityOfNextLowerLevelTradeItem;
    }

    /**
     * Sets the value of the totalQuantityOfNextLowerLevelTradeItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalQuantityOfNextLowerLevelTradeItem(BigInteger value) {
        this.totalQuantityOfNextLowerLevelTradeItem = value;
    }

    /**
     * Gets the value of the childTradeItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childTradeItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildTradeItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildTradeItemType }
     * 
     * 
     */
    public List<ChildTradeItemType> getChildTradeItem() {
        if (childTradeItem == null) {
            childTradeItem = new ArrayList<ChildTradeItemType>();
        }
        return this.childTradeItem;
    }

}
