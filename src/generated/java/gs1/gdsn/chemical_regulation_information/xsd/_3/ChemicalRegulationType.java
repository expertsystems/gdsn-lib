
package gs1.gdsn.chemical_regulation_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for ChemicalRegulationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChemicalRegulationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chemicalRegulationName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isChemicalRegulationCompliant" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="regulatedChemical" type="{urn:gs1:gdsn:chemical_regulation_information:xsd:3}RegulatedChemicalType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChemicalRegulationType", propOrder = {
    "chemicalRegulationName",
    "isChemicalRegulationCompliant",
    "regulatedChemical"
})
public class ChemicalRegulationType {

    @XmlElement(required = true)
    protected String chemicalRegulationName;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isChemicalRegulationCompliant;
    protected List<RegulatedChemicalType> regulatedChemical;

    /**
     * Gets the value of the chemicalRegulationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChemicalRegulationName() {
        return chemicalRegulationName;
    }

    /**
     * Sets the value of the chemicalRegulationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChemicalRegulationName(String value) {
        this.chemicalRegulationName = value;
    }

    /**
     * Gets the value of the isChemicalRegulationCompliant property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsChemicalRegulationCompliant() {
        return isChemicalRegulationCompliant;
    }

    /**
     * Sets the value of the isChemicalRegulationCompliant property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsChemicalRegulationCompliant(NonBinaryLogicEnumerationType value) {
        this.isChemicalRegulationCompliant = value;
    }

    /**
     * Gets the value of the regulatedChemical property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regulatedChemical property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegulatedChemical().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegulatedChemicalType }
     * 
     * 
     */
    public List<RegulatedChemicalType> getRegulatedChemical() {
        if (regulatedChemical == null) {
            regulatedChemical = new ArrayList<RegulatedChemicalType>();
        }
        return this.regulatedChemical;
    }

}
