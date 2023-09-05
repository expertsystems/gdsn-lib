
package gs1.gdsn.material.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.material.xsd._3 package. 
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

    private final static QName _MaterialModule_QNAME = new QName("urn:gs1:gdsn:material:xsd:3", "materialModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.material.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MaterialModuleType }
     * 
     */
    public MaterialModuleType createMaterialModuleType() {
        return new MaterialModuleType();
    }

    /**
     * Create an instance of {@link MaterialCompositionType }
     * 
     */
    public MaterialCompositionType createMaterialCompositionType() {
        return new MaterialCompositionType();
    }

    /**
     * Create an instance of {@link MaterialDensityCodeType }
     * 
     */
    public MaterialDensityCodeType createMaterialDensityCodeType() {
        return new MaterialDensityCodeType();
    }

    /**
     * Create an instance of {@link MaterialType }
     * 
     */
    public MaterialType createMaterialType() {
        return new MaterialType();
    }

    /**
     * Create an instance of {@link TradeItemMaterialDesignationCodeType }
     * 
     */
    public TradeItemMaterialDesignationCodeType createTradeItemMaterialDesignationCodeType() {
        return new TradeItemMaterialDesignationCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaterialModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MaterialModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:material:xsd:3", name = "materialModule")
    public JAXBElement<MaterialModuleType> createMaterialModule(MaterialModuleType value) {
        return new JAXBElement<MaterialModuleType>(_MaterialModule_QNAME, MaterialModuleType.class, null, value);
    }

}
