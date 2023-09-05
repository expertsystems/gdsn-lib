
package gs1.gdsn.sales_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for TargetMarketSalesConditionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetMarketSalesConditionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="targetMarketConsumerSalesConditionCode" type="{urn:gs1:gdsn:sales_information:xsd:3}ConsumerSalesConditionTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="consumerSalesConditionMaximumAmount" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="salesConditionTargetMarketCountry" type="{urn:gs1:gdsn:sales_information:xsd:3}SalesConditionTargetMarketCountryType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetMarketSalesConditionsType", propOrder = {
    "targetMarketConsumerSalesConditionCode",
    "consumerSalesConditionMaximumAmount",
    "salesConditionTargetMarketCountry"
})
public class TargetMarketSalesConditionsType {

    protected ConsumerSalesConditionTypeCodeType targetMarketConsumerSalesConditionCode;
    protected List<MeasurementType> consumerSalesConditionMaximumAmount;
    @XmlElement(required = true)
    protected List<SalesConditionTargetMarketCountryType> salesConditionTargetMarketCountry;

    /**
     * Gets the value of the targetMarketConsumerSalesConditionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerSalesConditionTypeCodeType }
     *     
     */
    public ConsumerSalesConditionTypeCodeType getTargetMarketConsumerSalesConditionCode() {
        return targetMarketConsumerSalesConditionCode;
    }

    /**
     * Sets the value of the targetMarketConsumerSalesConditionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerSalesConditionTypeCodeType }
     *     
     */
    public void setTargetMarketConsumerSalesConditionCode(ConsumerSalesConditionTypeCodeType value) {
        this.targetMarketConsumerSalesConditionCode = value;
    }

    /**
     * Gets the value of the consumerSalesConditionMaximumAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerSalesConditionMaximumAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerSalesConditionMaximumAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getConsumerSalesConditionMaximumAmount() {
        if (consumerSalesConditionMaximumAmount == null) {
            consumerSalesConditionMaximumAmount = new ArrayList<MeasurementType>();
        }
        return this.consumerSalesConditionMaximumAmount;
    }

    /**
     * Gets the value of the salesConditionTargetMarketCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesConditionTargetMarketCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesConditionTargetMarketCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesConditionTargetMarketCountryType }
     * 
     * 
     */
    public List<SalesConditionTargetMarketCountryType> getSalesConditionTargetMarketCountry() {
        if (salesConditionTargetMarketCountry == null) {
            salesConditionTargetMarketCountry = new ArrayList<SalesConditionTargetMarketCountryType>();
        }
        return this.salesConditionTargetMarketCountry;
    }

}
