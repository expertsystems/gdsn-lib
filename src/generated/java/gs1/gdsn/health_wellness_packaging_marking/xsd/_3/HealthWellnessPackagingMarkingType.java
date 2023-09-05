
package gs1.gdsn.health_wellness_packaging_marking.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.Description70Type;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for HealthWellnessPackagingMarkingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HealthWellnessPackagingMarkingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consumerSafetyInformation" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isPackagingMarkedWithIngredients" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isPackagingLabelledWithDrugFacts" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="packagingMarkedNutritionLabelCode" type="{urn:gs1:gdsn:health_wellness_packaging_marking:xsd:3}PackagingMarkedNutritionLabelCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "HealthWellnessPackagingMarkingType", propOrder = {
    "consumerSafetyInformation",
    "isPackagingMarkedWithIngredients",
    "isPackagingLabelledWithDrugFacts",
    "packagingMarkedNutritionLabelCode",
    "avpList"
})
public class HealthWellnessPackagingMarkingType {

    protected List<Description70Type> consumerSafetyInformation;
    protected Boolean isPackagingMarkedWithIngredients;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isPackagingLabelledWithDrugFacts;
    protected List<PackagingMarkedNutritionLabelCodeType> packagingMarkedNutritionLabelCode;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the consumerSafetyInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerSafetyInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerSafetyInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getConsumerSafetyInformation() {
        if (consumerSafetyInformation == null) {
            consumerSafetyInformation = new ArrayList<Description70Type>();
        }
        return this.consumerSafetyInformation;
    }

    /**
     * Gets the value of the isPackagingMarkedWithIngredients property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPackagingMarkedWithIngredients() {
        return isPackagingMarkedWithIngredients;
    }

    /**
     * Sets the value of the isPackagingMarkedWithIngredients property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPackagingMarkedWithIngredients(Boolean value) {
        this.isPackagingMarkedWithIngredients = value;
    }

    /**
     * Gets the value of the isPackagingLabelledWithDrugFacts property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsPackagingLabelledWithDrugFacts() {
        return isPackagingLabelledWithDrugFacts;
    }

    /**
     * Sets the value of the isPackagingLabelledWithDrugFacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsPackagingLabelledWithDrugFacts(NonBinaryLogicEnumerationType value) {
        this.isPackagingLabelledWithDrugFacts = value;
    }

    /**
     * Gets the value of the packagingMarkedNutritionLabelCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingMarkedNutritionLabelCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingMarkedNutritionLabelCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingMarkedNutritionLabelCodeType }
     * 
     * 
     */
    public List<PackagingMarkedNutritionLabelCodeType> getPackagingMarkedNutritionLabelCode() {
        if (packagingMarkedNutritionLabelCode == null) {
            packagingMarkedNutritionLabelCode = new ArrayList<PackagingMarkedNutritionLabelCodeType>();
        }
        return this.packagingMarkedNutritionLabelCode;
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
