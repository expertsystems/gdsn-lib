
package gs1.gdsn.delivery_purchasing_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.DistributionMethodCodeType;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for DistributionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistributionDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="distributionMethodCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}DistributionMethodCodeType" minOccurs="0"/&gt;
 *         &lt;element name="isDistributionMethodPrimary" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="orderingLeadTime" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="deliveryFrequencyCode" type="{urn:gs1:gdsn:delivery_purchasing_information:xsd:3}DeliveryFrequencyCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionDetailsType", propOrder = {
    "distributionMethodCode",
    "isDistributionMethodPrimary",
    "orderingLeadTime",
    "deliveryFrequencyCode"
})
public class DistributionDetailsType {

    protected DistributionMethodCodeType distributionMethodCode;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isDistributionMethodPrimary;
    protected List<MeasurementType> orderingLeadTime;
    protected DeliveryFrequencyCodeType deliveryFrequencyCode;

    /**
     * Gets the value of the distributionMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionMethodCodeType }
     *     
     */
    public DistributionMethodCodeType getDistributionMethodCode() {
        return distributionMethodCode;
    }

    /**
     * Sets the value of the distributionMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionMethodCodeType }
     *     
     */
    public void setDistributionMethodCode(DistributionMethodCodeType value) {
        this.distributionMethodCode = value;
    }

    /**
     * Gets the value of the isDistributionMethodPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsDistributionMethodPrimary() {
        return isDistributionMethodPrimary;
    }

    /**
     * Sets the value of the isDistributionMethodPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsDistributionMethodPrimary(NonBinaryLogicEnumerationType value) {
        this.isDistributionMethodPrimary = value;
    }

    /**
     * Gets the value of the orderingLeadTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderingLeadTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderingLeadTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getOrderingLeadTime() {
        if (orderingLeadTime == null) {
            orderingLeadTime = new ArrayList<MeasurementType>();
        }
        return this.orderingLeadTime;
    }

    /**
     * Gets the value of the deliveryFrequencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryFrequencyCodeType }
     *     
     */
    public DeliveryFrequencyCodeType getDeliveryFrequencyCode() {
        return deliveryFrequencyCode;
    }

    /**
     * Sets the value of the deliveryFrequencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryFrequencyCodeType }
     *     
     */
    public void setDeliveryFrequencyCode(DeliveryFrequencyCodeType value) {
        this.deliveryFrequencyCode = value;
    }

}
