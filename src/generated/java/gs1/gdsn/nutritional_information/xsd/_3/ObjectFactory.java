
package gs1.gdsn.nutritional_information.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.nutritional_information.xsd._3 package. 
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

    private final static QName _NutritionalInformationModule_QNAME = new QName("urn:gs1:gdsn:nutritional_information:xsd:3", "nutritionalInformationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.nutritional_information.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NutritionalInformationModuleType }
     * 
     */
    public NutritionalInformationModuleType createNutritionalInformationModuleType() {
        return new NutritionalInformationModuleType();
    }

    /**
     * Create an instance of {@link FoodBeverageCompositionDatabaseCodeType }
     * 
     */
    public FoodBeverageCompositionDatabaseCodeType createFoodBeverageCompositionDatabaseCodeType() {
        return new FoodBeverageCompositionDatabaseCodeType();
    }

    /**
     * Create an instance of {@link FoodBeverageCompositionType }
     * 
     */
    public FoodBeverageCompositionType createFoodBeverageCompositionType() {
        return new FoodBeverageCompositionType();
    }

    /**
     * Create an instance of {@link NutrientBasisQuantityTypeCodeType }
     * 
     */
    public NutrientBasisQuantityTypeCodeType createNutrientBasisQuantityTypeCodeType() {
        return new NutrientBasisQuantityTypeCodeType();
    }

    /**
     * Create an instance of {@link NutrientDetailType }
     * 
     */
    public NutrientDetailType createNutrientDetailType() {
        return new NutrientDetailType();
    }

    /**
     * Create an instance of {@link NutrientHeaderType }
     * 
     */
    public NutrientHeaderType createNutrientHeaderType() {
        return new NutrientHeaderType();
    }

    /**
     * Create an instance of {@link NutrientValueDerivationCodeType }
     * 
     */
    public NutrientValueDerivationCodeType createNutrientValueDerivationCodeType() {
        return new NutrientValueDerivationCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NutritionalInformationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NutritionalInformationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:nutritional_information:xsd:3", name = "nutritionalInformationModule")
    public JAXBElement<NutritionalInformationModuleType> createNutritionalInformationModule(NutritionalInformationModuleType value) {
        return new JAXBElement<NutritionalInformationModuleType>(_NutritionalInformationModule_QNAME, NutritionalInformationModuleType.class, null, value);
    }

}
