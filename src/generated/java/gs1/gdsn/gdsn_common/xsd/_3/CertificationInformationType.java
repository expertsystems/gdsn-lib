
package gs1.gdsn.gdsn_common.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.AdditionalPartyIdentificationType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for CertificationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificationInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalCertificationOrganisationIdentifier" type="{urn:gs1:shared:shared_common:xsd:3}AdditionalPartyIdentificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="certificationAgency" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="certificationOrganisationIdentifier" type="{urn:gs1:shared:shared_common:xsd:3}GLNType" minOccurs="0"/&gt;
 *         &lt;element name="certificationStandard" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isCertificateRequired" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="certification" type="{urn:gs1:gdsn:gdsn_common:xsd:3}CertificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "CertificationInformationType", propOrder = {
    "additionalCertificationOrganisationIdentifier",
    "certificationAgency",
    "certificationOrganisationIdentifier",
    "certificationStandard",
    "isCertificateRequired",
    "certification",
    "avpList"
})
public class CertificationInformationType {

    protected List<AdditionalPartyIdentificationType> additionalCertificationOrganisationIdentifier;
    protected String certificationAgency;
    protected String certificationOrganisationIdentifier;
    protected String certificationStandard;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isCertificateRequired;
    protected List<CertificationType> certification;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the additionalCertificationOrganisationIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalCertificationOrganisationIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalCertificationOrganisationIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalPartyIdentificationType }
     * 
     * 
     */
    public List<AdditionalPartyIdentificationType> getAdditionalCertificationOrganisationIdentifier() {
        if (additionalCertificationOrganisationIdentifier == null) {
            additionalCertificationOrganisationIdentifier = new ArrayList<AdditionalPartyIdentificationType>();
        }
        return this.additionalCertificationOrganisationIdentifier;
    }

    /**
     * Gets the value of the certificationAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationAgency() {
        return certificationAgency;
    }

    /**
     * Sets the value of the certificationAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationAgency(String value) {
        this.certificationAgency = value;
    }

    /**
     * Gets the value of the certificationOrganisationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationOrganisationIdentifier() {
        return certificationOrganisationIdentifier;
    }

    /**
     * Sets the value of the certificationOrganisationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationOrganisationIdentifier(String value) {
        this.certificationOrganisationIdentifier = value;
    }

    /**
     * Gets the value of the certificationStandard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationStandard() {
        return certificationStandard;
    }

    /**
     * Sets the value of the certificationStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationStandard(String value) {
        this.certificationStandard = value;
    }

    /**
     * Gets the value of the isCertificateRequired property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsCertificateRequired() {
        return isCertificateRequired;
    }

    /**
     * Sets the value of the isCertificateRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsCertificateRequired(NonBinaryLogicEnumerationType value) {
        this.isCertificateRequired = value;
    }

    /**
     * Gets the value of the certification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificationType }
     * 
     * 
     */
    public List<CertificationType> getCertification() {
        if (certification == null) {
            certification = new ArrayList<CertificationType>();
        }
        return this.certification;
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
