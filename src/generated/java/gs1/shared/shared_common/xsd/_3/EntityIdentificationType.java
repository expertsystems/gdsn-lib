
package gs1.shared.shared_common.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entityIdentification"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="contentOwner" type="{urn:gs1:shared:shared_common:xsd:3}PartyIdentificationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityIdentificationType", propOrder = {
    "entityIdentification",
    "contentOwner"
})
@XmlSeeAlso({
    DocumentReferenceType.class,
    TypedEntityIdentificationType.class
})
public class EntityIdentificationType {

    @XmlElement(required = true)
    protected String entityIdentification;
    protected PartyIdentificationType contentOwner;

    /**
     * Gets the value of the entityIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityIdentification() {
        return entityIdentification;
    }

    /**
     * Sets the value of the entityIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityIdentification(String value) {
        this.entityIdentification = value;
    }

    /**
     * Gets the value of the contentOwner property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationType }
     *     
     */
    public PartyIdentificationType getContentOwner() {
        return contentOwner;
    }

    /**
     * Sets the value of the contentOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationType }
     *     
     */
    public void setContentOwner(PartyIdentificationType value) {
        this.contentOwner = value;
    }

}
