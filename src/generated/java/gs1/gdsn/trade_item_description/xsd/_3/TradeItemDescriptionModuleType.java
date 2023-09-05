
package gs1.gdsn.trade_item_description.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeItemDescriptionModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemDescriptionModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeItemDescriptionInformation" type="{urn:gs1:gdsn:trade_item_description:xsd:3}TradeItemDescriptionInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemDescriptionModuleType", propOrder = {
    "tradeItemDescriptionInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:trade_item_description:xsd:3")
public class TradeItemDescriptionModuleType {

    protected TradeItemDescriptionInformationType tradeItemDescriptionInformation;

    /**
     * Gets the value of the tradeItemDescriptionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemDescriptionInformationType }
     *     
     */
    public TradeItemDescriptionInformationType getTradeItemDescriptionInformation() {
        return tradeItemDescriptionInformation;
    }

    /**
     * Sets the value of the tradeItemDescriptionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemDescriptionInformationType }
     *     
     */
    public void setTradeItemDescriptionInformation(TradeItemDescriptionInformationType value) {
        this.tradeItemDescriptionInformation = value;
    }

}
