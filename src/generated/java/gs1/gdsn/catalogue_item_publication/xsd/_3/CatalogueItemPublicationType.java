
package gs1.gdsn.catalogue_item_publication.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.CatalogueItemReferenceType;
import gs1.gdsn.gdsn_common.xsd._3.TradeItemContextCodeType;
import gs1.shared.shared_common.xsd._3.DocumentType;
import gs1.shared.shared_common.xsd._3.EntityIdentificationType;
import gs1.shared.shared_common.xsd._3.TargetMarketType;


/**
 * <p>Java class for CatalogueItemPublicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogueItemPublicationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:gs1:shared:shared_common:xsd:3}DocumentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="catalogueItemPublicationIdentification" type="{urn:gs1:shared:shared_common:xsd:3}EntityIdentificationType"/&gt;
 *         &lt;element name="businessContextIdentification" type="{urn:gs1:gdsn:gdsn_common:xsd:3}TradeItemContextCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="publishToGLN" type="{urn:gs1:shared:shared_common:xsd:3}GLNType"/&gt;
 *           &lt;element name="publishToTargetMarket" type="{urn:gs1:shared:shared_common:xsd:3}TargetMarketType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="catalogueItemReference" type="{urn:gs1:gdsn:gdsn_common:xsd:3}CatalogueItemReferenceType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogueItemPublicationType", propOrder = {
    "catalogueItemPublicationIdentification",
    "businessContextIdentification",
    "publishToGLN",
    "publishToTargetMarket",
    "catalogueItemReference"
})
public class CatalogueItemPublicationType
    extends DocumentType
{

    @XmlElement(required = true)
    protected EntityIdentificationType catalogueItemPublicationIdentification;
    protected List<TradeItemContextCodeType> businessContextIdentification;
    protected String publishToGLN;
    protected TargetMarketType publishToTargetMarket;
    @XmlElement(required = true)
    protected CatalogueItemReferenceType catalogueItemReference;

    /**
     * Gets the value of the catalogueItemPublicationIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdentificationType }
     *     
     */
    public EntityIdentificationType getCatalogueItemPublicationIdentification() {
        return catalogueItemPublicationIdentification;
    }

    /**
     * Sets the value of the catalogueItemPublicationIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdentificationType }
     *     
     */
    public void setCatalogueItemPublicationIdentification(EntityIdentificationType value) {
        this.catalogueItemPublicationIdentification = value;
    }

    /**
     * Gets the value of the businessContextIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessContextIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessContextIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeItemContextCodeType }
     * 
     * 
     */
    public List<TradeItemContextCodeType> getBusinessContextIdentification() {
        if (businessContextIdentification == null) {
            businessContextIdentification = new ArrayList<TradeItemContextCodeType>();
        }
        return this.businessContextIdentification;
    }

    /**
     * Gets the value of the publishToGLN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishToGLN() {
        return publishToGLN;
    }

    /**
     * Sets the value of the publishToGLN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishToGLN(String value) {
        this.publishToGLN = value;
    }

    /**
     * Gets the value of the publishToTargetMarket property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarketType }
     *     
     */
    public TargetMarketType getPublishToTargetMarket() {
        return publishToTargetMarket;
    }

    /**
     * Sets the value of the publishToTargetMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarketType }
     *     
     */
    public void setPublishToTargetMarket(TargetMarketType value) {
        this.publishToTargetMarket = value;
    }

    /**
     * Gets the value of the catalogueItemReference property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogueItemReferenceType }
     *     
     */
    public CatalogueItemReferenceType getCatalogueItemReference() {
        return catalogueItemReference;
    }

    /**
     * Sets the value of the catalogueItemReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogueItemReferenceType }
     *     
     */
    public void setCatalogueItemReference(CatalogueItemReferenceType value) {
        this.catalogueItemReference = value;
    }

}
