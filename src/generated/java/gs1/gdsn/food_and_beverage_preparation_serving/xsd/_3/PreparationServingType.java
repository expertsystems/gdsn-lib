
package gs1.gdsn.food_and_beverage_preparation_serving.xsd._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.PreparationTypeCodeType;
import gs1.shared.shared_common.xsd._3.Description1000Type;
import gs1.shared.shared_common.xsd._3.Description5000Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for PreparationServingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreparationServingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="convenienceLevelPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="maximumOptimumConsumptionTemperature" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="minimumOptimumConsumptionTemperature" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="preparationConsumptionPrecautions" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="preparationInstructions" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="preparationTypeCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}PreparationTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="servingSuggestion" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="recipe" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isGradedBeforePreparationTypeApplied" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="productYieldInformation" type="{urn:gs1:gdsn:food_and_beverage_preparation_serving:xsd:3}ProductYieldInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreparationServingType", propOrder = {
    "convenienceLevelPercent",
    "maximumOptimumConsumptionTemperature",
    "minimumOptimumConsumptionTemperature",
    "preparationConsumptionPrecautions",
    "preparationInstructions",
    "preparationTypeCode",
    "servingSuggestion",
    "recipe",
    "isGradedBeforePreparationTypeApplied",
    "productYieldInformation"
})
public class PreparationServingType {

    protected BigDecimal convenienceLevelPercent;
    protected List<MeasurementType> maximumOptimumConsumptionTemperature;
    protected List<MeasurementType> minimumOptimumConsumptionTemperature;
    protected List<Description1000Type> preparationConsumptionPrecautions;
    protected List<Description5000Type> preparationInstructions;
    protected PreparationTypeCodeType preparationTypeCode;
    protected List<Description1000Type> servingSuggestion;
    protected List<Description5000Type> recipe;
    protected Boolean isGradedBeforePreparationTypeApplied;
    protected List<ProductYieldInformationType> productYieldInformation;

    /**
     * Gets the value of the convenienceLevelPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConvenienceLevelPercent() {
        return convenienceLevelPercent;
    }

    /**
     * Sets the value of the convenienceLevelPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConvenienceLevelPercent(BigDecimal value) {
        this.convenienceLevelPercent = value;
    }

    /**
     * Gets the value of the maximumOptimumConsumptionTemperature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maximumOptimumConsumptionTemperature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaximumOptimumConsumptionTemperature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getMaximumOptimumConsumptionTemperature() {
        if (maximumOptimumConsumptionTemperature == null) {
            maximumOptimumConsumptionTemperature = new ArrayList<MeasurementType>();
        }
        return this.maximumOptimumConsumptionTemperature;
    }

    /**
     * Gets the value of the minimumOptimumConsumptionTemperature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minimumOptimumConsumptionTemperature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinimumOptimumConsumptionTemperature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getMinimumOptimumConsumptionTemperature() {
        if (minimumOptimumConsumptionTemperature == null) {
            minimumOptimumConsumptionTemperature = new ArrayList<MeasurementType>();
        }
        return this.minimumOptimumConsumptionTemperature;
    }

    /**
     * Gets the value of the preparationConsumptionPrecautions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preparationConsumptionPrecautions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreparationConsumptionPrecautions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getPreparationConsumptionPrecautions() {
        if (preparationConsumptionPrecautions == null) {
            preparationConsumptionPrecautions = new ArrayList<Description1000Type>();
        }
        return this.preparationConsumptionPrecautions;
    }

    /**
     * Gets the value of the preparationInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preparationInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreparationInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getPreparationInstructions() {
        if (preparationInstructions == null) {
            preparationInstructions = new ArrayList<Description5000Type>();
        }
        return this.preparationInstructions;
    }

    /**
     * Gets the value of the preparationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PreparationTypeCodeType }
     *     
     */
    public PreparationTypeCodeType getPreparationTypeCode() {
        return preparationTypeCode;
    }

    /**
     * Sets the value of the preparationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreparationTypeCodeType }
     *     
     */
    public void setPreparationTypeCode(PreparationTypeCodeType value) {
        this.preparationTypeCode = value;
    }

    /**
     * Gets the value of the servingSuggestion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servingSuggestion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServingSuggestion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getServingSuggestion() {
        if (servingSuggestion == null) {
            servingSuggestion = new ArrayList<Description1000Type>();
        }
        return this.servingSuggestion;
    }

    /**
     * Gets the value of the recipe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getRecipe() {
        if (recipe == null) {
            recipe = new ArrayList<Description5000Type>();
        }
        return this.recipe;
    }

    /**
     * Gets the value of the isGradedBeforePreparationTypeApplied property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGradedBeforePreparationTypeApplied() {
        return isGradedBeforePreparationTypeApplied;
    }

    /**
     * Sets the value of the isGradedBeforePreparationTypeApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGradedBeforePreparationTypeApplied(Boolean value) {
        this.isGradedBeforePreparationTypeApplied = value;
    }

    /**
     * Gets the value of the productYieldInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productYieldInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductYieldInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductYieldInformationType }
     * 
     * 
     */
    public List<ProductYieldInformationType> getProductYieldInformation() {
        if (productYieldInformation == null) {
            productYieldInformation = new ArrayList<ProductYieldInformationType>();
        }
        return this.productYieldInformation;
    }

}
