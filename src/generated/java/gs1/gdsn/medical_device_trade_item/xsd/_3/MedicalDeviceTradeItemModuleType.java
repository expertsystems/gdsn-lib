
package gs1.gdsn.medical_device_trade_item.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MedicalDeviceTradeItemModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicalDeviceTradeItemModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="medicalDeviceInformation" type="{urn:gs1:gdsn:medical_device_trade_item:xsd:3}MedicalDeviceInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicalDeviceTradeItemModuleType", propOrder = {
    "medicalDeviceInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:medical_device_trade_item:xsd:3")
public class MedicalDeviceTradeItemModuleType {

    protected MedicalDeviceInformationType medicalDeviceInformation;

    /**
     * Gets the value of the medicalDeviceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MedicalDeviceInformationType }
     *     
     */
    public MedicalDeviceInformationType getMedicalDeviceInformation() {
        return medicalDeviceInformation;
    }

    /**
     * Sets the value of the medicalDeviceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicalDeviceInformationType }
     *     
     */
    public void setMedicalDeviceInformation(MedicalDeviceInformationType value) {
        this.medicalDeviceInformation = value;
    }

}
