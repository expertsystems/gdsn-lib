
package gs1.gdsn.trade_item_temperature_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.gdsn.gdsn_common.xsd._3.TemperatureQualifierCodeType;
import gs1.shared.shared_common.xsd._3.Description1000Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.TemperatureMeasurementType;
import gs1.shared.shared_common.xsd._3.TimeMeasurementType;


/**
 * <p>Java class for TradeItemTemperatureInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemTemperatureInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cumulativeTemperatureInterruptionAcceptableTimeSpan" type="{urn:gs1:shared:shared_common:xsd:3}TimeMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="cumulativeTemperatureInterruptionAcceptableTimeSpanInstructions" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dropBelowMinimumTemperatureAcceptableTimeSpan" type="{urn:gs1:shared:shared_common:xsd:3}TimeMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="maximumTemperature" type="{urn:gs1:shared:shared_common:xsd:3}TemperatureMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="maximumTemperatureAcceptableTimeSpan" type="{urn:gs1:shared:shared_common:xsd:3}TimeMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="maximumToleranceTemperature" type="{urn:gs1:shared:shared_common:xsd:3}TemperatureMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="minimumTemperature" type="{urn:gs1:shared:shared_common:xsd:3}TemperatureMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="minimumToleranceTemperature" type="{urn:gs1:shared:shared_common:xsd:3}TemperatureMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="temperatureQualifierCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}TemperatureQualifierCodeType" minOccurs="0"/&gt;
 *         &lt;element name="maximumEnvironmentAtmosphericPressure" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="minimumEnvironmentAtmosphericPressure" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="labelledTemperature" type="{urn:gs1:shared:shared_common:xsd:3}TemperatureMeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TradeItemTemperatureInformationType", propOrder = {
    "cumulativeTemperatureInterruptionAcceptableTimeSpan",
    "cumulativeTemperatureInterruptionAcceptableTimeSpanInstructions",
    "dropBelowMinimumTemperatureAcceptableTimeSpan",
    "maximumTemperature",
    "maximumTemperatureAcceptableTimeSpan",
    "maximumToleranceTemperature",
    "minimumTemperature",
    "minimumToleranceTemperature",
    "temperatureQualifierCode",
    "maximumEnvironmentAtmosphericPressure",
    "minimumEnvironmentAtmosphericPressure",
    "labelledTemperature",
    "avpList"
})
public class TradeItemTemperatureInformationType {

    protected TimeMeasurementType cumulativeTemperatureInterruptionAcceptableTimeSpan;
    protected List<Description1000Type> cumulativeTemperatureInterruptionAcceptableTimeSpanInstructions;
    protected TimeMeasurementType dropBelowMinimumTemperatureAcceptableTimeSpan;
    protected TemperatureMeasurementType maximumTemperature;
    protected TimeMeasurementType maximumTemperatureAcceptableTimeSpan;
    protected TemperatureMeasurementType maximumToleranceTemperature;
    protected TemperatureMeasurementType minimumTemperature;
    protected TemperatureMeasurementType minimumToleranceTemperature;
    protected TemperatureQualifierCodeType temperatureQualifierCode;
    protected MeasurementType maximumEnvironmentAtmosphericPressure;
    protected MeasurementType minimumEnvironmentAtmosphericPressure;
    protected List<TemperatureMeasurementType> labelledTemperature;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the cumulativeTemperatureInterruptionAcceptableTimeSpan property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasurementType }
     *     
     */
    public TimeMeasurementType getCumulativeTemperatureInterruptionAcceptableTimeSpan() {
        return cumulativeTemperatureInterruptionAcceptableTimeSpan;
    }

    /**
     * Sets the value of the cumulativeTemperatureInterruptionAcceptableTimeSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasurementType }
     *     
     */
    public void setCumulativeTemperatureInterruptionAcceptableTimeSpan(TimeMeasurementType value) {
        this.cumulativeTemperatureInterruptionAcceptableTimeSpan = value;
    }

    /**
     * Gets the value of the cumulativeTemperatureInterruptionAcceptableTimeSpanInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cumulativeTemperatureInterruptionAcceptableTimeSpanInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCumulativeTemperatureInterruptionAcceptableTimeSpanInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getCumulativeTemperatureInterruptionAcceptableTimeSpanInstructions() {
        if (cumulativeTemperatureInterruptionAcceptableTimeSpanInstructions == null) {
            cumulativeTemperatureInterruptionAcceptableTimeSpanInstructions = new ArrayList<Description1000Type>();
        }
        return this.cumulativeTemperatureInterruptionAcceptableTimeSpanInstructions;
    }

    /**
     * Gets the value of the dropBelowMinimumTemperatureAcceptableTimeSpan property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasurementType }
     *     
     */
    public TimeMeasurementType getDropBelowMinimumTemperatureAcceptableTimeSpan() {
        return dropBelowMinimumTemperatureAcceptableTimeSpan;
    }

    /**
     * Sets the value of the dropBelowMinimumTemperatureAcceptableTimeSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasurementType }
     *     
     */
    public void setDropBelowMinimumTemperatureAcceptableTimeSpan(TimeMeasurementType value) {
        this.dropBelowMinimumTemperatureAcceptableTimeSpan = value;
    }

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
     * Gets the value of the maximumTemperatureAcceptableTimeSpan property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasurementType }
     *     
     */
    public TimeMeasurementType getMaximumTemperatureAcceptableTimeSpan() {
        return maximumTemperatureAcceptableTimeSpan;
    }

    /**
     * Sets the value of the maximumTemperatureAcceptableTimeSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasurementType }
     *     
     */
    public void setMaximumTemperatureAcceptableTimeSpan(TimeMeasurementType value) {
        this.maximumTemperatureAcceptableTimeSpan = value;
    }

    /**
     * Gets the value of the maximumToleranceTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureMeasurementType }
     *     
     */
    public TemperatureMeasurementType getMaximumToleranceTemperature() {
        return maximumToleranceTemperature;
    }

    /**
     * Sets the value of the maximumToleranceTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureMeasurementType }
     *     
     */
    public void setMaximumToleranceTemperature(TemperatureMeasurementType value) {
        this.maximumToleranceTemperature = value;
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

    /**
     * Gets the value of the minimumToleranceTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureMeasurementType }
     *     
     */
    public TemperatureMeasurementType getMinimumToleranceTemperature() {
        return minimumToleranceTemperature;
    }

    /**
     * Sets the value of the minimumToleranceTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureMeasurementType }
     *     
     */
    public void setMinimumToleranceTemperature(TemperatureMeasurementType value) {
        this.minimumToleranceTemperature = value;
    }

    /**
     * Gets the value of the temperatureQualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureQualifierCodeType }
     *     
     */
    public TemperatureQualifierCodeType getTemperatureQualifierCode() {
        return temperatureQualifierCode;
    }

    /**
     * Sets the value of the temperatureQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureQualifierCodeType }
     *     
     */
    public void setTemperatureQualifierCode(TemperatureQualifierCodeType value) {
        this.temperatureQualifierCode = value;
    }

    /**
     * Gets the value of the maximumEnvironmentAtmosphericPressure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getMaximumEnvironmentAtmosphericPressure() {
        return maximumEnvironmentAtmosphericPressure;
    }

    /**
     * Sets the value of the maximumEnvironmentAtmosphericPressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setMaximumEnvironmentAtmosphericPressure(MeasurementType value) {
        this.maximumEnvironmentAtmosphericPressure = value;
    }

    /**
     * Gets the value of the minimumEnvironmentAtmosphericPressure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getMinimumEnvironmentAtmosphericPressure() {
        return minimumEnvironmentAtmosphericPressure;
    }

    /**
     * Sets the value of the minimumEnvironmentAtmosphericPressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setMinimumEnvironmentAtmosphericPressure(MeasurementType value) {
        this.minimumEnvironmentAtmosphericPressure = value;
    }

    /**
     * Gets the value of the labelledTemperature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labelledTemperature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabelledTemperature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemperatureMeasurementType }
     * 
     * 
     */
    public List<TemperatureMeasurementType> getLabelledTemperature() {
        if (labelledTemperature == null) {
            labelledTemperature = new ArrayList<TemperatureMeasurementType>();
        }
        return this.labelledTemperature;
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
