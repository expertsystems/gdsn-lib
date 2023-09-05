
package gs1.gdsn.consumer_instructions.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.ExternalCodeValueInformationType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.Description5000Type;


/**
 * <p>Java class for ConsumerInstructionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerInstructionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consumerStorageInstructions" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="consumerUsageInstructions" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="recommendedUsageLocation" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="consumerAssemblyInstructions" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dexterityUsageCode" type="{urn:gs1:gdsn:consumer_instructions:xsd:3}DexterityUsageCodeType" minOccurs="0"/&gt;
 *         &lt;element name="productUsageBodyLocationCode" type="{urn:gs1:gdsn:consumer_instructions:xsd:3}ProductUsageBodyLocationCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="consumerRecyclingInstructions" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="requiredEducationTrainingTypeCode" type="{urn:gs1:gdsn:consumer_instructions:xsd:3}RequiredEducationTrainingTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="consumerUsageLabelCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}ExternalCodeValueInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cleaningDisinfectingInformation" type="{urn:gs1:gdsn:consumer_instructions:xsd:3}CleaningDisinfectingInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ConsumerInstructionsType", propOrder = {
    "consumerStorageInstructions",
    "consumerUsageInstructions",
    "recommendedUsageLocation",
    "consumerAssemblyInstructions",
    "dexterityUsageCode",
    "productUsageBodyLocationCode",
    "consumerRecyclingInstructions",
    "requiredEducationTrainingTypeCode",
    "consumerUsageLabelCode",
    "cleaningDisinfectingInformation",
    "avpList"
})
public class ConsumerInstructionsType {

    protected List<Description5000Type> consumerStorageInstructions;
    protected List<Description5000Type> consumerUsageInstructions;
    protected List<Description5000Type> recommendedUsageLocation;
    protected List<Description5000Type> consumerAssemblyInstructions;
    protected DexterityUsageCodeType dexterityUsageCode;
    protected List<ProductUsageBodyLocationCodeType> productUsageBodyLocationCode;
    protected List<Description5000Type> consumerRecyclingInstructions;
    protected List<RequiredEducationTrainingTypeCodeType> requiredEducationTrainingTypeCode;
    protected List<ExternalCodeValueInformationType> consumerUsageLabelCode;
    protected List<CleaningDisinfectingInformationType> cleaningDisinfectingInformation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the consumerStorageInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerStorageInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerStorageInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getConsumerStorageInstructions() {
        if (consumerStorageInstructions == null) {
            consumerStorageInstructions = new ArrayList<Description5000Type>();
        }
        return this.consumerStorageInstructions;
    }

    /**
     * Gets the value of the consumerUsageInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerUsageInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerUsageInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getConsumerUsageInstructions() {
        if (consumerUsageInstructions == null) {
            consumerUsageInstructions = new ArrayList<Description5000Type>();
        }
        return this.consumerUsageInstructions;
    }

    /**
     * Gets the value of the recommendedUsageLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recommendedUsageLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecommendedUsageLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getRecommendedUsageLocation() {
        if (recommendedUsageLocation == null) {
            recommendedUsageLocation = new ArrayList<Description5000Type>();
        }
        return this.recommendedUsageLocation;
    }

    /**
     * Gets the value of the consumerAssemblyInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerAssemblyInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerAssemblyInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getConsumerAssemblyInstructions() {
        if (consumerAssemblyInstructions == null) {
            consumerAssemblyInstructions = new ArrayList<Description5000Type>();
        }
        return this.consumerAssemblyInstructions;
    }

    /**
     * Gets the value of the dexterityUsageCode property.
     * 
     * @return
     *     possible object is
     *     {@link DexterityUsageCodeType }
     *     
     */
    public DexterityUsageCodeType getDexterityUsageCode() {
        return dexterityUsageCode;
    }

    /**
     * Sets the value of the dexterityUsageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DexterityUsageCodeType }
     *     
     */
    public void setDexterityUsageCode(DexterityUsageCodeType value) {
        this.dexterityUsageCode = value;
    }

    /**
     * Gets the value of the productUsageBodyLocationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productUsageBodyLocationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductUsageBodyLocationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductUsageBodyLocationCodeType }
     * 
     * 
     */
    public List<ProductUsageBodyLocationCodeType> getProductUsageBodyLocationCode() {
        if (productUsageBodyLocationCode == null) {
            productUsageBodyLocationCode = new ArrayList<ProductUsageBodyLocationCodeType>();
        }
        return this.productUsageBodyLocationCode;
    }

    /**
     * Gets the value of the consumerRecyclingInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerRecyclingInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerRecyclingInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getConsumerRecyclingInstructions() {
        if (consumerRecyclingInstructions == null) {
            consumerRecyclingInstructions = new ArrayList<Description5000Type>();
        }
        return this.consumerRecyclingInstructions;
    }

    /**
     * Gets the value of the requiredEducationTrainingTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredEducationTrainingTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredEducationTrainingTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequiredEducationTrainingTypeCodeType }
     * 
     * 
     */
    public List<RequiredEducationTrainingTypeCodeType> getRequiredEducationTrainingTypeCode() {
        if (requiredEducationTrainingTypeCode == null) {
            requiredEducationTrainingTypeCode = new ArrayList<RequiredEducationTrainingTypeCodeType>();
        }
        return this.requiredEducationTrainingTypeCode;
    }

    /**
     * Gets the value of the consumerUsageLabelCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerUsageLabelCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerUsageLabelCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalCodeValueInformationType }
     * 
     * 
     */
    public List<ExternalCodeValueInformationType> getConsumerUsageLabelCode() {
        if (consumerUsageLabelCode == null) {
            consumerUsageLabelCode = new ArrayList<ExternalCodeValueInformationType>();
        }
        return this.consumerUsageLabelCode;
    }

    /**
     * Gets the value of the cleaningDisinfectingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cleaningDisinfectingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCleaningDisinfectingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CleaningDisinfectingInformationType }
     * 
     * 
     */
    public List<CleaningDisinfectingInformationType> getCleaningDisinfectingInformation() {
        if (cleaningDisinfectingInformation == null) {
            cleaningDisinfectingInformation = new ArrayList<CleaningDisinfectingInformationType>();
        }
        return this.cleaningDisinfectingInformation;
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
