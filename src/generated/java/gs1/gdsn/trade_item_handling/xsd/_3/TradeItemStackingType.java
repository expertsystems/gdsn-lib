
package gs1.gdsn.trade_item_handling.xsd._3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for TradeItemStackingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemStackingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stackingFactor" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="stackingFactorTypeCode" type="{urn:gs1:gdsn:trade_item_handling:xsd:3}StackingFactorTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="stackingWeightMaximum" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="stackingPatternTypeCode" type="{urn:gs1:gdsn:trade_item_handling:xsd:3}StackingPatternTypeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemStackingType", propOrder = {
    "stackingFactor",
    "stackingFactorTypeCode",
    "stackingWeightMaximum",
    "stackingPatternTypeCode"
})
public class TradeItemStackingType {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger stackingFactor;
    protected StackingFactorTypeCodeType stackingFactorTypeCode;
    protected MeasurementType stackingWeightMaximum;
    protected StackingPatternTypeCodeType stackingPatternTypeCode;

    /**
     * Gets the value of the stackingFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStackingFactor() {
        return stackingFactor;
    }

    /**
     * Sets the value of the stackingFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStackingFactor(BigInteger value) {
        this.stackingFactor = value;
    }

    /**
     * Gets the value of the stackingFactorTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link StackingFactorTypeCodeType }
     *     
     */
    public StackingFactorTypeCodeType getStackingFactorTypeCode() {
        return stackingFactorTypeCode;
    }

    /**
     * Sets the value of the stackingFactorTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StackingFactorTypeCodeType }
     *     
     */
    public void setStackingFactorTypeCode(StackingFactorTypeCodeType value) {
        this.stackingFactorTypeCode = value;
    }

    /**
     * Gets the value of the stackingWeightMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getStackingWeightMaximum() {
        return stackingWeightMaximum;
    }

    /**
     * Sets the value of the stackingWeightMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setStackingWeightMaximum(MeasurementType value) {
        this.stackingWeightMaximum = value;
    }

    /**
     * Gets the value of the stackingPatternTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link StackingPatternTypeCodeType }
     *     
     */
    public StackingPatternTypeCodeType getStackingPatternTypeCode() {
        return stackingPatternTypeCode;
    }

    /**
     * Sets the value of the stackingPatternTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StackingPatternTypeCodeType }
     *     
     */
    public void setStackingPatternTypeCode(StackingPatternTypeCodeType value) {
        this.stackingPatternTypeCode = value;
    }

}
