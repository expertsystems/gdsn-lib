
package gs1.gdsn.audio_visual_media_product_description_information.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.audio_visual_media_product_description_information.xsd._3 package. 
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

    private final static QName _AudioVisualMediaProductDescriptionInformationModule_QNAME = new QName("urn:gs1:gdsn:audio_visual_media_product_description_information:xsd:3", "audioVisualMediaProductDescriptionInformationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.audio_visual_media_product_description_information.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AudioVisualMediaProductDescriptionInformationModuleType }
     * 
     */
    public AudioVisualMediaProductDescriptionInformationModuleType createAudioVisualMediaProductDescriptionInformationModuleType() {
        return new AudioVisualMediaProductDescriptionInformationModuleType();
    }

    /**
     * Create an instance of {@link AudioVisualMediaDateInformationType }
     * 
     */
    public AudioVisualMediaDateInformationType createAudioVisualMediaDateInformationType() {
        return new AudioVisualMediaDateInformationType();
    }

    /**
     * Create an instance of {@link AudioVisualMediaDateTypeCodeType }
     * 
     */
    public AudioVisualMediaDateTypeCodeType createAudioVisualMediaDateTypeCodeType() {
        return new AudioVisualMediaDateTypeCodeType();
    }

    /**
     * Create an instance of {@link AudioVisualMediaProductDescriptionType }
     * 
     */
    public AudioVisualMediaProductDescriptionType createAudioVisualMediaProductDescriptionType() {
        return new AudioVisualMediaProductDescriptionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudioVisualMediaProductDescriptionInformationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AudioVisualMediaProductDescriptionInformationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:audio_visual_media_product_description_information:xsd:3", name = "audioVisualMediaProductDescriptionInformationModule")
    public JAXBElement<AudioVisualMediaProductDescriptionInformationModuleType> createAudioVisualMediaProductDescriptionInformationModule(AudioVisualMediaProductDescriptionInformationModuleType value) {
        return new JAXBElement<AudioVisualMediaProductDescriptionInformationModuleType>(_AudioVisualMediaProductDescriptionInformationModule_QNAME, AudioVisualMediaProductDescriptionInformationModuleType.class, null, value);
    }

}
