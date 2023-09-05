
package gs1.gdsn.onix_publication_file_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ONIXPublicationSalesRightsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ONIXPublicationSalesRightsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="salesRightsTypeCode" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXSalesRightsTypeCodeType"/&gt;
 *         &lt;element name="salesTerritory"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ONIXPublicationSalesRightsType", propOrder = {
    "salesRightsTypeCode",
    "salesTerritory"
})
public class ONIXPublicationSalesRightsType {

    @XmlElement(required = true)
    protected ONIXSalesRightsTypeCodeType salesRightsTypeCode;
    @XmlElement(required = true)
    protected String salesTerritory;

    /**
     * Gets the value of the salesRightsTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ONIXSalesRightsTypeCodeType }
     *     
     */
    public ONIXSalesRightsTypeCodeType getSalesRightsTypeCode() {
        return salesRightsTypeCode;
    }

    /**
     * Sets the value of the salesRightsTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ONIXSalesRightsTypeCodeType }
     *     
     */
    public void setSalesRightsTypeCode(ONIXSalesRightsTypeCodeType value) {
        this.salesRightsTypeCode = value;
    }

    /**
     * Gets the value of the salesTerritory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesTerritory() {
        return salesTerritory;
    }

    /**
     * Sets the value of the salesTerritory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesTerritory(String value) {
        this.salesTerritory = value;
    }

}
