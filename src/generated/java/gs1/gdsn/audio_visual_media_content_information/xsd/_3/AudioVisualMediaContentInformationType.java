
package gs1.gdsn.audio_visual_media_content_information.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.Description500Type;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for AudioVisualMediaContentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioVisualMediaContentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="distributionMediaCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="distributionMediaTypeCode" type="{urn:gs1:gdsn:audio_visual_media_content_information:xsd:3}DistributionMediaTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dvdRegionCode" type="{urn:gs1:gdsn:audio_visual_media_content_information:xsd:3}DVDRegionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="gameFormatCode" type="{urn:gs1:gdsn:audio_visual_media_content_information:xsd:3}GameFormatCodeType" minOccurs="0"/&gt;
 *         &lt;element name="isDigitalDownloadAvailable" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="runTimeMinutes" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="softwareCategoryTypeDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="numberOfEpisodes" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="distributionMediaContentInformation" type="{urn:gs1:gdsn:audio_visual_media_content_information:xsd:3}DistributionMediaContentInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AudioVisualMediaContentInformationType", propOrder = {
    "distributionMediaCount",
    "distributionMediaTypeCode",
    "dvdRegionCode",
    "gameFormatCode",
    "isDigitalDownloadAvailable",
    "runTimeMinutes",
    "softwareCategoryTypeDescription",
    "numberOfEpisodes",
    "distributionMediaContentInformation",
    "avpList"
})
public class AudioVisualMediaContentInformationType {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger distributionMediaCount;
    protected List<DistributionMediaTypeCodeType> distributionMediaTypeCode;
    protected DVDRegionCodeType dvdRegionCode;
    protected GameFormatCodeType gameFormatCode;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isDigitalDownloadAvailable;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger runTimeMinutes;
    protected List<Description500Type> softwareCategoryTypeDescription;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfEpisodes;
    protected List<DistributionMediaContentInformationType> distributionMediaContentInformation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the distributionMediaCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistributionMediaCount() {
        return distributionMediaCount;
    }

    /**
     * Sets the value of the distributionMediaCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistributionMediaCount(BigInteger value) {
        this.distributionMediaCount = value;
    }

    /**
     * Gets the value of the distributionMediaTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionMediaTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionMediaTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributionMediaTypeCodeType }
     * 
     * 
     */
    public List<DistributionMediaTypeCodeType> getDistributionMediaTypeCode() {
        if (distributionMediaTypeCode == null) {
            distributionMediaTypeCode = new ArrayList<DistributionMediaTypeCodeType>();
        }
        return this.distributionMediaTypeCode;
    }

    /**
     * Gets the value of the dvdRegionCode property.
     * 
     * @return
     *     possible object is
     *     {@link DVDRegionCodeType }
     *     
     */
    public DVDRegionCodeType getDvdRegionCode() {
        return dvdRegionCode;
    }

    /**
     * Sets the value of the dvdRegionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVDRegionCodeType }
     *     
     */
    public void setDvdRegionCode(DVDRegionCodeType value) {
        this.dvdRegionCode = value;
    }

    /**
     * Gets the value of the gameFormatCode property.
     * 
     * @return
     *     possible object is
     *     {@link GameFormatCodeType }
     *     
     */
    public GameFormatCodeType getGameFormatCode() {
        return gameFormatCode;
    }

    /**
     * Sets the value of the gameFormatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GameFormatCodeType }
     *     
     */
    public void setGameFormatCode(GameFormatCodeType value) {
        this.gameFormatCode = value;
    }

    /**
     * Gets the value of the isDigitalDownloadAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsDigitalDownloadAvailable() {
        return isDigitalDownloadAvailable;
    }

    /**
     * Sets the value of the isDigitalDownloadAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsDigitalDownloadAvailable(NonBinaryLogicEnumerationType value) {
        this.isDigitalDownloadAvailable = value;
    }

    /**
     * Gets the value of the runTimeMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRunTimeMinutes() {
        return runTimeMinutes;
    }

    /**
     * Sets the value of the runTimeMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRunTimeMinutes(BigInteger value) {
        this.runTimeMinutes = value;
    }

    /**
     * Gets the value of the softwareCategoryTypeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softwareCategoryTypeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftwareCategoryTypeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getSoftwareCategoryTypeDescription() {
        if (softwareCategoryTypeDescription == null) {
            softwareCategoryTypeDescription = new ArrayList<Description500Type>();
        }
        return this.softwareCategoryTypeDescription;
    }

    /**
     * Gets the value of the numberOfEpisodes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    /**
     * Sets the value of the numberOfEpisodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfEpisodes(BigInteger value) {
        this.numberOfEpisodes = value;
    }

    /**
     * Gets the value of the distributionMediaContentInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionMediaContentInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionMediaContentInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributionMediaContentInformationType }
     * 
     * 
     */
    public List<DistributionMediaContentInformationType> getDistributionMediaContentInformation() {
        if (distributionMediaContentInformation == null) {
            distributionMediaContentInformation = new ArrayList<DistributionMediaContentInformationType>();
        }
        return this.distributionMediaContentInformation;
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
