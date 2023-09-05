
package gs1.gdsn.lighting_device.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description500Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;
import gs1.shared.shared_common.xsd._3.TemperatureMeasurementType;


/**
 * <p>Java class for LightBulbInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LightBulbInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lightBulbLampTypeCode" type="{urn:gs1:gdsn:lighting_device:xsd:3}LightBulbLampTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="lightBulbTypeDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lightBulbBaseType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="lightBulbDiameterValue" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lightBulbFilamentTypeCode" type="{urn:gs1:gdsn:lighting_device:xsd:3}LightBulbFilamentTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="lightBulbShapeCode" type="{urn:gs1:gdsn:lighting_device:xsd:3}LightBulbShapeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="colourTemperature" type="{urn:gs1:shared:shared_common:xsd:3}TemperatureMeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="visibleLight" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lightBulbWarmUpTime" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isLightBulbSuitableForAccentLighting" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="minimumColourTemperature" type="{urn:gs1:shared:shared_common:xsd:3}TemperatureMeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="maximumColourTemperature" type="{urn:gs1:shared:shared_common:xsd:3}TemperatureMeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="declaredPower" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="equivalentLightBulbPower" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lightBeamTypeCode" type="{urn:gs1:gdsn:lighting_device:xsd:3}LightBeamTypeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LightBulbInformationType", propOrder = {
    "lightBulbLampTypeCode",
    "lightBulbTypeDescription",
    "lightBulbBaseType",
    "lightBulbDiameterValue",
    "lightBulbFilamentTypeCode",
    "lightBulbShapeCode",
    "colourTemperature",
    "visibleLight",
    "lightBulbWarmUpTime",
    "isLightBulbSuitableForAccentLighting",
    "minimumColourTemperature",
    "maximumColourTemperature",
    "declaredPower",
    "equivalentLightBulbPower",
    "lightBeamTypeCode"
})
public class LightBulbInformationType {

    protected LightBulbLampTypeCodeType lightBulbLampTypeCode;
    protected List<Description500Type> lightBulbTypeDescription;
    protected String lightBulbBaseType;
    protected List<MeasurementType> lightBulbDiameterValue;
    protected LightBulbFilamentTypeCodeType lightBulbFilamentTypeCode;
    protected LightBulbShapeCodeType lightBulbShapeCode;
    protected List<TemperatureMeasurementType> colourTemperature;
    protected List<MeasurementType> visibleLight;
    protected List<MeasurementType> lightBulbWarmUpTime;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isLightBulbSuitableForAccentLighting;
    protected List<TemperatureMeasurementType> minimumColourTemperature;
    protected List<TemperatureMeasurementType> maximumColourTemperature;
    protected List<MeasurementType> declaredPower;
    protected List<MeasurementType> equivalentLightBulbPower;
    protected LightBeamTypeCodeType lightBeamTypeCode;

    /**
     * Gets the value of the lightBulbLampTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link LightBulbLampTypeCodeType }
     *     
     */
    public LightBulbLampTypeCodeType getLightBulbLampTypeCode() {
        return lightBulbLampTypeCode;
    }

    /**
     * Sets the value of the lightBulbLampTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LightBulbLampTypeCodeType }
     *     
     */
    public void setLightBulbLampTypeCode(LightBulbLampTypeCodeType value) {
        this.lightBulbLampTypeCode = value;
    }

    /**
     * Gets the value of the lightBulbTypeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lightBulbTypeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLightBulbTypeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getLightBulbTypeDescription() {
        if (lightBulbTypeDescription == null) {
            lightBulbTypeDescription = new ArrayList<Description500Type>();
        }
        return this.lightBulbTypeDescription;
    }

    /**
     * Gets the value of the lightBulbBaseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightBulbBaseType() {
        return lightBulbBaseType;
    }

    /**
     * Sets the value of the lightBulbBaseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightBulbBaseType(String value) {
        this.lightBulbBaseType = value;
    }

    /**
     * Gets the value of the lightBulbDiameterValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lightBulbDiameterValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLightBulbDiameterValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getLightBulbDiameterValue() {
        if (lightBulbDiameterValue == null) {
            lightBulbDiameterValue = new ArrayList<MeasurementType>();
        }
        return this.lightBulbDiameterValue;
    }

    /**
     * Gets the value of the lightBulbFilamentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link LightBulbFilamentTypeCodeType }
     *     
     */
    public LightBulbFilamentTypeCodeType getLightBulbFilamentTypeCode() {
        return lightBulbFilamentTypeCode;
    }

    /**
     * Sets the value of the lightBulbFilamentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LightBulbFilamentTypeCodeType }
     *     
     */
    public void setLightBulbFilamentTypeCode(LightBulbFilamentTypeCodeType value) {
        this.lightBulbFilamentTypeCode = value;
    }

    /**
     * Gets the value of the lightBulbShapeCode property.
     * 
     * @return
     *     possible object is
     *     {@link LightBulbShapeCodeType }
     *     
     */
    public LightBulbShapeCodeType getLightBulbShapeCode() {
        return lightBulbShapeCode;
    }

    /**
     * Sets the value of the lightBulbShapeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LightBulbShapeCodeType }
     *     
     */
    public void setLightBulbShapeCode(LightBulbShapeCodeType value) {
        this.lightBulbShapeCode = value;
    }

    /**
     * Gets the value of the colourTemperature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colourTemperature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColourTemperature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemperatureMeasurementType }
     * 
     * 
     */
    public List<TemperatureMeasurementType> getColourTemperature() {
        if (colourTemperature == null) {
            colourTemperature = new ArrayList<TemperatureMeasurementType>();
        }
        return this.colourTemperature;
    }

    /**
     * Gets the value of the visibleLight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visibleLight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisibleLight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getVisibleLight() {
        if (visibleLight == null) {
            visibleLight = new ArrayList<MeasurementType>();
        }
        return this.visibleLight;
    }

    /**
     * Gets the value of the lightBulbWarmUpTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lightBulbWarmUpTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLightBulbWarmUpTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getLightBulbWarmUpTime() {
        if (lightBulbWarmUpTime == null) {
            lightBulbWarmUpTime = new ArrayList<MeasurementType>();
        }
        return this.lightBulbWarmUpTime;
    }

    /**
     * Gets the value of the isLightBulbSuitableForAccentLighting property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsLightBulbSuitableForAccentLighting() {
        return isLightBulbSuitableForAccentLighting;
    }

    /**
     * Sets the value of the isLightBulbSuitableForAccentLighting property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsLightBulbSuitableForAccentLighting(NonBinaryLogicEnumerationType value) {
        this.isLightBulbSuitableForAccentLighting = value;
    }

    /**
     * Gets the value of the minimumColourTemperature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minimumColourTemperature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinimumColourTemperature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemperatureMeasurementType }
     * 
     * 
     */
    public List<TemperatureMeasurementType> getMinimumColourTemperature() {
        if (minimumColourTemperature == null) {
            minimumColourTemperature = new ArrayList<TemperatureMeasurementType>();
        }
        return this.minimumColourTemperature;
    }

    /**
     * Gets the value of the maximumColourTemperature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maximumColourTemperature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaximumColourTemperature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemperatureMeasurementType }
     * 
     * 
     */
    public List<TemperatureMeasurementType> getMaximumColourTemperature() {
        if (maximumColourTemperature == null) {
            maximumColourTemperature = new ArrayList<TemperatureMeasurementType>();
        }
        return this.maximumColourTemperature;
    }

    /**
     * Gets the value of the declaredPower property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the declaredPower property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeclaredPower().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getDeclaredPower() {
        if (declaredPower == null) {
            declaredPower = new ArrayList<MeasurementType>();
        }
        return this.declaredPower;
    }

    /**
     * Gets the value of the equivalentLightBulbPower property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equivalentLightBulbPower property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquivalentLightBulbPower().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getEquivalentLightBulbPower() {
        if (equivalentLightBulbPower == null) {
            equivalentLightBulbPower = new ArrayList<MeasurementType>();
        }
        return this.equivalentLightBulbPower;
    }

    /**
     * Gets the value of the lightBeamTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link LightBeamTypeCodeType }
     *     
     */
    public LightBeamTypeCodeType getLightBeamTypeCode() {
        return lightBeamTypeCode;
    }

    /**
     * Sets the value of the lightBeamTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LightBeamTypeCodeType }
     *     
     */
    public void setLightBeamTypeCode(LightBeamTypeCodeType value) {
        this.lightBeamTypeCode = value;
    }

}
