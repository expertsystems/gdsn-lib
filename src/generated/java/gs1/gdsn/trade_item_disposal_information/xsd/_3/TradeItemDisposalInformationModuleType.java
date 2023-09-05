
package gs1.gdsn.trade_item_disposal_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;


/**
 * <p>Java class for TradeItemDisposalInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemDisposalInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeItemDisposalInformation" type="{urn:gs1:gdsn:trade_item_disposal_information:xsd:3}TradeItemDisposalInformationType" minOccurs="0"/&gt;
 *         &lt;element name="avpList" type="{urn:gs1:gdsn:gdsn_common:xsd:3}GS1_AttributeValuePairListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemDisposalInformationModuleType", propOrder = {
    "tradeItemDisposalInformation",
    "avpList"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:trade_item_disposal_information:xsd:3")
public class TradeItemDisposalInformationModuleType {

    protected TradeItemDisposalInformationType tradeItemDisposalInformation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the tradeItemDisposalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemDisposalInformationType }
     *     
     */
    public TradeItemDisposalInformationType getTradeItemDisposalInformation() {
        return tradeItemDisposalInformation;
    }

    /**
     * Sets the value of the tradeItemDisposalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemDisposalInformationType }
     *     
     */
    public void setTradeItemDisposalInformation(TradeItemDisposalInformationType value) {
        this.tradeItemDisposalInformation = value;
    }

    /**
     * Gets the value of the avpList property.
     * 
     * @return
     *     possible object is
     *     {@link GS1AttributeValuePairListType }
     *     
     */
    public GS1AttributeValuePairListType getAvpList() {
        return avpList;
    }

    /**
     * Sets the value of the avpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GS1AttributeValuePairListType }
     *     
     */
    public void setAvpList(GS1AttributeValuePairListType value) {
        this.avpList = value;
    }

}
