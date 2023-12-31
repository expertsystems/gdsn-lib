
package gs1.gdsn.marketing_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description500Type;


/**
 * <p>Java class for TargetConsumerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetConsumerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="targetConsumerAge" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="targetConsumerGender" type="{urn:gs1:gdsn:marketing_information:xsd:3}TargetConsumerGenderCodeType" minOccurs="0"/&gt;
 *         &lt;element name="targetConsumerAgeGroup" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="targetConsumerAgeGroupCode" type="{urn:gs1:gdsn:marketing_information:xsd:3}TargetConsumerAgeGroupCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="targetConsumerUsage" type="{urn:gs1:gdsn:marketing_information:xsd:3}TargetConsumerUsageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetConsumerType", propOrder = {
    "targetConsumerAge",
    "targetConsumerGender",
    "targetConsumerAgeGroup",
    "targetConsumerAgeGroupCode",
    "targetConsumerUsage"
})
public class TargetConsumerType {

    protected List<Description500Type> targetConsumerAge;
    protected TargetConsumerGenderCodeType targetConsumerGender;
    protected List<Description500Type> targetConsumerAgeGroup;
    protected List<TargetConsumerAgeGroupCodeType> targetConsumerAgeGroupCode;
    protected List<TargetConsumerUsageType> targetConsumerUsage;

    /**
     * Gets the value of the targetConsumerAge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetConsumerAge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetConsumerAge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getTargetConsumerAge() {
        if (targetConsumerAge == null) {
            targetConsumerAge = new ArrayList<Description500Type>();
        }
        return this.targetConsumerAge;
    }

    /**
     * Gets the value of the targetConsumerGender property.
     * 
     * @return
     *     possible object is
     *     {@link TargetConsumerGenderCodeType }
     *     
     */
    public TargetConsumerGenderCodeType getTargetConsumerGender() {
        return targetConsumerGender;
    }

    /**
     * Sets the value of the targetConsumerGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetConsumerGenderCodeType }
     *     
     */
    public void setTargetConsumerGender(TargetConsumerGenderCodeType value) {
        this.targetConsumerGender = value;
    }

    /**
     * Gets the value of the targetConsumerAgeGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetConsumerAgeGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetConsumerAgeGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getTargetConsumerAgeGroup() {
        if (targetConsumerAgeGroup == null) {
            targetConsumerAgeGroup = new ArrayList<Description500Type>();
        }
        return this.targetConsumerAgeGroup;
    }

    /**
     * Gets the value of the targetConsumerAgeGroupCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetConsumerAgeGroupCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetConsumerAgeGroupCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetConsumerAgeGroupCodeType }
     * 
     * 
     */
    public List<TargetConsumerAgeGroupCodeType> getTargetConsumerAgeGroupCode() {
        if (targetConsumerAgeGroupCode == null) {
            targetConsumerAgeGroupCode = new ArrayList<TargetConsumerAgeGroupCodeType>();
        }
        return this.targetConsumerAgeGroupCode;
    }

    /**
     * Gets the value of the targetConsumerUsage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetConsumerUsage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetConsumerUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetConsumerUsageType }
     * 
     * 
     */
    public List<TargetConsumerUsageType> getTargetConsumerUsage() {
        if (targetConsumerUsage == null) {
            targetConsumerUsage = new ArrayList<TargetConsumerUsageType>();
        }
        return this.targetConsumerUsage;
    }

}
