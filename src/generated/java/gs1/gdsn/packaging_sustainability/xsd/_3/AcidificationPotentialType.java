
package gs1.gdsn.packaging_sustainability.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description80Type;
import gs1.shared.shared_common.xsd._3.QuantityType;


/**
 * <p>Java class for AcidificationPotentialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcidificationPotentialType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acidificationMeasurement" type="{urn:gs1:shared:shared_common:xsd:3}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="acidificationMeasurementReferenceSubstanceCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}AcidificationMeasurementReferenceSubstanceCodeType" minOccurs="0"/&gt;
 *         &lt;element name="acidificationMeasurementReferenceSubstanceDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="acidificationMeasurementProtocolCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}AcidificationMeasurementProtocolCodeType" minOccurs="0"/&gt;
 *         &lt;element name="acidificationMeasurementProtocolDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcidificationPotentialType", propOrder = {
    "acidificationMeasurement",
    "acidificationMeasurementReferenceSubstanceCode",
    "acidificationMeasurementReferenceSubstanceDescription",
    "acidificationMeasurementProtocolCode",
    "acidificationMeasurementProtocolDescription"
})
public class AcidificationPotentialType {

    protected QuantityType acidificationMeasurement;
    protected AcidificationMeasurementReferenceSubstanceCodeType acidificationMeasurementReferenceSubstanceCode;
    protected List<Description80Type> acidificationMeasurementReferenceSubstanceDescription;
    protected AcidificationMeasurementProtocolCodeType acidificationMeasurementProtocolCode;
    protected List<Description80Type> acidificationMeasurementProtocolDescription;

    /**
     * Gets the value of the acidificationMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getAcidificationMeasurement() {
        return acidificationMeasurement;
    }

    /**
     * Sets the value of the acidificationMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setAcidificationMeasurement(QuantityType value) {
        this.acidificationMeasurement = value;
    }

    /**
     * Gets the value of the acidificationMeasurementReferenceSubstanceCode property.
     * 
     * @return
     *     possible object is
     *     {@link AcidificationMeasurementReferenceSubstanceCodeType }
     *     
     */
    public AcidificationMeasurementReferenceSubstanceCodeType getAcidificationMeasurementReferenceSubstanceCode() {
        return acidificationMeasurementReferenceSubstanceCode;
    }

    /**
     * Sets the value of the acidificationMeasurementReferenceSubstanceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcidificationMeasurementReferenceSubstanceCodeType }
     *     
     */
    public void setAcidificationMeasurementReferenceSubstanceCode(AcidificationMeasurementReferenceSubstanceCodeType value) {
        this.acidificationMeasurementReferenceSubstanceCode = value;
    }

    /**
     * Gets the value of the acidificationMeasurementReferenceSubstanceDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acidificationMeasurementReferenceSubstanceDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcidificationMeasurementReferenceSubstanceDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getAcidificationMeasurementReferenceSubstanceDescription() {
        if (acidificationMeasurementReferenceSubstanceDescription == null) {
            acidificationMeasurementReferenceSubstanceDescription = new ArrayList<Description80Type>();
        }
        return this.acidificationMeasurementReferenceSubstanceDescription;
    }

    /**
     * Gets the value of the acidificationMeasurementProtocolCode property.
     * 
     * @return
     *     possible object is
     *     {@link AcidificationMeasurementProtocolCodeType }
     *     
     */
    public AcidificationMeasurementProtocolCodeType getAcidificationMeasurementProtocolCode() {
        return acidificationMeasurementProtocolCode;
    }

    /**
     * Sets the value of the acidificationMeasurementProtocolCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcidificationMeasurementProtocolCodeType }
     *     
     */
    public void setAcidificationMeasurementProtocolCode(AcidificationMeasurementProtocolCodeType value) {
        this.acidificationMeasurementProtocolCode = value;
    }

    /**
     * Gets the value of the acidificationMeasurementProtocolDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acidificationMeasurementProtocolDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcidificationMeasurementProtocolDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getAcidificationMeasurementProtocolDescription() {
        if (acidificationMeasurementProtocolDescription == null) {
            acidificationMeasurementProtocolDescription = new ArrayList<Description80Type>();
        }
        return this.acidificationMeasurementProtocolDescription;
    }

}
