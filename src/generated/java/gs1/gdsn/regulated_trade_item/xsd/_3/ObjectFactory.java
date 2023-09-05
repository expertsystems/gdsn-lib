
package gs1.gdsn.regulated_trade_item.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.regulated_trade_item.xsd._3 package. 
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

    private final static QName _RegulatedTradeItemModule_QNAME = new QName("urn:gs1:gdsn:regulated_trade_item:xsd:3", "regulatedTradeItemModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.regulated_trade_item.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegulatedTradeItemModuleType }
     * 
     */
    public RegulatedTradeItemModuleType createRegulatedTradeItemModuleType() {
        return new RegulatedTradeItemModuleType();
    }

    /**
     * Create an instance of {@link PermitIdentificationType }
     * 
     */
    public PermitIdentificationType createPermitIdentificationType() {
        return new PermitIdentificationType();
    }

    /**
     * Create an instance of {@link RegulationCommunityLevelCodeType }
     * 
     */
    public RegulationCommunityLevelCodeType createRegulationCommunityLevelCodeType() {
        return new RegulationCommunityLevelCodeType();
    }

    /**
     * Create an instance of {@link RegulationTypeCodeType }
     * 
     */
    public RegulationTypeCodeType createRegulationTypeCodeType() {
        return new RegulationTypeCodeType();
    }

    /**
     * Create an instance of {@link RegulatoryActComplianceLevelCodeType }
     * 
     */
    public RegulatoryActComplianceLevelCodeType createRegulatoryActComplianceLevelCodeType() {
        return new RegulatoryActComplianceLevelCodeType();
    }

    /**
     * Create an instance of {@link RegulatoryInformationType }
     * 
     */
    public RegulatoryInformationType createRegulatoryInformationType() {
        return new RegulatoryInformationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegulatedTradeItemModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegulatedTradeItemModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:regulated_trade_item:xsd:3", name = "regulatedTradeItemModule")
    public JAXBElement<RegulatedTradeItemModuleType> createRegulatedTradeItemModule(RegulatedTradeItemModuleType value) {
        return new JAXBElement<RegulatedTradeItemModuleType>(_RegulatedTradeItemModule_QNAME, RegulatedTradeItemModuleType.class, null, value);
    }

}
