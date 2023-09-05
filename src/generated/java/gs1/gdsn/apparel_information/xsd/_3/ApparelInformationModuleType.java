
package gs1.gdsn.apparel_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApparelInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApparelInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apparelInformation" type="{urn:gs1:gdsn:apparel_information:xsd:3}ApparelInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApparelInformationModuleType", propOrder = {
    "apparelInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:apparel_information:xsd:3")
public class ApparelInformationModuleType {

    protected ApparelInformationType apparelInformation;

    /**
     * Gets the value of the apparelInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ApparelInformationType }
     *     
     */
    public ApparelInformationType getApparelInformation() {
        return apparelInformation;
    }

    /**
     * Sets the value of the apparelInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparelInformationType }
     *     
     */
    public void setApparelInformation(ApparelInformationType value) {
        this.apparelInformation = value;
    }

}
