
package gs1.gdsn.audio_visual_media_content_information.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.audio_visual_media_content_information.xsd._3 package. 
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

    private final static QName _AudioVisualMediaContentInformationModule_QNAME = new QName("urn:gs1:gdsn:audio_visual_media_content_information:xsd:3", "audioVisualMediaContentInformationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.audio_visual_media_content_information.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AudioVisualMediaContentInformationModuleType }
     * 
     */
    public AudioVisualMediaContentInformationModuleType createAudioVisualMediaContentInformationModuleType() {
        return new AudioVisualMediaContentInformationModuleType();
    }

    /**
     * Create an instance of {@link AudioVisualMediaContentInformationType }
     * 
     */
    public AudioVisualMediaContentInformationType createAudioVisualMediaContentInformationType() {
        return new AudioVisualMediaContentInformationType();
    }

    /**
     * Create an instance of {@link AudioVisualMediaContributorType }
     * 
     */
    public AudioVisualMediaContributorType createAudioVisualMediaContributorType() {
        return new AudioVisualMediaContributorType();
    }

    /**
     * Create an instance of {@link AudioVisualMediaContributorTypeCodeType }
     * 
     */
    public AudioVisualMediaContributorTypeCodeType createAudioVisualMediaContributorTypeCodeType() {
        return new AudioVisualMediaContributorTypeCodeType();
    }

    /**
     * Create an instance of {@link AudioVisualMediaLanguageInformationType }
     * 
     */
    public AudioVisualMediaLanguageInformationType createAudioVisualMediaLanguageInformationType() {
        return new AudioVisualMediaLanguageInformationType();
    }

    /**
     * Create an instance of {@link ClosedCaptioningCodeType }
     * 
     */
    public ClosedCaptioningCodeType createClosedCaptioningCodeType() {
        return new ClosedCaptioningCodeType();
    }

    /**
     * Create an instance of {@link DistributionMediaContentInformationType }
     * 
     */
    public DistributionMediaContentInformationType createDistributionMediaContentInformationType() {
        return new DistributionMediaContentInformationType();
    }

    /**
     * Create an instance of {@link DistributionMediaTrackInformationType }
     * 
     */
    public DistributionMediaTrackInformationType createDistributionMediaTrackInformationType() {
        return new DistributionMediaTrackInformationType();
    }

    /**
     * Create an instance of {@link DistributionMediaTypeCodeType }
     * 
     */
    public DistributionMediaTypeCodeType createDistributionMediaTypeCodeType() {
        return new DistributionMediaTypeCodeType();
    }

    /**
     * Create an instance of {@link DubbedSubtitledCodeType }
     * 
     */
    public DubbedSubtitledCodeType createDubbedSubtitledCodeType() {
        return new DubbedSubtitledCodeType();
    }

    /**
     * Create an instance of {@link DubbedSubtitledInformationType }
     * 
     */
    public DubbedSubtitledInformationType createDubbedSubtitledInformationType() {
        return new DubbedSubtitledInformationType();
    }

    /**
     * Create an instance of {@link DVDRegionCodeType }
     * 
     */
    public DVDRegionCodeType createDVDRegionCodeType() {
        return new DVDRegionCodeType();
    }

    /**
     * Create an instance of {@link GameFormatCodeType }
     * 
     */
    public GameFormatCodeType createGameFormatCodeType() {
        return new GameFormatCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudioVisualMediaContentInformationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AudioVisualMediaContentInformationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:audio_visual_media_content_information:xsd:3", name = "audioVisualMediaContentInformationModule")
    public JAXBElement<AudioVisualMediaContentInformationModuleType> createAudioVisualMediaContentInformationModule(AudioVisualMediaContentInformationModuleType value) {
        return new JAXBElement<AudioVisualMediaContentInformationModuleType>(_AudioVisualMediaContentInformationModule_QNAME, AudioVisualMediaContentInformationModuleType.class, null, value);
    }

}
