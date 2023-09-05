
package gs1.gdsn.packaging_sustainability.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description80Type;
import gs1.shared.shared_common.xsd._3.QuantityType;


/**
 * <p>Java class for AquaticEutrophicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AquaticEutrophicationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aquaticEutrophicationModelCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}AquaticEutrophicationModelCodeType" minOccurs="0"/&gt;
 *         &lt;element name="aquaticEutrophicationModelDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="aquaticEutrophicationReferenceSubstanceCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}AquaticEutrophicationReferenceSubstanceCodeType" minOccurs="0"/&gt;
 *         &lt;element name="aquaticEutrophicationReferenceSubstanceDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="aquaticEutrophicationMeasurement" type="{urn:gs1:shared:shared_common:xsd:3}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="aquaticEutrophicationWaterBodyTypeCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}AquaticEutrophicationWaterBodyTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="aquaticEutrophicationWaterBodyTypeDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AquaticEutrophicationType", propOrder = {
    "aquaticEutrophicationModelCode",
    "aquaticEutrophicationModelDescription",
    "aquaticEutrophicationReferenceSubstanceCode",
    "aquaticEutrophicationReferenceSubstanceDescription",
    "aquaticEutrophicationMeasurement",
    "aquaticEutrophicationWaterBodyTypeCode",
    "aquaticEutrophicationWaterBodyTypeDescription"
})
public class AquaticEutrophicationType {

    protected AquaticEutrophicationModelCodeType aquaticEutrophicationModelCode;
    protected List<Description80Type> aquaticEutrophicationModelDescription;
    protected AquaticEutrophicationReferenceSubstanceCodeType aquaticEutrophicationReferenceSubstanceCode;
    protected List<Description80Type> aquaticEutrophicationReferenceSubstanceDescription;
    protected QuantityType aquaticEutrophicationMeasurement;
    protected AquaticEutrophicationWaterBodyTypeCodeType aquaticEutrophicationWaterBodyTypeCode;
    protected List<Description80Type> aquaticEutrophicationWaterBodyTypeDescription;

    /**
     * Gets the value of the aquaticEutrophicationModelCode property.
     * 
     * @return
     *     possible object is
     *     {@link AquaticEutrophicationModelCodeType }
     *     
     */
    public AquaticEutrophicationModelCodeType getAquaticEutrophicationModelCode() {
        return aquaticEutrophicationModelCode;
    }

    /**
     * Sets the value of the aquaticEutrophicationModelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AquaticEutrophicationModelCodeType }
     *     
     */
    public void setAquaticEutrophicationModelCode(AquaticEutrophicationModelCodeType value) {
        this.aquaticEutrophicationModelCode = value;
    }

    /**
     * Gets the value of the aquaticEutrophicationModelDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aquaticEutrophicationModelDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAquaticEutrophicationModelDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getAquaticEutrophicationModelDescription() {
        if (aquaticEutrophicationModelDescription == null) {
            aquaticEutrophicationModelDescription = new ArrayList<Description80Type>();
        }
        return this.aquaticEutrophicationModelDescription;
    }

    /**
     * Gets the value of the aquaticEutrophicationReferenceSubstanceCode property.
     * 
     * @return
     *     possible object is
     *     {@link AquaticEutrophicationReferenceSubstanceCodeType }
     *     
     */
    public AquaticEutrophicationReferenceSubstanceCodeType getAquaticEutrophicationReferenceSubstanceCode() {
        return aquaticEutrophicationReferenceSubstanceCode;
    }

    /**
     * Sets the value of the aquaticEutrophicationReferenceSubstanceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AquaticEutrophicationReferenceSubstanceCodeType }
     *     
     */
    public void setAquaticEutrophicationReferenceSubstanceCode(AquaticEutrophicationReferenceSubstanceCodeType value) {
        this.aquaticEutrophicationReferenceSubstanceCode = value;
    }

    /**
     * Gets the value of the aquaticEutrophicationReferenceSubstanceDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aquaticEutrophicationReferenceSubstanceDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAquaticEutrophicationReferenceSubstanceDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getAquaticEutrophicationReferenceSubstanceDescription() {
        if (aquaticEutrophicationReferenceSubstanceDescription == null) {
            aquaticEutrophicationReferenceSubstanceDescription = new ArrayList<Description80Type>();
        }
        return this.aquaticEutrophicationReferenceSubstanceDescription;
    }

    /**
     * Gets the value of the aquaticEutrophicationMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getAquaticEutrophicationMeasurement() {
        return aquaticEutrophicationMeasurement;
    }

    /**
     * Sets the value of the aquaticEutrophicationMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setAquaticEutrophicationMeasurement(QuantityType value) {
        this.aquaticEutrophicationMeasurement = value;
    }

    /**
     * Gets the value of the aquaticEutrophicationWaterBodyTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link AquaticEutrophicationWaterBodyTypeCodeType }
     *     
     */
    public AquaticEutrophicationWaterBodyTypeCodeType getAquaticEutrophicationWaterBodyTypeCode() {
        return aquaticEutrophicationWaterBodyTypeCode;
    }

    /**
     * Sets the value of the aquaticEutrophicationWaterBodyTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AquaticEutrophicationWaterBodyTypeCodeType }
     *     
     */
    public void setAquaticEutrophicationWaterBodyTypeCode(AquaticEutrophicationWaterBodyTypeCodeType value) {
        this.aquaticEutrophicationWaterBodyTypeCode = value;
    }

    /**
     * Gets the value of the aquaticEutrophicationWaterBodyTypeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aquaticEutrophicationWaterBodyTypeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAquaticEutrophicationWaterBodyTypeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getAquaticEutrophicationWaterBodyTypeDescription() {
        if (aquaticEutrophicationWaterBodyTypeDescription == null) {
            aquaticEutrophicationWaterBodyTypeDescription = new ArrayList<Description80Type>();
        }
        return this.aquaticEutrophicationWaterBodyTypeDescription;
    }

}
