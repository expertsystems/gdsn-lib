
package gs1.gdsn.healthcare_item_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HealthcareItemInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HealthcareItemInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="healthcareItemInformation" type="{urn:gs1:gdsn:healthcare_item_information:xsd:3}HealthcareItemInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthcareItemInformationModuleType", propOrder = {
    "healthcareItemInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:healthcare_item_information:xsd:3")
public class HealthcareItemInformationModuleType {

    protected HealthcareItemInformationType healthcareItemInformation;

    /**
     * Gets the value of the healthcareItemInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HealthcareItemInformationType }
     *     
     */
    public HealthcareItemInformationType getHealthcareItemInformation() {
        return healthcareItemInformation;
    }

    /**
     * Sets the value of the healthcareItemInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthcareItemInformationType }
     *     
     */
    public void setHealthcareItemInformation(HealthcareItemInformationType value) {
        this.healthcareItemInformation = value;
    }

}
