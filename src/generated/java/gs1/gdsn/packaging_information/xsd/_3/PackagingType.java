
package gs1.gdsn.packaging_information.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.gdsn.gdsn_common.xsd._3.SustainabilityFeatureCodeType;
import gs1.shared.shared_common.xsd._3.CodeType;
import gs1.shared.shared_common.xsd._3.Description200Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for PackagingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="averageDistanceTravelledToPointOfPackagingCode" type="{urn:gs1:gdsn:packaging_information:xsd:3}AverageDistanceToPointOfPackagingCodeType" minOccurs="0"/&gt;
 *         &lt;element name="doesPackagingHaveWheels" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="isPackagingExemptFromRefuseObligation" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="isPackagingSuitableForAirShipment" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="isRadioFrequencyIDOnPackaging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="packagingFeatureCode" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackagingFeatureCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingFunctionCode" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackagingFunctionCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingLevel" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="packagingOwnerIdentification" type="{urn:gs1:shared:shared_common:xsd:3}GLNType" minOccurs="0"/&gt;
 *         &lt;element name="packagingOwnerName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="packagingRecyclingProcessTypeCode" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackagingRecyclingProcessTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingRecyclingSchemeCode" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackagingRecyclingSchemeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingRefundObligationName" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="packagingRefuseObligationName" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="packagingShapeCode" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackagingShapeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="packagingSustainabilityFeatureCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}SustainabilityFeatureCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingTermsAndConditionsCode" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackagingTermsAndConditionsCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingTypeCode" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackageTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="packagingWeight" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="platformTermsAndConditionsCode" type="{urn:gs1:gdsn:packaging_information:xsd:3}PlatformTermsAndConditionsCodeType" minOccurs="0"/&gt;
 *         &lt;element name="platformTypeCode" type="{urn:gs1:gdsn:packaging_information:xsd:3}PlatformTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="usableProductVolume" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="packagingMaterial" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackagingMaterialType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingDimension" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackagingDimensionType" minOccurs="0"/&gt;
 *         &lt;element name="packageDeposit" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackageDepositType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="returnableAsset" type="{urn:gs1:gdsn:packaging_information:xsd:3}ReturnableAssetType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingTypeDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isPackagingReturnable" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="industrySpecificPackagingTypeCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="packagingDividerInformation" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackagingDividerInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="numberOfUnitInShippingContainer" type="{urn:gs1:gdsn:packaging_information:xsd:3}NumberOfUnitInShippingContainerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingRecyclabilityAssessmentInformation" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackagingRecyclabilityAssessmentInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingClaims" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackagingClaimsType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PackagingType", propOrder = {
    "averageDistanceTravelledToPointOfPackagingCode",
    "doesPackagingHaveWheels",
    "isPackagingExemptFromRefuseObligation",
    "isPackagingSuitableForAirShipment",
    "isRadioFrequencyIDOnPackaging",
    "packagingFeatureCode",
    "packagingFunctionCode",
    "packagingLevel",
    "packagingOwnerIdentification",
    "packagingOwnerName",
    "packagingRecyclingProcessTypeCode",
    "packagingRecyclingSchemeCode",
    "packagingRefundObligationName",
    "packagingRefuseObligationName",
    "packagingShapeCode",
    "packagingSustainabilityFeatureCode",
    "packagingTermsAndConditionsCode",
    "packagingTypeCode",
    "packagingWeight",
    "platformTermsAndConditionsCode",
    "platformTypeCode",
    "usableProductVolume",
    "packagingMaterial",
    "packagingDimension",
    "packageDeposit",
    "returnableAsset",
    "packagingTypeDescription",
    "isPackagingReturnable",
    "industrySpecificPackagingTypeCodeReference",
    "packagingDividerInformation",
    "numberOfUnitInShippingContainer",
    "packagingRecyclabilityAssessmentInformation",
    "packagingClaims",
    "avpList"
})
public class PackagingType {

    protected AverageDistanceToPointOfPackagingCodeType averageDistanceTravelledToPointOfPackagingCode;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType doesPackagingHaveWheels;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isPackagingExemptFromRefuseObligation;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isPackagingSuitableForAirShipment;
    protected Boolean isRadioFrequencyIDOnPackaging;
    protected List<PackagingFeatureCodeType> packagingFeatureCode;
    protected List<PackagingFunctionCodeType> packagingFunctionCode;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger packagingLevel;
    protected String packagingOwnerIdentification;
    protected String packagingOwnerName;
    protected List<PackagingRecyclingProcessTypeCodeType> packagingRecyclingProcessTypeCode;
    protected List<PackagingRecyclingSchemeCodeType> packagingRecyclingSchemeCode;
    protected List<String> packagingRefundObligationName;
    protected List<String> packagingRefuseObligationName;
    protected PackagingShapeCodeType packagingShapeCode;
    protected List<SustainabilityFeatureCodeType> packagingSustainabilityFeatureCode;
    protected List<PackagingTermsAndConditionsCodeType> packagingTermsAndConditionsCode;
    protected PackageTypeCodeType packagingTypeCode;
    protected MeasurementType packagingWeight;
    protected PlatformTermsAndConditionsCodeType platformTermsAndConditionsCode;
    protected PlatformTypeCodeType platformTypeCode;
    protected MeasurementType usableProductVolume;
    protected List<PackagingMaterialType> packagingMaterial;
    protected PackagingDimensionType packagingDimension;
    protected List<PackageDepositType> packageDeposit;
    protected List<ReturnableAssetType> returnableAsset;
    protected List<Description200Type> packagingTypeDescription;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isPackagingReturnable;
    protected CodeType industrySpecificPackagingTypeCodeReference;
    protected List<PackagingDividerInformationType> packagingDividerInformation;
    protected List<NumberOfUnitInShippingContainerType> numberOfUnitInShippingContainer;
    protected List<PackagingRecyclabilityAssessmentInformationType> packagingRecyclabilityAssessmentInformation;
    protected List<PackagingClaimsType> packagingClaims;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the averageDistanceTravelledToPointOfPackagingCode property.
     * 
     * @return
     *     possible object is
     *     {@link AverageDistanceToPointOfPackagingCodeType }
     *     
     */
    public AverageDistanceToPointOfPackagingCodeType getAverageDistanceTravelledToPointOfPackagingCode() {
        return averageDistanceTravelledToPointOfPackagingCode;
    }

    /**
     * Sets the value of the averageDistanceTravelledToPointOfPackagingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AverageDistanceToPointOfPackagingCodeType }
     *     
     */
    public void setAverageDistanceTravelledToPointOfPackagingCode(AverageDistanceToPointOfPackagingCodeType value) {
        this.averageDistanceTravelledToPointOfPackagingCode = value;
    }

    /**
     * Gets the value of the doesPackagingHaveWheels property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getDoesPackagingHaveWheels() {
        return doesPackagingHaveWheels;
    }

    /**
     * Sets the value of the doesPackagingHaveWheels property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setDoesPackagingHaveWheels(NonBinaryLogicEnumerationType value) {
        this.doesPackagingHaveWheels = value;
    }

    /**
     * Gets the value of the isPackagingExemptFromRefuseObligation property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsPackagingExemptFromRefuseObligation() {
        return isPackagingExemptFromRefuseObligation;
    }

    /**
     * Sets the value of the isPackagingExemptFromRefuseObligation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsPackagingExemptFromRefuseObligation(NonBinaryLogicEnumerationType value) {
        this.isPackagingExemptFromRefuseObligation = value;
    }

    /**
     * Gets the value of the isPackagingSuitableForAirShipment property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsPackagingSuitableForAirShipment() {
        return isPackagingSuitableForAirShipment;
    }

    /**
     * Sets the value of the isPackagingSuitableForAirShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsPackagingSuitableForAirShipment(NonBinaryLogicEnumerationType value) {
        this.isPackagingSuitableForAirShipment = value;
    }

    /**
     * Gets the value of the isRadioFrequencyIDOnPackaging property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRadioFrequencyIDOnPackaging() {
        return isRadioFrequencyIDOnPackaging;
    }

    /**
     * Sets the value of the isRadioFrequencyIDOnPackaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRadioFrequencyIDOnPackaging(Boolean value) {
        this.isRadioFrequencyIDOnPackaging = value;
    }

    /**
     * Gets the value of the packagingFeatureCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingFeatureCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingFeatureCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingFeatureCodeType }
     * 
     * 
     */
    public List<PackagingFeatureCodeType> getPackagingFeatureCode() {
        if (packagingFeatureCode == null) {
            packagingFeatureCode = new ArrayList<PackagingFeatureCodeType>();
        }
        return this.packagingFeatureCode;
    }

    /**
     * Gets the value of the packagingFunctionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingFunctionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingFunctionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingFunctionCodeType }
     * 
     * 
     */
    public List<PackagingFunctionCodeType> getPackagingFunctionCode() {
        if (packagingFunctionCode == null) {
            packagingFunctionCode = new ArrayList<PackagingFunctionCodeType>();
        }
        return this.packagingFunctionCode;
    }

    /**
     * Gets the value of the packagingLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPackagingLevel() {
        return packagingLevel;
    }

    /**
     * Sets the value of the packagingLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPackagingLevel(BigInteger value) {
        this.packagingLevel = value;
    }

    /**
     * Gets the value of the packagingOwnerIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagingOwnerIdentification() {
        return packagingOwnerIdentification;
    }

    /**
     * Sets the value of the packagingOwnerIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagingOwnerIdentification(String value) {
        this.packagingOwnerIdentification = value;
    }

    /**
     * Gets the value of the packagingOwnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagingOwnerName() {
        return packagingOwnerName;
    }

    /**
     * Sets the value of the packagingOwnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagingOwnerName(String value) {
        this.packagingOwnerName = value;
    }

    /**
     * Gets the value of the packagingRecyclingProcessTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingRecyclingProcessTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingRecyclingProcessTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingRecyclingProcessTypeCodeType }
     * 
     * 
     */
    public List<PackagingRecyclingProcessTypeCodeType> getPackagingRecyclingProcessTypeCode() {
        if (packagingRecyclingProcessTypeCode == null) {
            packagingRecyclingProcessTypeCode = new ArrayList<PackagingRecyclingProcessTypeCodeType>();
        }
        return this.packagingRecyclingProcessTypeCode;
    }

    /**
     * Gets the value of the packagingRecyclingSchemeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingRecyclingSchemeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingRecyclingSchemeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingRecyclingSchemeCodeType }
     * 
     * 
     */
    public List<PackagingRecyclingSchemeCodeType> getPackagingRecyclingSchemeCode() {
        if (packagingRecyclingSchemeCode == null) {
            packagingRecyclingSchemeCode = new ArrayList<PackagingRecyclingSchemeCodeType>();
        }
        return this.packagingRecyclingSchemeCode;
    }

    /**
     * Gets the value of the packagingRefundObligationName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingRefundObligationName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingRefundObligationName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPackagingRefundObligationName() {
        if (packagingRefundObligationName == null) {
            packagingRefundObligationName = new ArrayList<String>();
        }
        return this.packagingRefundObligationName;
    }

    /**
     * Gets the value of the packagingRefuseObligationName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingRefuseObligationName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingRefuseObligationName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPackagingRefuseObligationName() {
        if (packagingRefuseObligationName == null) {
            packagingRefuseObligationName = new ArrayList<String>();
        }
        return this.packagingRefuseObligationName;
    }

    /**
     * Gets the value of the packagingShapeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingShapeCodeType }
     *     
     */
    public PackagingShapeCodeType getPackagingShapeCode() {
        return packagingShapeCode;
    }

    /**
     * Sets the value of the packagingShapeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingShapeCodeType }
     *     
     */
    public void setPackagingShapeCode(PackagingShapeCodeType value) {
        this.packagingShapeCode = value;
    }

    /**
     * Gets the value of the packagingSustainabilityFeatureCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingSustainabilityFeatureCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingSustainabilityFeatureCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SustainabilityFeatureCodeType }
     * 
     * 
     */
    public List<SustainabilityFeatureCodeType> getPackagingSustainabilityFeatureCode() {
        if (packagingSustainabilityFeatureCode == null) {
            packagingSustainabilityFeatureCode = new ArrayList<SustainabilityFeatureCodeType>();
        }
        return this.packagingSustainabilityFeatureCode;
    }

    /**
     * Gets the value of the packagingTermsAndConditionsCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingTermsAndConditionsCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingTermsAndConditionsCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingTermsAndConditionsCodeType }
     * 
     * 
     */
    public List<PackagingTermsAndConditionsCodeType> getPackagingTermsAndConditionsCode() {
        if (packagingTermsAndConditionsCode == null) {
            packagingTermsAndConditionsCode = new ArrayList<PackagingTermsAndConditionsCodeType>();
        }
        return this.packagingTermsAndConditionsCode;
    }

    /**
     * Gets the value of the packagingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackageTypeCodeType }
     *     
     */
    public PackageTypeCodeType getPackagingTypeCode() {
        return packagingTypeCode;
    }

    /**
     * Sets the value of the packagingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageTypeCodeType }
     *     
     */
    public void setPackagingTypeCode(PackageTypeCodeType value) {
        this.packagingTypeCode = value;
    }

    /**
     * Gets the value of the packagingWeight property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getPackagingWeight() {
        return packagingWeight;
    }

    /**
     * Sets the value of the packagingWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setPackagingWeight(MeasurementType value) {
        this.packagingWeight = value;
    }

    /**
     * Gets the value of the platformTermsAndConditionsCode property.
     * 
     * @return
     *     possible object is
     *     {@link PlatformTermsAndConditionsCodeType }
     *     
     */
    public PlatformTermsAndConditionsCodeType getPlatformTermsAndConditionsCode() {
        return platformTermsAndConditionsCode;
    }

    /**
     * Sets the value of the platformTermsAndConditionsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformTermsAndConditionsCodeType }
     *     
     */
    public void setPlatformTermsAndConditionsCode(PlatformTermsAndConditionsCodeType value) {
        this.platformTermsAndConditionsCode = value;
    }

    /**
     * Gets the value of the platformTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PlatformTypeCodeType }
     *     
     */
    public PlatformTypeCodeType getPlatformTypeCode() {
        return platformTypeCode;
    }

    /**
     * Sets the value of the platformTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformTypeCodeType }
     *     
     */
    public void setPlatformTypeCode(PlatformTypeCodeType value) {
        this.platformTypeCode = value;
    }

    /**
     * Gets the value of the usableProductVolume property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getUsableProductVolume() {
        return usableProductVolume;
    }

    /**
     * Sets the value of the usableProductVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setUsableProductVolume(MeasurementType value) {
        this.usableProductVolume = value;
    }

    /**
     * Gets the value of the packagingMaterial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingMaterial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingMaterialType }
     * 
     * 
     */
    public List<PackagingMaterialType> getPackagingMaterial() {
        if (packagingMaterial == null) {
            packagingMaterial = new ArrayList<PackagingMaterialType>();
        }
        return this.packagingMaterial;
    }

    /**
     * Gets the value of the packagingDimension property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingDimensionType }
     *     
     */
    public PackagingDimensionType getPackagingDimension() {
        return packagingDimension;
    }

    /**
     * Sets the value of the packagingDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingDimensionType }
     *     
     */
    public void setPackagingDimension(PackagingDimensionType value) {
        this.packagingDimension = value;
    }

    /**
     * Gets the value of the packageDeposit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageDeposit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageDeposit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageDepositType }
     * 
     * 
     */
    public List<PackageDepositType> getPackageDeposit() {
        if (packageDeposit == null) {
            packageDeposit = new ArrayList<PackageDepositType>();
        }
        return this.packageDeposit;
    }

    /**
     * Gets the value of the returnableAsset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnableAsset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnableAsset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnableAssetType }
     * 
     * 
     */
    public List<ReturnableAssetType> getReturnableAsset() {
        if (returnableAsset == null) {
            returnableAsset = new ArrayList<ReturnableAssetType>();
        }
        return this.returnableAsset;
    }

    /**
     * Gets the value of the packagingTypeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingTypeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingTypeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description200Type }
     * 
     * 
     */
    public List<Description200Type> getPackagingTypeDescription() {
        if (packagingTypeDescription == null) {
            packagingTypeDescription = new ArrayList<Description200Type>();
        }
        return this.packagingTypeDescription;
    }

    /**
     * Gets the value of the isPackagingReturnable property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsPackagingReturnable() {
        return isPackagingReturnable;
    }

    /**
     * Sets the value of the isPackagingReturnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsPackagingReturnable(NonBinaryLogicEnumerationType value) {
        this.isPackagingReturnable = value;
    }

    /**
     * Gets the value of the industrySpecificPackagingTypeCodeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getIndustrySpecificPackagingTypeCodeReference() {
        return industrySpecificPackagingTypeCodeReference;
    }

    /**
     * Sets the value of the industrySpecificPackagingTypeCodeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setIndustrySpecificPackagingTypeCodeReference(CodeType value) {
        this.industrySpecificPackagingTypeCodeReference = value;
    }

    /**
     * Gets the value of the packagingDividerInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingDividerInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingDividerInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingDividerInformationType }
     * 
     * 
     */
    public List<PackagingDividerInformationType> getPackagingDividerInformation() {
        if (packagingDividerInformation == null) {
            packagingDividerInformation = new ArrayList<PackagingDividerInformationType>();
        }
        return this.packagingDividerInformation;
    }

    /**
     * Gets the value of the numberOfUnitInShippingContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberOfUnitInShippingContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberOfUnitInShippingContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfUnitInShippingContainerType }
     * 
     * 
     */
    public List<NumberOfUnitInShippingContainerType> getNumberOfUnitInShippingContainer() {
        if (numberOfUnitInShippingContainer == null) {
            numberOfUnitInShippingContainer = new ArrayList<NumberOfUnitInShippingContainerType>();
        }
        return this.numberOfUnitInShippingContainer;
    }

    /**
     * Gets the value of the packagingRecyclabilityAssessmentInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingRecyclabilityAssessmentInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingRecyclabilityAssessmentInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingRecyclabilityAssessmentInformationType }
     * 
     * 
     */
    public List<PackagingRecyclabilityAssessmentInformationType> getPackagingRecyclabilityAssessmentInformation() {
        if (packagingRecyclabilityAssessmentInformation == null) {
            packagingRecyclabilityAssessmentInformation = new ArrayList<PackagingRecyclabilityAssessmentInformationType>();
        }
        return this.packagingRecyclabilityAssessmentInformation;
    }

    /**
     * Gets the value of the packagingClaims property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingClaims property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingClaims().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingClaimsType }
     * 
     * 
     */
    public List<PackagingClaimsType> getPackagingClaims() {
        if (packagingClaims == null) {
            packagingClaims = new ArrayList<PackagingClaimsType>();
        }
        return this.packagingClaims;
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
