
package gs1.gdsn.referenced_file_detail_information.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.referenced_file_detail_information.xsd._3 package. 
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

    private final static QName _ReferencedFileDetailInformationModule_QNAME = new QName("urn:gs1:gdsn:referenced_file_detail_information:xsd:3", "referencedFileDetailInformationModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.referenced_file_detail_information.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReferencedFileDetailInformationModuleType }
     * 
     */
    public ReferencedFileDetailInformationModuleType createReferencedFileDetailInformationModuleType() {
        return new ReferencedFileDetailInformationModuleType();
    }

    /**
     * Create an instance of {@link AdditionalCameraAngleCodeType }
     * 
     */
    public AdditionalCameraAngleCodeType createAdditionalCameraAngleCodeType() {
        return new AdditionalCameraAngleCodeType();
    }

    /**
     * Create an instance of {@link FileCameraPerspectiveCodeType }
     * 
     */
    public FileCameraPerspectiveCodeType createFileCameraPerspectiveCodeType() {
        return new FileCameraPerspectiveCodeType();
    }

    /**
     * Create an instance of {@link FileColourSchemeCodeType }
     * 
     */
    public FileColourSchemeCodeType createFileColourSchemeCodeType() {
        return new FileColourSchemeCodeType();
    }

    /**
     * Create an instance of {@link FileContentInformationType }
     * 
     */
    public FileContentInformationType createFileContentInformationType() {
        return new FileContentInformationType();
    }

    /**
     * Create an instance of {@link FileUsageInformationType }
     * 
     */
    public FileUsageInformationType createFileUsageInformationType() {
        return new FileUsageInformationType();
    }

    /**
     * Create an instance of {@link ItemDepictionCodeType }
     * 
     */
    public ItemDepictionCodeType createItemDepictionCodeType() {
        return new ItemDepictionCodeType();
    }

    /**
     * Create an instance of {@link ItemPositionCodeType }
     * 
     */
    public ItemPositionCodeType createItemPositionCodeType() {
        return new ItemPositionCodeType();
    }

    /**
     * Create an instance of {@link ReferencedFileDetailType }
     * 
     */
    public ReferencedFileDetailType createReferencedFileDetailType() {
        return new ReferencedFileDetailType();
    }

    /**
     * Create an instance of {@link ReferencedFileHeaderType }
     * 
     */
    public ReferencedFileHeaderType createReferencedFileHeaderType() {
        return new ReferencedFileHeaderType();
    }

    /**
     * Create an instance of {@link VerticalCameraAngleCodeType }
     * 
     */
    public VerticalCameraAngleCodeType createVerticalCameraAngleCodeType() {
        return new VerticalCameraAngleCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferencedFileDetailInformationModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReferencedFileDetailInformationModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:referenced_file_detail_information:xsd:3", name = "referencedFileDetailInformationModule")
    public JAXBElement<ReferencedFileDetailInformationModuleType> createReferencedFileDetailInformationModule(ReferencedFileDetailInformationModuleType value) {
        return new JAXBElement<ReferencedFileDetailInformationModuleType>(_ReferencedFileDetailInformationModule_QNAME, ReferencedFileDetailInformationModuleType.class, null, value);
    }

}
