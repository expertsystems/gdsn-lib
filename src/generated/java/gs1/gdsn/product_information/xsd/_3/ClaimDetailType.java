
package gs1.gdsn.product_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for ClaimDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="claimMarkedOnPackage" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="isClaimRegulated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="claimTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}ClaimTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="claimElementCode" type="{urn:gs1:gdsn:product_information:xsd:3}ClaimElementCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimDetailType", propOrder = {
    "claimMarkedOnPackage",
    "isClaimRegulated",
    "claimTypeCode",
    "claimElementCode"
})
public class ClaimDetailType {

    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType claimMarkedOnPackage;
    protected Boolean isClaimRegulated;
    protected ClaimTypeCodeType claimTypeCode;
    protected ClaimElementCodeType claimElementCode;

    /**
     * Gets the value of the claimMarkedOnPackage property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getClaimMarkedOnPackage() {
        return claimMarkedOnPackage;
    }

    /**
     * Sets the value of the claimMarkedOnPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setClaimMarkedOnPackage(NonBinaryLogicEnumerationType value) {
        this.claimMarkedOnPackage = value;
    }

    /**
     * Gets the value of the isClaimRegulated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsClaimRegulated() {
        return isClaimRegulated;
    }

    /**
     * Sets the value of the isClaimRegulated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsClaimRegulated(Boolean value) {
        this.isClaimRegulated = value;
    }

    /**
     * Gets the value of the claimTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimTypeCodeType }
     *     
     */
    public ClaimTypeCodeType getClaimTypeCode() {
        return claimTypeCode;
    }

    /**
     * Sets the value of the claimTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimTypeCodeType }
     *     
     */
    public void setClaimTypeCode(ClaimTypeCodeType value) {
        this.claimTypeCode = value;
    }

    /**
     * Gets the value of the claimElementCode property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimElementCodeType }
     *     
     */
    public ClaimElementCodeType getClaimElementCode() {
        return claimElementCode;
    }

    /**
     * Sets the value of the claimElementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimElementCodeType }
     *     
     */
    public void setClaimElementCode(ClaimElementCodeType value) {
        this.claimElementCode = value;
    }

}
