
package gs1.gdsn.safety_data_sheet.xsd._3;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.gdsn.gdsn_common.xsd._3.MeasurementPrecisionCodeType;
import gs1.gdsn.gdsn_common.xsd._3.ReferencedFileInformationType;
import gs1.shared.shared_common.xsd._3.Description1000Type;
import gs1.shared.shared_common.xsd._3.Description5000Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for SafetyDataSheetInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SafetyDataSheetInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accidentalReleaseMeasuresDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="additionalSDSInformation" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="conditionsToAvoid" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ecologicalInformationDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="firstAidProceduresDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hazardousMaterialsHandlingProcedures" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isRegulatedForTransportation" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="noteToPhysician" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sDSSheetNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sDSStandardCode" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}SDSStandardCodeType" minOccurs="0"/&gt;
 *         &lt;element name="sDSStandardVersion" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="storageRequirementsDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="toxicologicalInformationDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="volatileOrganicCompound" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="volatileOrganicCompoundBasis" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="volatileOrganicCompoundPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="isProductClassifiedAsNonHazardous" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="volatileOrganicCompoundPercentMeasurementPrecision" type="{urn:gs1:gdsn:gdsn_common:xsd:3}MeasurementPrecisionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="sDSSheetVersion" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sDSSheetEffectiveDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="chemicalInformation" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}ChemicalInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fireFightingInstructions" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}FireFightingInstructionsType" minOccurs="0"/&gt;
 *         &lt;element name="gHSDetail" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}GHSDetailType" minOccurs="0"/&gt;
 *         &lt;element name="hazardousWasteInformation" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}HazardousWasteInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="physicalChemicalPropertyInformation" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}PhysicalChemicalPropertyInformationType" minOccurs="0"/&gt;
 *         &lt;element name="protectiveEquipment" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}ProtectiveEquipmentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rEACHInformation" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}REACHInformationType" minOccurs="0"/&gt;
 *         &lt;element name="referencedFileInformation" type="{urn:gs1:gdsn:gdsn_common:xsd:3}ReferencedFileInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="storageCompatibilityInformation" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}StorageCompatibilityInformationType" minOccurs="0"/&gt;
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
@XmlType(name = "SafetyDataSheetInformationType", propOrder = {
    "accidentalReleaseMeasuresDescription",
    "additionalSDSInformation",
    "conditionsToAvoid",
    "ecologicalInformationDescription",
    "firstAidProceduresDescription",
    "hazardousMaterialsHandlingProcedures",
    "isRegulatedForTransportation",
    "noteToPhysician",
    "sdsSheetNumber",
    "sdsStandardCode",
    "sdsStandardVersion",
    "storageRequirementsDescription",
    "toxicologicalInformationDescription",
    "volatileOrganicCompound",
    "volatileOrganicCompoundBasis",
    "volatileOrganicCompoundPercent",
    "isProductClassifiedAsNonHazardous",
    "volatileOrganicCompoundPercentMeasurementPrecision",
    "sdsSheetVersion",
    "sdsSheetEffectiveDateTime",
    "chemicalInformation",
    "fireFightingInstructions",
    "ghsDetail",
    "hazardousWasteInformation",
    "physicalChemicalPropertyInformation",
    "protectiveEquipment",
    "reachInformation",
    "referencedFileInformation",
    "storageCompatibilityInformation",
    "avpList"
})
public class SafetyDataSheetInformationType {

    protected List<Description1000Type> accidentalReleaseMeasuresDescription;
    protected List<Description1000Type> additionalSDSInformation;
    protected List<Description1000Type> conditionsToAvoid;
    protected List<Description1000Type> ecologicalInformationDescription;
    protected List<Description5000Type> firstAidProceduresDescription;
    protected List<Description1000Type> hazardousMaterialsHandlingProcedures;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isRegulatedForTransportation;
    protected List<Description1000Type> noteToPhysician;
    @XmlElement(name = "sDSSheetNumber")
    protected String sdsSheetNumber;
    @XmlElement(name = "sDSStandardCode")
    protected SDSStandardCodeType sdsStandardCode;
    @XmlElement(name = "sDSStandardVersion")
    protected String sdsStandardVersion;
    protected List<Description1000Type> storageRequirementsDescription;
    protected List<Description1000Type> toxicologicalInformationDescription;
    protected MeasurementType volatileOrganicCompound;
    protected MeasurementType volatileOrganicCompoundBasis;
    protected BigDecimal volatileOrganicCompoundPercent;
    protected Boolean isProductClassifiedAsNonHazardous;
    protected MeasurementPrecisionCodeType volatileOrganicCompoundPercentMeasurementPrecision;
    @XmlElement(name = "sDSSheetVersion")
    protected String sdsSheetVersion;
    @XmlElement(name = "sDSSheetEffectiveDateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime sdsSheetEffectiveDateTime;
    protected List<ChemicalInformationType> chemicalInformation;
    protected FireFightingInstructionsType fireFightingInstructions;
    @XmlElement(name = "gHSDetail")
    protected GHSDetailType ghsDetail;
    protected List<HazardousWasteInformationType> hazardousWasteInformation;
    protected PhysicalChemicalPropertyInformationType physicalChemicalPropertyInformation;
    protected List<ProtectiveEquipmentType> protectiveEquipment;
    @XmlElement(name = "rEACHInformation")
    protected REACHInformationType reachInformation;
    protected List<ReferencedFileInformationType> referencedFileInformation;
    protected StorageCompatibilityInformationType storageCompatibilityInformation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the accidentalReleaseMeasuresDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accidentalReleaseMeasuresDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccidentalReleaseMeasuresDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getAccidentalReleaseMeasuresDescription() {
        if (accidentalReleaseMeasuresDescription == null) {
            accidentalReleaseMeasuresDescription = new ArrayList<Description1000Type>();
        }
        return this.accidentalReleaseMeasuresDescription;
    }

    /**
     * Gets the value of the additionalSDSInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalSDSInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalSDSInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getAdditionalSDSInformation() {
        if (additionalSDSInformation == null) {
            additionalSDSInformation = new ArrayList<Description1000Type>();
        }
        return this.additionalSDSInformation;
    }

    /**
     * Gets the value of the conditionsToAvoid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditionsToAvoid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditionsToAvoid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getConditionsToAvoid() {
        if (conditionsToAvoid == null) {
            conditionsToAvoid = new ArrayList<Description1000Type>();
        }
        return this.conditionsToAvoid;
    }

    /**
     * Gets the value of the ecologicalInformationDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ecologicalInformationDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEcologicalInformationDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getEcologicalInformationDescription() {
        if (ecologicalInformationDescription == null) {
            ecologicalInformationDescription = new ArrayList<Description1000Type>();
        }
        return this.ecologicalInformationDescription;
    }

    /**
     * Gets the value of the firstAidProceduresDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the firstAidProceduresDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirstAidProceduresDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getFirstAidProceduresDescription() {
        if (firstAidProceduresDescription == null) {
            firstAidProceduresDescription = new ArrayList<Description5000Type>();
        }
        return this.firstAidProceduresDescription;
    }

    /**
     * Gets the value of the hazardousMaterialsHandlingProcedures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousMaterialsHandlingProcedures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousMaterialsHandlingProcedures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getHazardousMaterialsHandlingProcedures() {
        if (hazardousMaterialsHandlingProcedures == null) {
            hazardousMaterialsHandlingProcedures = new ArrayList<Description1000Type>();
        }
        return this.hazardousMaterialsHandlingProcedures;
    }

    /**
     * Gets the value of the isRegulatedForTransportation property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsRegulatedForTransportation() {
        return isRegulatedForTransportation;
    }

    /**
     * Sets the value of the isRegulatedForTransportation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsRegulatedForTransportation(NonBinaryLogicEnumerationType value) {
        this.isRegulatedForTransportation = value;
    }

    /**
     * Gets the value of the noteToPhysician property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noteToPhysician property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoteToPhysician().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getNoteToPhysician() {
        if (noteToPhysician == null) {
            noteToPhysician = new ArrayList<Description1000Type>();
        }
        return this.noteToPhysician;
    }

    /**
     * Gets the value of the sdsSheetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDSSheetNumber() {
        return sdsSheetNumber;
    }

    /**
     * Sets the value of the sdsSheetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDSSheetNumber(String value) {
        this.sdsSheetNumber = value;
    }

    /**
     * Gets the value of the sdsStandardCode property.
     * 
     * @return
     *     possible object is
     *     {@link SDSStandardCodeType }
     *     
     */
    public SDSStandardCodeType getSDSStandardCode() {
        return sdsStandardCode;
    }

    /**
     * Sets the value of the sdsStandardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SDSStandardCodeType }
     *     
     */
    public void setSDSStandardCode(SDSStandardCodeType value) {
        this.sdsStandardCode = value;
    }

    /**
     * Gets the value of the sdsStandardVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDSStandardVersion() {
        return sdsStandardVersion;
    }

    /**
     * Sets the value of the sdsStandardVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDSStandardVersion(String value) {
        this.sdsStandardVersion = value;
    }

    /**
     * Gets the value of the storageRequirementsDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storageRequirementsDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStorageRequirementsDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getStorageRequirementsDescription() {
        if (storageRequirementsDescription == null) {
            storageRequirementsDescription = new ArrayList<Description1000Type>();
        }
        return this.storageRequirementsDescription;
    }

    /**
     * Gets the value of the toxicologicalInformationDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toxicologicalInformationDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToxicologicalInformationDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getToxicologicalInformationDescription() {
        if (toxicologicalInformationDescription == null) {
            toxicologicalInformationDescription = new ArrayList<Description1000Type>();
        }
        return this.toxicologicalInformationDescription;
    }

    /**
     * Gets the value of the volatileOrganicCompound property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getVolatileOrganicCompound() {
        return volatileOrganicCompound;
    }

    /**
     * Sets the value of the volatileOrganicCompound property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setVolatileOrganicCompound(MeasurementType value) {
        this.volatileOrganicCompound = value;
    }

    /**
     * Gets the value of the volatileOrganicCompoundBasis property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getVolatileOrganicCompoundBasis() {
        return volatileOrganicCompoundBasis;
    }

    /**
     * Sets the value of the volatileOrganicCompoundBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setVolatileOrganicCompoundBasis(MeasurementType value) {
        this.volatileOrganicCompoundBasis = value;
    }

    /**
     * Gets the value of the volatileOrganicCompoundPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolatileOrganicCompoundPercent() {
        return volatileOrganicCompoundPercent;
    }

    /**
     * Sets the value of the volatileOrganicCompoundPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolatileOrganicCompoundPercent(BigDecimal value) {
        this.volatileOrganicCompoundPercent = value;
    }

    /**
     * Gets the value of the isProductClassifiedAsNonHazardous property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProductClassifiedAsNonHazardous() {
        return isProductClassifiedAsNonHazardous;
    }

    /**
     * Sets the value of the isProductClassifiedAsNonHazardous property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProductClassifiedAsNonHazardous(Boolean value) {
        this.isProductClassifiedAsNonHazardous = value;
    }

    /**
     * Gets the value of the volatileOrganicCompoundPercentMeasurementPrecision property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public MeasurementPrecisionCodeType getVolatileOrganicCompoundPercentMeasurementPrecision() {
        return volatileOrganicCompoundPercentMeasurementPrecision;
    }

    /**
     * Sets the value of the volatileOrganicCompoundPercentMeasurementPrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public void setVolatileOrganicCompoundPercentMeasurementPrecision(MeasurementPrecisionCodeType value) {
        this.volatileOrganicCompoundPercentMeasurementPrecision = value;
    }

    /**
     * Gets the value of the sdsSheetVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDSSheetVersion() {
        return sdsSheetVersion;
    }

    /**
     * Sets the value of the sdsSheetVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDSSheetVersion(String value) {
        this.sdsSheetVersion = value;
    }

    /**
     * Gets the value of the sdsSheetEffectiveDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getSDSSheetEffectiveDateTime() {
        return sdsSheetEffectiveDateTime;
    }

    /**
     * Sets the value of the sdsSheetEffectiveDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDSSheetEffectiveDateTime(LocalDateTime value) {
        this.sdsSheetEffectiveDateTime = value;
    }

    /**
     * Gets the value of the chemicalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chemicalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChemicalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChemicalInformationType }
     * 
     * 
     */
    public List<ChemicalInformationType> getChemicalInformation() {
        if (chemicalInformation == null) {
            chemicalInformation = new ArrayList<ChemicalInformationType>();
        }
        return this.chemicalInformation;
    }

    /**
     * Gets the value of the fireFightingInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link FireFightingInstructionsType }
     *     
     */
    public FireFightingInstructionsType getFireFightingInstructions() {
        return fireFightingInstructions;
    }

    /**
     * Sets the value of the fireFightingInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link FireFightingInstructionsType }
     *     
     */
    public void setFireFightingInstructions(FireFightingInstructionsType value) {
        this.fireFightingInstructions = value;
    }

    /**
     * Gets the value of the ghsDetail property.
     * 
     * @return
     *     possible object is
     *     {@link GHSDetailType }
     *     
     */
    public GHSDetailType getGHSDetail() {
        return ghsDetail;
    }

    /**
     * Sets the value of the ghsDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link GHSDetailType }
     *     
     */
    public void setGHSDetail(GHSDetailType value) {
        this.ghsDetail = value;
    }

    /**
     * Gets the value of the hazardousWasteInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousWasteInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousWasteInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousWasteInformationType }
     * 
     * 
     */
    public List<HazardousWasteInformationType> getHazardousWasteInformation() {
        if (hazardousWasteInformation == null) {
            hazardousWasteInformation = new ArrayList<HazardousWasteInformationType>();
        }
        return this.hazardousWasteInformation;
    }

    /**
     * Gets the value of the physicalChemicalPropertyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalChemicalPropertyInformationType }
     *     
     */
    public PhysicalChemicalPropertyInformationType getPhysicalChemicalPropertyInformation() {
        return physicalChemicalPropertyInformation;
    }

    /**
     * Sets the value of the physicalChemicalPropertyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalChemicalPropertyInformationType }
     *     
     */
    public void setPhysicalChemicalPropertyInformation(PhysicalChemicalPropertyInformationType value) {
        this.physicalChemicalPropertyInformation = value;
    }

    /**
     * Gets the value of the protectiveEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protectiveEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtectiveEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProtectiveEquipmentType }
     * 
     * 
     */
    public List<ProtectiveEquipmentType> getProtectiveEquipment() {
        if (protectiveEquipment == null) {
            protectiveEquipment = new ArrayList<ProtectiveEquipmentType>();
        }
        return this.protectiveEquipment;
    }

    /**
     * Gets the value of the reachInformation property.
     * 
     * @return
     *     possible object is
     *     {@link REACHInformationType }
     *     
     */
    public REACHInformationType getREACHInformation() {
        return reachInformation;
    }

    /**
     * Sets the value of the reachInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link REACHInformationType }
     *     
     */
    public void setREACHInformation(REACHInformationType value) {
        this.reachInformation = value;
    }

    /**
     * Gets the value of the referencedFileInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencedFileInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencedFileInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencedFileInformationType }
     * 
     * 
     */
    public List<ReferencedFileInformationType> getReferencedFileInformation() {
        if (referencedFileInformation == null) {
            referencedFileInformation = new ArrayList<ReferencedFileInformationType>();
        }
        return this.referencedFileInformation;
    }

    /**
     * Gets the value of the storageCompatibilityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link StorageCompatibilityInformationType }
     *     
     */
    public StorageCompatibilityInformationType getStorageCompatibilityInformation() {
        return storageCompatibilityInformation;
    }

    /**
     * Sets the value of the storageCompatibilityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageCompatibilityInformationType }
     *     
     */
    public void setStorageCompatibilityInformation(StorageCompatibilityInformationType value) {
        this.storageCompatibilityInformation = value;
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
