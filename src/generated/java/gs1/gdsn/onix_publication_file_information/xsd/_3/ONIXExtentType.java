
package gs1.gdsn.onix_publication_file_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ONIXExtentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ONIXExtentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="extentTypeCode" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXExtentTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="extentUnitCode" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXExtentUnitTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="extentValue" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="extentValueRoman" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ONIXExtentType", propOrder = {
    "extentTypeCode",
    "extentUnitCode",
    "extentValue",
    "extentValueRoman"
})
public class ONIXExtentType {

    protected ONIXExtentTypeCodeType extentTypeCode;
    protected ONIXExtentUnitTypeCodeType extentUnitCode;
    protected String extentValue;
    protected String extentValueRoman;

    /**
     * Gets the value of the extentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ONIXExtentTypeCodeType }
     *     
     */
    public ONIXExtentTypeCodeType getExtentTypeCode() {
        return extentTypeCode;
    }

    /**
     * Sets the value of the extentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ONIXExtentTypeCodeType }
     *     
     */
    public void setExtentTypeCode(ONIXExtentTypeCodeType value) {
        this.extentTypeCode = value;
    }

    /**
     * Gets the value of the extentUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link ONIXExtentUnitTypeCodeType }
     *     
     */
    public ONIXExtentUnitTypeCodeType getExtentUnitCode() {
        return extentUnitCode;
    }

    /**
     * Sets the value of the extentUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ONIXExtentUnitTypeCodeType }
     *     
     */
    public void setExtentUnitCode(ONIXExtentUnitTypeCodeType value) {
        this.extentUnitCode = value;
    }

    /**
     * Gets the value of the extentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtentValue() {
        return extentValue;
    }

    /**
     * Sets the value of the extentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtentValue(String value) {
        this.extentValue = value;
    }

    /**
     * Gets the value of the extentValueRoman property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtentValueRoman() {
        return extentValueRoman;
    }

    /**
     * Sets the value of the extentValueRoman property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtentValueRoman(String value) {
        this.extentValueRoman = value;
    }

}
