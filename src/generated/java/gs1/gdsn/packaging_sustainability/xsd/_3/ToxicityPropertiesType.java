
package gs1.gdsn.packaging_sustainability.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description80Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for ToxicityPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ToxicityPropertiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasCancerousProperties" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="toxicityMeasurement" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="toxicityReferenceSubstanceCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}ToxicityReferenceSubstanceCodeType" minOccurs="0"/&gt;
 *         &lt;element name="toxicityReferenceSubstanceDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="toxicityMeasurementProtocolCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}ToxicityMeasurementProtocolCodeType" minOccurs="0"/&gt;
 *         &lt;element name="toxicityMeasurementProtocolDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ToxicityPropertiesType", propOrder = {
    "hasCancerousProperties",
    "toxicityMeasurement",
    "toxicityReferenceSubstanceCode",
    "toxicityReferenceSubstanceDescription",
    "toxicityMeasurementProtocolCode",
    "toxicityMeasurementProtocolDescription"
})
public class ToxicityPropertiesType {

    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType hasCancerousProperties;
    protected MeasurementType toxicityMeasurement;
    protected ToxicityReferenceSubstanceCodeType toxicityReferenceSubstanceCode;
    protected List<Description80Type> toxicityReferenceSubstanceDescription;
    protected ToxicityMeasurementProtocolCodeType toxicityMeasurementProtocolCode;
    protected List<Description80Type> toxicityMeasurementProtocolDescription;

    /**
     * Gets the value of the hasCancerousProperties property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getHasCancerousProperties() {
        return hasCancerousProperties;
    }

    /**
     * Sets the value of the hasCancerousProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setHasCancerousProperties(NonBinaryLogicEnumerationType value) {
        this.hasCancerousProperties = value;
    }

    /**
     * Gets the value of the toxicityMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getToxicityMeasurement() {
        return toxicityMeasurement;
    }

    /**
     * Sets the value of the toxicityMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setToxicityMeasurement(MeasurementType value) {
        this.toxicityMeasurement = value;
    }

    /**
     * Gets the value of the toxicityReferenceSubstanceCode property.
     * 
     * @return
     *     possible object is
     *     {@link ToxicityReferenceSubstanceCodeType }
     *     
     */
    public ToxicityReferenceSubstanceCodeType getToxicityReferenceSubstanceCode() {
        return toxicityReferenceSubstanceCode;
    }

    /**
     * Sets the value of the toxicityReferenceSubstanceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToxicityReferenceSubstanceCodeType }
     *     
     */
    public void setToxicityReferenceSubstanceCode(ToxicityReferenceSubstanceCodeType value) {
        this.toxicityReferenceSubstanceCode = value;
    }

    /**
     * Gets the value of the toxicityReferenceSubstanceDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toxicityReferenceSubstanceDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToxicityReferenceSubstanceDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getToxicityReferenceSubstanceDescription() {
        if (toxicityReferenceSubstanceDescription == null) {
            toxicityReferenceSubstanceDescription = new ArrayList<Description80Type>();
        }
        return this.toxicityReferenceSubstanceDescription;
    }

    /**
     * Gets the value of the toxicityMeasurementProtocolCode property.
     * 
     * @return
     *     possible object is
     *     {@link ToxicityMeasurementProtocolCodeType }
     *     
     */
    public ToxicityMeasurementProtocolCodeType getToxicityMeasurementProtocolCode() {
        return toxicityMeasurementProtocolCode;
    }

    /**
     * Sets the value of the toxicityMeasurementProtocolCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToxicityMeasurementProtocolCodeType }
     *     
     */
    public void setToxicityMeasurementProtocolCode(ToxicityMeasurementProtocolCodeType value) {
        this.toxicityMeasurementProtocolCode = value;
    }

    /**
     * Gets the value of the toxicityMeasurementProtocolDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toxicityMeasurementProtocolDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToxicityMeasurementProtocolDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getToxicityMeasurementProtocolDescription() {
        if (toxicityMeasurementProtocolDescription == null) {
            toxicityMeasurementProtocolDescription = new ArrayList<Description80Type>();
        }
        return this.toxicityMeasurementProtocolDescription;
    }

}
