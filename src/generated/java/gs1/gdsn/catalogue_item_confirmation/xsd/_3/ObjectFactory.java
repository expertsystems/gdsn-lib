
package gs1.gdsn.catalogue_item_confirmation.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.catalogue_item_confirmation.xsd._3 package. 
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

    private final static QName _CatalogueItemConfirmation_QNAME = new QName("urn:gs1:gdsn:catalogue_item_confirmation:xsd:3", "catalogueItemConfirmation");
    private final static QName _CatalogueItemConfirmationMessage_QNAME = new QName("urn:gs1:gdsn:catalogue_item_confirmation:xsd:3", "catalogueItemConfirmationMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.catalogue_item_confirmation.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CatalogueItemConfirmationType }
     * 
     */
    public CatalogueItemConfirmationType createCatalogueItemConfirmationType() {
        return new CatalogueItemConfirmationType();
    }

    /**
     * Create an instance of {@link CatalogueItemConfirmationMessageType }
     * 
     */
    public CatalogueItemConfirmationMessageType createCatalogueItemConfirmationMessageType() {
        return new CatalogueItemConfirmationMessageType();
    }

    /**
     * Create an instance of {@link CatalogueItemConfirmationStateType }
     * 
     */
    public CatalogueItemConfirmationStateType createCatalogueItemConfirmationStateType() {
        return new CatalogueItemConfirmationStateType();
    }

    /**
     * Create an instance of {@link CatalogueItemConfirmationStatusDetailType }
     * 
     */
    public CatalogueItemConfirmationStatusDetailType createCatalogueItemConfirmationStatusDetailType() {
        return new CatalogueItemConfirmationStatusDetailType();
    }

    /**
     * Create an instance of {@link CatalogueItemConfirmationStatusType }
     * 
     */
    public CatalogueItemConfirmationStatusType createCatalogueItemConfirmationStatusType() {
        return new CatalogueItemConfirmationStatusType();
    }

    /**
     * Create an instance of {@link CorrectiveActionType }
     * 
     */
    public CorrectiveActionType createCorrectiveActionType() {
        return new CorrectiveActionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueItemConfirmationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CatalogueItemConfirmationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:catalogue_item_confirmation:xsd:3", name = "catalogueItemConfirmation", substitutionHeadNamespace = "urn:gs1:gdsn:gdsn_common:xsd:3", substitutionHeadName = "document")
    public JAXBElement<CatalogueItemConfirmationType> createCatalogueItemConfirmation(CatalogueItemConfirmationType value) {
        return new JAXBElement<CatalogueItemConfirmationType>(_CatalogueItemConfirmation_QNAME, CatalogueItemConfirmationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueItemConfirmationMessageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CatalogueItemConfirmationMessageType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:catalogue_item_confirmation:xsd:3", name = "catalogueItemConfirmationMessage")
    public JAXBElement<CatalogueItemConfirmationMessageType> createCatalogueItemConfirmationMessage(CatalogueItemConfirmationMessageType value) {
        return new JAXBElement<CatalogueItemConfirmationMessageType>(_CatalogueItemConfirmationMessage_QNAME, CatalogueItemConfirmationMessageType.class, null, value);
    }

}
