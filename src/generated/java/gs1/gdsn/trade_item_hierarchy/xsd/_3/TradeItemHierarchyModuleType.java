
package gs1.gdsn.trade_item_hierarchy.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeItemHierarchyModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemHierarchyModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeItemHierarchy" type="{urn:gs1:gdsn:trade_item_hierarchy:xsd:3}TradeItemHierarchyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemHierarchyModuleType", propOrder = {
    "tradeItemHierarchy"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:trade_item_hierarchy:xsd:3")
public class TradeItemHierarchyModuleType {

    protected TradeItemHierarchyType tradeItemHierarchy;

    /**
     * Gets the value of the tradeItemHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemHierarchyType }
     *     
     */
    public TradeItemHierarchyType getTradeItemHierarchy() {
        return tradeItemHierarchy;
    }

    /**
     * Sets the value of the tradeItemHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemHierarchyType }
     *     
     */
    public void setTradeItemHierarchy(TradeItemHierarchyType value) {
        this.tradeItemHierarchy = value;
    }

}
