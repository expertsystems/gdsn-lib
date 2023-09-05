
package gs1.gdsn.dairy_fish_meat_poultry.xsd._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.MeasurementPrecisionCodeType;
import gs1.shared.shared_common.xsd._3.Description70Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for CheeseInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheeseInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cheeseMaturationPeriodDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cheeseMaturationProcessContainerTypeCode" type="{urn:gs1:gdsn:dairy_fish_meat_poultry:xsd:3}CheeseMaturationProcessContainerTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fatPercentageInDryMatter" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="isRindEdible" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="rennetTypeCode" type="{urn:gs1:gdsn:dairy_fish_meat_poultry:xsd:3}RennetTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="ripeningTimePeriod" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="surfaceOfCheeseAtEndOfRipeningCode" type="{urn:gs1:gdsn:dairy_fish_meat_poultry:xsd:3}SurfaceOfCheeseAtEndOfRipeningCodeType" minOccurs="0"/&gt;
 *         &lt;element name="fatPercentageInDryMatterMeasurementPrecisionCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}MeasurementPrecisionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="cheeseMilkAcquisitionTypeCode" type="{urn:gs1:gdsn:dairy_fish_meat_poultry:xsd:3}CheeseMilkAcquisitionTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="cheeseMoisturePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="firmnessOfCheeseCode" type="{urn:gs1:gdsn:dairy_fish_meat_poultry:xsd:3}FirmnessOfCheeseCodeType" minOccurs="0"/&gt;
 *         &lt;element name="cheeseRipeningProcessCode" type="{urn:gs1:gdsn:dairy_fish_meat_poultry:xsd:3}CheeseRipeningProcessCodeType" minOccurs="0"/&gt;
 *         &lt;element name="cheeseTypeCode" type="{urn:gs1:gdsn:dairy_fish_meat_poultry:xsd:3}CheeseTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheeseInformationType", propOrder = {
    "cheeseMaturationPeriodDescription",
    "cheeseMaturationProcessContainerTypeCode",
    "fatPercentageInDryMatter",
    "isRindEdible",
    "rennetTypeCode",
    "ripeningTimePeriod",
    "surfaceOfCheeseAtEndOfRipeningCode",
    "fatPercentageInDryMatterMeasurementPrecisionCode",
    "cheeseMilkAcquisitionTypeCode",
    "cheeseMoisturePercentage",
    "firmnessOfCheeseCode",
    "cheeseRipeningProcessCode",
    "cheeseTypeCode"
})
public class CheeseInformationType {

    protected List<Description70Type> cheeseMaturationPeriodDescription;
    protected List<CheeseMaturationProcessContainerTypeCodeType> cheeseMaturationProcessContainerTypeCode;
    protected BigDecimal fatPercentageInDryMatter;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isRindEdible;
    protected RennetTypeCodeType rennetTypeCode;
    protected MeasurementType ripeningTimePeriod;
    protected SurfaceOfCheeseAtEndOfRipeningCodeType surfaceOfCheeseAtEndOfRipeningCode;
    protected MeasurementPrecisionCodeType fatPercentageInDryMatterMeasurementPrecisionCode;
    protected CheeseMilkAcquisitionTypeCodeType cheeseMilkAcquisitionTypeCode;
    protected BigDecimal cheeseMoisturePercentage;
    protected FirmnessOfCheeseCodeType firmnessOfCheeseCode;
    protected CheeseRipeningProcessCodeType cheeseRipeningProcessCode;
    protected List<CheeseTypeCodeType> cheeseTypeCode;

    /**
     * Gets the value of the cheeseMaturationPeriodDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cheeseMaturationPeriodDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheeseMaturationPeriodDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getCheeseMaturationPeriodDescription() {
        if (cheeseMaturationPeriodDescription == null) {
            cheeseMaturationPeriodDescription = new ArrayList<Description70Type>();
        }
        return this.cheeseMaturationPeriodDescription;
    }

    /**
     * Gets the value of the cheeseMaturationProcessContainerTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cheeseMaturationProcessContainerTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheeseMaturationProcessContainerTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheeseMaturationProcessContainerTypeCodeType }
     * 
     * 
     */
    public List<CheeseMaturationProcessContainerTypeCodeType> getCheeseMaturationProcessContainerTypeCode() {
        if (cheeseMaturationProcessContainerTypeCode == null) {
            cheeseMaturationProcessContainerTypeCode = new ArrayList<CheeseMaturationProcessContainerTypeCodeType>();
        }
        return this.cheeseMaturationProcessContainerTypeCode;
    }

    /**
     * Gets the value of the fatPercentageInDryMatter property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFatPercentageInDryMatter() {
        return fatPercentageInDryMatter;
    }

    /**
     * Sets the value of the fatPercentageInDryMatter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFatPercentageInDryMatter(BigDecimal value) {
        this.fatPercentageInDryMatter = value;
    }

    /**
     * Gets the value of the isRindEdible property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsRindEdible() {
        return isRindEdible;
    }

    /**
     * Sets the value of the isRindEdible property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsRindEdible(NonBinaryLogicEnumerationType value) {
        this.isRindEdible = value;
    }

    /**
     * Gets the value of the rennetTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link RennetTypeCodeType }
     *     
     */
    public RennetTypeCodeType getRennetTypeCode() {
        return rennetTypeCode;
    }

    /**
     * Sets the value of the rennetTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RennetTypeCodeType }
     *     
     */
    public void setRennetTypeCode(RennetTypeCodeType value) {
        this.rennetTypeCode = value;
    }

    /**
     * Gets the value of the ripeningTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getRipeningTimePeriod() {
        return ripeningTimePeriod;
    }

    /**
     * Sets the value of the ripeningTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setRipeningTimePeriod(MeasurementType value) {
        this.ripeningTimePeriod = value;
    }

    /**
     * Gets the value of the surfaceOfCheeseAtEndOfRipeningCode property.
     * 
     * @return
     *     possible object is
     *     {@link SurfaceOfCheeseAtEndOfRipeningCodeType }
     *     
     */
    public SurfaceOfCheeseAtEndOfRipeningCodeType getSurfaceOfCheeseAtEndOfRipeningCode() {
        return surfaceOfCheeseAtEndOfRipeningCode;
    }

    /**
     * Sets the value of the surfaceOfCheeseAtEndOfRipeningCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfaceOfCheeseAtEndOfRipeningCodeType }
     *     
     */
    public void setSurfaceOfCheeseAtEndOfRipeningCode(SurfaceOfCheeseAtEndOfRipeningCodeType value) {
        this.surfaceOfCheeseAtEndOfRipeningCode = value;
    }

    /**
     * Gets the value of the fatPercentageInDryMatterMeasurementPrecisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public MeasurementPrecisionCodeType getFatPercentageInDryMatterMeasurementPrecisionCode() {
        return fatPercentageInDryMatterMeasurementPrecisionCode;
    }

    /**
     * Sets the value of the fatPercentageInDryMatterMeasurementPrecisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public void setFatPercentageInDryMatterMeasurementPrecisionCode(MeasurementPrecisionCodeType value) {
        this.fatPercentageInDryMatterMeasurementPrecisionCode = value;
    }

    /**
     * Gets the value of the cheeseMilkAcquisitionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CheeseMilkAcquisitionTypeCodeType }
     *     
     */
    public CheeseMilkAcquisitionTypeCodeType getCheeseMilkAcquisitionTypeCode() {
        return cheeseMilkAcquisitionTypeCode;
    }

    /**
     * Sets the value of the cheeseMilkAcquisitionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheeseMilkAcquisitionTypeCodeType }
     *     
     */
    public void setCheeseMilkAcquisitionTypeCode(CheeseMilkAcquisitionTypeCodeType value) {
        this.cheeseMilkAcquisitionTypeCode = value;
    }

    /**
     * Gets the value of the cheeseMoisturePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCheeseMoisturePercentage() {
        return cheeseMoisturePercentage;
    }

    /**
     * Sets the value of the cheeseMoisturePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCheeseMoisturePercentage(BigDecimal value) {
        this.cheeseMoisturePercentage = value;
    }

    /**
     * Gets the value of the firmnessOfCheeseCode property.
     * 
     * @return
     *     possible object is
     *     {@link FirmnessOfCheeseCodeType }
     *     
     */
    public FirmnessOfCheeseCodeType getFirmnessOfCheeseCode() {
        return firmnessOfCheeseCode;
    }

    /**
     * Sets the value of the firmnessOfCheeseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirmnessOfCheeseCodeType }
     *     
     */
    public void setFirmnessOfCheeseCode(FirmnessOfCheeseCodeType value) {
        this.firmnessOfCheeseCode = value;
    }

    /**
     * Gets the value of the cheeseRipeningProcessCode property.
     * 
     * @return
     *     possible object is
     *     {@link CheeseRipeningProcessCodeType }
     *     
     */
    public CheeseRipeningProcessCodeType getCheeseRipeningProcessCode() {
        return cheeseRipeningProcessCode;
    }

    /**
     * Sets the value of the cheeseRipeningProcessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheeseRipeningProcessCodeType }
     *     
     */
    public void setCheeseRipeningProcessCode(CheeseRipeningProcessCodeType value) {
        this.cheeseRipeningProcessCode = value;
    }

    /**
     * Gets the value of the cheeseTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cheeseTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheeseTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheeseTypeCodeType }
     * 
     * 
     */
    public List<CheeseTypeCodeType> getCheeseTypeCode() {
        if (cheeseTypeCode == null) {
            cheeseTypeCode = new ArrayList<CheeseTypeCodeType>();
        }
        return this.cheeseTypeCode;
    }

}
