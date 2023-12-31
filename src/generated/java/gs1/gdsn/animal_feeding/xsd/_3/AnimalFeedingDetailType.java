
package gs1.gdsn.animal_feeding.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.Description1000Type;
import gs1.shared.shared_common.xsd._3.Description500Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for AnimalFeedingDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnimalFeedingDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="animalNutrientQuantityContainedBasis" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="feedingAmount" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="feedingAmountBasisDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="maximumFeedingAmount" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="minimumFeedingAmount" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="recommendedFrequencyOfFeeding" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="animalFeedingDescriptionOnANutrient" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="animalNutrientDetail" type="{urn:gs1:gdsn:animal_feeding:xsd:3}AnimalNutrientDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AnimalFeedingDetailType", propOrder = {
    "animalNutrientQuantityContainedBasis",
    "feedingAmount",
    "feedingAmountBasisDescription",
    "maximumFeedingAmount",
    "minimumFeedingAmount",
    "recommendedFrequencyOfFeeding",
    "animalFeedingDescriptionOnANutrient",
    "animalNutrientDetail",
    "avpList"
})
public class AnimalFeedingDetailType {

    protected List<MeasurementType> animalNutrientQuantityContainedBasis;
    protected List<MeasurementType> feedingAmount;
    protected List<Description500Type> feedingAmountBasisDescription;
    protected List<MeasurementType> maximumFeedingAmount;
    protected List<MeasurementType> minimumFeedingAmount;
    protected List<Description500Type> recommendedFrequencyOfFeeding;
    protected List<Description1000Type> animalFeedingDescriptionOnANutrient;
    protected List<AnimalNutrientDetailType> animalNutrientDetail;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the animalNutrientQuantityContainedBasis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the animalNutrientQuantityContainedBasis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimalNutrientQuantityContainedBasis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getAnimalNutrientQuantityContainedBasis() {
        if (animalNutrientQuantityContainedBasis == null) {
            animalNutrientQuantityContainedBasis = new ArrayList<MeasurementType>();
        }
        return this.animalNutrientQuantityContainedBasis;
    }

    /**
     * Gets the value of the feedingAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedingAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedingAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getFeedingAmount() {
        if (feedingAmount == null) {
            feedingAmount = new ArrayList<MeasurementType>();
        }
        return this.feedingAmount;
    }

    /**
     * Gets the value of the feedingAmountBasisDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedingAmountBasisDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedingAmountBasisDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getFeedingAmountBasisDescription() {
        if (feedingAmountBasisDescription == null) {
            feedingAmountBasisDescription = new ArrayList<Description500Type>();
        }
        return this.feedingAmountBasisDescription;
    }

    /**
     * Gets the value of the maximumFeedingAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maximumFeedingAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaximumFeedingAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getMaximumFeedingAmount() {
        if (maximumFeedingAmount == null) {
            maximumFeedingAmount = new ArrayList<MeasurementType>();
        }
        return this.maximumFeedingAmount;
    }

    /**
     * Gets the value of the minimumFeedingAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minimumFeedingAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinimumFeedingAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getMinimumFeedingAmount() {
        if (minimumFeedingAmount == null) {
            minimumFeedingAmount = new ArrayList<MeasurementType>();
        }
        return this.minimumFeedingAmount;
    }

    /**
     * Gets the value of the recommendedFrequencyOfFeeding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recommendedFrequencyOfFeeding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecommendedFrequencyOfFeeding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getRecommendedFrequencyOfFeeding() {
        if (recommendedFrequencyOfFeeding == null) {
            recommendedFrequencyOfFeeding = new ArrayList<Description500Type>();
        }
        return this.recommendedFrequencyOfFeeding;
    }

    /**
     * Gets the value of the animalFeedingDescriptionOnANutrient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the animalFeedingDescriptionOnANutrient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimalFeedingDescriptionOnANutrient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getAnimalFeedingDescriptionOnANutrient() {
        if (animalFeedingDescriptionOnANutrient == null) {
            animalFeedingDescriptionOnANutrient = new ArrayList<Description1000Type>();
        }
        return this.animalFeedingDescriptionOnANutrient;
    }

    /**
     * Gets the value of the animalNutrientDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the animalNutrientDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimalNutrientDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnimalNutrientDetailType }
     * 
     * 
     */
    public List<AnimalNutrientDetailType> getAnimalNutrientDetail() {
        if (animalNutrientDetail == null) {
            animalNutrientDetail = new ArrayList<AnimalNutrientDetailType>();
        }
        return this.animalNutrientDetail;
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
