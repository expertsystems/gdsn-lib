
package gs1.gdsn.gdsn_common.xsd._3;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import gs1.gdsn.referenced_file_detail_information.xsd._3.ReferencedFileHeaderType;
import gs1.shared.shared_common.xsd._3.CountryCodeType;
import gs1.shared.shared_common.xsd._3.Description200Type;
import gs1.shared.shared_common.xsd._3.Description500Type;
import gs1.shared.shared_common.xsd._3.Description70Type;
import gs1.shared.shared_common.xsd._3.LanguageCodeType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for ReferencedFileInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferencedFileInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referencedFileTypeCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}ReferencedFileTypeCodeType"/&gt;
 *         &lt;element name="contentDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fileCreationProgram" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fileEffectiveEndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fileEffectiveStartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fileFormatDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fileFormatName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fileLanguageCode" type="{urn:gs1:shared:shared_common:xsd:3}LanguageCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fileName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fileOptimalViewerName" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fileOriginCountryCode" type="{urn:gs1:shared:shared_common:xsd:3}CountryCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fileVersion" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="uniformResourceIdentifier" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2500"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isPrimaryFile" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="alternateText" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="titleText" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fileSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="imageFacingCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}ImageFacingCodeType" minOccurs="0"/&gt;
 *         &lt;element name="imageStateCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}ImageStateCodeType" minOccurs="0"/&gt;
 *         &lt;element name="isImageRendered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="imageOrientationTypeCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}ImageOrientationTypeCodeType" minOccurs="0"/&gt;
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
@XmlType(name = "ReferencedFileInformationType", propOrder = {
    "referencedFileTypeCode",
    "contentDescription",
    "fileCreationProgram",
    "fileEffectiveEndDateTime",
    "fileEffectiveStartDateTime",
    "fileFormatDescription",
    "fileFormatName",
    "fileLanguageCode",
    "fileName",
    "fileOptimalViewerName",
    "fileOriginCountryCode",
    "fileVersion",
    "uniformResourceIdentifier",
    "isPrimaryFile",
    "alternateText",
    "titleText",
    "fileSequenceNumber",
    "imageFacingCode",
    "imageStateCode",
    "isImageRendered",
    "imageOrientationTypeCode",
    "avpList"
})
@XmlSeeAlso({
    ReferencedFileHeaderType.class
})
public class ReferencedFileInformationType {

    @XmlElement(required = true)
    protected ReferencedFileTypeCodeType referencedFileTypeCode;
    protected List<Description200Type> contentDescription;
    protected List<String> fileCreationProgram;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime fileEffectiveEndDateTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime fileEffectiveStartDateTime;
    protected List<Description70Type> fileFormatDescription;
    protected String fileFormatName;
    protected List<LanguageCodeType> fileLanguageCode;
    protected String fileName;
    protected List<String> fileOptimalViewerName;
    protected List<CountryCodeType> fileOriginCountryCode;
    protected String fileVersion;
    protected String uniformResourceIdentifier;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isPrimaryFile;
    protected List<Description500Type> alternateText;
    protected List<Description500Type> titleText;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger fileSequenceNumber;
    protected ImageFacingCodeType imageFacingCode;
    protected ImageStateCodeType imageStateCode;
    protected Boolean isImageRendered;
    protected ImageOrientationTypeCodeType imageOrientationTypeCode;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the referencedFileTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencedFileTypeCodeType }
     *     
     */
    public ReferencedFileTypeCodeType getReferencedFileTypeCode() {
        return referencedFileTypeCode;
    }

    /**
     * Sets the value of the referencedFileTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencedFileTypeCodeType }
     *     
     */
    public void setReferencedFileTypeCode(ReferencedFileTypeCodeType value) {
        this.referencedFileTypeCode = value;
    }

    /**
     * Gets the value of the contentDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description200Type }
     * 
     * 
     */
    public List<Description200Type> getContentDescription() {
        if (contentDescription == null) {
            contentDescription = new ArrayList<Description200Type>();
        }
        return this.contentDescription;
    }

    /**
     * Gets the value of the fileCreationProgram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileCreationProgram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileCreationProgram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFileCreationProgram() {
        if (fileCreationProgram == null) {
            fileCreationProgram = new ArrayList<String>();
        }
        return this.fileCreationProgram;
    }

    /**
     * Gets the value of the fileEffectiveEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getFileEffectiveEndDateTime() {
        return fileEffectiveEndDateTime;
    }

    /**
     * Sets the value of the fileEffectiveEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileEffectiveEndDateTime(LocalDateTime value) {
        this.fileEffectiveEndDateTime = value;
    }

    /**
     * Gets the value of the fileEffectiveStartDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getFileEffectiveStartDateTime() {
        return fileEffectiveStartDateTime;
    }

    /**
     * Sets the value of the fileEffectiveStartDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileEffectiveStartDateTime(LocalDateTime value) {
        this.fileEffectiveStartDateTime = value;
    }

    /**
     * Gets the value of the fileFormatDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileFormatDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileFormatDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getFileFormatDescription() {
        if (fileFormatDescription == null) {
            fileFormatDescription = new ArrayList<Description70Type>();
        }
        return this.fileFormatDescription;
    }

    /**
     * Gets the value of the fileFormatName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileFormatName() {
        return fileFormatName;
    }

    /**
     * Sets the value of the fileFormatName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileFormatName(String value) {
        this.fileFormatName = value;
    }

    /**
     * Gets the value of the fileLanguageCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileLanguageCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileLanguageCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageCodeType }
     * 
     * 
     */
    public List<LanguageCodeType> getFileLanguageCode() {
        if (fileLanguageCode == null) {
            fileLanguageCode = new ArrayList<LanguageCodeType>();
        }
        return this.fileLanguageCode;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileOptimalViewerName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileOptimalViewerName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileOptimalViewerName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFileOptimalViewerName() {
        if (fileOptimalViewerName == null) {
            fileOptimalViewerName = new ArrayList<String>();
        }
        return this.fileOptimalViewerName;
    }

    /**
     * Gets the value of the fileOriginCountryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileOriginCountryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileOriginCountryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryCodeType }
     * 
     * 
     */
    public List<CountryCodeType> getFileOriginCountryCode() {
        if (fileOriginCountryCode == null) {
            fileOriginCountryCode = new ArrayList<CountryCodeType>();
        }
        return this.fileOriginCountryCode;
    }

    /**
     * Gets the value of the fileVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileVersion() {
        return fileVersion;
    }

    /**
     * Sets the value of the fileVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileVersion(String value) {
        this.fileVersion = value;
    }

    /**
     * Gets the value of the uniformResourceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniformResourceIdentifier() {
        return uniformResourceIdentifier;
    }

    /**
     * Sets the value of the uniformResourceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniformResourceIdentifier(String value) {
        this.uniformResourceIdentifier = value;
    }

    /**
     * Gets the value of the isPrimaryFile property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsPrimaryFile() {
        return isPrimaryFile;
    }

    /**
     * Sets the value of the isPrimaryFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsPrimaryFile(NonBinaryLogicEnumerationType value) {
        this.isPrimaryFile = value;
    }

    /**
     * Gets the value of the alternateText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getAlternateText() {
        if (alternateText == null) {
            alternateText = new ArrayList<Description500Type>();
        }
        return this.alternateText;
    }

    /**
     * Gets the value of the titleText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titleText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitleText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getTitleText() {
        if (titleText == null) {
            titleText = new ArrayList<Description500Type>();
        }
        return this.titleText;
    }

    /**
     * Gets the value of the fileSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFileSequenceNumber() {
        return fileSequenceNumber;
    }

    /**
     * Sets the value of the fileSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFileSequenceNumber(BigInteger value) {
        this.fileSequenceNumber = value;
    }

    /**
     * Gets the value of the imageFacingCode property.
     * 
     * @return
     *     possible object is
     *     {@link ImageFacingCodeType }
     *     
     */
    public ImageFacingCodeType getImageFacingCode() {
        return imageFacingCode;
    }

    /**
     * Sets the value of the imageFacingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageFacingCodeType }
     *     
     */
    public void setImageFacingCode(ImageFacingCodeType value) {
        this.imageFacingCode = value;
    }

    /**
     * Gets the value of the imageStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link ImageStateCodeType }
     *     
     */
    public ImageStateCodeType getImageStateCode() {
        return imageStateCode;
    }

    /**
     * Sets the value of the imageStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageStateCodeType }
     *     
     */
    public void setImageStateCode(ImageStateCodeType value) {
        this.imageStateCode = value;
    }

    /**
     * Gets the value of the isImageRendered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsImageRendered() {
        return isImageRendered;
    }

    /**
     * Sets the value of the isImageRendered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsImageRendered(Boolean value) {
        this.isImageRendered = value;
    }

    /**
     * Gets the value of the imageOrientationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ImageOrientationTypeCodeType }
     *     
     */
    public ImageOrientationTypeCodeType getImageOrientationTypeCode() {
        return imageOrientationTypeCode;
    }

    /**
     * Sets the value of the imageOrientationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageOrientationTypeCodeType }
     *     
     */
    public void setImageOrientationTypeCode(ImageOrientationTypeCodeType value) {
        this.imageOrientationTypeCode = value;
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
