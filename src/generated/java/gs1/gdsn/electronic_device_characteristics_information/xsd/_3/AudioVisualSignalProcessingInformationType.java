
package gs1.gdsn.electronic_device_characteristics_information.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudioVisualSignalProcessingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioVisualSignalProcessingInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="availableChannelStationQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="electronicProgrammingGuideDaysAvailable" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="signalProcessingTypeCode" type="{urn:gs1:gdsn:electronic_device_characteristics_information:xsd:3}SignalProcessingTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="tunerTypeCode" type="{urn:gs1:gdsn:electronic_device_characteristics_information:xsd:3}TunerTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioVisualSignalProcessingInformationType", propOrder = {
    "availableChannelStationQuantity",
    "electronicProgrammingGuideDaysAvailable",
    "signalProcessingTypeCode",
    "tunerTypeCode"
})
public class AudioVisualSignalProcessingInformationType {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger availableChannelStationQuantity;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger electronicProgrammingGuideDaysAvailable;
    protected SignalProcessingTypeCodeType signalProcessingTypeCode;
    protected List<TunerTypeCodeType> tunerTypeCode;

    /**
     * Gets the value of the availableChannelStationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvailableChannelStationQuantity() {
        return availableChannelStationQuantity;
    }

    /**
     * Sets the value of the availableChannelStationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvailableChannelStationQuantity(BigInteger value) {
        this.availableChannelStationQuantity = value;
    }

    /**
     * Gets the value of the electronicProgrammingGuideDaysAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getElectronicProgrammingGuideDaysAvailable() {
        return electronicProgrammingGuideDaysAvailable;
    }

    /**
     * Sets the value of the electronicProgrammingGuideDaysAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setElectronicProgrammingGuideDaysAvailable(BigInteger value) {
        this.electronicProgrammingGuideDaysAvailable = value;
    }

    /**
     * Gets the value of the signalProcessingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link SignalProcessingTypeCodeType }
     *     
     */
    public SignalProcessingTypeCodeType getSignalProcessingTypeCode() {
        return signalProcessingTypeCode;
    }

    /**
     * Sets the value of the signalProcessingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalProcessingTypeCodeType }
     *     
     */
    public void setSignalProcessingTypeCode(SignalProcessingTypeCodeType value) {
        this.signalProcessingTypeCode = value;
    }

    /**
     * Gets the value of the tunerTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tunerTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTunerTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TunerTypeCodeType }
     * 
     * 
     */
    public List<TunerTypeCodeType> getTunerTypeCode() {
        if (tunerTypeCode == null) {
            tunerTypeCode = new ArrayList<TunerTypeCodeType>();
        }
        return this.tunerTypeCode;
    }

}
