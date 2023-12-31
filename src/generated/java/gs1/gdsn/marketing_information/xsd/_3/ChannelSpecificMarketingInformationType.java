
package gs1.gdsn.marketing_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.FormattedDescription250Type;
import gs1.gdsn.gdsn_common.xsd._3.FormattedDescription4000Type;
import gs1.gdsn.gdsn_common.xsd._3.TradeChannelCodeType;


/**
 * <p>Java class for ChannelSpecificMarketingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChannelSpecificMarketingInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="channelSpecificMarketingMessage" type="{urn:gs1:gdsn:gdsn_common:xsd:3}FormattedDescription4000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="channelSpecificShortMarketingMessage" type="{urn:gs1:gdsn:gdsn_common:xsd:3}FormattedDescription250Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="marketingTradeChannel" type="{urn:gs1:gdsn:gdsn_common:xsd:3}TradeChannelCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelSpecificMarketingInformationType", propOrder = {
    "channelSpecificMarketingMessage",
    "channelSpecificShortMarketingMessage",
    "marketingTradeChannel"
})
public class ChannelSpecificMarketingInformationType {

    protected List<FormattedDescription4000Type> channelSpecificMarketingMessage;
    protected List<FormattedDescription250Type> channelSpecificShortMarketingMessage;
    @XmlElement(required = true)
    protected TradeChannelCodeType marketingTradeChannel;

    /**
     * Gets the value of the channelSpecificMarketingMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelSpecificMarketingMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelSpecificMarketingMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormattedDescription4000Type }
     * 
     * 
     */
    public List<FormattedDescription4000Type> getChannelSpecificMarketingMessage() {
        if (channelSpecificMarketingMessage == null) {
            channelSpecificMarketingMessage = new ArrayList<FormattedDescription4000Type>();
        }
        return this.channelSpecificMarketingMessage;
    }

    /**
     * Gets the value of the channelSpecificShortMarketingMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelSpecificShortMarketingMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelSpecificShortMarketingMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormattedDescription250Type }
     * 
     * 
     */
    public List<FormattedDescription250Type> getChannelSpecificShortMarketingMessage() {
        if (channelSpecificShortMarketingMessage == null) {
            channelSpecificShortMarketingMessage = new ArrayList<FormattedDescription250Type>();
        }
        return this.channelSpecificShortMarketingMessage;
    }

    /**
     * Gets the value of the marketingTradeChannel property.
     * 
     * @return
     *     possible object is
     *     {@link TradeChannelCodeType }
     *     
     */
    public TradeChannelCodeType getMarketingTradeChannel() {
        return marketingTradeChannel;
    }

    /**
     * Sets the value of the marketingTradeChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeChannelCodeType }
     *     
     */
    public void setMarketingTradeChannel(TradeChannelCodeType value) {
        this.marketingTradeChannel = value;
    }

}
