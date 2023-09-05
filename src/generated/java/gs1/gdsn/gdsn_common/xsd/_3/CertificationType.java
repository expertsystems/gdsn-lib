
package gs1.gdsn.gdsn_common.xsd._3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import gs1.shared.shared_common.xsd._3.CountryCodeType;
import gs1.shared.shared_common.xsd._3.Description500Type;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for CertificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="certificationValue"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="certificateIssuanceDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="certificationAssessmentDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="certificationEffectiveEndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="certificationEffectiveStartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="certificationIdentification" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="120"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="certificationExecutionCountryCode" type="{urn:gs1:shared:shared_common:xsd:3}CountryCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="certificationStatementOnPackage" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subjectOfCertificationDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referencedFileInformation" type="{urn:gs1:gdsn:gdsn_common:xsd:3}ReferencedFileInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "CertificationType", propOrder = {
    "certificationValue",
    "certificateIssuanceDateTime",
    "certificationAssessmentDateTime",
    "certificationEffectiveEndDateTime",
    "certificationEffectiveStartDateTime",
    "certificationIdentification",
    "certificationExecutionCountryCode",
    "certificationStatementOnPackage",
    "subjectOfCertificationDescription",
    "referencedFileInformation",
    "avpList"
})
public class CertificationType {

    @XmlElement(required = true)
    protected String certificationValue;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime certificateIssuanceDateTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime certificationAssessmentDateTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime certificationEffectiveEndDateTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime certificationEffectiveStartDateTime;
    protected String certificationIdentification;
    protected List<CountryCodeType> certificationExecutionCountryCode;
    protected List<Description500Type> certificationStatementOnPackage;
    protected List<Description500Type> subjectOfCertificationDescription;
    protected List<ReferencedFileInformationType> referencedFileInformation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the certificationValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationValue() {
        return certificationValue;
    }

    /**
     * Sets the value of the certificationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationValue(String value) {
        this.certificationValue = value;
    }

    /**
     * Gets the value of the certificateIssuanceDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getCertificateIssuanceDateTime() {
        return certificateIssuanceDateTime;
    }

    /**
     * Sets the value of the certificateIssuanceDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateIssuanceDateTime(LocalDateTime value) {
        this.certificateIssuanceDateTime = value;
    }

    /**
     * Gets the value of the certificationAssessmentDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getCertificationAssessmentDateTime() {
        return certificationAssessmentDateTime;
    }

    /**
     * Sets the value of the certificationAssessmentDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationAssessmentDateTime(LocalDateTime value) {
        this.certificationAssessmentDateTime = value;
    }

    /**
     * Gets the value of the certificationEffectiveEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getCertificationEffectiveEndDateTime() {
        return certificationEffectiveEndDateTime;
    }

    /**
     * Sets the value of the certificationEffectiveEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationEffectiveEndDateTime(LocalDateTime value) {
        this.certificationEffectiveEndDateTime = value;
    }

    /**
     * Gets the value of the certificationEffectiveStartDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getCertificationEffectiveStartDateTime() {
        return certificationEffectiveStartDateTime;
    }

    /**
     * Sets the value of the certificationEffectiveStartDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationEffectiveStartDateTime(LocalDateTime value) {
        this.certificationEffectiveStartDateTime = value;
    }

    /**
     * Gets the value of the certificationIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationIdentification() {
        return certificationIdentification;
    }

    /**
     * Sets the value of the certificationIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationIdentification(String value) {
        this.certificationIdentification = value;
    }

    /**
     * Gets the value of the certificationExecutionCountryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificationExecutionCountryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificationExecutionCountryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryCodeType }
     * 
     * 
     */
    public List<CountryCodeType> getCertificationExecutionCountryCode() {
        if (certificationExecutionCountryCode == null) {
            certificationExecutionCountryCode = new ArrayList<CountryCodeType>();
        }
        return this.certificationExecutionCountryCode;
    }

    /**
     * Gets the value of the certificationStatementOnPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificationStatementOnPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificationStatementOnPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getCertificationStatementOnPackage() {
        if (certificationStatementOnPackage == null) {
            certificationStatementOnPackage = new ArrayList<Description500Type>();
        }
        return this.certificationStatementOnPackage;
    }

    /**
     * Gets the value of the subjectOfCertificationDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectOfCertificationDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectOfCertificationDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getSubjectOfCertificationDescription() {
        if (subjectOfCertificationDescription == null) {
            subjectOfCertificationDescription = new ArrayList<Description500Type>();
        }
        return this.subjectOfCertificationDescription;
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
