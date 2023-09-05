
package gs1.gdsn.sustainability_module.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SustainabilityModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SustainabilityModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sustainabilityInformation" type="{urn:gs1:gdsn:sustainability_module:xsd:3}SustainabilityInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SustainabilityModuleType", propOrder = {
    "sustainabilityInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:sustainability_module:xsd:3")
public class SustainabilityModuleType {

    protected SustainabilityInformationType sustainabilityInformation;

    /**
     * Gets the value of the sustainabilityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SustainabilityInformationType }
     *     
     */
    public SustainabilityInformationType getSustainabilityInformation() {
        return sustainabilityInformation;
    }

    /**
     * Sets the value of the sustainabilityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SustainabilityInformationType }
     *     
     */
    public void setSustainabilityInformation(SustainabilityInformationType value) {
        this.sustainabilityInformation = value;
    }

}
