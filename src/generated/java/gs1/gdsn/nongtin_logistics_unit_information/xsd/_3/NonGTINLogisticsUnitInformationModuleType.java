
package gs1.gdsn.nongtin_logistics_unit_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonGTINLogisticsUnitInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonGTINLogisticsUnitInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nonGTINLogisticsUnitInformation" type="{urn:gs1:gdsn:nongtin_logistics_unit_information:xsd:3}NonGTINLogisticsUnitInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonGTINLogisticsUnitInformationModuleType", propOrder = {
    "nonGTINLogisticsUnitInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:nongtin_logistics_unit_information:xsd:3")
public class NonGTINLogisticsUnitInformationModuleType {

    protected NonGTINLogisticsUnitInformationType nonGTINLogisticsUnitInformation;

    /**
     * Gets the value of the nonGTINLogisticsUnitInformation property.
     * 
     * @return
     *     possible object is
     *     {@link NonGTINLogisticsUnitInformationType }
     *     
     */
    public NonGTINLogisticsUnitInformationType getNonGTINLogisticsUnitInformation() {
        return nonGTINLogisticsUnitInformation;
    }

    /**
     * Sets the value of the nonGTINLogisticsUnitInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonGTINLogisticsUnitInformationType }
     *     
     */
    public void setNonGTINLogisticsUnitInformation(NonGTINLogisticsUnitInformationType value) {
        this.nonGTINLogisticsUnitInformation = value;
    }

}
