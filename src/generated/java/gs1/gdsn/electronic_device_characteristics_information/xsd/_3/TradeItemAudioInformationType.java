
package gs1.gdsn.electronic_device_characteristics_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description500Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for TradeItemAudioInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemAudioInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detachableSpeakerTypeCode" type="{urn:gs1:gdsn:electronic_device_characteristics_information:xsd:3}DetachableSpeakerTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="fixedSpeakerLocationCode" type="{urn:gs1:gdsn:electronic_device_characteristics_information:xsd:3}FixedSpeakerLocationCodeType" minOccurs="0"/&gt;
 *         &lt;element name="surroundSoundDigitalDecoderTypeCode" type="{urn:gs1:gdsn:electronic_device_characteristics_information:xsd:3}SurroundSoundDigitalDecoderTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="totalAudioPowerOutput" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="microphoneTypeCode" type="{urn:gs1:gdsn:electronic_device_characteristics_information:xsd:3}MicrophoneTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="equalizerControlFeatures" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemAudioInformationType", propOrder = {
    "detachableSpeakerTypeCode",
    "fixedSpeakerLocationCode",
    "surroundSoundDigitalDecoderTypeCode",
    "totalAudioPowerOutput",
    "microphoneTypeCode",
    "equalizerControlFeatures"
})
public class TradeItemAudioInformationType {

    protected DetachableSpeakerTypeCodeType detachableSpeakerTypeCode;
    protected FixedSpeakerLocationCodeType fixedSpeakerLocationCode;
    protected List<SurroundSoundDigitalDecoderTypeCodeType> surroundSoundDigitalDecoderTypeCode;
    protected List<MeasurementType> totalAudioPowerOutput;
    protected MicrophoneTypeCodeType microphoneTypeCode;
    protected List<Description500Type> equalizerControlFeatures;

    /**
     * Gets the value of the detachableSpeakerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DetachableSpeakerTypeCodeType }
     *     
     */
    public DetachableSpeakerTypeCodeType getDetachableSpeakerTypeCode() {
        return detachableSpeakerTypeCode;
    }

    /**
     * Sets the value of the detachableSpeakerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetachableSpeakerTypeCodeType }
     *     
     */
    public void setDetachableSpeakerTypeCode(DetachableSpeakerTypeCodeType value) {
        this.detachableSpeakerTypeCode = value;
    }

    /**
     * Gets the value of the fixedSpeakerLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link FixedSpeakerLocationCodeType }
     *     
     */
    public FixedSpeakerLocationCodeType getFixedSpeakerLocationCode() {
        return fixedSpeakerLocationCode;
    }

    /**
     * Sets the value of the fixedSpeakerLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedSpeakerLocationCodeType }
     *     
     */
    public void setFixedSpeakerLocationCode(FixedSpeakerLocationCodeType value) {
        this.fixedSpeakerLocationCode = value;
    }

    /**
     * Gets the value of the surroundSoundDigitalDecoderTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surroundSoundDigitalDecoderTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurroundSoundDigitalDecoderTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurroundSoundDigitalDecoderTypeCodeType }
     * 
     * 
     */
    public List<SurroundSoundDigitalDecoderTypeCodeType> getSurroundSoundDigitalDecoderTypeCode() {
        if (surroundSoundDigitalDecoderTypeCode == null) {
            surroundSoundDigitalDecoderTypeCode = new ArrayList<SurroundSoundDigitalDecoderTypeCodeType>();
        }
        return this.surroundSoundDigitalDecoderTypeCode;
    }

    /**
     * Gets the value of the totalAudioPowerOutput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalAudioPowerOutput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalAudioPowerOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getTotalAudioPowerOutput() {
        if (totalAudioPowerOutput == null) {
            totalAudioPowerOutput = new ArrayList<MeasurementType>();
        }
        return this.totalAudioPowerOutput;
    }

    /**
     * Gets the value of the microphoneTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link MicrophoneTypeCodeType }
     *     
     */
    public MicrophoneTypeCodeType getMicrophoneTypeCode() {
        return microphoneTypeCode;
    }

    /**
     * Sets the value of the microphoneTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MicrophoneTypeCodeType }
     *     
     */
    public void setMicrophoneTypeCode(MicrophoneTypeCodeType value) {
        this.microphoneTypeCode = value;
    }

    /**
     * Gets the value of the equalizerControlFeatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equalizerControlFeatures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEqualizerControlFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getEqualizerControlFeatures() {
        if (equalizerControlFeatures == null) {
            equalizerControlFeatures = new ArrayList<Description500Type>();
        }
        return this.equalizerControlFeatures;
    }

}
