
package gs1.gdsn.diet_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DietInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DietInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dietInformation" type="{urn:gs1:gdsn:diet_information:xsd:3}DietInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DietInformationModuleType", propOrder = {
    "dietInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:diet_information:xsd:3")
public class DietInformationModuleType {

    protected DietInformationType dietInformation;

    /**
     * Gets the value of the dietInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DietInformationType }
     *     
     */
    public DietInformationType getDietInformation() {
        return dietInformation;
    }

    /**
     * Sets the value of the dietInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DietInformationType }
     *     
     */
    public void setDietInformation(DietInformationType value) {
        this.dietInformation = value;
    }

}
