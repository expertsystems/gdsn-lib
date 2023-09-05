
package gs1.gdsn.trade_item_description.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.trade_item_description.xsd._3 package. 
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

    private final static QName _TradeItemDescriptionModule_QNAME = new QName("urn:gs1:gdsn:trade_item_description:xsd:3", "tradeItemDescriptionModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.trade_item_description.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TradeItemDescriptionModuleType }
     * 
     */
    public TradeItemDescriptionModuleType createTradeItemDescriptionModuleType() {
        return new TradeItemDescriptionModuleType();
    }

    /**
     * Create an instance of {@link BrandNameInformationType }
     * 
     */
    public BrandNameInformationType createBrandNameInformationType() {
        return new BrandNameInformationType();
    }

    /**
     * Create an instance of {@link EContentEnvironmentTypeCodeType }
     * 
     */
    public EContentEnvironmentTypeCodeType createEContentEnvironmentTypeCodeType() {
        return new EContentEnvironmentTypeCodeType();
    }

    /**
     * Create an instance of {@link OpacityTypeCodeType }
     * 
     */
    public OpacityTypeCodeType createOpacityTypeCodeType() {
        return new OpacityTypeCodeType();
    }

    /**
     * Create an instance of {@link TradeItemDescriptionInformationType }
     * 
     */
    public TradeItemDescriptionInformationType createTradeItemDescriptionInformationType() {
        return new TradeItemDescriptionInformationType();
    }

    /**
     * Create an instance of {@link TradeItemEcontentType }
     * 
     */
    public TradeItemEcontentType createTradeItemEcontentType() {
        return new TradeItemEcontentType();
    }

    /**
     * Create an instance of {@link TradeItemFormCodeType }
     * 
     */
    public TradeItemFormCodeType createTradeItemFormCodeType() {
        return new TradeItemFormCodeType();
    }

    /**
     * Create an instance of {@link TradeItemVariantType }
     * 
     */
    public TradeItemVariantType createTradeItemVariantType() {
        return new TradeItemVariantType();
    }

    /**
     * Create an instance of {@link TradeItemVariantTypeCodeType }
     * 
     */
    public TradeItemVariantTypeCodeType createTradeItemVariantTypeCodeType() {
        return new TradeItemVariantTypeCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TradeItemDescriptionModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TradeItemDescriptionModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:trade_item_description:xsd:3", name = "tradeItemDescriptionModule")
    public JAXBElement<TradeItemDescriptionModuleType> createTradeItemDescriptionModule(TradeItemDescriptionModuleType value) {
        return new JAXBElement<TradeItemDescriptionModuleType>(_TradeItemDescriptionModule_QNAME, TradeItemDescriptionModuleType.class, null, value);
    }

}
