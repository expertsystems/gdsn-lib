
package gs1.gdsn.dairy_fish_meat_poultry.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FishReportingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FishReportingInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="speciesForFisheryStatisticsPurposesCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="speciesForFisheryStatisticsPurposesName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fishSeafoodPresentationCode" type="{urn:gs1:gdsn:dairy_fish_meat_poultry:xsd:3}FishSeafoodPresentationCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fishCatchInformation" type="{urn:gs1:gdsn:dairy_fish_meat_poultry:xsd:3}FishCatchInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FishReportingInformationType", propOrder = {
    "speciesForFisheryStatisticsPurposesCode",
    "speciesForFisheryStatisticsPurposesName",
    "fishSeafoodPresentationCode",
    "fishCatchInformation"
})
public class FishReportingInformationType {

    protected String speciesForFisheryStatisticsPurposesCode;
    protected String speciesForFisheryStatisticsPurposesName;
    protected List<FishSeafoodPresentationCodeType> fishSeafoodPresentationCode;
    protected List<FishCatchInformationType> fishCatchInformation;

    /**
     * Gets the value of the speciesForFisheryStatisticsPurposesCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeciesForFisheryStatisticsPurposesCode() {
        return speciesForFisheryStatisticsPurposesCode;
    }

    /**
     * Sets the value of the speciesForFisheryStatisticsPurposesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeciesForFisheryStatisticsPurposesCode(String value) {
        this.speciesForFisheryStatisticsPurposesCode = value;
    }

    /**
     * Gets the value of the speciesForFisheryStatisticsPurposesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeciesForFisheryStatisticsPurposesName() {
        return speciesForFisheryStatisticsPurposesName;
    }

    /**
     * Sets the value of the speciesForFisheryStatisticsPurposesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeciesForFisheryStatisticsPurposesName(String value) {
        this.speciesForFisheryStatisticsPurposesName = value;
    }

    /**
     * Gets the value of the fishSeafoodPresentationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fishSeafoodPresentationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFishSeafoodPresentationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FishSeafoodPresentationCodeType }
     * 
     * 
     */
    public List<FishSeafoodPresentationCodeType> getFishSeafoodPresentationCode() {
        if (fishSeafoodPresentationCode == null) {
            fishSeafoodPresentationCode = new ArrayList<FishSeafoodPresentationCodeType>();
        }
        return this.fishSeafoodPresentationCode;
    }

    /**
     * Gets the value of the fishCatchInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fishCatchInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFishCatchInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FishCatchInformationType }
     * 
     * 
     */
    public List<FishCatchInformationType> getFishCatchInformation() {
        if (fishCatchInformation == null) {
            fishCatchInformation = new ArrayList<FishCatchInformationType>();
        }
        return this.fishCatchInformation;
    }

}
