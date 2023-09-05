
package gs1.gdsn.health_related_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for NutritionalProgramIngredientsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NutritionalProgramIngredientsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nutritionalProgramIngredientMeasurement" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nutritionalProgramIngredientTypeCode" type="{urn:gs1:gdsn:health_related_information:xsd:3}NutritionalProgramIngredientTypeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NutritionalProgramIngredientsType", propOrder = {
    "nutritionalProgramIngredientMeasurement",
    "nutritionalProgramIngredientTypeCode"
})
public class NutritionalProgramIngredientsType {

    protected List<MeasurementType> nutritionalProgramIngredientMeasurement;
    protected NutritionalProgramIngredientTypeCodeType nutritionalProgramIngredientTypeCode;

    /**
     * Gets the value of the nutritionalProgramIngredientMeasurement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nutritionalProgramIngredientMeasurement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNutritionalProgramIngredientMeasurement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getNutritionalProgramIngredientMeasurement() {
        if (nutritionalProgramIngredientMeasurement == null) {
            nutritionalProgramIngredientMeasurement = new ArrayList<MeasurementType>();
        }
        return this.nutritionalProgramIngredientMeasurement;
    }

    /**
     * Gets the value of the nutritionalProgramIngredientTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link NutritionalProgramIngredientTypeCodeType }
     *     
     */
    public NutritionalProgramIngredientTypeCodeType getNutritionalProgramIngredientTypeCode() {
        return nutritionalProgramIngredientTypeCode;
    }

    /**
     * Sets the value of the nutritionalProgramIngredientTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NutritionalProgramIngredientTypeCodeType }
     *     
     */
    public void setNutritionalProgramIngredientTypeCode(NutritionalProgramIngredientTypeCodeType value) {
        this.nutritionalProgramIngredientTypeCode = value;
    }

}
