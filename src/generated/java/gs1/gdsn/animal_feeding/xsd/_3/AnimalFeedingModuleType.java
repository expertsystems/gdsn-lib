
package gs1.gdsn.animal_feeding.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.Description200Type;
import gs1.shared.shared_common.xsd._3.Description5000Type;


/**
 * <p>Java class for AnimalFeedingModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnimalFeedingModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="animalNutritionalClaim" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="feedType" type="{urn:gs1:gdsn:animal_feeding:xsd:3}FeedTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="targetedConsumptionBy" type="{urn:gs1:gdsn:animal_feeding:xsd:3}TargetedConsumptionByCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="feedAdditiveStatement" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="feedAnalyticalConstituentsStatement" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="feedCompositionStatement" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="feedingInstructions" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="animalFoodTypeCode" type="{urn:gs1:gdsn:animal_feeding:xsd:3}AnimalFoodTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="animalFoodProcessOrStateTypeCode" type="{urn:gs1:gdsn:animal_feeding:xsd:3}AnimalFoodProcessOrStateTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="animalTargetedHealthConditionCode" type="{urn:gs1:gdsn:animal_feeding:xsd:3}AnimalTargetedHealthConditionCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="animalTargetBreed" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="animalFeeding" type="{urn:gs1:gdsn:animal_feeding:xsd:3}AnimalFeedingType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AnimalFeedingModuleType", propOrder = {
    "animalNutritionalClaim",
    "feedType",
    "targetedConsumptionBy",
    "feedAdditiveStatement",
    "feedAnalyticalConstituentsStatement",
    "feedCompositionStatement",
    "feedingInstructions",
    "animalFoodTypeCode",
    "animalFoodProcessOrStateTypeCode",
    "animalTargetedHealthConditionCode",
    "animalTargetBreed",
    "animalFeeding",
    "avpList"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:animal_feeding:xsd:3")
public class AnimalFeedingModuleType {

    protected List<Description5000Type> animalNutritionalClaim;
    protected List<FeedTypeCodeType> feedType;
    protected List<TargetedConsumptionByCodeType> targetedConsumptionBy;
    protected List<Description5000Type> feedAdditiveStatement;
    protected List<Description5000Type> feedAnalyticalConstituentsStatement;
    protected List<Description5000Type> feedCompositionStatement;
    protected List<Description5000Type> feedingInstructions;
    protected List<AnimalFoodTypeCodeType> animalFoodTypeCode;
    protected List<AnimalFoodProcessOrStateTypeCodeType> animalFoodProcessOrStateTypeCode;
    protected List<AnimalTargetedHealthConditionCodeType> animalTargetedHealthConditionCode;
    protected List<Description200Type> animalTargetBreed;
    protected List<AnimalFeedingType> animalFeeding;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the animalNutritionalClaim property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the animalNutritionalClaim property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimalNutritionalClaim().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getAnimalNutritionalClaim() {
        if (animalNutritionalClaim == null) {
            animalNutritionalClaim = new ArrayList<Description5000Type>();
        }
        return this.animalNutritionalClaim;
    }

    /**
     * Gets the value of the feedType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeedTypeCodeType }
     * 
     * 
     */
    public List<FeedTypeCodeType> getFeedType() {
        if (feedType == null) {
            feedType = new ArrayList<FeedTypeCodeType>();
        }
        return this.feedType;
    }

    /**
     * Gets the value of the targetedConsumptionBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetedConsumptionBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetedConsumptionBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetedConsumptionByCodeType }
     * 
     * 
     */
    public List<TargetedConsumptionByCodeType> getTargetedConsumptionBy() {
        if (targetedConsumptionBy == null) {
            targetedConsumptionBy = new ArrayList<TargetedConsumptionByCodeType>();
        }
        return this.targetedConsumptionBy;
    }

    /**
     * Gets the value of the feedAdditiveStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedAdditiveStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedAdditiveStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getFeedAdditiveStatement() {
        if (feedAdditiveStatement == null) {
            feedAdditiveStatement = new ArrayList<Description5000Type>();
        }
        return this.feedAdditiveStatement;
    }

    /**
     * Gets the value of the feedAnalyticalConstituentsStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedAnalyticalConstituentsStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedAnalyticalConstituentsStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getFeedAnalyticalConstituentsStatement() {
        if (feedAnalyticalConstituentsStatement == null) {
            feedAnalyticalConstituentsStatement = new ArrayList<Description5000Type>();
        }
        return this.feedAnalyticalConstituentsStatement;
    }

    /**
     * Gets the value of the feedCompositionStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedCompositionStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedCompositionStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getFeedCompositionStatement() {
        if (feedCompositionStatement == null) {
            feedCompositionStatement = new ArrayList<Description5000Type>();
        }
        return this.feedCompositionStatement;
    }

    /**
     * Gets the value of the feedingInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedingInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedingInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getFeedingInstructions() {
        if (feedingInstructions == null) {
            feedingInstructions = new ArrayList<Description5000Type>();
        }
        return this.feedingInstructions;
    }

    /**
     * Gets the value of the animalFoodTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the animalFoodTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimalFoodTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnimalFoodTypeCodeType }
     * 
     * 
     */
    public List<AnimalFoodTypeCodeType> getAnimalFoodTypeCode() {
        if (animalFoodTypeCode == null) {
            animalFoodTypeCode = new ArrayList<AnimalFoodTypeCodeType>();
        }
        return this.animalFoodTypeCode;
    }

    /**
     * Gets the value of the animalFoodProcessOrStateTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the animalFoodProcessOrStateTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimalFoodProcessOrStateTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnimalFoodProcessOrStateTypeCodeType }
     * 
     * 
     */
    public List<AnimalFoodProcessOrStateTypeCodeType> getAnimalFoodProcessOrStateTypeCode() {
        if (animalFoodProcessOrStateTypeCode == null) {
            animalFoodProcessOrStateTypeCode = new ArrayList<AnimalFoodProcessOrStateTypeCodeType>();
        }
        return this.animalFoodProcessOrStateTypeCode;
    }

    /**
     * Gets the value of the animalTargetedHealthConditionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the animalTargetedHealthConditionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimalTargetedHealthConditionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnimalTargetedHealthConditionCodeType }
     * 
     * 
     */
    public List<AnimalTargetedHealthConditionCodeType> getAnimalTargetedHealthConditionCode() {
        if (animalTargetedHealthConditionCode == null) {
            animalTargetedHealthConditionCode = new ArrayList<AnimalTargetedHealthConditionCodeType>();
        }
        return this.animalTargetedHealthConditionCode;
    }

    /**
     * Gets the value of the animalTargetBreed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the animalTargetBreed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimalTargetBreed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description200Type }
     * 
     * 
     */
    public List<Description200Type> getAnimalTargetBreed() {
        if (animalTargetBreed == null) {
            animalTargetBreed = new ArrayList<Description200Type>();
        }
        return this.animalTargetBreed;
    }

    /**
     * Gets the value of the animalFeeding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the animalFeeding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimalFeeding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnimalFeedingType }
     * 
     * 
     */
    public List<AnimalFeedingType> getAnimalFeeding() {
        if (animalFeeding == null) {
            animalFeeding = new ArrayList<AnimalFeedingType>();
        }
        return this.animalFeeding;
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
