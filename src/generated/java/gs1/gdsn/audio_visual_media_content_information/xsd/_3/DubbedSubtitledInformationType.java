
package gs1.gdsn.audio_visual_media_content_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.LanguageCodeType;


/**
 * <p>Java class for DubbedSubtitledInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DubbedSubtitledInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dubbedSubtitledCode" type="{urn:gs1:gdsn:audio_visual_media_content_information:xsd:3}DubbedSubtitledCodeType" minOccurs="0"/&gt;
 *         &lt;element name="dubbedLanguageCode" type="{urn:gs1:shared:shared_common:xsd:3}LanguageCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subtitledLanguageCode" type="{urn:gs1:shared:shared_common:xsd:3}LanguageCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DubbedSubtitledInformationType", propOrder = {
    "dubbedSubtitledCode",
    "dubbedLanguageCode",
    "subtitledLanguageCode"
})
public class DubbedSubtitledInformationType {

    protected DubbedSubtitledCodeType dubbedSubtitledCode;
    protected List<LanguageCodeType> dubbedLanguageCode;
    protected List<LanguageCodeType> subtitledLanguageCode;

    /**
     * Gets the value of the dubbedSubtitledCode property.
     * 
     * @return
     *     possible object is
     *     {@link DubbedSubtitledCodeType }
     *     
     */
    public DubbedSubtitledCodeType getDubbedSubtitledCode() {
        return dubbedSubtitledCode;
    }

    /**
     * Sets the value of the dubbedSubtitledCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DubbedSubtitledCodeType }
     *     
     */
    public void setDubbedSubtitledCode(DubbedSubtitledCodeType value) {
        this.dubbedSubtitledCode = value;
    }

    /**
     * Gets the value of the dubbedLanguageCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dubbedLanguageCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDubbedLanguageCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageCodeType }
     * 
     * 
     */
    public List<LanguageCodeType> getDubbedLanguageCode() {
        if (dubbedLanguageCode == null) {
            dubbedLanguageCode = new ArrayList<LanguageCodeType>();
        }
        return this.dubbedLanguageCode;
    }

    /**
     * Gets the value of the subtitledLanguageCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subtitledLanguageCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubtitledLanguageCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageCodeType }
     * 
     * 
     */
    public List<LanguageCodeType> getSubtitledLanguageCode() {
        if (subtitledLanguageCode == null) {
            subtitledLanguageCode = new ArrayList<LanguageCodeType>();
        }
        return this.subtitledLanguageCode;
    }

}
