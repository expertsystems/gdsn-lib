
package gs1.gdsn.packaging_sustainability.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.CodeType;
import gs1.shared.shared_common.xsd._3.Description80Type;
import gs1.shared.shared_common.xsd._3.QuantityType;


/**
 * <p>Java class for MassEquivalentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MassEquivalentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="massEquivalentMeasurement" type="{urn:gs1:shared:shared_common:xsd:3}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="massEquivalentCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}MassEquivalentCodeType" minOccurs="0"/&gt;
 *         &lt;element name="massEquivalentProtocolCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}MassEquivalentProtocolCodeType" minOccurs="0"/&gt;
 *         &lt;element name="massEquivalentProtocolDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="massEquivalentSubstanceCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="massEquivalentSubstanceDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MassEquivalentType", propOrder = {
    "massEquivalentMeasurement",
    "massEquivalentCode",
    "massEquivalentProtocolCode",
    "massEquivalentProtocolDescription",
    "massEquivalentSubstanceCodeReference",
    "massEquivalentSubstanceDescription"
})
public class MassEquivalentType {

    protected QuantityType massEquivalentMeasurement;
    protected MassEquivalentCodeType massEquivalentCode;
    protected MassEquivalentProtocolCodeType massEquivalentProtocolCode;
    protected List<Description80Type> massEquivalentProtocolDescription;
    protected CodeType massEquivalentSubstanceCodeReference;
    protected List<Description80Type> massEquivalentSubstanceDescription;

    /**
     * Gets the value of the massEquivalentMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getMassEquivalentMeasurement() {
        return massEquivalentMeasurement;
    }

    /**
     * Sets the value of the massEquivalentMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setMassEquivalentMeasurement(QuantityType value) {
        this.massEquivalentMeasurement = value;
    }

    /**
     * Gets the value of the massEquivalentCode property.
     * 
     * @return
     *     possible object is
     *     {@link MassEquivalentCodeType }
     *     
     */
    public MassEquivalentCodeType getMassEquivalentCode() {
        return massEquivalentCode;
    }

    /**
     * Sets the value of the massEquivalentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MassEquivalentCodeType }
     *     
     */
    public void setMassEquivalentCode(MassEquivalentCodeType value) {
        this.massEquivalentCode = value;
    }

    /**
     * Gets the value of the massEquivalentProtocolCode property.
     * 
     * @return
     *     possible object is
     *     {@link MassEquivalentProtocolCodeType }
     *     
     */
    public MassEquivalentProtocolCodeType getMassEquivalentProtocolCode() {
        return massEquivalentProtocolCode;
    }

    /**
     * Sets the value of the massEquivalentProtocolCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MassEquivalentProtocolCodeType }
     *     
     */
    public void setMassEquivalentProtocolCode(MassEquivalentProtocolCodeType value) {
        this.massEquivalentProtocolCode = value;
    }

    /**
     * Gets the value of the massEquivalentProtocolDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the massEquivalentProtocolDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMassEquivalentProtocolDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getMassEquivalentProtocolDescription() {
        if (massEquivalentProtocolDescription == null) {
            massEquivalentProtocolDescription = new ArrayList<Description80Type>();
        }
        return this.massEquivalentProtocolDescription;
    }

    /**
     * Gets the value of the massEquivalentSubstanceCodeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMassEquivalentSubstanceCodeReference() {
        return massEquivalentSubstanceCodeReference;
    }

    /**
     * Sets the value of the massEquivalentSubstanceCodeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMassEquivalentSubstanceCodeReference(CodeType value) {
        this.massEquivalentSubstanceCodeReference = value;
    }

    /**
     * Gets the value of the massEquivalentSubstanceDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the massEquivalentSubstanceDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMassEquivalentSubstanceDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getMassEquivalentSubstanceDescription() {
        if (massEquivalentSubstanceDescription == null) {
            massEquivalentSubstanceDescription = new ArrayList<Description80Type>();
        }
        return this.massEquivalentSubstanceDescription;
    }

}
