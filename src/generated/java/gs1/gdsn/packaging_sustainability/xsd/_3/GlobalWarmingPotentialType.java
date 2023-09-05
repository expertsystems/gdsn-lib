
package gs1.gdsn.packaging_sustainability.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description80Type;
import gs1.shared.shared_common.xsd._3.QuantityType;


/**
 * <p>Java class for GlobalWarmingPotentialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalWarmingPotentialType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globalWarmingPotentialEquivalentBasisYearsCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}GlobalWarmingPotentialEquivalentBasisYearsCodeType" minOccurs="0"/&gt;
 *         &lt;element name="globalWarmingPotentialEquivalentBasisYearsDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="globalWarmingPotentialEquivalent" type="{urn:gs1:shared:shared_common:xsd:3}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="globalWarmingPotentialEquivalentProtocolCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}GlobalWarmingPotentialEquivalentProtocolCodeType" minOccurs="0"/&gt;
 *         &lt;element name="globalWarmingPotentialEquivalentProtocolDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="globalWarmingPotentialEquivalentSubstanceCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}GlobalWarmingPotentialEquivalentSubstanceCodeType" minOccurs="0"/&gt;
 *         &lt;element name="globalWarmingPotentialEquivalentSubstanceDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalWarmingPotentialType", propOrder = {
    "globalWarmingPotentialEquivalentBasisYearsCode",
    "globalWarmingPotentialEquivalentBasisYearsDescription",
    "globalWarmingPotentialEquivalent",
    "globalWarmingPotentialEquivalentProtocolCode",
    "globalWarmingPotentialEquivalentProtocolDescription",
    "globalWarmingPotentialEquivalentSubstanceCode",
    "globalWarmingPotentialEquivalentSubstanceDescription"
})
public class GlobalWarmingPotentialType {

    protected GlobalWarmingPotentialEquivalentBasisYearsCodeType globalWarmingPotentialEquivalentBasisYearsCode;
    protected List<Description80Type> globalWarmingPotentialEquivalentBasisYearsDescription;
    protected QuantityType globalWarmingPotentialEquivalent;
    protected GlobalWarmingPotentialEquivalentProtocolCodeType globalWarmingPotentialEquivalentProtocolCode;
    protected List<Description80Type> globalWarmingPotentialEquivalentProtocolDescription;
    protected GlobalWarmingPotentialEquivalentSubstanceCodeType globalWarmingPotentialEquivalentSubstanceCode;
    protected List<Description80Type> globalWarmingPotentialEquivalentSubstanceDescription;

    /**
     * Gets the value of the globalWarmingPotentialEquivalentBasisYearsCode property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalWarmingPotentialEquivalentBasisYearsCodeType }
     *     
     */
    public GlobalWarmingPotentialEquivalentBasisYearsCodeType getGlobalWarmingPotentialEquivalentBasisYearsCode() {
        return globalWarmingPotentialEquivalentBasisYearsCode;
    }

    /**
     * Sets the value of the globalWarmingPotentialEquivalentBasisYearsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalWarmingPotentialEquivalentBasisYearsCodeType }
     *     
     */
    public void setGlobalWarmingPotentialEquivalentBasisYearsCode(GlobalWarmingPotentialEquivalentBasisYearsCodeType value) {
        this.globalWarmingPotentialEquivalentBasisYearsCode = value;
    }

    /**
     * Gets the value of the globalWarmingPotentialEquivalentBasisYearsDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalWarmingPotentialEquivalentBasisYearsDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalWarmingPotentialEquivalentBasisYearsDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getGlobalWarmingPotentialEquivalentBasisYearsDescription() {
        if (globalWarmingPotentialEquivalentBasisYearsDescription == null) {
            globalWarmingPotentialEquivalentBasisYearsDescription = new ArrayList<Description80Type>();
        }
        return this.globalWarmingPotentialEquivalentBasisYearsDescription;
    }

    /**
     * Gets the value of the globalWarmingPotentialEquivalent property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getGlobalWarmingPotentialEquivalent() {
        return globalWarmingPotentialEquivalent;
    }

    /**
     * Sets the value of the globalWarmingPotentialEquivalent property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setGlobalWarmingPotentialEquivalent(QuantityType value) {
        this.globalWarmingPotentialEquivalent = value;
    }

    /**
     * Gets the value of the globalWarmingPotentialEquivalentProtocolCode property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalWarmingPotentialEquivalentProtocolCodeType }
     *     
     */
    public GlobalWarmingPotentialEquivalentProtocolCodeType getGlobalWarmingPotentialEquivalentProtocolCode() {
        return globalWarmingPotentialEquivalentProtocolCode;
    }

    /**
     * Sets the value of the globalWarmingPotentialEquivalentProtocolCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalWarmingPotentialEquivalentProtocolCodeType }
     *     
     */
    public void setGlobalWarmingPotentialEquivalentProtocolCode(GlobalWarmingPotentialEquivalentProtocolCodeType value) {
        this.globalWarmingPotentialEquivalentProtocolCode = value;
    }

    /**
     * Gets the value of the globalWarmingPotentialEquivalentProtocolDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalWarmingPotentialEquivalentProtocolDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalWarmingPotentialEquivalentProtocolDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getGlobalWarmingPotentialEquivalentProtocolDescription() {
        if (globalWarmingPotentialEquivalentProtocolDescription == null) {
            globalWarmingPotentialEquivalentProtocolDescription = new ArrayList<Description80Type>();
        }
        return this.globalWarmingPotentialEquivalentProtocolDescription;
    }

    /**
     * Gets the value of the globalWarmingPotentialEquivalentSubstanceCode property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalWarmingPotentialEquivalentSubstanceCodeType }
     *     
     */
    public GlobalWarmingPotentialEquivalentSubstanceCodeType getGlobalWarmingPotentialEquivalentSubstanceCode() {
        return globalWarmingPotentialEquivalentSubstanceCode;
    }

    /**
     * Sets the value of the globalWarmingPotentialEquivalentSubstanceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalWarmingPotentialEquivalentSubstanceCodeType }
     *     
     */
    public void setGlobalWarmingPotentialEquivalentSubstanceCode(GlobalWarmingPotentialEquivalentSubstanceCodeType value) {
        this.globalWarmingPotentialEquivalentSubstanceCode = value;
    }

    /**
     * Gets the value of the globalWarmingPotentialEquivalentSubstanceDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalWarmingPotentialEquivalentSubstanceDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalWarmingPotentialEquivalentSubstanceDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getGlobalWarmingPotentialEquivalentSubstanceDescription() {
        if (globalWarmingPotentialEquivalentSubstanceDescription == null) {
            globalWarmingPotentialEquivalentSubstanceDescription = new ArrayList<Description80Type>();
        }
        return this.globalWarmingPotentialEquivalentSubstanceDescription;
    }

}
