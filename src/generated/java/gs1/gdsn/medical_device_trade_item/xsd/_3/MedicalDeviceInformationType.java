
package gs1.gdsn.medical_device_trade_item.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.Description5000Type;
import gs1.shared.shared_common.xsd._3.IdentifierType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for MedicalDeviceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicalDeviceInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isTradeItemImplantable" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="mRICompatibilityCode" type="{urn:gs1:gdsn:medical_device_trade_item:xsd:3}MRICompatibilityCodeType" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemExemptFromDirectPartMarking" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="udidDeviceCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="directPartMarkingIdentifier" type="{urn:gs1:shared:shared_common:xsd:3}IdentifierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isExemptFromPremarketAuthorisation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="hasDeviceMeasuringFunction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isActiveDevice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isDeviceReagent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isDeviceCompanionDiagnostic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isDeviceDesignedForProfessionalTesting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isDeviceInstrument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isDeviceIntendedToAdministerOrRemoveMedicinalProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isDeviceMedicinalProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isDeviceNearPatientTesting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isDevicePatientSelfTesting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isDeviceExemptFromImplantObligations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isReprocessedSingleUseDevice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isNewDevice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isReusableSurgicalInstrument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="systemOrProcedurePackMedicalPurposeDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="uDIProductionIdentifierTypeCode" type="{urn:gs1:gdsn:medical_device_trade_item:xsd:3}UDIProductionIdentifierTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="annexXVIIntendedPurposeTypeCode" type="{urn:gs1:gdsn:medical_device_trade_item:xsd:3}AnnexXVIIntendedPurposeTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="multiComponentDeviceTypeCode" type="{urn:gs1:gdsn:medical_device_trade_item:xsd:3}MultiComponentDeviceTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="specialDeviceTypeCode" type="{urn:gs1:gdsn:medical_device_trade_item:xsd:3}SpecialDeviceTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="systemOrProcedurePackTypeCode" type="{urn:gs1:gdsn:medical_device_trade_item:xsd:3}SystemOrProcedurePackTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="eUMedicalDeviceStatusCode" type="{urn:gs1:gdsn:medical_device_trade_item:xsd:3}EUMedicalDeviceStatusCodeType" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemUDIDILevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isProductResistantToSurfaceTensionReducingAgent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="healthcareTradeItemReusabilityInformation" type="{urn:gs1:gdsn:medical_device_trade_item:xsd:3}HealthcareTradeItemReusabilityInformationType" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemSterilityInformation" type="{urn:gs1:gdsn:medical_device_trade_item:xsd:3}TradeItemSterilityInformationType" minOccurs="0"/&gt;
 *         &lt;element name="medicalDeviceSubStatusInformation" type="{urn:gs1:gdsn:medical_device_trade_item:xsd:3}MedicalDeviceSubStatusInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "MedicalDeviceInformationType", propOrder = {
    "isTradeItemImplantable",
    "mriCompatibilityCode",
    "isTradeItemExemptFromDirectPartMarking",
    "udidDeviceCount",
    "directPartMarkingIdentifier",
    "isExemptFromPremarketAuthorisation",
    "hasDeviceMeasuringFunction",
    "isActiveDevice",
    "isDeviceReagent",
    "isDeviceCompanionDiagnostic",
    "isDeviceDesignedForProfessionalTesting",
    "isDeviceInstrument",
    "isDeviceIntendedToAdministerOrRemoveMedicinalProduct",
    "isDeviceMedicinalProduct",
    "isDeviceNearPatientTesting",
    "isDevicePatientSelfTesting",
    "isDeviceExemptFromImplantObligations",
    "isReprocessedSingleUseDevice",
    "isNewDevice",
    "isReusableSurgicalInstrument",
    "systemOrProcedurePackMedicalPurposeDescription",
    "udiProductionIdentifierTypeCode",
    "annexXVIIntendedPurposeTypeCode",
    "multiComponentDeviceTypeCode",
    "specialDeviceTypeCode",
    "systemOrProcedurePackTypeCode",
    "euMedicalDeviceStatusCode",
    "isTradeItemUDIDILevel",
    "isProductResistantToSurfaceTensionReducingAgent",
    "healthcareTradeItemReusabilityInformation",
    "tradeItemSterilityInformation",
    "medicalDeviceSubStatusInformation",
    "avpList"
})
public class MedicalDeviceInformationType {

    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isTradeItemImplantable;
    @XmlElement(name = "mRICompatibilityCode")
    protected MRICompatibilityCodeType mriCompatibilityCode;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isTradeItemExemptFromDirectPartMarking;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger udidDeviceCount;
    protected List<IdentifierType> directPartMarkingIdentifier;
    protected Boolean isExemptFromPremarketAuthorisation;
    protected Boolean hasDeviceMeasuringFunction;
    protected Boolean isActiveDevice;
    protected Boolean isDeviceReagent;
    protected Boolean isDeviceCompanionDiagnostic;
    protected Boolean isDeviceDesignedForProfessionalTesting;
    protected Boolean isDeviceInstrument;
    protected Boolean isDeviceIntendedToAdministerOrRemoveMedicinalProduct;
    protected Boolean isDeviceMedicinalProduct;
    protected Boolean isDeviceNearPatientTesting;
    protected Boolean isDevicePatientSelfTesting;
    protected Boolean isDeviceExemptFromImplantObligations;
    protected Boolean isReprocessedSingleUseDevice;
    protected Boolean isNewDevice;
    protected Boolean isReusableSurgicalInstrument;
    protected List<Description5000Type> systemOrProcedurePackMedicalPurposeDescription;
    @XmlElement(name = "uDIProductionIdentifierTypeCode")
    protected List<UDIProductionIdentifierTypeCodeType> udiProductionIdentifierTypeCode;
    protected List<AnnexXVIIntendedPurposeTypeCodeType> annexXVIIntendedPurposeTypeCode;
    protected MultiComponentDeviceTypeCodeType multiComponentDeviceTypeCode;
    protected SpecialDeviceTypeCodeType specialDeviceTypeCode;
    protected SystemOrProcedurePackTypeCodeType systemOrProcedurePackTypeCode;
    @XmlElement(name = "eUMedicalDeviceStatusCode")
    protected EUMedicalDeviceStatusCodeType euMedicalDeviceStatusCode;
    protected Boolean isTradeItemUDIDILevel;
    protected Boolean isProductResistantToSurfaceTensionReducingAgent;
    protected HealthcareTradeItemReusabilityInformationType healthcareTradeItemReusabilityInformation;
    protected TradeItemSterilityInformationType tradeItemSterilityInformation;
    protected List<MedicalDeviceSubStatusInformationType> medicalDeviceSubStatusInformation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the isTradeItemImplantable property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsTradeItemImplantable() {
        return isTradeItemImplantable;
    }

    /**
     * Sets the value of the isTradeItemImplantable property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsTradeItemImplantable(NonBinaryLogicEnumerationType value) {
        this.isTradeItemImplantable = value;
    }

    /**
     * Gets the value of the mriCompatibilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link MRICompatibilityCodeType }
     *     
     */
    public MRICompatibilityCodeType getMRICompatibilityCode() {
        return mriCompatibilityCode;
    }

    /**
     * Sets the value of the mriCompatibilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MRICompatibilityCodeType }
     *     
     */
    public void setMRICompatibilityCode(MRICompatibilityCodeType value) {
        this.mriCompatibilityCode = value;
    }

    /**
     * Gets the value of the isTradeItemExemptFromDirectPartMarking property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsTradeItemExemptFromDirectPartMarking() {
        return isTradeItemExemptFromDirectPartMarking;
    }

    /**
     * Sets the value of the isTradeItemExemptFromDirectPartMarking property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsTradeItemExemptFromDirectPartMarking(NonBinaryLogicEnumerationType value) {
        this.isTradeItemExemptFromDirectPartMarking = value;
    }

    /**
     * Gets the value of the udidDeviceCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUdidDeviceCount() {
        return udidDeviceCount;
    }

    /**
     * Sets the value of the udidDeviceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUdidDeviceCount(BigInteger value) {
        this.udidDeviceCount = value;
    }

    /**
     * Gets the value of the directPartMarkingIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directPartMarkingIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectPartMarkingIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getDirectPartMarkingIdentifier() {
        if (directPartMarkingIdentifier == null) {
            directPartMarkingIdentifier = new ArrayList<IdentifierType>();
        }
        return this.directPartMarkingIdentifier;
    }

    /**
     * Gets the value of the isExemptFromPremarketAuthorisation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExemptFromPremarketAuthorisation() {
        return isExemptFromPremarketAuthorisation;
    }

    /**
     * Sets the value of the isExemptFromPremarketAuthorisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExemptFromPremarketAuthorisation(Boolean value) {
        this.isExemptFromPremarketAuthorisation = value;
    }

    /**
     * Gets the value of the hasDeviceMeasuringFunction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasDeviceMeasuringFunction() {
        return hasDeviceMeasuringFunction;
    }

    /**
     * Sets the value of the hasDeviceMeasuringFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasDeviceMeasuringFunction(Boolean value) {
        this.hasDeviceMeasuringFunction = value;
    }

    /**
     * Gets the value of the isActiveDevice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActiveDevice() {
        return isActiveDevice;
    }

    /**
     * Sets the value of the isActiveDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActiveDevice(Boolean value) {
        this.isActiveDevice = value;
    }

    /**
     * Gets the value of the isDeviceReagent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeviceReagent() {
        return isDeviceReagent;
    }

    /**
     * Sets the value of the isDeviceReagent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeviceReagent(Boolean value) {
        this.isDeviceReagent = value;
    }

    /**
     * Gets the value of the isDeviceCompanionDiagnostic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeviceCompanionDiagnostic() {
        return isDeviceCompanionDiagnostic;
    }

    /**
     * Sets the value of the isDeviceCompanionDiagnostic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeviceCompanionDiagnostic(Boolean value) {
        this.isDeviceCompanionDiagnostic = value;
    }

    /**
     * Gets the value of the isDeviceDesignedForProfessionalTesting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeviceDesignedForProfessionalTesting() {
        return isDeviceDesignedForProfessionalTesting;
    }

    /**
     * Sets the value of the isDeviceDesignedForProfessionalTesting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeviceDesignedForProfessionalTesting(Boolean value) {
        this.isDeviceDesignedForProfessionalTesting = value;
    }

    /**
     * Gets the value of the isDeviceInstrument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeviceInstrument() {
        return isDeviceInstrument;
    }

    /**
     * Sets the value of the isDeviceInstrument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeviceInstrument(Boolean value) {
        this.isDeviceInstrument = value;
    }

    /**
     * Gets the value of the isDeviceIntendedToAdministerOrRemoveMedicinalProduct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeviceIntendedToAdministerOrRemoveMedicinalProduct() {
        return isDeviceIntendedToAdministerOrRemoveMedicinalProduct;
    }

    /**
     * Sets the value of the isDeviceIntendedToAdministerOrRemoveMedicinalProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeviceIntendedToAdministerOrRemoveMedicinalProduct(Boolean value) {
        this.isDeviceIntendedToAdministerOrRemoveMedicinalProduct = value;
    }

    /**
     * Gets the value of the isDeviceMedicinalProduct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeviceMedicinalProduct() {
        return isDeviceMedicinalProduct;
    }

    /**
     * Sets the value of the isDeviceMedicinalProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeviceMedicinalProduct(Boolean value) {
        this.isDeviceMedicinalProduct = value;
    }

    /**
     * Gets the value of the isDeviceNearPatientTesting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeviceNearPatientTesting() {
        return isDeviceNearPatientTesting;
    }

    /**
     * Sets the value of the isDeviceNearPatientTesting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeviceNearPatientTesting(Boolean value) {
        this.isDeviceNearPatientTesting = value;
    }

    /**
     * Gets the value of the isDevicePatientSelfTesting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDevicePatientSelfTesting() {
        return isDevicePatientSelfTesting;
    }

    /**
     * Sets the value of the isDevicePatientSelfTesting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDevicePatientSelfTesting(Boolean value) {
        this.isDevicePatientSelfTesting = value;
    }

    /**
     * Gets the value of the isDeviceExemptFromImplantObligations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeviceExemptFromImplantObligations() {
        return isDeviceExemptFromImplantObligations;
    }

    /**
     * Sets the value of the isDeviceExemptFromImplantObligations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeviceExemptFromImplantObligations(Boolean value) {
        this.isDeviceExemptFromImplantObligations = value;
    }

    /**
     * Gets the value of the isReprocessedSingleUseDevice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReprocessedSingleUseDevice() {
        return isReprocessedSingleUseDevice;
    }

    /**
     * Sets the value of the isReprocessedSingleUseDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReprocessedSingleUseDevice(Boolean value) {
        this.isReprocessedSingleUseDevice = value;
    }

    /**
     * Gets the value of the isNewDevice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNewDevice() {
        return isNewDevice;
    }

    /**
     * Sets the value of the isNewDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNewDevice(Boolean value) {
        this.isNewDevice = value;
    }

    /**
     * Gets the value of the isReusableSurgicalInstrument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReusableSurgicalInstrument() {
        return isReusableSurgicalInstrument;
    }

    /**
     * Sets the value of the isReusableSurgicalInstrument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReusableSurgicalInstrument(Boolean value) {
        this.isReusableSurgicalInstrument = value;
    }

    /**
     * Gets the value of the systemOrProcedurePackMedicalPurposeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemOrProcedurePackMedicalPurposeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemOrProcedurePackMedicalPurposeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getSystemOrProcedurePackMedicalPurposeDescription() {
        if (systemOrProcedurePackMedicalPurposeDescription == null) {
            systemOrProcedurePackMedicalPurposeDescription = new ArrayList<Description5000Type>();
        }
        return this.systemOrProcedurePackMedicalPurposeDescription;
    }

    /**
     * Gets the value of the udiProductionIdentifierTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the udiProductionIdentifierTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUDIProductionIdentifierTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDIProductionIdentifierTypeCodeType }
     * 
     * 
     */
    public List<UDIProductionIdentifierTypeCodeType> getUDIProductionIdentifierTypeCode() {
        if (udiProductionIdentifierTypeCode == null) {
            udiProductionIdentifierTypeCode = new ArrayList<UDIProductionIdentifierTypeCodeType>();
        }
        return this.udiProductionIdentifierTypeCode;
    }

    /**
     * Gets the value of the annexXVIIntendedPurposeTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annexXVIIntendedPurposeTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnexXVIIntendedPurposeTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnnexXVIIntendedPurposeTypeCodeType }
     * 
     * 
     */
    public List<AnnexXVIIntendedPurposeTypeCodeType> getAnnexXVIIntendedPurposeTypeCode() {
        if (annexXVIIntendedPurposeTypeCode == null) {
            annexXVIIntendedPurposeTypeCode = new ArrayList<AnnexXVIIntendedPurposeTypeCodeType>();
        }
        return this.annexXVIIntendedPurposeTypeCode;
    }

    /**
     * Gets the value of the multiComponentDeviceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link MultiComponentDeviceTypeCodeType }
     *     
     */
    public MultiComponentDeviceTypeCodeType getMultiComponentDeviceTypeCode() {
        return multiComponentDeviceTypeCode;
    }

    /**
     * Sets the value of the multiComponentDeviceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiComponentDeviceTypeCodeType }
     *     
     */
    public void setMultiComponentDeviceTypeCode(MultiComponentDeviceTypeCodeType value) {
        this.multiComponentDeviceTypeCode = value;
    }

    /**
     * Gets the value of the specialDeviceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialDeviceTypeCodeType }
     *     
     */
    public SpecialDeviceTypeCodeType getSpecialDeviceTypeCode() {
        return specialDeviceTypeCode;
    }

    /**
     * Sets the value of the specialDeviceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialDeviceTypeCodeType }
     *     
     */
    public void setSpecialDeviceTypeCode(SpecialDeviceTypeCodeType value) {
        this.specialDeviceTypeCode = value;
    }

    /**
     * Gets the value of the systemOrProcedurePackTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link SystemOrProcedurePackTypeCodeType }
     *     
     */
    public SystemOrProcedurePackTypeCodeType getSystemOrProcedurePackTypeCode() {
        return systemOrProcedurePackTypeCode;
    }

    /**
     * Sets the value of the systemOrProcedurePackTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemOrProcedurePackTypeCodeType }
     *     
     */
    public void setSystemOrProcedurePackTypeCode(SystemOrProcedurePackTypeCodeType value) {
        this.systemOrProcedurePackTypeCode = value;
    }

    /**
     * Gets the value of the euMedicalDeviceStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link EUMedicalDeviceStatusCodeType }
     *     
     */
    public EUMedicalDeviceStatusCodeType getEUMedicalDeviceStatusCode() {
        return euMedicalDeviceStatusCode;
    }

    /**
     * Sets the value of the euMedicalDeviceStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUMedicalDeviceStatusCodeType }
     *     
     */
    public void setEUMedicalDeviceStatusCode(EUMedicalDeviceStatusCodeType value) {
        this.euMedicalDeviceStatusCode = value;
    }

    /**
     * Gets the value of the isTradeItemUDIDILevel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTradeItemUDIDILevel() {
        return isTradeItemUDIDILevel;
    }

    /**
     * Sets the value of the isTradeItemUDIDILevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTradeItemUDIDILevel(Boolean value) {
        this.isTradeItemUDIDILevel = value;
    }

    /**
     * Gets the value of the isProductResistantToSurfaceTensionReducingAgent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProductResistantToSurfaceTensionReducingAgent() {
        return isProductResistantToSurfaceTensionReducingAgent;
    }

    /**
     * Sets the value of the isProductResistantToSurfaceTensionReducingAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProductResistantToSurfaceTensionReducingAgent(Boolean value) {
        this.isProductResistantToSurfaceTensionReducingAgent = value;
    }

    /**
     * Gets the value of the healthcareTradeItemReusabilityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HealthcareTradeItemReusabilityInformationType }
     *     
     */
    public HealthcareTradeItemReusabilityInformationType getHealthcareTradeItemReusabilityInformation() {
        return healthcareTradeItemReusabilityInformation;
    }

    /**
     * Sets the value of the healthcareTradeItemReusabilityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthcareTradeItemReusabilityInformationType }
     *     
     */
    public void setHealthcareTradeItemReusabilityInformation(HealthcareTradeItemReusabilityInformationType value) {
        this.healthcareTradeItemReusabilityInformation = value;
    }

    /**
     * Gets the value of the tradeItemSterilityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemSterilityInformationType }
     *     
     */
    public TradeItemSterilityInformationType getTradeItemSterilityInformation() {
        return tradeItemSterilityInformation;
    }

    /**
     * Sets the value of the tradeItemSterilityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemSterilityInformationType }
     *     
     */
    public void setTradeItemSterilityInformation(TradeItemSterilityInformationType value) {
        this.tradeItemSterilityInformation = value;
    }

    /**
     * Gets the value of the medicalDeviceSubStatusInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medicalDeviceSubStatusInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedicalDeviceSubStatusInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicalDeviceSubStatusInformationType }
     * 
     * 
     */
    public List<MedicalDeviceSubStatusInformationType> getMedicalDeviceSubStatusInformation() {
        if (medicalDeviceSubStatusInformation == null) {
            medicalDeviceSubStatusInformation = new ArrayList<MedicalDeviceSubStatusInformationType>();
        }
        return this.medicalDeviceSubStatusInformation;
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
