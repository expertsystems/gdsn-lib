
package gs1.gdsn.video_display_device_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoDisplayDeviceInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoDisplayDeviceInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="videoDisplayDeviceInformation" type="{urn:gs1:gdsn:video_display_device_information:xsd:3}VideoDisplayDeviceInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoDisplayDeviceInformationModuleType", propOrder = {
    "videoDisplayDeviceInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:video_display_device_information:xsd:3")
public class VideoDisplayDeviceInformationModuleType {

    protected VideoDisplayDeviceInformationType videoDisplayDeviceInformation;

    /**
     * Gets the value of the videoDisplayDeviceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link VideoDisplayDeviceInformationType }
     *     
     */
    public VideoDisplayDeviceInformationType getVideoDisplayDeviceInformation() {
        return videoDisplayDeviceInformation;
    }

    /**
     * Sets the value of the videoDisplayDeviceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoDisplayDeviceInformationType }
     *     
     */
    public void setVideoDisplayDeviceInformation(VideoDisplayDeviceInformationType value) {
        this.videoDisplayDeviceInformation = value;
    }

}
