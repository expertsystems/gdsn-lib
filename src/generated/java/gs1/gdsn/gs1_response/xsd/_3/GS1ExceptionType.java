
package gs1.gdsn.gs1_response.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.ExceptionMessageTypeCodeType;


/**
 * <p>Java class for GS1ExceptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GS1ExceptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="exceptionMessageTypeCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}ExceptionMessageTypeCodeType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="messageException" type="{urn:gs1:gdsn:gs1_response:xsd:3}MessageExceptionType"/&gt;
 *           &lt;element name="transactionException" type="{urn:gs1:gdsn:gs1_response:xsd:3}TransactionExceptionType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GS1ExceptionType", propOrder = {
    "exceptionMessageTypeCode",
    "messageException",
    "transactionException"
})
public class GS1ExceptionType {

    protected ExceptionMessageTypeCodeType exceptionMessageTypeCode;
    protected MessageExceptionType messageException;
    protected TransactionExceptionType transactionException;

    /**
     * Gets the value of the exceptionMessageTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionMessageTypeCodeType }
     *     
     */
    public ExceptionMessageTypeCodeType getExceptionMessageTypeCode() {
        return exceptionMessageTypeCode;
    }

    /**
     * Sets the value of the exceptionMessageTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionMessageTypeCodeType }
     *     
     */
    public void setExceptionMessageTypeCode(ExceptionMessageTypeCodeType value) {
        this.exceptionMessageTypeCode = value;
    }

    /**
     * Gets the value of the messageException property.
     * 
     * @return
     *     possible object is
     *     {@link MessageExceptionType }
     *     
     */
    public MessageExceptionType getMessageException() {
        return messageException;
    }

    /**
     * Sets the value of the messageException property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageExceptionType }
     *     
     */
    public void setMessageException(MessageExceptionType value) {
        this.messageException = value;
    }

    /**
     * Gets the value of the transactionException property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionExceptionType }
     *     
     */
    public TransactionExceptionType getTransactionException() {
        return transactionException;
    }

    /**
     * Sets the value of the transactionException property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionExceptionType }
     *     
     */
    public void setTransactionException(TransactionExceptionType value) {
        this.transactionException = value;
    }

}
