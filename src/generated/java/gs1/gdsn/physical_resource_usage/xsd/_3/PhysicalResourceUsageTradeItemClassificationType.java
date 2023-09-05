
package gs1.gdsn.physical_resource_usage.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.CodeType;


/**
 * <p>Java class for PhysicalResourceUsageTradeItemClassificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalResourceUsageTradeItemClassificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="physicalResourceUsageClassificationCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="physicalResourceUsageSubclassificationCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="physicalResourceUsageRatingScaleCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalResourceUsageTradeItemClassificationType", propOrder = {
    "physicalResourceUsageClassificationCodeReference",
    "physicalResourceUsageSubclassificationCodeReference",
    "physicalResourceUsageRatingScaleCodeReference"
})
public class PhysicalResourceUsageTradeItemClassificationType {

    protected CodeType physicalResourceUsageClassificationCodeReference;
    protected CodeType physicalResourceUsageSubclassificationCodeReference;
    protected CodeType physicalResourceUsageRatingScaleCodeReference;

    /**
     * Gets the value of the physicalResourceUsageClassificationCodeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPhysicalResourceUsageClassificationCodeReference() {
        return physicalResourceUsageClassificationCodeReference;
    }

    /**
     * Sets the value of the physicalResourceUsageClassificationCodeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPhysicalResourceUsageClassificationCodeReference(CodeType value) {
        this.physicalResourceUsageClassificationCodeReference = value;
    }

    /**
     * Gets the value of the physicalResourceUsageSubclassificationCodeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPhysicalResourceUsageSubclassificationCodeReference() {
        return physicalResourceUsageSubclassificationCodeReference;
    }

    /**
     * Sets the value of the physicalResourceUsageSubclassificationCodeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPhysicalResourceUsageSubclassificationCodeReference(CodeType value) {
        this.physicalResourceUsageSubclassificationCodeReference = value;
    }

    /**
     * Gets the value of the physicalResourceUsageRatingScaleCodeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPhysicalResourceUsageRatingScaleCodeReference() {
        return physicalResourceUsageRatingScaleCodeReference;
    }

    /**
     * Sets the value of the physicalResourceUsageRatingScaleCodeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPhysicalResourceUsageRatingScaleCodeReference(CodeType value) {
        this.physicalResourceUsageRatingScaleCodeReference = value;
    }

}
