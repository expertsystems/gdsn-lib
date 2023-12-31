
package gs1.gdsn.sales_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeItemPriceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemPriceInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardPriceGroupIdentifier" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="additionalTradeItemPrice" type="{urn:gs1:gdsn:sales_information:xsd:3}TradeItemPriceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cataloguePrice" type="{urn:gs1:gdsn:sales_information:xsd:3}TradeItemPriceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="suggestedRetailPrice" type="{urn:gs1:gdsn:sales_information:xsd:3}TradeItemPriceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemPriceInformationType", propOrder = {
    "cardPriceGroupIdentifier",
    "additionalTradeItemPrice",
    "cataloguePrice",
    "suggestedRetailPrice"
})
public class TradeItemPriceInformationType {

    protected List<String> cardPriceGroupIdentifier;
    protected List<TradeItemPriceType> additionalTradeItemPrice;
    protected List<TradeItemPriceType> cataloguePrice;
    protected List<TradeItemPriceType> suggestedRetailPrice;

    /**
     * Gets the value of the cardPriceGroupIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardPriceGroupIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardPriceGroupIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCardPriceGroupIdentifier() {
        if (cardPriceGroupIdentifier == null) {
            cardPriceGroupIdentifier = new ArrayList<String>();
        }
        return this.cardPriceGroupIdentifier;
    }

    /**
     * Gets the value of the additionalTradeItemPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalTradeItemPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalTradeItemPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeItemPriceType }
     * 
     * 
     */
    public List<TradeItemPriceType> getAdditionalTradeItemPrice() {
        if (additionalTradeItemPrice == null) {
            additionalTradeItemPrice = new ArrayList<TradeItemPriceType>();
        }
        return this.additionalTradeItemPrice;
    }

    /**
     * Gets the value of the cataloguePrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cataloguePrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCataloguePrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeItemPriceType }
     * 
     * 
     */
    public List<TradeItemPriceType> getCataloguePrice() {
        if (cataloguePrice == null) {
            cataloguePrice = new ArrayList<TradeItemPriceType>();
        }
        return this.cataloguePrice;
    }

    /**
     * Gets the value of the suggestedRetailPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suggestedRetailPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuggestedRetailPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeItemPriceType }
     * 
     * 
     */
    public List<TradeItemPriceType> getSuggestedRetailPrice() {
        if (suggestedRetailPrice == null) {
            suggestedRetailPrice = new ArrayList<TradeItemPriceType>();
        }
        return this.suggestedRetailPrice;
    }

}
