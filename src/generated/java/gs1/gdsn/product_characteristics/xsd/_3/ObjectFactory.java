
package gs1.gdsn.product_characteristics.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.product_characteristics.xsd._3 package. 
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

    private final static QName _ProductCharacteristicsModule_QNAME = new QName("urn:gs1:gdsn:product_characteristics:xsd:3", "productCharacteristicsModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.product_characteristics.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductCharacteristicsModuleType }
     * 
     */
    public ProductCharacteristicsModuleType createProductCharacteristicsModuleType() {
        return new ProductCharacteristicsModuleType();
    }

    /**
     * Create an instance of {@link ProductCharacteristicCodeType }
     * 
     */
    public ProductCharacteristicCodeType createProductCharacteristicCodeType() {
        return new ProductCharacteristicCodeType();
    }

    /**
     * Create an instance of {@link ProductCharacteristicsType }
     * 
     */
    public ProductCharacteristicsType createProductCharacteristicsType() {
        return new ProductCharacteristicsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCharacteristicsModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductCharacteristicsModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:product_characteristics:xsd:3", name = "productCharacteristicsModule")
    public JAXBElement<ProductCharacteristicsModuleType> createProductCharacteristicsModule(ProductCharacteristicsModuleType value) {
        return new JAXBElement<ProductCharacteristicsModuleType>(_ProductCharacteristicsModule_QNAME, ProductCharacteristicsModuleType.class, null, value);
    }

}
