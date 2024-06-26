
package gs1.gdsn.nonfood_ingredient.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.CodeType;
import gs1.shared.shared_common.xsd._3.Description500Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for NonfoodIngredientType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonfoodIngredientType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isIngredientActive" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="isIngredientGeneric" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="nonfoodIngredientCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="nonfoodIngredientName" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isNonfoodIngredientEmphasized" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="nonfoodIngredientDefinition" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nonfoodIngredientPurpose" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="driedEquivalent" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ingredientStrength" type="{urn:gs1:gdsn:nonfood_ingredient:xsd:3}IngredientStrengthType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "NonfoodIngredientType", propOrder = {
    "isIngredientActive",
    "isIngredientGeneric",
    "nonfoodIngredientCodeReference",
    "nonfoodIngredientName",
    "isNonfoodIngredientEmphasized",
    "nonfoodIngredientDefinition",
    "nonfoodIngredientPurpose",
    "driedEquivalent",
    "ingredientStrength",
    "avpList"
})
public class NonfoodIngredientType {

    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isIngredientActive;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isIngredientGeneric;
    protected CodeType nonfoodIngredientCodeReference;
    protected List<Description500Type> nonfoodIngredientName;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isNonfoodIngredientEmphasized;
    protected List<Description500Type> nonfoodIngredientDefinition;
    protected List<Description500Type> nonfoodIngredientPurpose;
    protected List<MeasurementType> driedEquivalent;
    protected List<IngredientStrengthType> ingredientStrength;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the isIngredientActive property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsIngredientActive() {
        return isIngredientActive;
    }

    /**
     * Sets the value of the isIngredientActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsIngredientActive(NonBinaryLogicEnumerationType value) {
        this.isIngredientActive = value;
    }

    /**
     * Gets the value of the isIngredientGeneric property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsIngredientGeneric() {
        return isIngredientGeneric;
    }

    /**
     * Sets the value of the isIngredientGeneric property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsIngredientGeneric(NonBinaryLogicEnumerationType value) {
        this.isIngredientGeneric = value;
    }

    /**
     * Gets the value of the nonfoodIngredientCodeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getNonfoodIngredientCodeReference() {
        return nonfoodIngredientCodeReference;
    }

    /**
     * Sets the value of the nonfoodIngredientCodeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setNonfoodIngredientCodeReference(CodeType value) {
        this.nonfoodIngredientCodeReference = value;
    }

    /**
     * Gets the value of the nonfoodIngredientName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonfoodIngredientName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonfoodIngredientName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getNonfoodIngredientName() {
        if (nonfoodIngredientName == null) {
            nonfoodIngredientName = new ArrayList<Description500Type>();
        }
        return this.nonfoodIngredientName;
    }

    /**
     * Gets the value of the isNonfoodIngredientEmphasized property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsNonfoodIngredientEmphasized() {
        return isNonfoodIngredientEmphasized;
    }

    /**
     * Sets the value of the isNonfoodIngredientEmphasized property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsNonfoodIngredientEmphasized(NonBinaryLogicEnumerationType value) {
        this.isNonfoodIngredientEmphasized = value;
    }

    /**
     * Gets the value of the nonfoodIngredientDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonfoodIngredientDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonfoodIngredientDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getNonfoodIngredientDefinition() {
        if (nonfoodIngredientDefinition == null) {
            nonfoodIngredientDefinition = new ArrayList<Description500Type>();
        }
        return this.nonfoodIngredientDefinition;
    }

    /**
     * Gets the value of the nonfoodIngredientPurpose property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonfoodIngredientPurpose property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonfoodIngredientPurpose().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getNonfoodIngredientPurpose() {
        if (nonfoodIngredientPurpose == null) {
            nonfoodIngredientPurpose = new ArrayList<Description500Type>();
        }
        return this.nonfoodIngredientPurpose;
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
     * Gets the value of the ingredientStrength property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredientStrength property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredientStrength().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IngredientStrengthType }
     * 
     * 
     */
    public List<IngredientStrengthType> getIngredientStrength() {
        if (ingredientStrength == null) {
            ingredientStrength = new ArrayList<IngredientStrengthType>();
        }
        return this.ingredientStrength;
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
