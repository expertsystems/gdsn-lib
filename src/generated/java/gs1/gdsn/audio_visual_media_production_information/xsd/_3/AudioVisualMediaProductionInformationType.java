
package gs1.gdsn.audio_visual_media_production_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.AspectRatioInformationType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;


/**
 * <p>Java class for AudioVisualMediaProductionInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioVisualMediaProductionInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="audioSoundTypeCode" type="{urn:gs1:gdsn:audio_visual_media_production_information:xsd:3}AudioSoundTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="digitalisationLevelCode" type="{urn:gs1:gdsn:audio_visual_media_production_information:xsd:3}DigitalisationLevelTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="visualMediaColourCode" type="{urn:gs1:gdsn:audio_visual_media_production_information:xsd:3}VisualMediaColourCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="aspectRatioInformation" type="{urn:gs1:gdsn:gdsn_common:xsd:3}AspectRatioInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="avpList" type="{urn:gs1:gdsn:gdsn_common:xsd:3}GS1_AttributeValuePairListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioVisualMediaProductionInformationType", propOrder = {
    "audioSoundTypeCode",
    "digitalisationLevelCode",
    "visualMediaColourCode",
    "aspectRatioInformation",
    "avpList"
})
public class AudioVisualMediaProductionInformationType {

    protected List<AudioSoundTypeCodeType> audioSoundTypeCode;
    protected DigitalisationLevelTypeCodeType digitalisationLevelCode;
    protected List<VisualMediaColourCodeType> visualMediaColourCode;
    protected List<AspectRatioInformationType> aspectRatioInformation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the audioSoundTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioSoundTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioSoundTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioSoundTypeCodeType }
     * 
     * 
     */
    public List<AudioSoundTypeCodeType> getAudioSoundTypeCode() {
        if (audioSoundTypeCode == null) {
            audioSoundTypeCode = new ArrayList<AudioSoundTypeCodeType>();
        }
        return this.audioSoundTypeCode;
    }

    /**
     * Gets the value of the digitalisationLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalisationLevelTypeCodeType }
     *     
     */
    public DigitalisationLevelTypeCodeType getDigitalisationLevelCode() {
        return digitalisationLevelCode;
    }

    /**
     * Sets the value of the digitalisationLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalisationLevelTypeCodeType }
     *     
     */
    public void setDigitalisationLevelCode(DigitalisationLevelTypeCodeType value) {
        this.digitalisationLevelCode = value;
    }

    /**
     * Gets the value of the visualMediaColourCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visualMediaColourCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisualMediaColourCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisualMediaColourCodeType }
     * 
     * 
     */
    public List<VisualMediaColourCodeType> getVisualMediaColourCode() {
        if (visualMediaColourCode == null) {
            visualMediaColourCode = new ArrayList<VisualMediaColourCodeType>();
        }
        return this.visualMediaColourCode;
    }

    /**
     * Gets the value of the aspectRatioInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aspectRatioInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAspectRatioInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AspectRatioInformationType }
     * 
     * 
     */
    public List<AspectRatioInformationType> getAspectRatioInformation() {
        if (aspectRatioInformation == null) {
            aspectRatioInformation = new ArrayList<AspectRatioInformationType>();
        }
        return this.aspectRatioInformation;
    }

    /**
     * Gets the value of the avpList property.
     * 
     * @return
     *     possible object is
     *     {@link GS1AttributeValuePairListType }
     *     
     */
    public GS1AttributeValuePairListType getAvpList() {
        return avpList;
    }

    /**
     * Sets the value of the avpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GS1AttributeValuePairListType }
     *     
     */
    public void setAvpList(GS1AttributeValuePairListType value) {
        this.avpList = value;
    }

}
