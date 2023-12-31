
package gs1.gdsn.sales_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;


/**
 * <p>Java class for SalesInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicableAllowanceCharge" type="{urn:gs1:gdsn:sales_information:xsd:3}ApplicableAllowanceChargeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="applicablePaymentTerms" type="{urn:gs1:gdsn:sales_information:xsd:3}ApplicablePaymentTermsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemPriceInformation" type="{urn:gs1:gdsn:sales_information:xsd:3}TradeItemPriceInformationType" minOccurs="0"/&gt;
 *         &lt;element name="salesInformation" type="{urn:gs1:gdsn:sales_information:xsd:3}SalesInformationType" minOccurs="0"/&gt;
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
@XmlType(name = "SalesInformationModuleType", propOrder = {
    "applicableAllowanceCharge",
    "applicablePaymentTerms",
    "tradeItemPriceInformation",
    "salesInformation",
    "avpList"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:sales_information:xsd:3")
public class SalesInformationModuleType {

    protected List<ApplicableAllowanceChargeType> applicableAllowanceCharge;
    protected List<ApplicablePaymentTermsType> applicablePaymentTerms;
    protected TradeItemPriceInformationType tradeItemPriceInformation;
    protected SalesInformationType salesInformation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the applicableAllowanceCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableAllowanceCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableAllowanceCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicableAllowanceChargeType }
     * 
     * 
     */
    public List<ApplicableAllowanceChargeType> getApplicableAllowanceCharge() {
        if (applicableAllowanceCharge == null) {
            applicableAllowanceCharge = new ArrayList<ApplicableAllowanceChargeType>();
        }
        return this.applicableAllowanceCharge;
    }

    /**
     * Gets the value of the applicablePaymentTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicablePaymentTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicablePaymentTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicablePaymentTermsType }
     * 
     * 
     */
    public List<ApplicablePaymentTermsType> getApplicablePaymentTerms() {
        if (applicablePaymentTerms == null) {
            applicablePaymentTerms = new ArrayList<ApplicablePaymentTermsType>();
        }
        return this.applicablePaymentTerms;
    }

    /**
     * Gets the value of the tradeItemPriceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemPriceInformationType }
     *     
     */
    public TradeItemPriceInformationType getTradeItemPriceInformation() {
        return tradeItemPriceInformation;
    }

    /**
     * Sets the value of the tradeItemPriceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemPriceInformationType }
     *     
     */
    public void setTradeItemPriceInformation(TradeItemPriceInformationType value) {
        this.tradeItemPriceInformation = value;
    }

    /**
     * Gets the value of the salesInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SalesInformationType }
     *     
     */
    public SalesInformationType getSalesInformation() {
        return salesInformation;
    }

    /**
     * Sets the value of the salesInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesInformationType }
     *     
     */
    public void setSalesInformation(SalesInformationType value) {
        this.salesInformation = value;
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
