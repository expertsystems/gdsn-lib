
package gs1.gdsn.referenced_file_detail_information.xsd._3;

import java.math.BigInteger;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import gs1.shared.shared_common.xsd._3.Description70Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;
import se.exder.external.gs1.gdsn3p1.Adapter2;


/**
 * <p>Java class for ReferencedFileDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferencedFileDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="canFileStream" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="fileAspectRatio" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fileBackgroundColourDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fileColourCalibration" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fileColourSchemeCode" type="{urn:gs1:gdsn:referenced_file_detail_information:xsd:3}FileColourSchemeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="fileCompressionType" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fileContrast" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="filePixelHeight" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="filePixelWidth" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="filePlaybackRate" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="filePrintHeight" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="filePrintWidth" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fileResolutionDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fileRunTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="fileSize" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isFileBackgroundTransparent" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="fileContentInformation" type="{urn:gs1:gdsn:referenced_file_detail_information:xsd:3}FileContentInformationType" minOccurs="0"/&gt;
 *         &lt;element name="fileUsageInformation" type="{urn:gs1:gdsn:referenced_file_detail_information:xsd:3}FileUsageInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencedFileDetailType", propOrder = {
    "canFileStream",
    "fileAspectRatio",
    "fileBackgroundColourDescription",
    "fileColourCalibration",
    "fileColourSchemeCode",
    "fileCompressionType",
    "fileContrast",
    "filePixelHeight",
    "filePixelWidth",
    "filePlaybackRate",
    "filePrintHeight",
    "filePrintWidth",
    "fileResolutionDescription",
    "fileRunTime",
    "fileSize",
    "isFileBackgroundTransparent",
    "fileContentInformation",
    "fileUsageInformation"
})
public class ReferencedFileDetailType {

    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType canFileStream;
    protected String fileAspectRatio;
    protected List<Description70Type> fileBackgroundColourDescription;
    protected List<Description70Type> fileColourCalibration;
    protected FileColourSchemeCodeType fileColourSchemeCode;
    protected List<Description70Type> fileCompressionType;
    protected List<String> fileContrast;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger filePixelHeight;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger filePixelWidth;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger filePlaybackRate;
    protected List<MeasurementType> filePrintHeight;
    protected List<MeasurementType> filePrintWidth;
    protected List<Description70Type> fileResolutionDescription;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "time")
    protected LocalTime fileRunTime;
    protected List<MeasurementType> fileSize;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isFileBackgroundTransparent;
    protected FileContentInformationType fileContentInformation;
    protected FileUsageInformationType fileUsageInformation;

    /**
     * Gets the value of the canFileStream property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getCanFileStream() {
        return canFileStream;
    }

    /**
     * Sets the value of the canFileStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setCanFileStream(NonBinaryLogicEnumerationType value) {
        this.canFileStream = value;
    }

    /**
     * Gets the value of the fileAspectRatio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileAspectRatio() {
        return fileAspectRatio;
    }

    /**
     * Sets the value of the fileAspectRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileAspectRatio(String value) {
        this.fileAspectRatio = value;
    }

    /**
     * Gets the value of the fileBackgroundColourDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileBackgroundColourDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileBackgroundColourDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getFileBackgroundColourDescription() {
        if (fileBackgroundColourDescription == null) {
            fileBackgroundColourDescription = new ArrayList<Description70Type>();
        }
        return this.fileBackgroundColourDescription;
    }

    /**
     * Gets the value of the fileColourCalibration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileColourCalibration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileColourCalibration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getFileColourCalibration() {
        if (fileColourCalibration == null) {
            fileColourCalibration = new ArrayList<Description70Type>();
        }
        return this.fileColourCalibration;
    }

    /**
     * Gets the value of the fileColourSchemeCode property.
     * 
     * @return
     *     possible object is
     *     {@link FileColourSchemeCodeType }
     *     
     */
    public FileColourSchemeCodeType getFileColourSchemeCode() {
        return fileColourSchemeCode;
    }

    /**
     * Sets the value of the fileColourSchemeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileColourSchemeCodeType }
     *     
     */
    public void setFileColourSchemeCode(FileColourSchemeCodeType value) {
        this.fileColourSchemeCode = value;
    }

    /**
     * Gets the value of the fileCompressionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileCompressionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileCompressionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getFileCompressionType() {
        if (fileCompressionType == null) {
            fileCompressionType = new ArrayList<Description70Type>();
        }
        return this.fileCompressionType;
    }

    /**
     * Gets the value of the fileContrast property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileContrast property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileContrast().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFileContrast() {
        if (fileContrast == null) {
            fileContrast = new ArrayList<String>();
        }
        return this.fileContrast;
    }

    /**
     * Gets the value of the filePixelHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFilePixelHeight() {
        return filePixelHeight;
    }

    /**
     * Sets the value of the filePixelHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFilePixelHeight(BigInteger value) {
        this.filePixelHeight = value;
    }

    /**
     * Gets the value of the filePixelWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFilePixelWidth() {
        return filePixelWidth;
    }

    /**
     * Sets the value of the filePixelWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFilePixelWidth(BigInteger value) {
        this.filePixelWidth = value;
    }

    /**
     * Gets the value of the filePlaybackRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFilePlaybackRate() {
        return filePlaybackRate;
    }

    /**
     * Sets the value of the filePlaybackRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFilePlaybackRate(BigInteger value) {
        this.filePlaybackRate = value;
    }

    /**
     * Gets the value of the filePrintHeight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filePrintHeight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilePrintHeight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getFilePrintHeight() {
        if (filePrintHeight == null) {
            filePrintHeight = new ArrayList<MeasurementType>();
        }
        return this.filePrintHeight;
    }

    /**
     * Gets the value of the filePrintWidth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filePrintWidth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilePrintWidth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getFilePrintWidth() {
        if (filePrintWidth == null) {
            filePrintWidth = new ArrayList<MeasurementType>();
        }
        return this.filePrintWidth;
    }

    /**
     * Gets the value of the fileResolutionDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileResolutionDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileResolutionDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getFileResolutionDescription() {
        if (fileResolutionDescription == null) {
            fileResolutionDescription = new ArrayList<Description70Type>();
        }
        return this.fileResolutionDescription;
    }

    /**
     * Gets the value of the fileRunTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getFileRunTime() {
        return fileRunTime;
    }

    /**
     * Sets the value of the fileRunTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileRunTime(LocalTime value) {
        this.fileRunTime = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileSize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileSize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getFileSize() {
        if (fileSize == null) {
            fileSize = new ArrayList<MeasurementType>();
        }
        return this.fileSize;
    }

    /**
     * Gets the value of the isFileBackgroundTransparent property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsFileBackgroundTransparent() {
        return isFileBackgroundTransparent;
    }

    /**
     * Sets the value of the isFileBackgroundTransparent property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsFileBackgroundTransparent(NonBinaryLogicEnumerationType value) {
        this.isFileBackgroundTransparent = value;
    }

    /**
     * Gets the value of the fileContentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FileContentInformationType }
     *     
     */
    public FileContentInformationType getFileContentInformation() {
        return fileContentInformation;
    }

    /**
     * Sets the value of the fileContentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileContentInformationType }
     *     
     */
    public void setFileContentInformation(FileContentInformationType value) {
        this.fileContentInformation = value;
    }

    /**
     * Gets the value of the fileUsageInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FileUsageInformationType }
     *     
     */
    public FileUsageInformationType getFileUsageInformation() {
        return fileUsageInformation;
    }

    /**
     * Sets the value of the fileUsageInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileUsageInformationType }
     *     
     */
    public void setFileUsageInformation(FileUsageInformationType value) {
        this.fileUsageInformation = value;
    }

}
