
package gs1.gdsn.catalogue_item_confirmation.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.CatalogueItemReferenceType;


/**
 * <p>Java class for CatalogueItemConfirmationStatusDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogueItemConfirmationStatusDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="confirmationStatusCatalogueItem" type="{urn:gs1:gdsn:gdsn_common:xsd:3}CatalogueItemReferenceType"/&gt;
 *         &lt;element name="catalogueItemConfirmationStatus" type="{urn:gs1:gdsn:catalogue_item_confirmation:xsd:3}CatalogueItemConfirmationStatusType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogueItemConfirmationStatusDetailType", propOrder = {
    "confirmationStatusCatalogueItem",
    "catalogueItemConfirmationStatus"
})
public class CatalogueItemConfirmationStatusDetailType {

    @XmlElement(required = true)
    protected CatalogueItemReferenceType confirmationStatusCatalogueItem;
    @XmlElement(required = true)
    protected List<CatalogueItemConfirmationStatusType> catalogueItemConfirmationStatus;

    /**
     * Gets the value of the confirmationStatusCatalogueItem property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogueItemReferenceType }
     *     
     */
    public CatalogueItemReferenceType getConfirmationStatusCatalogueItem() {
        return confirmationStatusCatalogueItem;
    }

    /**
     * Sets the value of the confirmationStatusCatalogueItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogueItemReferenceType }
     *     
     */
    public void setConfirmationStatusCatalogueItem(CatalogueItemReferenceType value) {
        this.confirmationStatusCatalogueItem = value;
    }

    /**
     * Gets the value of the catalogueItemConfirmationStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catalogueItemConfirmationStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatalogueItemConfirmationStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatalogueItemConfirmationStatusType }
     * 
     * 
     */
    public List<CatalogueItemConfirmationStatusType> getCatalogueItemConfirmationStatus() {
        if (catalogueItemConfirmationStatus == null) {
            catalogueItemConfirmationStatus = new ArrayList<CatalogueItemConfirmationStatusType>();
        }
        return this.catalogueItemConfirmationStatus;
    }

}
