
package gs1.gdsn.audio_visual_media_product_description_information.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.CodeType;
import gs1.shared.shared_common.xsd._3.Description2500Type;
import gs1.shared.shared_common.xsd._3.Description5000Type;
import gs1.shared.shared_common.xsd._3.Description70Type;


/**
 * <p>Java class for AudioVisualMediaProductDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioVisualMediaProductDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="audioVisualMediaProductCollectionName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="audioVisualMediaProductLabelName" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="audioVisualMediaProductLine" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="audioVisualMediaProductTitle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="editionDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="genreTypeCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="longSynopsis" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="musicPerformanceType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="payPerViewWindow" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="shortSynopsis" type="{urn:gs1:shared:shared_common:xsd:3}Description2500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="specialFeatures" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="studioName" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="yearOfProduction" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *         &lt;element name="audioVisualMediaProductCollectionSeriesNumber" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="audioVisualMediaDateInformation" type="{urn:gs1:gdsn:audio_visual_media_product_description_information:xsd:3}AudioVisualMediaDateInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AudioVisualMediaProductDescriptionType", propOrder = {
    "audioVisualMediaProductCollectionName",
    "audioVisualMediaProductLabelName",
    "audioVisualMediaProductLine",
    "audioVisualMediaProductTitle",
    "editionDescription",
    "genreTypeCodeReference",
    "longSynopsis",
    "musicPerformanceType",
    "payPerViewWindow",
    "shortSynopsis",
    "specialFeatures",
    "studioName",
    "yearOfProduction",
    "audioVisualMediaProductCollectionSeriesNumber",
    "audioVisualMediaDateInformation",
    "avpList"
})
public class AudioVisualMediaProductDescriptionType {

    protected String audioVisualMediaProductCollectionName;
    protected List<String> audioVisualMediaProductLabelName;
    protected List<Description70Type> audioVisualMediaProductLine;
    protected String audioVisualMediaProductTitle;
    protected List<Description70Type> editionDescription;
    protected List<CodeType> genreTypeCodeReference;
    protected List<Description5000Type> longSynopsis;
    protected String musicPerformanceType;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger payPerViewWindow;
    protected List<Description2500Type> shortSynopsis;
    protected List<Description70Type> specialFeatures;
    protected List<String> studioName;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar yearOfProduction;
    protected List<String> audioVisualMediaProductCollectionSeriesNumber;
    protected List<AudioVisualMediaDateInformationType> audioVisualMediaDateInformation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the audioVisualMediaProductCollectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioVisualMediaProductCollectionName() {
        return audioVisualMediaProductCollectionName;
    }

    /**
     * Sets the value of the audioVisualMediaProductCollectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioVisualMediaProductCollectionName(String value) {
        this.audioVisualMediaProductCollectionName = value;
    }

    /**
     * Gets the value of the audioVisualMediaProductLabelName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioVisualMediaProductLabelName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioVisualMediaProductLabelName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAudioVisualMediaProductLabelName() {
        if (audioVisualMediaProductLabelName == null) {
            audioVisualMediaProductLabelName = new ArrayList<String>();
        }
        return this.audioVisualMediaProductLabelName;
    }

    /**
     * Gets the value of the audioVisualMediaProductLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioVisualMediaProductLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioVisualMediaProductLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getAudioVisualMediaProductLine() {
        if (audioVisualMediaProductLine == null) {
            audioVisualMediaProductLine = new ArrayList<Description70Type>();
        }
        return this.audioVisualMediaProductLine;
    }

    /**
     * Gets the value of the audioVisualMediaProductTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioVisualMediaProductTitle() {
        return audioVisualMediaProductTitle;
    }

    /**
     * Sets the value of the audioVisualMediaProductTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioVisualMediaProductTitle(String value) {
        this.audioVisualMediaProductTitle = value;
    }

    /**
     * Gets the value of the editionDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the editionDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEditionDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getEditionDescription() {
        if (editionDescription == null) {
            editionDescription = new ArrayList<Description70Type>();
        }
        return this.editionDescription;
    }

    /**
     * Gets the value of the genreTypeCodeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genreTypeCodeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenreTypeCodeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getGenreTypeCodeReference() {
        if (genreTypeCodeReference == null) {
            genreTypeCodeReference = new ArrayList<CodeType>();
        }
        return this.genreTypeCodeReference;
    }

    /**
     * Gets the value of the longSynopsis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the longSynopsis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLongSynopsis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getLongSynopsis() {
        if (longSynopsis == null) {
            longSynopsis = new ArrayList<Description5000Type>();
        }
        return this.longSynopsis;
    }

    /**
     * Gets the value of the musicPerformanceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMusicPerformanceType() {
        return musicPerformanceType;
    }

    /**
     * Sets the value of the musicPerformanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMusicPerformanceType(String value) {
        this.musicPerformanceType = value;
    }

    /**
     * Gets the value of the payPerViewWindow property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPayPerViewWindow() {
        return payPerViewWindow;
    }

    /**
     * Sets the value of the payPerViewWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPayPerViewWindow(BigInteger value) {
        this.payPerViewWindow = value;
    }

    /**
     * Gets the value of the shortSynopsis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shortSynopsis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShortSynopsis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description2500Type }
     * 
     * 
     */
    public List<Description2500Type> getShortSynopsis() {
        if (shortSynopsis == null) {
            shortSynopsis = new ArrayList<Description2500Type>();
        }
        return this.shortSynopsis;
    }

    /**
     * Gets the value of the specialFeatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialFeatures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getSpecialFeatures() {
        if (specialFeatures == null) {
            specialFeatures = new ArrayList<Description70Type>();
        }
        return this.specialFeatures;
    }

    /**
     * Gets the value of the studioName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studioName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudioName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStudioName() {
        if (studioName == null) {
            studioName = new ArrayList<String>();
        }
        return this.studioName;
    }

    /**
     * Gets the value of the yearOfProduction property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYearOfProduction() {
        return yearOfProduction;
    }

    /**
     * Sets the value of the yearOfProduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYearOfProduction(XMLGregorianCalendar value) {
        this.yearOfProduction = value;
    }

    /**
     * Gets the value of the audioVisualMediaProductCollectionSeriesNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioVisualMediaProductCollectionSeriesNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioVisualMediaProductCollectionSeriesNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAudioVisualMediaProductCollectionSeriesNumber() {
        if (audioVisualMediaProductCollectionSeriesNumber == null) {
            audioVisualMediaProductCollectionSeriesNumber = new ArrayList<String>();
        }
        return this.audioVisualMediaProductCollectionSeriesNumber;
    }

    /**
     * Gets the value of the audioVisualMediaDateInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioVisualMediaDateInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioVisualMediaDateInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioVisualMediaDateInformationType }
     * 
     * 
     */
    public List<AudioVisualMediaDateInformationType> getAudioVisualMediaDateInformation() {
        if (audioVisualMediaDateInformation == null) {
            audioVisualMediaDateInformation = new ArrayList<AudioVisualMediaDateInformationType>();
        }
        return this.audioVisualMediaDateInformation;
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
