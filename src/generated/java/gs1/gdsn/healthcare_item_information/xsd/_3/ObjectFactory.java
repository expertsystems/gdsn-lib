
package gs1.gdsn.healthcare_item_information.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.healthcare_item_information.xsd._3 package. 
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

    private final static QName _HealthcareItemInformationModule_QNAME = new QName("urn:gs1:gdsn:healthcare_item_information:xsd:3", "healthcareItemInformationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.healthcare_item_information.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HealthcareItemInformationModuleType }
     * 
     */
    public HealthcareItemInformationModuleType createHealthcareItemInformationModuleType() {
        return new HealthcareItemInformationModuleType();
    }

    /**
     * Create an instance of {@link AllowedUsageCodeType }
     * 
     */
    public AllowedUsageCodeType createAllowedUsageCodeType() {
        return new AllowedUsageCodeType();
    }

    /**
     * Create an instance of {@link ClinicalSizeMeasurementPrecisionCodeType }
     * 
     */
    public ClinicalSizeMeasurementPrecisionCodeType createClinicalSizeMeasurementPrecisionCodeType() {
        return new ClinicalSizeMeasurementPrecisionCodeType();
    }

    /**
     * Create an instance of {@link ClinicalSizeType }
     * 
     */
    public ClinicalSizeType createClinicalSizeType() {
        return new ClinicalSizeType();
    }

    /**
     * Create an instance of {@link ClinicalSizeTypeCodeType }
     * 
     */
    public ClinicalSizeTypeCodeType createClinicalSizeTypeCodeType() {
        return new ClinicalSizeTypeCodeType();
    }

    /**
     * Create an instance of {@link ClinicalStorageHandlingInformationType }
     * 
     */
    public ClinicalStorageHandlingInformationType createClinicalStorageHandlingInformationType() {
        return new ClinicalStorageHandlingInformationType();
    }

    /**
     * Create an instance of {@link ClinicalStorageHandlingTypeCodeType }
     * 
     */
    public ClinicalStorageHandlingTypeCodeType createClinicalStorageHandlingTypeCodeType() {
        return new ClinicalStorageHandlingTypeCodeType();
    }

    /**
     * Create an instance of {@link ClinicalWarningAgencyCodeType }
     * 
     */
    public ClinicalWarningAgencyCodeType createClinicalWarningAgencyCodeType() {
        return new ClinicalWarningAgencyCodeType();
    }

    /**
     * Create an instance of {@link ClinicalWarningType }
     * 
     */
    public ClinicalWarningType createClinicalWarningType() {
        return new ClinicalWarningType();
    }

    /**
     * Create an instance of {@link HealthcareGroupedProductCodeType }
     * 
     */
    public HealthcareGroupedProductCodeType createHealthcareGroupedProductCodeType() {
        return new HealthcareGroupedProductCodeType();
    }

    /**
     * Create an instance of {@link HealthcareItemInformationType }
     * 
     */
    public HealthcareItemInformationType createHealthcareItemInformationType() {
        return new HealthcareItemInformationType();
    }

    /**
     * Create an instance of {@link PrescriptionTypeCodeType }
     * 
     */
    public PrescriptionTypeCodeType createPrescriptionTypeCodeType() {
        return new PrescriptionTypeCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HealthcareItemInformationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HealthcareItemInformationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:healthcare_item_information:xsd:3", name = "healthcareItemInformationModule")
    public JAXBElement<HealthcareItemInformationModuleType> createHealthcareItemInformationModule(HealthcareItemInformationModuleType value) {
        return new JAXBElement<HealthcareItemInformationModuleType>(_HealthcareItemInformationModule_QNAME, HealthcareItemInformationModuleType.class, null, value);
    }

}
