
package gs1.gdsn.packaging_information.xsd._3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackagingRawMaterialInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingRawMaterialInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packagingRawMaterialCode" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackagingRawMaterialCodeType" minOccurs="0"/&gt;
 *         &lt;element name="packagingRawMaterialContentPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingRawMaterialInformationType", propOrder = {
    "packagingRawMaterialCode",
    "packagingRawMaterialContentPercentage"
})
public class PackagingRawMaterialInformationType {

    protected PackagingRawMaterialCodeType packagingRawMaterialCode;
    protected BigDecimal packagingRawMaterialContentPercentage;

    /**
     * Gets the value of the packagingRawMaterialCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingRawMaterialCodeType }
     *     
     */
    public PackagingRawMaterialCodeType getPackagingRawMaterialCode() {
        return packagingRawMaterialCode;
    }

    /**
     * Sets the value of the packagingRawMaterialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingRawMaterialCodeType }
     *     
     */
    public void setPackagingRawMaterialCode(PackagingRawMaterialCodeType value) {
        this.packagingRawMaterialCode = value;
    }

    /**
     * Gets the value of the packagingRawMaterialContentPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPackagingRawMaterialContentPercentage() {
        return packagingRawMaterialContentPercentage;
    }

    /**
     * Sets the value of the packagingRawMaterialContentPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPackagingRawMaterialContentPercentage(BigDecimal value) {
        this.packagingRawMaterialContentPercentage = value;
    }

}
