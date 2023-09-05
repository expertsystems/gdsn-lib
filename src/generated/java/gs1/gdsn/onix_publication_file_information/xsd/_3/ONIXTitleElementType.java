
package gs1.gdsn.onix_publication_file_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description500Type;


/**
 * <p>Java class for ONIXTitleElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ONIXTitleElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="titleElementLevel"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="titleTypeCode" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXTitleTypeCodeType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="subTitle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="300"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="titlePrefixType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="titleText"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="300"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="titleWithoutPrefix" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="300"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="yearOfAnnual" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="onixPartNumber" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ONIXTitleElementType", propOrder = {
    "titleElementLevel",
    "titleTypeCode",
    "subTitle",
    "titlePrefixType",
    "titleText",
    "titleWithoutPrefix",
    "yearOfAnnual",
    "onixPartNumber"
})
public class ONIXTitleElementType {

    @XmlElement(required = true)
    protected String titleElementLevel;
    @XmlElement(required = true)
    protected List<ONIXTitleTypeCodeType> titleTypeCode;
    protected String subTitle;
    protected String titlePrefixType;
    @XmlElement(required = true)
    protected String titleText;
    protected String titleWithoutPrefix;
    protected String yearOfAnnual;
    protected List<Description500Type> onixPartNumber;

    /**
     * Gets the value of the titleElementLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleElementLevel() {
        return titleElementLevel;
    }

    /**
     * Sets the value of the titleElementLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleElementLevel(String value) {
        this.titleElementLevel = value;
    }

    /**
     * Gets the value of the titleTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titleTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitleTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXTitleTypeCodeType }
     * 
     * 
     */
    public List<ONIXTitleTypeCodeType> getTitleTypeCode() {
        if (titleTypeCode == null) {
            titleTypeCode = new ArrayList<ONIXTitleTypeCodeType>();
        }
        return this.titleTypeCode;
    }

    /**
     * Gets the value of the subTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * Sets the value of the subTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTitle(String value) {
        this.subTitle = value;
    }

    /**
     * Gets the value of the titlePrefixType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitlePrefixType() {
        return titlePrefixType;
    }

    /**
     * Sets the value of the titlePrefixType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitlePrefixType(String value) {
        this.titlePrefixType = value;
    }

    /**
     * Gets the value of the titleText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleText() {
        return titleText;
    }

    /**
     * Sets the value of the titleText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleText(String value) {
        this.titleText = value;
    }

    /**
     * Gets the value of the titleWithoutPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleWithoutPrefix() {
        return titleWithoutPrefix;
    }

    /**
     * Sets the value of the titleWithoutPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleWithoutPrefix(String value) {
        this.titleWithoutPrefix = value;
    }

    /**
     * Gets the value of the yearOfAnnual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearOfAnnual() {
        return yearOfAnnual;
    }

    /**
     * Sets the value of the yearOfAnnual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearOfAnnual(String value) {
        this.yearOfAnnual = value;
    }

    /**
     * Gets the value of the onixPartNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onixPartNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnixPartNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getOnixPartNumber() {
        if (onixPartNumber == null) {
            onixPartNumber = new ArrayList<Description500Type>();
        }
        return this.onixPartNumber;
    }

}
