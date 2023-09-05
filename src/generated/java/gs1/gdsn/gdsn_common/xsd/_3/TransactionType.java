
package gs1.gdsn.gdsn_common.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.EntityIdentificationType;


/**
 * <p>Java class for TransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transactionIdentification" type="{urn:gs1:shared:shared_common:xsd:3}EntityIdentificationType"/&gt;
 *         &lt;element name="documentCommand" type="{urn:gs1:gdsn:gdsn_common:xsd:3}DocumentCommandType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionType", propOrder = {
    "transactionIdentification",
    "documentCommand"
})
public class TransactionType {

    @XmlElement(required = true)
    protected EntityIdentificationType transactionIdentification;
    @XmlElement(required = true)
    protected DocumentCommandType documentCommand;

    /**
     * Gets the value of the transactionIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdentificationType }
     *     
     */
    public EntityIdentificationType getTransactionIdentification() {
        return transactionIdentification;
    }

    /**
     * Sets the value of the transactionIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdentificationType }
     *     
     */
    public void setTransactionIdentification(EntityIdentificationType value) {
        this.transactionIdentification = value;
    }

    /**
     * Gets the value of the documentCommand property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentCommandType }
     *     
     */
    public DocumentCommandType getDocumentCommand() {
        return documentCommand;
    }

    /**
     * Sets the value of the documentCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentCommandType }
     *     
     */
    public void setDocumentCommand(DocumentCommandType value) {
        this.documentCommand = value;
    }

}
