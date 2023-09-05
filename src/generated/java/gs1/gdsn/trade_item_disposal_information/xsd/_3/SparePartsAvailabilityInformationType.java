
package gs1.gdsn.trade_item_disposal_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.TimeMeasurementType;


/**
 * <p>Java class for SparePartsAvailabilityInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SparePartsAvailabilityInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sparePartsAvailabilityEffectiveDateTypeCode" type="{urn:gs1:gdsn:trade_item_disposal_information:xsd:3}SparePartsAvailabilityEffectiveDateTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="sparePartsAvailabilityPeriod" type="{urn:gs1:shared:shared_common:xsd:3}TimeMeasurementType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SparePartsAvailabilityInformationType", propOrder = {
    "sparePartsAvailabilityEffectiveDateTypeCode",
    "sparePartsAvailabilityPeriod"
})
public class SparePartsAvailabilityInformationType {

    protected SparePartsAvailabilityEffectiveDateTypeCodeType sparePartsAvailabilityEffectiveDateTypeCode;
    protected TimeMeasurementType sparePartsAvailabilityPeriod;

    /**
     * Gets the value of the sparePartsAvailabilityEffectiveDateTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link SparePartsAvailabilityEffectiveDateTypeCodeType }
     *     
     */
    public SparePartsAvailabilityEffectiveDateTypeCodeType getSparePartsAvailabilityEffectiveDateTypeCode() {
        return sparePartsAvailabilityEffectiveDateTypeCode;
    }

    /**
     * Sets the value of the sparePartsAvailabilityEffectiveDateTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SparePartsAvailabilityEffectiveDateTypeCodeType }
     *     
     */
    public void setSparePartsAvailabilityEffectiveDateTypeCode(SparePartsAvailabilityEffectiveDateTypeCodeType value) {
        this.sparePartsAvailabilityEffectiveDateTypeCode = value;
    }

    /**
     * Gets the value of the sparePartsAvailabilityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasurementType }
     *     
     */
    public TimeMeasurementType getSparePartsAvailabilityPeriod() {
        return sparePartsAvailabilityPeriod;
    }

    /**
     * Sets the value of the sparePartsAvailabilityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasurementType }
     *     
     */
    public void setSparePartsAvailabilityPeriod(TimeMeasurementType value) {
        this.sparePartsAvailabilityPeriod = value;
    }

}
