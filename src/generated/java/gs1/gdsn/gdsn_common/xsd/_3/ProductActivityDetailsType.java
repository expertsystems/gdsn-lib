
package gs1.gdsn.gdsn_common.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description500Type;


/**
 * <p>Java class for ProductActivityDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductActivityDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productActivityTypeCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}ProductActivityTypeCodeType"/&gt;
 *         &lt;element name="productActivityRegionDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="countryOfActivity" type="{urn:gs1:gdsn:gdsn_common:xsd:3}CountryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productActivityRegionZoneCodeReference" type="{urn:gs1:gdsn:gdsn_common:xsd:3}ExternalCodeValueInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="avpList" type="{urn:gs1:gdsn:gdsn_common:xsd:3}GS1_AttributeValuePairListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductActivityDetailsType", propOrder = {
    "productActivityTypeCode",
    "productActivityRegionDescription",
    "countryOfActivity",
    "productActivityRegionZoneCodeReference",
    "avpList"
})
public class ProductActivityDetailsType {

    @XmlElement(required = true)
    protected ProductActivityTypeCodeType productActivityTypeCode;
    protected List<Description500Type> productActivityRegionDescription;
    protected List<CountryType> countryOfActivity;
    protected List<ExternalCodeValueInformationType> productActivityRegionZoneCodeReference;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the productActivityTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProductActivityTypeCodeType }
     *     
     */
    public ProductActivityTypeCodeType getProductActivityTypeCode() {
        return productActivityTypeCode;
    }

    /**
     * Sets the value of the productActivityTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductActivityTypeCodeType }
     *     
     */
    public void setProductActivityTypeCode(ProductActivityTypeCodeType value) {
        this.productActivityTypeCode = value;
    }

    /**
     * Gets the value of the productActivityRegionDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productActivityRegionDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductActivityRegionDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getProductActivityRegionDescription() {
        if (productActivityRegionDescription == null) {
            productActivityRegionDescription = new ArrayList<Description500Type>();
        }
        return this.productActivityRegionDescription;
    }

    /**
     * Gets the value of the countryOfActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryOfActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryOfActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryType }
     * 
     * 
     */
    public List<CountryType> getCountryOfActivity() {
        if (countryOfActivity == null) {
            countryOfActivity = new ArrayList<CountryType>();
        }
        return this.countryOfActivity;
    }

    /**
     * Gets the value of the productActivityRegionZoneCodeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productActivityRegionZoneCodeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductActivityRegionZoneCodeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalCodeValueInformationType }
     * 
     * 
     */
    public List<ExternalCodeValueInformationType> getProductActivityRegionZoneCodeReference() {
        if (productActivityRegionZoneCodeReference == null) {
            productActivityRegionZoneCodeReference = new ArrayList<ExternalCodeValueInformationType>();
        }
        return this.productActivityRegionZoneCodeReference;
    }

    /**
     * Gets the value of the avpList property.
     * 
     * @return
     *     possible object is
     *     {@link GS1AttributeValuePairListType }
     *     
     */
    public GS1AttributeValuePairListType getAvpList() {
        return avpList;
    }

    /**
     * Sets the value of the avpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GS1AttributeValuePairListType }
     *     
     */
    public void setAvpList(GS1AttributeValuePairListType value) {
        this.avpList = value;
    }

}
