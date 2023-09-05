
package gs1.gdsn.catalogue_item_subscription.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.request_for_catalogue_item_notification.xsd._3.RequestForCatalogueItemNotificationType;
import gs1.shared.shared_common.xsd._3.DocumentType;
import gs1.shared.shared_common.xsd._3.EntityIdentificationType;
import gs1.shared.shared_common.xsd._3.TargetMarketType;


/**
 * <p>Java class for CatalogueItemSubscriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogueItemSubscriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:gs1:shared:shared_common:xsd:3}DocumentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="catalogueItemSubscriptionIdentification" type="{urn:gs1:shared:shared_common:xsd:3}EntityIdentificationType"/&gt;
 *         &lt;element name="dataRecipient" type="{urn:gs1:shared:shared_common:xsd:3}GLNType"/&gt;
 *         &lt;element name="dataSource" type="{urn:gs1:shared:shared_common:xsd:3}GLNType" minOccurs="0"/&gt;
 *         &lt;element name="gpcCategoryCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{8}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gtin" type="{urn:gs1:shared:shared_common:xsd:3}GTINType" minOccurs="0"/&gt;
 *         &lt;element name="recipientDataPool" type="{urn:gs1:shared:shared_common:xsd:3}GLNType" minOccurs="0"/&gt;
 *         &lt;element name="targetMarket" type="{urn:gs1:shared:shared_common:xsd:3}TargetMarketType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogueItemSubscriptionType", propOrder = {
    "catalogueItemSubscriptionIdentification",
    "dataRecipient",
    "dataSource",
    "gpcCategoryCode",
    "gtin",
    "recipientDataPool",
    "targetMarket"
})
@XmlSeeAlso({
    RequestForCatalogueItemNotificationType.class
})
public class CatalogueItemSubscriptionType
    extends DocumentType
{

    @XmlElement(required = true)
    protected EntityIdentificationType catalogueItemSubscriptionIdentification;
    @XmlElement(required = true)
    protected String dataRecipient;
    protected String dataSource;
    protected String gpcCategoryCode;
    protected String gtin;
    protected String recipientDataPool;
    protected TargetMarketType targetMarket;

    /**
     * Gets the value of the catalogueItemSubscriptionIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdentificationType }
     *     
     */
    public EntityIdentificationType getCatalogueItemSubscriptionIdentification() {
        return catalogueItemSubscriptionIdentification;
    }

    /**
     * Sets the value of the catalogueItemSubscriptionIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdentificationType }
     *     
     */
    public void setCatalogueItemSubscriptionIdentification(EntityIdentificationType value) {
        this.catalogueItemSubscriptionIdentification = value;
    }

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
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the gpcCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpcCategoryCode() {
        return gpcCategoryCode;
    }

    /**
     * Sets the value of the gpcCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpcCategoryCode(String value) {
        this.gpcCategoryCode = value;
    }

    /**
     * Gets the value of the gtin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGtin() {
        return gtin;
    }

    /**
     * Sets the value of the gtin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGtin(String value) {
        this.gtin = value;
    }

    /**
     * Gets the value of the recipientDataPool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientDataPool() {
        return recipientDataPool;
    }

    /**
     * Sets the value of the recipientDataPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientDataPool(String value) {
        this.recipientDataPool = value;
    }

    /**
     * Gets the value of the targetMarket property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarketType }
     *     
     */
    public TargetMarketType getTargetMarket() {
        return targetMarket;
    }

    /**
     * Sets the value of the targetMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarketType }
     *     
     */
    public void setTargetMarket(TargetMarketType value) {
        this.targetMarket = value;
    }

}
