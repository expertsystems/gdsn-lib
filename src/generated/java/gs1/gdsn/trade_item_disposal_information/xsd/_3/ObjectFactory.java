
package gs1.gdsn.trade_item_disposal_information.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.trade_item_disposal_information.xsd._3 package. 
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

    private final static QName _TradeItemDisposalInformationModule_QNAME = new QName("urn:gs1:gdsn:trade_item_disposal_information:xsd:3", "tradeItemDisposalInformationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.trade_item_disposal_information.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TradeItemDisposalInformationModuleType }
     * 
     */
    public TradeItemDisposalInformationModuleType createTradeItemDisposalInformationModuleType() {
        return new TradeItemDisposalInformationModuleType();
    }

    /**
     * Create an instance of {@link ManufacturerTakeBackProgramType }
     * 
     */
    public ManufacturerTakeBackProgramType createManufacturerTakeBackProgramType() {
        return new ManufacturerTakeBackProgramType();
    }

    /**
     * Create an instance of {@link SparePartsAvailabilityEffectiveDateTypeCodeType }
     * 
     */
    public SparePartsAvailabilityEffectiveDateTypeCodeType createSparePartsAvailabilityEffectiveDateTypeCodeType() {
        return new SparePartsAvailabilityEffectiveDateTypeCodeType();
    }

    /**
     * Create an instance of {@link SparePartsAvailabilityInformationType }
     * 
     */
    public SparePartsAvailabilityInformationType createSparePartsAvailabilityInformationType() {
        return new SparePartsAvailabilityInformationType();
    }

    /**
     * Create an instance of {@link TradeItemDisposalInformationType }
     * 
     */
    public TradeItemDisposalInformationType createTradeItemDisposalInformationType() {
        return new TradeItemDisposalInformationType();
    }

    /**
     * Create an instance of {@link TradeItemWasteManagementType }
     * 
     */
    public TradeItemWasteManagementType createTradeItemWasteManagementType() {
        return new TradeItemWasteManagementType();
    }

    /**
     * Create an instance of {@link TypeOfWasteCodeType }
     * 
     */
    public TypeOfWasteCodeType createTypeOfWasteCodeType() {
        return new TypeOfWasteCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TradeItemDisposalInformationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TradeItemDisposalInformationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:trade_item_disposal_information:xsd:3", name = "tradeItemDisposalInformationModule")
    public JAXBElement<TradeItemDisposalInformationModuleType> createTradeItemDisposalInformationModule(TradeItemDisposalInformationModuleType value) {
        return new JAXBElement<TradeItemDisposalInformationModuleType>(_TradeItemDisposalInformationModule_QNAME, TradeItemDisposalInformationModuleType.class, null, value);
    }

}
