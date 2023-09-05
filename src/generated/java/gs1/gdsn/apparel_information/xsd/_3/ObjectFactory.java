
package gs1.gdsn.apparel_information.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.apparel_information.xsd._3 package. 
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

    private final static QName _ApparelInformationModule_QNAME = new QName("urn:gs1:gdsn:apparel_information:xsd:3", "apparelInformationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.apparel_information.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ApparelInformationModuleType }
     * 
     */
    public ApparelInformationModuleType createApparelInformationModuleType() {
        return new ApparelInformationModuleType();
    }

    /**
     * Create an instance of {@link ApparelInformationType }
     * 
     */
    public ApparelInformationType createApparelInformationType() {
        return new ApparelInformationType();
    }

    /**
     * Create an instance of {@link ClosureFastenerInformationType }
     * 
     */
    public ClosureFastenerInformationType createClosureFastenerInformationType() {
        return new ClosureFastenerInformationType();
    }

    /**
     * Create an instance of {@link ClosureOrFastenerTypeCodeType }
     * 
     */
    public ClosureOrFastenerTypeCodeType createClosureOrFastenerTypeCodeType() {
        return new ClosureOrFastenerTypeCodeType();
    }

    /**
     * Create an instance of {@link ClothingInformationType }
     * 
     */
    public ClothingInformationType createClothingInformationType() {
        return new ClothingInformationType();
    }

    /**
     * Create an instance of {@link HangerInformationType }
     * 
     */
    public HangerInformationType createHangerInformationType() {
        return new HangerInformationType();
    }

    /**
     * Create an instance of {@link HangerStandardAgencyCodeType }
     * 
     */
    public HangerStandardAgencyCodeType createHangerStandardAgencyCodeType() {
        return new HangerStandardAgencyCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApparelInformationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ApparelInformationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:apparel_information:xsd:3", name = "apparelInformationModule")
    public JAXBElement<ApparelInformationModuleType> createApparelInformationModule(ApparelInformationModuleType value) {
        return new JAXBElement<ApparelInformationModuleType>(_ApparelInformationModule_QNAME, ApparelInformationModuleType.class, null, value);
    }

}
