
package gs1.gdsn.video_display_device_information.xsd._3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;


/**
 * <p>Java class for VideoDisplayDeviceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoDisplayDeviceInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="availableBrightnessValues" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="combFilterTechnologyTypeCode" type="{urn:gs1:gdsn:video_display_device_information:xsd:3}CombFilterTechnologyTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="dynamicContrastRatio" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="multiPictureDisplayCapabilityTypeCode" type="{urn:gs1:gdsn:video_display_device_information:xsd:3}MultiPictureDisplayCapabilityTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="screenRefreshRate" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="staticContrastRatio" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="displayScreenInformation" type="{urn:gs1:gdsn:video_display_device_information:xsd:3}DisplayScreenInformationType" minOccurs="0"/&gt;
 *         &lt;element name="televisionInformationServiceInformation" type="{urn:gs1:gdsn:video_display_device_information:xsd:3}TelevisionInformationServiceInformationType" minOccurs="0"/&gt;
 *         &lt;element name="videoDisplayDeviceInstallationInformation" type="{urn:gs1:gdsn:video_display_device_information:xsd:3}VideoDisplayDeviceInstallationInformationType" minOccurs="0"/&gt;
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
@XmlType(name = "VideoDisplayDeviceInformationType", propOrder = {
    "availableBrightnessValues",
    "combFilterTechnologyTypeCode",
    "dynamicContrastRatio",
    "multiPictureDisplayCapabilityTypeCode",
    "screenRefreshRate",
    "staticContrastRatio",
    "displayScreenInformation",
    "televisionInformationServiceInformation",
    "videoDisplayDeviceInstallationInformation",
    "avpList"
})
public class VideoDisplayDeviceInformationType {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger availableBrightnessValues;
    protected CombFilterTechnologyTypeCodeType combFilterTechnologyTypeCode;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger dynamicContrastRatio;
    protected MultiPictureDisplayCapabilityTypeCodeType multiPictureDisplayCapabilityTypeCode;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger screenRefreshRate;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger staticContrastRatio;
    protected DisplayScreenInformationType displayScreenInformation;
    protected TelevisionInformationServiceInformationType televisionInformationServiceInformation;
    protected VideoDisplayDeviceInstallationInformationType videoDisplayDeviceInstallationInformation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the availableBrightnessValues property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvailableBrightnessValues() {
        return availableBrightnessValues;
    }

    /**
     * Sets the value of the availableBrightnessValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvailableBrightnessValues(BigInteger value) {
        this.availableBrightnessValues = value;
    }

    /**
     * Gets the value of the combFilterTechnologyTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CombFilterTechnologyTypeCodeType }
     *     
     */
    public CombFilterTechnologyTypeCodeType getCombFilterTechnologyTypeCode() {
        return combFilterTechnologyTypeCode;
    }

    /**
     * Sets the value of the combFilterTechnologyTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombFilterTechnologyTypeCodeType }
     *     
     */
    public void setCombFilterTechnologyTypeCode(CombFilterTechnologyTypeCodeType value) {
        this.combFilterTechnologyTypeCode = value;
    }

    /**
     * Gets the value of the dynamicContrastRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDynamicContrastRatio() {
        return dynamicContrastRatio;
    }

    /**
     * Sets the value of the dynamicContrastRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDynamicContrastRatio(BigInteger value) {
        this.dynamicContrastRatio = value;
    }

    /**
     * Gets the value of the multiPictureDisplayCapabilityTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link MultiPictureDisplayCapabilityTypeCodeType }
     *     
     */
    public MultiPictureDisplayCapabilityTypeCodeType getMultiPictureDisplayCapabilityTypeCode() {
        return multiPictureDisplayCapabilityTypeCode;
    }

    /**
     * Sets the value of the multiPictureDisplayCapabilityTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiPictureDisplayCapabilityTypeCodeType }
     *     
     */
    public void setMultiPictureDisplayCapabilityTypeCode(MultiPictureDisplayCapabilityTypeCodeType value) {
        this.multiPictureDisplayCapabilityTypeCode = value;
    }

    /**
     * Gets the value of the screenRefreshRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScreenRefreshRate() {
        return screenRefreshRate;
    }

    /**
     * Sets the value of the screenRefreshRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScreenRefreshRate(BigInteger value) {
        this.screenRefreshRate = value;
    }

    /**
     * Gets the value of the staticContrastRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStaticContrastRatio() {
        return staticContrastRatio;
    }

    /**
     * Sets the value of the staticContrastRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStaticContrastRatio(BigInteger value) {
        this.staticContrastRatio = value;
    }

    /**
     * Gets the value of the displayScreenInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayScreenInformationType }
     *     
     */
    public DisplayScreenInformationType getDisplayScreenInformation() {
        return displayScreenInformation;
    }

    /**
     * Sets the value of the displayScreenInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayScreenInformationType }
     *     
     */
    public void setDisplayScreenInformation(DisplayScreenInformationType value) {
        this.displayScreenInformation = value;
    }

    /**
     * Gets the value of the televisionInformationServiceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TelevisionInformationServiceInformationType }
     *     
     */
    public TelevisionInformationServiceInformationType getTelevisionInformationServiceInformation() {
        return televisionInformationServiceInformation;
    }

    /**
     * Sets the value of the televisionInformationServiceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelevisionInformationServiceInformationType }
     *     
     */
    public void setTelevisionInformationServiceInformation(TelevisionInformationServiceInformationType value) {
        this.televisionInformationServiceInformation = value;
    }

    /**
     * Gets the value of the videoDisplayDeviceInstallationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link VideoDisplayDeviceInstallationInformationType }
     *     
     */
    public VideoDisplayDeviceInstallationInformationType getVideoDisplayDeviceInstallationInformation() {
        return videoDisplayDeviceInstallationInformation;
    }

    /**
     * Sets the value of the videoDisplayDeviceInstallationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoDisplayDeviceInstallationInformationType }
     *     
     */
    public void setVideoDisplayDeviceInstallationInformation(VideoDisplayDeviceInstallationInformationType value) {
        this.videoDisplayDeviceInstallationInformation = value;
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
