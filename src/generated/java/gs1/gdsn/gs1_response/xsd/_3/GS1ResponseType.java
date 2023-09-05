
package gs1.gdsn.gs1_response.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.EntityIdentificationType;


/**
 * <p>Java class for GS1ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GS1ResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="originatingMessageIdentifier" type="{urn:gs1:shared:shared_common:xsd:3}EntityIdentificationType"/&gt;
 *         &lt;element name="receiver" type="{urn:gs1:shared:shared_common:xsd:3}GLNType"/&gt;
 *         &lt;element name="sender" type="{urn:gs1:shared:shared_common:xsd:3}GLNType"/&gt;
 *         &lt;element name="transactionResponse" type="{urn:gs1:gdsn:gs1_response:xsd:3}TransactionResponseType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gS1Exception" type="{urn:gs1:gdsn:gs1_response:xsd:3}GS1ExceptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GS1ResponseType", propOrder = {
    "originatingMessageIdentifier",
    "receiver",
    "sender",
    "transactionResponse",
    "gs1Exception"
})
public class GS1ResponseType {

    @XmlElement(required = true)
    protected EntityIdentificationType originatingMessageIdentifier;
    @XmlElement(required = true)
    protected String receiver;
    @XmlElement(required = true)
    protected String sender;
    protected List<TransactionResponseType> transactionResponse;
    @XmlElement(name = "gS1Exception")
    protected List<GS1ExceptionType> gs1Exception;

    /**
     * Gets the value of the originatingMessageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdentificationType }
     *     
     */
    public EntityIdentificationType getOriginatingMessageIdentifier() {
        return originatingMessageIdentifier;
    }

    /**
     * Sets the value of the originatingMessageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdentificationType }
     *     
     */
    public void setOriginatingMessageIdentifier(EntityIdentificationType value) {
        this.originatingMessageIdentifier = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiver(String value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Gets the value of the transactionResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionResponseType }
     * 
     * 
     */
    public List<TransactionResponseType> getTransactionResponse() {
        if (transactionResponse == null) {
            transactionResponse = new ArrayList<TransactionResponseType>();
        }
        return this.transactionResponse;
    }

    /**
     * Gets the value of the gs1Exception property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gs1Exception property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGS1Exception().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GS1ExceptionType }
     * 
     * 
     */
    public List<GS1ExceptionType> getGS1Exception() {
        if (gs1Exception == null) {
            gs1Exception = new ArrayList<GS1ExceptionType>();
        }
        return this.gs1Exception;
    }

}
