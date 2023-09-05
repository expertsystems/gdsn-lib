
package gs1.gdsn.security_tag_information.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.security_tag_information.xsd._3 package. 
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

    private final static QName _SecurityTagInformationModule_QNAME = new QName("urn:gs1:gdsn:security_tag_information:xsd:3", "securityTagInformationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.security_tag_information.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SecurityTagInformationModuleType }
     * 
     */
    public SecurityTagInformationModuleType createSecurityTagInformationModuleType() {
        return new SecurityTagInformationModuleType();
    }

    /**
     * Create an instance of {@link SecurityTagInformationType }
     * 
     */
    public SecurityTagInformationType createSecurityTagInformationType() {
        return new SecurityTagInformationType();
    }

    /**
     * Create an instance of {@link SecurityTagLocationCodeType }
     * 
     */
    public SecurityTagLocationCodeType createSecurityTagLocationCodeType() {
        return new SecurityTagLocationCodeType();
    }

    /**
     * Create an instance of {@link SecurityTagTypeCodeType }
     * 
     */
    public SecurityTagTypeCodeType createSecurityTagTypeCodeType() {
        return new SecurityTagTypeCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityTagInformationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SecurityTagInformationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:security_tag_information:xsd:3", name = "securityTagInformationModule")
    public JAXBElement<SecurityTagInformationModuleType> createSecurityTagInformationModule(SecurityTagInformationModuleType value) {
        return new JAXBElement<SecurityTagInformationModuleType>(_SecurityTagInformationModule_QNAME, SecurityTagInformationModuleType.class, null, value);
    }

}
