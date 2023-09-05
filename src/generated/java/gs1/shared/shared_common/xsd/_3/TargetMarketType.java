
package gs1.shared.shared_common.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetMarketType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetMarketType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="targetMarketCountryCode" type="{urn:gs1:shared:shared_common:xsd:3}CountryCodeType"/&gt;
 *         &lt;element name="targetMarketSubdivisionCode" type="{urn:gs1:shared:shared_common:xsd:3}CountrySubdivisionCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetMarketType", propOrder = {
    "targetMarketCountryCode",
    "targetMarketSubdivisionCode"
})
public class TargetMarketType {

    @XmlElement(required = true)
    protected CountryCodeType targetMarketCountryCode;
    protected CountrySubdivisionCodeType targetMarketSubdivisionCode;

    /**
     * Gets the value of the targetMarketCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getTargetMarketCountryCode() {
        return targetMarketCountryCode;
    }

    /**
     * Sets the value of the targetMarketCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setTargetMarketCountryCode(CountryCodeType value) {
        this.targetMarketCountryCode = value;
    }

    /**
     * Gets the value of the targetMarketSubdivisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubdivisionCodeType }
     *     
     */
    public CountrySubdivisionCodeType getTargetMarketSubdivisionCode() {
        return targetMarketSubdivisionCode;
    }

    /**
     * Sets the value of the targetMarketSubdivisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubdivisionCodeType }
     *     
     */
    public void setTargetMarketSubdivisionCode(CountrySubdivisionCodeType value) {
        this.targetMarketSubdivisionCode = value;
    }

}
