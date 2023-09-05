
package gs1.gdsn.trade_item.xsd._3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.TradeItemIdentificationType;


/**
 * <p>Java class for ChildTradeItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChildTradeItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:gs1:shared:shared_common:xsd:3}TradeItemIdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="quantityOfNextLowerLevelTradeItem" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChildTradeItemType", propOrder = {
    "quantityOfNextLowerLevelTradeItem"
})
public class ChildTradeItemType
    extends TradeItemIdentificationType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantityOfNextLowerLevelTradeItem;

    /**
     * Gets the value of the quantityOfNextLowerLevelTradeItem property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityOfNextLowerLevelTradeItem() {
        return quantityOfNextLowerLevelTradeItem;
    }

    /**
     * Sets the value of the quantityOfNextLowerLevelTradeItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityOfNextLowerLevelTradeItem(BigInteger value) {
        this.quantityOfNextLowerLevelTradeItem = value;
    }

}
