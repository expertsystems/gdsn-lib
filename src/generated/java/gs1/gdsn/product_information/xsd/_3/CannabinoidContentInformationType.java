
package gs1.gdsn.product_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for CannabinoidContentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CannabinoidContentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cannabinoidContentCode" type="{urn:gs1:gdsn:product_information:xsd:3}CannabinoidContentCodeType" minOccurs="0"/&gt;
 *         &lt;element name="cannabinoidMaximumRangeValue" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="cannabinoidMinimumRangeValue" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CannabinoidContentInformationType", propOrder = {
    "cannabinoidContentCode",
    "cannabinoidMaximumRangeValue",
    "cannabinoidMinimumRangeValue"
})
public class CannabinoidContentInformationType {

    protected CannabinoidContentCodeType cannabinoidContentCode;
    protected MeasurementType cannabinoidMaximumRangeValue;
    protected MeasurementType cannabinoidMinimumRangeValue;

    /**
     * Gets the value of the cannabinoidContentCode property.
     * 
     * @return
     *     possible object is
     *     {@link CannabinoidContentCodeType }
     *     
     */
    public CannabinoidContentCodeType getCannabinoidContentCode() {
        return cannabinoidContentCode;
    }

    /**
     * Sets the value of the cannabinoidContentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CannabinoidContentCodeType }
     *     
     */
    public void setCannabinoidContentCode(CannabinoidContentCodeType value) {
        this.cannabinoidContentCode = value;
    }

    /**
     * Gets the value of the cannabinoidMaximumRangeValue property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getCannabinoidMaximumRangeValue() {
        return cannabinoidMaximumRangeValue;
    }

    /**
     * Sets the value of the cannabinoidMaximumRangeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setCannabinoidMaximumRangeValue(MeasurementType value) {
        this.cannabinoidMaximumRangeValue = value;
    }

    /**
     * Gets the value of the cannabinoidMinimumRangeValue property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getCannabinoidMinimumRangeValue() {
        return cannabinoidMinimumRangeValue;
    }

    /**
     * Sets the value of the cannabinoidMinimumRangeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setCannabinoidMinimumRangeValue(MeasurementType value) {
        this.cannabinoidMinimumRangeValue = value;
    }

}
