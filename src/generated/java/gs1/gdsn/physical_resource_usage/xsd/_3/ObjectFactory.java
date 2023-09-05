
package gs1.gdsn.physical_resource_usage.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.physical_resource_usage.xsd._3 package. 
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

    private final static QName _PhysicalResourceUsageInformationModule_QNAME = new QName("urn:gs1:gdsn:physical_resource_usage:xsd:3", "physicalResourceUsageInformationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.physical_resource_usage.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PhysicalResourceUsageInformationModuleType }
     * 
     */
    public PhysicalResourceUsageInformationModuleType createPhysicalResourceUsageInformationModuleType() {
        return new PhysicalResourceUsageInformationModuleType();
    }

    /**
     * Create an instance of {@link PhysicalResourceTypeCodeType }
     * 
     */
    public PhysicalResourceTypeCodeType createPhysicalResourceTypeCodeType() {
        return new PhysicalResourceTypeCodeType();
    }

    /**
     * Create an instance of {@link PhysicalResourceUsageInformationType }
     * 
     */
    public PhysicalResourceUsageInformationType createPhysicalResourceUsageInformationType() {
        return new PhysicalResourceUsageInformationType();
    }

    /**
     * Create an instance of {@link PhysicalResourceUsageMeasurementTypeCodeType }
     * 
     */
    public PhysicalResourceUsageMeasurementTypeCodeType createPhysicalResourceUsageMeasurementTypeCodeType() {
        return new PhysicalResourceUsageMeasurementTypeCodeType();
    }

    /**
     * Create an instance of {@link PhysicalResourceUsageTradeItemClassificationType }
     * 
     */
    public PhysicalResourceUsageTradeItemClassificationType createPhysicalResourceUsageTradeItemClassificationType() {
        return new PhysicalResourceUsageTradeItemClassificationType();
    }

    /**
     * Create an instance of {@link PhysicalResourceUsageType }
     * 
     */
    public PhysicalResourceUsageType createPhysicalResourceUsageType() {
        return new PhysicalResourceUsageType();
    }

    /**
     * Create an instance of {@link RunModeCodeType }
     * 
     */
    public RunModeCodeType createRunModeCodeType() {
        return new RunModeCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhysicalResourceUsageInformationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhysicalResourceUsageInformationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:physical_resource_usage:xsd:3", name = "physicalResourceUsageInformationModule")
    public JAXBElement<PhysicalResourceUsageInformationModuleType> createPhysicalResourceUsageInformationModule(PhysicalResourceUsageInformationModuleType value) {
        return new JAXBElement<PhysicalResourceUsageInformationModuleType>(_PhysicalResourceUsageInformationModule_QNAME, PhysicalResourceUsageInformationModuleType.class, null, value);
    }

}
