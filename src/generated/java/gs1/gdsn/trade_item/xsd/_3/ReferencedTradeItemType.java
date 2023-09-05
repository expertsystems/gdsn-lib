
package gs1.gdsn.trade_item.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.ReferencedTradeItemTypeCodeType;
import gs1.shared.shared_common.xsd._3.TradeItemIdentificationType;


/**
 * <p>Java class for ReferencedTradeItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferencedTradeItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:gs1:shared:shared_common:xsd:3}TradeItemIdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referencedTradeItemTypeCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}ReferencedTradeItemTypeCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencedTradeItemType", propOrder = {
    "referencedTradeItemTypeCode"
})
public class ReferencedTradeItemType
    extends TradeItemIdentificationType
{

    @XmlElement(required = true)
    protected ReferencedTradeItemTypeCodeType referencedTradeItemTypeCode;

    /**
     * Gets the value of the referencedTradeItemTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencedTradeItemTypeCodeType }
     *     
     */
    public ReferencedTradeItemTypeCodeType getReferencedTradeItemTypeCode() {
        return referencedTradeItemTypeCode;
    }

    /**
     * Sets the value of the referencedTradeItemTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencedTradeItemTypeCodeType }
     *     
     */
    public void setReferencedTradeItemTypeCode(ReferencedTradeItemTypeCodeType value) {
        this.referencedTradeItemTypeCode = value;
    }

}
