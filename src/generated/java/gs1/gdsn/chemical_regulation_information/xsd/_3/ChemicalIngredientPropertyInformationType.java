
package gs1.gdsn.chemical_regulation_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChemicalIngredientPropertyInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChemicalIngredientPropertyInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chemicalPhysicalStateCode" type="{urn:gs1:gdsn:chemical_regulation_information:xsd:3}ChemicalPhysicalStateCodeType" minOccurs="0"/&gt;
 *         &lt;element name="chemicalPropertyTypeCode" type="{urn:gs1:gdsn:chemical_regulation_information:xsd:3}ChemicalPropertyTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="chemicalProperty" type="{urn:gs1:gdsn:chemical_regulation_information:xsd:3}ChemicalPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChemicalIngredientPropertyInformationType", propOrder = {
    "chemicalPhysicalStateCode",
    "chemicalPropertyTypeCode",
    "chemicalProperty"
})
public class ChemicalIngredientPropertyInformationType {

    protected ChemicalPhysicalStateCodeType chemicalPhysicalStateCode;
    protected ChemicalPropertyTypeCodeType chemicalPropertyTypeCode;
    protected List<ChemicalPropertyType> chemicalProperty;

    /**
     * Gets the value of the chemicalPhysicalStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link ChemicalPhysicalStateCodeType }
     *     
     */
    public ChemicalPhysicalStateCodeType getChemicalPhysicalStateCode() {
        return chemicalPhysicalStateCode;
    }

    /**
     * Sets the value of the chemicalPhysicalStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChemicalPhysicalStateCodeType }
     *     
     */
    public void setChemicalPhysicalStateCode(ChemicalPhysicalStateCodeType value) {
        this.chemicalPhysicalStateCode = value;
    }

    /**
     * Gets the value of the chemicalPropertyTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ChemicalPropertyTypeCodeType }
     *     
     */
    public ChemicalPropertyTypeCodeType getChemicalPropertyTypeCode() {
        return chemicalPropertyTypeCode;
    }

    /**
     * Sets the value of the chemicalPropertyTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChemicalPropertyTypeCodeType }
     *     
     */
    public void setChemicalPropertyTypeCode(ChemicalPropertyTypeCodeType value) {
        this.chemicalPropertyTypeCode = value;
    }

    /**
     * Gets the value of the chemicalProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chemicalProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChemicalProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChemicalPropertyType }
     * 
     * 
     */
    public List<ChemicalPropertyType> getChemicalProperty() {
        if (chemicalProperty == null) {
            chemicalProperty = new ArrayList<ChemicalPropertyType>();
        }
        return this.chemicalProperty;
    }

}
