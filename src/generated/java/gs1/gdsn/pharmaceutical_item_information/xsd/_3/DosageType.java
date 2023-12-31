
package gs1.gdsn.pharmaceutical_item_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.CodeType;
import gs1.shared.shared_common.xsd._3.Description2500Type;


/**
 * <p>Java class for DosageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DosageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dosageFormTypeCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dosageRecommendation" type="{urn:gs1:shared:shared_common:xsd:3}Description2500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dosageRestrictionLimits" type="{urn:gs1:shared:shared_common:xsd:3}Description2500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DosageType", propOrder = {
    "dosageFormTypeCodeReference",
    "dosageRecommendation",
    "dosageRestrictionLimits"
})
public class DosageType {

    protected List<CodeType> dosageFormTypeCodeReference;
    protected List<Description2500Type> dosageRecommendation;
    protected List<Description2500Type> dosageRestrictionLimits;

    /**
     * Gets the value of the dosageFormTypeCodeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dosageFormTypeCodeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDosageFormTypeCodeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getDosageFormTypeCodeReference() {
        if (dosageFormTypeCodeReference == null) {
            dosageFormTypeCodeReference = new ArrayList<CodeType>();
        }
        return this.dosageFormTypeCodeReference;
    }

    /**
     * Gets the value of the dosageRecommendation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dosageRecommendation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDosageRecommendation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description2500Type }
     * 
     * 
     */
    public List<Description2500Type> getDosageRecommendation() {
        if (dosageRecommendation == null) {
            dosageRecommendation = new ArrayList<Description2500Type>();
        }
        return this.dosageRecommendation;
    }

    /**
     * Gets the value of the dosageRestrictionLimits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dosageRestrictionLimits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDosageRestrictionLimits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description2500Type }
     * 
     * 
     */
    public List<Description2500Type> getDosageRestrictionLimits() {
        if (dosageRestrictionLimits == null) {
            dosageRestrictionLimits = new ArrayList<Description2500Type>();
        }
        return this.dosageRestrictionLimits;
    }

}
