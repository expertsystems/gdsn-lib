
package gs1.gdsn.software_system_requirements.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.software_system_requirements.xsd._3 package. 
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

    private final static QName _SoftwareSystemRequirementsModule_QNAME = new QName("urn:gs1:gdsn:software_system_requirements:xsd:3", "softwareSystemRequirementsModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.software_system_requirements.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SoftwareSystemRequirementsModuleType }
     * 
     */
    public SoftwareSystemRequirementsModuleType createSoftwareSystemRequirementsModuleType() {
        return new SoftwareSystemRequirementsModuleType();
    }

    /**
     * Create an instance of {@link SoftwareSystemRequirementsType }
     * 
     */
    public SoftwareSystemRequirementsType createSoftwareSystemRequirementsType() {
        return new SoftwareSystemRequirementsType();
    }

    /**
     * Create an instance of {@link SystemRequirementsQualifierTypeCodeType }
     * 
     */
    public SystemRequirementsQualifierTypeCodeType createSystemRequirementsQualifierTypeCodeType() {
        return new SystemRequirementsQualifierTypeCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoftwareSystemRequirementsModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoftwareSystemRequirementsModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:software_system_requirements:xsd:3", name = "softwareSystemRequirementsModule")
    public JAXBElement<SoftwareSystemRequirementsModuleType> createSoftwareSystemRequirementsModule(SoftwareSystemRequirementsModuleType value) {
        return new JAXBElement<SoftwareSystemRequirementsModuleType>(_SoftwareSystemRequirementsModule_QNAME, SoftwareSystemRequirementsModuleType.class, null, value);
    }

}
