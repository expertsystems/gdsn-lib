
package gs1.gdsn.food_and_beverage_ingredient.xsd._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.FarmingAndProcessingInformationType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.gdsn.gdsn_common.xsd._3.MeasurementPrecisionCodeType;
import gs1.gdsn.gdsn_common.xsd._3.OrganicInformationType;
import gs1.gdsn.gdsn_common.xsd._3.PartyInRoleType;
import gs1.gdsn.gdsn_common.xsd._3.PlaceOfProductActivityType;
import gs1.shared.shared_common.xsd._3.CodeType;
import gs1.shared.shared_common.xsd._3.Description500Type;
import gs1.shared.shared_common.xsd._3.Description70Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for FoodAndBeverageIngredientType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FoodAndBeverageIngredientType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ingredientSequence" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="grapeVarietyCode" type="{urn:gs1:gdsn:food_and_beverage_ingredient:xsd:3}GrapeVarietyCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ingredientContentPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ingredientName" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ingredientPurpose" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ingredientContentPercentageMeasurementPrecisionCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}MeasurementPrecisionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="ingredientDefinition" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isIngredientEmphasised" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="ingredientCode" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="driedEquivalent" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ingredientFarmingProcessing" type="{urn:gs1:gdsn:gdsn_common:xsd:3}FarmingAndProcessingInformationType" minOccurs="0"/&gt;
 *         &lt;element name="ingredientOrganicInformation" type="{urn:gs1:gdsn:gdsn_common:xsd:3}OrganicInformationType" minOccurs="0"/&gt;
 *         &lt;element name="ingredientParty" type="{urn:gs1:gdsn:gdsn_common:xsd:3}PartyInRoleType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ingredientPlaceOfActivity" type="{urn:gs1:gdsn:gdsn_common:xsd:3}PlaceOfProductActivityType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "FoodAndBeverageIngredientType", propOrder = {
    "ingredientSequence",
    "grapeVarietyCode",
    "ingredientContentPercentage",
    "ingredientName",
    "ingredientPurpose",
    "ingredientContentPercentageMeasurementPrecisionCode",
    "ingredientDefinition",
    "isIngredientEmphasised",
    "ingredientCode",
    "driedEquivalent",
    "ingredientFarmingProcessing",
    "ingredientOrganicInformation",
    "ingredientParty",
    "ingredientPlaceOfActivity",
    "avpList"
})
public class FoodAndBeverageIngredientType {

    protected String ingredientSequence;
    protected List<GrapeVarietyCodeType> grapeVarietyCode;
    protected BigDecimal ingredientContentPercentage;
    protected List<Description70Type> ingredientName;
    protected List<String> ingredientPurpose;
    protected MeasurementPrecisionCodeType ingredientContentPercentageMeasurementPrecisionCode;
    protected List<Description500Type> ingredientDefinition;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isIngredientEmphasised;
    protected CodeType ingredientCode;
    protected List<MeasurementType> driedEquivalent;
    protected FarmingAndProcessingInformationType ingredientFarmingProcessing;
    protected OrganicInformationType ingredientOrganicInformation;
    protected List<PartyInRoleType> ingredientParty;
    protected List<PlaceOfProductActivityType> ingredientPlaceOfActivity;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the ingredientSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngredientSequence() {
        return ingredientSequence;
    }

    /**
     * Sets the value of the ingredientSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngredientSequence(String value) {
        this.ingredientSequence = value;
    }

    /**
     * Gets the value of the grapeVarietyCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grapeVarietyCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrapeVarietyCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrapeVarietyCodeType }
     * 
     * 
     */
    public List<GrapeVarietyCodeType> getGrapeVarietyCode() {
        if (grapeVarietyCode == null) {
            grapeVarietyCode = new ArrayList<GrapeVarietyCodeType>();
        }
        return this.grapeVarietyCode;
    }

    /**
     * Gets the value of the ingredientContentPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngredientContentPercentage() {
        return ingredientContentPercentage;
    }

    /**
     * Sets the value of the ingredientContentPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngredientContentPercentage(BigDecimal value) {
        this.ingredientContentPercentage = value;
    }

    /**
     * Gets the value of the ingredientName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredientName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredientName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getIngredientName() {
        if (ingredientName == null) {
            ingredientName = new ArrayList<Description70Type>();
        }
        return this.ingredientName;
    }

    /**
     * Gets the value of the ingredientPurpose property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredientPurpose property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredientPurpose().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIngredientPurpose() {
        if (ingredientPurpose == null) {
            ingredientPurpose = new ArrayList<String>();
        }
        return this.ingredientPurpose;
    }

    /**
     * Gets the value of the ingredientContentPercentageMeasurementPrecisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public MeasurementPrecisionCodeType getIngredientContentPercentageMeasurementPrecisionCode() {
        return ingredientContentPercentageMeasurementPrecisionCode;
    }

    /**
     * Sets the value of the ingredientContentPercentageMeasurementPrecisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public void setIngredientContentPercentageMeasurementPrecisionCode(MeasurementPrecisionCodeType value) {
        this.ingredientContentPercentageMeasurementPrecisionCode = value;
    }

    /**
     * Gets the value of the ingredientDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredientDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredientDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getIngredientDefinition() {
        if (ingredientDefinition == null) {
            ingredientDefinition = new ArrayList<Description500Type>();
        }
        return this.ingredientDefinition;
    }

    /**
     * Gets the value of the isIngredientEmphasised property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsIngredientEmphasised() {
        return isIngredientEmphasised;
    }

    /**
     * Sets the value of the isIngredientEmphasised property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsIngredientEmphasised(NonBinaryLogicEnumerationType value) {
        this.isIngredientEmphasised = value;
    }

    /**
     * Gets the value of the ingredientCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getIngredientCode() {
        return ingredientCode;
    }

    /**
     * Sets the value of the ingredientCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setIngredientCode(CodeType value) {
        this.ingredientCode = value;
    }

    /**
     * Gets the value of the driedEquivalent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the driedEquivalent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDriedEquivalent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getDriedEquivalent() {
        if (driedEquivalent == null) {
            driedEquivalent = new ArrayList<MeasurementType>();
        }
        return this.driedEquivalent;
    }

    /**
     * Gets the value of the ingredientFarmingProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link FarmingAndProcessingInformationType }
     *     
     */
    public FarmingAndProcessingInformationType getIngredientFarmingProcessing() {
        return ingredientFarmingProcessing;
    }

    /**
     * Sets the value of the ingredientFarmingProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmingAndProcessingInformationType }
     *     
     */
    public void setIngredientFarmingProcessing(FarmingAndProcessingInformationType value) {
        this.ingredientFarmingProcessing = value;
    }

    /**
     * Gets the value of the ingredientOrganicInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OrganicInformationType }
     *     
     */
    public OrganicInformationType getIngredientOrganicInformation() {
        return ingredientOrganicInformation;
    }

    /**
     * Sets the value of the ingredientOrganicInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganicInformationType }
     *     
     */
    public void setIngredientOrganicInformation(OrganicInformationType value) {
        this.ingredientOrganicInformation = value;
    }

    /**
     * Gets the value of the ingredientParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredientParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredientParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyInRoleType }
     * 
     * 
     */
    public List<PartyInRoleType> getIngredientParty() {
        if (ingredientParty == null) {
            ingredientParty = new ArrayList<PartyInRoleType>();
        }
        return this.ingredientParty;
    }

    /**
     * Gets the value of the ingredientPlaceOfActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredientPlaceOfActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredientPlaceOfActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlaceOfProductActivityType }
     * 
     * 
     */
    public List<PlaceOfProductActivityType> getIngredientPlaceOfActivity() {
        if (ingredientPlaceOfActivity == null) {
            ingredientPlaceOfActivity = new ArrayList<PlaceOfProductActivityType>();
        }
        return this.ingredientPlaceOfActivity;
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
