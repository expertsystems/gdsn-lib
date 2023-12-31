
package gs1.gdsn.sales_information.xsd._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.AmountType;
import gs1.shared.shared_common.xsd._3.Description70Type;
import gs1.shared.shared_common.xsd._3.TimeMeasurementType;


/**
 * <p>Java class for AvailableDiscountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailableDiscountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="discountAmount" type="{urn:gs1:shared:shared_common:xsd:3}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="discountDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="discountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="discountType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="discountApplicablePeriod" type="{urn:gs1:shared:shared_common:xsd:3}TimeMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="discountBaseTypeCode" type="{urn:gs1:gdsn:sales_information:xsd:3}DiscountBaseTypeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailableDiscountType", propOrder = {
    "discountAmount",
    "discountDescription",
    "discountPercent",
    "discountType",
    "discountApplicablePeriod",
    "discountBaseTypeCode"
})
public class AvailableDiscountType {

    protected AmountType discountAmount;
    protected List<Description70Type> discountDescription;
    protected BigDecimal discountPercent;
    protected String discountType;
    protected TimeMeasurementType discountApplicablePeriod;
    protected DiscountBaseTypeCodeType discountBaseTypeCode;

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDiscountAmount(AmountType value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the discountDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getDiscountDescription() {
        if (discountDescription == null) {
            discountDescription = new ArrayList<Description70Type>();
        }
        return this.discountDescription;
    }

    /**
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPercent(BigDecimal value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the discountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountType() {
        return discountType;
    }

    /**
     * Sets the value of the discountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountType(String value) {
        this.discountType = value;
    }

    /**
     * Gets the value of the discountApplicablePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasurementType }
     *     
     */
    public TimeMeasurementType getDiscountApplicablePeriod() {
        return discountApplicablePeriod;
    }

    /**
     * Sets the value of the discountApplicablePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasurementType }
     *     
     */
    public void setDiscountApplicablePeriod(TimeMeasurementType value) {
        this.discountApplicablePeriod = value;
    }

    /**
     * Gets the value of the discountBaseTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountBaseTypeCodeType }
     *     
     */
    public DiscountBaseTypeCodeType getDiscountBaseTypeCode() {
        return discountBaseTypeCode;
    }

    /**
     * Sets the value of the discountBaseTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountBaseTypeCodeType }
     *     
     */
    public void setDiscountBaseTypeCode(DiscountBaseTypeCodeType value) {
        this.discountBaseTypeCode = value;
    }

}
