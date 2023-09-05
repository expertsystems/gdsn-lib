
package gs1.gdsn.dangerous_substance_information.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.dangerous_substance_information.xsd._3 package. 
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

    private final static QName _DangerousSubstanceInformationModule_QNAME = new QName("urn:gs1:gdsn:dangerous_substance_information:xsd:3", "dangerousSubstanceInformationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.dangerous_substance_information.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DangerousSubstanceInformationModuleType }
     * 
     */
    public DangerousSubstanceInformationModuleType createDangerousSubstanceInformationModuleType() {
        return new DangerousSubstanceInformationModuleType();
    }

    /**
     * Create an instance of {@link DangerousSubstanceInformationType }
     * 
     */
    public DangerousSubstanceInformationType createDangerousSubstanceInformationType() {
        return new DangerousSubstanceInformationType();
    }

    /**
     * Create an instance of {@link DangerousSubstancePropertiesType }
     * 
     */
    public DangerousSubstancePropertiesType createDangerousSubstancePropertiesType() {
        return new DangerousSubstancePropertiesType();
    }

    /**
     * Create an instance of {@link DangerousSubstancesWaterSolubilityCodeType }
     * 
     */
    public DangerousSubstancesWaterSolubilityCodeType createDangerousSubstancesWaterSolubilityCodeType() {
        return new DangerousSubstancesWaterSolubilityCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DangerousSubstanceInformationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DangerousSubstanceInformationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:dangerous_substance_information:xsd:3", name = "dangerousSubstanceInformationModule")
    public JAXBElement<DangerousSubstanceInformationModuleType> createDangerousSubstanceInformationModule(DangerousSubstanceInformationModuleType value) {
        return new JAXBElement<DangerousSubstanceInformationModuleType>(_DangerousSubstanceInformationModule_QNAME, DangerousSubstanceInformationModuleType.class, null, value);
    }

}
