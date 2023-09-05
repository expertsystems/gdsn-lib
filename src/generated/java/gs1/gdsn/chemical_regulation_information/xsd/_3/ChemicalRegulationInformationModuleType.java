
package gs1.gdsn.chemical_regulation_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.RegistrationInformationType;


/**
 * <p>Java class for ChemicalRegulationInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChemicalRegulationInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chemicalRegulationInformation" type="{urn:gs1:gdsn:chemical_regulation_information:xsd:3}ChemicalRegulationInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="registrationInformation" type="{urn:gs1:gdsn:gdsn_common:xsd:3}RegistrationInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChemicalRegulationInformationModuleType", propOrder = {
    "chemicalRegulationInformation",
    "registrationInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:chemical_regulation_information:xsd:3")
public class ChemicalRegulationInformationModuleType {

    protected List<ChemicalRegulationInformationType> chemicalRegulationInformation;
    protected List<RegistrationInformationType> registrationInformation;

    /**
     * Gets the value of the chemicalRegulationInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chemicalRegulationInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChemicalRegulationInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChemicalRegulationInformationType }
     * 
     * 
     */
    public List<ChemicalRegulationInformationType> getChemicalRegulationInformation() {
        if (chemicalRegulationInformation == null) {
            chemicalRegulationInformation = new ArrayList<ChemicalRegulationInformationType>();
        }
        return this.chemicalRegulationInformation;
    }

    /**
     * Gets the value of the registrationInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrationInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrationInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrationInformationType }
     * 
     * 
     */
    public List<RegistrationInformationType> getRegistrationInformation() {
        if (registrationInformation == null) {
            registrationInformation = new ArrayList<RegistrationInformationType>();
        }
        return this.registrationInformation;
    }

}
