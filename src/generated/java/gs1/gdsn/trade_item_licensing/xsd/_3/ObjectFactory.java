
package gs1.gdsn.trade_item_licensing.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.trade_item_licensing.xsd._3 package. 
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

    private final static QName _TradeItemLicensingModule_QNAME = new QName("urn:gs1:gdsn:trade_item_licensing:xsd:3", "tradeItemLicensingModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.trade_item_licensing.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TradeItemLicensingModuleType }
     * 
     */
    public TradeItemLicensingModuleType createTradeItemLicensingModuleType() {
        return new TradeItemLicensingModuleType();
    }

    /**
     * Create an instance of {@link LicenseCodeType }
     * 
     */
    public LicenseCodeType createLicenseCodeType() {
        return new LicenseCodeType();
    }

    /**
     * Create an instance of {@link TradeItemLicenseDetailType }
     * 
     */
    public TradeItemLicenseDetailType createTradeItemLicenseDetailType() {
        return new TradeItemLicenseDetailType();
    }

    /**
     * Create an instance of {@link TradeItemLicenseEffectiveDateInformationType }
     * 
     */
    public TradeItemLicenseEffectiveDateInformationType createTradeItemLicenseEffectiveDateInformationType() {
        return new TradeItemLicenseEffectiveDateInformationType();
    }

    /**
     * Create an instance of {@link TradeItemLicenseType }
     * 
     */
    public TradeItemLicenseType createTradeItemLicenseType() {
        return new TradeItemLicenseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TradeItemLicensingModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TradeItemLicensingModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:trade_item_licensing:xsd:3", name = "tradeItemLicensingModule")
    public JAXBElement<TradeItemLicensingModuleType> createTradeItemLicensingModule(TradeItemLicensingModuleType value) {
        return new JAXBElement<TradeItemLicensingModuleType>(_TradeItemLicensingModule_QNAME, TradeItemLicensingModuleType.class, null, value);
    }

}
