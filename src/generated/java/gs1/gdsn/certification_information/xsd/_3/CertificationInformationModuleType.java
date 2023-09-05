
package gs1.gdsn.certification_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.CertificationInformationType;


/**
 * <p>Java class for CertificationInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificationInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="certificationInformation" type="{urn:gs1:gdsn:gdsn_common:xsd:3}CertificationInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificationInformationModuleType", propOrder = {
    "certificationInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:certification_information:xsd:3")
public class CertificationInformationModuleType {

    protected List<CertificationInformationType> certificationInformation;

    /**
     * Gets the value of the certificationInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificationInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificationInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificationInformationType }
     * 
     * 
     */
    public List<CertificationInformationType> getCertificationInformation() {
        if (certificationInformation == null) {
            certificationInformation = new ArrayList<CertificationInformationType>();
        }
        return this.certificationInformation;
    }

}
