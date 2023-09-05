
package gs1.gdsn.trade_item_handling.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeItemHandlingModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemHandlingModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeItemHandlingInformation" type="{urn:gs1:gdsn:trade_item_handling:xsd:3}TradeItemHandlingInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemHandlingModuleType", propOrder = {
    "tradeItemHandlingInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:trade_item_handling:xsd:3")
public class TradeItemHandlingModuleType {

    protected TradeItemHandlingInformationType tradeItemHandlingInformation;

    /**
     * Gets the value of the tradeItemHandlingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemHandlingInformationType }
     *     
     */
    public TradeItemHandlingInformationType getTradeItemHandlingInformation() {
        return tradeItemHandlingInformation;
    }

    /**
     * Sets the value of the tradeItemHandlingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemHandlingInformationType }
     *     
     */
    public void setTradeItemHandlingInformation(TradeItemHandlingInformationType value) {
        this.tradeItemHandlingInformation = value;
    }

}
