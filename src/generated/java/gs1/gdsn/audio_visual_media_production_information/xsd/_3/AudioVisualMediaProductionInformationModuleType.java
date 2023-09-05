
package gs1.gdsn.audio_visual_media_production_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudioVisualMediaProductionInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioVisualMediaProductionInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="audioVisualMediaProductionInformation" type="{urn:gs1:gdsn:audio_visual_media_production_information:xsd:3}AudioVisualMediaProductionInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioVisualMediaProductionInformationModuleType", propOrder = {
    "audioVisualMediaProductionInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:audio_visual_media_production_information:xsd:3")
public class AudioVisualMediaProductionInformationModuleType {

    protected AudioVisualMediaProductionInformationType audioVisualMediaProductionInformation;

    /**
     * Gets the value of the audioVisualMediaProductionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AudioVisualMediaProductionInformationType }
     *     
     */
    public AudioVisualMediaProductionInformationType getAudioVisualMediaProductionInformation() {
        return audioVisualMediaProductionInformation;
    }

    /**
     * Sets the value of the audioVisualMediaProductionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioVisualMediaProductionInformationType }
     *     
     */
    public void setAudioVisualMediaProductionInformation(AudioVisualMediaProductionInformationType value) {
        this.audioVisualMediaProductionInformation = value;
    }

}
