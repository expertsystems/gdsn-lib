
package gs1.gdsn.healthcare_item_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.ExternalCodeValueInformationType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.Description500Type;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;
import gs1.shared.shared_common.xsd._3.TimeMeasurementType;


/**
 * <p>Java class for HealthcareItemInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HealthcareItemInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="doesSaleOfTradeItemRequireGovernmentalReporting" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="doesTradeItemContainHumanBloodDerivative" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="doesTradeItemContainLatex" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemConsideredGeneric" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="prescriptionTypeCode" type="{urn:gs1:gdsn:healthcare_item_information:xsd:3}PrescriptionTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="healthcareItemMaximumUsageAge" type="{urn:gs1:shared:shared_common:xsd:3}TimeMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="healthcareItemMinimumUsageAge" type="{urn:gs1:shared:shared_common:xsd:3}TimeMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="healthcareItemUsageAgeDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="usageDuringBreastFeedingCode" type="{urn:gs1:gdsn:healthcare_item_information:xsd:3}AllowedUsageCodeType" minOccurs="0"/&gt;
 *         &lt;element name="usageDuringPregnancyCode" type="{urn:gs1:gdsn:healthcare_item_information:xsd:3}AllowedUsageCodeType" minOccurs="0"/&gt;
 *         &lt;element name="clinicallyRelevantCharacteristicOfMedicalDevice" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="doesTradeItemContainHumanTissue" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="healthcareGroupedProductCode" type="{urn:gs1:gdsn:healthcare_item_information:xsd:3}HealthcareGroupedProductCodeType" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemExemptFromSerialisation" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="doesTradeItemContainMicrobialSubstance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="doesTradeItemContainAnimalTissue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="clinicalStorageHandlingInformation" type="{urn:gs1:gdsn:healthcare_item_information:xsd:3}ClinicalStorageHandlingInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="clinicalSize" type="{urn:gs1:gdsn:healthcare_item_information:xsd:3}ClinicalSizeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="clinicalWarning" type="{urn:gs1:gdsn:healthcare_item_information:xsd:3}ClinicalWarningType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="routeOfAdministration" type="{urn:gs1:gdsn:gdsn_common:xsd:3}ExternalCodeValueInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "HealthcareItemInformationType", propOrder = {
    "doesSaleOfTradeItemRequireGovernmentalReporting",
    "doesTradeItemContainHumanBloodDerivative",
    "doesTradeItemContainLatex",
    "isTradeItemConsideredGeneric",
    "prescriptionTypeCode",
    "healthcareItemMaximumUsageAge",
    "healthcareItemMinimumUsageAge",
    "healthcareItemUsageAgeDescription",
    "usageDuringBreastFeedingCode",
    "usageDuringPregnancyCode",
    "clinicallyRelevantCharacteristicOfMedicalDevice",
    "doesTradeItemContainHumanTissue",
    "healthcareGroupedProductCode",
    "isTradeItemExemptFromSerialisation",
    "doesTradeItemContainMicrobialSubstance",
    "doesTradeItemContainAnimalTissue",
    "clinicalStorageHandlingInformation",
    "clinicalSize",
    "clinicalWarning",
    "routeOfAdministration",
    "avpList"
})
public class HealthcareItemInformationType {

    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType doesSaleOfTradeItemRequireGovernmentalReporting;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType doesTradeItemContainHumanBloodDerivative;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType doesTradeItemContainLatex;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isTradeItemConsideredGeneric;
    protected List<PrescriptionTypeCodeType> prescriptionTypeCode;
    protected TimeMeasurementType healthcareItemMaximumUsageAge;
    protected TimeMeasurementType healthcareItemMinimumUsageAge;
    protected List<Description500Type> healthcareItemUsageAgeDescription;
    protected AllowedUsageCodeType usageDuringBreastFeedingCode;
    protected AllowedUsageCodeType usageDuringPregnancyCode;
    protected List<String> clinicallyRelevantCharacteristicOfMedicalDevice;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType doesTradeItemContainHumanTissue;
    protected HealthcareGroupedProductCodeType healthcareGroupedProductCode;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isTradeItemExemptFromSerialisation;
    protected Boolean doesTradeItemContainMicrobialSubstance;
    protected Boolean doesTradeItemContainAnimalTissue;
    protected List<ClinicalStorageHandlingInformationType> clinicalStorageHandlingInformation;
    protected List<ClinicalSizeType> clinicalSize;
    protected List<ClinicalWarningType> clinicalWarning;
    protected List<ExternalCodeValueInformationType> routeOfAdministration;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the doesSaleOfTradeItemRequireGovernmentalReporting property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getDoesSaleOfTradeItemRequireGovernmentalReporting() {
        return doesSaleOfTradeItemRequireGovernmentalReporting;
    }

    /**
     * Sets the value of the doesSaleOfTradeItemRequireGovernmentalReporting property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setDoesSaleOfTradeItemRequireGovernmentalReporting(NonBinaryLogicEnumerationType value) {
        this.doesSaleOfTradeItemRequireGovernmentalReporting = value;
    }

    /**
     * Gets the value of the doesTradeItemContainHumanBloodDerivative property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getDoesTradeItemContainHumanBloodDerivative() {
        return doesTradeItemContainHumanBloodDerivative;
    }

    /**
     * Sets the value of the doesTradeItemContainHumanBloodDerivative property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setDoesTradeItemContainHumanBloodDerivative(NonBinaryLogicEnumerationType value) {
        this.doesTradeItemContainHumanBloodDerivative = value;
    }

    /**
     * Gets the value of the doesTradeItemContainLatex property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getDoesTradeItemContainLatex() {
        return doesTradeItemContainLatex;
    }

    /**
     * Sets the value of the doesTradeItemContainLatex property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setDoesTradeItemContainLatex(NonBinaryLogicEnumerationType value) {
        this.doesTradeItemContainLatex = value;
    }

    /**
     * Gets the value of the isTradeItemConsideredGeneric property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsTradeItemConsideredGeneric() {
        return isTradeItemConsideredGeneric;
    }

    /**
     * Sets the value of the isTradeItemConsideredGeneric property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsTradeItemConsideredGeneric(NonBinaryLogicEnumerationType value) {
        this.isTradeItemConsideredGeneric = value;
    }

    /**
     * Gets the value of the prescriptionTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prescriptionTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrescriptionTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrescriptionTypeCodeType }
     * 
     * 
     */
    public List<PrescriptionTypeCodeType> getPrescriptionTypeCode() {
        if (prescriptionTypeCode == null) {
            prescriptionTypeCode = new ArrayList<PrescriptionTypeCodeType>();
        }
        return this.prescriptionTypeCode;
    }

    /**
     * Gets the value of the healthcareItemMaximumUsageAge property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasurementType }
     *     
     */
    public TimeMeasurementType getHealthcareItemMaximumUsageAge() {
        return healthcareItemMaximumUsageAge;
    }

    /**
     * Sets the value of the healthcareItemMaximumUsageAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasurementType }
     *     
     */
    public void setHealthcareItemMaximumUsageAge(TimeMeasurementType value) {
        this.healthcareItemMaximumUsageAge = value;
    }

    /**
     * Gets the value of the healthcareItemMinimumUsageAge property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasurementType }
     *     
     */
    public TimeMeasurementType getHealthcareItemMinimumUsageAge() {
        return healthcareItemMinimumUsageAge;
    }

    /**
     * Sets the value of the healthcareItemMinimumUsageAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasurementType }
     *     
     */
    public void setHealthcareItemMinimumUsageAge(TimeMeasurementType value) {
        this.healthcareItemMinimumUsageAge = value;
    }

    /**
     * Gets the value of the healthcareItemUsageAgeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the healthcareItemUsageAgeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHealthcareItemUsageAgeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getHealthcareItemUsageAgeDescription() {
        if (healthcareItemUsageAgeDescription == null) {
            healthcareItemUsageAgeDescription = new ArrayList<Description500Type>();
        }
        return this.healthcareItemUsageAgeDescription;
    }

    /**
     * Gets the value of the usageDuringBreastFeedingCode property.
     * 
     * @return
     *     possible object is
     *     {@link AllowedUsageCodeType }
     *     
     */
    public AllowedUsageCodeType getUsageDuringBreastFeedingCode() {
        return usageDuringBreastFeedingCode;
    }

    /**
     * Sets the value of the usageDuringBreastFeedingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowedUsageCodeType }
     *     
     */
    public void setUsageDuringBreastFeedingCode(AllowedUsageCodeType value) {
        this.usageDuringBreastFeedingCode = value;
    }

    /**
     * Gets the value of the usageDuringPregnancyCode property.
     * 
     * @return
     *     possible object is
     *     {@link AllowedUsageCodeType }
     *     
     */
    public AllowedUsageCodeType getUsageDuringPregnancyCode() {
        return usageDuringPregnancyCode;
    }

    /**
     * Sets the value of the usageDuringPregnancyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowedUsageCodeType }
     *     
     */
    public void setUsageDuringPregnancyCode(AllowedUsageCodeType value) {
        this.usageDuringPregnancyCode = value;
    }

    /**
     * Gets the value of the clinicallyRelevantCharacteristicOfMedicalDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clinicallyRelevantCharacteristicOfMedicalDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClinicallyRelevantCharacteristicOfMedicalDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClinicallyRelevantCharacteristicOfMedicalDevice() {
        if (clinicallyRelevantCharacteristicOfMedicalDevice == null) {
            clinicallyRelevantCharacteristicOfMedicalDevice = new ArrayList<String>();
        }
        return this.clinicallyRelevantCharacteristicOfMedicalDevice;
    }

    /**
     * Gets the value of the doesTradeItemContainHumanTissue property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getDoesTradeItemContainHumanTissue() {
        return doesTradeItemContainHumanTissue;
    }

    /**
     * Sets the value of the doesTradeItemContainHumanTissue property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setDoesTradeItemContainHumanTissue(NonBinaryLogicEnumerationType value) {
        this.doesTradeItemContainHumanTissue = value;
    }

    /**
     * Gets the value of the healthcareGroupedProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link HealthcareGroupedProductCodeType }
     *     
     */
    public HealthcareGroupedProductCodeType getHealthcareGroupedProductCode() {
        return healthcareGroupedProductCode;
    }

    /**
     * Sets the value of the healthcareGroupedProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthcareGroupedProductCodeType }
     *     
     */
    public void setHealthcareGroupedProductCode(HealthcareGroupedProductCodeType value) {
        this.healthcareGroupedProductCode = value;
    }

    /**
     * Gets the value of the isTradeItemExemptFromSerialisation property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsTradeItemExemptFromSerialisation() {
        return isTradeItemExemptFromSerialisation;
    }

    /**
     * Sets the value of the isTradeItemExemptFromSerialisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsTradeItemExemptFromSerialisation(NonBinaryLogicEnumerationType value) {
        this.isTradeItemExemptFromSerialisation = value;
    }

    /**
     * Gets the value of the doesTradeItemContainMicrobialSubstance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoesTradeItemContainMicrobialSubstance() {
        return doesTradeItemContainMicrobialSubstance;
    }

    /**
     * Sets the value of the doesTradeItemContainMicrobialSubstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoesTradeItemContainMicrobialSubstance(Boolean value) {
        this.doesTradeItemContainMicrobialSubstance = value;
    }

    /**
     * Gets the value of the doesTradeItemContainAnimalTissue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoesTradeItemContainAnimalTissue() {
        return doesTradeItemContainAnimalTissue;
    }

    /**
     * Sets the value of the doesTradeItemContainAnimalTissue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoesTradeItemContainAnimalTissue(Boolean value) {
        this.doesTradeItemContainAnimalTissue = value;
    }

    /**
     * Gets the value of the clinicalStorageHandlingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clinicalStorageHandlingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClinicalStorageHandlingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClinicalStorageHandlingInformationType }
     * 
     * 
     */
    public List<ClinicalStorageHandlingInformationType> getClinicalStorageHandlingInformation() {
        if (clinicalStorageHandlingInformation == null) {
            clinicalStorageHandlingInformation = new ArrayList<ClinicalStorageHandlingInformationType>();
        }
        return this.clinicalStorageHandlingInformation;
    }

    /**
     * Gets the value of the clinicalSize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clinicalSize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClinicalSize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClinicalSizeType }
     * 
     * 
     */
    public List<ClinicalSizeType> getClinicalSize() {
        if (clinicalSize == null) {
            clinicalSize = new ArrayList<ClinicalSizeType>();
        }
        return this.clinicalSize;
    }

    /**
     * Gets the value of the clinicalWarning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clinicalWarning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClinicalWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClinicalWarningType }
     * 
     * 
     */
    public List<ClinicalWarningType> getClinicalWarning() {
        if (clinicalWarning == null) {
            clinicalWarning = new ArrayList<ClinicalWarningType>();
        }
        return this.clinicalWarning;
    }

    /**
     * Gets the value of the routeOfAdministration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeOfAdministration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteOfAdministration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalCodeValueInformationType }
     * 
     * 
     */
    public List<ExternalCodeValueInformationType> getRouteOfAdministration() {
        if (routeOfAdministration == null) {
            routeOfAdministration = new ArrayList<ExternalCodeValueInformationType>();
        }
        return this.routeOfAdministration;
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
