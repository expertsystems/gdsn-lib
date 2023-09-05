
package gs1.gdsn.trade_item_measurements.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.trade_item_measurements.xsd._3 package. 
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

    private final static QName _TradeItemMeasurementsModule_QNAME = new QName("urn:gs1:gdsn:trade_item_measurements:xsd:3", "tradeItemMeasurementsModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.trade_item_measurements.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TradeItemMeasurementsModuleType }
     * 
     */
    public TradeItemMeasurementsModuleType createTradeItemMeasurementsModuleType() {
        return new TradeItemMeasurementsModuleType();
    }

    /**
     * Create an instance of {@link FrontFaceTypeCodeType }
     * 
     */
    public FrontFaceTypeCodeType createFrontFaceTypeCodeType() {
        return new FrontFaceTypeCodeType();
    }

    /**
     * Create an instance of {@link NestingDirectionCodeType }
     * 
     */
    public NestingDirectionCodeType createNestingDirectionCodeType() {
        return new NestingDirectionCodeType();
    }

    /**
     * Create an instance of {@link NestingTypeCodeType }
     * 
     */
    public NestingTypeCodeType createNestingTypeCodeType() {
        return new NestingTypeCodeType();
    }

    /**
     * Create an instance of {@link OrientationTypeCodeType }
     * 
     */
    public OrientationTypeCodeType createOrientationTypeCodeType() {
        return new OrientationTypeCodeType();
    }

    /**
     * Create an instance of {@link PegHoleTypeCodeType }
     * 
     */
    public PegHoleTypeCodeType createPegHoleTypeCodeType() {
        return new PegHoleTypeCodeType();
    }

    /**
     * Create an instance of {@link PegMeasurementsType }
     * 
     */
    public PegMeasurementsType createPegMeasurementsType() {
        return new PegMeasurementsType();
    }

    /**
     * Create an instance of {@link TradeItemMeasurementsType }
     * 
     */
    public TradeItemMeasurementsType createTradeItemMeasurementsType() {
        return new TradeItemMeasurementsType();
    }

    /**
     * Create an instance of {@link TradeItemNestingType }
     * 
     */
    public TradeItemNestingType createTradeItemNestingType() {
        return new TradeItemNestingType();
    }

    /**
     * Create an instance of {@link TradeItemOrientationType }
     * 
     */
    public TradeItemOrientationType createTradeItemOrientationType() {
        return new TradeItemOrientationType();
    }

    /**
     * Create an instance of {@link TradeItemWeightType }
     * 
     */
    public TradeItemWeightType createTradeItemWeightType() {
        return new TradeItemWeightType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TradeItemMeasurementsModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TradeItemMeasurementsModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:trade_item_measurements:xsd:3", name = "tradeItemMeasurementsModule")
    public JAXBElement<TradeItemMeasurementsModuleType> createTradeItemMeasurementsModule(TradeItemMeasurementsModuleType value) {
        return new JAXBElement<TradeItemMeasurementsModuleType>(_TradeItemMeasurementsModule_QNAME, TradeItemMeasurementsModuleType.class, null, value);
    }

}
