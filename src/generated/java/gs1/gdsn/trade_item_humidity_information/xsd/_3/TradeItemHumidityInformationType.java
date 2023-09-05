
package gs1.gdsn.trade_item_humidity_information.xsd._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.gdsn.gdsn_common.xsd._3.TemperatureQualifierCodeType;
import gs1.shared.shared_common.xsd._3.Description1000Type;
import gs1.shared.shared_common.xsd._3.TimeMeasurementType;


/**
 * <p>Java class for TradeItemHumidityInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemHumidityInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cumulativeHumidityInterruptionAcceptableTimeSpan" type="{urn:gs1:shared:shared_common:xsd:3}TimeMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="cumulativeHumidityInterruptionAcceptableTimeSpanInstructions" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dropBelowMinimumHumidityAcceptableTimeSpan" type="{urn:gs1:shared:shared_common:xsd:3}TimeMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="humidityQualifierCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}TemperatureQualifierCodeType" minOccurs="0"/&gt;
 *         &lt;element name="maximumHumidityAcceptableTimeSpan" type="{urn:gs1:shared:shared_common:xsd:3}TimeMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="maximumHumidityPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="minimumHumidityPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="avpList" type="{urn:gs1:gdsn:gdsn_common:xsd:3}GS1_AttributeValuePairListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemHumidityInformationType", propOrder = {
    "cumulativeHumidityInterruptionAcceptableTimeSpan",
    "cumulativeHumidityInterruptionAcceptableTimeSpanInstructions",
    "dropBelowMinimumHumidityAcceptableTimeSpan",
    "humidityQualifierCode",
    "maximumHumidityAcceptableTimeSpan",
    "maximumHumidityPercentage",
    "minimumHumidityPercentage",
    "avpList"
})
public class TradeItemHumidityInformationType {

    protected TimeMeasurementType cumulativeHumidityInterruptionAcceptableTimeSpan;
    protected List<Description1000Type> cumulativeHumidityInterruptionAcceptableTimeSpanInstructions;
    protected TimeMeasurementType dropBelowMinimumHumidityAcceptableTimeSpan;
    protected TemperatureQualifierCodeType humidityQualifierCode;
    protected TimeMeasurementType maximumHumidityAcceptableTimeSpan;
    protected BigDecimal maximumHumidityPercentage;
    protected BigDecimal minimumHumidityPercentage;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the cumulativeHumidityInterruptionAcceptableTimeSpan property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasurementType }
     *     
     */
    public TimeMeasurementType getCumulativeHumidityInterruptionAcceptableTimeSpan() {
        return cumulativeHumidityInterruptionAcceptableTimeSpan;
    }

    /**
     * Sets the value of the cumulativeHumidityInterruptionAcceptableTimeSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasurementType }
     *     
     */
    public void setCumulativeHumidityInterruptionAcceptableTimeSpan(TimeMeasurementType value) {
        this.cumulativeHumidityInterruptionAcceptableTimeSpan = value;
    }

    /**
     * Gets the value of the cumulativeHumidityInterruptionAcceptableTimeSpanInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cumulativeHumidityInterruptionAcceptableTimeSpanInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCumulativeHumidityInterruptionAcceptableTimeSpanInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getCumulativeHumidityInterruptionAcceptableTimeSpanInstructions() {
        if (cumulativeHumidityInterruptionAcceptableTimeSpanInstructions == null) {
            cumulativeHumidityInterruptionAcceptableTimeSpanInstructions = new ArrayList<Description1000Type>();
        }
        return this.cumulativeHumidityInterruptionAcceptableTimeSpanInstructions;
    }

    /**
     * Gets the value of the dropBelowMinimumHumidityAcceptableTimeSpan property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasurementType }
     *     
     */
    public TimeMeasurementType getDropBelowMinimumHumidityAcceptableTimeSpan() {
        return dropBelowMinimumHumidityAcceptableTimeSpan;
    }

    /**
     * Sets the value of the dropBelowMinimumHumidityAcceptableTimeSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasurementType }
     *     
     */
    public void setDropBelowMinimumHumidityAcceptableTimeSpan(TimeMeasurementType value) {
        this.dropBelowMinimumHumidityAcceptableTimeSpan = value;
    }

    /**
     * Gets the value of the humidityQualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureQualifierCodeType }
     *     
     */
    public TemperatureQualifierCodeType getHumidityQualifierCode() {
        return humidityQualifierCode;
    }

    /**
     * Sets the value of the humidityQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureQualifierCodeType }
     *     
     */
    public void setHumidityQualifierCode(TemperatureQualifierCodeType value) {
        this.humidityQualifierCode = value;
    }

    /**
     * Gets the value of the maximumHumidityAcceptableTimeSpan property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasurementType }
     *     
     */
    public TimeMeasurementType getMaximumHumidityAcceptableTimeSpan() {
        return maximumHumidityAcceptableTimeSpan;
    }

    /**
     * Sets the value of the maximumHumidityAcceptableTimeSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasurementType }
     *     
     */
    public void setMaximumHumidityAcceptableTimeSpan(TimeMeasurementType value) {
        this.maximumHumidityAcceptableTimeSpan = value;
    }

    /**
     * Gets the value of the maximumHumidityPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumHumidityPercentage() {
        return maximumHumidityPercentage;
    }

    /**
     * Sets the value of the maximumHumidityPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumHumidityPercentage(BigDecimal value) {
        this.maximumHumidityPercentage = value;
    }

    /**
     * Gets the value of the minimumHumidityPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumHumidityPercentage() {
        return minimumHumidityPercentage;
    }

    /**
     * Sets the value of the minimumHumidityPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumHumidityPercentage(BigDecimal value) {
        this.minimumHumidityPercentage = value;
    }

    /**
     * Gets the value of the avpList property.
     * 
     * @return
     *     possible object is
     *     {@link GS1AttributeValuePairListType }
     *     
     */
    public GS1AttributeValuePairListType getAvpList() {
        return avpList;
    }

    /**
     * Sets the value of the avpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GS1AttributeValuePairListType }
     *     
     */
    public void setAvpList(GS1AttributeValuePairListType value) {
        this.avpList = value;
    }

}
