
package gs1.gdsn.food_and_beverage_properties_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.MeasurementPrecisionCodeType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for MicrobiologicalInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MicrobiologicalInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="microbiologicalOrganismCode" type="{urn:gs1:gdsn:food_and_beverage_properties_information:xsd:3}MicrobiologicalOrganismCodeType" minOccurs="0"/&gt;
 *         &lt;element name="microbiologicalOrganismMaximumValue" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="microbiologicalOrganismReferenceValue" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="microbiologicalOrganismWarningValue" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="microbiologicalOrganismMaximumValueBasis" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="microbiologicalOrganismMaximumValuePrecisionCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}MeasurementPrecisionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="microbiologicalOrganismReferenceValueBasis" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="microbiologicalOrganismReferenceValuePrecisionCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}MeasurementPrecisionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="microbiologicalOrganismWarningValueBasis" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="microbiologicalOrganismWarningValuePrecisionCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}MeasurementPrecisionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="microbiologicalOrganismMethodOfAnalysisCode" type="{urn:gs1:gdsn:food_and_beverage_properties_information:xsd:3}MicrobiologicalOrganismMethodOfAnalysisCodeType" minOccurs="0"/&gt;
 *         &lt;element name="microbiologicalOrganismMinimumValue" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="microbiologicalOrganismStrainCode" type="{urn:gs1:gdsn:food_and_beverage_properties_information:xsd:3}MicrobiologicalOrganismStrainCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MicrobiologicalInformationType", propOrder = {
    "microbiologicalOrganismCode",
    "microbiologicalOrganismMaximumValue",
    "microbiologicalOrganismReferenceValue",
    "microbiologicalOrganismWarningValue",
    "microbiologicalOrganismMaximumValueBasis",
    "microbiologicalOrganismMaximumValuePrecisionCode",
    "microbiologicalOrganismReferenceValueBasis",
    "microbiologicalOrganismReferenceValuePrecisionCode",
    "microbiologicalOrganismWarningValueBasis",
    "microbiologicalOrganismWarningValuePrecisionCode",
    "microbiologicalOrganismMethodOfAnalysisCode",
    "microbiologicalOrganismMinimumValue",
    "microbiologicalOrganismStrainCode"
})
public class MicrobiologicalInformationType {

    protected MicrobiologicalOrganismCodeType microbiologicalOrganismCode;
    protected List<MeasurementType> microbiologicalOrganismMaximumValue;
    protected List<MeasurementType> microbiologicalOrganismReferenceValue;
    protected List<MeasurementType> microbiologicalOrganismWarningValue;
    protected List<MeasurementType> microbiologicalOrganismMaximumValueBasis;
    protected MeasurementPrecisionCodeType microbiologicalOrganismMaximumValuePrecisionCode;
    protected List<MeasurementType> microbiologicalOrganismReferenceValueBasis;
    protected MeasurementPrecisionCodeType microbiologicalOrganismReferenceValuePrecisionCode;
    protected List<MeasurementType> microbiologicalOrganismWarningValueBasis;
    protected MeasurementPrecisionCodeType microbiologicalOrganismWarningValuePrecisionCode;
    protected MicrobiologicalOrganismMethodOfAnalysisCodeType microbiologicalOrganismMethodOfAnalysisCode;
    protected List<MeasurementType> microbiologicalOrganismMinimumValue;
    protected List<MicrobiologicalOrganismStrainCodeType> microbiologicalOrganismStrainCode;

    /**
     * Gets the value of the microbiologicalOrganismCode property.
     * 
     * @return
     *     possible object is
     *     {@link MicrobiologicalOrganismCodeType }
     *     
     */
    public MicrobiologicalOrganismCodeType getMicrobiologicalOrganismCode() {
        return microbiologicalOrganismCode;
    }

    /**
     * Sets the value of the microbiologicalOrganismCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MicrobiologicalOrganismCodeType }
     *     
     */
    public void setMicrobiologicalOrganismCode(MicrobiologicalOrganismCodeType value) {
        this.microbiologicalOrganismCode = value;
    }

    /**
     * Gets the value of the microbiologicalOrganismMaximumValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the microbiologicalOrganismMaximumValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMicrobiologicalOrganismMaximumValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getMicrobiologicalOrganismMaximumValue() {
        if (microbiologicalOrganismMaximumValue == null) {
            microbiologicalOrganismMaximumValue = new ArrayList<MeasurementType>();
        }
        return this.microbiologicalOrganismMaximumValue;
    }

    /**
     * Gets the value of the microbiologicalOrganismReferenceValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the microbiologicalOrganismReferenceValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMicrobiologicalOrganismReferenceValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getMicrobiologicalOrganismReferenceValue() {
        if (microbiologicalOrganismReferenceValue == null) {
            microbiologicalOrganismReferenceValue = new ArrayList<MeasurementType>();
        }
        return this.microbiologicalOrganismReferenceValue;
    }

    /**
     * Gets the value of the microbiologicalOrganismWarningValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the microbiologicalOrganismWarningValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMicrobiologicalOrganismWarningValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getMicrobiologicalOrganismWarningValue() {
        if (microbiologicalOrganismWarningValue == null) {
            microbiologicalOrganismWarningValue = new ArrayList<MeasurementType>();
        }
        return this.microbiologicalOrganismWarningValue;
    }

    /**
     * Gets the value of the microbiologicalOrganismMaximumValueBasis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the microbiologicalOrganismMaximumValueBasis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMicrobiologicalOrganismMaximumValueBasis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getMicrobiologicalOrganismMaximumValueBasis() {
        if (microbiologicalOrganismMaximumValueBasis == null) {
            microbiologicalOrganismMaximumValueBasis = new ArrayList<MeasurementType>();
        }
        return this.microbiologicalOrganismMaximumValueBasis;
    }

    /**
     * Gets the value of the microbiologicalOrganismMaximumValuePrecisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public MeasurementPrecisionCodeType getMicrobiologicalOrganismMaximumValuePrecisionCode() {
        return microbiologicalOrganismMaximumValuePrecisionCode;
    }

    /**
     * Sets the value of the microbiologicalOrganismMaximumValuePrecisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public void setMicrobiologicalOrganismMaximumValuePrecisionCode(MeasurementPrecisionCodeType value) {
        this.microbiologicalOrganismMaximumValuePrecisionCode = value;
    }

    /**
     * Gets the value of the microbiologicalOrganismReferenceValueBasis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the microbiologicalOrganismReferenceValueBasis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMicrobiologicalOrganismReferenceValueBasis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getMicrobiologicalOrganismReferenceValueBasis() {
        if (microbiologicalOrganismReferenceValueBasis == null) {
            microbiologicalOrganismReferenceValueBasis = new ArrayList<MeasurementType>();
        }
        return this.microbiologicalOrganismReferenceValueBasis;
    }

    /**
     * Gets the value of the microbiologicalOrganismReferenceValuePrecisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public MeasurementPrecisionCodeType getMicrobiologicalOrganismReferenceValuePrecisionCode() {
        return microbiologicalOrganismReferenceValuePrecisionCode;
    }

    /**
     * Sets the value of the microbiologicalOrganismReferenceValuePrecisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public void setMicrobiologicalOrganismReferenceValuePrecisionCode(MeasurementPrecisionCodeType value) {
        this.microbiologicalOrganismReferenceValuePrecisionCode = value;
    }

    /**
     * Gets the value of the microbiologicalOrganismWarningValueBasis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the microbiologicalOrganismWarningValueBasis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMicrobiologicalOrganismWarningValueBasis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getMicrobiologicalOrganismWarningValueBasis() {
        if (microbiologicalOrganismWarningValueBasis == null) {
            microbiologicalOrganismWarningValueBasis = new ArrayList<MeasurementType>();
        }
        return this.microbiologicalOrganismWarningValueBasis;
    }

    /**
     * Gets the value of the microbiologicalOrganismWarningValuePrecisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public MeasurementPrecisionCodeType getMicrobiologicalOrganismWarningValuePrecisionCode() {
        return microbiologicalOrganismWarningValuePrecisionCode;
    }

    /**
     * Sets the value of the microbiologicalOrganismWarningValuePrecisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public void setMicrobiologicalOrganismWarningValuePrecisionCode(MeasurementPrecisionCodeType value) {
        this.microbiologicalOrganismWarningValuePrecisionCode = value;
    }

    /**
     * Gets the value of the microbiologicalOrganismMethodOfAnalysisCode property.
     * 
     * @return
     *     possible object is
     *     {@link MicrobiologicalOrganismMethodOfAnalysisCodeType }
     *     
     */
    public MicrobiologicalOrganismMethodOfAnalysisCodeType getMicrobiologicalOrganismMethodOfAnalysisCode() {
        return microbiologicalOrganismMethodOfAnalysisCode;
    }

    /**
     * Sets the value of the microbiologicalOrganismMethodOfAnalysisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MicrobiologicalOrganismMethodOfAnalysisCodeType }
     *     
     */
    public void setMicrobiologicalOrganismMethodOfAnalysisCode(MicrobiologicalOrganismMethodOfAnalysisCodeType value) {
        this.microbiologicalOrganismMethodOfAnalysisCode = value;
    }

    /**
     * Gets the value of the microbiologicalOrganismMinimumValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the microbiologicalOrganismMinimumValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMicrobiologicalOrganismMinimumValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getMicrobiologicalOrganismMinimumValue() {
        if (microbiologicalOrganismMinimumValue == null) {
            microbiologicalOrganismMinimumValue = new ArrayList<MeasurementType>();
        }
        return this.microbiologicalOrganismMinimumValue;
    }

    /**
     * Gets the value of the microbiologicalOrganismStrainCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the microbiologicalOrganismStrainCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMicrobiologicalOrganismStrainCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MicrobiologicalOrganismStrainCodeType }
     * 
     * 
     */
    public List<MicrobiologicalOrganismStrainCodeType> getMicrobiologicalOrganismStrainCode() {
        if (microbiologicalOrganismStrainCode == null) {
            microbiologicalOrganismStrainCode = new ArrayList<MicrobiologicalOrganismStrainCodeType>();
        }
        return this.microbiologicalOrganismStrainCode;
    }

}
