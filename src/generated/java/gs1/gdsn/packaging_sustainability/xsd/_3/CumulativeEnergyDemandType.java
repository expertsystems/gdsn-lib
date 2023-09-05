
package gs1.gdsn.packaging_sustainability.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description80Type;
import gs1.shared.shared_common.xsd._3.QuantityType;


/**
 * <p>Java class for CumulativeEnergyDemandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CumulativeEnergyDemandType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cumulativeEnergyDemand" type="{urn:gs1:shared:shared_common:xsd:3}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="cumulativeEnergyDemandTypeCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}CumulativeEnergyDemandTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="cumulativeEnergyDemandDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cumulativeEnergyDemandReferenceSubstanceCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}CumulativeEnergyDemandReferenceSubstanceCodeType" minOccurs="0"/&gt;
 *         &lt;element name="cumulativeEnergyDemandReferenceSubstanceDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cumulativeEnergyDemandProtocolCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}CumulativeEnergyDemandProtocolCodeType" minOccurs="0"/&gt;
 *         &lt;element name="cumulativeEnergyDemandProtocolDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CumulativeEnergyDemandType", propOrder = {
    "cumulativeEnergyDemand",
    "cumulativeEnergyDemandTypeCode",
    "cumulativeEnergyDemandDescription",
    "cumulativeEnergyDemandReferenceSubstanceCode",
    "cumulativeEnergyDemandReferenceSubstanceDescription",
    "cumulativeEnergyDemandProtocolCode",
    "cumulativeEnergyDemandProtocolDescription"
})
public class CumulativeEnergyDemandType {

    protected QuantityType cumulativeEnergyDemand;
    protected CumulativeEnergyDemandTypeCodeType cumulativeEnergyDemandTypeCode;
    protected List<Description80Type> cumulativeEnergyDemandDescription;
    protected CumulativeEnergyDemandReferenceSubstanceCodeType cumulativeEnergyDemandReferenceSubstanceCode;
    protected List<Description80Type> cumulativeEnergyDemandReferenceSubstanceDescription;
    protected CumulativeEnergyDemandProtocolCodeType cumulativeEnergyDemandProtocolCode;
    protected List<Description80Type> cumulativeEnergyDemandProtocolDescription;

    /**
     * Gets the value of the cumulativeEnergyDemand property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getCumulativeEnergyDemand() {
        return cumulativeEnergyDemand;
    }

    /**
     * Sets the value of the cumulativeEnergyDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setCumulativeEnergyDemand(QuantityType value) {
        this.cumulativeEnergyDemand = value;
    }

    /**
     * Gets the value of the cumulativeEnergyDemandTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CumulativeEnergyDemandTypeCodeType }
     *     
     */
    public CumulativeEnergyDemandTypeCodeType getCumulativeEnergyDemandTypeCode() {
        return cumulativeEnergyDemandTypeCode;
    }

    /**
     * Sets the value of the cumulativeEnergyDemandTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CumulativeEnergyDemandTypeCodeType }
     *     
     */
    public void setCumulativeEnergyDemandTypeCode(CumulativeEnergyDemandTypeCodeType value) {
        this.cumulativeEnergyDemandTypeCode = value;
    }

    /**
     * Gets the value of the cumulativeEnergyDemandDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cumulativeEnergyDemandDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCumulativeEnergyDemandDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getCumulativeEnergyDemandDescription() {
        if (cumulativeEnergyDemandDescription == null) {
            cumulativeEnergyDemandDescription = new ArrayList<Description80Type>();
        }
        return this.cumulativeEnergyDemandDescription;
    }

    /**
     * Gets the value of the cumulativeEnergyDemandReferenceSubstanceCode property.
     * 
     * @return
     *     possible object is
     *     {@link CumulativeEnergyDemandReferenceSubstanceCodeType }
     *     
     */
    public CumulativeEnergyDemandReferenceSubstanceCodeType getCumulativeEnergyDemandReferenceSubstanceCode() {
        return cumulativeEnergyDemandReferenceSubstanceCode;
    }

    /**
     * Sets the value of the cumulativeEnergyDemandReferenceSubstanceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CumulativeEnergyDemandReferenceSubstanceCodeType }
     *     
     */
    public void setCumulativeEnergyDemandReferenceSubstanceCode(CumulativeEnergyDemandReferenceSubstanceCodeType value) {
        this.cumulativeEnergyDemandReferenceSubstanceCode = value;
    }

    /**
     * Gets the value of the cumulativeEnergyDemandReferenceSubstanceDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cumulativeEnergyDemandReferenceSubstanceDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCumulativeEnergyDemandReferenceSubstanceDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getCumulativeEnergyDemandReferenceSubstanceDescription() {
        if (cumulativeEnergyDemandReferenceSubstanceDescription == null) {
            cumulativeEnergyDemandReferenceSubstanceDescription = new ArrayList<Description80Type>();
        }
        return this.cumulativeEnergyDemandReferenceSubstanceDescription;
    }

    /**
     * Gets the value of the cumulativeEnergyDemandProtocolCode property.
     * 
     * @return
     *     possible object is
     *     {@link CumulativeEnergyDemandProtocolCodeType }
     *     
     */
    public CumulativeEnergyDemandProtocolCodeType getCumulativeEnergyDemandProtocolCode() {
        return cumulativeEnergyDemandProtocolCode;
    }

    /**
     * Sets the value of the cumulativeEnergyDemandProtocolCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CumulativeEnergyDemandProtocolCodeType }
     *     
     */
    public void setCumulativeEnergyDemandProtocolCode(CumulativeEnergyDemandProtocolCodeType value) {
        this.cumulativeEnergyDemandProtocolCode = value;
    }

    /**
     * Gets the value of the cumulativeEnergyDemandProtocolDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cumulativeEnergyDemandProtocolDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCumulativeEnergyDemandProtocolDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getCumulativeEnergyDemandProtocolDescription() {
        if (cumulativeEnergyDemandProtocolDescription == null) {
            cumulativeEnergyDemandProtocolDescription = new ArrayList<Description80Type>();
        }
        return this.cumulativeEnergyDemandProtocolDescription;
    }

}
