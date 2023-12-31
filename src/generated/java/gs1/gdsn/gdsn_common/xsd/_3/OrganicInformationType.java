
package gs1.gdsn.gdsn_common.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganicInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganicInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organicProductPlaceOfFarmingCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}OrganicProductPlaceOfFarmingCodeType" minOccurs="0"/&gt;
 *         &lt;element name="organicClaim" type="{urn:gs1:gdsn:gdsn_common:xsd:3}OrganicClaimType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganicInformationType", propOrder = {
    "organicProductPlaceOfFarmingCode",
    "organicClaim"
})
public class OrganicInformationType {

    protected OrganicProductPlaceOfFarmingCodeType organicProductPlaceOfFarmingCode;
    protected List<OrganicClaimType> organicClaim;

    /**
     * Gets the value of the organicProductPlaceOfFarmingCode property.
     * 
     * @return
     *     possible object is
     *     {@link OrganicProductPlaceOfFarmingCodeType }
     *     
     */
    public OrganicProductPlaceOfFarmingCodeType getOrganicProductPlaceOfFarmingCode() {
        return organicProductPlaceOfFarmingCode;
    }

    /**
     * Sets the value of the organicProductPlaceOfFarmingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganicProductPlaceOfFarmingCodeType }
     *     
     */
    public void setOrganicProductPlaceOfFarmingCode(OrganicProductPlaceOfFarmingCodeType value) {
        this.organicProductPlaceOfFarmingCode = value;
    }

    /**
     * Gets the value of the organicClaim property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organicClaim property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganicClaim().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganicClaimType }
     * 
     * 
     */
    public List<OrganicClaimType> getOrganicClaim() {
        if (organicClaim == null) {
            organicClaim = new ArrayList<OrganicClaimType>();
        }
        return this.organicClaim;
    }

}
