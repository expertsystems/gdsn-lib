
package gs1.gdsn.child_nutrition_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChildNutritionInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChildNutritionInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="childNutritionLabel" type="{urn:gs1:gdsn:child_nutrition_information:xsd:3}ChildNutritionLabelType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChildNutritionInformationModuleType", propOrder = {
    "childNutritionLabel"
})
public class ChildNutritionInformationModuleType {

    protected List<ChildNutritionLabelType> childNutritionLabel;

    /**
     * Gets the value of the childNutritionLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childNutritionLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildNutritionLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildNutritionLabelType }
     * 
     * 
     */
    public List<ChildNutritionLabelType> getChildNutritionLabel() {
        if (childNutritionLabel == null) {
            childNutritionLabel = new ArrayList<ChildNutritionLabelType>();
        }
        return this.childNutritionLabel;
    }

}
