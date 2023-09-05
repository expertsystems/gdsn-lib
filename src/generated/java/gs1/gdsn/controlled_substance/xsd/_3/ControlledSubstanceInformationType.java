
package gs1.gdsn.controlled_substance.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.CodeType;


/**
 * <p>Java class for ControlledSubstanceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControlledSubstanceInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlledSubstanceScheduleCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType"/&gt;
 *         &lt;element name="controlledSubstance" type="{urn:gs1:gdsn:controlled_substance:xsd:3}ControlledSubstanceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="avpList" type="{urn:gs1:gdsn:gdsn_common:xsd:3}GS1_AttributeValuePairListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlledSubstanceInformationType", propOrder = {
    "controlledSubstanceScheduleCodeReference",
    "controlledSubstance",
    "avpList"
})
public class ControlledSubstanceInformationType {

    @XmlElement(required = true)
    protected CodeType controlledSubstanceScheduleCodeReference;
    protected List<ControlledSubstanceType> controlledSubstance;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the controlledSubstanceScheduleCodeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getControlledSubstanceScheduleCodeReference() {
        return controlledSubstanceScheduleCodeReference;
    }

    /**
     * Sets the value of the controlledSubstanceScheduleCodeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setControlledSubstanceScheduleCodeReference(CodeType value) {
        this.controlledSubstanceScheduleCodeReference = value;
    }

    /**
     * Gets the value of the controlledSubstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlledSubstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlledSubstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlledSubstanceType }
     * 
     * 
     */
    public List<ControlledSubstanceType> getControlledSubstance() {
        if (controlledSubstance == null) {
            controlledSubstance = new ArrayList<ControlledSubstanceType>();
        }
        return this.controlledSubstance;
    }

    /**
     * Gets the value of the avpList property.
     * 
     * @return
     *     possible object is
     *     {@link GS1AttributeValuePairListType }
     *     
     */
    public GS1AttributeValuePairListType getAvpList() {
        return avpList;
    }

    /**
     * Sets the value of the avpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GS1AttributeValuePairListType }
     *     
     */
    public void setAvpList(GS1AttributeValuePairListType value) {
        this.avpList = value;
    }

}
