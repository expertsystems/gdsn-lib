
package gs1.gdsn.audio_visual_media_content_information.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;


/**
 * <p>Java class for DistributionMediaContentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistributionMediaContentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="discNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="audioVisualMediaLanguageInformation" type="{urn:gs1:gdsn:audio_visual_media_content_information:xsd:3}AudioVisualMediaLanguageInformationType" minOccurs="0"/&gt;
 *         &lt;element name="dubbedSubtitledInformation" type="{urn:gs1:gdsn:audio_visual_media_content_information:xsd:3}DubbedSubtitledInformationType" minOccurs="0"/&gt;
 *         &lt;element name="distributionMediaTrackInformation" type="{urn:gs1:gdsn:audio_visual_media_content_information:xsd:3}DistributionMediaTrackInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="audioVisualMediaContributor" type="{urn:gs1:gdsn:audio_visual_media_content_information:xsd:3}AudioVisualMediaContributorType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "DistributionMediaContentInformationType", propOrder = {
    "discNumber",
    "audioVisualMediaLanguageInformation",
    "dubbedSubtitledInformation",
    "distributionMediaTrackInformation",
    "audioVisualMediaContributor",
    "avpList"
})
public class DistributionMediaContentInformationType {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger discNumber;
    protected AudioVisualMediaLanguageInformationType audioVisualMediaLanguageInformation;
    protected DubbedSubtitledInformationType dubbedSubtitledInformation;
    protected List<DistributionMediaTrackInformationType> distributionMediaTrackInformation;
    protected List<AudioVisualMediaContributorType> audioVisualMediaContributor;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the discNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiscNumber() {
        return discNumber;
    }

    /**
     * Sets the value of the discNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiscNumber(BigInteger value) {
        this.discNumber = value;
    }

    /**
     * Gets the value of the audioVisualMediaLanguageInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AudioVisualMediaLanguageInformationType }
     *     
     */
    public AudioVisualMediaLanguageInformationType getAudioVisualMediaLanguageInformation() {
        return audioVisualMediaLanguageInformation;
    }

    /**
     * Sets the value of the audioVisualMediaLanguageInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioVisualMediaLanguageInformationType }
     *     
     */
    public void setAudioVisualMediaLanguageInformation(AudioVisualMediaLanguageInformationType value) {
        this.audioVisualMediaLanguageInformation = value;
    }

    /**
     * Gets the value of the dubbedSubtitledInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DubbedSubtitledInformationType }
     *     
     */
    public DubbedSubtitledInformationType getDubbedSubtitledInformation() {
        return dubbedSubtitledInformation;
    }

    /**
     * Sets the value of the dubbedSubtitledInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DubbedSubtitledInformationType }
     *     
     */
    public void setDubbedSubtitledInformation(DubbedSubtitledInformationType value) {
        this.dubbedSubtitledInformation = value;
    }

    /**
     * Gets the value of the distributionMediaTrackInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionMediaTrackInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionMediaTrackInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributionMediaTrackInformationType }
     * 
     * 
     */
    public List<DistributionMediaTrackInformationType> getDistributionMediaTrackInformation() {
        if (distributionMediaTrackInformation == null) {
            distributionMediaTrackInformation = new ArrayList<DistributionMediaTrackInformationType>();
        }
        return this.distributionMediaTrackInformation;
    }

    /**
     * Gets the value of the audioVisualMediaContributor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioVisualMediaContributor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioVisualMediaContributor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioVisualMediaContributorType }
     * 
     * 
     */
    public List<AudioVisualMediaContributorType> getAudioVisualMediaContributor() {
        if (audioVisualMediaContributor == null) {
            audioVisualMediaContributor = new ArrayList<AudioVisualMediaContributorType>();
        }
        return this.audioVisualMediaContributor;
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
