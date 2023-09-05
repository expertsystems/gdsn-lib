
package gs1.gdsn.optics_device_information.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.optics_device_information.xsd._3 package. 
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

    private final static QName _OpticsDeviceInformationModule_QNAME = new QName("urn:gs1:gdsn:optics_device_information:xsd:3", "opticsDeviceInformationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.optics_device_information.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OpticsDeviceInformationModuleType }
     * 
     */
    public OpticsDeviceInformationModuleType createOpticsDeviceInformationModuleType() {
        return new OpticsDeviceInformationModuleType();
    }

    /**
     * Create an instance of {@link LensInformationType }
     * 
     */
    public LensInformationType createLensInformationType() {
        return new LensInformationType();
    }

    /**
     * Create an instance of {@link OpticsDeviceInformationType }
     * 
     */
    public OpticsDeviceInformationType createOpticsDeviceInformationType() {
        return new OpticsDeviceInformationType();
    }

    /**
     * Create an instance of {@link ZoomInformationType }
     * 
     */
    public ZoomInformationType createZoomInformationType() {
        return new ZoomInformationType();
    }

    /**
     * Create an instance of {@link ZoomTypeCodeType }
     * 
     */
    public ZoomTypeCodeType createZoomTypeCodeType() {
        return new ZoomTypeCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpticsDeviceInformationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OpticsDeviceInformationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:optics_device_information:xsd:3", name = "opticsDeviceInformationModule")
    public JAXBElement<OpticsDeviceInformationModuleType> createOpticsDeviceInformationModule(OpticsDeviceInformationModuleType value) {
        return new JAXBElement<OpticsDeviceInformationModuleType>(_OpticsDeviceInformationModule_QNAME, OpticsDeviceInformationModuleType.class, null, value);
    }

}
