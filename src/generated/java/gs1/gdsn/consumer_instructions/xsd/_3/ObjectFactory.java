
package gs1.gdsn.consumer_instructions.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.consumer_instructions.xsd._3 package. 
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

    private final static QName _ConsumerInstructionsModule_QNAME = new QName("urn:gs1:gdsn:consumer_instructions:xsd:3", "consumerInstructionsModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.consumer_instructions.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsumerInstructionsModuleType }
     * 
     */
    public ConsumerInstructionsModuleType createConsumerInstructionsModuleType() {
        return new ConsumerInstructionsModuleType();
    }

    /**
     * Create an instance of {@link CleaningDisinfectingInformationType }
     * 
     */
    public CleaningDisinfectingInformationType createCleaningDisinfectingInformationType() {
        return new CleaningDisinfectingInformationType();
    }

    /**
     * Create an instance of {@link ConsumerInstructionsType }
     * 
     */
    public ConsumerInstructionsType createConsumerInstructionsType() {
        return new ConsumerInstructionsType();
    }

    /**
     * Create an instance of {@link DexterityUsageCodeType }
     * 
     */
    public DexterityUsageCodeType createDexterityUsageCodeType() {
        return new DexterityUsageCodeType();
    }

    /**
     * Create an instance of {@link ProductUsageBodyLocationCodeType }
     * 
     */
    public ProductUsageBodyLocationCodeType createProductUsageBodyLocationCodeType() {
        return new ProductUsageBodyLocationCodeType();
    }

    /**
     * Create an instance of {@link RequiredEducationTrainingTypeCodeType }
     * 
     */
    public RequiredEducationTrainingTypeCodeType createRequiredEducationTrainingTypeCodeType() {
        return new RequiredEducationTrainingTypeCodeType();
    }

    /**
     * Create an instance of {@link TypeOfCleaningCodeType }
     * 
     */
    public TypeOfCleaningCodeType createTypeOfCleaningCodeType() {
        return new TypeOfCleaningCodeType();
    }

    /**
     * Create an instance of {@link TypeOfCleaningDisinfectionProcessCodeType }
     * 
     */
    public TypeOfCleaningDisinfectionProcessCodeType createTypeOfCleaningDisinfectionProcessCodeType() {
        return new TypeOfCleaningDisinfectionProcessCodeType();
    }

    /**
     * Create an instance of {@link TypeOfDisinfectionCodeType }
     * 
     */
    public TypeOfDisinfectionCodeType createTypeOfDisinfectionCodeType() {
        return new TypeOfDisinfectionCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsumerInstructionsModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsumerInstructionsModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:consumer_instructions:xsd:3", name = "consumerInstructionsModule")
    public JAXBElement<ConsumerInstructionsModuleType> createConsumerInstructionsModule(ConsumerInstructionsModuleType value) {
        return new JAXBElement<ConsumerInstructionsModuleType>(_ConsumerInstructionsModule_QNAME, ConsumerInstructionsModuleType.class, null, value);
    }

}
