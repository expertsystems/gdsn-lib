
package gs1.gdsn.publication_title_rating.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.publication_title_rating.xsd._3 package. 
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

    private final static QName _PublicationTitleRatingModule_QNAME = new QName("urn:gs1:gdsn:publication_title_rating:xsd:3", "publicationTitleRatingModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.publication_title_rating.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PublicationTitleRatingModuleType }
     * 
     */
    public PublicationTitleRatingModuleType createPublicationTitleRatingModuleType() {
        return new PublicationTitleRatingModuleType();
    }

    /**
     * Create an instance of {@link PublicationTitleRatingType }
     * 
     */
    public PublicationTitleRatingType createPublicationTitleRatingType() {
        return new PublicationTitleRatingType();
    }

    /**
     * Create an instance of {@link RatingContentDescriptorCodeType }
     * 
     */
    public RatingContentDescriptorCodeType createRatingContentDescriptorCodeType() {
        return new RatingContentDescriptorCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublicationTitleRatingModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PublicationTitleRatingModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:publication_title_rating:xsd:3", name = "publicationTitleRatingModule")
    public JAXBElement<PublicationTitleRatingModuleType> createPublicationTitleRatingModule(PublicationTitleRatingModuleType value) {
        return new JAXBElement<PublicationTitleRatingModuleType>(_PublicationTitleRatingModule_QNAME, PublicationTitleRatingModuleType.class, null, value);
    }

}
