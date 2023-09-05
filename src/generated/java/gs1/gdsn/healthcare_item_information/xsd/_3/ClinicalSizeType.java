
package gs1.gdsn.healthcare_item_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description500Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for ClinicalSizeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClinicalSizeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clinicalSizeDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="clinicalSizeTypeCode" type="{urn:gs1:gdsn:healthcare_item_information:xsd:3}ClinicalSizeTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="clinicalSizeValue" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="clinicalSizeValueMaximum" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="clinicalSizeMeasurementPrecisionCode" type="{urn:gs1:gdsn:healthcare_item_information:xsd:3}ClinicalSizeMeasurementPrecisionCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClinicalSizeType", propOrder = {
    "clinicalSizeDescription",
    "clinicalSizeTypeCode",
    "clinicalSizeValue",
    "clinicalSizeValueMaximum",
    "clinicalSizeMeasurementPrecisionCode"
})
public class ClinicalSizeType {

    protected List<Description500Type> clinicalSizeDescription;
    protected ClinicalSizeTypeCodeType clinicalSizeTypeCode;
    protected List<MeasurementType> clinicalSizeValue;
    protected List<MeasurementType> clinicalSizeValueMaximum;
    protected ClinicalSizeMeasurementPrecisionCodeType clinicalSizeMeasurementPrecisionCode;

    /**
     * Gets the value of the clinicalSizeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clinicalSizeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClinicalSizeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getClinicalSizeDescription() {
        if (clinicalSizeDescription == null) {
            clinicalSizeDescription = new ArrayList<Description500Type>();
        }
        return this.clinicalSizeDescription;
    }

    /**
     * Gets the value of the clinicalSizeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ClinicalSizeTypeCodeType }
     *     
     */
    public ClinicalSizeTypeCodeType getClinicalSizeTypeCode() {
        return clinicalSizeTypeCode;
    }

    /**
     * Sets the value of the clinicalSizeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClinicalSizeTypeCodeType }
     *     
     */
    public void setClinicalSizeTypeCode(ClinicalSizeTypeCodeType value) {
        this.clinicalSizeTypeCode = value;
    }

    /**
     * Gets the value of the clinicalSizeValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clinicalSizeValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClinicalSizeValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getClinicalSizeValue() {
        if (clinicalSizeValue == null) {
            clinicalSizeValue = new ArrayList<MeasurementType>();
        }
        return this.clinicalSizeValue;
    }

    /**
     * Gets the value of the clinicalSizeValueMaximum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clinicalSizeValueMaximum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClinicalSizeValueMaximum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getClinicalSizeValueMaximum() {
        if (clinicalSizeValueMaximum == null) {
            clinicalSizeValueMaximum = new ArrayList<MeasurementType>();
        }
        return this.clinicalSizeValueMaximum;
    }

    /**
     * Gets the value of the clinicalSizeMeasurementPrecisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ClinicalSizeMeasurementPrecisionCodeType }
     *     
     */
    public ClinicalSizeMeasurementPrecisionCodeType getClinicalSizeMeasurementPrecisionCode() {
        return clinicalSizeMeasurementPrecisionCode;
    }

    /**
     * Sets the value of the clinicalSizeMeasurementPrecisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClinicalSizeMeasurementPrecisionCodeType }
     *     
     */
    public void setClinicalSizeMeasurementPrecisionCode(ClinicalSizeMeasurementPrecisionCodeType value) {
        this.clinicalSizeMeasurementPrecisionCode = value;
    }

}
