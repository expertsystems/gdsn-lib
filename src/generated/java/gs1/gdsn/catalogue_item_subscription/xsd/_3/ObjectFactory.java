
package gs1.gdsn.catalogue_item_subscription.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.catalogue_item_subscription.xsd._3 package. 
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

    private final static QName _CatalogueItemSubscription_QNAME = new QName("urn:gs1:gdsn:catalogue_item_subscription:xsd:3", "catalogueItemSubscription");
    private final static QName _CatalogueItemSubscriptionMessage_QNAME = new QName("urn:gs1:gdsn:catalogue_item_subscription:xsd:3", "catalogueItemSubscriptionMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.catalogue_item_subscription.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CatalogueItemSubscriptionType }
     * 
     */
    public CatalogueItemSubscriptionType createCatalogueItemSubscriptionType() {
        return new CatalogueItemSubscriptionType();
    }

    /**
     * Create an instance of {@link CatalogueItemSubscriptionMessageType }
     * 
     */
    public CatalogueItemSubscriptionMessageType createCatalogueItemSubscriptionMessageType() {
        return new CatalogueItemSubscriptionMessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueItemSubscriptionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CatalogueItemSubscriptionType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:catalogue_item_subscription:xsd:3", name = "catalogueItemSubscription", substitutionHeadNamespace = "urn:gs1:gdsn:gdsn_common:xsd:3", substitutionHeadName = "document")
    public JAXBElement<CatalogueItemSubscriptionType> createCatalogueItemSubscription(CatalogueItemSubscriptionType value) {
        return new JAXBElement<CatalogueItemSubscriptionType>(_CatalogueItemSubscription_QNAME, CatalogueItemSubscriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueItemSubscriptionMessageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CatalogueItemSubscriptionMessageType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:catalogue_item_subscription:xsd:3", name = "catalogueItemSubscriptionMessage")
    public JAXBElement<CatalogueItemSubscriptionMessageType> createCatalogueItemSubscriptionMessage(CatalogueItemSubscriptionMessageType value) {
        return new JAXBElement<CatalogueItemSubscriptionMessageType>(_CatalogueItemSubscriptionMessage_QNAME, CatalogueItemSubscriptionMessageType.class, null, value);
    }

}
