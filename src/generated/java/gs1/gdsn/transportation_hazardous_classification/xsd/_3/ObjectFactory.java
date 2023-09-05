
package gs1.gdsn.transportation_hazardous_classification.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.transportation_hazardous_classification.xsd._3 package. 
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

    private final static QName _TransportationHazardousClassificationModule_QNAME = new QName("urn:gs1:gdsn:transportation_hazardous_classification:xsd:3", "transportationHazardousClassificationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.transportation_hazardous_classification.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TransportationHazardousClassificationModuleType }
     * 
     */
    public TransportationHazardousClassificationModuleType createTransportationHazardousClassificationModuleType() {
        return new TransportationHazardousClassificationModuleType();
    }

    /**
     * Create an instance of {@link HazardousMaterialsTransportationModeCodeType }
     * 
     */
    public HazardousMaterialsTransportationModeCodeType createHazardousMaterialsTransportationModeCodeType() {
        return new HazardousMaterialsTransportationModeCodeType();
    }

    /**
     * Create an instance of {@link RegulatedTransportationModeType }
     * 
     */
    public RegulatedTransportationModeType createRegulatedTransportationModeType() {
        return new RegulatedTransportationModeType();
    }

    /**
     * Create an instance of {@link TransportationClassificationType }
     * 
     */
    public TransportationClassificationType createTransportationClassificationType() {
        return new TransportationClassificationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportationHazardousClassificationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransportationHazardousClassificationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:transportation_hazardous_classification:xsd:3", name = "transportationHazardousClassificationModule")
    public JAXBElement<TransportationHazardousClassificationModuleType> createTransportationHazardousClassificationModule(TransportationHazardousClassificationModuleType value) {
        return new JAXBElement<TransportationHazardousClassificationModuleType>(_TransportationHazardousClassificationModule_QNAME, TransportationHazardousClassificationModuleType.class, null, value);
    }

}
