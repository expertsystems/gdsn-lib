
package gs1.gdsn.duty_fee_tax_information.xsd._3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.AmountType;
import gs1.shared.shared_common.xsd._3.CountryCodeType;
import gs1.shared.shared_common.xsd._3.CountrySubdivisionCodeType;
import gs1.shared.shared_common.xsd._3.Description200Type;
import gs1.shared.shared_common.xsd._3.Description70Type;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;
import gs1.shared.shared_common.xsd._3.ResponsibleAgencyCodeType;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for DutyFeeTaxInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutyFeeTaxInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dutyFeeTaxAgencyCode" type="{urn:gs1:shared:shared_common:xsd:3}ResponsibleAgencyCodeType" minOccurs="0"/&gt;
 *         &lt;element name="dutyFeeTaxTypeCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dutyFeeTaxAgencyName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dutyFeeTaxCountryCode" type="{urn:gs1:shared:shared_common:xsd:3}CountryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="dutyFeeTaxEffectiveEndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dutyFeeTaxEffectiveStartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemACombinationItem" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="dutyFeeTaxClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dutyFeeTaxTypeDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dutyFeeTaxBasisPrice" type="{urn:gs1:shared:shared_common:xsd:3}AmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dutyFeeTaxCountrySubdivisionShipToCode" type="{urn:gs1:shared:shared_common:xsd:3}CountrySubdivisionCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dutyFeeTaxCountrySubdivisionShipFromCode" type="{urn:gs1:shared:shared_common:xsd:3}CountrySubdivisionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="dutyFeeTaxLegalProvision" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dutyFeeTax" type="{urn:gs1:gdsn:duty_fee_tax_information:xsd:3}DutyFeeTaxType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "DutyFeeTaxInformationType", propOrder = {
    "dutyFeeTaxAgencyCode",
    "dutyFeeTaxTypeCode",
    "dutyFeeTaxAgencyName",
    "dutyFeeTaxCountryCode",
    "dutyFeeTaxEffectiveEndDateTime",
    "dutyFeeTaxEffectiveStartDateTime",
    "isTradeItemACombinationItem",
    "dutyFeeTaxClassificationCode",
    "dutyFeeTaxTypeDescription",
    "dutyFeeTaxBasisPrice",
    "dutyFeeTaxCountrySubdivisionShipToCode",
    "dutyFeeTaxCountrySubdivisionShipFromCode",
    "dutyFeeTaxLegalProvision",
    "dutyFeeTax",
    "avpList"
})
public class DutyFeeTaxInformationType {

    protected ResponsibleAgencyCodeType dutyFeeTaxAgencyCode;
    @XmlElement(required = true)
    protected String dutyFeeTaxTypeCode;
    protected String dutyFeeTaxAgencyName;
    protected CountryCodeType dutyFeeTaxCountryCode;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime dutyFeeTaxEffectiveEndDateTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime dutyFeeTaxEffectiveStartDateTime;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isTradeItemACombinationItem;
    protected String dutyFeeTaxClassificationCode;
    protected List<Description70Type> dutyFeeTaxTypeDescription;
    protected List<AmountType> dutyFeeTaxBasisPrice;
    protected List<CountrySubdivisionCodeType> dutyFeeTaxCountrySubdivisionShipToCode;
    protected CountrySubdivisionCodeType dutyFeeTaxCountrySubdivisionShipFromCode;
    protected List<Description200Type> dutyFeeTaxLegalProvision;
    protected List<DutyFeeTaxType> dutyFeeTax;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the dutyFeeTaxAgencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsibleAgencyCodeType }
     *     
     */
    public ResponsibleAgencyCodeType getDutyFeeTaxAgencyCode() {
        return dutyFeeTaxAgencyCode;
    }

    /**
     * Sets the value of the dutyFeeTaxAgencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsibleAgencyCodeType }
     *     
     */
    public void setDutyFeeTaxAgencyCode(ResponsibleAgencyCodeType value) {
        this.dutyFeeTaxAgencyCode = value;
    }

    /**
     * Gets the value of the dutyFeeTaxTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyFeeTaxTypeCode() {
        return dutyFeeTaxTypeCode;
    }

    /**
     * Sets the value of the dutyFeeTaxTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyFeeTaxTypeCode(String value) {
        this.dutyFeeTaxTypeCode = value;
    }

    /**
     * Gets the value of the dutyFeeTaxAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyFeeTaxAgencyName() {
        return dutyFeeTaxAgencyName;
    }

    /**
     * Sets the value of the dutyFeeTaxAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyFeeTaxAgencyName(String value) {
        this.dutyFeeTaxAgencyName = value;
    }

    /**
     * Gets the value of the dutyFeeTaxCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getDutyFeeTaxCountryCode() {
        return dutyFeeTaxCountryCode;
    }

    /**
     * Sets the value of the dutyFeeTaxCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setDutyFeeTaxCountryCode(CountryCodeType value) {
        this.dutyFeeTaxCountryCode = value;
    }

    /**
     * Gets the value of the dutyFeeTaxEffectiveEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getDutyFeeTaxEffectiveEndDateTime() {
        return dutyFeeTaxEffectiveEndDateTime;
    }

    /**
     * Sets the value of the dutyFeeTaxEffectiveEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyFeeTaxEffectiveEndDateTime(LocalDateTime value) {
        this.dutyFeeTaxEffectiveEndDateTime = value;
    }

    /**
     * Gets the value of the dutyFeeTaxEffectiveStartDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getDutyFeeTaxEffectiveStartDateTime() {
        return dutyFeeTaxEffectiveStartDateTime;
    }

    /**
     * Sets the value of the dutyFeeTaxEffectiveStartDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyFeeTaxEffectiveStartDateTime(LocalDateTime value) {
        this.dutyFeeTaxEffectiveStartDateTime = value;
    }

    /**
     * Gets the value of the isTradeItemACombinationItem property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsTradeItemACombinationItem() {
        return isTradeItemACombinationItem;
    }

    /**
     * Sets the value of the isTradeItemACombinationItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsTradeItemACombinationItem(NonBinaryLogicEnumerationType value) {
        this.isTradeItemACombinationItem = value;
    }

    /**
     * Gets the value of the dutyFeeTaxClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyFeeTaxClassificationCode() {
        return dutyFeeTaxClassificationCode;
    }

    /**
     * Sets the value of the dutyFeeTaxClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyFeeTaxClassificationCode(String value) {
        this.dutyFeeTaxClassificationCode = value;
    }

    /**
     * Gets the value of the dutyFeeTaxTypeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dutyFeeTaxTypeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDutyFeeTaxTypeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getDutyFeeTaxTypeDescription() {
        if (dutyFeeTaxTypeDescription == null) {
            dutyFeeTaxTypeDescription = new ArrayList<Description70Type>();
        }
        return this.dutyFeeTaxTypeDescription;
    }

    /**
     * Gets the value of the dutyFeeTaxBasisPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dutyFeeTaxBasisPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDutyFeeTaxBasisPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getDutyFeeTaxBasisPrice() {
        if (dutyFeeTaxBasisPrice == null) {
            dutyFeeTaxBasisPrice = new ArrayList<AmountType>();
        }
        return this.dutyFeeTaxBasisPrice;
    }

    /**
     * Gets the value of the dutyFeeTaxCountrySubdivisionShipToCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dutyFeeTaxCountrySubdivisionShipToCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDutyFeeTaxCountrySubdivisionShipToCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountrySubdivisionCodeType }
     * 
     * 
     */
    public List<CountrySubdivisionCodeType> getDutyFeeTaxCountrySubdivisionShipToCode() {
        if (dutyFeeTaxCountrySubdivisionShipToCode == null) {
            dutyFeeTaxCountrySubdivisionShipToCode = new ArrayList<CountrySubdivisionCodeType>();
        }
        return this.dutyFeeTaxCountrySubdivisionShipToCode;
    }

    /**
     * Gets the value of the dutyFeeTaxCountrySubdivisionShipFromCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubdivisionCodeType }
     *     
     */
    public CountrySubdivisionCodeType getDutyFeeTaxCountrySubdivisionShipFromCode() {
        return dutyFeeTaxCountrySubdivisionShipFromCode;
    }

    /**
     * Sets the value of the dutyFeeTaxCountrySubdivisionShipFromCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubdivisionCodeType }
     *     
     */
    public void setDutyFeeTaxCountrySubdivisionShipFromCode(CountrySubdivisionCodeType value) {
        this.dutyFeeTaxCountrySubdivisionShipFromCode = value;
    }

    /**
     * Gets the value of the dutyFeeTaxLegalProvision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dutyFeeTaxLegalProvision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDutyFeeTaxLegalProvision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description200Type }
     * 
     * 
     */
    public List<Description200Type> getDutyFeeTaxLegalProvision() {
        if (dutyFeeTaxLegalProvision == null) {
            dutyFeeTaxLegalProvision = new ArrayList<Description200Type>();
        }
        return this.dutyFeeTaxLegalProvision;
    }

    /**
     * Gets the value of the dutyFeeTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dutyFeeTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDutyFeeTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DutyFeeTaxType }
     * 
     * 
     */
    public List<DutyFeeTaxType> getDutyFeeTax() {
        if (dutyFeeTax == null) {
            dutyFeeTax = new ArrayList<DutyFeeTaxType>();
        }
        return this.dutyFeeTax;
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
