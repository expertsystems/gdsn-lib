
package gs1.gdsn.gdsn_common.xsd._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganicClaimType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganicClaimType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organicClaimAgencyCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}OrganicClaimAgencyCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="organicPercentClaim" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="organicTradeItemCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}OrganicTradeItemCodeType" minOccurs="0"/&gt;
 *         &lt;element name="organicClaimAgencyTypeCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}OrganicClaimAgencyTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="organicClaimAgencyName" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="organicCertification" type="{urn:gs1:gdsn:gdsn_common:xsd:3}OrganicCertificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "OrganicClaimType", propOrder = {
    "organicClaimAgencyCode",
    "organicPercentClaim",
    "organicTradeItemCode",
    "organicClaimAgencyTypeCode",
    "organicClaimAgencyName",
    "organicCertification",
    "avpList"
})
public class OrganicClaimType {

    protected List<OrganicClaimAgencyCodeType> organicClaimAgencyCode;
    protected BigDecimal organicPercentClaim;
    protected OrganicTradeItemCodeType organicTradeItemCode;
    protected OrganicClaimAgencyTypeCodeType organicClaimAgencyTypeCode;
    protected List<String> organicClaimAgencyName;
    protected List<OrganicCertificationType> organicCertification;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the organicClaimAgencyCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organicClaimAgencyCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganicClaimAgencyCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganicClaimAgencyCodeType }
     * 
     * 
     */
    public List<OrganicClaimAgencyCodeType> getOrganicClaimAgencyCode() {
        if (organicClaimAgencyCode == null) {
            organicClaimAgencyCode = new ArrayList<OrganicClaimAgencyCodeType>();
        }
        return this.organicClaimAgencyCode;
    }

    /**
     * Gets the value of the organicPercentClaim property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrganicPercentClaim() {
        return organicPercentClaim;
    }

    /**
     * Sets the value of the organicPercentClaim property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrganicPercentClaim(BigDecimal value) {
        this.organicPercentClaim = value;
    }

    /**
     * Gets the value of the organicTradeItemCode property.
     * 
     * @return
     *     possible object is
     *     {@link OrganicTradeItemCodeType }
     *     
     */
    public OrganicTradeItemCodeType getOrganicTradeItemCode() {
        return organicTradeItemCode;
    }

    /**
     * Sets the value of the organicTradeItemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganicTradeItemCodeType }
     *     
     */
    public void setOrganicTradeItemCode(OrganicTradeItemCodeType value) {
        this.organicTradeItemCode = value;
    }

    /**
     * Gets the value of the organicClaimAgencyTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link OrganicClaimAgencyTypeCodeType }
     *     
     */
    public OrganicClaimAgencyTypeCodeType getOrganicClaimAgencyTypeCode() {
        return organicClaimAgencyTypeCode;
    }

    /**
     * Sets the value of the organicClaimAgencyTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganicClaimAgencyTypeCodeType }
     *     
     */
    public void setOrganicClaimAgencyTypeCode(OrganicClaimAgencyTypeCodeType value) {
        this.organicClaimAgencyTypeCode = value;
    }

    /**
     * Gets the value of the organicClaimAgencyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organicClaimAgencyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganicClaimAgencyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOrganicClaimAgencyName() {
        if (organicClaimAgencyName == null) {
            organicClaimAgencyName = new ArrayList<String>();
        }
        return this.organicClaimAgencyName;
    }

    /**
     * Gets the value of the organicCertification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organicCertification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganicCertification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganicCertificationType }
     * 
     * 
     */
    public List<OrganicCertificationType> getOrganicCertification() {
        if (organicCertification == null) {
            organicCertification = new ArrayList<OrganicCertificationType>();
        }
        return this.organicCertification;
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
