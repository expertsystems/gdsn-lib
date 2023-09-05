
package gs1.gdsn.delivery_purchasing_information.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.delivery_purchasing_information.xsd._3 package. 
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

    private final static QName _DeliveryPurchasingInformationModule_QNAME = new QName("urn:gs1:gdsn:delivery_purchasing_information:xsd:3", "deliveryPurchasingInformationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.delivery_purchasing_information.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeliveryPurchasingInformationModuleType }
     * 
     */
    public DeliveryPurchasingInformationModuleType createDeliveryPurchasingInformationModuleType() {
        return new DeliveryPurchasingInformationModuleType();
    }

    /**
     * Create an instance of {@link DeliveryFrequencyCodeType }
     * 
     */
    public DeliveryFrequencyCodeType createDeliveryFrequencyCodeType() {
        return new DeliveryFrequencyCodeType();
    }

    /**
     * Create an instance of {@link DeliveryPurchasingInformationType }
     * 
     */
    public DeliveryPurchasingInformationType createDeliveryPurchasingInformationType() {
        return new DeliveryPurchasingInformationType();
    }

    /**
     * Create an instance of {@link DistributionDetailsType }
     * 
     */
    public DistributionDetailsType createDistributionDetailsType() {
        return new DistributionDetailsType();
    }

    /**
     * Create an instance of {@link OrderableReturnableConditionsCodeType }
     * 
     */
    public OrderableReturnableConditionsCodeType createOrderableReturnableConditionsCodeType() {
        return new OrderableReturnableConditionsCodeType();
    }

    /**
     * Create an instance of {@link OrderableReturnableInformationType }
     * 
     */
    public OrderableReturnableInformationType createOrderableReturnableInformationType() {
        return new OrderableReturnableInformationType();
    }

    /**
     * Create an instance of {@link RightOfReturnForNonSoldTradeItemCodeType }
     * 
     */
    public RightOfReturnForNonSoldTradeItemCodeType createRightOfReturnForNonSoldTradeItemCodeType() {
        return new RightOfReturnForNonSoldTradeItemCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryPurchasingInformationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeliveryPurchasingInformationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:delivery_purchasing_information:xsd:3", name = "deliveryPurchasingInformationModule")
    public JAXBElement<DeliveryPurchasingInformationModuleType> createDeliveryPurchasingInformationModule(DeliveryPurchasingInformationModuleType value) {
        return new JAXBElement<DeliveryPurchasingInformationModuleType>(_DeliveryPurchasingInformationModule_QNAME, DeliveryPurchasingInformationModuleType.class, null, value);
    }

}
