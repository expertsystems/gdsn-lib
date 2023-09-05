
package gs1.gdsn.catalogue_item_hierarchical_withdrawal.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.catalogue_item_hierarchical_withdrawal.xsd._3 package. 
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

    private final static QName _CatalogueItemHierarchicalWithdrawal_QNAME = new QName("urn:gs1:gdsn:catalogue_item_hierarchical_withdrawal:xsd:3", "catalogueItemHierarchicalWithdrawal");
    private final static QName _CatalogueItemHierarchicalWithdrawalMessage_QNAME = new QName("urn:gs1:gdsn:catalogue_item_hierarchical_withdrawal:xsd:3", "catalogueItemHierarchicalWithdrawalMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.catalogue_item_hierarchical_withdrawal.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CatalogueItemHierarchicalWithdrawalType }
     * 
     */
    public CatalogueItemHierarchicalWithdrawalType createCatalogueItemHierarchicalWithdrawalType() {
        return new CatalogueItemHierarchicalWithdrawalType();
    }

    /**
     * Create an instance of {@link CatalogueItemHierarchicalWithdrawalMessageType }
     * 
     */
    public CatalogueItemHierarchicalWithdrawalMessageType createCatalogueItemHierarchicalWithdrawalMessageType() {
        return new CatalogueItemHierarchicalWithdrawalMessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueItemHierarchicalWithdrawalType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CatalogueItemHierarchicalWithdrawalType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:catalogue_item_hierarchical_withdrawal:xsd:3", name = "catalogueItemHierarchicalWithdrawal", substitutionHeadNamespace = "urn:gs1:gdsn:gdsn_common:xsd:3", substitutionHeadName = "document")
    public JAXBElement<CatalogueItemHierarchicalWithdrawalType> createCatalogueItemHierarchicalWithdrawal(CatalogueItemHierarchicalWithdrawalType value) {
        return new JAXBElement<CatalogueItemHierarchicalWithdrawalType>(_CatalogueItemHierarchicalWithdrawal_QNAME, CatalogueItemHierarchicalWithdrawalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueItemHierarchicalWithdrawalMessageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CatalogueItemHierarchicalWithdrawalMessageType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:catalogue_item_hierarchical_withdrawal:xsd:3", name = "catalogueItemHierarchicalWithdrawalMessage")
    public JAXBElement<CatalogueItemHierarchicalWithdrawalMessageType> createCatalogueItemHierarchicalWithdrawalMessage(CatalogueItemHierarchicalWithdrawalMessageType value) {
        return new JAXBElement<CatalogueItemHierarchicalWithdrawalMessageType>(_CatalogueItemHierarchicalWithdrawalMessage_QNAME, CatalogueItemHierarchicalWithdrawalMessageType.class, null, value);
    }

}
