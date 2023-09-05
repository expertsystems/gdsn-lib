
package gs1.gdsn.copyright_information.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.copyright_information.xsd._3 package. 
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

    private final static QName _CopyrightInformationModule_QNAME = new QName("urn:gs1:gdsn:copyright_information:xsd:3", "copyrightInformationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.copyright_information.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CopyrightInformationModuleType }
     * 
     */
    public CopyrightInformationModuleType createCopyrightInformationModuleType() {
        return new CopyrightInformationModuleType();
    }

    /**
     * Create an instance of {@link CopyrightInformationType }
     * 
     */
    public CopyrightInformationType createCopyrightInformationType() {
        return new CopyrightInformationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyrightInformationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CopyrightInformationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:copyright_information:xsd:3", name = "copyrightInformationModule")
    public JAXBElement<CopyrightInformationModuleType> createCopyrightInformationModule(CopyrightInformationModuleType value) {
        return new JAXBElement<CopyrightInformationModuleType>(_CopyrightInformationModule_QNAME, CopyrightInformationModuleType.class, null, value);
    }

}
