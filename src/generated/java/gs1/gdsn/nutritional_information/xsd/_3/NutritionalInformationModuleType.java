
package gs1.gdsn.nutritional_information.xsd._3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.CodeType;
import gs1.shared.shared_common.xsd._3.Description1000Type;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for NutritionalInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NutritionalInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nutrientFormatTypeCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="descriptionOnANutrient" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isNutrientRelevantDataProvided" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="nutrientRelevantDataProvidedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="foodBeverageComposition" type="{urn:gs1:gdsn:nutritional_information:xsd:3}FoodBeverageCompositionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nutrientHeader" type="{urn:gs1:gdsn:nutritional_information:xsd:3}NutrientHeaderType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "NutritionalInformationModuleType", propOrder = {
    "nutrientFormatTypeCodeReference",
    "descriptionOnANutrient",
    "isNutrientRelevantDataProvided",
    "nutrientRelevantDataProvidedDateTime",
    "foodBeverageComposition",
    "nutrientHeader",
    "avpList"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:nutritional_information:xsd:3")
public class NutritionalInformationModuleType {

    protected List<CodeType> nutrientFormatTypeCodeReference;
    protected List<Description1000Type> descriptionOnANutrient;
    protected Boolean isNutrientRelevantDataProvided;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime nutrientRelevantDataProvidedDateTime;
    protected List<FoodBeverageCompositionType> foodBeverageComposition;
    protected List<NutrientHeaderType> nutrientHeader;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the nutrientFormatTypeCodeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nutrientFormatTypeCodeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNutrientFormatTypeCodeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getNutrientFormatTypeCodeReference() {
        if (nutrientFormatTypeCodeReference == null) {
            nutrientFormatTypeCodeReference = new ArrayList<CodeType>();
        }
        return this.nutrientFormatTypeCodeReference;
    }

    /**
     * Gets the value of the descriptionOnANutrient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionOnANutrient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionOnANutrient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getDescriptionOnANutrient() {
        if (descriptionOnANutrient == null) {
            descriptionOnANutrient = new ArrayList<Description1000Type>();
        }
        return this.descriptionOnANutrient;
    }

    /**
     * Gets the value of the isNutrientRelevantDataProvided property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNutrientRelevantDataProvided() {
        return isNutrientRelevantDataProvided;
    }

    /**
     * Sets the value of the isNutrientRelevantDataProvided property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNutrientRelevantDataProvided(Boolean value) {
        this.isNutrientRelevantDataProvided = value;
    }

    /**
     * Gets the value of the nutrientRelevantDataProvidedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getNutrientRelevantDataProvidedDateTime() {
        return nutrientRelevantDataProvidedDateTime;
    }

    /**
     * Sets the value of the nutrientRelevantDataProvidedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNutrientRelevantDataProvidedDateTime(LocalDateTime value) {
        this.nutrientRelevantDataProvidedDateTime = value;
    }

    /**
     * Gets the value of the foodBeverageComposition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foodBeverageComposition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodBeverageComposition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodBeverageCompositionType }
     * 
     * 
     */
    public List<FoodBeverageCompositionType> getFoodBeverageComposition() {
        if (foodBeverageComposition == null) {
            foodBeverageComposition = new ArrayList<FoodBeverageCompositionType>();
        }
        return this.foodBeverageComposition;
    }

    /**
     * Gets the value of the nutrientHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nutrientHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNutrientHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NutrientHeaderType }
     * 
     * 
     */
    public List<NutrientHeaderType> getNutrientHeader() {
        if (nutrientHeader == null) {
            nutrientHeader = new ArrayList<NutrientHeaderType>();
        }
        return this.nutrientHeader;
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
