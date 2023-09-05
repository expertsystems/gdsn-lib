
package gs1.gdsn.alcohol_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcoholInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcoholInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alcoholInformation" type="{urn:gs1:gdsn:alcohol_information:xsd:3}AlcoholInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcoholInformationModuleType", propOrder = {
    "alcoholInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:alcohol_information:xsd:3")
public class AlcoholInformationModuleType {

    protected AlcoholInformationType alcoholInformation;

    /**
     * Gets the value of the alcoholInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AlcoholInformationType }
     *     
     */
    public AlcoholInformationType getAlcoholInformation() {
        return alcoholInformation;
    }

    /**
     * Sets the value of the alcoholInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcoholInformationType }
     *     
     */
    public void setAlcoholInformation(AlcoholInformationType value) {
        this.alcoholInformation = value;
    }

}
