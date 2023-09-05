
package gs1.gdsn.award_prize.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.CountryCodeType;
import gs1.shared.shared_common.xsd._3.Description500Type;


/**
 * <p>Java class for AwardPrizeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AwardPrizeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="awardPrizeCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="awardPrizeCountryCode" type="{urn:gs1:shared:shared_common:xsd:3}CountryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="awardPrizeDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="awardPrizeJury" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="300"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="awardPrizeName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="300"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="awardPrizeYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
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
@XmlType(name = "AwardPrizeType", propOrder = {
    "awardPrizeCode",
    "awardPrizeCountryCode",
    "awardPrizeDescription",
    "awardPrizeJury",
    "awardPrizeName",
    "awardPrizeYear",
    "avpList"
})
public class AwardPrizeType {

    protected String awardPrizeCode;
    protected CountryCodeType awardPrizeCountryCode;
    protected List<Description500Type> awardPrizeDescription;
    protected String awardPrizeJury;
    protected String awardPrizeName;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar awardPrizeYear;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the awardPrizeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwardPrizeCode() {
        return awardPrizeCode;
    }

    /**
     * Sets the value of the awardPrizeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwardPrizeCode(String value) {
        this.awardPrizeCode = value;
    }

    /**
     * Gets the value of the awardPrizeCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getAwardPrizeCountryCode() {
        return awardPrizeCountryCode;
    }

    /**
     * Sets the value of the awardPrizeCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setAwardPrizeCountryCode(CountryCodeType value) {
        this.awardPrizeCountryCode = value;
    }

    /**
     * Gets the value of the awardPrizeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the awardPrizeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAwardPrizeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getAwardPrizeDescription() {
        if (awardPrizeDescription == null) {
            awardPrizeDescription = new ArrayList<Description500Type>();
        }
        return this.awardPrizeDescription;
    }

    /**
     * Gets the value of the awardPrizeJury property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwardPrizeJury() {
        return awardPrizeJury;
    }

    /**
     * Sets the value of the awardPrizeJury property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwardPrizeJury(String value) {
        this.awardPrizeJury = value;
    }

    /**
     * Gets the value of the awardPrizeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwardPrizeName() {
        return awardPrizeName;
    }

    /**
     * Sets the value of the awardPrizeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwardPrizeName(String value) {
        this.awardPrizeName = value;
    }

    /**
     * Gets the value of the awardPrizeYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAwardPrizeYear() {
        return awardPrizeYear;
    }

    /**
     * Sets the value of the awardPrizeYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAwardPrizeYear(XMLGregorianCalendar value) {
        this.awardPrizeYear = value;
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
