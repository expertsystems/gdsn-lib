
package gs1.gdsn.textile_material.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.textile_material.xsd._3 package. 
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

    private final static QName _TextileMaterialModule_QNAME = new QName("urn:gs1:gdsn:textile_material:xsd:3", "textileMaterialModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.textile_material.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TextileMaterialModuleType }
     * 
     */
    public TextileMaterialModuleType createTextileMaterialModuleType() {
        return new TextileMaterialModuleType();
    }

    /**
     * Create an instance of {@link MaterialDensityCodeType }
     * 
     */
    public MaterialDensityCodeType createMaterialDensityCodeType() {
        return new MaterialDensityCodeType();
    }

    /**
     * Create an instance of {@link TextileMaterialCompositionType }
     * 
     */
    public TextileMaterialCompositionType createTextileMaterialCompositionType() {
        return new TextileMaterialCompositionType();
    }

    /**
     * Create an instance of {@link TextileMaterialType }
     * 
     */
    public TextileMaterialType createTextileMaterialType() {
        return new TextileMaterialType();
    }

    /**
     * Create an instance of {@link TradeItemMaterialDesignationCodeType }
     * 
     */
    public TradeItemMaterialDesignationCodeType createTradeItemMaterialDesignationCodeType() {
        return new TradeItemMaterialDesignationCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextileMaterialModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TextileMaterialModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:textile_material:xsd:3", name = "textileMaterialModule")
    public JAXBElement<TextileMaterialModuleType> createTextileMaterialModule(TextileMaterialModuleType value) {
        return new JAXBElement<TextileMaterialModuleType>(_TextileMaterialModule_QNAME, TextileMaterialModuleType.class, null, value);
    }

}
