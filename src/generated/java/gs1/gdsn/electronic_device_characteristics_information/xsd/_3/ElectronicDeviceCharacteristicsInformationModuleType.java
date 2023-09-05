
package gs1.gdsn.electronic_device_characteristics_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for ElectronicDeviceCharacteristicsInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectronicDeviceCharacteristicsInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="remoteControlTypeCode" type="{urn:gs1:gdsn:electronic_device_characteristics_information:xsd:3}RemoteControlTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="includedOperatingSystem" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="selfTimerDelay" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="audioVideoConnectorInformation" type="{urn:gs1:gdsn:electronic_device_characteristics_information:xsd:3}AudioVideoConnectorInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="audioVisualSignalProcessingInformation" type="{urn:gs1:gdsn:electronic_device_characteristics_information:xsd:3}AudioVisualSignalProcessingInformationType" minOccurs="0"/&gt;
 *         &lt;element name="dataStorageDeviceInformation" type="{urn:gs1:gdsn:electronic_device_characteristics_information:xsd:3}DataStorageDeviceInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemAudioInformation" type="{urn:gs1:gdsn:electronic_device_characteristics_information:xsd:3}TradeItemAudioInformationType" minOccurs="0"/&gt;
 *         &lt;element name="imageDeviceResolutionInformation" type="{urn:gs1:gdsn:electronic_device_characteristics_information:xsd:3}ImageDeviceResolutionInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ElectronicDeviceCharacteristicsInformationModuleType", propOrder = {
    "remoteControlTypeCode",
    "includedOperatingSystem",
    "selfTimerDelay",
    "audioVideoConnectorInformation",
    "audioVisualSignalProcessingInformation",
    "dataStorageDeviceInformation",
    "tradeItemAudioInformation",
    "imageDeviceResolutionInformation",
    "avpList"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:electronic_device_characteristics_information:xsd:3")
public class ElectronicDeviceCharacteristicsInformationModuleType {

    protected RemoteControlTypeCodeType remoteControlTypeCode;
    protected String includedOperatingSystem;
    protected List<MeasurementType> selfTimerDelay;
    protected List<AudioVideoConnectorInformationType> audioVideoConnectorInformation;
    protected AudioVisualSignalProcessingInformationType audioVisualSignalProcessingInformation;
    protected List<DataStorageDeviceInformationType> dataStorageDeviceInformation;
    protected TradeItemAudioInformationType tradeItemAudioInformation;
    protected List<ImageDeviceResolutionInformationType> imageDeviceResolutionInformation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the remoteControlTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link RemoteControlTypeCodeType }
     *     
     */
    public RemoteControlTypeCodeType getRemoteControlTypeCode() {
        return remoteControlTypeCode;
    }

    /**
     * Sets the value of the remoteControlTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoteControlTypeCodeType }
     *     
     */
    public void setRemoteControlTypeCode(RemoteControlTypeCodeType value) {
        this.remoteControlTypeCode = value;
    }

    /**
     * Gets the value of the includedOperatingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludedOperatingSystem() {
        return includedOperatingSystem;
    }

    /**
     * Sets the value of the includedOperatingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludedOperatingSystem(String value) {
        this.includedOperatingSystem = value;
    }

    /**
     * Gets the value of the selfTimerDelay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selfTimerDelay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelfTimerDelay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getSelfTimerDelay() {
        if (selfTimerDelay == null) {
            selfTimerDelay = new ArrayList<MeasurementType>();
        }
        return this.selfTimerDelay;
    }

    /**
     * Gets the value of the audioVideoConnectorInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioVideoConnectorInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioVideoConnectorInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioVideoConnectorInformationType }
     * 
     * 
     */
    public List<AudioVideoConnectorInformationType> getAudioVideoConnectorInformation() {
        if (audioVideoConnectorInformation == null) {
            audioVideoConnectorInformation = new ArrayList<AudioVideoConnectorInformationType>();
        }
        return this.audioVideoConnectorInformation;
    }

    /**
     * Gets the value of the audioVisualSignalProcessingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AudioVisualSignalProcessingInformationType }
     *     
     */
    public AudioVisualSignalProcessingInformationType getAudioVisualSignalProcessingInformation() {
        return audioVisualSignalProcessingInformation;
    }

    /**
     * Sets the value of the audioVisualSignalProcessingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioVisualSignalProcessingInformationType }
     *     
     */
    public void setAudioVisualSignalProcessingInformation(AudioVisualSignalProcessingInformationType value) {
        this.audioVisualSignalProcessingInformation = value;
    }

    /**
     * Gets the value of the dataStorageDeviceInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataStorageDeviceInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataStorageDeviceInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataStorageDeviceInformationType }
     * 
     * 
     */
    public List<DataStorageDeviceInformationType> getDataStorageDeviceInformation() {
        if (dataStorageDeviceInformation == null) {
            dataStorageDeviceInformation = new ArrayList<DataStorageDeviceInformationType>();
        }
        return this.dataStorageDeviceInformation;
    }

    /**
     * Gets the value of the tradeItemAudioInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemAudioInformationType }
     *     
     */
    public TradeItemAudioInformationType getTradeItemAudioInformation() {
        return tradeItemAudioInformation;
    }

    /**
     * Sets the value of the tradeItemAudioInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemAudioInformationType }
     *     
     */
    public void setTradeItemAudioInformation(TradeItemAudioInformationType value) {
        this.tradeItemAudioInformation = value;
    }

    /**
     * Gets the value of the imageDeviceResolutionInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageDeviceResolutionInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageDeviceResolutionInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageDeviceResolutionInformationType }
     * 
     * 
     */
    public List<ImageDeviceResolutionInformationType> getImageDeviceResolutionInformation() {
        if (imageDeviceResolutionInformation == null) {
            imageDeviceResolutionInformation = new ArrayList<ImageDeviceResolutionInformationType>();
        }
        return this.imageDeviceResolutionInformation;
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
