
package gs1.gdsn.video_display_device_information.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelevisionInformationServiceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelevisionInformationServiceInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="televisionInformationServiceTypeCode" type="{urn:gs1:gdsn:video_display_device_information:xsd:3}TelevisionInformationServiceTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="televisionTextMemoryPageQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelevisionInformationServiceInformationType", propOrder = {
    "televisionInformationServiceTypeCode",
    "televisionTextMemoryPageQuantity"
})
public class TelevisionInformationServiceInformationType {

    protected List<TelevisionInformationServiceTypeCodeType> televisionInformationServiceTypeCode;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger televisionTextMemoryPageQuantity;

    /**
     * Gets the value of the televisionInformationServiceTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the televisionInformationServiceTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelevisionInformationServiceTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelevisionInformationServiceTypeCodeType }
     * 
     * 
     */
    public List<TelevisionInformationServiceTypeCodeType> getTelevisionInformationServiceTypeCode() {
        if (televisionInformationServiceTypeCode == null) {
            televisionInformationServiceTypeCode = new ArrayList<TelevisionInformationServiceTypeCodeType>();
        }
        return this.televisionInformationServiceTypeCode;
    }

    /**
     * Gets the value of the televisionTextMemoryPageQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTelevisionTextMemoryPageQuantity() {
        return televisionTextMemoryPageQuantity;
    }

    /**
     * Sets the value of the televisionTextMemoryPageQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTelevisionTextMemoryPageQuantity(BigInteger value) {
        this.televisionTextMemoryPageQuantity = value;
    }

}
