
package gs1.gdsn.audio_visual_media_content_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudioVisualMediaContributorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioVisualMediaContributorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="audioVisualMediaItemContributorTypeCode" type="{urn:gs1:gdsn:audio_visual_media_content_information:xsd:3}AudioVisualMediaContributorTypeCodeType"/&gt;
 *         &lt;element name="audioVisualMediaItemContributorName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioVisualMediaContributorType", propOrder = {
    "audioVisualMediaItemContributorTypeCode",
    "audioVisualMediaItemContributorName"
})
public class AudioVisualMediaContributorType {

    @XmlElement(required = true)
    protected AudioVisualMediaContributorTypeCodeType audioVisualMediaItemContributorTypeCode;
    protected String audioVisualMediaItemContributorName;

    /**
     * Gets the value of the audioVisualMediaItemContributorTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link AudioVisualMediaContributorTypeCodeType }
     *     
     */
    public AudioVisualMediaContributorTypeCodeType getAudioVisualMediaItemContributorTypeCode() {
        return audioVisualMediaItemContributorTypeCode;
    }

    /**
     * Sets the value of the audioVisualMediaItemContributorTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioVisualMediaContributorTypeCodeType }
     *     
     */
    public void setAudioVisualMediaItemContributorTypeCode(AudioVisualMediaContributorTypeCodeType value) {
        this.audioVisualMediaItemContributorTypeCode = value;
    }

    /**
     * Gets the value of the audioVisualMediaItemContributorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioVisualMediaItemContributorName() {
        return audioVisualMediaItemContributorName;
    }

    /**
     * Sets the value of the audioVisualMediaItemContributorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioVisualMediaItemContributorName(String value) {
        this.audioVisualMediaItemContributorName = value;
    }

}
