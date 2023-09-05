
package gs1.gdsn.allergen_information.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.allergen_information.xsd._3 package. 
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

    private final static QName _AllergenInformationModule_QNAME = new QName("urn:gs1:gdsn:allergen_information:xsd:3", "allergenInformationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.allergen_information.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AllergenInformationModuleType }
     * 
     */
    public AllergenInformationModuleType createAllergenInformationModuleType() {
        return new AllergenInformationModuleType();
    }

    /**
     * Create an instance of {@link AllergenRelatedInformationType }
     * 
     */
    public AllergenRelatedInformationType createAllergenRelatedInformationType() {
        return new AllergenRelatedInformationType();
    }

    /**
     * Create an instance of {@link AllergenType }
     * 
     */
    public AllergenType createAllergenType() {
        return new AllergenType();
    }

    /**
     * Create an instance of {@link AllergenTypeCodeType }
     * 
     */
    public AllergenTypeCodeType createAllergenTypeCodeType() {
        return new AllergenTypeCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllergenInformationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AllergenInformationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:allergen_information:xsd:3", name = "allergenInformationModule")
    public JAXBElement<AllergenInformationModuleType> createAllergenInformationModule(AllergenInformationModuleType value) {
        return new JAXBElement<AllergenInformationModuleType>(_AllergenInformationModule_QNAME, AllergenInformationModuleType.class, null, value);
    }

}
