
package gs1.gdsn.audio_visual_media_content_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.LanguageCodeType;


/**
 * <p>Java class for AudioVisualMediaLanguageInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioVisualMediaLanguageInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="availableLanguageCode" type="{urn:gs1:shared:shared_common:xsd:3}LanguageCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="closedCaptioningCode" type="{urn:gs1:gdsn:audio_visual_media_content_information:xsd:3}ClosedCaptioningCodeType" minOccurs="0"/&gt;
 *         &lt;element name="originalLanguageCode" type="{urn:gs1:shared:shared_common:xsd:3}LanguageCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioVisualMediaLanguageInformationType", propOrder = {
    "availableLanguageCode",
    "closedCaptioningCode",
    "originalLanguageCode"
})
public class AudioVisualMediaLanguageInformationType {

    protected List<LanguageCodeType> availableLanguageCode;
    protected ClosedCaptioningCodeType closedCaptioningCode;
    protected LanguageCodeType originalLanguageCode;

    /**
     * Gets the value of the availableLanguageCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableLanguageCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableLanguageCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageCodeType }
     * 
     * 
     */
    public List<LanguageCodeType> getAvailableLanguageCode() {
        if (availableLanguageCode == null) {
            availableLanguageCode = new ArrayList<LanguageCodeType>();
        }
        return this.availableLanguageCode;
    }

    /**
     * Gets the value of the closedCaptioningCode property.
     * 
     * @return
     *     possible object is
     *     {@link ClosedCaptioningCodeType }
     *     
     */
    public ClosedCaptioningCodeType getClosedCaptioningCode() {
        return closedCaptioningCode;
    }

    /**
     * Sets the value of the closedCaptioningCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosedCaptioningCodeType }
     *     
     */
    public void setClosedCaptioningCode(ClosedCaptioningCodeType value) {
        this.closedCaptioningCode = value;
    }

    /**
     * Gets the value of the originalLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeType }
     *     
     */
    public LanguageCodeType getOriginalLanguageCode() {
        return originalLanguageCode;
    }

    /**
     * Sets the value of the originalLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeType }
     *     
     */
    public void setOriginalLanguageCode(LanguageCodeType value) {
        this.originalLanguageCode = value;
    }

}
