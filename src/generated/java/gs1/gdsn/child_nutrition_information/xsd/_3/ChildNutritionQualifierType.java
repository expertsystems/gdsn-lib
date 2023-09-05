
package gs1.gdsn.child_nutrition_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for ChildNutritionQualifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChildNutritionQualifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="childNutritionQualifierCode" type="{urn:gs1:gdsn:child_nutrition_information:xsd:3}ChildNutritionQualifierCodeType" minOccurs="0"/&gt;
 *         &lt;element name="childNutritionQualifiedValue" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="childNutritionValue" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChildNutritionQualifierType", propOrder = {
    "childNutritionQualifierCode",
    "childNutritionQualifiedValue",
    "childNutritionValue"
})
public class ChildNutritionQualifierType {

    protected ChildNutritionQualifierCodeType childNutritionQualifierCode;
    protected List<MeasurementType> childNutritionQualifiedValue;
    protected List<MeasurementType> childNutritionValue;

    /**
     * Gets the value of the childNutritionQualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link ChildNutritionQualifierCodeType }
     *     
     */
    public ChildNutritionQualifierCodeType getChildNutritionQualifierCode() {
        return childNutritionQualifierCode;
    }

    /**
     * Sets the value of the childNutritionQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChildNutritionQualifierCodeType }
     *     
     */
    public void setChildNutritionQualifierCode(ChildNutritionQualifierCodeType value) {
        this.childNutritionQualifierCode = value;
    }

    /**
     * Gets the value of the childNutritionQualifiedValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childNutritionQualifiedValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildNutritionQualifiedValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getChildNutritionQualifiedValue() {
        if (childNutritionQualifiedValue == null) {
            childNutritionQualifiedValue = new ArrayList<MeasurementType>();
        }
        return this.childNutritionQualifiedValue;
    }

    /**
     * Gets the value of the childNutritionValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childNutritionValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildNutritionValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getChildNutritionValue() {
        if (childNutritionValue == null) {
            childNutritionValue = new ArrayList<MeasurementType>();
        }
        return this.childNutritionValue;
    }

}
