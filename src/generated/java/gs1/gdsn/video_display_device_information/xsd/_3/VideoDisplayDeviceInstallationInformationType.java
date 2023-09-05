
package gs1.gdsn.video_display_device_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoDisplayDeviceInstallationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoDisplayDeviceInstallationInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="audioVisualItemInstallationOptionTypeCode" type="{urn:gs1:gdsn:video_display_device_information:xsd:3}AudioVisualItemInstallationTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="vESAWallMountTypeCode" type="{urn:gs1:gdsn:video_display_device_information:xsd:3}VESAWallMountTypeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoDisplayDeviceInstallationInformationType", propOrder = {
    "audioVisualItemInstallationOptionTypeCode",
    "vesaWallMountTypeCode"
})
public class VideoDisplayDeviceInstallationInformationType {

    protected AudioVisualItemInstallationTypeCodeType audioVisualItemInstallationOptionTypeCode;
    @XmlElement(name = "vESAWallMountTypeCode")
    protected VESAWallMountTypeCodeType vesaWallMountTypeCode;

    /**
     * Gets the value of the audioVisualItemInstallationOptionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link AudioVisualItemInstallationTypeCodeType }
     *     
     */
    public AudioVisualItemInstallationTypeCodeType getAudioVisualItemInstallationOptionTypeCode() {
        return audioVisualItemInstallationOptionTypeCode;
    }

    /**
     * Sets the value of the audioVisualItemInstallationOptionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioVisualItemInstallationTypeCodeType }
     *     
     */
    public void setAudioVisualItemInstallationOptionTypeCode(AudioVisualItemInstallationTypeCodeType value) {
        this.audioVisualItemInstallationOptionTypeCode = value;
    }

    /**
     * Gets the value of the vesaWallMountTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link VESAWallMountTypeCodeType }
     *     
     */
    public VESAWallMountTypeCodeType getVESAWallMountTypeCode() {
        return vesaWallMountTypeCode;
    }

    /**
     * Sets the value of the vesaWallMountTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VESAWallMountTypeCodeType }
     *     
     */
    public void setVESAWallMountTypeCode(VESAWallMountTypeCodeType value) {
        this.vesaWallMountTypeCode = value;
    }

}
