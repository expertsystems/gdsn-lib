
package gs1.gdsn.gdsn_common.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.CountryCodeType;
import gs1.shared.shared_common.xsd._3.CountrySubdivisionCodeType;


/**
 * <p>Java class for CatalogueItemReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogueItemReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataSource" type="{urn:gs1:shared:shared_common:xsd:3}GLNType"/&gt;
 *         &lt;element name="gtin" type="{urn:gs1:shared:shared_common:xsd:3}GTINType"/&gt;
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
@XmlType(name = "CatalogueItemReferenceType", propOrder = {
    "dataSource",
    "gtin",
    "targetMarketCountryCode",
    "targetMarketSubdivisionCode"
})
public class CatalogueItemReferenceType {

    @XmlElement(required = true)
    protected String dataSource;
    @XmlElement(required = true)
    protected String gtin;
    @XmlElement(required = true)
    protected CountryCodeType targetMarketCountryCode;
    protected CountrySubdivisionCodeType targetMarketSubdivisionCode;

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the gtin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGtin() {
        return gtin;
    }

    /**
     * Sets the value of the gtin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGtin(String value) {
        this.gtin = value;
    }

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
