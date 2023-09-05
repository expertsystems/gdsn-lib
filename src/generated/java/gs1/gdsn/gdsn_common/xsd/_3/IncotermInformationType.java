
package gs1.gdsn.gdsn_common.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.CountryCodeType;
import gs1.shared.shared_common.xsd._3.IncotermsCodeType;


/**
 * <p>Java class for IncotermInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncotermInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="incotermCode" type="{urn:gs1:shared:shared_common:xsd:3}IncotermsCodeType"/&gt;
 *         &lt;element name="incotermCodeLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="incotermCountryCode" type="{urn:gs1:shared:shared_common:xsd:3}CountryCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncotermInformationType", propOrder = {
    "incotermCode",
    "incotermCodeLocation",
    "incotermCountryCode"
})
public class IncotermInformationType {

    @XmlElement(required = true)
    protected IncotermsCodeType incotermCode;
    protected String incotermCodeLocation;
    protected CountryCodeType incotermCountryCode;

    /**
     * Gets the value of the incotermCode property.
     * 
     * @return
     *     possible object is
     *     {@link IncotermsCodeType }
     *     
     */
    public IncotermsCodeType getIncotermCode() {
        return incotermCode;
    }

    /**
     * Sets the value of the incotermCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncotermsCodeType }
     *     
     */
    public void setIncotermCode(IncotermsCodeType value) {
        this.incotermCode = value;
    }

    /**
     * Gets the value of the incotermCodeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncotermCodeLocation() {
        return incotermCodeLocation;
    }

    /**
     * Sets the value of the incotermCodeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncotermCodeLocation(String value) {
        this.incotermCodeLocation = value;
    }

    /**
     * Gets the value of the incotermCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getIncotermCountryCode() {
        return incotermCountryCode;
    }

    /**
     * Sets the value of the incotermCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setIncotermCountryCode(CountryCodeType value) {
        this.incotermCountryCode = value;
    }

}
