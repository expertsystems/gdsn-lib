
package gs1.gdsn.plumbing_hvac_pipe_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlumbingHVACPipeInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlumbingHVACPipeInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="plumbingHVACPipeInformation" type="{urn:gs1:gdsn:plumbing_hvac_pipe_information:xsd:3}PlumbingHVACPipeInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlumbingHVACPipeInformationModuleType", propOrder = {
    "plumbingHVACPipeInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:plumbing_hvac_pipe_information:xsd:3")
public class PlumbingHVACPipeInformationModuleType {

    protected List<PlumbingHVACPipeInformationType> plumbingHVACPipeInformation;

    /**
     * Gets the value of the plumbingHVACPipeInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plumbingHVACPipeInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlumbingHVACPipeInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlumbingHVACPipeInformationType }
     * 
     * 
     */
    public List<PlumbingHVACPipeInformationType> getPlumbingHVACPipeInformation() {
        if (plumbingHVACPipeInformation == null) {
            plumbingHVACPipeInformation = new ArrayList<PlumbingHVACPipeInformationType>();
        }
        return this.plumbingHVACPipeInformation;
    }

}
