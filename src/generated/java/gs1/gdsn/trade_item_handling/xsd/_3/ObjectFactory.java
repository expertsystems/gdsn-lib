
package gs1.gdsn.trade_item_handling.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.trade_item_handling.xsd._3 package. 
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

    private final static QName _TradeItemHandlingModule_QNAME = new QName("urn:gs1:gdsn:trade_item_handling:xsd:3", "tradeItemHandlingModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.trade_item_handling.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TradeItemHandlingModuleType }
     * 
     */
    public TradeItemHandlingModuleType createTradeItemHandlingModuleType() {
        return new TradeItemHandlingModuleType();
    }

    /**
     * Create an instance of {@link StackingFactorTypeCodeType }
     * 
     */
    public StackingFactorTypeCodeType createStackingFactorTypeCodeType() {
        return new StackingFactorTypeCodeType();
    }

    /**
     * Create an instance of {@link StackingPatternTypeCodeType }
     * 
     */
    public StackingPatternTypeCodeType createStackingPatternTypeCodeType() {
        return new StackingPatternTypeCodeType();
    }

    /**
     * Create an instance of {@link TradeItemHandlingInformationType }
     * 
     */
    public TradeItemHandlingInformationType createTradeItemHandlingInformationType() {
        return new TradeItemHandlingInformationType();
    }

    /**
     * Create an instance of {@link TradeItemStackingType }
     * 
     */
    public TradeItemStackingType createTradeItemStackingType() {
        return new TradeItemStackingType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TradeItemHandlingModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TradeItemHandlingModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:trade_item_handling:xsd:3", name = "tradeItemHandlingModule")
    public JAXBElement<TradeItemHandlingModuleType> createTradeItemHandlingModule(TradeItemHandlingModuleType value) {
        return new JAXBElement<TradeItemHandlingModuleType>(_TradeItemHandlingModule_QNAME, TradeItemHandlingModuleType.class, null, value);
    }

}
