
package gs1.gdsn.catalogue_item_notification.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.trade_item.xsd._3.TradeItemType;


/**
 * <p>Java class for CatalogueItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogueItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataRecipient" type="{urn:gs1:shared:shared_common:xsd:3}GLNType" minOccurs="0"/&gt;
 *         &lt;element name="sourceDataPool" type="{urn:gs1:shared:shared_common:xsd:3}GLNType" minOccurs="0"/&gt;
 *         &lt;element name="catalogueItemState" type="{urn:gs1:gdsn:catalogue_item_notification:xsd:3}CatalogueItemStateType"/&gt;
 *         &lt;element name="tradeItem" type="{urn:gs1:gdsn:trade_item:xsd:3}TradeItemType"/&gt;
 *         &lt;element name="catalogueItemChildItemLink" type="{urn:gs1:gdsn:catalogue_item_notification:xsd:3}CatalogueItemChildItemLinkType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogueItemType", propOrder = {
    "dataRecipient",
    "sourceDataPool",
    "catalogueItemState",
    "tradeItem",
    "catalogueItemChildItemLink"
})
public class CatalogueItemType {

    protected String dataRecipient;
    protected String sourceDataPool;
    @XmlElement(required = true)
    protected CatalogueItemStateType catalogueItemState;
    @XmlElement(required = true)
    protected TradeItemType tradeItem;
    protected List<CatalogueItemChildItemLinkType> catalogueItemChildItemLink;

    /**
     * Gets the value of the dataRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRecipient() {
        return dataRecipient;
    }

    /**
     * Sets the value of the dataRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRecipient(String value) {
        this.dataRecipient = value;
    }

    /**
     * Gets the value of the sourceDataPool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDataPool() {
        return sourceDataPool;
    }

    /**
     * Sets the value of the sourceDataPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDataPool(String value) {
        this.sourceDataPool = value;
    }

    /**
     * Gets the value of the catalogueItemState property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogueItemStateType }
     *     
     */
    public CatalogueItemStateType getCatalogueItemState() {
        return catalogueItemState;
    }

    /**
     * Sets the value of the catalogueItemState property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogueItemStateType }
     *     
     */
    public void setCatalogueItemState(CatalogueItemStateType value) {
        this.catalogueItemState = value;
    }

    /**
     * Gets the value of the tradeItem property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemType }
     *     
     */
    public TradeItemType getTradeItem() {
        return tradeItem;
    }

    /**
     * Sets the value of the tradeItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemType }
     *     
     */
    public void setTradeItem(TradeItemType value) {
        this.tradeItem = value;
    }

    /**
     * Gets the value of the catalogueItemChildItemLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catalogueItemChildItemLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatalogueItemChildItemLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatalogueItemChildItemLinkType }
     * 
     * 
     */
    public List<CatalogueItemChildItemLinkType> getCatalogueItemChildItemLink() {
        if (catalogueItemChildItemLink == null) {
            catalogueItemChildItemLink = new ArrayList<CatalogueItemChildItemLinkType>();
        }
        return this.catalogueItemChildItemLink;
    }

}
