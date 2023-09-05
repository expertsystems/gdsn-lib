
package gs1.gdsn.product_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApparelProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApparelProductInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="garmentLengthTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}GarmentLengthTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="garmentLinedCode" type="{urn:gs1:gdsn:product_information:xsd:3}GarmentLinedCodeType" minOccurs="0"/&gt;
 *         &lt;element name="garmentLegTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}GarmentLegTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="garmentAdornmentTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}GarmentAdornmentTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hosierySockRiseCode" type="{urn:gs1:gdsn:product_information:xsd:3}HosierySockRiseCodeType" minOccurs="0"/&gt;
 *         &lt;element name="hosierySockStyleCode" type="{urn:gs1:gdsn:product_information:xsd:3}HosierySockStyleCodeType" minOccurs="0"/&gt;
 *         &lt;element name="hatTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}HatTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="neckwearTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}NeckwearTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="pantsShortsTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}PantsShortsTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="skirtTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}SkirtTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="sweaterPulloverTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}SweaterPulloverTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="waistbandTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}WaistbandTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="waistRiseCode" type="{urn:gs1:gdsn:product_information:xsd:3}WaistRiseCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApparelProductInformationType", propOrder = {
    "garmentLengthTypeCode",
    "garmentLinedCode",
    "garmentLegTypeCode",
    "garmentAdornmentTypeCode",
    "hosierySockRiseCode",
    "hosierySockStyleCode",
    "hatTypeCode",
    "neckwearTypeCode",
    "pantsShortsTypeCode",
    "skirtTypeCode",
    "sweaterPulloverTypeCode",
    "waistbandTypeCode",
    "waistRiseCode"
})
public class ApparelProductInformationType {

    protected GarmentLengthTypeCodeType garmentLengthTypeCode;
    protected GarmentLinedCodeType garmentLinedCode;
    protected GarmentLegTypeCodeType garmentLegTypeCode;
    protected List<GarmentAdornmentTypeCodeType> garmentAdornmentTypeCode;
    protected HosierySockRiseCodeType hosierySockRiseCode;
    protected HosierySockStyleCodeType hosierySockStyleCode;
    protected HatTypeCodeType hatTypeCode;
    protected NeckwearTypeCodeType neckwearTypeCode;
    protected PantsShortsTypeCodeType pantsShortsTypeCode;
    protected SkirtTypeCodeType skirtTypeCode;
    protected SweaterPulloverTypeCodeType sweaterPulloverTypeCode;
    protected List<WaistbandTypeCodeType> waistbandTypeCode;
    protected WaistRiseCodeType waistRiseCode;

    /**
     * Gets the value of the garmentLengthTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link GarmentLengthTypeCodeType }
     *     
     */
    public GarmentLengthTypeCodeType getGarmentLengthTypeCode() {
        return garmentLengthTypeCode;
    }

    /**
     * Sets the value of the garmentLengthTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GarmentLengthTypeCodeType }
     *     
     */
    public void setGarmentLengthTypeCode(GarmentLengthTypeCodeType value) {
        this.garmentLengthTypeCode = value;
    }

    /**
     * Gets the value of the garmentLinedCode property.
     * 
     * @return
     *     possible object is
     *     {@link GarmentLinedCodeType }
     *     
     */
    public GarmentLinedCodeType getGarmentLinedCode() {
        return garmentLinedCode;
    }

    /**
     * Sets the value of the garmentLinedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GarmentLinedCodeType }
     *     
     */
    public void setGarmentLinedCode(GarmentLinedCodeType value) {
        this.garmentLinedCode = value;
    }

    /**
     * Gets the value of the garmentLegTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link GarmentLegTypeCodeType }
     *     
     */
    public GarmentLegTypeCodeType getGarmentLegTypeCode() {
        return garmentLegTypeCode;
    }

    /**
     * Sets the value of the garmentLegTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GarmentLegTypeCodeType }
     *     
     */
    public void setGarmentLegTypeCode(GarmentLegTypeCodeType value) {
        this.garmentLegTypeCode = value;
    }

    /**
     * Gets the value of the garmentAdornmentTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the garmentAdornmentTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGarmentAdornmentTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GarmentAdornmentTypeCodeType }
     * 
     * 
     */
    public List<GarmentAdornmentTypeCodeType> getGarmentAdornmentTypeCode() {
        if (garmentAdornmentTypeCode == null) {
            garmentAdornmentTypeCode = new ArrayList<GarmentAdornmentTypeCodeType>();
        }
        return this.garmentAdornmentTypeCode;
    }

    /**
     * Gets the value of the hosierySockRiseCode property.
     * 
     * @return
     *     possible object is
     *     {@link HosierySockRiseCodeType }
     *     
     */
    public HosierySockRiseCodeType getHosierySockRiseCode() {
        return hosierySockRiseCode;
    }

    /**
     * Sets the value of the hosierySockRiseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HosierySockRiseCodeType }
     *     
     */
    public void setHosierySockRiseCode(HosierySockRiseCodeType value) {
        this.hosierySockRiseCode = value;
    }

    /**
     * Gets the value of the hosierySockStyleCode property.
     * 
     * @return
     *     possible object is
     *     {@link HosierySockStyleCodeType }
     *     
     */
    public HosierySockStyleCodeType getHosierySockStyleCode() {
        return hosierySockStyleCode;
    }

    /**
     * Sets the value of the hosierySockStyleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HosierySockStyleCodeType }
     *     
     */
    public void setHosierySockStyleCode(HosierySockStyleCodeType value) {
        this.hosierySockStyleCode = value;
    }

    /**
     * Gets the value of the hatTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link HatTypeCodeType }
     *     
     */
    public HatTypeCodeType getHatTypeCode() {
        return hatTypeCode;
    }

    /**
     * Sets the value of the hatTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HatTypeCodeType }
     *     
     */
    public void setHatTypeCode(HatTypeCodeType value) {
        this.hatTypeCode = value;
    }

    /**
     * Gets the value of the neckwearTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link NeckwearTypeCodeType }
     *     
     */
    public NeckwearTypeCodeType getNeckwearTypeCode() {
        return neckwearTypeCode;
    }

    /**
     * Sets the value of the neckwearTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NeckwearTypeCodeType }
     *     
     */
    public void setNeckwearTypeCode(NeckwearTypeCodeType value) {
        this.neckwearTypeCode = value;
    }

    /**
     * Gets the value of the pantsShortsTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PantsShortsTypeCodeType }
     *     
     */
    public PantsShortsTypeCodeType getPantsShortsTypeCode() {
        return pantsShortsTypeCode;
    }

    /**
     * Sets the value of the pantsShortsTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PantsShortsTypeCodeType }
     *     
     */
    public void setPantsShortsTypeCode(PantsShortsTypeCodeType value) {
        this.pantsShortsTypeCode = value;
    }

    /**
     * Gets the value of the skirtTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link SkirtTypeCodeType }
     *     
     */
    public SkirtTypeCodeType getSkirtTypeCode() {
        return skirtTypeCode;
    }

    /**
     * Sets the value of the skirtTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkirtTypeCodeType }
     *     
     */
    public void setSkirtTypeCode(SkirtTypeCodeType value) {
        this.skirtTypeCode = value;
    }

    /**
     * Gets the value of the sweaterPulloverTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link SweaterPulloverTypeCodeType }
     *     
     */
    public SweaterPulloverTypeCodeType getSweaterPulloverTypeCode() {
        return sweaterPulloverTypeCode;
    }

    /**
     * Sets the value of the sweaterPulloverTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SweaterPulloverTypeCodeType }
     *     
     */
    public void setSweaterPulloverTypeCode(SweaterPulloverTypeCodeType value) {
        this.sweaterPulloverTypeCode = value;
    }

    /**
     * Gets the value of the waistbandTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waistbandTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaistbandTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WaistbandTypeCodeType }
     * 
     * 
     */
    public List<WaistbandTypeCodeType> getWaistbandTypeCode() {
        if (waistbandTypeCode == null) {
            waistbandTypeCode = new ArrayList<WaistbandTypeCodeType>();
        }
        return this.waistbandTypeCode;
    }

    /**
     * Gets the value of the waistRiseCode property.
     * 
     * @return
     *     possible object is
     *     {@link WaistRiseCodeType }
     *     
     */
    public WaistRiseCodeType getWaistRiseCode() {
        return waistRiseCode;
    }

    /**
     * Sets the value of the waistRiseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaistRiseCodeType }
     *     
     */
    public void setWaistRiseCode(WaistRiseCodeType value) {
        this.waistRiseCode = value;
    }

}
