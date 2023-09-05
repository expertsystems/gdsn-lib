
package gs1.gdsn.health_related_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HealthRelatedInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HealthRelatedInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="healthRelatedInformation" type="{urn:gs1:gdsn:health_related_information:xsd:3}HealthRelatedInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthRelatedInformationModuleType", propOrder = {
    "healthRelatedInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:health_related_information:xsd:3")
public class HealthRelatedInformationModuleType {

    protected HealthRelatedInformationType healthRelatedInformation;

    /**
     * Gets the value of the healthRelatedInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HealthRelatedInformationType }
     *     
     */
    public HealthRelatedInformationType getHealthRelatedInformation() {
        return healthRelatedInformation;
    }

    /**
     * Sets the value of the healthRelatedInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthRelatedInformationType }
     *     
     */
    public void setHealthRelatedInformation(HealthRelatedInformationType value) {
        this.healthRelatedInformation = value;
    }

}
