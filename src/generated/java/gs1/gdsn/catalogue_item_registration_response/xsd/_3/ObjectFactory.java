
package gs1.gdsn.catalogue_item_registration_response.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.catalogue_item_registration_response.xsd._3 package. 
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

    private final static QName _CatalogueItemRegistrationResponse_QNAME = new QName("urn:gs1:gdsn:catalogue_item_registration_response:xsd:3", "catalogueItemRegistrationResponse");
    private final static QName _CatalogueItemRegistrationResponseMessage_QNAME = new QName("urn:gs1:gdsn:catalogue_item_registration_response:xsd:3", "catalogueItemRegistrationResponseMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.catalogue_item_registration_response.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CatalogueItemRegistrationResponseType }
     * 
     */
    public CatalogueItemRegistrationResponseType createCatalogueItemRegistrationResponseType() {
        return new CatalogueItemRegistrationResponseType();
    }

    /**
     * Create an instance of {@link CatalogueItemRegistrationResponseMessageType }
     * 
     */
    public CatalogueItemRegistrationResponseMessageType createCatalogueItemRegistrationResponseMessageType() {
        return new CatalogueItemRegistrationResponseMessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueItemRegistrationResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CatalogueItemRegistrationResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:catalogue_item_registration_response:xsd:3", name = "catalogueItemRegistrationResponse", substitutionHeadNamespace = "urn:gs1:gdsn:gdsn_common:xsd:3", substitutionHeadName = "document")
    public JAXBElement<CatalogueItemRegistrationResponseType> createCatalogueItemRegistrationResponse(CatalogueItemRegistrationResponseType value) {
        return new JAXBElement<CatalogueItemRegistrationResponseType>(_CatalogueItemRegistrationResponse_QNAME, CatalogueItemRegistrationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueItemRegistrationResponseMessageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CatalogueItemRegistrationResponseMessageType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:catalogue_item_registration_response:xsd:3", name = "catalogueItemRegistrationResponseMessage")
    public JAXBElement<CatalogueItemRegistrationResponseMessageType> createCatalogueItemRegistrationResponseMessage(CatalogueItemRegistrationResponseMessageType value) {
        return new JAXBElement<CatalogueItemRegistrationResponseMessageType>(_CatalogueItemRegistrationResponseMessage_QNAME, CatalogueItemRegistrationResponseMessageType.class, null, value);
    }

}
