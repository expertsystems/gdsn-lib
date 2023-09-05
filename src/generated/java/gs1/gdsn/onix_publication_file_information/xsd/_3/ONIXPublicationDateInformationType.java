
package gs1.gdsn.onix_publication_file_information.xsd._3;

import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import se.exder.external.gs1.gdsn3p1.Adapter3;


/**
 * <p>Java class for ONIXPublicationDateInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ONIXPublicationDateInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publicationDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="publicationDateTypeCode" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXPublicationDateTypeCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ONIXPublicationDateInformationType", propOrder = {
    "publicationDate",
    "publicationDateTypeCode"
})
public class ONIXPublicationDateInformationType {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate publicationDate;
    @XmlElement(required = true)
    protected ONIXPublicationDateTypeCodeType publicationDateTypeCode;

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationDate(LocalDate value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the publicationDateTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ONIXPublicationDateTypeCodeType }
     *     
     */
    public ONIXPublicationDateTypeCodeType getPublicationDateTypeCode() {
        return publicationDateTypeCode;
    }

    /**
     * Sets the value of the publicationDateTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ONIXPublicationDateTypeCodeType }
     *     
     */
    public void setPublicationDateTypeCode(ONIXPublicationDateTypeCodeType value) {
        this.publicationDateTypeCode = value;
    }

}
