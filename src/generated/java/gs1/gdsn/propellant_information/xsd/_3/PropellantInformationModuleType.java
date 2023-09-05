
package gs1.gdsn.propellant_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropellantInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropellantInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="propellantInformation" type="{urn:gs1:gdsn:propellant_information:xsd:3}PropellantInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropellantInformationModuleType", propOrder = {
    "propellantInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:propellant_information:xsd:3")
public class PropellantInformationModuleType {

    protected PropellantInformationType propellantInformation;

    /**
     * Gets the value of the propellantInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PropellantInformationType }
     *     
     */
    public PropellantInformationType getPropellantInformation() {
        return propellantInformation;
    }

    /**
     * Sets the value of the propellantInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropellantInformationType }
     *     
     */
    public void setPropellantInformation(PropellantInformationType value) {
        this.propellantInformation = value;
    }

}
