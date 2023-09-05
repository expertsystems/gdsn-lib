
package gs1.gdsn.request_for_catalogue_item_notification.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.request_for_catalogue_item_notification.xsd._3 package. 
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

    private final static QName _RequestForCatalogueItemNotification_QNAME = new QName("urn:gs1:gdsn:request_for_catalogue_item_notification:xsd:3", "requestForCatalogueItemNotification");
    private final static QName _RequestForCatalogueItemNotificationMessage_QNAME = new QName("urn:gs1:gdsn:request_for_catalogue_item_notification:xsd:3", "requestForCatalogueItemNotificationMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.request_for_catalogue_item_notification.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestForCatalogueItemNotificationType }
     * 
     */
    public RequestForCatalogueItemNotificationType createRequestForCatalogueItemNotificationType() {
        return new RequestForCatalogueItemNotificationType();
    }

    /**
     * Create an instance of {@link RequestForCatalogueItemNotificationMessageType }
     * 
     */
    public RequestForCatalogueItemNotificationMessageType createRequestForCatalogueItemNotificationMessageType() {
        return new RequestForCatalogueItemNotificationMessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestForCatalogueItemNotificationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestForCatalogueItemNotificationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:request_for_catalogue_item_notification:xsd:3", name = "requestForCatalogueItemNotification", substitutionHeadNamespace = "urn:gs1:gdsn:gdsn_common:xsd:3", substitutionHeadName = "document")
    public JAXBElement<RequestForCatalogueItemNotificationType> createRequestForCatalogueItemNotification(RequestForCatalogueItemNotificationType value) {
        return new JAXBElement<RequestForCatalogueItemNotificationType>(_RequestForCatalogueItemNotification_QNAME, RequestForCatalogueItemNotificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestForCatalogueItemNotificationMessageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestForCatalogueItemNotificationMessageType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:request_for_catalogue_item_notification:xsd:3", name = "requestForCatalogueItemNotificationMessage")
    public JAXBElement<RequestForCatalogueItemNotificationMessageType> createRequestForCatalogueItemNotificationMessage(RequestForCatalogueItemNotificationMessageType value) {
        return new JAXBElement<RequestForCatalogueItemNotificationMessageType>(_RequestForCatalogueItemNotificationMessage_QNAME, RequestForCatalogueItemNotificationMessageType.class, null, value);
    }

}
