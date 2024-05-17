
package gs1.gdsn.packaging_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackagingClaimsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingClaimsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packagingClaimElementCode" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackagingClaimElementCodeType" minOccurs="0"/&gt;
 *         &lt;element name="isPackagingClaimMarkedOnPackage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isPackagingClaimRegulated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="packagingClaimTypeCode" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackagingClaimTypeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingClaimsType", propOrder = {
    "packagingClaimElementCode",
    "isPackagingClaimMarkedOnPackage",
    "isPackagingClaimRegulated",
    "packagingClaimTypeCode"
})
public class PackagingClaimsType {

    protected PackagingClaimElementCodeType packagingClaimElementCode;
    protected Boolean isPackagingClaimMarkedOnPackage;
    protected Boolean isPackagingClaimRegulated;
    protected PackagingClaimTypeCodeType packagingClaimTypeCode;

    /**
     * Gets the value of the packagingClaimElementCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingClaimElementCodeType }
     *     
     */
    public PackagingClaimElementCodeType getPackagingClaimElementCode() {
        return packagingClaimElementCode;
    }

    /**
     * Sets the value of the packagingClaimElementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingClaimElementCodeType }
     *     
     */
    public void setPackagingClaimElementCode(PackagingClaimElementCodeType value) {
        this.packagingClaimElementCode = value;
    }

    /**
     * Gets the value of the isPackagingClaimMarkedOnPackage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPackagingClaimMarkedOnPackage() {
        return isPackagingClaimMarkedOnPackage;
    }

    /**
     * Sets the value of the isPackagingClaimMarkedOnPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPackagingClaimMarkedOnPackage(Boolean value) {
        this.isPackagingClaimMarkedOnPackage = value;
    }

    /**
     * Gets the value of the isPackagingClaimRegulated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPackagingClaimRegulated() {
        return isPackagingClaimRegulated;
    }

    /**
     * Sets the value of the isPackagingClaimRegulated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPackagingClaimRegulated(Boolean value) {
        this.isPackagingClaimRegulated = value;
    }

    /**
     * Gets the value of the packagingClaimTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingClaimTypeCodeType }
     *     
     */
    public PackagingClaimTypeCodeType getPackagingClaimTypeCode() {
        return packagingClaimTypeCode;
    }

    /**
     * Sets the value of the packagingClaimTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingClaimTypeCodeType }
     *     
     */
    public void setPackagingClaimTypeCode(PackagingClaimTypeCodeType value) {
        this.packagingClaimTypeCode = value;
    }

}
