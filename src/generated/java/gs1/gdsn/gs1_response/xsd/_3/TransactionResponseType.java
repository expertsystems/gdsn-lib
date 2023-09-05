
package gs1.gdsn.gs1_response.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.EntityIdentificationType;
import gs1.shared.shared_common.xsd._3.ResponseStatusEnumerationType;


/**
 * <p>Java class for TransactionResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transactionIdentifier" type="{urn:gs1:shared:shared_common:xsd:3}EntityIdentificationType"/&gt;
 *         &lt;element name="responseStatusCode" type="{urn:gs1:shared:shared_common:xsd:3}ResponseStatusEnumerationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionResponseType", propOrder = {
    "transactionIdentifier",
    "responseStatusCode"
})
public class TransactionResponseType {

    @XmlElement(required = true)
    protected EntityIdentificationType transactionIdentifier;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ResponseStatusEnumerationType responseStatusCode;

    /**
     * Gets the value of the transactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdentificationType }
     *     
     */
    public EntityIdentificationType getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * Sets the value of the transactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdentificationType }
     *     
     */
    public void setTransactionIdentifier(EntityIdentificationType value) {
        this.transactionIdentifier = value;
    }

    /**
     * Gets the value of the responseStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatusEnumerationType }
     *     
     */
    public ResponseStatusEnumerationType getResponseStatusCode() {
        return responseStatusCode;
    }

    /**
     * Sets the value of the responseStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatusEnumerationType }
     *     
     */
    public void setResponseStatusCode(ResponseStatusEnumerationType value) {
        this.responseStatusCode = value;
    }

}
