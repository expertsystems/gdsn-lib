
package gs1.gdsn.registry_catalogue_item.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.registry_catalogue_item.xsd._3 package. 
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

    private final static QName _RegistryCatalogueItem_QNAME = new QName("urn:gs1:gdsn:registry_catalogue_item:xsd:3", "registryCatalogueItem");
    private final static QName _RegistryCatalogueItemMessage_QNAME = new QName("urn:gs1:gdsn:registry_catalogue_item:xsd:3", "registryCatalogueItemMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.registry_catalogue_item.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistryCatalogueItemType }
     * 
     */
    public RegistryCatalogueItemType createRegistryCatalogueItemType() {
        return new RegistryCatalogueItemType();
    }

    /**
     * Create an instance of {@link RegistryCatalogueItemMessageType }
     * 
     */
    public RegistryCatalogueItemMessageType createRegistryCatalogueItemMessageType() {
        return new RegistryCatalogueItemMessageType();
    }

    /**
     * Create an instance of {@link CatalogueItemDatesType }
     * 
     */
    public CatalogueItemDatesType createCatalogueItemDatesType() {
        return new CatalogueItemDatesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistryCatalogueItemType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistryCatalogueItemType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:registry_catalogue_item:xsd:3", name = "registryCatalogueItem", substitutionHeadNamespace = "urn:gs1:gdsn:gdsn_common:xsd:3", substitutionHeadName = "document")
    public JAXBElement<RegistryCatalogueItemType> createRegistryCatalogueItem(RegistryCatalogueItemType value) {
        return new JAXBElement<RegistryCatalogueItemType>(_RegistryCatalogueItem_QNAME, RegistryCatalogueItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistryCatalogueItemMessageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistryCatalogueItemMessageType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:registry_catalogue_item:xsd:3", name = "registryCatalogueItemMessage")
    public JAXBElement<RegistryCatalogueItemMessageType> createRegistryCatalogueItemMessage(RegistryCatalogueItemMessageType value) {
        return new JAXBElement<RegistryCatalogueItemMessageType>(_RegistryCatalogueItemMessage_QNAME, RegistryCatalogueItemMessageType.class, null, value);
    }

}
