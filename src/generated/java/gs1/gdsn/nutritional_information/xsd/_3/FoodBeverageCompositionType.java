
package gs1.gdsn.nutritional_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FoodBeverageCompositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FoodBeverageCompositionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="foodBeverageCompositionCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="foodBeverageCompositionDatabaseCode" type="{urn:gs1:gdsn:nutritional_information:xsd:3}FoodBeverageCompositionDatabaseCodeType" minOccurs="0"/&gt;
 *         &lt;element name="foodBeverageCompositionDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoodBeverageCompositionType", propOrder = {
    "foodBeverageCompositionCode",
    "foodBeverageCompositionDatabaseCode",
    "foodBeverageCompositionDescription"
})
public class FoodBeverageCompositionType {

    protected String foodBeverageCompositionCode;
    protected FoodBeverageCompositionDatabaseCodeType foodBeverageCompositionDatabaseCode;
    protected String foodBeverageCompositionDescription;

    /**
     * Gets the value of the foodBeverageCompositionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoodBeverageCompositionCode() {
        return foodBeverageCompositionCode;
    }

    /**
     * Sets the value of the foodBeverageCompositionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoodBeverageCompositionCode(String value) {
        this.foodBeverageCompositionCode = value;
    }

    /**
     * Gets the value of the foodBeverageCompositionDatabaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link FoodBeverageCompositionDatabaseCodeType }
     *     
     */
    public FoodBeverageCompositionDatabaseCodeType getFoodBeverageCompositionDatabaseCode() {
        return foodBeverageCompositionDatabaseCode;
    }

    /**
     * Sets the value of the foodBeverageCompositionDatabaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodBeverageCompositionDatabaseCodeType }
     *     
     */
    public void setFoodBeverageCompositionDatabaseCode(FoodBeverageCompositionDatabaseCodeType value) {
        this.foodBeverageCompositionDatabaseCode = value;
    }

    /**
     * Gets the value of the foodBeverageCompositionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoodBeverageCompositionDescription() {
        return foodBeverageCompositionDescription;
    }

    /**
     * Sets the value of the foodBeverageCompositionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoodBeverageCompositionDescription(String value) {
        this.foodBeverageCompositionDescription = value;
    }

}
