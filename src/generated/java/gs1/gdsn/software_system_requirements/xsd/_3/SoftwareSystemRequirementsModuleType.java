
package gs1.gdsn.software_system_requirements.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoftwareSystemRequirementsModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoftwareSystemRequirementsModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="softwareSystemRequirements" type="{urn:gs1:gdsn:software_system_requirements:xsd:3}SoftwareSystemRequirementsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoftwareSystemRequirementsModuleType", propOrder = {
    "softwareSystemRequirements"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:software_system_requirements:xsd:3")
public class SoftwareSystemRequirementsModuleType {

    protected List<SoftwareSystemRequirementsType> softwareSystemRequirements;

    /**
     * Gets the value of the softwareSystemRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softwareSystemRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftwareSystemRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoftwareSystemRequirementsType }
     * 
     * 
     */
    public List<SoftwareSystemRequirementsType> getSoftwareSystemRequirements() {
        if (softwareSystemRequirements == null) {
            softwareSystemRequirements = new ArrayList<SoftwareSystemRequirementsType>();
        }
        return this.softwareSystemRequirements;
    }

}
