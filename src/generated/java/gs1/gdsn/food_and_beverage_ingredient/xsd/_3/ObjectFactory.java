
package gs1.gdsn.food_and_beverage_ingredient.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.food_and_beverage_ingredient.xsd._3 package. 
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

    private final static QName _FoodAndBeverageIngredientModule_QNAME = new QName("urn:gs1:gdsn:food_and_beverage_ingredient:xsd:3", "foodAndBeverageIngredientModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.food_and_beverage_ingredient.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FoodAndBeverageIngredientModuleType }
     * 
     */
    public FoodAndBeverageIngredientModuleType createFoodAndBeverageIngredientModuleType() {
        return new FoodAndBeverageIngredientModuleType();
    }

    /**
     * Create an instance of {@link FoodAndBeverageIngredientType }
     * 
     */
    public FoodAndBeverageIngredientType createFoodAndBeverageIngredientType() {
        return new FoodAndBeverageIngredientType();
    }

    /**
     * Create an instance of {@link GrapeVarietyCodeType }
     * 
     */
    public GrapeVarietyCodeType createGrapeVarietyCodeType() {
        return new GrapeVarietyCodeType();
    }

    /**
     * Create an instance of {@link IngredientOfConcernCodeType }
     * 
     */
    public IngredientOfConcernCodeType createIngredientOfConcernCodeType() {
        return new IngredientOfConcernCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FoodAndBeverageIngredientModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FoodAndBeverageIngredientModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:food_and_beverage_ingredient:xsd:3", name = "foodAndBeverageIngredientModule")
    public JAXBElement<FoodAndBeverageIngredientModuleType> createFoodAndBeverageIngredientModule(FoodAndBeverageIngredientModuleType value) {
        return new JAXBElement<FoodAndBeverageIngredientModuleType>(_FoodAndBeverageIngredientModule_QNAME, FoodAndBeverageIngredientModuleType.class, null, value);
    }

}
