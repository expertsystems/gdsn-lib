
package gs1.gdsn.onix_publication_file_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ONIXPublicationNameInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ONIXPublicationNameInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="corporateName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="300"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="corporateNameInverted" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="300"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="keyNames" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="300"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="lettersAfterNames" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="namesAfterKey" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="namesBeforeKey" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nameTypeCode" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXNameTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="personName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="personNameInverted" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="prefixToKey" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="suffixToKey" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="titlesAfterNames" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="titlesBeforeNames" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
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
@XmlType(name = "ONIXPublicationNameInformationType", propOrder = {
    "corporateName",
    "corporateNameInverted",
    "keyNames",
    "lettersAfterNames",
    "namesAfterKey",
    "namesBeforeKey",
    "nameTypeCode",
    "personName",
    "personNameInverted",
    "prefixToKey",
    "suffixToKey",
    "titlesAfterNames",
    "titlesBeforeNames"
})
public class ONIXPublicationNameInformationType {

    protected String corporateName;
    protected String corporateNameInverted;
    protected String keyNames;
    protected String lettersAfterNames;
    protected String namesAfterKey;
    protected String namesBeforeKey;
    protected ONIXNameTypeCodeType nameTypeCode;
    protected String personName;
    protected String personNameInverted;
    protected String prefixToKey;
    protected String suffixToKey;
    protected List<String> titlesAfterNames;
    protected List<String> titlesBeforeNames;

    /**
     * Gets the value of the corporateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateName() {
        return corporateName;
    }

    /**
     * Sets the value of the corporateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateName(String value) {
        this.corporateName = value;
    }

    /**
     * Gets the value of the corporateNameInverted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateNameInverted() {
        return corporateNameInverted;
    }

    /**
     * Sets the value of the corporateNameInverted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateNameInverted(String value) {
        this.corporateNameInverted = value;
    }

    /**
     * Gets the value of the keyNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyNames() {
        return keyNames;
    }

    /**
     * Sets the value of the keyNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyNames(String value) {
        this.keyNames = value;
    }

    /**
     * Gets the value of the lettersAfterNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLettersAfterNames() {
        return lettersAfterNames;
    }

    /**
     * Sets the value of the lettersAfterNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLettersAfterNames(String value) {
        this.lettersAfterNames = value;
    }

    /**
     * Gets the value of the namesAfterKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamesAfterKey() {
        return namesAfterKey;
    }

    /**
     * Sets the value of the namesAfterKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamesAfterKey(String value) {
        this.namesAfterKey = value;
    }

    /**
     * Gets the value of the namesBeforeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamesBeforeKey() {
        return namesBeforeKey;
    }

    /**
     * Sets the value of the namesBeforeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamesBeforeKey(String value) {
        this.namesBeforeKey = value;
    }

    /**
     * Gets the value of the nameTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ONIXNameTypeCodeType }
     *     
     */
    public ONIXNameTypeCodeType getNameTypeCode() {
        return nameTypeCode;
    }

    /**
     * Sets the value of the nameTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ONIXNameTypeCodeType }
     *     
     */
    public void setNameTypeCode(ONIXNameTypeCodeType value) {
        this.nameTypeCode = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonName(String value) {
        this.personName = value;
    }

    /**
     * Gets the value of the personNameInverted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonNameInverted() {
        return personNameInverted;
    }

    /**
     * Sets the value of the personNameInverted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonNameInverted(String value) {
        this.personNameInverted = value;
    }

    /**
     * Gets the value of the prefixToKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefixToKey() {
        return prefixToKey;
    }

    /**
     * Sets the value of the prefixToKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefixToKey(String value) {
        this.prefixToKey = value;
    }

    /**
     * Gets the value of the suffixToKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffixToKey() {
        return suffixToKey;
    }

    /**
     * Sets the value of the suffixToKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffixToKey(String value) {
        this.suffixToKey = value;
    }

    /**
     * Gets the value of the titlesAfterNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titlesAfterNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitlesAfterNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTitlesAfterNames() {
        if (titlesAfterNames == null) {
            titlesAfterNames = new ArrayList<String>();
        }
        return this.titlesAfterNames;
    }

    /**
     * Gets the value of the titlesBeforeNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titlesBeforeNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitlesBeforeNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTitlesBeforeNames() {
        if (titlesBeforeNames == null) {
            titlesBeforeNames = new ArrayList<String>();
        }
        return this.titlesBeforeNames;
    }

}
