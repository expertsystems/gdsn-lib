
package gs1.gdsn.trade_item_data_carrier_and_identification.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.trade_item_data_carrier_and_identification.xsd._3 package. 
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

    private final static QName _TradeItemDataCarrierAndIdentificationModule_QNAME = new QName("urn:gs1:gdsn:trade_item_data_carrier_and_identification:xsd:3", "tradeItemDataCarrierAndIdentificationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.trade_item_data_carrier_and_identification.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TradeItemDataCarrierAndIdentificationModuleType }
     * 
     */
    public TradeItemDataCarrierAndIdentificationModuleType createTradeItemDataCarrierAndIdentificationModuleType() {
        return new TradeItemDataCarrierAndIdentificationModuleType();
    }

    /**
     * Create an instance of {@link ApplicationIdentifierTypeCodeType }
     * 
     */
    public ApplicationIdentifierTypeCodeType createApplicationIdentifierTypeCodeType() {
        return new ApplicationIdentifierTypeCodeType();
    }

    /**
     * Create an instance of {@link DataCarrierFamilyTypeCodeType }
     * 
     */
    public DataCarrierFamilyTypeCodeType createDataCarrierFamilyTypeCodeType() {
        return new DataCarrierFamilyTypeCodeType();
    }

    /**
     * Create an instance of {@link DataCarrierPresenceCodeType }
     * 
     */
    public DataCarrierPresenceCodeType createDataCarrierPresenceCodeType() {
        return new DataCarrierPresenceCodeType();
    }

    /**
     * Create an instance of {@link DataCarrierType }
     * 
     */
    public DataCarrierType createDataCarrierType() {
        return new DataCarrierType();
    }

    /**
     * Create an instance of {@link DataCarrierTypeCodeType }
     * 
     */
    public DataCarrierTypeCodeType createDataCarrierTypeCodeType() {
        return new DataCarrierTypeCodeType();
    }

    /**
     * Create an instance of {@link GS1TradeItemIdentificationKeyType }
     * 
     */
    public GS1TradeItemIdentificationKeyType createGS1TradeItemIdentificationKeyType() {
        return new GS1TradeItemIdentificationKeyType();
    }

    /**
     * Create an instance of {@link GS1TradeItemIdentificationKeyTypeCodeType }
     * 
     */
    public GS1TradeItemIdentificationKeyTypeCodeType createGS1TradeItemIdentificationKeyTypeCodeType() {
        return new GS1TradeItemIdentificationKeyTypeCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TradeItemDataCarrierAndIdentificationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TradeItemDataCarrierAndIdentificationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:trade_item_data_carrier_and_identification:xsd:3", name = "tradeItemDataCarrierAndIdentificationModule")
    public JAXBElement<TradeItemDataCarrierAndIdentificationModuleType> createTradeItemDataCarrierAndIdentificationModule(TradeItemDataCarrierAndIdentificationModuleType value) {
        return new JAXBElement<TradeItemDataCarrierAndIdentificationModuleType>(_TradeItemDataCarrierAndIdentificationModule_QNAME, TradeItemDataCarrierAndIdentificationModuleType.class, null, value);
    }

}
