
package gs1.gdsn.controlled_substance.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.controlled_substance.xsd._3 package. 
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

    private final static QName _ControlledSubstanceModule_QNAME = new QName("urn:gs1:gdsn:controlled_substance:xsd:3", "controlledSubstanceModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.controlled_substance.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ControlledSubstanceModuleType }
     * 
     */
    public ControlledSubstanceModuleType createControlledSubstanceModuleType() {
        return new ControlledSubstanceModuleType();
    }

    /**
     * Create an instance of {@link ControlledSubstanceInformationType }
     * 
     */
    public ControlledSubstanceInformationType createControlledSubstanceInformationType() {
        return new ControlledSubstanceInformationType();
    }

    /**
     * Create an instance of {@link ControlledSubstanceType }
     * 
     */
    public ControlledSubstanceType createControlledSubstanceType() {
        return new ControlledSubstanceType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlledSubstanceModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ControlledSubstanceModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:controlled_substance:xsd:3", name = "controlledSubstanceModule")
    public JAXBElement<ControlledSubstanceModuleType> createControlledSubstanceModule(ControlledSubstanceModuleType value) {
        return new JAXBElement<ControlledSubstanceModuleType>(_ControlledSubstanceModule_QNAME, ControlledSubstanceModuleType.class, null, value);
    }

}
