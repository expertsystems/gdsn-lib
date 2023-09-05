
package gs1.gdsn.lighting_device.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.lighting_device.xsd._3 package. 
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

    private final static QName _LightingDeviceModule_QNAME = new QName("urn:gs1:gdsn:lighting_device:xsd:3", "lightingDeviceModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.lighting_device.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LightingDeviceModuleType }
     * 
     */
    public LightingDeviceModuleType createLightingDeviceModuleType() {
        return new LightingDeviceModuleType();
    }

    /**
     * Create an instance of {@link LightBeamTypeCodeType }
     * 
     */
    public LightBeamTypeCodeType createLightBeamTypeCodeType() {
        return new LightBeamTypeCodeType();
    }

    /**
     * Create an instance of {@link LightBulbFilamentTypeCodeType }
     * 
     */
    public LightBulbFilamentTypeCodeType createLightBulbFilamentTypeCodeType() {
        return new LightBulbFilamentTypeCodeType();
    }

    /**
     * Create an instance of {@link LightBulbInformationType }
     * 
     */
    public LightBulbInformationType createLightBulbInformationType() {
        return new LightBulbInformationType();
    }

    /**
     * Create an instance of {@link LightBulbLampTypeCodeType }
     * 
     */
    public LightBulbLampTypeCodeType createLightBulbLampTypeCodeType() {
        return new LightBulbLampTypeCodeType();
    }

    /**
     * Create an instance of {@link LightBulbShapeCodeType }
     * 
     */
    public LightBulbShapeCodeType createLightBulbShapeCodeType() {
        return new LightBulbShapeCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LightingDeviceModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LightingDeviceModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:lighting_device:xsd:3", name = "lightingDeviceModule")
    public JAXBElement<LightingDeviceModuleType> createLightingDeviceModule(LightingDeviceModuleType value) {
        return new JAXBElement<LightingDeviceModuleType>(_LightingDeviceModule_QNAME, LightingDeviceModuleType.class, null, value);
    }

}
