
package gs1.gdsn.chemical_regulation_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;


/**
 * <p>Java class for ChemicalRegulationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChemicalRegulationInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chemicalRegulationAgency"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="chemicalRegulation" type="{urn:gs1:gdsn:chemical_regulation_information:xsd:3}ChemicalRegulationType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "ChemicalRegulationInformationType", propOrder = {
    "chemicalRegulationAgency",
    "chemicalRegulation",
    "avpList"
})
public class ChemicalRegulationInformationType {

    @XmlElement(required = true)
    protected String chemicalRegulationAgency;
    @XmlElement(required = true)
    protected List<ChemicalRegulationType> chemicalRegulation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the chemicalRegulationAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChemicalRegulationAgency() {
        return chemicalRegulationAgency;
    }

    /**
     * Sets the value of the chemicalRegulationAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChemicalRegulationAgency(String value) {
        this.chemicalRegulationAgency = value;
    }

    /**
     * Gets the value of the chemicalRegulation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chemicalRegulation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChemicalRegulation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChemicalRegulationType }
     * 
     * 
     */
    public List<ChemicalRegulationType> getChemicalRegulation() {
        if (chemicalRegulation == null) {
            chemicalRegulation = new ArrayList<ChemicalRegulationType>();
        }
        return this.chemicalRegulation;
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
