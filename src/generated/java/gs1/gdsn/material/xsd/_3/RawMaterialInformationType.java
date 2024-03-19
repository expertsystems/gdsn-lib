
package gs1.gdsn.material.xsd._3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RawMaterialInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RawMaterialInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rawMaterialContentPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="rawMaterialCode" type="{urn:gs1:gdsn:material:xsd:3}RawMaterialCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RawMaterialInformationType", propOrder = {
    "rawMaterialContentPercentage",
    "rawMaterialCode"
})
public class RawMaterialInformationType {

    protected BigDecimal rawMaterialContentPercentage;
    protected RawMaterialCodeType rawMaterialCode;

    /**
     * Gets the value of the rawMaterialContentPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRawMaterialContentPercentage() {
        return rawMaterialContentPercentage;
    }

    /**
     * Sets the value of the rawMaterialContentPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRawMaterialContentPercentage(BigDecimal value) {
        this.rawMaterialContentPercentage = value;
    }

    /**
     * Gets the value of the rawMaterialCode property.
     * 
     * @return
     *     possible object is
     *     {@link RawMaterialCodeType }
     *     
     */
    public RawMaterialCodeType getRawMaterialCode() {
        return rawMaterialCode;
    }

    /**
     * Sets the value of the rawMaterialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RawMaterialCodeType }
     *     
     */
    public void setRawMaterialCode(RawMaterialCodeType value) {
        this.rawMaterialCode = value;
    }

}
