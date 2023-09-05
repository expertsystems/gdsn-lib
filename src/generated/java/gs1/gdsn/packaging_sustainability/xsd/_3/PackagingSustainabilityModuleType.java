
package gs1.gdsn.packaging_sustainability.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.Description80Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.QuantityType;


/**
 * <p>Java class for PackagingSustainabilityModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingSustainabilityModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="functionalBasisUnitCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}FunctionalBasisUnitCodeType" minOccurs="0"/&gt;
 *         &lt;element name="functionalBasisUnitDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingCubeUtilisationRatio" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="packagingToTradeItemWeightRatio" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="packagingWeightPerConsumerUser" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="quantityOfFunctionalBasisUnit" type="{urn:gs1:shared:shared_common:xsd:3}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="lifeCycleIndicators" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}LifeCycleIndicatorsType" minOccurs="0"/&gt;
 *         &lt;element name="individualPackagingComponentLevel" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}IndividualPackagingComponentLevelType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingSustainabilityEconomicIndicators" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}PackagingSustainabilityEconomicIndicatorsType" minOccurs="0"/&gt;
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
@XmlType(name = "PackagingSustainabilityModuleType", propOrder = {
    "functionalBasisUnitCode",
    "functionalBasisUnitDescription",
    "packagingCubeUtilisationRatio",
    "packagingToTradeItemWeightRatio",
    "packagingWeightPerConsumerUser",
    "quantityOfFunctionalBasisUnit",
    "lifeCycleIndicators",
    "individualPackagingComponentLevel",
    "packagingSustainabilityEconomicIndicators",
    "avpList"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:packaging_sustainability:xsd:3")
public class PackagingSustainabilityModuleType {

    protected FunctionalBasisUnitCodeType functionalBasisUnitCode;
    protected List<Description80Type> functionalBasisUnitDescription;
    protected Float packagingCubeUtilisationRatio;
    protected Float packagingToTradeItemWeightRatio;
    protected List<MeasurementType> packagingWeightPerConsumerUser;
    protected QuantityType quantityOfFunctionalBasisUnit;
    protected LifeCycleIndicatorsType lifeCycleIndicators;
    protected List<IndividualPackagingComponentLevelType> individualPackagingComponentLevel;
    protected PackagingSustainabilityEconomicIndicatorsType packagingSustainabilityEconomicIndicators;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the functionalBasisUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionalBasisUnitCodeType }
     *     
     */
    public FunctionalBasisUnitCodeType getFunctionalBasisUnitCode() {
        return functionalBasisUnitCode;
    }

    /**
     * Sets the value of the functionalBasisUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionalBasisUnitCodeType }
     *     
     */
    public void setFunctionalBasisUnitCode(FunctionalBasisUnitCodeType value) {
        this.functionalBasisUnitCode = value;
    }

    /**
     * Gets the value of the functionalBasisUnitDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the functionalBasisUnitDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunctionalBasisUnitDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getFunctionalBasisUnitDescription() {
        if (functionalBasisUnitDescription == null) {
            functionalBasisUnitDescription = new ArrayList<Description80Type>();
        }
        return this.functionalBasisUnitDescription;
    }

    /**
     * Gets the value of the packagingCubeUtilisationRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPackagingCubeUtilisationRatio() {
        return packagingCubeUtilisationRatio;
    }

    /**
     * Sets the value of the packagingCubeUtilisationRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPackagingCubeUtilisationRatio(Float value) {
        this.packagingCubeUtilisationRatio = value;
    }

    /**
     * Gets the value of the packagingToTradeItemWeightRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPackagingToTradeItemWeightRatio() {
        return packagingToTradeItemWeightRatio;
    }

    /**
     * Sets the value of the packagingToTradeItemWeightRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPackagingToTradeItemWeightRatio(Float value) {
        this.packagingToTradeItemWeightRatio = value;
    }

    /**
     * Gets the value of the packagingWeightPerConsumerUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingWeightPerConsumerUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingWeightPerConsumerUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getPackagingWeightPerConsumerUser() {
        if (packagingWeightPerConsumerUser == null) {
            packagingWeightPerConsumerUser = new ArrayList<MeasurementType>();
        }
        return this.packagingWeightPerConsumerUser;
    }

    /**
     * Gets the value of the quantityOfFunctionalBasisUnit property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getQuantityOfFunctionalBasisUnit() {
        return quantityOfFunctionalBasisUnit;
    }

    /**
     * Sets the value of the quantityOfFunctionalBasisUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setQuantityOfFunctionalBasisUnit(QuantityType value) {
        this.quantityOfFunctionalBasisUnit = value;
    }

    /**
     * Gets the value of the lifeCycleIndicators property.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleIndicatorsType }
     *     
     */
    public LifeCycleIndicatorsType getLifeCycleIndicators() {
        return lifeCycleIndicators;
    }

    /**
     * Sets the value of the lifeCycleIndicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleIndicatorsType }
     *     
     */
    public void setLifeCycleIndicators(LifeCycleIndicatorsType value) {
        this.lifeCycleIndicators = value;
    }

    /**
     * Gets the value of the individualPackagingComponentLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualPackagingComponentLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividualPackagingComponentLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualPackagingComponentLevelType }
     * 
     * 
     */
    public List<IndividualPackagingComponentLevelType> getIndividualPackagingComponentLevel() {
        if (individualPackagingComponentLevel == null) {
            individualPackagingComponentLevel = new ArrayList<IndividualPackagingComponentLevelType>();
        }
        return this.individualPackagingComponentLevel;
    }

    /**
     * Gets the value of the packagingSustainabilityEconomicIndicators property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingSustainabilityEconomicIndicatorsType }
     *     
     */
    public PackagingSustainabilityEconomicIndicatorsType getPackagingSustainabilityEconomicIndicators() {
        return packagingSustainabilityEconomicIndicators;
    }

    /**
     * Sets the value of the packagingSustainabilityEconomicIndicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingSustainabilityEconomicIndicatorsType }
     *     
     */
    public void setPackagingSustainabilityEconomicIndicators(PackagingSustainabilityEconomicIndicatorsType value) {
        this.packagingSustainabilityEconomicIndicators = value;
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
