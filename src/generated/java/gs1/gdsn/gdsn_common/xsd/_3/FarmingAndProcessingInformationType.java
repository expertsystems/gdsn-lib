
package gs1.gdsn.gdsn_common.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


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
    "isBioengineeredDeclarationClaimRelevantDataProvided"
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

}
