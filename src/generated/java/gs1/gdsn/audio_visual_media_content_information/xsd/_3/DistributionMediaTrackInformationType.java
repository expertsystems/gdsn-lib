
package gs1.gdsn.audio_visual_media_content_information.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description70Type;


/**
 * <p>Java class for DistributionMediaTrackInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistributionMediaTrackInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="trackNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="trackTime" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="trackTitle" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="audioVisualMediaContributor" type="{urn:gs1:gdsn:audio_visual_media_content_information:xsd:3}AudioVisualMediaContributorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionMediaTrackInformationType", propOrder = {
    "trackNumber",
    "trackTime",
    "trackTitle",
    "audioVisualMediaContributor"
})
public class DistributionMediaTrackInformationType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger trackNumber;
    protected String trackTime;
    protected List<Description70Type> trackTitle;
    protected List<AudioVisualMediaContributorType> audioVisualMediaContributor;

    /**
     * Gets the value of the trackNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrackNumber() {
        return trackNumber;
    }

    /**
     * Sets the value of the trackNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrackNumber(BigInteger value) {
        this.trackNumber = value;
    }

    /**
     * Gets the value of the trackTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackTime() {
        return trackTime;
    }

    /**
     * Sets the value of the trackTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackTime(String value) {
        this.trackTime = value;
    }

    /**
     * Gets the value of the trackTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getTrackTitle() {
        if (trackTitle == null) {
            trackTitle = new ArrayList<Description70Type>();
        }
        return this.trackTitle;
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

}
