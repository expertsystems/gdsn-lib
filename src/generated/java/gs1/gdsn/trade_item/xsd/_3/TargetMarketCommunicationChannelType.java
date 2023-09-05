
package gs1.gdsn.trade_item.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.CommunicationChannelType;
import gs1.shared.shared_common.xsd._3.TargetMarketType;


/**
 * <p>Java class for TargetMarketCommunicationChannelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetMarketCommunicationChannelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="targetMarket" type="{urn:gs1:shared:shared_common:xsd:3}TargetMarketType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="communicationChannel" type="{urn:gs1:shared:shared_common:xsd:3}CommunicationChannelType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetMarketCommunicationChannelType", propOrder = {
    "targetMarket",
    "communicationChannel"
})
public class TargetMarketCommunicationChannelType {

    protected List<TargetMarketType> targetMarket;
    protected List<CommunicationChannelType> communicationChannel;

    /**
     * Gets the value of the targetMarket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetMarket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetMarket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetMarketType }
     * 
     * 
     */
    public List<TargetMarketType> getTargetMarket() {
        if (targetMarket == null) {
            targetMarket = new ArrayList<TargetMarketType>();
        }
        return this.targetMarket;
    }

    /**
     * Gets the value of the communicationChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communicationChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunicationChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationChannelType }
     * 
     * 
     */
    public List<CommunicationChannelType> getCommunicationChannel() {
        if (communicationChannel == null) {
            communicationChannel = new ArrayList<CommunicationChannelType>();
        }
        return this.communicationChannel;
    }

}
