
package gs1.gdsn.physical_resource_usage.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;
import gs1.shared.shared_common.xsd._3.TimeMeasurementType;


/**
 * <p>Java class for PhysicalResourceUsageInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalResourceUsageInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="automaticPowerDownDefaultTimePeriod" type="{urn:gs1:shared:shared_common:xsd:3}TimeMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemAutomaticPowerDownEnabled" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="physicalResourceUsageInformation" type="{urn:gs1:gdsn:physical_resource_usage:xsd:3}PhysicalResourceUsageInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PhysicalResourceUsageInformationModuleType", propOrder = {
    "automaticPowerDownDefaultTimePeriod",
    "isTradeItemAutomaticPowerDownEnabled",
    "physicalResourceUsageInformation",
    "avpList"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:physical_resource_usage:xsd:3")
public class PhysicalResourceUsageInformationModuleType {

    protected TimeMeasurementType automaticPowerDownDefaultTimePeriod;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isTradeItemAutomaticPowerDownEnabled;
    protected List<PhysicalResourceUsageInformationType> physicalResourceUsageInformation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the automaticPowerDownDefaultTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasurementType }
     *     
     */
    public TimeMeasurementType getAutomaticPowerDownDefaultTimePeriod() {
        return automaticPowerDownDefaultTimePeriod;
    }

    /**
     * Sets the value of the automaticPowerDownDefaultTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasurementType }
     *     
     */
    public void setAutomaticPowerDownDefaultTimePeriod(TimeMeasurementType value) {
        this.automaticPowerDownDefaultTimePeriod = value;
    }

    /**
     * Gets the value of the isTradeItemAutomaticPowerDownEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsTradeItemAutomaticPowerDownEnabled() {
        return isTradeItemAutomaticPowerDownEnabled;
    }

    /**
     * Sets the value of the isTradeItemAutomaticPowerDownEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsTradeItemAutomaticPowerDownEnabled(NonBinaryLogicEnumerationType value) {
        this.isTradeItemAutomaticPowerDownEnabled = value;
    }

    /**
     * Gets the value of the physicalResourceUsageInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalResourceUsageInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalResourceUsageInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalResourceUsageInformationType }
     * 
     * 
     */
    public List<PhysicalResourceUsageInformationType> getPhysicalResourceUsageInformation() {
        if (physicalResourceUsageInformation == null) {
            physicalResourceUsageInformation = new ArrayList<PhysicalResourceUsageInformationType>();
        }
        return this.physicalResourceUsageInformation;
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
