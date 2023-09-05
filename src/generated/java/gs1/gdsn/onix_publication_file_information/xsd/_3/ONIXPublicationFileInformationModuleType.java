
package gs1.gdsn.onix_publication_file_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ONIXPublicationFileInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ONIXPublicationFileInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="oNIXPublicationFileInformation" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXPublicationFileInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ONIXPublicationFileInformationModuleType", propOrder = {
    "onixPublicationFileInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:onix_publication_file_information:xsd:3")
public class ONIXPublicationFileInformationModuleType {

    @XmlElement(name = "oNIXPublicationFileInformation")
    protected ONIXPublicationFileInformationType onixPublicationFileInformation;

    /**
     * Gets the value of the onixPublicationFileInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ONIXPublicationFileInformationType }
     *     
     */
    public ONIXPublicationFileInformationType getONIXPublicationFileInformation() {
        return onixPublicationFileInformation;
    }

    /**
     * Sets the value of the onixPublicationFileInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ONIXPublicationFileInformationType }
     *     
     */
    public void setONIXPublicationFileInformation(ONIXPublicationFileInformationType value) {
        this.onixPublicationFileInformation = value;
    }

}
