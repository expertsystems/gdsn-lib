
package gs1.gdsn.controlled_substance.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for ControlledSubstanceModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControlledSubstanceModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="doesItemContainAControlledSubstance" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="controlledSubstanceInformation" type="{urn:gs1:gdsn:controlled_substance:xsd:3}ControlledSubstanceInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ControlledSubstanceModuleType", propOrder = {
    "doesItemContainAControlledSubstance",
    "controlledSubstanceInformation",
    "avpList"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:controlled_substance:xsd:3")
public class ControlledSubstanceModuleType {

    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType doesItemContainAControlledSubstance;
    protected List<ControlledSubstanceInformationType> controlledSubstanceInformation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the doesItemContainAControlledSubstance property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getDoesItemContainAControlledSubstance() {
        return doesItemContainAControlledSubstance;
    }

    /**
     * Sets the value of the doesItemContainAControlledSubstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setDoesItemContainAControlledSubstance(NonBinaryLogicEnumerationType value) {
        this.doesItemContainAControlledSubstance = value;
    }

    /**
     * Gets the value of the controlledSubstanceInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlledSubstanceInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlledSubstanceInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlledSubstanceInformationType }
     * 
     * 
     */
    public List<ControlledSubstanceInformationType> getControlledSubstanceInformation() {
        if (controlledSubstanceInformation == null) {
            controlledSubstanceInformation = new ArrayList<ControlledSubstanceInformationType>();
        }
        return this.controlledSubstanceInformation;
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
