
package gs1.gdsn.health_related_information.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.health_related_information.xsd._3 package. 
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

    private final static QName _HealthRelatedInformationModule_QNAME = new QName("urn:gs1:gdsn:health_related_information:xsd:3", "healthRelatedInformationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.health_related_information.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HealthRelatedInformationModuleType }
     * 
     */
    public HealthRelatedInformationModuleType createHealthRelatedInformationModuleType() {
        return new HealthRelatedInformationModuleType();
    }

    /**
     * Create an instance of {@link CannabisCBDTypeCodeType }
     * 
     */
    public CannabisCBDTypeCodeType createCannabisCBDTypeCodeType() {
        return new CannabisCBDTypeCodeType();
    }

    /**
     * Create an instance of {@link CompulsoryAdditionalInformationType }
     * 
     */
    public CompulsoryAdditionalInformationType createCompulsoryAdditionalInformationType() {
        return new CompulsoryAdditionalInformationType();
    }

    /**
     * Create an instance of {@link CompulsoryAdditionalLabelInformationTypeCodeType }
     * 
     */
    public CompulsoryAdditionalLabelInformationTypeCodeType createCompulsoryAdditionalLabelInformationTypeCodeType() {
        return new CompulsoryAdditionalLabelInformationTypeCodeType();
    }

    /**
     * Create an instance of {@link HealthRelatedInformationType }
     * 
     */
    public HealthRelatedInformationType createHealthRelatedInformationType() {
        return new HealthRelatedInformationType();
    }

    /**
     * Create an instance of {@link NutritionalLabelTypeCodeType }
     * 
     */
    public NutritionalLabelTypeCodeType createNutritionalLabelTypeCodeType() {
        return new NutritionalLabelTypeCodeType();
    }

    /**
     * Create an instance of {@link NutritionalProgramCodeType }
     * 
     */
    public NutritionalProgramCodeType createNutritionalProgramCodeType() {
        return new NutritionalProgramCodeType();
    }

    /**
     * Create an instance of {@link NutritionalProgramIngredientsType }
     * 
     */
    public NutritionalProgramIngredientsType createNutritionalProgramIngredientsType() {
        return new NutritionalProgramIngredientsType();
    }

    /**
     * Create an instance of {@link NutritionalProgramIngredientTypeCodeType }
     * 
     */
    public NutritionalProgramIngredientTypeCodeType createNutritionalProgramIngredientTypeCodeType() {
        return new NutritionalProgramIngredientTypeCodeType();
    }

    /**
     * Create an instance of {@link NutritionalProgramStatusCodeType }
     * 
     */
    public NutritionalProgramStatusCodeType createNutritionalProgramStatusCodeType() {
        return new NutritionalProgramStatusCodeType();
    }

    /**
     * Create an instance of {@link NutritionalProgramType }
     * 
     */
    public NutritionalProgramType createNutritionalProgramType() {
        return new NutritionalProgramType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HealthRelatedInformationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HealthRelatedInformationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:health_related_information:xsd:3", name = "healthRelatedInformationModule")
    public JAXBElement<HealthRelatedInformationModuleType> createHealthRelatedInformationModule(HealthRelatedInformationModuleType value) {
        return new JAXBElement<HealthRelatedInformationModuleType>(_HealthRelatedInformationModule_QNAME, HealthRelatedInformationModuleType.class, null, value);
    }

}
