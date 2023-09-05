
package gs1.gdsn.packaging_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.PackagingMaterialTypeCodeType;
import gs1.shared.shared_common.xsd._3.CodeType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for CompositeMaterialDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompositeMaterialDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packagingMaterialTypeCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}PackagingMaterialTypeCodeType"/&gt;
 *         &lt;element name="packagingMaterialCompositionQuantity" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingMaterialThickness" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="packagingMaterialClassificationCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="packagingMaterialColourCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="compositePackagingMaterialRecyclingSchemeCode" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackagingRecyclingSchemeCodeType" minOccurs="0"/&gt;
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
@XmlType(name = "CompositeMaterialDetailType", propOrder = {
    "packagingMaterialTypeCode",
    "packagingMaterialCompositionQuantity",
    "packagingMaterialThickness",
    "packagingMaterialClassificationCodeReference",
    "packagingMaterialColourCodeReference",
    "compositePackagingMaterialRecyclingSchemeCode",
    "packagingRawMaterialInformation"
})
public class CompositeMaterialDetailType {

    @XmlElement(required = true)
    protected PackagingMaterialTypeCodeType packagingMaterialTypeCode;
    protected List<MeasurementType> packagingMaterialCompositionQuantity;
    protected MeasurementType packagingMaterialThickness;
    protected CodeType packagingMaterialClassificationCodeReference;
    protected CodeType packagingMaterialColourCodeReference;
    protected PackagingRecyclingSchemeCodeType compositePackagingMaterialRecyclingSchemeCode;
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
     * Gets the value of the compositePackagingMaterialRecyclingSchemeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingRecyclingSchemeCodeType }
     *     
     */
    public PackagingRecyclingSchemeCodeType getCompositePackagingMaterialRecyclingSchemeCode() {
        return compositePackagingMaterialRecyclingSchemeCode;
    }

    /**
     * Sets the value of the compositePackagingMaterialRecyclingSchemeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingRecyclingSchemeCodeType }
     *     
     */
    public void setCompositePackagingMaterialRecyclingSchemeCode(PackagingRecyclingSchemeCodeType value) {
        this.compositePackagingMaterialRecyclingSchemeCode = value;
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
