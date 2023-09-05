
package gs1.gdsn.gdsn_common.xsd._3;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for OrganicCertificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganicCertificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organicCertificationIdentification"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="organicCertificationEffectiveEndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="organicCertificationEffectiveStartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganicCertificationType", propOrder = {
    "organicCertificationIdentification",
    "organicCertificationEffectiveEndDateTime",
    "organicCertificationEffectiveStartDateTime"
})
public class OrganicCertificationType {

    @XmlElement(required = true)
    protected String organicCertificationIdentification;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime organicCertificationEffectiveEndDateTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime organicCertificationEffectiveStartDateTime;

    /**
     * Gets the value of the organicCertificationIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganicCertificationIdentification() {
        return organicCertificationIdentification;
    }

    /**
     * Sets the value of the organicCertificationIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganicCertificationIdentification(String value) {
        this.organicCertificationIdentification = value;
    }

    /**
     * Gets the value of the organicCertificationEffectiveEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getOrganicCertificationEffectiveEndDateTime() {
        return organicCertificationEffectiveEndDateTime;
    }

    /**
     * Sets the value of the organicCertificationEffectiveEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganicCertificationEffectiveEndDateTime(LocalDateTime value) {
        this.organicCertificationEffectiveEndDateTime = value;
    }

    /**
     * Gets the value of the organicCertificationEffectiveStartDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getOrganicCertificationEffectiveStartDateTime() {
        return organicCertificationEffectiveStartDateTime;
    }

    /**
     * Sets the value of the organicCertificationEffectiveStartDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganicCertificationEffectiveStartDateTime(LocalDateTime value) {
        this.organicCertificationEffectiveStartDateTime = value;
    }

}
