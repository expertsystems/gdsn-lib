
package gs1.gdsn.onix_publication_file_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ONIXContributorPlaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ONIXContributorPlaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contributorPlaceCountry"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="contributorPlaceRegion" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="contributorPlaceTypeCode" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXContributorPlaceTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ONIXContributorPlaceType", propOrder = {
    "contributorPlaceCountry",
    "contributorPlaceRegion",
    "contributorPlaceTypeCode"
})
public class ONIXContributorPlaceType {

    @XmlElement(required = true)
    protected String contributorPlaceCountry;
    protected String contributorPlaceRegion;
    protected List<ONIXContributorPlaceTypeCodeType> contributorPlaceTypeCode;

    /**
     * Gets the value of the contributorPlaceCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContributorPlaceCountry() {
        return contributorPlaceCountry;
    }

    /**
     * Sets the value of the contributorPlaceCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContributorPlaceCountry(String value) {
        this.contributorPlaceCountry = value;
    }

    /**
     * Gets the value of the contributorPlaceRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContributorPlaceRegion() {
        return contributorPlaceRegion;
    }

    /**
     * Sets the value of the contributorPlaceRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContributorPlaceRegion(String value) {
        this.contributorPlaceRegion = value;
    }

    /**
     * Gets the value of the contributorPlaceTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contributorPlaceTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContributorPlaceTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXContributorPlaceTypeCodeType }
     * 
     * 
     */
    public List<ONIXContributorPlaceTypeCodeType> getContributorPlaceTypeCode() {
        if (contributorPlaceTypeCode == null) {
            contributorPlaceTypeCode = new ArrayList<ONIXContributorPlaceTypeCodeType>();
        }
        return this.contributorPlaceTypeCode;
    }

}
