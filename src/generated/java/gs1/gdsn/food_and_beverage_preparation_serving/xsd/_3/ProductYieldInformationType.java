
package gs1.gdsn.food_and_beverage_preparation_serving.xsd._3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for ProductYieldInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductYieldInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productYield" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="productYieldTypeCode" type="{urn:gs1:gdsn:food_and_beverage_preparation_serving:xsd:3}ProductYieldTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="productYieldVariationPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductYieldInformationType", propOrder = {
    "productYield",
    "productYieldTypeCode",
    "productYieldVariationPercentage"
})
public class ProductYieldInformationType {

    protected MeasurementType productYield;
    protected ProductYieldTypeCodeType productYieldTypeCode;
    protected BigDecimal productYieldVariationPercentage;

    /**
     * Gets the value of the productYield property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getProductYield() {
        return productYield;
    }

    /**
     * Sets the value of the productYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setProductYield(MeasurementType value) {
        this.productYield = value;
    }

    /**
     * Gets the value of the productYieldTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProductYieldTypeCodeType }
     *     
     */
    public ProductYieldTypeCodeType getProductYieldTypeCode() {
        return productYieldTypeCode;
    }

    /**
     * Sets the value of the productYieldTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductYieldTypeCodeType }
     *     
     */
    public void setProductYieldTypeCode(ProductYieldTypeCodeType value) {
        this.productYieldTypeCode = value;
    }

    /**
     * Gets the value of the productYieldVariationPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProductYieldVariationPercentage() {
        return productYieldVariationPercentage;
    }

    /**
     * Sets the value of the productYieldVariationPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProductYieldVariationPercentage(BigDecimal value) {
        this.productYieldVariationPercentage = value;
    }

}
