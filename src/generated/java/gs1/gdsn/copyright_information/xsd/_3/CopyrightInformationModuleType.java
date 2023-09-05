
package gs1.gdsn.copyright_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CopyrightInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CopyrightInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="copyrightInformation" type="{urn:gs1:gdsn:copyright_information:xsd:3}CopyrightInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopyrightInformationModuleType", propOrder = {
    "copyrightInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:copyright_information:xsd:3")
public class CopyrightInformationModuleType {

    protected List<CopyrightInformationType> copyrightInformation;

    /**
     * Gets the value of the copyrightInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copyrightInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopyrightInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CopyrightInformationType }
     * 
     * 
     */
    public List<CopyrightInformationType> getCopyrightInformation() {
        if (copyrightInformation == null) {
            copyrightInformation = new ArrayList<CopyrightInformationType>();
        }
        return this.copyrightInformation;
    }

}
