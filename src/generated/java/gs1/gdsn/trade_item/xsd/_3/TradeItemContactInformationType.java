
package gs1.gdsn.trade_item.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.StructuredAddressType;
import gs1.shared.shared_common.xsd._3.AdditionalPartyIdentificationType;
import gs1.shared.shared_common.xsd._3.ContactTypeCodeType;
import gs1.shared.shared_common.xsd._3.Description200Type;
import gs1.shared.shared_common.xsd._3.Description70Type;


/**
 * <p>Java class for TradeItemContactInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemContactInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactTypeCode" type="{urn:gs1:shared:shared_common:xsd:3}ContactTypeCodeType"/&gt;
 *         &lt;element name="additionalPartyIdentification" type="{urn:gs1:shared:shared_common:xsd:3}AdditionalPartyIdentificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="availableTime" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contactAddress" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="contactDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contactName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gln" type="{urn:gs1:shared:shared_common:xsd:3}GLNType" minOccurs="0"/&gt;
 *         &lt;element name="structuredAddress" type="{urn:gs1:gdsn:gdsn_common:xsd:3}StructuredAddressType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="targetMarketCommunicationChannel" type="{urn:gs1:gdsn:trade_item:xsd:3}TargetMarketCommunicationChannelType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemContactInformationType", propOrder = {
    "contactTypeCode",
    "additionalPartyIdentification",
    "availableTime",
    "contactAddress",
    "contactDescription",
    "contactName",
    "gln",
    "structuredAddress",
    "targetMarketCommunicationChannel"
})
public class TradeItemContactInformationType {

    @XmlElement(required = true)
    protected ContactTypeCodeType contactTypeCode;
    protected List<AdditionalPartyIdentificationType> additionalPartyIdentification;
    protected List<Description70Type> availableTime;
    protected String contactAddress;
    protected List<Description200Type> contactDescription;
    protected String contactName;
    protected String gln;
    protected List<StructuredAddressType> structuredAddress;
    protected List<TargetMarketCommunicationChannelType> targetMarketCommunicationChannel;

    /**
     * Gets the value of the contactTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ContactTypeCodeType }
     *     
     */
    public ContactTypeCodeType getContactTypeCode() {
        return contactTypeCode;
    }

    /**
     * Sets the value of the contactTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactTypeCodeType }
     *     
     */
    public void setContactTypeCode(ContactTypeCodeType value) {
        this.contactTypeCode = value;
    }

    /**
     * Gets the value of the additionalPartyIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalPartyIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalPartyIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalPartyIdentificationType }
     * 
     * 
     */
    public List<AdditionalPartyIdentificationType> getAdditionalPartyIdentification() {
        if (additionalPartyIdentification == null) {
            additionalPartyIdentification = new ArrayList<AdditionalPartyIdentificationType>();
        }
        return this.additionalPartyIdentification;
    }

    /**
     * Gets the value of the availableTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getAvailableTime() {
        if (availableTime == null) {
            availableTime = new ArrayList<Description70Type>();
        }
        return this.availableTime;
    }

    /**
     * Gets the value of the contactAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactAddress() {
        return contactAddress;
    }

    /**
     * Sets the value of the contactAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactAddress(String value) {
        this.contactAddress = value;
    }

    /**
     * Gets the value of the contactDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description200Type }
     * 
     * 
     */
    public List<Description200Type> getContactDescription() {
        if (contactDescription == null) {
            contactDescription = new ArrayList<Description200Type>();
        }
        return this.contactDescription;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the gln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGln() {
        return gln;
    }

    /**
     * Sets the value of the gln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGln(String value) {
        this.gln = value;
    }

    /**
     * Gets the value of the structuredAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structuredAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructuredAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructuredAddressType }
     * 
     * 
     */
    public List<StructuredAddressType> getStructuredAddress() {
        if (structuredAddress == null) {
            structuredAddress = new ArrayList<StructuredAddressType>();
        }
        return this.structuredAddress;
    }

    /**
     * Gets the value of the targetMarketCommunicationChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetMarketCommunicationChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetMarketCommunicationChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetMarketCommunicationChannelType }
     * 
     * 
     */
    public List<TargetMarketCommunicationChannelType> getTargetMarketCommunicationChannel() {
        if (targetMarketCommunicationChannel == null) {
            targetMarketCommunicationChannel = new ArrayList<TargetMarketCommunicationChannelType>();
        }
        return this.targetMarketCommunicationChannel;
    }

}
