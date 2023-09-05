
package gs1.gdsn.pharmaceutical_item_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PharmaceuticalItemInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PharmaceuticalItemInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pharmaceuticalItemInformation" type="{urn:gs1:gdsn:pharmaceutical_item_information:xsd:3}PharmaceuticalItemInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PharmaceuticalItemInformationModuleType", propOrder = {
    "pharmaceuticalItemInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:pharmaceutical_item_information:xsd:3")
public class PharmaceuticalItemInformationModuleType {

    protected PharmaceuticalItemInformationType pharmaceuticalItemInformation;

    /**
     * Gets the value of the pharmaceuticalItemInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PharmaceuticalItemInformationType }
     *     
     */
    public PharmaceuticalItemInformationType getPharmaceuticalItemInformation() {
        return pharmaceuticalItemInformation;
    }

    /**
     * Sets the value of the pharmaceuticalItemInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PharmaceuticalItemInformationType }
     *     
     */
    public void setPharmaceuticalItemInformation(PharmaceuticalItemInformationType value) {
        this.pharmaceuticalItemInformation = value;
    }

}
