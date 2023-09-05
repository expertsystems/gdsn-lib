
package gs1.gdsn.allergen_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllergenInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllergenInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="allergenRelatedInformation" type="{urn:gs1:gdsn:allergen_information:xsd:3}AllergenRelatedInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllergenInformationModuleType", propOrder = {
    "allergenRelatedInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:allergen_information:xsd:3")
public class AllergenInformationModuleType {

    protected List<AllergenRelatedInformationType> allergenRelatedInformation;

    /**
     * Gets the value of the allergenRelatedInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allergenRelatedInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllergenRelatedInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllergenRelatedInformationType }
     * 
     * 
     */
    public List<AllergenRelatedInformationType> getAllergenRelatedInformation() {
        if (allergenRelatedInformation == null) {
            allergenRelatedInformation = new ArrayList<AllergenRelatedInformationType>();
        }
        return this.allergenRelatedInformation;
    }

}
