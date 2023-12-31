
package gs1.gdsn.security_tag_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;


/**
 * <p>Java class for SecurityTagInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityTagInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="securityTagLocationCode" type="{urn:gs1:gdsn:security_tag_information:xsd:3}SecurityTagLocationCodeType" minOccurs="0"/&gt;
 *         &lt;element name="securityTagTypeCode" type="{urn:gs1:gdsn:security_tag_information:xsd:3}SecurityTagTypeCodeType" minOccurs="0"/&gt;
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
@XmlType(name = "SecurityTagInformationType", propOrder = {
    "securityTagLocationCode",
    "securityTagTypeCode",
    "avpList"
})
public class SecurityTagInformationType {

    protected SecurityTagLocationCodeType securityTagLocationCode;
    protected SecurityTagTypeCodeType securityTagTypeCode;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the securityTagLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityTagLocationCodeType }
     *     
     */
    public SecurityTagLocationCodeType getSecurityTagLocationCode() {
        return securityTagLocationCode;
    }

    /**
     * Sets the value of the securityTagLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityTagLocationCodeType }
     *     
     */
    public void setSecurityTagLocationCode(SecurityTagLocationCodeType value) {
        this.securityTagLocationCode = value;
    }

    /**
     * Gets the value of the securityTagTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityTagTypeCodeType }
     *     
     */
    public SecurityTagTypeCodeType getSecurityTagTypeCode() {
        return securityTagTypeCode;
    }

    /**
     * Sets the value of the securityTagTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityTagTypeCodeType }
     *     
     */
    public void setSecurityTagTypeCode(SecurityTagTypeCodeType value) {
        this.securityTagTypeCode = value;
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
