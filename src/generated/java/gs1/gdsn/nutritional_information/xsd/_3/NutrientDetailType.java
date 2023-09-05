
package gs1.gdsn.nutritional_information.xsd._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.gdsn.gdsn_common.xsd._3.MeasurementPrecisionCodeType;
import gs1.shared.shared_common.xsd._3.Description500Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.NutrientTypeCodeType;


/**
 * <p>Java class for NutrientDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NutrientDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nutrientTypeCode" type="{urn:gs1:shared:shared_common:xsd:3}NutrientTypeCodeType"/&gt;
 *         &lt;element name="dailyValueIntakePercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="measurementPrecisionCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}MeasurementPrecisionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="quantityContained" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dailyValueIntakePercentMeasurementPrecisionCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}MeasurementPrecisionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="nutrientValueDerivationCode" type="{urn:gs1:gdsn:nutritional_information:xsd:3}NutrientValueDerivationCodeType" minOccurs="0"/&gt;
 *         &lt;element name="descriptionOnNutrientQualifier" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nutrientSource" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="expressedAsPartOf" type="{urn:gs1:shared:shared_common:xsd:3}NutrientTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="isNutrientOnFrontOfPackage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "NutrientDetailType", propOrder = {
    "nutrientTypeCode",
    "dailyValueIntakePercent",
    "measurementPrecisionCode",
    "quantityContained",
    "dailyValueIntakePercentMeasurementPrecisionCode",
    "nutrientValueDerivationCode",
    "descriptionOnNutrientQualifier",
    "nutrientSource",
    "expressedAsPartOf",
    "isNutrientOnFrontOfPackage",
    "avpList"
})
public class NutrientDetailType {

    @XmlElement(required = true)
    protected NutrientTypeCodeType nutrientTypeCode;
    protected BigDecimal dailyValueIntakePercent;
    protected MeasurementPrecisionCodeType measurementPrecisionCode;
    protected List<MeasurementType> quantityContained;
    protected MeasurementPrecisionCodeType dailyValueIntakePercentMeasurementPrecisionCode;
    protected NutrientValueDerivationCodeType nutrientValueDerivationCode;
    protected List<String> descriptionOnNutrientQualifier;
    protected List<Description500Type> nutrientSource;
    protected NutrientTypeCodeType expressedAsPartOf;
    protected Boolean isNutrientOnFrontOfPackage;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the nutrientTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link NutrientTypeCodeType }
     *     
     */
    public NutrientTypeCodeType getNutrientTypeCode() {
        return nutrientTypeCode;
    }

    /**
     * Sets the value of the nutrientTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NutrientTypeCodeType }
     *     
     */
    public void setNutrientTypeCode(NutrientTypeCodeType value) {
        this.nutrientTypeCode = value;
    }

    /**
     * Gets the value of the dailyValueIntakePercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDailyValueIntakePercent() {
        return dailyValueIntakePercent;
    }

    /**
     * Sets the value of the dailyValueIntakePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDailyValueIntakePercent(BigDecimal value) {
        this.dailyValueIntakePercent = value;
    }

    /**
     * Gets the value of the measurementPrecisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public MeasurementPrecisionCodeType getMeasurementPrecisionCode() {
        return measurementPrecisionCode;
    }

    /**
     * Sets the value of the measurementPrecisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public void setMeasurementPrecisionCode(MeasurementPrecisionCodeType value) {
        this.measurementPrecisionCode = value;
    }

    /**
     * Gets the value of the quantityContained property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityContained property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityContained().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getQuantityContained() {
        if (quantityContained == null) {
            quantityContained = new ArrayList<MeasurementType>();
        }
        return this.quantityContained;
    }

    /**
     * Gets the value of the dailyValueIntakePercentMeasurementPrecisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public MeasurementPrecisionCodeType getDailyValueIntakePercentMeasurementPrecisionCode() {
        return dailyValueIntakePercentMeasurementPrecisionCode;
    }

    /**
     * Sets the value of the dailyValueIntakePercentMeasurementPrecisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public void setDailyValueIntakePercentMeasurementPrecisionCode(MeasurementPrecisionCodeType value) {
        this.dailyValueIntakePercentMeasurementPrecisionCode = value;
    }

    /**
     * Gets the value of the nutrientValueDerivationCode property.
     * 
     * @return
     *     possible object is
     *     {@link NutrientValueDerivationCodeType }
     *     
     */
    public NutrientValueDerivationCodeType getNutrientValueDerivationCode() {
        return nutrientValueDerivationCode;
    }

    /**
     * Sets the value of the nutrientValueDerivationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NutrientValueDerivationCodeType }
     *     
     */
    public void setNutrientValueDerivationCode(NutrientValueDerivationCodeType value) {
        this.nutrientValueDerivationCode = value;
    }

    /**
     * Gets the value of the descriptionOnNutrientQualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionOnNutrientQualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionOnNutrientQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescriptionOnNutrientQualifier() {
        if (descriptionOnNutrientQualifier == null) {
            descriptionOnNutrientQualifier = new ArrayList<String>();
        }
        return this.descriptionOnNutrientQualifier;
    }

    /**
     * Gets the value of the nutrientSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nutrientSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNutrientSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getNutrientSource() {
        if (nutrientSource == null) {
            nutrientSource = new ArrayList<Description500Type>();
        }
        return this.nutrientSource;
    }

    /**
     * Gets the value of the expressedAsPartOf property.
     * 
     * @return
     *     possible object is
     *     {@link NutrientTypeCodeType }
     *     
     */
    public NutrientTypeCodeType getExpressedAsPartOf() {
        return expressedAsPartOf;
    }

    /**
     * Sets the value of the expressedAsPartOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link NutrientTypeCodeType }
     *     
     */
    public void setExpressedAsPartOf(NutrientTypeCodeType value) {
        this.expressedAsPartOf = value;
    }

    /**
     * Gets the value of the isNutrientOnFrontOfPackage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNutrientOnFrontOfPackage() {
        return isNutrientOnFrontOfPackage;
    }

    /**
     * Sets the value of the isNutrientOnFrontOfPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNutrientOnFrontOfPackage(Boolean value) {
        this.isNutrientOnFrontOfPackage = value;
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
