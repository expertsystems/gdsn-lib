
package gs1.gdsn.medical_device_trade_item.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.medical_device_trade_item.xsd._3 package. 
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

    private final static QName _MedicalDeviceTradeItemModule_QNAME = new QName("urn:gs1:gdsn:medical_device_trade_item:xsd:3", "medicalDeviceTradeItemModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.medical_device_trade_item.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MedicalDeviceTradeItemModuleType }
     * 
     */
    public MedicalDeviceTradeItemModuleType createMedicalDeviceTradeItemModuleType() {
        return new MedicalDeviceTradeItemModuleType();
    }

    /**
     * Create an instance of {@link AnnexXVIIntendedPurposeTypeCodeType }
     * 
     */
    public AnnexXVIIntendedPurposeTypeCodeType createAnnexXVIIntendedPurposeTypeCodeType() {
        return new AnnexXVIIntendedPurposeTypeCodeType();
    }

    /**
     * Create an instance of {@link EUMedicalDeviceStatusCodeType }
     * 
     */
    public EUMedicalDeviceStatusCodeType createEUMedicalDeviceStatusCodeType() {
        return new EUMedicalDeviceStatusCodeType();
    }

    /**
     * Create an instance of {@link EUMedicalDeviceSubStatusCodeType }
     * 
     */
    public EUMedicalDeviceSubStatusCodeType createEUMedicalDeviceSubStatusCodeType() {
        return new EUMedicalDeviceSubStatusCodeType();
    }

    /**
     * Create an instance of {@link HealthcareTradeItemReusabilityInformationType }
     * 
     */
    public HealthcareTradeItemReusabilityInformationType createHealthcareTradeItemReusabilityInformationType() {
        return new HealthcareTradeItemReusabilityInformationType();
    }

    /**
     * Create an instance of {@link HealthcareTradeItemReusabilityTypeCodeType }
     * 
     */
    public HealthcareTradeItemReusabilityTypeCodeType createHealthcareTradeItemReusabilityTypeCodeType() {
        return new HealthcareTradeItemReusabilityTypeCodeType();
    }

    /**
     * Create an instance of {@link MedicalDeviceInformationType }
     * 
     */
    public MedicalDeviceInformationType createMedicalDeviceInformationType() {
        return new MedicalDeviceInformationType();
    }

    /**
     * Create an instance of {@link MedicalDeviceSubStatusInformationType }
     * 
     */
    public MedicalDeviceSubStatusInformationType createMedicalDeviceSubStatusInformationType() {
        return new MedicalDeviceSubStatusInformationType();
    }

    /**
     * Create an instance of {@link MRICompatibilityCodeType }
     * 
     */
    public MRICompatibilityCodeType createMRICompatibilityCodeType() {
        return new MRICompatibilityCodeType();
    }

    /**
     * Create an instance of {@link MultiComponentDeviceTypeCodeType }
     * 
     */
    public MultiComponentDeviceTypeCodeType createMultiComponentDeviceTypeCodeType() {
        return new MultiComponentDeviceTypeCodeType();
    }

    /**
     * Create an instance of {@link RecallScopeTypeCodeType }
     * 
     */
    public RecallScopeTypeCodeType createRecallScopeTypeCodeType() {
        return new RecallScopeTypeCodeType();
    }

    /**
     * Create an instance of {@link SpecialDeviceTypeCodeType }
     * 
     */
    public SpecialDeviceTypeCodeType createSpecialDeviceTypeCodeType() {
        return new SpecialDeviceTypeCodeType();
    }

    /**
     * Create an instance of {@link SterilisationTypeCodeType }
     * 
     */
    public SterilisationTypeCodeType createSterilisationTypeCodeType() {
        return new SterilisationTypeCodeType();
    }

    /**
     * Create an instance of {@link SystemOrProcedurePackTypeCodeType }
     * 
     */
    public SystemOrProcedurePackTypeCodeType createSystemOrProcedurePackTypeCodeType() {
        return new SystemOrProcedurePackTypeCodeType();
    }

    /**
     * Create an instance of {@link TradeItemSterilityInformationType }
     * 
     */
    public TradeItemSterilityInformationType createTradeItemSterilityInformationType() {
        return new TradeItemSterilityInformationType();
    }

    /**
     * Create an instance of {@link UDIProductionIdentifierTypeCodeType }
     * 
     */
    public UDIProductionIdentifierTypeCodeType createUDIProductionIdentifierTypeCodeType() {
        return new UDIProductionIdentifierTypeCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MedicalDeviceTradeItemModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MedicalDeviceTradeItemModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:medical_device_trade_item:xsd:3", name = "medicalDeviceTradeItemModule")
    public JAXBElement<MedicalDeviceTradeItemModuleType> createMedicalDeviceTradeItemModule(MedicalDeviceTradeItemModuleType value) {
        return new JAXBElement<MedicalDeviceTradeItemModuleType>(_MedicalDeviceTradeItemModule_QNAME, MedicalDeviceTradeItemModuleType.class, null, value);
    }

}
