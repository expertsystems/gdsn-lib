
package gs1.gdsn.food_and_beverage_properties_information.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.food_and_beverage_properties_information.xsd._3 package. 
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

    private final static QName _FoodAndBeveragePropertiesInformationModule_QNAME = new QName("urn:gs1:gdsn:food_and_beverage_properties_information:xsd:3", "foodAndBeveragePropertiesInformationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.food_and_beverage_properties_information.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FoodAndBeveragePropertiesInformationModuleType }
     * 
     */
    public FoodAndBeveragePropertiesInformationModuleType createFoodAndBeveragePropertiesInformationModuleType() {
        return new FoodAndBeveragePropertiesInformationModuleType();
    }

    /**
     * Create an instance of {@link MicrobiologicalInformationType }
     * 
     */
    public MicrobiologicalInformationType createMicrobiologicalInformationType() {
        return new MicrobiologicalInformationType();
    }

    /**
     * Create an instance of {@link MicrobiologicalOrganismCodeType }
     * 
     */
    public MicrobiologicalOrganismCodeType createMicrobiologicalOrganismCodeType() {
        return new MicrobiologicalOrganismCodeType();
    }

    /**
     * Create an instance of {@link MicrobiologicalOrganismMethodOfAnalysisCodeType }
     * 
     */
    public MicrobiologicalOrganismMethodOfAnalysisCodeType createMicrobiologicalOrganismMethodOfAnalysisCodeType() {
        return new MicrobiologicalOrganismMethodOfAnalysisCodeType();
    }

    /**
     * Create an instance of {@link PhysiochemicalCharacteristicCodeType }
     * 
     */
    public PhysiochemicalCharacteristicCodeType createPhysiochemicalCharacteristicCodeType() {
        return new PhysiochemicalCharacteristicCodeType();
    }

    /**
     * Create an instance of {@link PhysiochemicalCharacteristicType }
     * 
     */
    public PhysiochemicalCharacteristicType createPhysiochemicalCharacteristicType() {
        return new PhysiochemicalCharacteristicType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FoodAndBeveragePropertiesInformationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FoodAndBeveragePropertiesInformationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:food_and_beverage_properties_information:xsd:3", name = "foodAndBeveragePropertiesInformationModule")
    public JAXBElement<FoodAndBeveragePropertiesInformationModuleType> createFoodAndBeveragePropertiesInformationModule(FoodAndBeveragePropertiesInformationModuleType value) {
        return new JAXBElement<FoodAndBeveragePropertiesInformationModuleType>(_FoodAndBeveragePropertiesInformationModule_QNAME, FoodAndBeveragePropertiesInformationModuleType.class, null, value);
    }

}
