
package gs1.gdsn.safety_data_sheet.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChemicalInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChemicalInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chemicalIngredientOrganisation" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="chemicalIngredientScheme" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="chemicalIngredient" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}ChemicalIngredientType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChemicalInformationType", propOrder = {
    "chemicalIngredientOrganisation",
    "chemicalIngredientScheme",
    "chemicalIngredient"
})
public class ChemicalInformationType {

    protected String chemicalIngredientOrganisation;
    protected String chemicalIngredientScheme;
    protected List<ChemicalIngredientType> chemicalIngredient;

    /**
     * Gets the value of the chemicalIngredientOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChemicalIngredientOrganisation() {
        return chemicalIngredientOrganisation;
    }

    /**
     * Sets the value of the chemicalIngredientOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChemicalIngredientOrganisation(String value) {
        this.chemicalIngredientOrganisation = value;
    }

    /**
     * Gets the value of the chemicalIngredientScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChemicalIngredientScheme() {
        return chemicalIngredientScheme;
    }

    /**
     * Sets the value of the chemicalIngredientScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChemicalIngredientScheme(String value) {
        this.chemicalIngredientScheme = value;
    }

    /**
     * Gets the value of the chemicalIngredient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chemicalIngredient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChemicalIngredient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChemicalIngredientType }
     * 
     * 
     */
    public List<ChemicalIngredientType> getChemicalIngredient() {
        if (chemicalIngredient == null) {
            chemicalIngredient = new ArrayList<ChemicalIngredientType>();
        }
        return this.chemicalIngredient;
    }

}
