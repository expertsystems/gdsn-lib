
package gs1.gdsn.gdsn_common.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description1000Type;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;
import gs1.shared.shared_common.xsd._3.TimeMeasurementType;


/**
 * <p>Java class for FarmingAndProcessingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FarmingAndProcessingInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geneticallyModifiedDeclarationCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}LevelOfContainmentCodeType" minOccurs="0"/&gt;
 *         &lt;element name="growingMethodCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}GrowingMethodCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="irradiatedCode" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="maturationMethodCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}MaturationMethodCodeType" minOccurs="0"/&gt;
 *         &lt;element name="preservationTechniqueCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}PreservationTechniqueTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sourceAnimalCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}SourceAnimalCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="postHarvestTreatmentChemicalCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}PostHarvestTreatmentChemicalCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="postProcessTradeItemTreatmentPhysicalCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}PostProcessTradeItemTreatmentPhysicalCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="bioengineeredDeclarationClaimCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}BioengineeredDeclarationClaimCodeType" minOccurs="0"/&gt;
 *         &lt;element name="isBioengineeredDeclarationClaimRelevantDataProvided" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="extractionProcessCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}ExtractionProcessCodeType" minOccurs="0"/&gt;
 *         &lt;element name="growingLightConditionTypeCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}GrowingLightConditionTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="growthCycle" type="{urn:gs1:shared:shared_common:xsd:3}TimeMeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemGenderTypeCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}TradeItemGenderTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="curingMethodDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="floweringTriggerCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}FloweringTriggerCodeType" minOccurs="0"/&gt;
 *         &lt;element name="flowerTrimmingMethodCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}FlowerTrimmingMethodCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="carrierSubstanceTypeCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}CarrierSubstanceTypeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FarmingAndProcessingInformationType", propOrder = {
    "geneticallyModifiedDeclarationCode",
    "growingMethodCode",
    "irradiatedCode",
    "maturationMethodCode",
    "preservationTechniqueCode",
    "sourceAnimalCode",
    "postHarvestTreatmentChemicalCode",
    "postProcessTradeItemTreatmentPhysicalCode",
    "bioengineeredDeclarationClaimCode",
    "isBioengineeredDeclarationClaimRelevantDataProvided",
    "extractionProcessCode",
    "growingLightConditionTypeCode",
    "growthCycle",
    "tradeItemGenderTypeCode",
    "curingMethodDescription",
    "floweringTriggerCode",
    "flowerTrimmingMethodCode",
    "carrierSubstanceTypeCode"
})
public class FarmingAndProcessingInformationType {

    protected LevelOfContainmentCodeType geneticallyModifiedDeclarationCode;
    protected List<GrowingMethodCodeType> growingMethodCode;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType irradiatedCode;
    protected MaturationMethodCodeType maturationMethodCode;
    protected List<PreservationTechniqueTypeCodeType> preservationTechniqueCode;
    protected List<SourceAnimalCodeType> sourceAnimalCode;
    protected List<PostHarvestTreatmentChemicalCodeType> postHarvestTreatmentChemicalCode;
    protected List<PostProcessTradeItemTreatmentPhysicalCodeType> postProcessTradeItemTreatmentPhysicalCode;
    protected BioengineeredDeclarationClaimCodeType bioengineeredDeclarationClaimCode;
    protected Boolean isBioengineeredDeclarationClaimRelevantDataProvided;
    protected ExtractionProcessCodeType extractionProcessCode;
    protected List<GrowingLightConditionTypeCodeType> growingLightConditionTypeCode;
    protected List<TimeMeasurementType> growthCycle;
    protected TradeItemGenderTypeCodeType tradeItemGenderTypeCode;
    protected List<Description1000Type> curingMethodDescription;
    protected FloweringTriggerCodeType floweringTriggerCode;
    protected List<FlowerTrimmingMethodCodeType> flowerTrimmingMethodCode;
    protected CarrierSubstanceTypeCodeType carrierSubstanceTypeCode;

    /**
     * Gets the value of the geneticallyModifiedDeclarationCode property.
     * 
     * @return
     *     possible object is
     *     {@link LevelOfContainmentCodeType }
     *     
     */
    public LevelOfContainmentCodeType getGeneticallyModifiedDeclarationCode() {
        return geneticallyModifiedDeclarationCode;
    }

    /**
     * Sets the value of the geneticallyModifiedDeclarationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelOfContainmentCodeType }
     *     
     */
    public void setGeneticallyModifiedDeclarationCode(LevelOfContainmentCodeType value) {
        this.geneticallyModifiedDeclarationCode = value;
    }

    /**
     * Gets the value of the growingMethodCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the growingMethodCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrowingMethodCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrowingMethodCodeType }
     * 
     * 
     */
    public List<GrowingMethodCodeType> getGrowingMethodCode() {
        if (growingMethodCode == null) {
            growingMethodCode = new ArrayList<GrowingMethodCodeType>();
        }
        return this.growingMethodCode;
    }

    /**
     * Gets the value of the irradiatedCode property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIrradiatedCode() {
        return irradiatedCode;
    }

    /**
     * Sets the value of the irradiatedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIrradiatedCode(NonBinaryLogicEnumerationType value) {
        this.irradiatedCode = value;
    }

    /**
     * Gets the value of the maturationMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link MaturationMethodCodeType }
     *     
     */
    public MaturationMethodCodeType getMaturationMethodCode() {
        return maturationMethodCode;
    }

    /**
     * Sets the value of the maturationMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaturationMethodCodeType }
     *     
     */
    public void setMaturationMethodCode(MaturationMethodCodeType value) {
        this.maturationMethodCode = value;
    }

    /**
     * Gets the value of the preservationTechniqueCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preservationTechniqueCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreservationTechniqueCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreservationTechniqueTypeCodeType }
     * 
     * 
     */
    public List<PreservationTechniqueTypeCodeType> getPreservationTechniqueCode() {
        if (preservationTechniqueCode == null) {
            preservationTechniqueCode = new ArrayList<PreservationTechniqueTypeCodeType>();
        }
        return this.preservationTechniqueCode;
    }

    /**
     * Gets the value of the sourceAnimalCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceAnimalCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceAnimalCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceAnimalCodeType }
     * 
     * 
     */
    public List<SourceAnimalCodeType> getSourceAnimalCode() {
        if (sourceAnimalCode == null) {
            sourceAnimalCode = new ArrayList<SourceAnimalCodeType>();
        }
        return this.sourceAnimalCode;
    }

    /**
     * Gets the value of the postHarvestTreatmentChemicalCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postHarvestTreatmentChemicalCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostHarvestTreatmentChemicalCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostHarvestTreatmentChemicalCodeType }
     * 
     * 
     */
    public List<PostHarvestTreatmentChemicalCodeType> getPostHarvestTreatmentChemicalCode() {
        if (postHarvestTreatmentChemicalCode == null) {
            postHarvestTreatmentChemicalCode = new ArrayList<PostHarvestTreatmentChemicalCodeType>();
        }
        return this.postHarvestTreatmentChemicalCode;
    }

    /**
     * Gets the value of the postProcessTradeItemTreatmentPhysicalCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postProcessTradeItemTreatmentPhysicalCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostProcessTradeItemTreatmentPhysicalCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostProcessTradeItemTreatmentPhysicalCodeType }
     * 
     * 
     */
    public List<PostProcessTradeItemTreatmentPhysicalCodeType> getPostProcessTradeItemTreatmentPhysicalCode() {
        if (postProcessTradeItemTreatmentPhysicalCode == null) {
            postProcessTradeItemTreatmentPhysicalCode = new ArrayList<PostProcessTradeItemTreatmentPhysicalCodeType>();
        }
        return this.postProcessTradeItemTreatmentPhysicalCode;
    }

    /**
     * Gets the value of the bioengineeredDeclarationClaimCode property.
     * 
     * @return
     *     possible object is
     *     {@link BioengineeredDeclarationClaimCodeType }
     *     
     */
    public BioengineeredDeclarationClaimCodeType getBioengineeredDeclarationClaimCode() {
        return bioengineeredDeclarationClaimCode;
    }

    /**
     * Sets the value of the bioengineeredDeclarationClaimCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BioengineeredDeclarationClaimCodeType }
     *     
     */
    public void setBioengineeredDeclarationClaimCode(BioengineeredDeclarationClaimCodeType value) {
        this.bioengineeredDeclarationClaimCode = value;
    }

    /**
     * Gets the value of the isBioengineeredDeclarationClaimRelevantDataProvided property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBioengineeredDeclarationClaimRelevantDataProvided() {
        return isBioengineeredDeclarationClaimRelevantDataProvided;
    }

    /**
     * Sets the value of the isBioengineeredDeclarationClaimRelevantDataProvided property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBioengineeredDeclarationClaimRelevantDataProvided(Boolean value) {
        this.isBioengineeredDeclarationClaimRelevantDataProvided = value;
    }

    /**
     * Gets the value of the extractionProcessCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExtractionProcessCodeType }
     *     
     */
    public ExtractionProcessCodeType getExtractionProcessCode() {
        return extractionProcessCode;
    }

    /**
     * Sets the value of the extractionProcessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtractionProcessCodeType }
     *     
     */
    public void setExtractionProcessCode(ExtractionProcessCodeType value) {
        this.extractionProcessCode = value;
    }

    /**
     * Gets the value of the growingLightConditionTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the growingLightConditionTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrowingLightConditionTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrowingLightConditionTypeCodeType }
     * 
     * 
     */
    public List<GrowingLightConditionTypeCodeType> getGrowingLightConditionTypeCode() {
        if (growingLightConditionTypeCode == null) {
            growingLightConditionTypeCode = new ArrayList<GrowingLightConditionTypeCodeType>();
        }
        return this.growingLightConditionTypeCode;
    }

    /**
     * Gets the value of the growthCycle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the growthCycle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrowthCycle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeMeasurementType }
     * 
     * 
     */
    public List<TimeMeasurementType> getGrowthCycle() {
        if (growthCycle == null) {
            growthCycle = new ArrayList<TimeMeasurementType>();
        }
        return this.growthCycle;
    }

    /**
     * Gets the value of the tradeItemGenderTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemGenderTypeCodeType }
     *     
     */
    public TradeItemGenderTypeCodeType getTradeItemGenderTypeCode() {
        return tradeItemGenderTypeCode;
    }

    /**
     * Sets the value of the tradeItemGenderTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemGenderTypeCodeType }
     *     
     */
    public void setTradeItemGenderTypeCode(TradeItemGenderTypeCodeType value) {
        this.tradeItemGenderTypeCode = value;
    }

    /**
     * Gets the value of the curingMethodDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the curingMethodDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCuringMethodDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getCuringMethodDescription() {
        if (curingMethodDescription == null) {
            curingMethodDescription = new ArrayList<Description1000Type>();
        }
        return this.curingMethodDescription;
    }

    /**
     * Gets the value of the floweringTriggerCode property.
     * 
     * @return
     *     possible object is
     *     {@link FloweringTriggerCodeType }
     *     
     */
    public FloweringTriggerCodeType getFloweringTriggerCode() {
        return floweringTriggerCode;
    }

    /**
     * Sets the value of the floweringTriggerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloweringTriggerCodeType }
     *     
     */
    public void setFloweringTriggerCode(FloweringTriggerCodeType value) {
        this.floweringTriggerCode = value;
    }

    /**
     * Gets the value of the flowerTrimmingMethodCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flowerTrimmingMethodCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlowerTrimmingMethodCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowerTrimmingMethodCodeType }
     * 
     * 
     */
    public List<FlowerTrimmingMethodCodeType> getFlowerTrimmingMethodCode() {
        if (flowerTrimmingMethodCode == null) {
            flowerTrimmingMethodCode = new ArrayList<FlowerTrimmingMethodCodeType>();
        }
        return this.flowerTrimmingMethodCode;
    }

    /**
     * Gets the value of the carrierSubstanceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierSubstanceTypeCodeType }
     *     
     */
    public CarrierSubstanceTypeCodeType getCarrierSubstanceTypeCode() {
        return carrierSubstanceTypeCode;
    }

    /**
     * Sets the value of the carrierSubstanceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierSubstanceTypeCodeType }
     *     
     */
    public void setCarrierSubstanceTypeCode(CarrierSubstanceTypeCodeType value) {
        this.carrierSubstanceTypeCode = value;
    }

}
