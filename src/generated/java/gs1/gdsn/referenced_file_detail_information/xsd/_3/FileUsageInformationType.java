
package gs1.gdsn.referenced_file_detail_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.CountryCodeType;
import gs1.shared.shared_common.xsd._3.Description1000Type;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for FileUsageInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileUsageInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="areFeesRequiredForUse" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="canFilesBeEdited" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="fileCampaignDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fileCopyrightDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fileDisclaimerInformation" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fileFeeDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fileRecommendedUsageDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fileRightsDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fileUsageRestriction" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="intendedPublicationCountryCode" type="{urn:gs1:shared:shared_common:xsd:3}CountryCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="intendedPublicationMediaTypeDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isFileForInternalUseOnly" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="isTalentReleaseOnFile" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileUsageInformationType", propOrder = {
    "areFeesRequiredForUse",
    "canFilesBeEdited",
    "fileCampaignDescription",
    "fileCopyrightDescription",
    "fileDisclaimerInformation",
    "fileFeeDescription",
    "fileRecommendedUsageDescription",
    "fileRightsDescription",
    "fileUsageRestriction",
    "intendedPublicationCountryCode",
    "intendedPublicationMediaTypeDescription",
    "isFileForInternalUseOnly",
    "isTalentReleaseOnFile"
})
public class FileUsageInformationType {

    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType areFeesRequiredForUse;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType canFilesBeEdited;
    protected List<Description1000Type> fileCampaignDescription;
    protected List<Description1000Type> fileCopyrightDescription;
    protected List<Description1000Type> fileDisclaimerInformation;
    protected List<Description1000Type> fileFeeDescription;
    protected List<Description1000Type> fileRecommendedUsageDescription;
    protected List<Description1000Type> fileRightsDescription;
    protected List<Description1000Type> fileUsageRestriction;
    protected List<CountryCodeType> intendedPublicationCountryCode;
    protected List<Description1000Type> intendedPublicationMediaTypeDescription;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isFileForInternalUseOnly;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isTalentReleaseOnFile;

    /**
     * Gets the value of the areFeesRequiredForUse property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getAreFeesRequiredForUse() {
        return areFeesRequiredForUse;
    }

    /**
     * Sets the value of the areFeesRequiredForUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setAreFeesRequiredForUse(NonBinaryLogicEnumerationType value) {
        this.areFeesRequiredForUse = value;
    }

    /**
     * Gets the value of the canFilesBeEdited property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getCanFilesBeEdited() {
        return canFilesBeEdited;
    }

    /**
     * Sets the value of the canFilesBeEdited property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setCanFilesBeEdited(NonBinaryLogicEnumerationType value) {
        this.canFilesBeEdited = value;
    }

    /**
     * Gets the value of the fileCampaignDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileCampaignDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileCampaignDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getFileCampaignDescription() {
        if (fileCampaignDescription == null) {
            fileCampaignDescription = new ArrayList<Description1000Type>();
        }
        return this.fileCampaignDescription;
    }

    /**
     * Gets the value of the fileCopyrightDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileCopyrightDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileCopyrightDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getFileCopyrightDescription() {
        if (fileCopyrightDescription == null) {
            fileCopyrightDescription = new ArrayList<Description1000Type>();
        }
        return this.fileCopyrightDescription;
    }

    /**
     * Gets the value of the fileDisclaimerInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileDisclaimerInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileDisclaimerInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getFileDisclaimerInformation() {
        if (fileDisclaimerInformation == null) {
            fileDisclaimerInformation = new ArrayList<Description1000Type>();
        }
        return this.fileDisclaimerInformation;
    }

    /**
     * Gets the value of the fileFeeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileFeeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileFeeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getFileFeeDescription() {
        if (fileFeeDescription == null) {
            fileFeeDescription = new ArrayList<Description1000Type>();
        }
        return this.fileFeeDescription;
    }

    /**
     * Gets the value of the fileRecommendedUsageDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileRecommendedUsageDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileRecommendedUsageDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getFileRecommendedUsageDescription() {
        if (fileRecommendedUsageDescription == null) {
            fileRecommendedUsageDescription = new ArrayList<Description1000Type>();
        }
        return this.fileRecommendedUsageDescription;
    }

    /**
     * Gets the value of the fileRightsDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileRightsDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileRightsDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getFileRightsDescription() {
        if (fileRightsDescription == null) {
            fileRightsDescription = new ArrayList<Description1000Type>();
        }
        return this.fileRightsDescription;
    }

    /**
     * Gets the value of the fileUsageRestriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileUsageRestriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileUsageRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getFileUsageRestriction() {
        if (fileUsageRestriction == null) {
            fileUsageRestriction = new ArrayList<Description1000Type>();
        }
        return this.fileUsageRestriction;
    }

    /**
     * Gets the value of the intendedPublicationCountryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intendedPublicationCountryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntendedPublicationCountryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryCodeType }
     * 
     * 
     */
    public List<CountryCodeType> getIntendedPublicationCountryCode() {
        if (intendedPublicationCountryCode == null) {
            intendedPublicationCountryCode = new ArrayList<CountryCodeType>();
        }
        return this.intendedPublicationCountryCode;
    }

    /**
     * Gets the value of the intendedPublicationMediaTypeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intendedPublicationMediaTypeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntendedPublicationMediaTypeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getIntendedPublicationMediaTypeDescription() {
        if (intendedPublicationMediaTypeDescription == null) {
            intendedPublicationMediaTypeDescription = new ArrayList<Description1000Type>();
        }
        return this.intendedPublicationMediaTypeDescription;
    }

    /**
     * Gets the value of the isFileForInternalUseOnly property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsFileForInternalUseOnly() {
        return isFileForInternalUseOnly;
    }

    /**
     * Sets the value of the isFileForInternalUseOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsFileForInternalUseOnly(NonBinaryLogicEnumerationType value) {
        this.isFileForInternalUseOnly = value;
    }

    /**
     * Gets the value of the isTalentReleaseOnFile property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsTalentReleaseOnFile() {
        return isTalentReleaseOnFile;
    }

    /**
     * Sets the value of the isTalentReleaseOnFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsTalentReleaseOnFile(NonBinaryLogicEnumerationType value) {
        this.isTalentReleaseOnFile = value;
    }

}
