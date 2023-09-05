
package gs1.gdsn.physical_resource_usage.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.CodeType;


/**
 * <p>Java class for PhysicalResourceUsageInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalResourceUsageInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="physicalResourceTypeCode" type="{urn:gs1:gdsn:physical_resource_usage:xsd:3}PhysicalResourceTypeCodeType"/&gt;
 *         &lt;element name="physicalResourceUsageAgencyCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="physicalResourceUsage" type="{urn:gs1:gdsn:physical_resource_usage:xsd:3}PhysicalResourceUsageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="physicalResourceUsageTradeItemClassification" type="{urn:gs1:gdsn:physical_resource_usage:xsd:3}PhysicalResourceUsageTradeItemClassificationType" minOccurs="0"/&gt;
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
@XmlType(name = "PhysicalResourceUsageInformationType", propOrder = {
    "physicalResourceTypeCode",
    "physicalResourceUsageAgencyCodeReference",
    "physicalResourceUsage",
    "physicalResourceUsageTradeItemClassification",
    "avpList"
})
public class PhysicalResourceUsageInformationType {

    @XmlElement(required = true)
    protected PhysicalResourceTypeCodeType physicalResourceTypeCode;
    protected CodeType physicalResourceUsageAgencyCodeReference;
    protected List<PhysicalResourceUsageType> physicalResourceUsage;
    protected PhysicalResourceUsageTradeItemClassificationType physicalResourceUsageTradeItemClassification;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the physicalResourceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalResourceTypeCodeType }
     *     
     */
    public PhysicalResourceTypeCodeType getPhysicalResourceTypeCode() {
        return physicalResourceTypeCode;
    }

    /**
     * Sets the value of the physicalResourceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalResourceTypeCodeType }
     *     
     */
    public void setPhysicalResourceTypeCode(PhysicalResourceTypeCodeType value) {
        this.physicalResourceTypeCode = value;
    }

    /**
     * Gets the value of the physicalResourceUsageAgencyCodeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPhysicalResourceUsageAgencyCodeReference() {
        return physicalResourceUsageAgencyCodeReference;
    }

    /**
     * Sets the value of the physicalResourceUsageAgencyCodeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPhysicalResourceUsageAgencyCodeReference(CodeType value) {
        this.physicalResourceUsageAgencyCodeReference = value;
    }

    /**
     * Gets the value of the physicalResourceUsage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalResourceUsage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalResourceUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalResourceUsageType }
     * 
     * 
     */
    public List<PhysicalResourceUsageType> getPhysicalResourceUsage() {
        if (physicalResourceUsage == null) {
            physicalResourceUsage = new ArrayList<PhysicalResourceUsageType>();
        }
        return this.physicalResourceUsage;
    }

    /**
     * Gets the value of the physicalResourceUsageTradeItemClassification property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalResourceUsageTradeItemClassificationType }
     *     
     */
    public PhysicalResourceUsageTradeItemClassificationType getPhysicalResourceUsageTradeItemClassification() {
        return physicalResourceUsageTradeItemClassification;
    }

    /**
     * Sets the value of the physicalResourceUsageTradeItemClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalResourceUsageTradeItemClassificationType }
     *     
     */
    public void setPhysicalResourceUsageTradeItemClassification(PhysicalResourceUsageTradeItemClassificationType value) {
        this.physicalResourceUsageTradeItemClassification = value;
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
