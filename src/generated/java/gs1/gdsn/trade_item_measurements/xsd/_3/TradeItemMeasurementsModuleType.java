
package gs1.gdsn.trade_item_measurements.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeItemMeasurementsModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemMeasurementsModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeItemMeasurements" type="{urn:gs1:gdsn:trade_item_measurements:xsd:3}TradeItemMeasurementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemMeasurementsModuleType", propOrder = {
    "tradeItemMeasurements"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:trade_item_measurements:xsd:3")
public class TradeItemMeasurementsModuleType {

    protected TradeItemMeasurementsType tradeItemMeasurements;

    /**
     * Gets the value of the tradeItemMeasurements property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemMeasurementsType }
     *     
     */
    public TradeItemMeasurementsType getTradeItemMeasurements() {
        return tradeItemMeasurements;
    }

    /**
     * Sets the value of the tradeItemMeasurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemMeasurementsType }
     *     
     */
    public void setTradeItemMeasurements(TradeItemMeasurementsType value) {
        this.tradeItemMeasurements = value;
    }

}
