
package gs1.gdsn.food_and_beverage_properties_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.MeasurementPrecisionCodeType;
import gs1.shared.shared_common.xsd._3.QuantityType;


/**
 * <p>Java class for PhysiochemicalCharacteristicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysiochemicalCharacteristicType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="physiochemicalCharacteristicCode" type="{urn:gs1:gdsn:food_and_beverage_properties_information:xsd:3}PhysiochemicalCharacteristicCodeType" minOccurs="0"/&gt;
 *         &lt;element name="physiochemicalCharacteristicValue" type="{urn:gs1:shared:shared_common:xsd:3}QuantityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="physiochemicalCharacteristicValueBasis" type="{urn:gs1:shared:shared_common:xsd:3}QuantityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="physiochemicalCharacteristicValuePrecisionCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}MeasurementPrecisionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="physiochemicalCharacteristicReferenceValue" type="{urn:gs1:shared:shared_common:xsd:3}QuantityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="physiochemicalCharacteristicReferenceValueBasis" type="{urn:gs1:shared:shared_common:xsd:3}QuantityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="physiochemicalCharacteristicReferenceValuePrecisionCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}MeasurementPrecisionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="physiochemicalCharacteristicWarningValue" type="{urn:gs1:shared:shared_common:xsd:3}QuantityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="physiochemicalCharacteristicWarningValueBasis" type="{urn:gs1:shared:shared_common:xsd:3}QuantityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="physiochemicalCharacteristicWarningValuePrecisionCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}MeasurementPrecisionCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysiochemicalCharacteristicType", propOrder = {
    "physiochemicalCharacteristicCode",
    "physiochemicalCharacteristicValue",
    "physiochemicalCharacteristicValueBasis",
    "physiochemicalCharacteristicValuePrecisionCode",
    "physiochemicalCharacteristicReferenceValue",
    "physiochemicalCharacteristicReferenceValueBasis",
    "physiochemicalCharacteristicReferenceValuePrecisionCode",
    "physiochemicalCharacteristicWarningValue",
    "physiochemicalCharacteristicWarningValueBasis",
    "physiochemicalCharacteristicWarningValuePrecisionCode"
})
public class PhysiochemicalCharacteristicType {

    protected PhysiochemicalCharacteristicCodeType physiochemicalCharacteristicCode;
    protected List<QuantityType> physiochemicalCharacteristicValue;
    protected List<QuantityType> physiochemicalCharacteristicValueBasis;
    protected MeasurementPrecisionCodeType physiochemicalCharacteristicValuePrecisionCode;
    protected List<QuantityType> physiochemicalCharacteristicReferenceValue;
    protected List<QuantityType> physiochemicalCharacteristicReferenceValueBasis;
    protected MeasurementPrecisionCodeType physiochemicalCharacteristicReferenceValuePrecisionCode;
    protected List<QuantityType> physiochemicalCharacteristicWarningValue;
    protected List<QuantityType> physiochemicalCharacteristicWarningValueBasis;
    protected MeasurementPrecisionCodeType physiochemicalCharacteristicWarningValuePrecisionCode;

    /**
     * Gets the value of the physiochemicalCharacteristicCode property.
     * 
     * @return
     *     possible object is
     *     {@link PhysiochemicalCharacteristicCodeType }
     *     
     */
    public PhysiochemicalCharacteristicCodeType getPhysiochemicalCharacteristicCode() {
        return physiochemicalCharacteristicCode;
    }

    /**
     * Sets the value of the physiochemicalCharacteristicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysiochemicalCharacteristicCodeType }
     *     
     */
    public void setPhysiochemicalCharacteristicCode(PhysiochemicalCharacteristicCodeType value) {
        this.physiochemicalCharacteristicCode = value;
    }

    /**
     * Gets the value of the physiochemicalCharacteristicValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physiochemicalCharacteristicValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysiochemicalCharacteristicValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityType }
     * 
     * 
     */
    public List<QuantityType> getPhysiochemicalCharacteristicValue() {
        if (physiochemicalCharacteristicValue == null) {
            physiochemicalCharacteristicValue = new ArrayList<QuantityType>();
        }
        return this.physiochemicalCharacteristicValue;
    }

    /**
     * Gets the value of the physiochemicalCharacteristicValueBasis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physiochemicalCharacteristicValueBasis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysiochemicalCharacteristicValueBasis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityType }
     * 
     * 
     */
    public List<QuantityType> getPhysiochemicalCharacteristicValueBasis() {
        if (physiochemicalCharacteristicValueBasis == null) {
            physiochemicalCharacteristicValueBasis = new ArrayList<QuantityType>();
        }
        return this.physiochemicalCharacteristicValueBasis;
    }

    /**
     * Gets the value of the physiochemicalCharacteristicValuePrecisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public MeasurementPrecisionCodeType getPhysiochemicalCharacteristicValuePrecisionCode() {
        return physiochemicalCharacteristicValuePrecisionCode;
    }

    /**
     * Sets the value of the physiochemicalCharacteristicValuePrecisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public void setPhysiochemicalCharacteristicValuePrecisionCode(MeasurementPrecisionCodeType value) {
        this.physiochemicalCharacteristicValuePrecisionCode = value;
    }

    /**
     * Gets the value of the physiochemicalCharacteristicReferenceValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physiochemicalCharacteristicReferenceValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysiochemicalCharacteristicReferenceValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityType }
     * 
     * 
     */
    public List<QuantityType> getPhysiochemicalCharacteristicReferenceValue() {
        if (physiochemicalCharacteristicReferenceValue == null) {
            physiochemicalCharacteristicReferenceValue = new ArrayList<QuantityType>();
        }
        return this.physiochemicalCharacteristicReferenceValue;
    }

    /**
     * Gets the value of the physiochemicalCharacteristicReferenceValueBasis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physiochemicalCharacteristicReferenceValueBasis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysiochemicalCharacteristicReferenceValueBasis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityType }
     * 
     * 
     */
    public List<QuantityType> getPhysiochemicalCharacteristicReferenceValueBasis() {
        if (physiochemicalCharacteristicReferenceValueBasis == null) {
            physiochemicalCharacteristicReferenceValueBasis = new ArrayList<QuantityType>();
        }
        return this.physiochemicalCharacteristicReferenceValueBasis;
    }

    /**
     * Gets the value of the physiochemicalCharacteristicReferenceValuePrecisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public MeasurementPrecisionCodeType getPhysiochemicalCharacteristicReferenceValuePrecisionCode() {
        return physiochemicalCharacteristicReferenceValuePrecisionCode;
    }

    /**
     * Sets the value of the physiochemicalCharacteristicReferenceValuePrecisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public void setPhysiochemicalCharacteristicReferenceValuePrecisionCode(MeasurementPrecisionCodeType value) {
        this.physiochemicalCharacteristicReferenceValuePrecisionCode = value;
    }

    /**
     * Gets the value of the physiochemicalCharacteristicWarningValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physiochemicalCharacteristicWarningValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysiochemicalCharacteristicWarningValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityType }
     * 
     * 
     */
    public List<QuantityType> getPhysiochemicalCharacteristicWarningValue() {
        if (physiochemicalCharacteristicWarningValue == null) {
            physiochemicalCharacteristicWarningValue = new ArrayList<QuantityType>();
        }
        return this.physiochemicalCharacteristicWarningValue;
    }

    /**
     * Gets the value of the physiochemicalCharacteristicWarningValueBasis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physiochemicalCharacteristicWarningValueBasis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysiochemicalCharacteristicWarningValueBasis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityType }
     * 
     * 
     */
    public List<QuantityType> getPhysiochemicalCharacteristicWarningValueBasis() {
        if (physiochemicalCharacteristicWarningValueBasis == null) {
            physiochemicalCharacteristicWarningValueBasis = new ArrayList<QuantityType>();
        }
        return this.physiochemicalCharacteristicWarningValueBasis;
    }

    /**
     * Gets the value of the physiochemicalCharacteristicWarningValuePrecisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public MeasurementPrecisionCodeType getPhysiochemicalCharacteristicWarningValuePrecisionCode() {
        return physiochemicalCharacteristicWarningValuePrecisionCode;
    }

    /**
     * Sets the value of the physiochemicalCharacteristicWarningValuePrecisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public void setPhysiochemicalCharacteristicWarningValuePrecisionCode(MeasurementPrecisionCodeType value) {
        this.physiochemicalCharacteristicWarningValuePrecisionCode = value;
    }

}
