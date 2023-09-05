
package gs1.gdsn.catalogue_item_registration_response.xsd._3;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import gs1.gdsn.gdsn_common.xsd._3.CatalogueItemReferenceType;
import gs1.shared.shared_common.xsd._3.DocumentType;
import gs1.shared.shared_common.xsd._3.EntityIdentificationType;
import gs1.shared.shared_common.xsd._3.ResponseStatusEnumerationType;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for CatalogueItemRegistrationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogueItemRegistrationResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:gs1:shared:shared_common:xsd:3}DocumentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="catalogueItemRegistrationResponseIdentification" type="{urn:gs1:shared:shared_common:xsd:3}EntityIdentificationType"/&gt;
 *         &lt;element name="lastChangedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="registrationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="responseStatus" type="{urn:gs1:shared:shared_common:xsd:3}ResponseStatusEnumerationType"/&gt;
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
@XmlType(name = "CatalogueItemRegistrationResponseType", propOrder = {
    "catalogueItemRegistrationResponseIdentification",
    "lastChangedDateTime",
    "registrationDateTime",
    "responseStatus",
    "catalogueItemReference"
})
public class CatalogueItemRegistrationResponseType
    extends DocumentType
{

    @XmlElement(required = true)
    protected EntityIdentificationType catalogueItemRegistrationResponseIdentification;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime lastChangedDateTime;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime registrationDateTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ResponseStatusEnumerationType responseStatus;
    @XmlElement(required = true)
    protected CatalogueItemReferenceType catalogueItemReference;

    /**
     * Gets the value of the catalogueItemRegistrationResponseIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdentificationType }
     *     
     */
    public EntityIdentificationType getCatalogueItemRegistrationResponseIdentification() {
        return catalogueItemRegistrationResponseIdentification;
    }

    /**
     * Sets the value of the catalogueItemRegistrationResponseIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdentificationType }
     *     
     */
    public void setCatalogueItemRegistrationResponseIdentification(EntityIdentificationType value) {
        this.catalogueItemRegistrationResponseIdentification = value;
    }

    /**
     * Gets the value of the lastChangedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getLastChangedDateTime() {
        return lastChangedDateTime;
    }

    /**
     * Sets the value of the lastChangedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastChangedDateTime(LocalDateTime value) {
        this.lastChangedDateTime = value;
    }

    /**
     * Gets the value of the registrationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getRegistrationDateTime() {
        return registrationDateTime;
    }

    /**
     * Sets the value of the registrationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationDateTime(LocalDateTime value) {
        this.registrationDateTime = value;
    }

    /**
     * Gets the value of the responseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatusEnumerationType }
     *     
     */
    public ResponseStatusEnumerationType getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatusEnumerationType }
     *     
     */
    public void setResponseStatus(ResponseStatusEnumerationType value) {
        this.responseStatus = value;
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
