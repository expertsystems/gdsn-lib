
package gs1.gdsn.packaging_information.xsd._3;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import gs1.gdsn.gdsn_common.xsd._3.PackagingMaterialTypeCodeType;
import gs1.shared.shared_common.xsd._3.CodeType;
import gs1.shared.shared_common.xsd._3.Description70Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for PackagingMaterialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingMaterialType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packagingMaterialTypeCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}PackagingMaterialTypeCodeType"/&gt;
 *         &lt;element name="isPackagingMaterialRecoverable" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="isPrimaryMaterial" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="packagingMaterialAppliedProcessCode" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackagingMaterialAppliedProcessCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingCompositeMaterialDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingMaterialCoatingTypeDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingMaterialCompositionQuantity" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingMaterialLaunchDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="packagingMaterialPerformanceCode" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackagingMaterialPerformanceCodeType" minOccurs="0"/&gt;
 *         &lt;element name="packagingMaterialThickness" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="packagingMaterialClassificationCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="packagingMaterialColourCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="packagingLabellingTypeCode" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackagingLabellingTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="packagingLabellingCoveragePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="packagingMaterialElementCode" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackagingMaterialElementCodeType" minOccurs="0"/&gt;
 *         &lt;element name="packagingMaterialRecyclingSchemeCode" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackagingRecyclingSchemeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="numberOfPackagingElementUnits" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="packagingMaterialAdhesiveAmount" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingMaterialAdhesiveSolubilityTypeCode" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackagingMaterialAdhesiveSolubilityTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingMaterialAdhesiveTypeCode" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackagingMaterialAdhesiveTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="compositeMaterialDetail" type="{urn:gs1:gdsn:packaging_information:xsd:3}CompositeMaterialDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingRawMaterialInformation" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackagingRawMaterialInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingMaterialType", propOrder = {
    "packagingMaterialTypeCode",
    "isPackagingMaterialRecoverable",
    "isPrimaryMaterial",
    "packagingMaterialAppliedProcessCode",
    "packagingCompositeMaterialDescription",
    "packagingMaterialCoatingTypeDescription",
    "packagingMaterialCompositionQuantity",
    "packagingMaterialLaunchDateTime",
    "packagingMaterialPerformanceCode",
    "packagingMaterialThickness",
    "packagingMaterialClassificationCodeReference",
    "packagingMaterialColourCodeReference",
    "packagingLabellingTypeCode",
    "packagingLabellingCoveragePercentage",
    "packagingMaterialElementCode",
    "packagingMaterialRecyclingSchemeCode",
    "numberOfPackagingElementUnits",
    "packagingMaterialAdhesiveAmount",
    "packagingMaterialAdhesiveSolubilityTypeCode",
    "packagingMaterialAdhesiveTypeCode",
    "compositeMaterialDetail",
    "packagingRawMaterialInformation"
})
public class PackagingMaterialType {

    @XmlElement(required = true)
    protected PackagingMaterialTypeCodeType packagingMaterialTypeCode;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isPackagingMaterialRecoverable;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isPrimaryMaterial;
    protected List<PackagingMaterialAppliedProcessCodeType> packagingMaterialAppliedProcessCode;
    protected List<Description70Type> packagingCompositeMaterialDescription;
    protected List<Description70Type> packagingMaterialCoatingTypeDescription;
    protected List<MeasurementType> packagingMaterialCompositionQuantity;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime packagingMaterialLaunchDateTime;
    protected PackagingMaterialPerformanceCodeType packagingMaterialPerformanceCode;
    protected MeasurementType packagingMaterialThickness;
    protected CodeType packagingMaterialClassificationCodeReference;
    protected CodeType packagingMaterialColourCodeReference;
    protected PackagingLabellingTypeCodeType packagingLabellingTypeCode;
    protected BigDecimal packagingLabellingCoveragePercentage;
    protected PackagingMaterialElementCodeType packagingMaterialElementCode;
    protected PackagingRecyclingSchemeCodeType packagingMaterialRecyclingSchemeCode;
    protected BigInteger numberOfPackagingElementUnits;
    protected List<MeasurementType> packagingMaterialAdhesiveAmount;
    protected List<PackagingMaterialAdhesiveSolubilityTypeCodeType> packagingMaterialAdhesiveSolubilityTypeCode;
    protected List<PackagingMaterialAdhesiveTypeCodeType> packagingMaterialAdhesiveTypeCode;
    protected List<CompositeMaterialDetailType> compositeMaterialDetail;
    protected List<PackagingRawMaterialInformationType> packagingRawMaterialInformation;

    /**
     * Gets the value of the packagingMaterialTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingMaterialTypeCodeType }
     *     
     */
    public PackagingMaterialTypeCodeType getPackagingMaterialTypeCode() {
        return packagingMaterialTypeCode;
    }

    /**
     * Sets the value of the packagingMaterialTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingMaterialTypeCodeType }
     *     
     */
    public void setPackagingMaterialTypeCode(PackagingMaterialTypeCodeType value) {
        this.packagingMaterialTypeCode = value;
    }

    /**
     * Gets the value of the isPackagingMaterialRecoverable property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsPackagingMaterialRecoverable() {
        return isPackagingMaterialRecoverable;
    }

    /**
     * Sets the value of the isPackagingMaterialRecoverable property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsPackagingMaterialRecoverable(NonBinaryLogicEnumerationType value) {
        this.isPackagingMaterialRecoverable = value;
    }

    /**
     * Gets the value of the isPrimaryMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsPrimaryMaterial() {
        return isPrimaryMaterial;
    }

    /**
     * Sets the value of the isPrimaryMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsPrimaryMaterial(NonBinaryLogicEnumerationType value) {
        this.isPrimaryMaterial = value;
    }

    /**
     * Gets the value of the packagingMaterialAppliedProcessCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingMaterialAppliedProcessCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingMaterialAppliedProcessCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingMaterialAppliedProcessCodeType }
     * 
     * 
     */
    public List<PackagingMaterialAppliedProcessCodeType> getPackagingMaterialAppliedProcessCode() {
        if (packagingMaterialAppliedProcessCode == null) {
            packagingMaterialAppliedProcessCode = new ArrayList<PackagingMaterialAppliedProcessCodeType>();
        }
        return this.packagingMaterialAppliedProcessCode;
    }

    /**
     * Gets the value of the packagingCompositeMaterialDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingCompositeMaterialDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingCompositeMaterialDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getPackagingCompositeMaterialDescription() {
        if (packagingCompositeMaterialDescription == null) {
            packagingCompositeMaterialDescription = new ArrayList<Description70Type>();
        }
        return this.packagingCompositeMaterialDescription;
    }

    /**
     * Gets the value of the packagingMaterialCoatingTypeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingMaterialCoatingTypeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingMaterialCoatingTypeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getPackagingMaterialCoatingTypeDescription() {
        if (packagingMaterialCoatingTypeDescription == null) {
            packagingMaterialCoatingTypeDescription = new ArrayList<Description70Type>();
        }
        return this.packagingMaterialCoatingTypeDescription;
    }

    /**
     * Gets the value of the packagingMaterialCompositionQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingMaterialCompositionQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingMaterialCompositionQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getPackagingMaterialCompositionQuantity() {
        if (packagingMaterialCompositionQuantity == null) {
            packagingMaterialCompositionQuantity = new ArrayList<MeasurementType>();
        }
        return this.packagingMaterialCompositionQuantity;
    }

    /**
     * Gets the value of the packagingMaterialLaunchDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getPackagingMaterialLaunchDateTime() {
        return packagingMaterialLaunchDateTime;
    }

    /**
     * Sets the value of the packagingMaterialLaunchDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagingMaterialLaunchDateTime(LocalDateTime value) {
        this.packagingMaterialLaunchDateTime = value;
    }

    /**
     * Gets the value of the packagingMaterialPerformanceCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingMaterialPerformanceCodeType }
     *     
     */
    public PackagingMaterialPerformanceCodeType getPackagingMaterialPerformanceCode() {
        return packagingMaterialPerformanceCode;
    }

    /**
     * Sets the value of the packagingMaterialPerformanceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingMaterialPerformanceCodeType }
     *     
     */
    public void setPackagingMaterialPerformanceCode(PackagingMaterialPerformanceCodeType value) {
        this.packagingMaterialPerformanceCode = value;
    }

    /**
     * Gets the value of the packagingMaterialThickness property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getPackagingMaterialThickness() {
        return packagingMaterialThickness;
    }

    /**
     * Sets the value of the packagingMaterialThickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setPackagingMaterialThickness(MeasurementType value) {
        this.packagingMaterialThickness = value;
    }

    /**
     * Gets the value of the packagingMaterialClassificationCodeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPackagingMaterialClassificationCodeReference() {
        return packagingMaterialClassificationCodeReference;
    }

    /**
     * Sets the value of the packagingMaterialClassificationCodeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPackagingMaterialClassificationCodeReference(CodeType value) {
        this.packagingMaterialClassificationCodeReference = value;
    }

    /**
     * Gets the value of the packagingMaterialColourCodeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPackagingMaterialColourCodeReference() {
        return packagingMaterialColourCodeReference;
    }

    /**
     * Sets the value of the packagingMaterialColourCodeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPackagingMaterialColourCodeReference(CodeType value) {
        this.packagingMaterialColourCodeReference = value;
    }

    /**
     * Gets the value of the packagingLabellingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingLabellingTypeCodeType }
     *     
     */
    public PackagingLabellingTypeCodeType getPackagingLabellingTypeCode() {
        return packagingLabellingTypeCode;
    }

    /**
     * Sets the value of the packagingLabellingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingLabellingTypeCodeType }
     *     
     */
    public void setPackagingLabellingTypeCode(PackagingLabellingTypeCodeType value) {
        this.packagingLabellingTypeCode = value;
    }

    /**
     * Gets the value of the packagingLabellingCoveragePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPackagingLabellingCoveragePercentage() {
        return packagingLabellingCoveragePercentage;
    }

    /**
     * Sets the value of the packagingLabellingCoveragePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPackagingLabellingCoveragePercentage(BigDecimal value) {
        this.packagingLabellingCoveragePercentage = value;
    }

    /**
     * Gets the value of the packagingMaterialElementCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingMaterialElementCodeType }
     *     
     */
    public PackagingMaterialElementCodeType getPackagingMaterialElementCode() {
        return packagingMaterialElementCode;
    }

    /**
     * Sets the value of the packagingMaterialElementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingMaterialElementCodeType }
     *     
     */
    public void setPackagingMaterialElementCode(PackagingMaterialElementCodeType value) {
        this.packagingMaterialElementCode = value;
    }

    /**
     * Gets the value of the packagingMaterialRecyclingSchemeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingRecyclingSchemeCodeType }
     *     
     */
    public PackagingRecyclingSchemeCodeType getPackagingMaterialRecyclingSchemeCode() {
        return packagingMaterialRecyclingSchemeCode;
    }

    /**
     * Sets the value of the packagingMaterialRecyclingSchemeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingRecyclingSchemeCodeType }
     *     
     */
    public void setPackagingMaterialRecyclingSchemeCode(PackagingRecyclingSchemeCodeType value) {
        this.packagingMaterialRecyclingSchemeCode = value;
    }

    /**
     * Gets the value of the numberOfPackagingElementUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPackagingElementUnits() {
        return numberOfPackagingElementUnits;
    }

    /**
     * Sets the value of the numberOfPackagingElementUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPackagingElementUnits(BigInteger value) {
        this.numberOfPackagingElementUnits = value;
    }

    /**
     * Gets the value of the packagingMaterialAdhesiveAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingMaterialAdhesiveAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingMaterialAdhesiveAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getPackagingMaterialAdhesiveAmount() {
        if (packagingMaterialAdhesiveAmount == null) {
            packagingMaterialAdhesiveAmount = new ArrayList<MeasurementType>();
        }
        return this.packagingMaterialAdhesiveAmount;
    }

    /**
     * Gets the value of the packagingMaterialAdhesiveSolubilityTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingMaterialAdhesiveSolubilityTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingMaterialAdhesiveSolubilityTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingMaterialAdhesiveSolubilityTypeCodeType }
     * 
     * 
     */
    public List<PackagingMaterialAdhesiveSolubilityTypeCodeType> getPackagingMaterialAdhesiveSolubilityTypeCode() {
        if (packagingMaterialAdhesiveSolubilityTypeCode == null) {
            packagingMaterialAdhesiveSolubilityTypeCode = new ArrayList<PackagingMaterialAdhesiveSolubilityTypeCodeType>();
        }
        return this.packagingMaterialAdhesiveSolubilityTypeCode;
    }

    /**
     * Gets the value of the packagingMaterialAdhesiveTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingMaterialAdhesiveTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingMaterialAdhesiveTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingMaterialAdhesiveTypeCodeType }
     * 
     * 
     */
    public List<PackagingMaterialAdhesiveTypeCodeType> getPackagingMaterialAdhesiveTypeCode() {
        if (packagingMaterialAdhesiveTypeCode == null) {
            packagingMaterialAdhesiveTypeCode = new ArrayList<PackagingMaterialAdhesiveTypeCodeType>();
        }
        return this.packagingMaterialAdhesiveTypeCode;
    }

    /**
     * Gets the value of the compositeMaterialDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compositeMaterialDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompositeMaterialDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompositeMaterialDetailType }
     * 
     * 
     */
    public List<CompositeMaterialDetailType> getCompositeMaterialDetail() {
        if (compositeMaterialDetail == null) {
            compositeMaterialDetail = new ArrayList<CompositeMaterialDetailType>();
        }
        return this.compositeMaterialDetail;
    }

    /**
     * Gets the value of the packagingRawMaterialInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingRawMaterialInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingRawMaterialInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingRawMaterialInformationType }
     * 
     * 
     */
    public List<PackagingRawMaterialInformationType> getPackagingRawMaterialInformation() {
        if (packagingRawMaterialInformation == null) {
            packagingRawMaterialInformation = new ArrayList<PackagingRawMaterialInformationType>();
        }
        return this.packagingRawMaterialInformation;
    }

}
