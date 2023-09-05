
package gs1.gdsn.diet_information.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.diet_information.xsd._3 package. 
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

    private final static QName _DietInformationModule_QNAME = new QName("urn:gs1:gdsn:diet_information:xsd:3", "dietInformationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.diet_information.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DietInformationModuleType }
     * 
     */
    public DietInformationModuleType createDietInformationModuleType() {
        return new DietInformationModuleType();
    }

    /**
     * Create an instance of {@link DietInformationType }
     * 
     */
    public DietInformationType createDietInformationType() {
        return new DietInformationType();
    }

    /**
     * Create an instance of {@link DietTypeCodeType }
     * 
     */
    public DietTypeCodeType createDietTypeCodeType() {
        return new DietTypeCodeType();
    }

    /**
     * Create an instance of {@link DietTypeInformationType }
     * 
     */
    public DietTypeInformationType createDietTypeInformationType() {
        return new DietTypeInformationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DietInformationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DietInformationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:diet_information:xsd:3", name = "dietInformationModule")
    public JAXBElement<DietInformationModuleType> createDietInformationModule(DietInformationModuleType value) {
        return new JAXBElement<DietInformationModuleType>(_DietInformationModule_QNAME, DietInformationModuleType.class, null, value);
    }

}
