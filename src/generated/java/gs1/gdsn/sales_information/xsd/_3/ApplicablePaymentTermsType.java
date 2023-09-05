
package gs1.gdsn.sales_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import gs1.shared.shared_common.xsd._3.PaymentMethodCodeType;
import gs1.shared.shared_common.xsd._3.PaymentTermsTypeCodeType;
import gs1.shared.shared_common.xsd._3.TimeMeasurementType;


/**
 * <p>Java class for ApplicablePaymentTermsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicablePaymentTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentMethodCode" type="{urn:gs1:shared:shared_common:xsd:3}PaymentMethodCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentTermsTypeCode" type="{urn:gs1:shared:shared_common:xsd:3}PaymentTermsTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="proximoCutOffDay" type="{http://www.w3.org/2001/XMLSchema}gDay" minOccurs="0"/&gt;
 *         &lt;element name="netDueTimePeriod" type="{urn:gs1:shared:shared_common:xsd:3}TimeMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="paymentDueBasisTypeCode" type="{urn:gs1:gdsn:sales_information:xsd:3}PaymentTermsEventCodeType" minOccurs="0"/&gt;
 *         &lt;element name="availableDiscount" type="{urn:gs1:gdsn:sales_information:xsd:3}AvailableDiscountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicablePaymentTermsType", propOrder = {
    "paymentMethodCode",
    "paymentTermsTypeCode",
    "proximoCutOffDay",
    "netDueTimePeriod",
    "paymentDueBasisTypeCode",
    "availableDiscount"
})
public class ApplicablePaymentTermsType {

    protected List<PaymentMethodCodeType> paymentMethodCode;
    protected PaymentTermsTypeCodeType paymentTermsTypeCode;
    @XmlSchemaType(name = "gDay")
    protected XMLGregorianCalendar proximoCutOffDay;
    protected TimeMeasurementType netDueTimePeriod;
    protected PaymentTermsEventCodeType paymentDueBasisTypeCode;
    protected List<AvailableDiscountType> availableDiscount;

    /**
     * Gets the value of the paymentMethodCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethodCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethodCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMethodCodeType }
     * 
     * 
     */
    public List<PaymentMethodCodeType> getPaymentMethodCode() {
        if (paymentMethodCode == null) {
            paymentMethodCode = new ArrayList<PaymentMethodCodeType>();
        }
        return this.paymentMethodCode;
    }

    /**
     * Gets the value of the paymentTermsTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsTypeCodeType }
     *     
     */
    public PaymentTermsTypeCodeType getPaymentTermsTypeCode() {
        return paymentTermsTypeCode;
    }

    /**
     * Sets the value of the paymentTermsTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsTypeCodeType }
     *     
     */
    public void setPaymentTermsTypeCode(PaymentTermsTypeCodeType value) {
        this.paymentTermsTypeCode = value;
    }

    /**
     * Gets the value of the proximoCutOffDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProximoCutOffDay() {
        return proximoCutOffDay;
    }

    /**
     * Sets the value of the proximoCutOffDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProximoCutOffDay(XMLGregorianCalendar value) {
        this.proximoCutOffDay = value;
    }

    /**
     * Gets the value of the netDueTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasurementType }
     *     
     */
    public TimeMeasurementType getNetDueTimePeriod() {
        return netDueTimePeriod;
    }

    /**
     * Sets the value of the netDueTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasurementType }
     *     
     */
    public void setNetDueTimePeriod(TimeMeasurementType value) {
        this.netDueTimePeriod = value;
    }

    /**
     * Gets the value of the paymentDueBasisTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsEventCodeType }
     *     
     */
    public PaymentTermsEventCodeType getPaymentDueBasisTypeCode() {
        return paymentDueBasisTypeCode;
    }

    /**
     * Sets the value of the paymentDueBasisTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsEventCodeType }
     *     
     */
    public void setPaymentDueBasisTypeCode(PaymentTermsEventCodeType value) {
        this.paymentDueBasisTypeCode = value;
    }

    /**
     * Gets the value of the availableDiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableDiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableDiscount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailableDiscountType }
     * 
     * 
     */
    public List<AvailableDiscountType> getAvailableDiscount() {
        if (availableDiscount == null) {
            availableDiscount = new ArrayList<AvailableDiscountType>();
        }
        return this.availableDiscount;
    }

}
