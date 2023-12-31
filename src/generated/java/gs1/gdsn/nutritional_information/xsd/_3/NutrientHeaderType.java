
package gs1.gdsn.nutritional_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.gdsn.gdsn_common.xsd._3.PreparationTypeCodeType;
import gs1.shared.shared_common.xsd._3.Description500Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for NutrientHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NutrientHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="preparationStateCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}PreparationTypeCodeType"/&gt;
 *         &lt;element name="dailyValueIntakeReference" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nutrientBasisQuantityTypeCode" type="{urn:gs1:gdsn:nutritional_information:xsd:3}NutrientBasisQuantityTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="nutrientBasisQuantity" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="servingSize" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="servingSizeDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nutrientBasisQuantityDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="servingsPerPackageDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nutrientDetail" type="{urn:gs1:gdsn:nutritional_information:xsd:3}NutrientDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "NutrientHeaderType", propOrder = {
    "preparationStateCode",
    "dailyValueIntakeReference",
    "nutrientBasisQuantityTypeCode",
    "nutrientBasisQuantity",
    "servingSize",
    "servingSizeDescription",
    "nutrientBasisQuantityDescription",
    "servingsPerPackageDescription",
    "nutrientDetail",
    "avpList"
})
public class NutrientHeaderType {

    @XmlElement(required = true)
    protected PreparationTypeCodeType preparationStateCode;
    protected List<Description500Type> dailyValueIntakeReference;
    protected NutrientBasisQuantityTypeCodeType nutrientBasisQuantityTypeCode;
    protected MeasurementType nutrientBasisQuantity;
    protected List<MeasurementType> servingSize;
    protected List<Description500Type> servingSizeDescription;
    protected List<Description500Type> nutrientBasisQuantityDescription;
    protected List<Description500Type> servingsPerPackageDescription;
    protected List<NutrientDetailType> nutrientDetail;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the preparationStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link PreparationTypeCodeType }
     *     
     */
    public PreparationTypeCodeType getPreparationStateCode() {
        return preparationStateCode;
    }

    /**
     * Sets the value of the preparationStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreparationTypeCodeType }
     *     
     */
    public void setPreparationStateCode(PreparationTypeCodeType value) {
        this.preparationStateCode = value;
    }

    /**
     * Gets the value of the dailyValueIntakeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dailyValueIntakeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDailyValueIntakeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getDailyValueIntakeReference() {
        if (dailyValueIntakeReference == null) {
            dailyValueIntakeReference = new ArrayList<Description500Type>();
        }
        return this.dailyValueIntakeReference;
    }

    /**
     * Gets the value of the nutrientBasisQuantityTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link NutrientBasisQuantityTypeCodeType }
     *     
     */
    public NutrientBasisQuantityTypeCodeType getNutrientBasisQuantityTypeCode() {
        return nutrientBasisQuantityTypeCode;
    }

    /**
     * Sets the value of the nutrientBasisQuantityTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NutrientBasisQuantityTypeCodeType }
     *     
     */
    public void setNutrientBasisQuantityTypeCode(NutrientBasisQuantityTypeCodeType value) {
        this.nutrientBasisQuantityTypeCode = value;
    }

    /**
     * Gets the value of the nutrientBasisQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getNutrientBasisQuantity() {
        return nutrientBasisQuantity;
    }

    /**
     * Sets the value of the nutrientBasisQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setNutrientBasisQuantity(MeasurementType value) {
        this.nutrientBasisQuantity = value;
    }

    /**
     * Gets the value of the servingSize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servingSize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServingSize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getServingSize() {
        if (servingSize == null) {
            servingSize = new ArrayList<MeasurementType>();
        }
        return this.servingSize;
    }

    /**
     * Gets the value of the servingSizeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servingSizeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServingSizeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getServingSizeDescription() {
        if (servingSizeDescription == null) {
            servingSizeDescription = new ArrayList<Description500Type>();
        }
        return this.servingSizeDescription;
    }

    /**
     * Gets the value of the nutrientBasisQuantityDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nutrientBasisQuantityDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNutrientBasisQuantityDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getNutrientBasisQuantityDescription() {
        if (nutrientBasisQuantityDescription == null) {
            nutrientBasisQuantityDescription = new ArrayList<Description500Type>();
        }
        return this.nutrientBasisQuantityDescription;
    }

    /**
     * Gets the value of the servingsPerPackageDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servingsPerPackageDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServingsPerPackageDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getServingsPerPackageDescription() {
        if (servingsPerPackageDescription == null) {
            servingsPerPackageDescription = new ArrayList<Description500Type>();
        }
        return this.servingsPerPackageDescription;
    }

    /**
     * Gets the value of the nutrientDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nutrientDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNutrientDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NutrientDetailType }
     * 
     * 
     */
    public List<NutrientDetailType> getNutrientDetail() {
        if (nutrientDetail == null) {
            nutrientDetail = new ArrayList<NutrientDetailType>();
        }
        return this.nutrientDetail;
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
