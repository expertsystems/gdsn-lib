
package gs1.gdsn.trade_item_data_carrier_and_identification.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeItemDataCarrierAndIdentificationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemDataCarrierAndIdentificationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gs1TradeItemIdentificationKey" type="{urn:gs1:gdsn:trade_item_data_carrier_and_identification:xsd:3}GS1TradeItemIdentificationKeyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dataCarrier" type="{urn:gs1:gdsn:trade_item_data_carrier_and_identification:xsd:3}DataCarrierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemDataCarrierAndIdentificationModuleType", propOrder = {
    "gs1TradeItemIdentificationKey",
    "dataCarrier"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:trade_item_data_carrier_and_identification:xsd:3")
public class TradeItemDataCarrierAndIdentificationModuleType {

    protected List<GS1TradeItemIdentificationKeyType> gs1TradeItemIdentificationKey;
    protected List<DataCarrierType> dataCarrier;

    /**
     * Gets the value of the gs1TradeItemIdentificationKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gs1TradeItemIdentificationKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGs1TradeItemIdentificationKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GS1TradeItemIdentificationKeyType }
     * 
     * 
     */
    public List<GS1TradeItemIdentificationKeyType> getGs1TradeItemIdentificationKey() {
        if (gs1TradeItemIdentificationKey == null) {
            gs1TradeItemIdentificationKey = new ArrayList<GS1TradeItemIdentificationKeyType>();
        }
        return this.gs1TradeItemIdentificationKey;
    }

    /**
     * Gets the value of the dataCarrier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataCarrier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataCarrier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataCarrierType }
     * 
     * 
     */
    public List<DataCarrierType> getDataCarrier() {
        if (dataCarrier == null) {
            dataCarrier = new ArrayList<DataCarrierType>();
        }
        return this.dataCarrier;
    }

}
