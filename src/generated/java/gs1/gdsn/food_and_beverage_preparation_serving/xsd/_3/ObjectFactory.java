
package gs1.gdsn.food_and_beverage_preparation_serving.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.food_and_beverage_preparation_serving.xsd._3 package. 
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

    private final static QName _FoodAndBeveragePreparationServingModule_QNAME = new QName("urn:gs1:gdsn:food_and_beverage_preparation_serving:xsd:3", "foodAndBeveragePreparationServingModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.food_and_beverage_preparation_serving.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FoodAndBeveragePreparationServingModuleType }
     * 
     */
    public FoodAndBeveragePreparationServingModuleType createFoodAndBeveragePreparationServingModuleType() {
        return new FoodAndBeveragePreparationServingModuleType();
    }

    /**
     * Create an instance of {@link PreparationServingType }
     * 
     */
    public PreparationServingType createPreparationServingType() {
        return new PreparationServingType();
    }

    /**
     * Create an instance of {@link ProductPreparationTextureInformationType }
     * 
     */
    public ProductPreparationTextureInformationType createProductPreparationTextureInformationType() {
        return new ProductPreparationTextureInformationType();
    }

    /**
     * Create an instance of {@link ProductTextureAgencyCodeType }
     * 
     */
    public ProductTextureAgencyCodeType createProductTextureAgencyCodeType() {
        return new ProductTextureAgencyCodeType();
    }

    /**
     * Create an instance of {@link ProductTextureCodeType }
     * 
     */
    public ProductTextureCodeType createProductTextureCodeType() {
        return new ProductTextureCodeType();
    }

    /**
     * Create an instance of {@link ProductYieldInformationType }
     * 
     */
    public ProductYieldInformationType createProductYieldInformationType() {
        return new ProductYieldInformationType();
    }

    /**
     * Create an instance of {@link ProductYieldTypeCodeType }
     * 
     */
    public ProductYieldTypeCodeType createProductYieldTypeCodeType() {
        return new ProductYieldTypeCodeType();
    }

    /**
     * Create an instance of {@link ServingQuantityInformationType }
     * 
     */
    public ServingQuantityInformationType createServingQuantityInformationType() {
        return new ServingQuantityInformationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FoodAndBeveragePreparationServingModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FoodAndBeveragePreparationServingModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:food_and_beverage_preparation_serving:xsd:3", name = "foodAndBeveragePreparationServingModule")
    public JAXBElement<FoodAndBeveragePreparationServingModuleType> createFoodAndBeveragePreparationServingModule(FoodAndBeveragePreparationServingModuleType value) {
        return new JAXBElement<FoodAndBeveragePreparationServingModuleType>(_FoodAndBeveragePreparationServingModule_QNAME, FoodAndBeveragePreparationServingModuleType.class, null, value);
    }

}
