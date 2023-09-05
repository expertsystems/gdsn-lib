
package gs1.gdsn.audio_visual_media_product_description_information.xsd._3;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for AudioVisualMediaDateInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioVisualMediaDateInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="audioVisualMediaDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="audioVisualMediaDateTypeCode" type="{urn:gs1:gdsn:audio_visual_media_product_description_information:xsd:3}AudioVisualMediaDateTypeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioVisualMediaDateInformationType", propOrder = {
    "audioVisualMediaDateTime",
    "audioVisualMediaDateTypeCode"
})
public class AudioVisualMediaDateInformationType {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime audioVisualMediaDateTime;
    protected AudioVisualMediaDateTypeCodeType audioVisualMediaDateTypeCode;

    /**
     * Gets the value of the audioVisualMediaDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getAudioVisualMediaDateTime() {
        return audioVisualMediaDateTime;
    }

    /**
     * Sets the value of the audioVisualMediaDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioVisualMediaDateTime(LocalDateTime value) {
        this.audioVisualMediaDateTime = value;
    }

    /**
     * Gets the value of the audioVisualMediaDateTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link AudioVisualMediaDateTypeCodeType }
     *     
     */
    public AudioVisualMediaDateTypeCodeType getAudioVisualMediaDateTypeCode() {
        return audioVisualMediaDateTypeCode;
    }

    /**
     * Sets the value of the audioVisualMediaDateTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioVisualMediaDateTypeCodeType }
     *     
     */
    public void setAudioVisualMediaDateTypeCode(AudioVisualMediaDateTypeCodeType value) {
        this.audioVisualMediaDateTypeCode = value;
    }

}
