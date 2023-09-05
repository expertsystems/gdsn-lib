
package gs1.gdsn.dairy_fish_meat_poultry.xsd._3;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for FishCatchDateInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FishCatchDateInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="catchDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateOfCatchProcessTypeCode" type="{urn:gs1:gdsn:dairy_fish_meat_poultry:xsd:3}DateOfCatchProcessTypeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FishCatchDateInformationType", propOrder = {
    "catchDateTime",
    "dateOfCatchProcessTypeCode"
})
public class FishCatchDateInformationType {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime catchDateTime;
    protected DateOfCatchProcessTypeCodeType dateOfCatchProcessTypeCode;

    /**
     * Gets the value of the catchDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getCatchDateTime() {
        return catchDateTime;
    }

    /**
     * Sets the value of the catchDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatchDateTime(LocalDateTime value) {
        this.catchDateTime = value;
    }

    /**
     * Gets the value of the dateOfCatchProcessTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DateOfCatchProcessTypeCodeType }
     *     
     */
    public DateOfCatchProcessTypeCodeType getDateOfCatchProcessTypeCode() {
        return dateOfCatchProcessTypeCode;
    }

    /**
     * Sets the value of the dateOfCatchProcessTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOfCatchProcessTypeCodeType }
     *     
     */
    public void setDateOfCatchProcessTypeCode(DateOfCatchProcessTypeCodeType value) {
        this.dateOfCatchProcessTypeCode = value;
    }

}
