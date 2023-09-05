
package gs1.gdsn.trade_item_size.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.trade_item_size.xsd._3 package. 
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

    private final static QName _TradeItemSizeModule_QNAME = new QName("urn:gs1:gdsn:trade_item_size:xsd:3", "tradeItemSizeModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.trade_item_size.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TradeItemSizeModuleType }
     * 
     */
    public TradeItemSizeModuleType createTradeItemSizeModuleType() {
        return new TradeItemSizeModuleType();
    }

    /**
     * Create an instance of {@link NonPackagedSizeDimensionType }
     * 
     */
    public NonPackagedSizeDimensionType createNonPackagedSizeDimensionType() {
        return new NonPackagedSizeDimensionType();
    }

    /**
     * Create an instance of {@link SizeGroupCodeType }
     * 
     */
    public SizeGroupCodeType createSizeGroupCodeType() {
        return new SizeGroupCodeType();
    }

    /**
     * Create an instance of {@link SizeSystemCodeType }
     * 
     */
    public SizeSystemCodeType createSizeSystemCodeType() {
        return new SizeSystemCodeType();
    }

    /**
     * Create an instance of {@link SizeTypeCodeType }
     * 
     */
    public SizeTypeCodeType createSizeTypeCodeType() {
        return new SizeTypeCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TradeItemSizeModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TradeItemSizeModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:trade_item_size:xsd:3", name = "tradeItemSizeModule")
    public JAXBElement<TradeItemSizeModuleType> createTradeItemSizeModule(TradeItemSizeModuleType value) {
        return new JAXBElement<TradeItemSizeModuleType>(_TradeItemSizeModule_QNAME, TradeItemSizeModuleType.class, null, value);
    }

}
