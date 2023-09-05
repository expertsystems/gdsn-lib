
package gs1.gdsn.onix_publication_file_information.xsd._3;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import gs1.gdsn.gdsn_common.xsd._3.ReferencedFileInformationType;
import gs1.shared.shared_common.xsd._3.AddressType;
import gs1.shared.shared_common.xsd._3.Description2500Type;
import gs1.shared.shared_common.xsd._3.PartyIdentificationType;
import se.exder.external.gs1.gdsn3p1.Adapter3;


/**
 * <p>Java class for ONIXContributorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ONIXContributorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="biographicalNote" type="{urn:gs1:shared:shared_common:xsd:3}Description2500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contributorDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="contributorDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description2500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contributorRoleCode" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXContributorRoleCodeType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="professionalAffiliation" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="unnamedPersons" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="address" type="{urn:gs1:shared:shared_common:xsd:3}AddressType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="languageTranslation" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}LanguageTranslationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="oNIXContributorAlternativeName" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXContributorAlternativeNameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="oNIXContributorPlace" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXContributorPlaceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="oNIXPublicationNameInformation" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXPublicationNameInformationType" minOccurs="0"/&gt;
 *         &lt;element name="partyIdentification" type="{urn:gs1:shared:shared_common:xsd:3}PartyIdentificationType" minOccurs="0"/&gt;
 *         &lt;element name="referencedFileInformation" type="{urn:gs1:gdsn:gdsn_common:xsd:3}ReferencedFileInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ONIXContributorType", propOrder = {
    "biographicalNote",
    "contributorDate",
    "contributorDescription",
    "contributorRoleCode",
    "professionalAffiliation",
    "sequenceNumber",
    "unnamedPersons",
    "address",
    "languageTranslation",
    "onixContributorAlternativeName",
    "onixContributorPlace",
    "onixPublicationNameInformation",
    "partyIdentification",
    "referencedFileInformation"
})
public class ONIXContributorType {

    protected List<Description2500Type> biographicalNote;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate contributorDate;
    protected List<Description2500Type> contributorDescription;
    @XmlElement(required = true)
    protected List<ONIXContributorRoleCodeType> contributorRoleCode;
    protected List<String> professionalAffiliation;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequenceNumber;
    protected String unnamedPersons;
    protected List<AddressType> address;
    protected List<LanguageTranslationType> languageTranslation;
    @XmlElement(name = "oNIXContributorAlternativeName")
    protected List<ONIXContributorAlternativeNameType> onixContributorAlternativeName;
    @XmlElement(name = "oNIXContributorPlace")
    protected List<ONIXContributorPlaceType> onixContributorPlace;
    @XmlElement(name = "oNIXPublicationNameInformation")
    protected ONIXPublicationNameInformationType onixPublicationNameInformation;
    protected PartyIdentificationType partyIdentification;
    protected List<ReferencedFileInformationType> referencedFileInformation;

    /**
     * Gets the value of the biographicalNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the biographicalNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBiographicalNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description2500Type }
     * 
     * 
     */
    public List<Description2500Type> getBiographicalNote() {
        if (biographicalNote == null) {
            biographicalNote = new ArrayList<Description2500Type>();
        }
        return this.biographicalNote;
    }

    /**
     * Gets the value of the contributorDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getContributorDate() {
        return contributorDate;
    }

    /**
     * Sets the value of the contributorDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContributorDate(LocalDate value) {
        this.contributorDate = value;
    }

    /**
     * Gets the value of the contributorDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contributorDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContributorDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description2500Type }
     * 
     * 
     */
    public List<Description2500Type> getContributorDescription() {
        if (contributorDescription == null) {
            contributorDescription = new ArrayList<Description2500Type>();
        }
        return this.contributorDescription;
    }

    /**
     * Gets the value of the contributorRoleCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contributorRoleCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContributorRoleCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXContributorRoleCodeType }
     * 
     * 
     */
    public List<ONIXContributorRoleCodeType> getContributorRoleCode() {
        if (contributorRoleCode == null) {
            contributorRoleCode = new ArrayList<ONIXContributorRoleCodeType>();
        }
        return this.contributorRoleCode;
    }

    /**
     * Gets the value of the professionalAffiliation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the professionalAffiliation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfessionalAffiliation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProfessionalAffiliation() {
        if (professionalAffiliation == null) {
            professionalAffiliation = new ArrayList<String>();
        }
        return this.professionalAffiliation;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the unnamedPersons property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnnamedPersons() {
        return unnamedPersons;
    }

    /**
     * Sets the value of the unnamedPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnnamedPersons(String value) {
        this.unnamedPersons = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressType>();
        }
        return this.address;
    }

    /**
     * Gets the value of the languageTranslation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageTranslation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguageTranslation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageTranslationType }
     * 
     * 
     */
    public List<LanguageTranslationType> getLanguageTranslation() {
        if (languageTranslation == null) {
            languageTranslation = new ArrayList<LanguageTranslationType>();
        }
        return this.languageTranslation;
    }

    /**
     * Gets the value of the onixContributorAlternativeName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onixContributorAlternativeName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getONIXContributorAlternativeName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXContributorAlternativeNameType }
     * 
     * 
     */
    public List<ONIXContributorAlternativeNameType> getONIXContributorAlternativeName() {
        if (onixContributorAlternativeName == null) {
            onixContributorAlternativeName = new ArrayList<ONIXContributorAlternativeNameType>();
        }
        return this.onixContributorAlternativeName;
    }

    /**
     * Gets the value of the onixContributorPlace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onixContributorPlace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getONIXContributorPlace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXContributorPlaceType }
     * 
     * 
     */
    public List<ONIXContributorPlaceType> getONIXContributorPlace() {
        if (onixContributorPlace == null) {
            onixContributorPlace = new ArrayList<ONIXContributorPlaceType>();
        }
        return this.onixContributorPlace;
    }

    /**
     * Gets the value of the onixPublicationNameInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ONIXPublicationNameInformationType }
     *     
     */
    public ONIXPublicationNameInformationType getONIXPublicationNameInformation() {
        return onixPublicationNameInformation;
    }

    /**
     * Sets the value of the onixPublicationNameInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ONIXPublicationNameInformationType }
     *     
     */
    public void setONIXPublicationNameInformation(ONIXPublicationNameInformationType value) {
        this.onixPublicationNameInformation = value;
    }

    /**
     * Gets the value of the partyIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationType }
     *     
     */
    public PartyIdentificationType getPartyIdentification() {
        return partyIdentification;
    }

    /**
     * Sets the value of the partyIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationType }
     *     
     */
    public void setPartyIdentification(PartyIdentificationType value) {
        this.partyIdentification = value;
    }

    /**
     * Gets the value of the referencedFileInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencedFileInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencedFileInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencedFileInformationType }
     * 
     * 
     */
    public List<ReferencedFileInformationType> getReferencedFileInformation() {
        if (referencedFileInformation == null) {
            referencedFileInformation = new ArrayList<ReferencedFileInformationType>();
        }
        return this.referencedFileInformation;
    }

}
