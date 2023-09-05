
package gs1.gdsn.diet_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.CertificationInformationType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for DietTypeInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DietTypeInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dietTypeCode" type="{urn:gs1:gdsn:diet_information:xsd:3}DietTypeCodeType"/&gt;
 *         &lt;element name="dietTypeSubcode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isDietTypeMarkedOnPackage" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="dietCertification" type="{urn:gs1:gdsn:gdsn_common:xsd:3}CertificationInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DietTypeInformationType", propOrder = {
    "dietTypeCode",
    "dietTypeSubcode",
    "isDietTypeMarkedOnPackage",
    "dietCertification"
})
public class DietTypeInformationType {

    @XmlElement(required = true)
    protected DietTypeCodeType dietTypeCode;
    protected String dietTypeSubcode;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isDietTypeMarkedOnPackage;
    protected CertificationInformationType dietCertification;

    /**
     * Gets the value of the dietTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DietTypeCodeType }
     *     
     */
    public DietTypeCodeType getDietTypeCode() {
        return dietTypeCode;
    }

    /**
     * Sets the value of the dietTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DietTypeCodeType }
     *     
     */
    public void setDietTypeCode(DietTypeCodeType value) {
        this.dietTypeCode = value;
    }

    /**
     * Gets the value of the dietTypeSubcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDietTypeSubcode() {
        return dietTypeSubcode;
    }

    /**
     * Sets the value of the dietTypeSubcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDietTypeSubcode(String value) {
        this.dietTypeSubcode = value;
    }

    /**
     * Gets the value of the isDietTypeMarkedOnPackage property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsDietTypeMarkedOnPackage() {
        return isDietTypeMarkedOnPackage;
    }

    /**
     * Sets the value of the isDietTypeMarkedOnPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsDietTypeMarkedOnPackage(NonBinaryLogicEnumerationType value) {
        this.isDietTypeMarkedOnPackage = value;
    }

    /**
     * Gets the value of the dietCertification property.
     * 
     * @return
     *     possible object is
     *     {@link CertificationInformationType }
     *     
     */
    public CertificationInformationType getDietCertification() {
        return dietCertification;
    }

    /**
     * Sets the value of the dietCertification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificationInformationType }
     *     
     */
    public void setDietCertification(CertificationInformationType value) {
        this.dietCertification = value;
    }

}
