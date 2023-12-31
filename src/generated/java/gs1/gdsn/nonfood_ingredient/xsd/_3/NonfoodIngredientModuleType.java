
package gs1.gdsn.nonfood_ingredient.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.AdditiveInformationType;
import gs1.gdsn.gdsn_common.xsd._3.FormattedDescription5000Type;
import gs1.shared.shared_common.xsd._3.Description5000Type;


/**
 * <p>Java class for NonfoodIngredientModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonfoodIngredientModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nonfoodIngredientStatement" type="{urn:gs1:gdsn:gdsn_common:xsd:3}FormattedDescription5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nonfoodIngredientOfConcernCode" type="{urn:gs1:gdsn:nonfood_ingredient:xsd:3}NonfoodIngredientOfConcernCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="additiveStatement" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="additiveInformation" type="{urn:gs1:gdsn:gdsn_common:xsd:3}AdditiveInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nonfoodIngredient" type="{urn:gs1:gdsn:nonfood_ingredient:xsd:3}NonfoodIngredientType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonfoodIngredientModuleType", propOrder = {
    "nonfoodIngredientStatement",
    "nonfoodIngredientOfConcernCode",
    "additiveStatement",
    "additiveInformation",
    "nonfoodIngredient"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:nonfood_ingredient:xsd:3")
public class NonfoodIngredientModuleType {

    protected List<FormattedDescription5000Type> nonfoodIngredientStatement;
    protected List<NonfoodIngredientOfConcernCodeType> nonfoodIngredientOfConcernCode;
    protected List<Description5000Type> additiveStatement;
    protected List<AdditiveInformationType> additiveInformation;
    protected List<NonfoodIngredientType> nonfoodIngredient;

    /**
     * Gets the value of the nonfoodIngredientStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonfoodIngredientStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonfoodIngredientStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormattedDescription5000Type }
     * 
     * 
     */
    public List<FormattedDescription5000Type> getNonfoodIngredientStatement() {
        if (nonfoodIngredientStatement == null) {
            nonfoodIngredientStatement = new ArrayList<FormattedDescription5000Type>();
        }
        return this.nonfoodIngredientStatement;
    }

    /**
     * Gets the value of the nonfoodIngredientOfConcernCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonfoodIngredientOfConcernCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonfoodIngredientOfConcernCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonfoodIngredientOfConcernCodeType }
     * 
     * 
     */
    public List<NonfoodIngredientOfConcernCodeType> getNonfoodIngredientOfConcernCode() {
        if (nonfoodIngredientOfConcernCode == null) {
            nonfoodIngredientOfConcernCode = new ArrayList<NonfoodIngredientOfConcernCodeType>();
        }
        return this.nonfoodIngredientOfConcernCode;
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
     * Gets the value of the nonfoodIngredient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonfoodIngredient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonfoodIngredient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonfoodIngredientType }
     * 
     * 
     */
    public List<NonfoodIngredientType> getNonfoodIngredient() {
        if (nonfoodIngredient == null) {
            nonfoodIngredient = new ArrayList<NonfoodIngredientType>();
        }
        return this.nonfoodIngredient;
    }

}
