
package gs1.gdsn.animal_feeding.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.animal_feeding.xsd._3 package. 
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

    private final static QName _AnimalFeedingModule_QNAME = new QName("urn:gs1:gdsn:animal_feeding:xsd:3", "animalFeedingModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.animal_feeding.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnimalFeedingModuleType }
     * 
     */
    public AnimalFeedingModuleType createAnimalFeedingModuleType() {
        return new AnimalFeedingModuleType();
    }

    /**
     * Create an instance of {@link AnimalFeedingDetailType }
     * 
     */
    public AnimalFeedingDetailType createAnimalFeedingDetailType() {
        return new AnimalFeedingDetailType();
    }

    /**
     * Create an instance of {@link AnimalFeedingType }
     * 
     */
    public AnimalFeedingType createAnimalFeedingType() {
        return new AnimalFeedingType();
    }

    /**
     * Create an instance of {@link AnimalFoodProcessOrStateTypeCodeType }
     * 
     */
    public AnimalFoodProcessOrStateTypeCodeType createAnimalFoodProcessOrStateTypeCodeType() {
        return new AnimalFoodProcessOrStateTypeCodeType();
    }

    /**
     * Create an instance of {@link AnimalFoodTypeCodeType }
     * 
     */
    public AnimalFoodTypeCodeType createAnimalFoodTypeCodeType() {
        return new AnimalFoodTypeCodeType();
    }

    /**
     * Create an instance of {@link AnimalNutrientDetailType }
     * 
     */
    public AnimalNutrientDetailType createAnimalNutrientDetailType() {
        return new AnimalNutrientDetailType();
    }

    /**
     * Create an instance of {@link AnimalTargetedHealthConditionCodeType }
     * 
     */
    public AnimalTargetedHealthConditionCodeType createAnimalTargetedHealthConditionCodeType() {
        return new AnimalTargetedHealthConditionCodeType();
    }

    /**
     * Create an instance of {@link AnimalTargetSizeCodeType }
     * 
     */
    public AnimalTargetSizeCodeType createAnimalTargetSizeCodeType() {
        return new AnimalTargetSizeCodeType();
    }

    /**
     * Create an instance of {@link FeedLifestageCodeType }
     * 
     */
    public FeedLifestageCodeType createFeedLifestageCodeType() {
        return new FeedLifestageCodeType();
    }

    /**
     * Create an instance of {@link FeedTypeCodeType }
     * 
     */
    public FeedTypeCodeType createFeedTypeCodeType() {
        return new FeedTypeCodeType();
    }

    /**
     * Create an instance of {@link TargetedConsumptionByCodeType }
     * 
     */
    public TargetedConsumptionByCodeType createTargetedConsumptionByCodeType() {
        return new TargetedConsumptionByCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnimalFeedingModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnimalFeedingModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:animal_feeding:xsd:3", name = "animalFeedingModule")
    public JAXBElement<AnimalFeedingModuleType> createAnimalFeedingModule(AnimalFeedingModuleType value) {
        return new JAXBElement<AnimalFeedingModuleType>(_AnimalFeedingModule_QNAME, AnimalFeedingModuleType.class, null, value);
    }

}
