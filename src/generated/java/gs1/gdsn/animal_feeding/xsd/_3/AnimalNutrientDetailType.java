
package gs1.gdsn.animal_feeding.xsd._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.NutrientTypeCodeType;


/**
 * <p>Java class for AnimalNutrientDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnimalNutrientDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="animalNutrientTypeCode" type="{urn:gs1:shared:shared_common:xsd:3}NutrientTypeCodeType"/&gt;
 *         &lt;element name="animalNutrientExactPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="animalNutrientMaximumPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="animalNutrientMinimumPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="animalNutrientQuantityContained" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="animalFeedingDescriptionOnNutrientQualifier" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "AnimalNutrientDetailType", propOrder = {
    "animalNutrientTypeCode",
    "animalNutrientExactPercentage",
    "animalNutrientMaximumPercentage",
    "animalNutrientMinimumPercentage",
    "animalNutrientQuantityContained",
    "animalFeedingDescriptionOnNutrientQualifier",
    "avpList"
})
public class AnimalNutrientDetailType {

    @XmlElement(required = true)
    protected NutrientTypeCodeType animalNutrientTypeCode;
    protected BigDecimal animalNutrientExactPercentage;
    protected BigDecimal animalNutrientMaximumPercentage;
    protected BigDecimal animalNutrientMinimumPercentage;
    protected List<MeasurementType> animalNutrientQuantityContained;
    protected List<String> animalFeedingDescriptionOnNutrientQualifier;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the animalNutrientTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link NutrientTypeCodeType }
     *     
     */
    public NutrientTypeCodeType getAnimalNutrientTypeCode() {
        return animalNutrientTypeCode;
    }

    /**
     * Sets the value of the animalNutrientTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NutrientTypeCodeType }
     *     
     */
    public void setAnimalNutrientTypeCode(NutrientTypeCodeType value) {
        this.animalNutrientTypeCode = value;
    }

    /**
     * Gets the value of the animalNutrientExactPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnimalNutrientExactPercentage() {
        return animalNutrientExactPercentage;
    }

    /**
     * Sets the value of the animalNutrientExactPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnimalNutrientExactPercentage(BigDecimal value) {
        this.animalNutrientExactPercentage = value;
    }

    /**
     * Gets the value of the animalNutrientMaximumPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnimalNutrientMaximumPercentage() {
        return animalNutrientMaximumPercentage;
    }

    /**
     * Sets the value of the animalNutrientMaximumPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnimalNutrientMaximumPercentage(BigDecimal value) {
        this.animalNutrientMaximumPercentage = value;
    }

    /**
     * Gets the value of the animalNutrientMinimumPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnimalNutrientMinimumPercentage() {
        return animalNutrientMinimumPercentage;
    }

    /**
     * Sets the value of the animalNutrientMinimumPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnimalNutrientMinimumPercentage(BigDecimal value) {
        this.animalNutrientMinimumPercentage = value;
    }

    /**
     * Gets the value of the animalNutrientQuantityContained property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the animalNutrientQuantityContained property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimalNutrientQuantityContained().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getAnimalNutrientQuantityContained() {
        if (animalNutrientQuantityContained == null) {
            animalNutrientQuantityContained = new ArrayList<MeasurementType>();
        }
        return this.animalNutrientQuantityContained;
    }

    /**
     * Gets the value of the animalFeedingDescriptionOnNutrientQualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the animalFeedingDescriptionOnNutrientQualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimalFeedingDescriptionOnNutrientQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAnimalFeedingDescriptionOnNutrientQualifier() {
        if (animalFeedingDescriptionOnNutrientQualifier == null) {
            animalFeedingDescriptionOnNutrientQualifier = new ArrayList<String>();
        }
        return this.animalFeedingDescriptionOnNutrientQualifier;
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
