
package gs1.gdsn.gdsn_common.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.catalogue_item_confirmation.xsd._3.CatalogueItemConfirmationType;
import gs1.gdsn.catalogue_item_hierarchical_withdrawal.xsd._3.CatalogueItemHierarchicalWithdrawalType;
import gs1.gdsn.catalogue_item_notification.xsd._3.CatalogueItemNotificationType;
import gs1.gdsn.catalogue_item_publication.xsd._3.CatalogueItemPublicationType;
import gs1.gdsn.catalogue_item_registration_response.xsd._3.CatalogueItemRegistrationResponseType;
import gs1.gdsn.catalogue_item_subscription.xsd._3.CatalogueItemSubscriptionType;
import gs1.gdsn.registry_catalogue_item.xsd._3.RegistryCatalogueItemType;
import gs1.gdsn.request_for_catalogue_item_notification.xsd._3.RequestForCatalogueItemNotificationType;
import gs1.shared.shared_common.xsd._3.DocumentType;


/**
 * <p>Java class for DocumentCommandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentCommandType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documentCommandHeader" type="{urn:gs1:gdsn:gdsn_common:xsd:3}DocumentCommandHeaderType"/&gt;
 *         &lt;element ref="{urn:gs1:gdsn:gdsn_common:xsd:3}document" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentCommandType", propOrder = {
    "documentCommandHeader",
    "document"
})
public class DocumentCommandType {

    @XmlElement(required = true)
    protected DocumentCommandHeaderType documentCommandHeader;
    @XmlElementRef(name = "document", namespace = "urn:gs1:gdsn:gdsn_common:xsd:3", type = JAXBElement.class)
    protected List<JAXBElement<? extends DocumentType>> document;

    /**
     * Gets the value of the documentCommandHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentCommandHeaderType }
     *     
     */
    public DocumentCommandHeaderType getDocumentCommandHeader() {
        return documentCommandHeader;
    }

    /**
     * Sets the value of the documentCommandHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentCommandHeaderType }
     *     
     */
    public void setDocumentCommandHeader(DocumentCommandHeaderType value) {
        this.documentCommandHeader = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CatalogueItemConfirmationType }{@code >}
     * {@link JAXBElement }{@code <}{@link CatalogueItemHierarchicalWithdrawalType }{@code >}
     * {@link JAXBElement }{@code <}{@link CatalogueItemNotificationType }{@code >}
     * {@link JAXBElement }{@code <}{@link CatalogueItemPublicationType }{@code >}
     * {@link JAXBElement }{@code <}{@link CatalogueItemRegistrationResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link CatalogueItemSubscriptionType }{@code >}
     * {@link JAXBElement }{@code <}{@link RegistryCatalogueItemType }{@code >}
     * {@link JAXBElement }{@code <}{@link RequestForCatalogueItemNotificationType }{@code >}
     * {@link JAXBElement }{@code <}{@link DocumentType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends DocumentType>> getDocument() {
        if (document == null) {
            document = new ArrayList<JAXBElement<? extends DocumentType>>();
        }
        return this.document;
    }

}
