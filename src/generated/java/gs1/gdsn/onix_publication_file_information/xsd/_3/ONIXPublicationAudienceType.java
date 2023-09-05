
package gs1.gdsn.onix_publication_file_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description2500Type;


/**
 * <p>Java class for ONIXPublicationAudienceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ONIXPublicationAudienceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="audienceCodeValueCode" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXAudienceCodeValueCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="audienceDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description2500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="audienceRangePrecision1Code" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXAudiencePrecisionCodeType"/&gt;
 *         &lt;element name="audienceRangePrecision2Code" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXAudiencePrecisionCodeType"/&gt;
 *         &lt;element name="audienceRangeQualifierCode" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXAudienceRangeQualifierCodeType" minOccurs="0"/&gt;
 *         &lt;element name="audienceRangeValue1" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="audienceRangeValue2" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="audienceTypeCodeListCode" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXAudienceTypeCodeListCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ONIXPublicationAudienceType", propOrder = {
    "audienceCodeValueCode",
    "audienceDescription",
    "audienceRangePrecision1Code",
    "audienceRangePrecision2Code",
    "audienceRangeQualifierCode",
    "audienceRangeValue1",
    "audienceRangeValue2",
    "audienceTypeCodeListCode"
})
public class ONIXPublicationAudienceType {

    protected List<ONIXAudienceCodeValueCodeType> audienceCodeValueCode;
    protected List<Description2500Type> audienceDescription;
    @XmlElement(required = true)
    protected ONIXAudiencePrecisionCodeType audienceRangePrecision1Code;
    @XmlElement(required = true)
    protected ONIXAudiencePrecisionCodeType audienceRangePrecision2Code;
    protected ONIXAudienceRangeQualifierCodeType audienceRangeQualifierCode;
    protected List<String> audienceRangeValue1;
    protected List<String> audienceRangeValue2;
    protected ONIXAudienceTypeCodeListCodeType audienceTypeCodeListCode;

    /**
     * Gets the value of the audienceCodeValueCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audienceCodeValueCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudienceCodeValueCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXAudienceCodeValueCodeType }
     * 
     * 
     */
    public List<ONIXAudienceCodeValueCodeType> getAudienceCodeValueCode() {
        if (audienceCodeValueCode == null) {
            audienceCodeValueCode = new ArrayList<ONIXAudienceCodeValueCodeType>();
        }
        return this.audienceCodeValueCode;
    }

    /**
     * Gets the value of the audienceDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audienceDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudienceDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description2500Type }
     * 
     * 
     */
    public List<Description2500Type> getAudienceDescription() {
        if (audienceDescription == null) {
            audienceDescription = new ArrayList<Description2500Type>();
        }
        return this.audienceDescription;
    }

    /**
     * Gets the value of the audienceRangePrecision1Code property.
     * 
     * @return
     *     possible object is
     *     {@link ONIXAudiencePrecisionCodeType }
     *     
     */
    public ONIXAudiencePrecisionCodeType getAudienceRangePrecision1Code() {
        return audienceRangePrecision1Code;
    }

    /**
     * Sets the value of the audienceRangePrecision1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link ONIXAudiencePrecisionCodeType }
     *     
     */
    public void setAudienceRangePrecision1Code(ONIXAudiencePrecisionCodeType value) {
        this.audienceRangePrecision1Code = value;
    }

    /**
     * Gets the value of the audienceRangePrecision2Code property.
     * 
     * @return
     *     possible object is
     *     {@link ONIXAudiencePrecisionCodeType }
     *     
     */
    public ONIXAudiencePrecisionCodeType getAudienceRangePrecision2Code() {
        return audienceRangePrecision2Code;
    }

    /**
     * Sets the value of the audienceRangePrecision2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link ONIXAudiencePrecisionCodeType }
     *     
     */
    public void setAudienceRangePrecision2Code(ONIXAudiencePrecisionCodeType value) {
        this.audienceRangePrecision2Code = value;
    }

    /**
     * Gets the value of the audienceRangeQualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link ONIXAudienceRangeQualifierCodeType }
     *     
     */
    public ONIXAudienceRangeQualifierCodeType getAudienceRangeQualifierCode() {
        return audienceRangeQualifierCode;
    }

    /**
     * Sets the value of the audienceRangeQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ONIXAudienceRangeQualifierCodeType }
     *     
     */
    public void setAudienceRangeQualifierCode(ONIXAudienceRangeQualifierCodeType value) {
        this.audienceRangeQualifierCode = value;
    }

    /**
     * Gets the value of the audienceRangeValue1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audienceRangeValue1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudienceRangeValue1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAudienceRangeValue1() {
        if (audienceRangeValue1 == null) {
            audienceRangeValue1 = new ArrayList<String>();
        }
        return this.audienceRangeValue1;
    }

    /**
     * Gets the value of the audienceRangeValue2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audienceRangeValue2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudienceRangeValue2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAudienceRangeValue2() {
        if (audienceRangeValue2 == null) {
            audienceRangeValue2 = new ArrayList<String>();
        }
        return this.audienceRangeValue2;
    }

    /**
     * Gets the value of the audienceTypeCodeListCode property.
     * 
     * @return
     *     possible object is
     *     {@link ONIXAudienceTypeCodeListCodeType }
     *     
     */
    public ONIXAudienceTypeCodeListCodeType getAudienceTypeCodeListCode() {
        return audienceTypeCodeListCode;
    }

    /**
     * Sets the value of the audienceTypeCodeListCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ONIXAudienceTypeCodeListCodeType }
     *     
     */
    public void setAudienceTypeCodeListCode(ONIXAudienceTypeCodeListCodeType value) {
        this.audienceTypeCodeListCode = value;
    }

}
