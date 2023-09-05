
package gs1.gdsn.controlled_substance.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for ControlledSubstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControlledSubstanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlledSubstanceAmount" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="controlledSubstanceCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="controlledSubstanceName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlledSubstanceType", propOrder = {
    "controlledSubstanceAmount",
    "controlledSubstanceCode",
    "controlledSubstanceName"
})
public class ControlledSubstanceType {

    protected MeasurementType controlledSubstanceAmount;
    protected String controlledSubstanceCode;
    protected String controlledSubstanceName;

    /**
     * Gets the value of the controlledSubstanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getControlledSubstanceAmount() {
        return controlledSubstanceAmount;
    }

    /**
     * Sets the value of the controlledSubstanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setControlledSubstanceAmount(MeasurementType value) {
        this.controlledSubstanceAmount = value;
    }

    /**
     * Gets the value of the controlledSubstanceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlledSubstanceCode() {
        return controlledSubstanceCode;
    }

    /**
     * Sets the value of the controlledSubstanceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlledSubstanceCode(String value) {
        this.controlledSubstanceCode = value;
    }

    /**
     * Gets the value of the controlledSubstanceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlledSubstanceName() {
        return controlledSubstanceName;
    }

    /**
     * Sets the value of the controlledSubstanceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlledSubstanceName(String value) {
        this.controlledSubstanceName = value;
    }

}
