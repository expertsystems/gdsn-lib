
package gs1.gdsn.packaging_sustainability.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description80Type;
import gs1.shared.shared_common.xsd._3.QuantityType;


/**
 * <p>Java class for FreshWaterEcotoxicityPotentialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreshWaterEcotoxicityPotentialType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="freshWaterEcotoxicityModelCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}FreshWaterEcotoxicityModelCodeType" minOccurs="0"/&gt;
 *         &lt;element name="freshWaterEcotoxicityModelDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="freshWaterEcotoxicityReferenceSubstanceCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}FreshWaterEcotoxicityReferenceSubstanceCodeType" minOccurs="0"/&gt;
 *         &lt;element name="freshWaterEcotoxicityReferenceSubstanceDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="freshWaterEcotoxicityMeasurement" type="{urn:gs1:shared:shared_common:xsd:3}QuantityType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreshWaterEcotoxicityPotentialType", propOrder = {
    "freshWaterEcotoxicityModelCode",
    "freshWaterEcotoxicityModelDescription",
    "freshWaterEcotoxicityReferenceSubstanceCode",
    "freshWaterEcotoxicityReferenceSubstanceDescription",
    "freshWaterEcotoxicityMeasurement"
})
public class FreshWaterEcotoxicityPotentialType {

    protected FreshWaterEcotoxicityModelCodeType freshWaterEcotoxicityModelCode;
    protected List<Description80Type> freshWaterEcotoxicityModelDescription;
    protected FreshWaterEcotoxicityReferenceSubstanceCodeType freshWaterEcotoxicityReferenceSubstanceCode;
    protected List<Description80Type> freshWaterEcotoxicityReferenceSubstanceDescription;
    protected QuantityType freshWaterEcotoxicityMeasurement;

    /**
     * Gets the value of the freshWaterEcotoxicityModelCode property.
     * 
     * @return
     *     possible object is
     *     {@link FreshWaterEcotoxicityModelCodeType }
     *     
     */
    public FreshWaterEcotoxicityModelCodeType getFreshWaterEcotoxicityModelCode() {
        return freshWaterEcotoxicityModelCode;
    }

    /**
     * Sets the value of the freshWaterEcotoxicityModelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreshWaterEcotoxicityModelCodeType }
     *     
     */
    public void setFreshWaterEcotoxicityModelCode(FreshWaterEcotoxicityModelCodeType value) {
        this.freshWaterEcotoxicityModelCode = value;
    }

    /**
     * Gets the value of the freshWaterEcotoxicityModelDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freshWaterEcotoxicityModelDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreshWaterEcotoxicityModelDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getFreshWaterEcotoxicityModelDescription() {
        if (freshWaterEcotoxicityModelDescription == null) {
            freshWaterEcotoxicityModelDescription = new ArrayList<Description80Type>();
        }
        return this.freshWaterEcotoxicityModelDescription;
    }

    /**
     * Gets the value of the freshWaterEcotoxicityReferenceSubstanceCode property.
     * 
     * @return
     *     possible object is
     *     {@link FreshWaterEcotoxicityReferenceSubstanceCodeType }
     *     
     */
    public FreshWaterEcotoxicityReferenceSubstanceCodeType getFreshWaterEcotoxicityReferenceSubstanceCode() {
        return freshWaterEcotoxicityReferenceSubstanceCode;
    }

    /**
     * Sets the value of the freshWaterEcotoxicityReferenceSubstanceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreshWaterEcotoxicityReferenceSubstanceCodeType }
     *     
     */
    public void setFreshWaterEcotoxicityReferenceSubstanceCode(FreshWaterEcotoxicityReferenceSubstanceCodeType value) {
        this.freshWaterEcotoxicityReferenceSubstanceCode = value;
    }

    /**
     * Gets the value of the freshWaterEcotoxicityReferenceSubstanceDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freshWaterEcotoxicityReferenceSubstanceDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreshWaterEcotoxicityReferenceSubstanceDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getFreshWaterEcotoxicityReferenceSubstanceDescription() {
        if (freshWaterEcotoxicityReferenceSubstanceDescription == null) {
            freshWaterEcotoxicityReferenceSubstanceDescription = new ArrayList<Description80Type>();
        }
        return this.freshWaterEcotoxicityReferenceSubstanceDescription;
    }

    /**
     * Gets the value of the freshWaterEcotoxicityMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getFreshWaterEcotoxicityMeasurement() {
        return freshWaterEcotoxicityMeasurement;
    }

    /**
     * Sets the value of the freshWaterEcotoxicityMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setFreshWaterEcotoxicityMeasurement(QuantityType value) {
        this.freshWaterEcotoxicityMeasurement = value;
    }

}
