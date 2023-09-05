
package gs1.gdsn.sales_information.xsd._3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import gs1.shared.shared_common.xsd._3.CountryCodeType;
import gs1.shared.shared_common.xsd._3.CountrySubdivisionCodeType;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for SalesConditionTargetMarketCountryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesConditionTargetMarketCountryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="countryCode" type="{urn:gs1:shared:shared_common:xsd:3}CountryCodeType"/&gt;
 *         &lt;element name="countrySubdivisionCode" type="{urn:gs1:shared:shared_common:xsd:3}CountrySubdivisionCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="endAvailabilityDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="startAvailabilityDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesConditionTargetMarketCountryType", propOrder = {
    "countryCode",
    "countrySubdivisionCode",
    "endAvailabilityDateTime",
    "startAvailabilityDateTime"
})
public class SalesConditionTargetMarketCountryType {

    @XmlElement(required = true)
    protected CountryCodeType countryCode;
    protected List<CountrySubdivisionCodeType> countrySubdivisionCode;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime endAvailabilityDateTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime startAvailabilityDateTime;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountryCode(CountryCodeType value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the countrySubdivisionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countrySubdivisionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountrySubdivisionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountrySubdivisionCodeType }
     * 
     * 
     */
    public List<CountrySubdivisionCodeType> getCountrySubdivisionCode() {
        if (countrySubdivisionCode == null) {
            countrySubdivisionCode = new ArrayList<CountrySubdivisionCodeType>();
        }
        return this.countrySubdivisionCode;
    }

    /**
     * Gets the value of the endAvailabilityDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getEndAvailabilityDateTime() {
        return endAvailabilityDateTime;
    }

    /**
     * Sets the value of the endAvailabilityDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndAvailabilityDateTime(LocalDateTime value) {
        this.endAvailabilityDateTime = value;
    }

    /**
     * Gets the value of the startAvailabilityDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getStartAvailabilityDateTime() {
        return startAvailabilityDateTime;
    }

    /**
     * Sets the value of the startAvailabilityDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartAvailabilityDateTime(LocalDateTime value) {
        this.startAvailabilityDateTime = value;
    }

}
