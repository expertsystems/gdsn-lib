
package gs1.gdsn.trade_item_lifespan.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.trade_item_lifespan.xsd._3 package. 
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

    private final static QName _TradeItemLifespanModule_QNAME = new QName("urn:gs1:gdsn:trade_item_lifespan:xsd:3", "tradeItemLifespanModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.trade_item_lifespan.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TradeItemLifespanModuleType }
     * 
     */
    public TradeItemLifespanModuleType createTradeItemLifespanModuleType() {
        return new TradeItemLifespanModuleType();
    }

    /**
     * Create an instance of {@link TradeItemLifespanType }
     * 
     */
    public TradeItemLifespanType createTradeItemLifespanType() {
        return new TradeItemLifespanType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TradeItemLifespanModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TradeItemLifespanModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:trade_item_lifespan:xsd:3", name = "tradeItemLifespanModule")
    public JAXBElement<TradeItemLifespanModuleType> createTradeItemLifespanModule(TradeItemLifespanModuleType value) {
        return new JAXBElement<TradeItemLifespanModuleType>(_TradeItemLifespanModule_QNAME, TradeItemLifespanModuleType.class, null, value);
    }

}
