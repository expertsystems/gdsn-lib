
package gs1.gdsn.referenced_file_detail_information.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description1000Type;
import gs1.shared.shared_common.xsd._3.Description70Type;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for FileContentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileContentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="areHumanModelsInFile" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="fileAuthorName" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fileCameraPerspective" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fileDepictedSceneDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fileDepictedSeason" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fileItemPositionCode" type="{urn:gs1:gdsn:referenced_file_detail_information:xsd:3}ItemPositionCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fileLayerQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="fileLifestyleDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fileStoryDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fileTalentDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="itemDepictionTypeCode" type="{urn:gs1:gdsn:referenced_file_detail_information:xsd:3}ItemDepictionCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="itemsInFileDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="numberOfItemsInDigitalAsset" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="additionalCameraAngleCode" type="{urn:gs1:gdsn:referenced_file_detail_information:xsd:3}AdditionalCameraAngleCodeType" minOccurs="0"/&gt;
 *         &lt;element name="fileCameraPerspectiveCode" type="{urn:gs1:gdsn:referenced_file_detail_information:xsd:3}FileCameraPerspectiveCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="verticalCameraAngleCode" type="{urn:gs1:gdsn:referenced_file_detail_information:xsd:3}VerticalCameraAngleCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileContentInformationType", propOrder = {
    "areHumanModelsInFile",
    "fileAuthorName",
    "fileCameraPerspective",
    "fileDepictedSceneDescription",
    "fileDepictedSeason",
    "fileItemPositionCode",
    "fileLayerQuantity",
    "fileLifestyleDescription",
    "fileStoryDescription",
    "fileTalentDescription",
    "itemDepictionTypeCode",
    "itemsInFileDescription",
    "numberOfItemsInDigitalAsset",
    "additionalCameraAngleCode",
    "fileCameraPerspectiveCode",
    "verticalCameraAngleCode"
})
public class FileContentInformationType {

    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType areHumanModelsInFile;
    protected List<String> fileAuthorName;
    protected List<Description70Type> fileCameraPerspective;
    protected List<Description1000Type> fileDepictedSceneDescription;
    protected List<Description70Type> fileDepictedSeason;
    protected List<ItemPositionCodeType> fileItemPositionCode;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger fileLayerQuantity;
    protected List<Description70Type> fileLifestyleDescription;
    protected List<Description1000Type> fileStoryDescription;
    protected List<Description1000Type> fileTalentDescription;
    protected List<ItemDepictionCodeType> itemDepictionTypeCode;
    protected List<Description70Type> itemsInFileDescription;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfItemsInDigitalAsset;
    protected AdditionalCameraAngleCodeType additionalCameraAngleCode;
    protected List<FileCameraPerspectiveCodeType> fileCameraPerspectiveCode;
    protected VerticalCameraAngleCodeType verticalCameraAngleCode;

    /**
     * Gets the value of the areHumanModelsInFile property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getAreHumanModelsInFile() {
        return areHumanModelsInFile;
    }

    /**
     * Sets the value of the areHumanModelsInFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setAreHumanModelsInFile(NonBinaryLogicEnumerationType value) {
        this.areHumanModelsInFile = value;
    }

    /**
     * Gets the value of the fileAuthorName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileAuthorName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileAuthorName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFileAuthorName() {
        if (fileAuthorName == null) {
            fileAuthorName = new ArrayList<String>();
        }
        return this.fileAuthorName;
    }

    /**
     * Gets the value of the fileCameraPerspective property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileCameraPerspective property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileCameraPerspective().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getFileCameraPerspective() {
        if (fileCameraPerspective == null) {
            fileCameraPerspective = new ArrayList<Description70Type>();
        }
        return this.fileCameraPerspective;
    }

    /**
     * Gets the value of the fileDepictedSceneDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileDepictedSceneDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileDepictedSceneDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getFileDepictedSceneDescription() {
        if (fileDepictedSceneDescription == null) {
            fileDepictedSceneDescription = new ArrayList<Description1000Type>();
        }
        return this.fileDepictedSceneDescription;
    }

    /**
     * Gets the value of the fileDepictedSeason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileDepictedSeason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileDepictedSeason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getFileDepictedSeason() {
        if (fileDepictedSeason == null) {
            fileDepictedSeason = new ArrayList<Description70Type>();
        }
        return this.fileDepictedSeason;
    }

    /**
     * Gets the value of the fileItemPositionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileItemPositionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileItemPositionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemPositionCodeType }
     * 
     * 
     */
    public List<ItemPositionCodeType> getFileItemPositionCode() {
        if (fileItemPositionCode == null) {
            fileItemPositionCode = new ArrayList<ItemPositionCodeType>();
        }
        return this.fileItemPositionCode;
    }

    /**
     * Gets the value of the fileLayerQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFileLayerQuantity() {
        return fileLayerQuantity;
    }

    /**
     * Sets the value of the fileLayerQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFileLayerQuantity(BigInteger value) {
        this.fileLayerQuantity = value;
    }

    /**
     * Gets the value of the fileLifestyleDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileLifestyleDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileLifestyleDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getFileLifestyleDescription() {
        if (fileLifestyleDescription == null) {
            fileLifestyleDescription = new ArrayList<Description70Type>();
        }
        return this.fileLifestyleDescription;
    }

    /**
     * Gets the value of the fileStoryDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileStoryDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileStoryDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getFileStoryDescription() {
        if (fileStoryDescription == null) {
            fileStoryDescription = new ArrayList<Description1000Type>();
        }
        return this.fileStoryDescription;
    }

    /**
     * Gets the value of the fileTalentDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileTalentDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileTalentDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getFileTalentDescription() {
        if (fileTalentDescription == null) {
            fileTalentDescription = new ArrayList<Description1000Type>();
        }
        return this.fileTalentDescription;
    }

    /**
     * Gets the value of the itemDepictionTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemDepictionTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemDepictionTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemDepictionCodeType }
     * 
     * 
     */
    public List<ItemDepictionCodeType> getItemDepictionTypeCode() {
        if (itemDepictionTypeCode == null) {
            itemDepictionTypeCode = new ArrayList<ItemDepictionCodeType>();
        }
        return this.itemDepictionTypeCode;
    }

    /**
     * Gets the value of the itemsInFileDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemsInFileDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemsInFileDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getItemsInFileDescription() {
        if (itemsInFileDescription == null) {
            itemsInFileDescription = new ArrayList<Description70Type>();
        }
        return this.itemsInFileDescription;
    }

    /**
     * Gets the value of the numberOfItemsInDigitalAsset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfItemsInDigitalAsset() {
        return numberOfItemsInDigitalAsset;
    }

    /**
     * Sets the value of the numberOfItemsInDigitalAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfItemsInDigitalAsset(BigInteger value) {
        this.numberOfItemsInDigitalAsset = value;
    }

    /**
     * Gets the value of the additionalCameraAngleCode property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalCameraAngleCodeType }
     *     
     */
    public AdditionalCameraAngleCodeType getAdditionalCameraAngleCode() {
        return additionalCameraAngleCode;
    }

    /**
     * Sets the value of the additionalCameraAngleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCameraAngleCodeType }
     *     
     */
    public void setAdditionalCameraAngleCode(AdditionalCameraAngleCodeType value) {
        this.additionalCameraAngleCode = value;
    }

    /**
     * Gets the value of the fileCameraPerspectiveCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileCameraPerspectiveCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileCameraPerspectiveCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileCameraPerspectiveCodeType }
     * 
     * 
     */
    public List<FileCameraPerspectiveCodeType> getFileCameraPerspectiveCode() {
        if (fileCameraPerspectiveCode == null) {
            fileCameraPerspectiveCode = new ArrayList<FileCameraPerspectiveCodeType>();
        }
        return this.fileCameraPerspectiveCode;
    }

    /**
     * Gets the value of the verticalCameraAngleCode property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalCameraAngleCodeType }
     *     
     */
    public VerticalCameraAngleCodeType getVerticalCameraAngleCode() {
        return verticalCameraAngleCode;
    }

    /**
     * Sets the value of the verticalCameraAngleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalCameraAngleCodeType }
     *     
     */
    public void setVerticalCameraAngleCode(VerticalCameraAngleCodeType value) {
        this.verticalCameraAngleCode = value;
    }

}
