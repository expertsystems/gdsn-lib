
package gs1.gdsn.onix_publication_file_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ONIXSupplyDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ONIXSupplyDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="onixProductAvailabilityCode" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXProductAvailabilityCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ONIXSupplyDetailType", propOrder = {
    "onixProductAvailabilityCode"
})
public class ONIXSupplyDetailType {

    protected ONIXProductAvailabilityCodeType onixProductAvailabilityCode;

    /**
     * Gets the value of the onixProductAvailabilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link ONIXProductAvailabilityCodeType }
     *     
     */
    public ONIXProductAvailabilityCodeType getOnixProductAvailabilityCode() {
        return onixProductAvailabilityCode;
    }

    /**
     * Sets the value of the onixProductAvailabilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ONIXProductAvailabilityCodeType }
     *     
     */
    public void setOnixProductAvailabilityCode(ONIXProductAvailabilityCodeType value) {
        this.onixProductAvailabilityCode = value;
    }

}
