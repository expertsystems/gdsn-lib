
package gs1.gdsn.packaging_marking.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.packaging_marking.xsd._3 package. 
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

    private final static QName _PackagingMarkingModule_QNAME = new QName("urn:gs1:gdsn:packaging_marking:xsd:3", "packagingMarkingModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.packaging_marking.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PackagingMarkingModuleType }
     * 
     */
    public PackagingMarkingModuleType createPackagingMarkingModuleType() {
        return new PackagingMarkingModuleType();
    }

    /**
     * Create an instance of {@link ConsumerWarningInformationType }
     * 
     */
    public ConsumerWarningInformationType createConsumerWarningInformationType() {
        return new ConsumerWarningInformationType();
    }

    /**
     * Create an instance of {@link ConsumerWarningTypeCodeType }
     * 
     */
    public ConsumerWarningTypeCodeType createConsumerWarningTypeCodeType() {
        return new ConsumerWarningTypeCodeType();
    }

    /**
     * Create an instance of {@link DateOnPackagingFormatTypeCodeType }
     * 
     */
    public DateOnPackagingFormatTypeCodeType createDateOnPackagingFormatTypeCodeType() {
        return new DateOnPackagingFormatTypeCodeType();
    }

    /**
     * Create an instance of {@link PackagingDateType }
     * 
     */
    public PackagingDateType createPackagingDateType() {
        return new PackagingDateType();
    }

    /**
     * Create an instance of {@link PackagingMarkedLabelAccreditationCodeType }
     * 
     */
    public PackagingMarkedLabelAccreditationCodeType createPackagingMarkedLabelAccreditationCodeType() {
        return new PackagingMarkedLabelAccreditationCodeType();
    }

    /**
     * Create an instance of {@link PackagingMarkingType }
     * 
     */
    public PackagingMarkingType createPackagingMarkingType() {
        return new PackagingMarkingType();
    }

    /**
     * Create an instance of {@link SerialNumberLocationCodeType }
     * 
     */
    public SerialNumberLocationCodeType createSerialNumberLocationCodeType() {
        return new SerialNumberLocationCodeType();
    }

    /**
     * Create an instance of {@link TradeItemDateOnPackagingTypeCodeType }
     * 
     */
    public TradeItemDateOnPackagingTypeCodeType createTradeItemDateOnPackagingTypeCodeType() {
        return new TradeItemDateOnPackagingTypeCodeType();
    }

    /**
     * Create an instance of {@link TradeItemIdentificationMarkingType }
     * 
     */
    public TradeItemIdentificationMarkingType createTradeItemIdentificationMarkingType() {
        return new TradeItemIdentificationMarkingType();
    }

    /**
     * Create an instance of {@link TradeItemIdentificationMarkingTypeCodeType }
     * 
     */
    public TradeItemIdentificationMarkingTypeCodeType createTradeItemIdentificationMarkingTypeCodeType() {
        return new TradeItemIdentificationMarkingTypeCodeType();
    }

    /**
     * Create an instance of {@link TypeOfProductChangesAfterDateCodeType }
     * 
     */
    public TypeOfProductChangesAfterDateCodeType createTypeOfProductChangesAfterDateCodeType() {
        return new TypeOfProductChangesAfterDateCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagingMarkingModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PackagingMarkingModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:packaging_marking:xsd:3", name = "packagingMarkingModule")
    public JAXBElement<PackagingMarkingModuleType> createPackagingMarkingModule(PackagingMarkingModuleType value) {
        return new JAXBElement<PackagingMarkingModuleType>(_PackagingMarkingModule_QNAME, PackagingMarkingModuleType.class, null, value);
    }

}
