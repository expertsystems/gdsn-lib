
package gs1.gdsn.audio_visual_media_content_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudioVisualMediaContentInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioVisualMediaContentInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="audioVisualMediaContentInformation" type="{urn:gs1:gdsn:audio_visual_media_content_information:xsd:3}AudioVisualMediaContentInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioVisualMediaContentInformationModuleType", propOrder = {
    "audioVisualMediaContentInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:audio_visual_media_content_information:xsd:3")
public class AudioVisualMediaContentInformationModuleType {

    protected List<AudioVisualMediaContentInformationType> audioVisualMediaContentInformation;

    /**
     * Gets the value of the audioVisualMediaContentInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioVisualMediaContentInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioVisualMediaContentInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioVisualMediaContentInformationType }
     * 
     * 
     */
    public List<AudioVisualMediaContentInformationType> getAudioVisualMediaContentInformation() {
        if (audioVisualMediaContentInformation == null) {
            audioVisualMediaContentInformation = new ArrayList<AudioVisualMediaContentInformationType>();
        }
        return this.audioVisualMediaContentInformation;
    }

}
