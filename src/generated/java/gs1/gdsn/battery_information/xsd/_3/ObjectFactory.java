
package gs1.gdsn.battery_information.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.battery_information.xsd._3 package. 
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

    private final static QName _BatteryInformationModule_QNAME = new QName("urn:gs1:gdsn:battery_information:xsd:3", "batteryInformationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.battery_information.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BatteryInformationModuleType }
     * 
     */
    public BatteryInformationModuleType createBatteryInformationModuleType() {
        return new BatteryInformationModuleType();
    }

    /**
     * Create an instance of {@link BatteryDetailType }
     * 
     */
    public BatteryDetailType createBatteryDetailType() {
        return new BatteryDetailType();
    }

    /**
     * Create an instance of {@link BatteryTechnologyTypeCodeType }
     * 
     */
    public BatteryTechnologyTypeCodeType createBatteryTechnologyTypeCodeType() {
        return new BatteryTechnologyTypeCodeType();
    }

    /**
     * Create an instance of {@link BatteryTypeCodeType }
     * 
     */
    public BatteryTypeCodeType createBatteryTypeCodeType() {
        return new BatteryTypeCodeType();
    }

    /**
     * Create an instance of {@link BatteryTypeQualifierCodeType }
     * 
     */
    public BatteryTypeQualifierCodeType createBatteryTypeQualifierCodeType() {
        return new BatteryTypeQualifierCodeType();
    }

    /**
     * Create an instance of {@link PowerSupplyTypeCodeType }
     * 
     */
    public PowerSupplyTypeCodeType createPowerSupplyTypeCodeType() {
        return new PowerSupplyTypeCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatteryInformationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BatteryInformationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:battery_information:xsd:3", name = "batteryInformationModule")
    public JAXBElement<BatteryInformationModuleType> createBatteryInformationModule(BatteryInformationModuleType value) {
        return new JAXBElement<BatteryInformationModuleType>(_BatteryInformationModule_QNAME, BatteryInformationModuleType.class, null, value);
    }

}
