
package gs1.gdsn.food_and_beverage_preparation_serving.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description2500Type;


/**
 * <p>Java class for ProductPreparationTextureInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductPreparationTextureInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productTexturalCharacteristics" type="{urn:gs1:shared:shared_common:xsd:3}Description2500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productTextureCode" type="{urn:gs1:gdsn:food_and_beverage_preparation_serving:xsd:3}ProductTextureCodeType" minOccurs="0"/&gt;
 *         &lt;element name="productTextureAgencyCode" type="{urn:gs1:gdsn:food_and_beverage_preparation_serving:xsd:3}ProductTextureAgencyCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductPreparationTextureInformationType", propOrder = {
    "productTexturalCharacteristics",
    "productTextureCode",
    "productTextureAgencyCode"
})
public class ProductPreparationTextureInformationType {

    protected List<Description2500Type> productTexturalCharacteristics;
    protected ProductTextureCodeType productTextureCode;
    protected ProductTextureAgencyCodeType productTextureAgencyCode;

    /**
     * Gets the value of the productTexturalCharacteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productTexturalCharacteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductTexturalCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description2500Type }
     * 
     * 
     */
    public List<Description2500Type> getProductTexturalCharacteristics() {
        if (productTexturalCharacteristics == null) {
            productTexturalCharacteristics = new ArrayList<Description2500Type>();
        }
        return this.productTexturalCharacteristics;
    }

    /**
     * Gets the value of the productTextureCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTextureCodeType }
     *     
     */
    public ProductTextureCodeType getProductTextureCode() {
        return productTextureCode;
    }

    /**
     * Sets the value of the productTextureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTextureCodeType }
     *     
     */
    public void setProductTextureCode(ProductTextureCodeType value) {
        this.productTextureCode = value;
    }

    /**
     * Gets the value of the productTextureAgencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTextureAgencyCodeType }
     *     
     */
    public ProductTextureAgencyCodeType getProductTextureAgencyCode() {
        return productTextureAgencyCode;
    }

    /**
     * Sets the value of the productTextureAgencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTextureAgencyCodeType }
     *     
     */
    public void setProductTextureAgencyCode(ProductTextureAgencyCodeType value) {
        this.productTextureAgencyCode = value;
    }

}
