
package gs1.gdsn.onix_publication_file_information.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.AddressType;
import gs1.shared.shared_common.xsd._3.Description1000Type;


/**
 * <p>Java class for ONIXPublicationFileInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ONIXPublicationFileInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contributorStatement" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="numberOfIllustratedPages" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="publishingStatusCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="restOfWorldSalesRightsType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="publicationLocation" type="{urn:gs1:shared:shared_common:xsd:3}AddressType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="oNIXAdditionalPublicationDescriptionInformation" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXAdditionalPublicationDescriptionInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="oNIXContributor" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXContributorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="oNIXExtent" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXExtentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="oNIXElectronicPublicationInformation" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXElectronicPublicationInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="oNIXIllustrationInformation" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXIllustrationInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="oNIXPublicationAudience" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXPublicationAudienceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="oNIXPublicationCollectionInformation" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXPublicationCollectionInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="oNIXPublicationDateInformation" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXPublicationDateInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="oNIXPublicationEditionInformation" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXPublicationEditionInformationType" minOccurs="0"/&gt;
 *         &lt;element name="oNIXPublisher" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXPublisherType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="oNIXPublicationSalesRights" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXPublicationSalesRightsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="oNIXSubject" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXSubjectType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="oNIXTitleElement" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXTitleElementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="oNIXSupplyDetail" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXSupplyDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ONIXPublicationFileInformationType", propOrder = {
    "contributorStatement",
    "numberOfIllustratedPages",
    "publishingStatusCode",
    "restOfWorldSalesRightsType",
    "publicationLocation",
    "onixAdditionalPublicationDescriptionInformation",
    "onixContributor",
    "onixExtent",
    "onixElectronicPublicationInformation",
    "onixIllustrationInformation",
    "onixPublicationAudience",
    "onixPublicationCollectionInformation",
    "onixPublicationDateInformation",
    "onixPublicationEditionInformation",
    "onixPublisher",
    "onixPublicationSalesRights",
    "onixSubject",
    "onixTitleElement",
    "onixSupplyDetail",
    "avpList"
})
public class ONIXPublicationFileInformationType {

    protected List<Description1000Type> contributorStatement;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfIllustratedPages;
    protected String publishingStatusCode;
    protected String restOfWorldSalesRightsType;
    protected List<AddressType> publicationLocation;
    @XmlElement(name = "oNIXAdditionalPublicationDescriptionInformation")
    protected List<ONIXAdditionalPublicationDescriptionInformationType> onixAdditionalPublicationDescriptionInformation;
    @XmlElement(name = "oNIXContributor")
    protected List<ONIXContributorType> onixContributor;
    @XmlElement(name = "oNIXExtent")
    protected List<ONIXExtentType> onixExtent;
    @XmlElement(name = "oNIXElectronicPublicationInformation")
    protected List<ONIXElectronicPublicationInformationType> onixElectronicPublicationInformation;
    @XmlElement(name = "oNIXIllustrationInformation")
    protected List<ONIXIllustrationInformationType> onixIllustrationInformation;
    @XmlElement(name = "oNIXPublicationAudience")
    protected List<ONIXPublicationAudienceType> onixPublicationAudience;
    @XmlElement(name = "oNIXPublicationCollectionInformation")
    protected List<ONIXPublicationCollectionInformationType> onixPublicationCollectionInformation;
    @XmlElement(name = "oNIXPublicationDateInformation")
    protected List<ONIXPublicationDateInformationType> onixPublicationDateInformation;
    @XmlElement(name = "oNIXPublicationEditionInformation")
    protected ONIXPublicationEditionInformationType onixPublicationEditionInformation;
    @XmlElement(name = "oNIXPublisher")
    protected List<ONIXPublisherType> onixPublisher;
    @XmlElement(name = "oNIXPublicationSalesRights")
    protected List<ONIXPublicationSalesRightsType> onixPublicationSalesRights;
    @XmlElement(name = "oNIXSubject")
    protected List<ONIXSubjectType> onixSubject;
    @XmlElement(name = "oNIXTitleElement")
    protected List<ONIXTitleElementType> onixTitleElement;
    @XmlElement(name = "oNIXSupplyDetail")
    protected List<ONIXSupplyDetailType> onixSupplyDetail;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the contributorStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contributorStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContributorStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getContributorStatement() {
        if (contributorStatement == null) {
            contributorStatement = new ArrayList<Description1000Type>();
        }
        return this.contributorStatement;
    }

    /**
     * Gets the value of the numberOfIllustratedPages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfIllustratedPages() {
        return numberOfIllustratedPages;
    }

    /**
     * Sets the value of the numberOfIllustratedPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfIllustratedPages(BigInteger value) {
        this.numberOfIllustratedPages = value;
    }

    /**
     * Gets the value of the publishingStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishingStatusCode() {
        return publishingStatusCode;
    }

    /**
     * Sets the value of the publishingStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishingStatusCode(String value) {
        this.publishingStatusCode = value;
    }

    /**
     * Gets the value of the restOfWorldSalesRightsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestOfWorldSalesRightsType() {
        return restOfWorldSalesRightsType;
    }

    /**
     * Sets the value of the restOfWorldSalesRightsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestOfWorldSalesRightsType(String value) {
        this.restOfWorldSalesRightsType = value;
    }

    /**
     * Gets the value of the publicationLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicationLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicationLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getPublicationLocation() {
        if (publicationLocation == null) {
            publicationLocation = new ArrayList<AddressType>();
        }
        return this.publicationLocation;
    }

    /**
     * Gets the value of the onixAdditionalPublicationDescriptionInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onixAdditionalPublicationDescriptionInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getONIXAdditionalPublicationDescriptionInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXAdditionalPublicationDescriptionInformationType }
     * 
     * 
     */
    public List<ONIXAdditionalPublicationDescriptionInformationType> getONIXAdditionalPublicationDescriptionInformation() {
        if (onixAdditionalPublicationDescriptionInformation == null) {
            onixAdditionalPublicationDescriptionInformation = new ArrayList<ONIXAdditionalPublicationDescriptionInformationType>();
        }
        return this.onixAdditionalPublicationDescriptionInformation;
    }

    /**
     * Gets the value of the onixContributor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onixContributor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getONIXContributor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXContributorType }
     * 
     * 
     */
    public List<ONIXContributorType> getONIXContributor() {
        if (onixContributor == null) {
            onixContributor = new ArrayList<ONIXContributorType>();
        }
        return this.onixContributor;
    }

    /**
     * Gets the value of the onixExtent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onixExtent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getONIXExtent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXExtentType }
     * 
     * 
     */
    public List<ONIXExtentType> getONIXExtent() {
        if (onixExtent == null) {
            onixExtent = new ArrayList<ONIXExtentType>();
        }
        return this.onixExtent;
    }

    /**
     * Gets the value of the onixElectronicPublicationInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onixElectronicPublicationInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getONIXElectronicPublicationInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXElectronicPublicationInformationType }
     * 
     * 
     */
    public List<ONIXElectronicPublicationInformationType> getONIXElectronicPublicationInformation() {
        if (onixElectronicPublicationInformation == null) {
            onixElectronicPublicationInformation = new ArrayList<ONIXElectronicPublicationInformationType>();
        }
        return this.onixElectronicPublicationInformation;
    }

    /**
     * Gets the value of the onixIllustrationInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onixIllustrationInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getONIXIllustrationInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXIllustrationInformationType }
     * 
     * 
     */
    public List<ONIXIllustrationInformationType> getONIXIllustrationInformation() {
        if (onixIllustrationInformation == null) {
            onixIllustrationInformation = new ArrayList<ONIXIllustrationInformationType>();
        }
        return this.onixIllustrationInformation;
    }

    /**
     * Gets the value of the onixPublicationAudience property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onixPublicationAudience property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getONIXPublicationAudience().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXPublicationAudienceType }
     * 
     * 
     */
    public List<ONIXPublicationAudienceType> getONIXPublicationAudience() {
        if (onixPublicationAudience == null) {
            onixPublicationAudience = new ArrayList<ONIXPublicationAudienceType>();
        }
        return this.onixPublicationAudience;
    }

    /**
     * Gets the value of the onixPublicationCollectionInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onixPublicationCollectionInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getONIXPublicationCollectionInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXPublicationCollectionInformationType }
     * 
     * 
     */
    public List<ONIXPublicationCollectionInformationType> getONIXPublicationCollectionInformation() {
        if (onixPublicationCollectionInformation == null) {
            onixPublicationCollectionInformation = new ArrayList<ONIXPublicationCollectionInformationType>();
        }
        return this.onixPublicationCollectionInformation;
    }

    /**
     * Gets the value of the onixPublicationDateInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onixPublicationDateInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getONIXPublicationDateInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXPublicationDateInformationType }
     * 
     * 
     */
    public List<ONIXPublicationDateInformationType> getONIXPublicationDateInformation() {
        if (onixPublicationDateInformation == null) {
            onixPublicationDateInformation = new ArrayList<ONIXPublicationDateInformationType>();
        }
        return this.onixPublicationDateInformation;
    }

    /**
     * Gets the value of the onixPublicationEditionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ONIXPublicationEditionInformationType }
     *     
     */
    public ONIXPublicationEditionInformationType getONIXPublicationEditionInformation() {
        return onixPublicationEditionInformation;
    }

    /**
     * Sets the value of the onixPublicationEditionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ONIXPublicationEditionInformationType }
     *     
     */
    public void setONIXPublicationEditionInformation(ONIXPublicationEditionInformationType value) {
        this.onixPublicationEditionInformation = value;
    }

    /**
     * Gets the value of the onixPublisher property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onixPublisher property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getONIXPublisher().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXPublisherType }
     * 
     * 
     */
    public List<ONIXPublisherType> getONIXPublisher() {
        if (onixPublisher == null) {
            onixPublisher = new ArrayList<ONIXPublisherType>();
        }
        return this.onixPublisher;
    }

    /**
     * Gets the value of the onixPublicationSalesRights property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onixPublicationSalesRights property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getONIXPublicationSalesRights().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXPublicationSalesRightsType }
     * 
     * 
     */
    public List<ONIXPublicationSalesRightsType> getONIXPublicationSalesRights() {
        if (onixPublicationSalesRights == null) {
            onixPublicationSalesRights = new ArrayList<ONIXPublicationSalesRightsType>();
        }
        return this.onixPublicationSalesRights;
    }

    /**
     * Gets the value of the onixSubject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onixSubject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getONIXSubject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXSubjectType }
     * 
     * 
     */
    public List<ONIXSubjectType> getONIXSubject() {
        if (onixSubject == null) {
            onixSubject = new ArrayList<ONIXSubjectType>();
        }
        return this.onixSubject;
    }

    /**
     * Gets the value of the onixTitleElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onixTitleElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getONIXTitleElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXTitleElementType }
     * 
     * 
     */
    public List<ONIXTitleElementType> getONIXTitleElement() {
        if (onixTitleElement == null) {
            onixTitleElement = new ArrayList<ONIXTitleElementType>();
        }
        return this.onixTitleElement;
    }

    /**
     * Gets the value of the onixSupplyDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onixSupplyDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getONIXSupplyDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXSupplyDetailType }
     * 
     * 
     */
    public List<ONIXSupplyDetailType> getONIXSupplyDetail() {
        if (onixSupplyDetail == null) {
            onixSupplyDetail = new ArrayList<ONIXSupplyDetailType>();
        }
        return this.onixSupplyDetail;
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
