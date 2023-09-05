
package gs1.shared.shared_common.xsd._3;

import java.math.BigInteger;
import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import gs1.gdsn.catalogue_item_confirmation.xsd._3.CatalogueItemConfirmationType;
import gs1.gdsn.catalogue_item_hierarchical_withdrawal.xsd._3.CatalogueItemHierarchicalWithdrawalType;
import gs1.gdsn.catalogue_item_notification.xsd._3.CatalogueItemNotificationType;
import gs1.gdsn.catalogue_item_publication.xsd._3.CatalogueItemPublicationType;
import gs1.gdsn.catalogue_item_registration_response.xsd._3.CatalogueItemRegistrationResponseType;
import gs1.gdsn.catalogue_item_subscription.xsd._3.CatalogueItemSubscriptionType;
import gs1.gdsn.registry_catalogue_item.xsd._3.RegistryCatalogueItemType;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for DocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="creationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="documentStatusCode" type="{urn:gs1:shared:shared_common:xsd:3}DocumentStatusEnumerationType"/&gt;
 *         &lt;element name="documentActionCode" type="{urn:gs1:shared:shared_common:xsd:3}DocumentActionEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="documentStructureVersion" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="lastUpdateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="revisionNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{urn:gs1:shared:shared_common:xsd:3}ExtensionType" minOccurs="0"/&gt;
 *         &lt;element name="documentEffectiveDate" type="{urn:gs1:shared:shared_common:xsd:3}DateOptionalTimeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType", propOrder = {
    "creationDateTime",
    "documentStatusCode",
    "documentActionCode",
    "documentStructureVersion",
    "lastUpdateDateTime",
    "revisionNumber",
    "extension",
    "documentEffectiveDate"
})
@XmlSeeAlso({
    CatalogueItemNotificationType.class,
    CatalogueItemConfirmationType.class,
    CatalogueItemHierarchicalWithdrawalType.class,
    CatalogueItemPublicationType.class,
    CatalogueItemRegistrationResponseType.class,
    RegistryCatalogueItemType.class,
    CatalogueItemSubscriptionType.class
})
public abstract class DocumentType {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime creationDateTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DocumentStatusEnumerationType documentStatusCode;
    @XmlSchemaType(name = "string")
    protected DocumentActionEnumerationType documentActionCode;
    protected String documentStructureVersion;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime lastUpdateDateTime;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger revisionNumber;
    protected ExtensionType extension;
    protected DateOptionalTimeType documentEffectiveDate;

    /**
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDateTime(LocalDateTime value) {
        this.creationDateTime = value;
    }

    /**
     * Gets the value of the documentStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentStatusEnumerationType }
     *     
     */
    public DocumentStatusEnumerationType getDocumentStatusCode() {
        return documentStatusCode;
    }

    /**
     * Sets the value of the documentStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentStatusEnumerationType }
     *     
     */
    public void setDocumentStatusCode(DocumentStatusEnumerationType value) {
        this.documentStatusCode = value;
    }

    /**
     * Gets the value of the documentActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentActionEnumerationType }
     *     
     */
    public DocumentActionEnumerationType getDocumentActionCode() {
        return documentActionCode;
    }

    /**
     * Sets the value of the documentActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentActionEnumerationType }
     *     
     */
    public void setDocumentActionCode(DocumentActionEnumerationType value) {
        this.documentActionCode = value;
    }

    /**
     * Gets the value of the documentStructureVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentStructureVersion() {
        return documentStructureVersion;
    }

    /**
     * Sets the value of the documentStructureVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentStructureVersion(String value) {
        this.documentStructureVersion = value;
    }

    /**
     * Gets the value of the lastUpdateDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }

    /**
     * Sets the value of the lastUpdateDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateDateTime(LocalDateTime value) {
        this.lastUpdateDateTime = value;
    }

    /**
     * Gets the value of the revisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRevisionNumber() {
        return revisionNumber;
    }

    /**
     * Sets the value of the revisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRevisionNumber(BigInteger value) {
        this.revisionNumber = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setExtension(ExtensionType value) {
        this.extension = value;
    }

    /**
     * Gets the value of the documentEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateOptionalTimeType }
     *     
     */
    public DateOptionalTimeType getDocumentEffectiveDate() {
        return documentEffectiveDate;
    }

    /**
     * Sets the value of the documentEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOptionalTimeType }
     *     
     */
    public void setDocumentEffectiveDate(DateOptionalTimeType value) {
        this.documentEffectiveDate = value;
    }

}
