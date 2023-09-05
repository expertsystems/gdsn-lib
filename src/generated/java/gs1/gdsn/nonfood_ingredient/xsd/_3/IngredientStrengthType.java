
package gs1.gdsn.nonfood_ingredient.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for IngredientStrengthType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IngredientStrengthType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ingredientStrength" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="ingredientStrengthBasis" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IngredientStrengthType", propOrder = {
    "ingredientStrength",
    "ingredientStrengthBasis"
})
public class IngredientStrengthType {

    protected MeasurementType ingredientStrength;
    protected MeasurementType ingredientStrengthBasis;

    /**
     * Gets the value of the ingredientStrength property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getIngredientStrength() {
        return ingredientStrength;
    }

    /**
     * Sets the value of the ingredientStrength property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setIngredientStrength(MeasurementType value) {
        this.ingredientStrength = value;
    }

    /**
     * Gets the value of the ingredientStrengthBasis property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getIngredientStrengthBasis() {
        return ingredientStrengthBasis;
    }

    /**
     * Sets the value of the ingredientStrengthBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setIngredientStrengthBasis(MeasurementType value) {
        this.ingredientStrengthBasis = value;
    }

}
