
package gs1.gdsn.catalogue_item_publication.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.catalogue_item_publication.xsd._3 package. 
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

    private final static QName _CatalogueItemPublication_QNAME = new QName("urn:gs1:gdsn:catalogue_item_publication:xsd:3", "catalogueItemPublication");
    private final static QName _CatalogueItemPublicationMessage_QNAME = new QName("urn:gs1:gdsn:catalogue_item_publication:xsd:3", "catalogueItemPublicationMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.catalogue_item_publication.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CatalogueItemPublicationType }
     * 
     */
    public CatalogueItemPublicationType createCatalogueItemPublicationType() {
        return new CatalogueItemPublicationType();
    }

    /**
     * Create an instance of {@link CatalogueItemPublicationMessageType }
     * 
     */
    public CatalogueItemPublicationMessageType createCatalogueItemPublicationMessageType() {
        return new CatalogueItemPublicationMessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueItemPublicationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CatalogueItemPublicationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:catalogue_item_publication:xsd:3", name = "catalogueItemPublication", substitutionHeadNamespace = "urn:gs1:gdsn:gdsn_common:xsd:3", substitutionHeadName = "document")
    public JAXBElement<CatalogueItemPublicationType> createCatalogueItemPublication(CatalogueItemPublicationType value) {
        return new JAXBElement<CatalogueItemPublicationType>(_CatalogueItemPublication_QNAME, CatalogueItemPublicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueItemPublicationMessageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CatalogueItemPublicationMessageType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:catalogue_item_publication:xsd:3", name = "catalogueItemPublicationMessage")
    public JAXBElement<CatalogueItemPublicationMessageType> createCatalogueItemPublicationMessage(CatalogueItemPublicationMessageType value) {
        return new JAXBElement<CatalogueItemPublicationMessageType>(_CatalogueItemPublicationMessage_QNAME, CatalogueItemPublicationMessageType.class, null, value);
    }

}
