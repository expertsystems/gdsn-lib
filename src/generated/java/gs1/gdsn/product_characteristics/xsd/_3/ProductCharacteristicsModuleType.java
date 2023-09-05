
package gs1.gdsn.product_characteristics.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductCharacteristicsModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductCharacteristicsModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productCharacteristics" type="{urn:gs1:gdsn:product_characteristics:xsd:3}ProductCharacteristicsType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductCharacteristicsModuleType", propOrder = {
    "productCharacteristics"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:product_characteristics:xsd:3")
public class ProductCharacteristicsModuleType {

    @XmlElement(required = true)
    protected List<ProductCharacteristicsType> productCharacteristics;

    /**
     * Gets the value of the productCharacteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCharacteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCharacteristicsType }
     * 
     * 
     */
    public List<ProductCharacteristicsType> getProductCharacteristics() {
        if (productCharacteristics == null) {
            productCharacteristics = new ArrayList<ProductCharacteristicsType>();
        }
        return this.productCharacteristics;
    }

}
