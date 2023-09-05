
package gs1.gdsn.alcohol_information.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.alcohol_information.xsd._3 package. 
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

    private final static QName _AlcoholInformationModule_QNAME = new QName("urn:gs1:gdsn:alcohol_information:xsd:3", "alcoholInformationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.alcohol_information.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AlcoholInformationModuleType }
     * 
     */
    public AlcoholInformationModuleType createAlcoholInformationModuleType() {
        return new AlcoholInformationModuleType();
    }

    /**
     * Create an instance of {@link AlcoholBeverageContainerType }
     * 
     */
    public AlcoholBeverageContainerType createAlcoholBeverageContainerType() {
        return new AlcoholBeverageContainerType();
    }

    /**
     * Create an instance of {@link AlcoholBeverageDistilledFromCodeType }
     * 
     */
    public AlcoholBeverageDistilledFromCodeType createAlcoholBeverageDistilledFromCodeType() {
        return new AlcoholBeverageDistilledFromCodeType();
    }

    /**
     * Create an instance of {@link AlcoholBeverageFilteringMethodTypeCodeType }
     * 
     */
    public AlcoholBeverageFilteringMethodTypeCodeType createAlcoholBeverageFilteringMethodTypeCodeType() {
        return new AlcoholBeverageFilteringMethodTypeCodeType();
    }

    /**
     * Create an instance of {@link AlcoholBeverageProductionMethodTypeCodeType }
     * 
     */
    public AlcoholBeverageProductionMethodTypeCodeType createAlcoholBeverageProductionMethodTypeCodeType() {
        return new AlcoholBeverageProductionMethodTypeCodeType();
    }

    /**
     * Create an instance of {@link AlcoholBeverageTypeCodeType }
     * 
     */
    public AlcoholBeverageTypeCodeType createAlcoholBeverageTypeCodeType() {
        return new AlcoholBeverageTypeCodeType();
    }

    /**
     * Create an instance of {@link AlcoholicBeverageColourCodeType }
     * 
     */
    public AlcoholicBeverageColourCodeType createAlcoholicBeverageColourCodeType() {
        return new AlcoholicBeverageColourCodeType();
    }

    /**
     * Create an instance of {@link AlcoholInformationType }
     * 
     */
    public AlcoholInformationType createAlcoholInformationType() {
        return new AlcoholInformationType();
    }

    /**
     * Create an instance of {@link BeerStyleTypeCodeType }
     * 
     */
    public BeerStyleTypeCodeType createBeerStyleTypeCodeType() {
        return new BeerStyleTypeCodeType();
    }

    /**
     * Create an instance of {@link BitternessOfBeerMeasurementType }
     * 
     */
    public BitternessOfBeerMeasurementType createBitternessOfBeerMeasurementType() {
        return new BitternessOfBeerMeasurementType();
    }

    /**
     * Create an instance of {@link ContainerMaterialCodeType }
     * 
     */
    public ContainerMaterialCodeType createContainerMaterialCodeType() {
        return new ContainerMaterialCodeType();
    }

    /**
     * Create an instance of {@link ContainerProcessTypeCodeType }
     * 
     */
    public ContainerProcessTypeCodeType createContainerProcessTypeCodeType() {
        return new ContainerProcessTypeCodeType();
    }

    /**
     * Create an instance of {@link ContainerShapeCodeType }
     * 
     */
    public ContainerShapeCodeType createContainerShapeCodeType() {
        return new ContainerShapeCodeType();
    }

    /**
     * Create an instance of {@link ContainerTypeCodeType }
     * 
     */
    public ContainerTypeCodeType createContainerTypeCodeType() {
        return new ContainerTypeCodeType();
    }

    /**
     * Create an instance of {@link OriginOfWineCodeType }
     * 
     */
    public OriginOfWineCodeType createOriginOfWineCodeType() {
        return new OriginOfWineCodeType();
    }

    /**
     * Create an instance of {@link PrimaryAddedFlavouringCodeType }
     * 
     */
    public PrimaryAddedFlavouringCodeType createPrimaryAddedFlavouringCodeType() {
        return new PrimaryAddedFlavouringCodeType();
    }

    /**
     * Create an instance of {@link SecondaryAddedFlavouringCodeType }
     * 
     */
    public SecondaryAddedFlavouringCodeType createSecondaryAddedFlavouringCodeType() {
        return new SecondaryAddedFlavouringCodeType();
    }

    /**
     * Create an instance of {@link SweetnessLevelOfAlcoholicBeverageCodeType }
     * 
     */
    public SweetnessLevelOfAlcoholicBeverageCodeType createSweetnessLevelOfAlcoholicBeverageCodeType() {
        return new SweetnessLevelOfAlcoholicBeverageCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlcoholInformationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlcoholInformationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:alcohol_information:xsd:3", name = "alcoholInformationModule")
    public JAXBElement<AlcoholInformationModuleType> createAlcoholInformationModule(AlcoholInformationModuleType value) {
        return new JAXBElement<AlcoholInformationModuleType>(_AlcoholInformationModule_QNAME, AlcoholInformationModuleType.class, null, value);
    }

}
