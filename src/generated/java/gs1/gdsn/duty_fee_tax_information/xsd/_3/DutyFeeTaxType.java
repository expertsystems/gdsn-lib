
package gs1.gdsn.duty_fee_tax_information.xsd._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.AmountType;
import gs1.shared.shared_common.xsd._3.CountrySubdivisionCodeType;
import gs1.shared.shared_common.xsd._3.Description200Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.PartyRoleCodeType;
import gs1.shared.shared_common.xsd._3.TaxCategoryCodeType;


/**
 * <p>Java class for DutyFeeTaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutyFeeTaxType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dutyFeeTaxAmount" type="{urn:gs1:shared:shared_common:xsd:3}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="dutyFeeTaxCategoryCode" type="{urn:gs1:shared:shared_common:xsd:3}TaxCategoryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="dutyFeeTaxBasis" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dutyFeeTaxCountrySubdivisionCode" type="{urn:gs1:shared:shared_common:xsd:3}CountrySubdivisionCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dutyFeeTaxExemptPartyRoleCode" type="{urn:gs1:shared:shared_common:xsd:3}PartyRoleCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dutyFeeTaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="dutyFeeTaxReductionCriteriaDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "DutyFeeTaxType", propOrder = {
    "dutyFeeTaxAmount",
    "dutyFeeTaxCategoryCode",
    "dutyFeeTaxBasis",
    "dutyFeeTaxCountrySubdivisionCode",
    "dutyFeeTaxExemptPartyRoleCode",
    "dutyFeeTaxRate",
    "dutyFeeTaxReductionCriteriaDescription",
    "avpList"
})
public class DutyFeeTaxType {

    protected AmountType dutyFeeTaxAmount;
    protected TaxCategoryCodeType dutyFeeTaxCategoryCode;
    protected List<MeasurementType> dutyFeeTaxBasis;
    protected List<CountrySubdivisionCodeType> dutyFeeTaxCountrySubdivisionCode;
    protected List<PartyRoleCodeType> dutyFeeTaxExemptPartyRoleCode;
    protected BigDecimal dutyFeeTaxRate;
    protected List<Description200Type> dutyFeeTaxReductionCriteriaDescription;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the dutyFeeTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDutyFeeTaxAmount() {
        return dutyFeeTaxAmount;
    }

    /**
     * Sets the value of the dutyFeeTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDutyFeeTaxAmount(AmountType value) {
        this.dutyFeeTaxAmount = value;
    }

    /**
     * Gets the value of the dutyFeeTaxCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCategoryCodeType }
     *     
     */
    public TaxCategoryCodeType getDutyFeeTaxCategoryCode() {
        return dutyFeeTaxCategoryCode;
    }

    /**
     * Sets the value of the dutyFeeTaxCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCategoryCodeType }
     *     
     */
    public void setDutyFeeTaxCategoryCode(TaxCategoryCodeType value) {
        this.dutyFeeTaxCategoryCode = value;
    }

    /**
     * Gets the value of the dutyFeeTaxBasis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dutyFeeTaxBasis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDutyFeeTaxBasis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getDutyFeeTaxBasis() {
        if (dutyFeeTaxBasis == null) {
            dutyFeeTaxBasis = new ArrayList<MeasurementType>();
        }
        return this.dutyFeeTaxBasis;
    }

    /**
     * Gets the value of the dutyFeeTaxCountrySubdivisionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dutyFeeTaxCountrySubdivisionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDutyFeeTaxCountrySubdivisionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountrySubdivisionCodeType }
     * 
     * 
     */
    public List<CountrySubdivisionCodeType> getDutyFeeTaxCountrySubdivisionCode() {
        if (dutyFeeTaxCountrySubdivisionCode == null) {
            dutyFeeTaxCountrySubdivisionCode = new ArrayList<CountrySubdivisionCodeType>();
        }
        return this.dutyFeeTaxCountrySubdivisionCode;
    }

    /**
     * Gets the value of the dutyFeeTaxExemptPartyRoleCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dutyFeeTaxExemptPartyRoleCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDutyFeeTaxExemptPartyRoleCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyRoleCodeType }
     * 
     * 
     */
    public List<PartyRoleCodeType> getDutyFeeTaxExemptPartyRoleCode() {
        if (dutyFeeTaxExemptPartyRoleCode == null) {
            dutyFeeTaxExemptPartyRoleCode = new ArrayList<PartyRoleCodeType>();
        }
        return this.dutyFeeTaxExemptPartyRoleCode;
    }

    /**
     * Gets the value of the dutyFeeTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDutyFeeTaxRate() {
        return dutyFeeTaxRate;
    }

    /**
     * Sets the value of the dutyFeeTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDutyFeeTaxRate(BigDecimal value) {
        this.dutyFeeTaxRate = value;
    }

    /**
     * Gets the value of the dutyFeeTaxReductionCriteriaDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dutyFeeTaxReductionCriteriaDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDutyFeeTaxReductionCriteriaDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description200Type }
     * 
     * 
     */
    public List<Description200Type> getDutyFeeTaxReductionCriteriaDescription() {
        if (dutyFeeTaxReductionCriteriaDescription == null) {
            dutyFeeTaxReductionCriteriaDescription = new ArrayList<Description200Type>();
        }
        return this.dutyFeeTaxReductionCriteriaDescription;
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
