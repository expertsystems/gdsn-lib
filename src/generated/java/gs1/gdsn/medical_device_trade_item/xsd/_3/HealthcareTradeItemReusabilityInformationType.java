
package gs1.gdsn.medical_device_trade_item.xsd._3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description1000Type;


/**
 * <p>Java class for HealthcareTradeItemReusabilityInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HealthcareTradeItemReusabilityInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="manufacturerDeclaredReusabilityTypeCode" type="{urn:gs1:gdsn:medical_device_trade_item:xsd:3}HealthcareTradeItemReusabilityTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="maximumCyclesReusable" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="maximumReusableDays" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="reuseInstructions" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthcareTradeItemReusabilityInformationType", propOrder = {
    "manufacturerDeclaredReusabilityTypeCode",
    "maximumCyclesReusable",
    "maximumReusableDays",
    "reuseInstructions"
})
public class HealthcareTradeItemReusabilityInformationType {

    protected HealthcareTradeItemReusabilityTypeCodeType manufacturerDeclaredReusabilityTypeCode;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumCyclesReusable;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumReusableDays;
    protected Description1000Type reuseInstructions;

    /**
     * Gets the value of the manufacturerDeclaredReusabilityTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link HealthcareTradeItemReusabilityTypeCodeType }
     *     
     */
    public HealthcareTradeItemReusabilityTypeCodeType getManufacturerDeclaredReusabilityTypeCode() {
        return manufacturerDeclaredReusabilityTypeCode;
    }

    /**
     * Sets the value of the manufacturerDeclaredReusabilityTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthcareTradeItemReusabilityTypeCodeType }
     *     
     */
    public void setManufacturerDeclaredReusabilityTypeCode(HealthcareTradeItemReusabilityTypeCodeType value) {
        this.manufacturerDeclaredReusabilityTypeCode = value;
    }

    /**
     * Gets the value of the maximumCyclesReusable property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumCyclesReusable() {
        return maximumCyclesReusable;
    }

    /**
     * Sets the value of the maximumCyclesReusable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumCyclesReusable(BigInteger value) {
        this.maximumCyclesReusable = value;
    }

    /**
     * Gets the value of the maximumReusableDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumReusableDays() {
        return maximumReusableDays;
    }

    /**
     * Sets the value of the maximumReusableDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumReusableDays(BigInteger value) {
        this.maximumReusableDays = value;
    }

    /**
     * Gets the value of the reuseInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link Description1000Type }
     *     
     */
    public Description1000Type getReuseInstructions() {
        return reuseInstructions;
    }

    /**
     * Sets the value of the reuseInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description1000Type }
     *     
     */
    public void setReuseInstructions(Description1000Type value) {
        this.reuseInstructions = value;
    }

}
