
package gs1.gdsn.chemical_regulation_information.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.chemical_regulation_information.xsd._3 package. 
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

    private final static QName _ChemicalRegulationInformationModule_QNAME = new QName("urn:gs1:gdsn:chemical_regulation_information:xsd:3", "chemicalRegulationInformationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.chemical_regulation_information.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChemicalRegulationInformationModuleType }
     * 
     */
    public ChemicalRegulationInformationModuleType createChemicalRegulationInformationModuleType() {
        return new ChemicalRegulationInformationModuleType();
    }

    /**
     * Create an instance of {@link CarcinogenicMutagenicReprotoxicTypeCodeType }
     * 
     */
    public CarcinogenicMutagenicReprotoxicTypeCodeType createCarcinogenicMutagenicReprotoxicTypeCodeType() {
        return new CarcinogenicMutagenicReprotoxicTypeCodeType();
    }

    /**
     * Create an instance of {@link ChemicalIngredientPropertyInformationType }
     * 
     */
    public ChemicalIngredientPropertyInformationType createChemicalIngredientPropertyInformationType() {
        return new ChemicalIngredientPropertyInformationType();
    }

    /**
     * Create an instance of {@link ChemicalPhysicalStateCodeType }
     * 
     */
    public ChemicalPhysicalStateCodeType createChemicalPhysicalStateCodeType() {
        return new ChemicalPhysicalStateCodeType();
    }

    /**
     * Create an instance of {@link ChemicalPropertyType }
     * 
     */
    public ChemicalPropertyType createChemicalPropertyType() {
        return new ChemicalPropertyType();
    }

    /**
     * Create an instance of {@link ChemicalPropertyTypeCodeType }
     * 
     */
    public ChemicalPropertyTypeCodeType createChemicalPropertyTypeCodeType() {
        return new ChemicalPropertyTypeCodeType();
    }

    /**
     * Create an instance of {@link ChemicalRegulationInformationType }
     * 
     */
    public ChemicalRegulationInformationType createChemicalRegulationInformationType() {
        return new ChemicalRegulationInformationType();
    }

    /**
     * Create an instance of {@link ChemicalRegulationType }
     * 
     */
    public ChemicalRegulationType createChemicalRegulationType() {
        return new ChemicalRegulationType();
    }

    /**
     * Create an instance of {@link RegulatedChemicalType }
     * 
     */
    public RegulatedChemicalType createRegulatedChemicalType() {
        return new RegulatedChemicalType();
    }

    /**
     * Create an instance of {@link RegulatedChemicalTypeCodeType }
     * 
     */
    public RegulatedChemicalTypeCodeType createRegulatedChemicalTypeCodeType() {
        return new RegulatedChemicalTypeCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChemicalRegulationInformationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChemicalRegulationInformationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:chemical_regulation_information:xsd:3", name = "chemicalRegulationInformationModule")
    public JAXBElement<ChemicalRegulationInformationModuleType> createChemicalRegulationInformationModule(ChemicalRegulationInformationModuleType value) {
        return new JAXBElement<ChemicalRegulationInformationModuleType>(_ChemicalRegulationInformationModule_QNAME, ChemicalRegulationInformationModuleType.class, null, value);
    }

}
