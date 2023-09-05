
package gs1.gdsn.allergen_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.LevelOfContainmentCodeType;


/**
 * <p>Java class for AllergenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllergenType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="allergenTypeCode" type="{urn:gs1:gdsn:allergen_information:xsd:3}AllergenTypeCodeType"/&gt;
 *         &lt;element name="levelOfContainmentCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}LevelOfContainmentCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllergenType", propOrder = {
    "allergenTypeCode",
    "levelOfContainmentCode"
})
public class AllergenType {

    @XmlElement(required = true)
    protected AllergenTypeCodeType allergenTypeCode;
    @XmlElement(required = true)
    protected LevelOfContainmentCodeType levelOfContainmentCode;

    /**
     * Gets the value of the allergenTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link AllergenTypeCodeType }
     *     
     */
    public AllergenTypeCodeType getAllergenTypeCode() {
        return allergenTypeCode;
    }

    /**
     * Sets the value of the allergenTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllergenTypeCodeType }
     *     
     */
    public void setAllergenTypeCode(AllergenTypeCodeType value) {
        this.allergenTypeCode = value;
    }

    /**
     * Gets the value of the levelOfContainmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link LevelOfContainmentCodeType }
     *     
     */
    public LevelOfContainmentCodeType getLevelOfContainmentCode() {
        return levelOfContainmentCode;
    }

    /**
     * Sets the value of the levelOfContainmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelOfContainmentCodeType }
     *     
     */
    public void setLevelOfContainmentCode(LevelOfContainmentCodeType value) {
        this.levelOfContainmentCode = value;
    }

}
