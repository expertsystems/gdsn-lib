
package gs1.gdsn.gs1_response.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.gs1_response.xsd._3 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GS1ResponseMessage_QNAME = new QName("urn:gs1:gdsn:gs1_response:xsd:3", "gS1ResponseMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.gs1_response.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GS1ResponseMessageType }
     * 
     */
    public GS1ResponseMessageType createGS1ResponseMessageType() {
        return new GS1ResponseMessageType();
    }

    /**
     * Create an instance of {@link AttributeExceptionType }
     * 
     */
    public AttributeExceptionType createAttributeExceptionType() {
        return new AttributeExceptionType();
    }

    /**
     * Create an instance of {@link CommandExceptionType }
     * 
     */
    public CommandExceptionType createCommandExceptionType() {
        return new CommandExceptionType();
    }

    /**
     * Create an instance of {@link DocumentExceptionType }
     * 
     */
    public DocumentExceptionType createDocumentExceptionType() {
        return new DocumentExceptionType();
    }

    /**
     * Create an instance of {@link GS1ErrorType }
     * 
     */
    public GS1ErrorType createGS1ErrorType() {
        return new GS1ErrorType();
    }

    /**
     * Create an instance of {@link GS1ExceptionType }
     * 
     */
    public GS1ExceptionType createGS1ExceptionType() {
        return new GS1ExceptionType();
    }

    /**
     * Create an instance of {@link GS1ResponseType }
     * 
     */
    public GS1ResponseType createGS1ResponseType() {
        return new GS1ResponseType();
    }

    /**
     * Create an instance of {@link MessageExceptionType }
     * 
     */
    public MessageExceptionType createMessageExceptionType() {
        return new MessageExceptionType();
    }

    /**
     * Create an instance of {@link TransactionExceptionType }
     * 
     */
    public TransactionExceptionType createTransactionExceptionType() {
        return new TransactionExceptionType();
    }

    /**
     * Create an instance of {@link TransactionResponseType }
     * 
     */
    public TransactionResponseType createTransactionResponseType() {
        return new TransactionResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS1ResponseMessageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS1ResponseMessageType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:gs1_response:xsd:3", name = "gS1ResponseMessage")
    public JAXBElement<GS1ResponseMessageType> createGS1ResponseMessage(GS1ResponseMessageType value) {
        return new JAXBElement<GS1ResponseMessageType>(_GS1ResponseMessage_QNAME, GS1ResponseMessageType.class, null, value);
    }

}
