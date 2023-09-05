
package gs1.gdsn.safety_data_sheet.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.gdsn.gdsn_common.xsd._3.MeasurementPrecisionCodeType;
import gs1.shared.shared_common.xsd._3.Description1000Type;
import gs1.shared.shared_common.xsd._3.TemperatureMeasurementType;


/**
 * <p>Java class for FlashPointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlashPointType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flashPointTemperature" type="{urn:gs1:shared:shared_common:xsd:3}TemperatureMeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="flashPointTestMethodCode" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}FlashPointTestMethodCodeType" minOccurs="0"/&gt;
 *         &lt;element name="flashPointDescriptor" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="flashPointTemperatureLowerValue" type="{urn:gs1:shared:shared_common:xsd:3}TemperatureMeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="flashPointTemperatureMeasurementPrecision" type="{urn:gs1:gdsn:gdsn_common:xsd:3}MeasurementPrecisionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="flashPointTemperatureUpperValue" type="{urn:gs1:shared:shared_common:xsd:3}TemperatureMeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "FlashPointType", propOrder = {
    "flashPointTemperature",
    "flashPointTestMethodCode",
    "flashPointDescriptor",
    "flashPointTemperatureLowerValue",
    "flashPointTemperatureMeasurementPrecision",
    "flashPointTemperatureUpperValue",
    "avpList"
})
public class FlashPointType {

    protected List<TemperatureMeasurementType> flashPointTemperature;
    protected FlashPointTestMethodCodeType flashPointTestMethodCode;
    protected List<Description1000Type> flashPointDescriptor;
    protected List<TemperatureMeasurementType> flashPointTemperatureLowerValue;
    protected MeasurementPrecisionCodeType flashPointTemperatureMeasurementPrecision;
    protected List<TemperatureMeasurementType> flashPointTemperatureUpperValue;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the flashPointTemperature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flashPointTemperature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlashPointTemperature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemperatureMeasurementType }
     * 
     * 
     */
    public List<TemperatureMeasurementType> getFlashPointTemperature() {
        if (flashPointTemperature == null) {
            flashPointTemperature = new ArrayList<TemperatureMeasurementType>();
        }
        return this.flashPointTemperature;
    }

    /**
     * Gets the value of the flashPointTestMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link FlashPointTestMethodCodeType }
     *     
     */
    public FlashPointTestMethodCodeType getFlashPointTestMethodCode() {
        return flashPointTestMethodCode;
    }

    /**
     * Sets the value of the flashPointTestMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlashPointTestMethodCodeType }
     *     
     */
    public void setFlashPointTestMethodCode(FlashPointTestMethodCodeType value) {
        this.flashPointTestMethodCode = value;
    }

    /**
     * Gets the value of the flashPointDescriptor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flashPointDescriptor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlashPointDescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getFlashPointDescriptor() {
        if (flashPointDescriptor == null) {
            flashPointDescriptor = new ArrayList<Description1000Type>();
        }
        return this.flashPointDescriptor;
    }

    /**
     * Gets the value of the flashPointTemperatureLowerValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flashPointTemperatureLowerValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlashPointTemperatureLowerValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemperatureMeasurementType }
     * 
     * 
     */
    public List<TemperatureMeasurementType> getFlashPointTemperatureLowerValue() {
        if (flashPointTemperatureLowerValue == null) {
            flashPointTemperatureLowerValue = new ArrayList<TemperatureMeasurementType>();
        }
        return this.flashPointTemperatureLowerValue;
    }

    /**
     * Gets the value of the flashPointTemperatureMeasurementPrecision property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public MeasurementPrecisionCodeType getFlashPointTemperatureMeasurementPrecision() {
        return flashPointTemperatureMeasurementPrecision;
    }

    /**
     * Sets the value of the flashPointTemperatureMeasurementPrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public void setFlashPointTemperatureMeasurementPrecision(MeasurementPrecisionCodeType value) {
        this.flashPointTemperatureMeasurementPrecision = value;
    }

    /**
     * Gets the value of the flashPointTemperatureUpperValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flashPointTemperatureUpperValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlashPointTemperatureUpperValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemperatureMeasurementType }
     * 
     * 
     */
    public List<TemperatureMeasurementType> getFlashPointTemperatureUpperValue() {
        if (flashPointTemperatureUpperValue == null) {
            flashPointTemperatureUpperValue = new ArrayList<TemperatureMeasurementType>();
        }
        return this.flashPointTemperatureUpperValue;
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
