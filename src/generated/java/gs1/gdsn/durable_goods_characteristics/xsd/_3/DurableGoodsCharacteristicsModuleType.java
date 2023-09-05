
package gs1.gdsn.durable_goods_characteristics.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DurableGoodsCharacteristicsModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DurableGoodsCharacteristicsModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="durableGoodsCharacteristics" type="{urn:gs1:gdsn:durable_goods_characteristics:xsd:3}DurableGoodsCharacteristicsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DurableGoodsCharacteristicsModuleType", propOrder = {
    "durableGoodsCharacteristics"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:durable_goods_characteristics:xsd:3")
public class DurableGoodsCharacteristicsModuleType {

    protected DurableGoodsCharacteristicsType durableGoodsCharacteristics;

    /**
     * Gets the value of the durableGoodsCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link DurableGoodsCharacteristicsType }
     *     
     */
    public DurableGoodsCharacteristicsType getDurableGoodsCharacteristics() {
        return durableGoodsCharacteristics;
    }

    /**
     * Sets the value of the durableGoodsCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurableGoodsCharacteristicsType }
     *     
     */
    public void setDurableGoodsCharacteristics(DurableGoodsCharacteristicsType value) {
        this.durableGoodsCharacteristics = value;
    }

}
