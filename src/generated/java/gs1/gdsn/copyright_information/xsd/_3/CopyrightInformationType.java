
package gs1.gdsn.copyright_information.xsd._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.AmountType;
import gs1.shared.shared_common.xsd._3.CodeType;
import gs1.shared.shared_common.xsd._3.PartyIdentificationType;


/**
 * <p>Java class for CopyrightInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CopyrightInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="copyrightFee" type="{urn:gs1:shared:shared_common:xsd:3}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="copyrightOwnerIdentifierTypeCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="copyrightOwnerIdentifier"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="copyrightRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="copyrightYear" type="{http://www.w3.org/2001/XMLSchema}gYear" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="partyIdentification" type="{urn:gs1:shared:shared_common:xsd:3}PartyIdentificationType" minOccurs="0"/&gt;
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
@XmlType(name = "CopyrightInformationType", propOrder = {
    "copyrightFee",
    "copyrightOwnerIdentifierTypeCodeReference",
    "copyrightOwnerIdentifier",
    "copyrightRate",
    "copyrightYear",
    "partyIdentification",
    "avpList"
})
public class CopyrightInformationType {

    protected AmountType copyrightFee;
    protected CodeType copyrightOwnerIdentifierTypeCodeReference;
    @XmlElement(required = true)
    protected String copyrightOwnerIdentifier;
    protected BigDecimal copyrightRate;
    @XmlSchemaType(name = "gYear")
    protected List<XMLGregorianCalendar> copyrightYear;
    protected PartyIdentificationType partyIdentification;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the copyrightFee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCopyrightFee() {
        return copyrightFee;
    }

    /**
     * Sets the value of the copyrightFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCopyrightFee(AmountType value) {
        this.copyrightFee = value;
    }

    /**
     * Gets the value of the copyrightOwnerIdentifierTypeCodeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCopyrightOwnerIdentifierTypeCodeReference() {
        return copyrightOwnerIdentifierTypeCodeReference;
    }

    /**
     * Sets the value of the copyrightOwnerIdentifierTypeCodeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCopyrightOwnerIdentifierTypeCodeReference(CodeType value) {
        this.copyrightOwnerIdentifierTypeCodeReference = value;
    }

    /**
     * Gets the value of the copyrightOwnerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyrightOwnerIdentifier() {
        return copyrightOwnerIdentifier;
    }

    /**
     * Sets the value of the copyrightOwnerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightOwnerIdentifier(String value) {
        this.copyrightOwnerIdentifier = value;
    }

    /**
     * Gets the value of the copyrightRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCopyrightRate() {
        return copyrightRate;
    }

    /**
     * Sets the value of the copyrightRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCopyrightRate(BigDecimal value) {
        this.copyrightRate = value;
    }

    /**
     * Gets the value of the copyrightYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copyrightYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopyrightYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getCopyrightYear() {
        if (copyrightYear == null) {
            copyrightYear = new ArrayList<XMLGregorianCalendar>();
        }
        return this.copyrightYear;
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
