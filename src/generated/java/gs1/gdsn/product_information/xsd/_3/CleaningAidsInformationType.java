
package gs1.gdsn.product_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CleaningAidsInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CleaningAidsInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="brushBroomTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}BrushBroomTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="cleaningClothTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}CleaningClothTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="householdCleaningProductTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}HouseholdCleaningProductTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="laundryDetergentTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}LaundryDetergentTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="laundryHangingAidTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}LaundryHangingAidTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="spongeScourerTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}SpongeScourerTypeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CleaningAidsInformationType", propOrder = {
    "brushBroomTypeCode",
    "cleaningClothTypeCode",
    "householdCleaningProductTypeCode",
    "laundryDetergentTypeCode",
    "laundryHangingAidTypeCode",
    "spongeScourerTypeCode"
})
public class CleaningAidsInformationType {

    protected BrushBroomTypeCodeType brushBroomTypeCode;
    protected CleaningClothTypeCodeType cleaningClothTypeCode;
    protected HouseholdCleaningProductTypeCodeType householdCleaningProductTypeCode;
    protected List<LaundryDetergentTypeCodeType> laundryDetergentTypeCode;
    protected LaundryHangingAidTypeCodeType laundryHangingAidTypeCode;
    protected SpongeScourerTypeCodeType spongeScourerTypeCode;

    /**
     * Gets the value of the brushBroomTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BrushBroomTypeCodeType }
     *     
     */
    public BrushBroomTypeCodeType getBrushBroomTypeCode() {
        return brushBroomTypeCode;
    }

    /**
     * Sets the value of the brushBroomTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrushBroomTypeCodeType }
     *     
     */
    public void setBrushBroomTypeCode(BrushBroomTypeCodeType value) {
        this.brushBroomTypeCode = value;
    }

    /**
     * Gets the value of the cleaningClothTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CleaningClothTypeCodeType }
     *     
     */
    public CleaningClothTypeCodeType getCleaningClothTypeCode() {
        return cleaningClothTypeCode;
    }

    /**
     * Sets the value of the cleaningClothTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CleaningClothTypeCodeType }
     *     
     */
    public void setCleaningClothTypeCode(CleaningClothTypeCodeType value) {
        this.cleaningClothTypeCode = value;
    }

    /**
     * Gets the value of the householdCleaningProductTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link HouseholdCleaningProductTypeCodeType }
     *     
     */
    public HouseholdCleaningProductTypeCodeType getHouseholdCleaningProductTypeCode() {
        return householdCleaningProductTypeCode;
    }

    /**
     * Sets the value of the householdCleaningProductTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseholdCleaningProductTypeCodeType }
     *     
     */
    public void setHouseholdCleaningProductTypeCode(HouseholdCleaningProductTypeCodeType value) {
        this.householdCleaningProductTypeCode = value;
    }

    /**
     * Gets the value of the laundryDetergentTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the laundryDetergentTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLaundryDetergentTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LaundryDetergentTypeCodeType }
     * 
     * 
     */
    public List<LaundryDetergentTypeCodeType> getLaundryDetergentTypeCode() {
        if (laundryDetergentTypeCode == null) {
            laundryDetergentTypeCode = new ArrayList<LaundryDetergentTypeCodeType>();
        }
        return this.laundryDetergentTypeCode;
    }

    /**
     * Gets the value of the laundryHangingAidTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link LaundryHangingAidTypeCodeType }
     *     
     */
    public LaundryHangingAidTypeCodeType getLaundryHangingAidTypeCode() {
        return laundryHangingAidTypeCode;
    }

    /**
     * Sets the value of the laundryHangingAidTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaundryHangingAidTypeCodeType }
     *     
     */
    public void setLaundryHangingAidTypeCode(LaundryHangingAidTypeCodeType value) {
        this.laundryHangingAidTypeCode = value;
    }

    /**
     * Gets the value of the spongeScourerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link SpongeScourerTypeCodeType }
     *     
     */
    public SpongeScourerTypeCodeType getSpongeScourerTypeCode() {
        return spongeScourerTypeCode;
    }

    /**
     * Sets the value of the spongeScourerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpongeScourerTypeCodeType }
     *     
     */
    public void setSpongeScourerTypeCode(SpongeScourerTypeCodeType value) {
        this.spongeScourerTypeCode = value;
    }

}
