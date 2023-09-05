
package gs1.gdsn.marketing_information.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.marketing_information.xsd._3 package. 
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

    private final static QName _MarketingInformationModule_QNAME = new QName("urn:gs1:gdsn:marketing_information:xsd:3", "marketingInformationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.marketing_information.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MarketingInformationModuleType }
     * 
     */
    public MarketingInformationModuleType createMarketingInformationModuleType() {
        return new MarketingInformationModuleType();
    }

    /**
     * Create an instance of {@link BasicTasteInformationType }
     * 
     */
    public BasicTasteInformationType createBasicTasteInformationType() {
        return new BasicTasteInformationType();
    }

    /**
     * Create an instance of {@link ChannelSpecificMarketingInformationType }
     * 
     */
    public ChannelSpecificMarketingInformationType createChannelSpecificMarketingInformationType() {
        return new ChannelSpecificMarketingInformationType();
    }

    /**
     * Create an instance of {@link MarketingCampaignType }
     * 
     */
    public MarketingCampaignType createMarketingCampaignType() {
        return new MarketingCampaignType();
    }

    /**
     * Create an instance of {@link MarketingInformationType }
     * 
     */
    public MarketingInformationType createMarketingInformationType() {
        return new MarketingInformationType();
    }

    /**
     * Create an instance of {@link SeasonParameterCodeType }
     * 
     */
    public SeasonParameterCodeType createSeasonParameterCodeType() {
        return new SeasonParameterCodeType();
    }

    /**
     * Create an instance of {@link SeasonType }
     * 
     */
    public SeasonType createSeasonType() {
        return new SeasonType();
    }

    /**
     * Create an instance of {@link SpecialItemCodeType }
     * 
     */
    public SpecialItemCodeType createSpecialItemCodeType() {
        return new SpecialItemCodeType();
    }

    /**
     * Create an instance of {@link StrongnessOfBasicTasteCodeType }
     * 
     */
    public StrongnessOfBasicTasteCodeType createStrongnessOfBasicTasteCodeType() {
        return new StrongnessOfBasicTasteCodeType();
    }

    /**
     * Create an instance of {@link TargetConsumerAgeGroupCodeType }
     * 
     */
    public TargetConsumerAgeGroupCodeType createTargetConsumerAgeGroupCodeType() {
        return new TargetConsumerAgeGroupCodeType();
    }

    /**
     * Create an instance of {@link TargetConsumerGenderCodeType }
     * 
     */
    public TargetConsumerGenderCodeType createTargetConsumerGenderCodeType() {
        return new TargetConsumerGenderCodeType();
    }

    /**
     * Create an instance of {@link TargetConsumerType }
     * 
     */
    public TargetConsumerType createTargetConsumerType() {
        return new TargetConsumerType();
    }

    /**
     * Create an instance of {@link TargetConsumerUsageType }
     * 
     */
    public TargetConsumerUsageType createTargetConsumerUsageType() {
        return new TargetConsumerUsageType();
    }

    /**
     * Create an instance of {@link TargetConsumerUsageTypeCodeType }
     * 
     */
    public TargetConsumerUsageTypeCodeType createTargetConsumerUsageTypeCodeType() {
        return new TargetConsumerUsageTypeCodeType();
    }

    /**
     * Create an instance of {@link TradeItemCaseInformationType }
     * 
     */
    public TradeItemCaseInformationType createTradeItemCaseInformationType() {
        return new TradeItemCaseInformationType();
    }

    /**
     * Create an instance of {@link TypeOfBasicTasteCodeType }
     * 
     */
    public TypeOfBasicTasteCodeType createTypeOfBasicTasteCodeType() {
        return new TypeOfBasicTasteCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketingInformationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MarketingInformationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:marketing_information:xsd:3", name = "marketingInformationModule")
    public JAXBElement<MarketingInformationModuleType> createMarketingInformationModule(MarketingInformationModuleType value) {
        return new JAXBElement<MarketingInformationModuleType>(_MarketingInformationModule_QNAME, MarketingInformationModuleType.class, null, value);
    }

}
