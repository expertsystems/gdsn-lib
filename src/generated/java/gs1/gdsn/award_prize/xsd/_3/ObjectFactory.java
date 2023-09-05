
package gs1.gdsn.award_prize.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.award_prize.xsd._3 package. 
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

    private final static QName _AwardPrizeModule_QNAME = new QName("urn:gs1:gdsn:award_prize:xsd:3", "awardPrizeModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.award_prize.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AwardPrizeModuleType }
     * 
     */
    public AwardPrizeModuleType createAwardPrizeModuleType() {
        return new AwardPrizeModuleType();
    }

    /**
     * Create an instance of {@link AwardPrizeType }
     * 
     */
    public AwardPrizeType createAwardPrizeType() {
        return new AwardPrizeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AwardPrizeModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AwardPrizeModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:award_prize:xsd:3", name = "awardPrizeModule")
    public JAXBElement<AwardPrizeModuleType> createAwardPrizeModule(AwardPrizeModuleType value) {
        return new JAXBElement<AwardPrizeModuleType>(_AwardPrizeModule_QNAME, AwardPrizeModuleType.class, null, value);
    }

}
