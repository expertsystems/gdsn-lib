
package gs1.gdsn.trade_item_measurements.xsd._3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeItemOrientationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemOrientationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orientationPreferenceSequence" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="orientationTypeCode" type="{urn:gs1:gdsn:trade_item_measurements:xsd:3}OrientationTypeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemOrientationType", propOrder = {
    "orientationPreferenceSequence",
    "orientationTypeCode"
})
public class TradeItemOrientationType {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger orientationPreferenceSequence;
    protected OrientationTypeCodeType orientationTypeCode;

    /**
     * Gets the value of the orientationPreferenceSequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrientationPreferenceSequence() {
        return orientationPreferenceSequence;
    }

    /**
     * Sets the value of the orientationPreferenceSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrientationPreferenceSequence(BigInteger value) {
        this.orientationPreferenceSequence = value;
    }

    /**
     * Gets the value of the orientationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link OrientationTypeCodeType }
     *     
     */
    public OrientationTypeCodeType getOrientationTypeCode() {
        return orientationTypeCode;
    }

    /**
     * Sets the value of the orientationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrientationTypeCodeType }
     *     
     */
    public void setOrientationTypeCode(OrientationTypeCodeType value) {
        this.orientationTypeCode = value;
    }

}
