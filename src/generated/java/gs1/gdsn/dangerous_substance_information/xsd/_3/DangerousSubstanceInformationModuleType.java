
package gs1.gdsn.dangerous_substance_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DangerousSubstanceInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DangerousSubstanceInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dangerousSubstanceInformation" type="{urn:gs1:gdsn:dangerous_substance_information:xsd:3}DangerousSubstanceInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DangerousSubstanceInformationModuleType", propOrder = {
    "dangerousSubstanceInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:dangerous_substance_information:xsd:3")
public class DangerousSubstanceInformationModuleType {

    protected List<DangerousSubstanceInformationType> dangerousSubstanceInformation;

    /**
     * Gets the value of the dangerousSubstanceInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dangerousSubstanceInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDangerousSubstanceInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DangerousSubstanceInformationType }
     * 
     * 
     */
    public List<DangerousSubstanceInformationType> getDangerousSubstanceInformation() {
        if (dangerousSubstanceInformation == null) {
            dangerousSubstanceInformation = new ArrayList<DangerousSubstanceInformationType>();
        }
        return this.dangerousSubstanceInformation;
    }

}
