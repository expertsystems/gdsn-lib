
package gs1.gdsn.gdsn_common.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description500Type;


/**
 * <p>Java class for PlaceOfProductActivityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlaceOfProductActivityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="countryOfOriginStatement" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="provenanceStatement" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="countryOfOrigin" type="{urn:gs1:gdsn:gdsn_common:xsd:3}CountryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productActivityDetails" type="{urn:gs1:gdsn:gdsn_common:xsd:3}ProductActivityDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PlaceOfProductActivityType", propOrder = {
    "countryOfOriginStatement",
    "provenanceStatement",
    "countryOfOrigin",
    "productActivityDetails",
    "avpList"
})
public class PlaceOfProductActivityType {

    protected List<Description500Type> countryOfOriginStatement;
    protected List<Description500Type> provenanceStatement;
    protected List<CountryType> countryOfOrigin;
    protected List<ProductActivityDetailsType> productActivityDetails;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the countryOfOriginStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryOfOriginStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryOfOriginStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getCountryOfOriginStatement() {
        if (countryOfOriginStatement == null) {
            countryOfOriginStatement = new ArrayList<Description500Type>();
        }
        return this.countryOfOriginStatement;
    }

    /**
     * Gets the value of the provenanceStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the provenanceStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvenanceStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getProvenanceStatement() {
        if (provenanceStatement == null) {
            provenanceStatement = new ArrayList<Description500Type>();
        }
        return this.provenanceStatement;
    }

    /**
     * Gets the value of the countryOfOrigin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryOfOrigin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryOfOrigin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryType }
     * 
     * 
     */
    public List<CountryType> getCountryOfOrigin() {
        if (countryOfOrigin == null) {
            countryOfOrigin = new ArrayList<CountryType>();
        }
        return this.countryOfOrigin;
    }

    /**
     * Gets the value of the productActivityDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productActivityDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductActivityDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductActivityDetailsType }
     * 
     * 
     */
    public List<ProductActivityDetailsType> getProductActivityDetails() {
        if (productActivityDetails == null) {
            productActivityDetails = new ArrayList<ProductActivityDetailsType>();
        }
        return this.productActivityDetails;
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
