
package gs1.gdsn.nonfood_ingredient.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.nonfood_ingredient.xsd._3 package. 
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

    private final static QName _NonfoodIngredientModule_QNAME = new QName("urn:gs1:gdsn:nonfood_ingredient:xsd:3", "nonfoodIngredientModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.nonfood_ingredient.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NonfoodIngredientModuleType }
     * 
     */
    public NonfoodIngredientModuleType createNonfoodIngredientModuleType() {
        return new NonfoodIngredientModuleType();
    }

    /**
     * Create an instance of {@link IngredientStrengthType }
     * 
     */
    public IngredientStrengthType createIngredientStrengthType() {
        return new IngredientStrengthType();
    }

    /**
     * Create an instance of {@link NonfoodIngredientOfConcernCodeType }
     * 
     */
    public NonfoodIngredientOfConcernCodeType createNonfoodIngredientOfConcernCodeType() {
        return new NonfoodIngredientOfConcernCodeType();
    }

    /**
     * Create an instance of {@link NonfoodIngredientType }
     * 
     */
    public NonfoodIngredientType createNonfoodIngredientType() {
        return new NonfoodIngredientType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonfoodIngredientModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NonfoodIngredientModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:nonfood_ingredient:xsd:3", name = "nonfoodIngredientModule")
    public JAXBElement<NonfoodIngredientModuleType> createNonfoodIngredientModule(NonfoodIngredientModuleType value) {
        return new JAXBElement<NonfoodIngredientModuleType>(_NonfoodIngredientModule_QNAME, NonfoodIngredientModuleType.class, null, value);
    }

}
