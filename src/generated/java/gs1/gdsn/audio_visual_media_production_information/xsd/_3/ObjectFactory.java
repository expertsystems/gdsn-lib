
package gs1.gdsn.audio_visual_media_production_information.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.audio_visual_media_production_information.xsd._3 package. 
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

    private final static QName _AudioVisualMediaProductionInformationModule_QNAME = new QName("urn:gs1:gdsn:audio_visual_media_production_information:xsd:3", "audioVisualMediaProductionInformationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.audio_visual_media_production_information.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AudioVisualMediaProductionInformationModuleType }
     * 
     */
    public AudioVisualMediaProductionInformationModuleType createAudioVisualMediaProductionInformationModuleType() {
        return new AudioVisualMediaProductionInformationModuleType();
    }

    /**
     * Create an instance of {@link AudioSoundTypeCodeType }
     * 
     */
    public AudioSoundTypeCodeType createAudioSoundTypeCodeType() {
        return new AudioSoundTypeCodeType();
    }

    /**
     * Create an instance of {@link AudioVisualMediaProductionInformationType }
     * 
     */
    public AudioVisualMediaProductionInformationType createAudioVisualMediaProductionInformationType() {
        return new AudioVisualMediaProductionInformationType();
    }

    /**
     * Create an instance of {@link DigitalisationLevelTypeCodeType }
     * 
     */
    public DigitalisationLevelTypeCodeType createDigitalisationLevelTypeCodeType() {
        return new DigitalisationLevelTypeCodeType();
    }

    /**
     * Create an instance of {@link VisualMediaColourCodeType }
     * 
     */
    public VisualMediaColourCodeType createVisualMediaColourCodeType() {
        return new VisualMediaColourCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudioVisualMediaProductionInformationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AudioVisualMediaProductionInformationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:audio_visual_media_production_information:xsd:3", name = "audioVisualMediaProductionInformationModule")
    public JAXBElement<AudioVisualMediaProductionInformationModuleType> createAudioVisualMediaProductionInformationModule(AudioVisualMediaProductionInformationModuleType value) {
        return new JAXBElement<AudioVisualMediaProductionInformationModuleType>(_AudioVisualMediaProductionInformationModule_QNAME, AudioVisualMediaProductionInformationModuleType.class, null, value);
    }

}
