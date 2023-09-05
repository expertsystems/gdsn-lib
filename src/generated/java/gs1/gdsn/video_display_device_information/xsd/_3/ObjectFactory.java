
package gs1.gdsn.video_display_device_information.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.video_display_device_information.xsd._3 package. 
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

    private final static QName _VideoDisplayDeviceInformationModule_QNAME = new QName("urn:gs1:gdsn:video_display_device_information:xsd:3", "videoDisplayDeviceInformationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.video_display_device_information.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VideoDisplayDeviceInformationModuleType }
     * 
     */
    public VideoDisplayDeviceInformationModuleType createVideoDisplayDeviceInformationModuleType() {
        return new VideoDisplayDeviceInformationModuleType();
    }

    /**
     * Create an instance of {@link AudioVisualItemInstallationTypeCodeType }
     * 
     */
    public AudioVisualItemInstallationTypeCodeType createAudioVisualItemInstallationTypeCodeType() {
        return new AudioVisualItemInstallationTypeCodeType();
    }

    /**
     * Create an instance of {@link CombFilterTechnologyTypeCodeType }
     * 
     */
    public CombFilterTechnologyTypeCodeType createCombFilterTechnologyTypeCodeType() {
        return new CombFilterTechnologyTypeCodeType();
    }

    /**
     * Create an instance of {@link DisplayResolutionCodeType }
     * 
     */
    public DisplayResolutionCodeType createDisplayResolutionCodeType() {
        return new DisplayResolutionCodeType();
    }

    /**
     * Create an instance of {@link DisplayScreenInformationType }
     * 
     */
    public DisplayScreenInformationType createDisplayScreenInformationType() {
        return new DisplayScreenInformationType();
    }

    /**
     * Create an instance of {@link DisplayScreenTypeCodeType }
     * 
     */
    public DisplayScreenTypeCodeType createDisplayScreenTypeCodeType() {
        return new DisplayScreenTypeCodeType();
    }

    /**
     * Create an instance of {@link MultiPictureDisplayCapabilityTypeCodeType }
     * 
     */
    public MultiPictureDisplayCapabilityTypeCodeType createMultiPictureDisplayCapabilityTypeCodeType() {
        return new MultiPictureDisplayCapabilityTypeCodeType();
    }

    /**
     * Create an instance of {@link TelevisionInformationServiceInformationType }
     * 
     */
    public TelevisionInformationServiceInformationType createTelevisionInformationServiceInformationType() {
        return new TelevisionInformationServiceInformationType();
    }

    /**
     * Create an instance of {@link TelevisionInformationServiceTypeCodeType }
     * 
     */
    public TelevisionInformationServiceTypeCodeType createTelevisionInformationServiceTypeCodeType() {
        return new TelevisionInformationServiceTypeCodeType();
    }

    /**
     * Create an instance of {@link VESAWallMountTypeCodeType }
     * 
     */
    public VESAWallMountTypeCodeType createVESAWallMountTypeCodeType() {
        return new VESAWallMountTypeCodeType();
    }

    /**
     * Create an instance of {@link VideoDisplayDeviceInformationType }
     * 
     */
    public VideoDisplayDeviceInformationType createVideoDisplayDeviceInformationType() {
        return new VideoDisplayDeviceInformationType();
    }

    /**
     * Create an instance of {@link VideoDisplayDeviceInstallationInformationType }
     * 
     */
    public VideoDisplayDeviceInstallationInformationType createVideoDisplayDeviceInstallationInformationType() {
        return new VideoDisplayDeviceInstallationInformationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoDisplayDeviceInformationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VideoDisplayDeviceInformationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:video_display_device_information:xsd:3", name = "videoDisplayDeviceInformationModule")
    public JAXBElement<VideoDisplayDeviceInformationModuleType> createVideoDisplayDeviceInformationModule(VideoDisplayDeviceInformationModuleType value) {
        return new JAXBElement<VideoDisplayDeviceInformationModuleType>(_VideoDisplayDeviceInformationModule_QNAME, VideoDisplayDeviceInformationModuleType.class, null, value);
    }

}
