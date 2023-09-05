
package gs1.shared.shared_common.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemperatureRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemperatureRangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maximumTemperature" type="{urn:gs1:shared:shared_common:xsd:3}TemperatureMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="minimumTemperature" type="{urn:gs1:shared:shared_common:xsd:3}TemperatureMeasurementType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemperatureRangeType", propOrder = {
    "maximumTemperature",
    "minimumTemperature"
})
public class TemperatureRangeType {

    protected TemperatureMeasurementType maximumTemperature;
    protected TemperatureMeasurementType minimumTemperature;

    /**
     * Gets the value of the maximumTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureMeasurementType }
     *     
     */
    public TemperatureMeasurementType getMaximumTemperature() {
        return maximumTemperature;
    }

    /**
     * Sets the value of the maximumTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureMeasurementType }
     *     
     */
    public void setMaximumTemperature(TemperatureMeasurementType value) {
        this.maximumTemperature = value;
    }

    /**
     * Gets the value of the minimumTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureMeasurementType }
     *     
     */
    public TemperatureMeasurementType getMinimumTemperature() {
        return minimumTemperature;
    }

    /**
     * Sets the value of the minimumTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureMeasurementType }
     *     
     */
    public void setMinimumTemperature(TemperatureMeasurementType value) {
        this.minimumTemperature = value;
    }

}
