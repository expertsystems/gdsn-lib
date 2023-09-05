
package gs1.gdsn.durable_goods_characteristics.xsd._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gdsn.durable_goods_characteristics.xsd._3 package. 
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

    private final static QName _DurableGoodsCharacteristicsModule_QNAME = new QName("urn:gs1:gdsn:durable_goods_characteristics:xsd:3", "durableGoodsCharacteristicsModule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gdsn.durable_goods_characteristics.xsd._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DurableGoodsCharacteristicsModuleType }
     * 
     */
    public DurableGoodsCharacteristicsModuleType createDurableGoodsCharacteristicsModuleType() {
        return new DurableGoodsCharacteristicsModuleType();
    }

    /**
     * Create an instance of {@link DurableGoodsCharacteristicsType }
     * 
     */
    public DurableGoodsCharacteristicsType createDurableGoodsCharacteristicsType() {
        return new DurableGoodsCharacteristicsType();
    }

    /**
     * Create an instance of {@link ItemMountingInformationType }
     * 
     */
    public ItemMountingInformationType createItemMountingInformationType() {
        return new ItemMountingInformationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DurableGoodsCharacteristicsModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DurableGoodsCharacteristicsModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:gs1:gdsn:durable_goods_characteristics:xsd:3", name = "durableGoodsCharacteristicsModule")
    public JAXBElement<DurableGoodsCharacteristicsModuleType> createDurableGoodsCharacteristicsModule(DurableGoodsCharacteristicsModuleType value) {
        return new JAXBElement<DurableGoodsCharacteristicsModuleType>(_DurableGoodsCharacteristicsModule_QNAME, DurableGoodsCharacteristicsModuleType.class, null, value);
    }

}
