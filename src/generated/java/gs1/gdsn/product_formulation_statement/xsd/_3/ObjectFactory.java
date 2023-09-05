
package gs1.gdsn.product_formulation_statement.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.product_formulation_statement.xsd._3 package. 
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

    private final static QName _ProductFormulationStatementModule_QNAME = new QName("urn:gs1:gdsn:product_formulation_statement:xsd:3", "productFormulationStatementModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.product_formulation_statement.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductFormulationStatementModuleType }
     * 
     */
    public ProductFormulationStatementModuleType createProductFormulationStatementModuleType() {
        return new ProductFormulationStatementModuleType();
    }

    /**
     * Create an instance of {@link CreditableAlternativeProteinType }
     * 
     */
    public CreditableAlternativeProteinType createCreditableAlternativeProteinType() {
        return new CreditableAlternativeProteinType();
    }

    /**
     * Create an instance of {@link CreditableGrainsInformationType }
     * 
     */
    public CreditableGrainsInformationType createCreditableGrainsInformationType() {
        return new CreditableGrainsInformationType();
    }

    /**
     * Create an instance of {@link CreditableGrainType }
     * 
     */
    public CreditableGrainType createCreditableGrainType() {
        return new CreditableGrainType();
    }

    /**
     * Create an instance of {@link CreditableIngredientDetailsType }
     * 
     */
    public CreditableIngredientDetailsType createCreditableIngredientDetailsType() {
        return new CreditableIngredientDetailsType();
    }

    /**
     * Create an instance of {@link CreditableIngredientType }
     * 
     */
    public CreditableIngredientType createCreditableIngredientType() {
        return new CreditableIngredientType();
    }

    /**
     * Create an instance of {@link CreditableIngredientTypeCodeType }
     * 
     */
    public CreditableIngredientTypeCodeType createCreditableIngredientTypeCodeType() {
        return new CreditableIngredientTypeCodeType();
    }

    /**
     * Create an instance of {@link CreditableVegetableType }
     * 
     */
    public CreditableVegetableType createCreditableVegetableType() {
        return new CreditableVegetableType();
    }

    /**
     * Create an instance of {@link NoncreditableGrainType }
     * 
     */
    public NoncreditableGrainType createNoncreditableGrainType() {
        return new NoncreditableGrainType();
    }

    /**
     * Create an instance of {@link ProductFormulationStatementType }
     * 
     */
    public ProductFormulationStatementType createProductFormulationStatementType() {
        return new ProductFormulationStatementType();
    }

    /**
     * Create an instance of {@link VegetableSubgroupCodeType }
     * 
     */
    public VegetableSubgroupCodeType createVegetableSubgroupCodeType() {
        return new VegetableSubgroupCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductFormulationStatementModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductFormulationStatementModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:product_formulation_statement:xsd:3", name = "productFormulationStatementModule")
    public JAXBElement<ProductFormulationStatementModuleType> createProductFormulationStatementModule(ProductFormulationStatementModuleType value) {
        return new JAXBElement<ProductFormulationStatementModuleType>(_ProductFormulationStatementModule_QNAME, ProductFormulationStatementModuleType.class, null, value);
    }

}
