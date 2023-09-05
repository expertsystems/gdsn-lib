
package gs1.gdsn.gdsn_common.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.EntityIdentificationType;


/**
 * <p>Java class for DocumentCommandHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentCommandHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documentCommandIdentification" type="{urn:gs1:shared:shared_common:xsd:3}EntityIdentificationType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" type="{urn:gs1:gdsn:gdsn_common:xsd:3}DocumentCommandEnumerationType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentCommandHeaderType", propOrder = {
    "documentCommandIdentification"
})
public class DocumentCommandHeaderType {

    @XmlElement(required = true)
    protected EntityIdentificationType documentCommandIdentification;
    @XmlAttribute(name = "type")
    protected DocumentCommandEnumerationType type;

    /**
     * Gets the value of the documentCommandIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdentificationType }
     *     
     */
    public EntityIdentificationType getDocumentCommandIdentification() {
        return documentCommandIdentification;
    }

    /**
     * Sets the value of the documentCommandIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdentificationType }
     *     
     */
    public void setDocumentCommandIdentification(EntityIdentificationType value) {
        this.documentCommandIdentification = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentCommandEnumerationType }
     *     
     */
    public DocumentCommandEnumerationType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentCommandEnumerationType }
     *     
     */
    public void setType(DocumentCommandEnumerationType value) {
        this.type = value;
    }

}
