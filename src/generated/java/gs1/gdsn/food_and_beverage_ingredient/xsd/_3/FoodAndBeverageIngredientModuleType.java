
package gs1.gdsn.food_and_beverage_ingredient.xsd._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.AdditiveInformationType;
import gs1.gdsn.gdsn_common.xsd._3.FormattedDescription5000Type;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.Description5000Type;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for FoodAndBeverageIngredientModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FoodAndBeverageIngredientModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ingredientOfConcernCode" type="{urn:gs1:gdsn:food_and_beverage_ingredient:xsd:3}IngredientOfConcernCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ingredientStatement" type="{urn:gs1:gdsn:gdsn_common:xsd:3}FormattedDescription5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="juiceContentPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="isIngredientRelevantDataProvided" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="additiveStatement" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="additiveInformation" type="{urn:gs1:gdsn:gdsn_common:xsd:3}AdditiveInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="foodAndBeverageIngredient" type="{urn:gs1:gdsn:food_and_beverage_ingredient:xsd:3}FoodAndBeverageIngredientType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "FoodAndBeverageIngredientModuleType", propOrder = {
    "ingredientOfConcernCode",
    "ingredientStatement",
    "juiceContentPercent",
    "isIngredientRelevantDataProvided",
    "additiveStatement",
    "additiveInformation",
    "foodAndBeverageIngredient",
    "avpList"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:food_and_beverage_ingredient:xsd:3")
public class FoodAndBeverageIngredientModuleType {

    protected List<IngredientOfConcernCodeType> ingredientOfConcernCode;
    protected List<FormattedDescription5000Type> ingredientStatement;
    protected BigDecimal juiceContentPercent;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isIngredientRelevantDataProvided;
    protected List<Description5000Type> additiveStatement;
    protected List<AdditiveInformationType> additiveInformation;
    protected List<FoodAndBeverageIngredientType> foodAndBeverageIngredient;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the ingredientOfConcernCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredientOfConcernCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredientOfConcernCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IngredientOfConcernCodeType }
     * 
     * 
     */
    public List<IngredientOfConcernCodeType> getIngredientOfConcernCode() {
        if (ingredientOfConcernCode == null) {
            ingredientOfConcernCode = new ArrayList<IngredientOfConcernCodeType>();
        }
        return this.ingredientOfConcernCode;
    }

    /**
     * Gets the value of the ingredientStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredientStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredientStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormattedDescription5000Type }
     * 
     * 
     */
    public List<FormattedDescription5000Type> getIngredientStatement() {
        if (ingredientStatement == null) {
            ingredientStatement = new ArrayList<FormattedDescription5000Type>();
        }
        return this.ingredientStatement;
    }

    /**
     * Gets the value of the juiceContentPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJuiceContentPercent() {
        return juiceContentPercent;
    }

    /**
     * Sets the value of the juiceContentPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJuiceContentPercent(BigDecimal value) {
        this.juiceContentPercent = value;
    }

    /**
     * Gets the value of the isIngredientRelevantDataProvided property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsIngredientRelevantDataProvided() {
        return isIngredientRelevantDataProvided;
    }

    /**
     * Sets the value of the isIngredientRelevantDataProvided property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsIngredientRelevantDataProvided(NonBinaryLogicEnumerationType value) {
        this.isIngredientRelevantDataProvided = value;
    }

    /**
     * Gets the value of the additiveStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additiveStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditiveStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getAdditiveStatement() {
        if (additiveStatement == null) {
            additiveStatement = new ArrayList<Description5000Type>();
        }
        return this.additiveStatement;
    }

    /**
     * Gets the value of the additiveInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additiveInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditiveInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditiveInformationType }
     * 
     * 
     */
    public List<AdditiveInformationType> getAdditiveInformation() {
        if (additiveInformation == null) {
            additiveInformation = new ArrayList<AdditiveInformationType>();
        }
        return this.additiveInformation;
    }

    /**
     * Gets the value of the foodAndBeverageIngredient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foodAndBeverageIngredient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodAndBeverageIngredient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodAndBeverageIngredientType }
     * 
     * 
     */
    public List<FoodAndBeverageIngredientType> getFoodAndBeverageIngredient() {
        if (foodAndBeverageIngredient == null) {
            foodAndBeverageIngredient = new ArrayList<FoodAndBeverageIngredientType>();
        }
        return this.foodAndBeverageIngredient;
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
