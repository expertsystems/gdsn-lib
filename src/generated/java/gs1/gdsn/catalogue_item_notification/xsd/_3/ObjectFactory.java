
package gs1.gdsn.catalogue_item_notification.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.catalogue_item_notification.xsd._3 package. 
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

    private final static QName _CatalogueItemNotification_QNAME = new QName("urn:gs1:gdsn:catalogue_item_notification:xsd:3", "catalogueItemNotification");
    private final static QName _CatalogueItemNotificationMessage_QNAME = new QName("urn:gs1:gdsn:catalogue_item_notification:xsd:3", "catalogueItemNotificationMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.catalogue_item_notification.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CatalogueItemNotificationType }
     * 
     */
    public CatalogueItemNotificationType createCatalogueItemNotificationType() {
        return new CatalogueItemNotificationType();
    }

    /**
     * Create an instance of {@link CatalogueItemNotificationMessageType }
     * 
     */
    public CatalogueItemNotificationMessageType createCatalogueItemNotificationMessageType() {
        return new CatalogueItemNotificationMessageType();
    }

    /**
     * Create an instance of {@link CatalogueItemChildItemLinkType }
     * 
     */
    public CatalogueItemChildItemLinkType createCatalogueItemChildItemLinkType() {
        return new CatalogueItemChildItemLinkType();
    }

    /**
     * Create an instance of {@link CatalogueItemStateType }
     * 
     */
    public CatalogueItemStateType createCatalogueItemStateType() {
        return new CatalogueItemStateType();
    }

    /**
     * Create an instance of {@link CatalogueItemType }
     * 
     */
    public CatalogueItemType createCatalogueItemType() {
        return new CatalogueItemType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueItemNotificationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CatalogueItemNotificationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:catalogue_item_notification:xsd:3", name = "catalogueItemNotification", substitutionHeadNamespace = "urn:gs1:gdsn:gdsn_common:xsd:3", substitutionHeadName = "document")
    public JAXBElement<CatalogueItemNotificationType> createCatalogueItemNotification(CatalogueItemNotificationType value) {
        return new JAXBElement<CatalogueItemNotificationType>(_CatalogueItemNotification_QNAME, CatalogueItemNotificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueItemNotificationMessageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CatalogueItemNotificationMessageType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:catalogue_item_notification:xsd:3", name = "catalogueItemNotificationMessage")
    public JAXBElement<CatalogueItemNotificationMessageType> createCatalogueItemNotificationMessage(CatalogueItemNotificationMessageType value) {
        return new JAXBElement<CatalogueItemNotificationMessageType>(_CatalogueItemNotificationMessage_QNAME, CatalogueItemNotificationMessageType.class, null, value);
    }

}
