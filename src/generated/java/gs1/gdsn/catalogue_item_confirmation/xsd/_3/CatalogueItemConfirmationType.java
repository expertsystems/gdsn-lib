
package gs1.gdsn.catalogue_item_confirmation.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.CatalogueItemReferenceType;
import gs1.shared.shared_common.xsd._3.DocumentType;
import gs1.shared.shared_common.xsd._3.EntityIdentificationType;


/**
 * <p>Java class for CatalogueItemConfirmationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogueItemConfirmationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:gs1:shared:shared_common:xsd:3}DocumentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="catalogueItemConfirmationIdentification" type="{urn:gs1:shared:shared_common:xsd:3}EntityIdentificationType"/&gt;
 *         &lt;element name="catalogueItemConfirmationState" type="{urn:gs1:gdsn:catalogue_item_confirmation:xsd:3}CatalogueItemConfirmationStateType"/&gt;
 *         &lt;element name="catalogueItemReference" type="{urn:gs1:gdsn:gdsn_common:xsd:3}CatalogueItemReferenceType"/&gt;
 *         &lt;element name="catalogueItemConfirmationStatusDetail" type="{urn:gs1:gdsn:catalogue_item_confirmation:xsd:3}CatalogueItemConfirmationStatusDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogueItemConfirmationType", propOrder = {
    "catalogueItemConfirmationIdentification",
    "catalogueItemConfirmationState",
    "catalogueItemReference",
    "catalogueItemConfirmationStatusDetail"
})
public class CatalogueItemConfirmationType
    extends DocumentType
{

    @XmlElement(required = true)
    protected EntityIdentificationType catalogueItemConfirmationIdentification;
    @XmlElement(required = true)
    protected CatalogueItemConfirmationStateType catalogueItemConfirmationState;
    @XmlElement(required = true)
    protected CatalogueItemReferenceType catalogueItemReference;
    protected List<CatalogueItemConfirmationStatusDetailType> catalogueItemConfirmationStatusDetail;

    /**
     * Gets the value of the catalogueItemConfirmationIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdentificationType }
     *     
     */
    public EntityIdentificationType getCatalogueItemConfirmationIdentification() {
        return catalogueItemConfirmationIdentification;
    }

    /**
     * Sets the value of the catalogueItemConfirmationIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdentificationType }
     *     
     */
    public void setCatalogueItemConfirmationIdentification(EntityIdentificationType value) {
        this.catalogueItemConfirmationIdentification = value;
    }

    /**
     * Gets the value of the catalogueItemConfirmationState property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogueItemConfirmationStateType }
     *     
     */
    public CatalogueItemConfirmationStateType getCatalogueItemConfirmationState() {
        return catalogueItemConfirmationState;
    }

    /**
     * Sets the value of the catalogueItemConfirmationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogueItemConfirmationStateType }
     *     
     */
    public void setCatalogueItemConfirmationState(CatalogueItemConfirmationStateType value) {
        this.catalogueItemConfirmationState = value;
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

    /**
     * Gets the value of the catalogueItemConfirmationStatusDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catalogueItemConfirmationStatusDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatalogueItemConfirmationStatusDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatalogueItemConfirmationStatusDetailType }
     * 
     * 
     */
    public List<CatalogueItemConfirmationStatusDetailType> getCatalogueItemConfirmationStatusDetail() {
        if (catalogueItemConfirmationStatusDetail == null) {
            catalogueItemConfirmationStatusDetail = new ArrayList<CatalogueItemConfirmationStatusDetailType>();
        }
        return this.catalogueItemConfirmationStatusDetail;
    }

}
