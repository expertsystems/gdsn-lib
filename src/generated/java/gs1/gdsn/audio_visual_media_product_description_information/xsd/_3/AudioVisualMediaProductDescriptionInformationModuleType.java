
package gs1.gdsn.audio_visual_media_product_description_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudioVisualMediaProductDescriptionInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioVisualMediaProductDescriptionInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="audioVisualMediaProductDescription" type="{urn:gs1:gdsn:audio_visual_media_product_description_information:xsd:3}AudioVisualMediaProductDescriptionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioVisualMediaProductDescriptionInformationModuleType", propOrder = {
    "audioVisualMediaProductDescription"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:audio_visual_media_product_description_information:xsd:3")
public class AudioVisualMediaProductDescriptionInformationModuleType {

    protected AudioVisualMediaProductDescriptionType audioVisualMediaProductDescription;

    /**
     * Gets the value of the audioVisualMediaProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link AudioVisualMediaProductDescriptionType }
     *     
     */
    public AudioVisualMediaProductDescriptionType getAudioVisualMediaProductDescription() {
        return audioVisualMediaProductDescription;
    }

    /**
     * Sets the value of the audioVisualMediaProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioVisualMediaProductDescriptionType }
     *     
     */
    public void setAudioVisualMediaProductDescription(AudioVisualMediaProductDescriptionType value) {
        this.audioVisualMediaProductDescription = value;
    }

}
