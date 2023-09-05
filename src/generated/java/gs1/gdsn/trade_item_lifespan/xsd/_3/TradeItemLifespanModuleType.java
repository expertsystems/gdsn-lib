
package gs1.gdsn.trade_item_lifespan.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeItemLifespanModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemLifespanModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeItemLifespan" type="{urn:gs1:gdsn:trade_item_lifespan:xsd:3}TradeItemLifespanType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemLifespanModuleType", propOrder = {
    "tradeItemLifespan"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:trade_item_lifespan:xsd:3")
public class TradeItemLifespanModuleType {

    protected TradeItemLifespanType tradeItemLifespan;

    /**
     * Gets the value of the tradeItemLifespan property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemLifespanType }
     *     
     */
    public TradeItemLifespanType getTradeItemLifespan() {
        return tradeItemLifespan;
    }

    /**
     * Sets the value of the tradeItemLifespan property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemLifespanType }
     *     
     */
    public void setTradeItemLifespan(TradeItemLifespanType value) {
        this.tradeItemLifespan = value;
    }

}
