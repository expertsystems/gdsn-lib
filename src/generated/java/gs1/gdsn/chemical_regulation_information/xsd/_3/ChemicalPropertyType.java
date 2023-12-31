
package gs1.gdsn.chemical_regulation_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description1000Type;


/**
 * <p>Java class for ChemicalPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChemicalPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chemicalPropertyCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="chemicalPropertyName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="chemicalPropertyAdditionalDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChemicalPropertyType", propOrder = {
    "chemicalPropertyCode",
    "chemicalPropertyName",
    "chemicalPropertyAdditionalDescription"
})
public class ChemicalPropertyType {

    protected String chemicalPropertyCode;
    protected String chemicalPropertyName;
    protected List<Description1000Type> chemicalPropertyAdditionalDescription;

    /**
     * Gets the value of the chemicalPropertyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChemicalPropertyCode() {
        return chemicalPropertyCode;
    }

    /**
     * Sets the value of the chemicalPropertyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChemicalPropertyCode(String value) {
        this.chemicalPropertyCode = value;
    }

    /**
     * Gets the value of the chemicalPropertyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChemicalPropertyName() {
        return chemicalPropertyName;
    }

    /**
     * Sets the value of the chemicalPropertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChemicalPropertyName(String value) {
        this.chemicalPropertyName = value;
    }

    /**
     * Gets the value of the chemicalPropertyAdditionalDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chemicalPropertyAdditionalDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChemicalPropertyAdditionalDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getChemicalPropertyAdditionalDescription() {
        if (chemicalPropertyAdditionalDescription == null) {
            chemicalPropertyAdditionalDescription = new ArrayList<Description1000Type>();
        }
        return this.chemicalPropertyAdditionalDescription;
    }

}
