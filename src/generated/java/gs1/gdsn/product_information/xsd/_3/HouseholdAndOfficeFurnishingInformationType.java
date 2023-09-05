
package gs1.gdsn.product_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HouseholdAndOfficeFurnishingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HouseholdAndOfficeFurnishingInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cleaningAidsInformation" type="{urn:gs1:gdsn:product_information:xsd:3}CleaningAidsInformationType" minOccurs="0"/&gt;
 *         &lt;element name="householdOfficeFurnishing" type="{urn:gs1:gdsn:product_information:xsd:3}HouseholdOfficeFurnishingType" minOccurs="0"/&gt;
 *         &lt;element name="linenInformation" type="{urn:gs1:gdsn:product_information:xsd:3}LinenInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseholdAndOfficeFurnishingInformationType", propOrder = {
    "cleaningAidsInformation",
    "householdOfficeFurnishing",
    "linenInformation"
})
public class HouseholdAndOfficeFurnishingInformationType {

    protected CleaningAidsInformationType cleaningAidsInformation;
    protected HouseholdOfficeFurnishingType householdOfficeFurnishing;
    protected LinenInformationType linenInformation;

    /**
     * Gets the value of the cleaningAidsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CleaningAidsInformationType }
     *     
     */
    public CleaningAidsInformationType getCleaningAidsInformation() {
        return cleaningAidsInformation;
    }

    /**
     * Sets the value of the cleaningAidsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CleaningAidsInformationType }
     *     
     */
    public void setCleaningAidsInformation(CleaningAidsInformationType value) {
        this.cleaningAidsInformation = value;
    }

    /**
     * Gets the value of the householdOfficeFurnishing property.
     * 
     * @return
     *     possible object is
     *     {@link HouseholdOfficeFurnishingType }
     *     
     */
    public HouseholdOfficeFurnishingType getHouseholdOfficeFurnishing() {
        return householdOfficeFurnishing;
    }

    /**
     * Sets the value of the householdOfficeFurnishing property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseholdOfficeFurnishingType }
     *     
     */
    public void setHouseholdOfficeFurnishing(HouseholdOfficeFurnishingType value) {
        this.householdOfficeFurnishing = value;
    }

    /**
     * Gets the value of the linenInformation property.
     * 
     * @return
     *     possible object is
     *     {@link LinenInformationType }
     *     
     */
    public LinenInformationType getLinenInformation() {
        return linenInformation;
    }

    /**
     * Sets the value of the linenInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinenInformationType }
     *     
     */
    public void setLinenInformation(LinenInformationType value) {
        this.linenInformation = value;
    }

}
