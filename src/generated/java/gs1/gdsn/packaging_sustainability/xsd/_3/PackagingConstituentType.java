
package gs1.gdsn.packaging_sustainability.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.PackagingMaterialTypeCodeType;
import gs1.shared.shared_common.xsd._3.Description80Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for PackagingConstituentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingConstituentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packagingConstituent" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingGeneratedMaterialWaste" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="packagingMaterialTypeCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}PackagingMaterialTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="packagingMaterialDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingChainOfCustody" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}PackagingChainOfCustodyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingFacilitiesInStressedWater" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}PackagingFacilitiesInStressedWaterType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingRecycledContent" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}PackagingRecycledContentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingRenewableContent" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}PackagingRenewableContentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingSubstanceHazardousEnvironment" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}PackagingSubstanceHazardousEnvironmentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingWeightOptimisation" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}PackagingWeightOptimisationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingConstituentType", propOrder = {
    "packagingConstituent",
    "packagingGeneratedMaterialWaste",
    "packagingMaterialTypeCode",
    "packagingMaterialDescription",
    "packagingChainOfCustody",
    "packagingFacilitiesInStressedWater",
    "packagingRecycledContent",
    "packagingRenewableContent",
    "packagingSubstanceHazardousEnvironment",
    "packagingWeightOptimisation"
})
public class PackagingConstituentType {

    protected List<Description80Type> packagingConstituent;
    protected MeasurementType packagingGeneratedMaterialWaste;
    protected PackagingMaterialTypeCodeType packagingMaterialTypeCode;
    protected List<Description80Type> packagingMaterialDescription;
    protected List<PackagingChainOfCustodyType> packagingChainOfCustody;
    protected List<PackagingFacilitiesInStressedWaterType> packagingFacilitiesInStressedWater;
    protected List<PackagingRecycledContentType> packagingRecycledContent;
    protected List<PackagingRenewableContentType> packagingRenewableContent;
    protected List<PackagingSubstanceHazardousEnvironmentType> packagingSubstanceHazardousEnvironment;
    protected PackagingWeightOptimisationType packagingWeightOptimisation;

    /**
     * Gets the value of the packagingConstituent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingConstituent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingConstituent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getPackagingConstituent() {
        if (packagingConstituent == null) {
            packagingConstituent = new ArrayList<Description80Type>();
        }
        return this.packagingConstituent;
    }

    /**
     * Gets the value of the packagingGeneratedMaterialWaste property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getPackagingGeneratedMaterialWaste() {
        return packagingGeneratedMaterialWaste;
    }

    /**
     * Sets the value of the packagingGeneratedMaterialWaste property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setPackagingGeneratedMaterialWaste(MeasurementType value) {
        this.packagingGeneratedMaterialWaste = value;
    }

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
     * Gets the value of the packagingMaterialDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingMaterialDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingMaterialDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getPackagingMaterialDescription() {
        if (packagingMaterialDescription == null) {
            packagingMaterialDescription = new ArrayList<Description80Type>();
        }
        return this.packagingMaterialDescription;
    }

    /**
     * Gets the value of the packagingChainOfCustody property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingChainOfCustody property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingChainOfCustody().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingChainOfCustodyType }
     * 
     * 
     */
    public List<PackagingChainOfCustodyType> getPackagingChainOfCustody() {
        if (packagingChainOfCustody == null) {
            packagingChainOfCustody = new ArrayList<PackagingChainOfCustodyType>();
        }
        return this.packagingChainOfCustody;
    }

    /**
     * Gets the value of the packagingFacilitiesInStressedWater property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingFacilitiesInStressedWater property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingFacilitiesInStressedWater().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingFacilitiesInStressedWaterType }
     * 
     * 
     */
    public List<PackagingFacilitiesInStressedWaterType> getPackagingFacilitiesInStressedWater() {
        if (packagingFacilitiesInStressedWater == null) {
            packagingFacilitiesInStressedWater = new ArrayList<PackagingFacilitiesInStressedWaterType>();
        }
        return this.packagingFacilitiesInStressedWater;
    }

    /**
     * Gets the value of the packagingRecycledContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingRecycledContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingRecycledContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingRecycledContentType }
     * 
     * 
     */
    public List<PackagingRecycledContentType> getPackagingRecycledContent() {
        if (packagingRecycledContent == null) {
            packagingRecycledContent = new ArrayList<PackagingRecycledContentType>();
        }
        return this.packagingRecycledContent;
    }

    /**
     * Gets the value of the packagingRenewableContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingRenewableContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingRenewableContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingRenewableContentType }
     * 
     * 
     */
    public List<PackagingRenewableContentType> getPackagingRenewableContent() {
        if (packagingRenewableContent == null) {
            packagingRenewableContent = new ArrayList<PackagingRenewableContentType>();
        }
        return this.packagingRenewableContent;
    }

    /**
     * Gets the value of the packagingSubstanceHazardousEnvironment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingSubstanceHazardousEnvironment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingSubstanceHazardousEnvironment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingSubstanceHazardousEnvironmentType }
     * 
     * 
     */
    public List<PackagingSubstanceHazardousEnvironmentType> getPackagingSubstanceHazardousEnvironment() {
        if (packagingSubstanceHazardousEnvironment == null) {
            packagingSubstanceHazardousEnvironment = new ArrayList<PackagingSubstanceHazardousEnvironmentType>();
        }
        return this.packagingSubstanceHazardousEnvironment;
    }

    /**
     * Gets the value of the packagingWeightOptimisation property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingWeightOptimisationType }
     *     
     */
    public PackagingWeightOptimisationType getPackagingWeightOptimisation() {
        return packagingWeightOptimisation;
    }

    /**
     * Sets the value of the packagingWeightOptimisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingWeightOptimisationType }
     *     
     */
    public void setPackagingWeightOptimisation(PackagingWeightOptimisationType value) {
        this.packagingWeightOptimisation = value;
    }

}
