
package gs1.gdsn.electronic_device_characteristics_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudioVideoConnectorInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioVideoConnectorInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hDMITestingAgencyCode" type="{urn:gs1:gdsn:electronic_device_characteristics_information:xsd:3}HDMITestingAgencyCodeType" minOccurs="0"/&gt;
 *         &lt;element name="supportedHDMIFeatureCode" type="{urn:gs1:gdsn:electronic_device_characteristics_information:xsd:3}HDMIFeatureCodeType" minOccurs="0"/&gt;
 *         &lt;element name="audioVideoConnector" type="{urn:gs1:gdsn:electronic_device_characteristics_information:xsd:3}AudioVideoConnectorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioVideoConnectorInformationType", propOrder = {
    "hdmiTestingAgencyCode",
    "supportedHDMIFeatureCode",
    "audioVideoConnector"
})
public class AudioVideoConnectorInformationType {

    @XmlElement(name = "hDMITestingAgencyCode")
    protected HDMITestingAgencyCodeType hdmiTestingAgencyCode;
    protected HDMIFeatureCodeType supportedHDMIFeatureCode;
    protected List<AudioVideoConnectorType> audioVideoConnector;

    /**
     * Gets the value of the hdmiTestingAgencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link HDMITestingAgencyCodeType }
     *     
     */
    public HDMITestingAgencyCodeType getHDMITestingAgencyCode() {
        return hdmiTestingAgencyCode;
    }

    /**
     * Sets the value of the hdmiTestingAgencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HDMITestingAgencyCodeType }
     *     
     */
    public void setHDMITestingAgencyCode(HDMITestingAgencyCodeType value) {
        this.hdmiTestingAgencyCode = value;
    }

    /**
     * Gets the value of the supportedHDMIFeatureCode property.
     * 
     * @return
     *     possible object is
     *     {@link HDMIFeatureCodeType }
     *     
     */
    public HDMIFeatureCodeType getSupportedHDMIFeatureCode() {
        return supportedHDMIFeatureCode;
    }

    /**
     * Sets the value of the supportedHDMIFeatureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HDMIFeatureCodeType }
     *     
     */
    public void setSupportedHDMIFeatureCode(HDMIFeatureCodeType value) {
        this.supportedHDMIFeatureCode = value;
    }

    /**
     * Gets the value of the audioVideoConnector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioVideoConnector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioVideoConnector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioVideoConnectorType }
     * 
     * 
     */
    public List<AudioVideoConnectorType> getAudioVideoConnector() {
        if (audioVideoConnector == null) {
            audioVideoConnector = new ArrayList<AudioVideoConnectorType>();
        }
        return this.audioVideoConnector;
    }

}
