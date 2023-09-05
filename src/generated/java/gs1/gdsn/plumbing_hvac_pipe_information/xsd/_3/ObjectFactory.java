
package gs1.gdsn.plumbing_hvac_pipe_information.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.plumbing_hvac_pipe_information.xsd._3 package. 
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

    private final static QName _PlumbingHVACPipeInformationModule_QNAME = new QName("urn:gs1:gdsn:plumbing_hvac_pipe_information:xsd:3", "plumbingHVACPipeInformationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.plumbing_hvac_pipe_information.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PlumbingHVACPipeInformationModuleType }
     * 
     */
    public PlumbingHVACPipeInformationModuleType createPlumbingHVACPipeInformationModuleType() {
        return new PlumbingHVACPipeInformationModuleType();
    }

    /**
     * Create an instance of {@link BendAngleCodeType }
     * 
     */
    public BendAngleCodeType createBendAngleCodeType() {
        return new BendAngleCodeType();
    }

    /**
     * Create an instance of {@link MeshMaterialCodeType }
     * 
     */
    public MeshMaterialCodeType createMeshMaterialCodeType() {
        return new MeshMaterialCodeType();
    }

    /**
     * Create an instance of {@link MeshSizeCodeType }
     * 
     */
    public MeshSizeCodeType createMeshSizeCodeType() {
        return new MeshSizeCodeType();
    }

    /**
     * Create an instance of {@link PlumbingControlTypeCodeType }
     * 
     */
    public PlumbingControlTypeCodeType createPlumbingControlTypeCodeType() {
        return new PlumbingControlTypeCodeType();
    }

    /**
     * Create an instance of {@link PlumbingHVACConnectionAgencyCodeType }
     * 
     */
    public PlumbingHVACConnectionAgencyCodeType createPlumbingHVACConnectionAgencyCodeType() {
        return new PlumbingHVACConnectionAgencyCodeType();
    }

    /**
     * Create an instance of {@link PlumbingHVACConnectionTypeCodeType }
     * 
     */
    public PlumbingHVACConnectionTypeCodeType createPlumbingHVACConnectionTypeCodeType() {
        return new PlumbingHVACConnectionTypeCodeType();
    }

    /**
     * Create an instance of {@link PlumbingHVACPipeInformationType }
     * 
     */
    public PlumbingHVACPipeInformationType createPlumbingHVACPipeInformationType() {
        return new PlumbingHVACPipeInformationType();
    }

    /**
     * Create an instance of {@link ThreadTypeCodeType }
     * 
     */
    public ThreadTypeCodeType createThreadTypeCodeType() {
        return new ThreadTypeCodeType();
    }

    /**
     * Create an instance of {@link TradeItemMeshInformationType }
     * 
     */
    public TradeItemMeshInformationType createTradeItemMeshInformationType() {
        return new TradeItemMeshInformationType();
    }

    /**
     * Create an instance of {@link TradeItemWorkingPressureType }
     * 
     */
    public TradeItemWorkingPressureType createTradeItemWorkingPressureType() {
        return new TradeItemWorkingPressureType();
    }

    /**
     * Create an instance of {@link WorkingPressureRatingClassCodeType }
     * 
     */
    public WorkingPressureRatingClassCodeType createWorkingPressureRatingClassCodeType() {
        return new WorkingPressureRatingClassCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlumbingHVACPipeInformationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PlumbingHVACPipeInformationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:plumbing_hvac_pipe_information:xsd:3", name = "plumbingHVACPipeInformationModule")
    public JAXBElement<PlumbingHVACPipeInformationModuleType> createPlumbingHVACPipeInformationModule(PlumbingHVACPipeInformationModuleType value) {
        return new JAXBElement<PlumbingHVACPipeInformationModuleType>(_PlumbingHVACPipeInformationModule_QNAME, PlumbingHVACPipeInformationModuleType.class, null, value);
    }

}
