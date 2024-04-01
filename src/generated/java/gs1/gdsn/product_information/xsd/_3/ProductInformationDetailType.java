
package gs1.gdsn.product_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description5000Type;


/**
 * <p>Java class for ProductInformationDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInformationDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="formationTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}FormationTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="timeOfApplicationCode" type="{urn:gs1:gdsn:product_information:xsd:3}TimeOfApplicationCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dispenserTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}DispenserTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="seamsCode" type="{urn:gs1:gdsn:product_information:xsd:3}SeamsCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sportCode" type="{urn:gs1:gdsn:product_information:xsd:3}SportCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="targetSurfaceTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}TargetSurfaceTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="claimDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="apparelInformationDetail" type="{urn:gs1:gdsn:product_information:xsd:3}ApparelInformationDetailType" minOccurs="0"/&gt;
 *         &lt;element name="beautyPersonalCareHygieneDetail" type="{urn:gs1:gdsn:product_information:xsd:3}BeautyPersonalCareHygieneDetailType" minOccurs="0"/&gt;
 *         &lt;element name="householdAndOfficeFurnishingInformation" type="{urn:gs1:gdsn:product_information:xsd:3}HouseholdAndOfficeFurnishingInformationType" minOccurs="0"/&gt;
 *         &lt;element name="claimDetail" type="{urn:gs1:gdsn:product_information:xsd:3}ClaimDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="terpeneInformation" type="{urn:gs1:gdsn:product_information:xsd:3}TerpeneInformationType" minOccurs="0"/&gt;
 *         &lt;element name="tobaccoCannabisInformation" type="{urn:gs1:gdsn:product_information:xsd:3}TobaccoCannabisInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductInformationDetailType", propOrder = {
    "formationTypeCode",
    "timeOfApplicationCode",
    "dispenserTypeCode",
    "seamsCode",
    "sportCode",
    "targetSurfaceTypeCode",
    "claimDescription",
    "apparelInformationDetail",
    "beautyPersonalCareHygieneDetail",
    "householdAndOfficeFurnishingInformation",
    "claimDetail",
    "terpeneInformation",
    "tobaccoCannabisInformation"
})
public class ProductInformationDetailType {

    protected List<FormationTypeCodeType> formationTypeCode;
    protected List<TimeOfApplicationCodeType> timeOfApplicationCode;
    protected DispenserTypeCodeType dispenserTypeCode;
    protected List<SeamsCodeType> seamsCode;
    protected List<SportCodeType> sportCode;
    protected List<TargetSurfaceTypeCodeType> targetSurfaceTypeCode;
    protected List<Description5000Type> claimDescription;
    protected ApparelInformationDetailType apparelInformationDetail;
    protected BeautyPersonalCareHygieneDetailType beautyPersonalCareHygieneDetail;
    protected HouseholdAndOfficeFurnishingInformationType householdAndOfficeFurnishingInformation;
    protected List<ClaimDetailType> claimDetail;
    protected TerpeneInformationType terpeneInformation;
    protected List<TobaccoCannabisInformationType> tobaccoCannabisInformation;

    /**
     * Gets the value of the formationTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formationTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormationTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormationTypeCodeType }
     * 
     * 
     */
    public List<FormationTypeCodeType> getFormationTypeCode() {
        if (formationTypeCode == null) {
            formationTypeCode = new ArrayList<FormationTypeCodeType>();
        }
        return this.formationTypeCode;
    }

    /**
     * Gets the value of the timeOfApplicationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeOfApplicationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeOfApplicationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeOfApplicationCodeType }
     * 
     * 
     */
    public List<TimeOfApplicationCodeType> getTimeOfApplicationCode() {
        if (timeOfApplicationCode == null) {
            timeOfApplicationCode = new ArrayList<TimeOfApplicationCodeType>();
        }
        return this.timeOfApplicationCode;
    }

    /**
     * Gets the value of the dispenserTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DispenserTypeCodeType }
     *     
     */
    public DispenserTypeCodeType getDispenserTypeCode() {
        return dispenserTypeCode;
    }

    /**
     * Sets the value of the dispenserTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DispenserTypeCodeType }
     *     
     */
    public void setDispenserTypeCode(DispenserTypeCodeType value) {
        this.dispenserTypeCode = value;
    }

    /**
     * Gets the value of the seamsCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seamsCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeamsCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeamsCodeType }
     * 
     * 
     */
    public List<SeamsCodeType> getSeamsCode() {
        if (seamsCode == null) {
            seamsCode = new ArrayList<SeamsCodeType>();
        }
        return this.seamsCode;
    }

    /**
     * Gets the value of the sportCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sportCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSportCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SportCodeType }
     * 
     * 
     */
    public List<SportCodeType> getSportCode() {
        if (sportCode == null) {
            sportCode = new ArrayList<SportCodeType>();
        }
        return this.sportCode;
    }

    /**
     * Gets the value of the targetSurfaceTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetSurfaceTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetSurfaceTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetSurfaceTypeCodeType }
     * 
     * 
     */
    public List<TargetSurfaceTypeCodeType> getTargetSurfaceTypeCode() {
        if (targetSurfaceTypeCode == null) {
            targetSurfaceTypeCode = new ArrayList<TargetSurfaceTypeCodeType>();
        }
        return this.targetSurfaceTypeCode;
    }

    /**
     * Gets the value of the claimDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claimDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getClaimDescription() {
        if (claimDescription == null) {
            claimDescription = new ArrayList<Description5000Type>();
        }
        return this.claimDescription;
    }

    /**
     * Gets the value of the apparelInformationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ApparelInformationDetailType }
     *     
     */
    public ApparelInformationDetailType getApparelInformationDetail() {
        return apparelInformationDetail;
    }

    /**
     * Sets the value of the apparelInformationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparelInformationDetailType }
     *     
     */
    public void setApparelInformationDetail(ApparelInformationDetailType value) {
        this.apparelInformationDetail = value;
    }

    /**
     * Gets the value of the beautyPersonalCareHygieneDetail property.
     * 
     * @return
     *     possible object is
     *     {@link BeautyPersonalCareHygieneDetailType }
     *     
     */
    public BeautyPersonalCareHygieneDetailType getBeautyPersonalCareHygieneDetail() {
        return beautyPersonalCareHygieneDetail;
    }

    /**
     * Sets the value of the beautyPersonalCareHygieneDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeautyPersonalCareHygieneDetailType }
     *     
     */
    public void setBeautyPersonalCareHygieneDetail(BeautyPersonalCareHygieneDetailType value) {
        this.beautyPersonalCareHygieneDetail = value;
    }

    /**
     * Gets the value of the householdAndOfficeFurnishingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HouseholdAndOfficeFurnishingInformationType }
     *     
     */
    public HouseholdAndOfficeFurnishingInformationType getHouseholdAndOfficeFurnishingInformation() {
        return householdAndOfficeFurnishingInformation;
    }

    /**
     * Sets the value of the householdAndOfficeFurnishingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseholdAndOfficeFurnishingInformationType }
     *     
     */
    public void setHouseholdAndOfficeFurnishingInformation(HouseholdAndOfficeFurnishingInformationType value) {
        this.householdAndOfficeFurnishingInformation = value;
    }

    /**
     * Gets the value of the claimDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claimDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimDetailType }
     * 
     * 
     */
    public List<ClaimDetailType> getClaimDetail() {
        if (claimDetail == null) {
            claimDetail = new ArrayList<ClaimDetailType>();
        }
        return this.claimDetail;
    }

    /**
     * Gets the value of the terpeneInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TerpeneInformationType }
     *     
     */
    public TerpeneInformationType getTerpeneInformation() {
        return terpeneInformation;
    }

    /**
     * Sets the value of the terpeneInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerpeneInformationType }
     *     
     */
    public void setTerpeneInformation(TerpeneInformationType value) {
        this.terpeneInformation = value;
    }

    /**
     * Gets the value of the tobaccoCannabisInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tobaccoCannabisInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTobaccoCannabisInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TobaccoCannabisInformationType }
     * 
     * 
     */
    public List<TobaccoCannabisInformationType> getTobaccoCannabisInformation() {
        if (tobaccoCannabisInformation == null) {
            tobaccoCannabisInformation = new ArrayList<TobaccoCannabisInformationType>();
        }
        return this.tobaccoCannabisInformation;
    }

}
