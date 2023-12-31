
package gs1.gdsn.delivery_purchasing_information.xsd._3;

import java.math.BigInteger;
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
import gs1.gdsn.gdsn_common.xsd._3.IncotermInformationType;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for DeliveryPurchasingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryPurchasingInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="agreedMaximumBuyingQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="agreedMinimumBuyingQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="canTradeItemBeBackOrdered" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="consumerFirstAvailabilityDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="firstDeliveryDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="firstShipDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endAvailabilityDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endDateTimeOfExclusivity" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endMaximumBuyingQuantityDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endMinimumBuyingQuantityDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="firstOrderDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="goodsPickupLeadTime" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="isOneTimeBuy" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="isProductCustomizable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemReorderable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemShippedInMultipleContainers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemSizeBasedPricing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="lastOrderDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastShipDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="orderingUnitOfMeasure" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="orderQuantityMaximum" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="orderQuantityMinimum" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="orderQuantityMultiple" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="orderSizingFactor" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shippingQuantityMinimum" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="startAvailabilityDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="startDateMaximumBuyingQuantity" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="startDateMinimumBuyingQuantity" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="consumerEndAvailabilityDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="consumerFirstDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="startDateTimeOfExclusivity" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="incotermInformation" type="{urn:gs1:gdsn:gdsn_common:xsd:3}IncotermInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="orderableReturnableInformation" type="{urn:gs1:gdsn:delivery_purchasing_information:xsd:3}OrderableReturnableInformationType" minOccurs="0"/&gt;
 *         &lt;element name="distributionDetails" type="{urn:gs1:gdsn:delivery_purchasing_information:xsd:3}DistributionDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "DeliveryPurchasingInformationType", propOrder = {
    "agreedMaximumBuyingQuantity",
    "agreedMinimumBuyingQuantity",
    "canTradeItemBeBackOrdered",
    "consumerFirstAvailabilityDateTime",
    "firstDeliveryDateTime",
    "firstShipDateTime",
    "endAvailabilityDateTime",
    "endDateTimeOfExclusivity",
    "endMaximumBuyingQuantityDateTime",
    "endMinimumBuyingQuantityDateTime",
    "firstOrderDateTime",
    "goodsPickupLeadTime",
    "isOneTimeBuy",
    "isProductCustomizable",
    "isTradeItemReorderable",
    "isTradeItemShippedInMultipleContainers",
    "isTradeItemSizeBasedPricing",
    "lastOrderDateTime",
    "lastShipDateTime",
    "orderingUnitOfMeasure",
    "orderQuantityMaximum",
    "orderQuantityMinimum",
    "orderQuantityMultiple",
    "orderSizingFactor",
    "shippingQuantityMinimum",
    "startAvailabilityDateTime",
    "startDateMaximumBuyingQuantity",
    "startDateMinimumBuyingQuantity",
    "consumerEndAvailabilityDateTime",
    "consumerFirstDeliveryDate",
    "startDateTimeOfExclusivity",
    "incotermInformation",
    "orderableReturnableInformation",
    "distributionDetails",
    "avpList"
})
public class DeliveryPurchasingInformationType {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger agreedMaximumBuyingQuantity;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger agreedMinimumBuyingQuantity;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType canTradeItemBeBackOrdered;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime consumerFirstAvailabilityDateTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime firstDeliveryDateTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime firstShipDateTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime endAvailabilityDateTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime endDateTimeOfExclusivity;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime endMaximumBuyingQuantityDateTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime endMinimumBuyingQuantityDateTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime firstOrderDateTime;
    protected MeasurementType goodsPickupLeadTime;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isOneTimeBuy;
    protected Boolean isProductCustomizable;
    protected Boolean isTradeItemReorderable;
    protected Boolean isTradeItemShippedInMultipleContainers;
    protected Boolean isTradeItemSizeBasedPricing;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime lastOrderDateTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime lastShipDateTime;
    protected String orderingUnitOfMeasure;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger orderQuantityMaximum;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger orderQuantityMinimum;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger orderQuantityMultiple;
    protected List<MeasurementType> orderSizingFactor;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger shippingQuantityMinimum;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime startAvailabilityDateTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime startDateMaximumBuyingQuantity;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime startDateMinimumBuyingQuantity;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime consumerEndAvailabilityDateTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime consumerFirstDeliveryDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime startDateTimeOfExclusivity;
    protected List<IncotermInformationType> incotermInformation;
    protected OrderableReturnableInformationType orderableReturnableInformation;
    protected List<DistributionDetailsType> distributionDetails;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the agreedMaximumBuyingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAgreedMaximumBuyingQuantity() {
        return agreedMaximumBuyingQuantity;
    }

    /**
     * Sets the value of the agreedMaximumBuyingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAgreedMaximumBuyingQuantity(BigInteger value) {
        this.agreedMaximumBuyingQuantity = value;
    }

    /**
     * Gets the value of the agreedMinimumBuyingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAgreedMinimumBuyingQuantity() {
        return agreedMinimumBuyingQuantity;
    }

    /**
     * Sets the value of the agreedMinimumBuyingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAgreedMinimumBuyingQuantity(BigInteger value) {
        this.agreedMinimumBuyingQuantity = value;
    }

    /**
     * Gets the value of the canTradeItemBeBackOrdered property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getCanTradeItemBeBackOrdered() {
        return canTradeItemBeBackOrdered;
    }

    /**
     * Sets the value of the canTradeItemBeBackOrdered property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setCanTradeItemBeBackOrdered(NonBinaryLogicEnumerationType value) {
        this.canTradeItemBeBackOrdered = value;
    }

    /**
     * Gets the value of the consumerFirstAvailabilityDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getConsumerFirstAvailabilityDateTime() {
        return consumerFirstAvailabilityDateTime;
    }

    /**
     * Sets the value of the consumerFirstAvailabilityDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerFirstAvailabilityDateTime(LocalDateTime value) {
        this.consumerFirstAvailabilityDateTime = value;
    }

    /**
     * Gets the value of the firstDeliveryDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getFirstDeliveryDateTime() {
        return firstDeliveryDateTime;
    }

    /**
     * Sets the value of the firstDeliveryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstDeliveryDateTime(LocalDateTime value) {
        this.firstDeliveryDateTime = value;
    }

    /**
     * Gets the value of the firstShipDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getFirstShipDateTime() {
        return firstShipDateTime;
    }

    /**
     * Sets the value of the firstShipDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstShipDateTime(LocalDateTime value) {
        this.firstShipDateTime = value;
    }

    /**
     * Gets the value of the endAvailabilityDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getEndAvailabilityDateTime() {
        return endAvailabilityDateTime;
    }

    /**
     * Sets the value of the endAvailabilityDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndAvailabilityDateTime(LocalDateTime value) {
        this.endAvailabilityDateTime = value;
    }

    /**
     * Gets the value of the endDateTimeOfExclusivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getEndDateTimeOfExclusivity() {
        return endDateTimeOfExclusivity;
    }

    /**
     * Sets the value of the endDateTimeOfExclusivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDateTimeOfExclusivity(LocalDateTime value) {
        this.endDateTimeOfExclusivity = value;
    }

    /**
     * Gets the value of the endMaximumBuyingQuantityDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getEndMaximumBuyingQuantityDateTime() {
        return endMaximumBuyingQuantityDateTime;
    }

    /**
     * Sets the value of the endMaximumBuyingQuantityDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndMaximumBuyingQuantityDateTime(LocalDateTime value) {
        this.endMaximumBuyingQuantityDateTime = value;
    }

    /**
     * Gets the value of the endMinimumBuyingQuantityDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getEndMinimumBuyingQuantityDateTime() {
        return endMinimumBuyingQuantityDateTime;
    }

    /**
     * Sets the value of the endMinimumBuyingQuantityDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndMinimumBuyingQuantityDateTime(LocalDateTime value) {
        this.endMinimumBuyingQuantityDateTime = value;
    }

    /**
     * Gets the value of the firstOrderDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getFirstOrderDateTime() {
        return firstOrderDateTime;
    }

    /**
     * Sets the value of the firstOrderDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstOrderDateTime(LocalDateTime value) {
        this.firstOrderDateTime = value;
    }

    /**
     * Gets the value of the goodsPickupLeadTime property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getGoodsPickupLeadTime() {
        return goodsPickupLeadTime;
    }

    /**
     * Sets the value of the goodsPickupLeadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setGoodsPickupLeadTime(MeasurementType value) {
        this.goodsPickupLeadTime = value;
    }

    /**
     * Gets the value of the isOneTimeBuy property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsOneTimeBuy() {
        return isOneTimeBuy;
    }

    /**
     * Sets the value of the isOneTimeBuy property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsOneTimeBuy(NonBinaryLogicEnumerationType value) {
        this.isOneTimeBuy = value;
    }

    /**
     * Gets the value of the isProductCustomizable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProductCustomizable() {
        return isProductCustomizable;
    }

    /**
     * Sets the value of the isProductCustomizable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProductCustomizable(Boolean value) {
        this.isProductCustomizable = value;
    }

    /**
     * Gets the value of the isTradeItemReorderable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTradeItemReorderable() {
        return isTradeItemReorderable;
    }

    /**
     * Sets the value of the isTradeItemReorderable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTradeItemReorderable(Boolean value) {
        this.isTradeItemReorderable = value;
    }

    /**
     * Gets the value of the isTradeItemShippedInMultipleContainers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTradeItemShippedInMultipleContainers() {
        return isTradeItemShippedInMultipleContainers;
    }

    /**
     * Sets the value of the isTradeItemShippedInMultipleContainers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTradeItemShippedInMultipleContainers(Boolean value) {
        this.isTradeItemShippedInMultipleContainers = value;
    }

    /**
     * Gets the value of the isTradeItemSizeBasedPricing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTradeItemSizeBasedPricing() {
        return isTradeItemSizeBasedPricing;
    }

    /**
     * Sets the value of the isTradeItemSizeBasedPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTradeItemSizeBasedPricing(Boolean value) {
        this.isTradeItemSizeBasedPricing = value;
    }

    /**
     * Gets the value of the lastOrderDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getLastOrderDateTime() {
        return lastOrderDateTime;
    }

    /**
     * Sets the value of the lastOrderDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastOrderDateTime(LocalDateTime value) {
        this.lastOrderDateTime = value;
    }

    /**
     * Gets the value of the lastShipDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getLastShipDateTime() {
        return lastShipDateTime;
    }

    /**
     * Sets the value of the lastShipDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastShipDateTime(LocalDateTime value) {
        this.lastShipDateTime = value;
    }

    /**
     * Gets the value of the orderingUnitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderingUnitOfMeasure() {
        return orderingUnitOfMeasure;
    }

    /**
     * Sets the value of the orderingUnitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderingUnitOfMeasure(String value) {
        this.orderingUnitOfMeasure = value;
    }

    /**
     * Gets the value of the orderQuantityMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderQuantityMaximum() {
        return orderQuantityMaximum;
    }

    /**
     * Sets the value of the orderQuantityMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderQuantityMaximum(BigInteger value) {
        this.orderQuantityMaximum = value;
    }

    /**
     * Gets the value of the orderQuantityMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderQuantityMinimum() {
        return orderQuantityMinimum;
    }

    /**
     * Sets the value of the orderQuantityMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderQuantityMinimum(BigInteger value) {
        this.orderQuantityMinimum = value;
    }

    /**
     * Gets the value of the orderQuantityMultiple property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderQuantityMultiple() {
        return orderQuantityMultiple;
    }

    /**
     * Sets the value of the orderQuantityMultiple property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderQuantityMultiple(BigInteger value) {
        this.orderQuantityMultiple = value;
    }

    /**
     * Gets the value of the orderSizingFactor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderSizingFactor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderSizingFactor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getOrderSizingFactor() {
        if (orderSizingFactor == null) {
            orderSizingFactor = new ArrayList<MeasurementType>();
        }
        return this.orderSizingFactor;
    }

    /**
     * Gets the value of the shippingQuantityMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getShippingQuantityMinimum() {
        return shippingQuantityMinimum;
    }

    /**
     * Sets the value of the shippingQuantityMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setShippingQuantityMinimum(BigInteger value) {
        this.shippingQuantityMinimum = value;
    }

    /**
     * Gets the value of the startAvailabilityDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getStartAvailabilityDateTime() {
        return startAvailabilityDateTime;
    }

    /**
     * Sets the value of the startAvailabilityDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartAvailabilityDateTime(LocalDateTime value) {
        this.startAvailabilityDateTime = value;
    }

    /**
     * Gets the value of the startDateMaximumBuyingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getStartDateMaximumBuyingQuantity() {
        return startDateMaximumBuyingQuantity;
    }

    /**
     * Sets the value of the startDateMaximumBuyingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateMaximumBuyingQuantity(LocalDateTime value) {
        this.startDateMaximumBuyingQuantity = value;
    }

    /**
     * Gets the value of the startDateMinimumBuyingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getStartDateMinimumBuyingQuantity() {
        return startDateMinimumBuyingQuantity;
    }

    /**
     * Sets the value of the startDateMinimumBuyingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateMinimumBuyingQuantity(LocalDateTime value) {
        this.startDateMinimumBuyingQuantity = value;
    }

    /**
     * Gets the value of the consumerEndAvailabilityDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getConsumerEndAvailabilityDateTime() {
        return consumerEndAvailabilityDateTime;
    }

    /**
     * Sets the value of the consumerEndAvailabilityDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerEndAvailabilityDateTime(LocalDateTime value) {
        this.consumerEndAvailabilityDateTime = value;
    }

    /**
     * Gets the value of the consumerFirstDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getConsumerFirstDeliveryDate() {
        return consumerFirstDeliveryDate;
    }

    /**
     * Sets the value of the consumerFirstDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerFirstDeliveryDate(LocalDateTime value) {
        this.consumerFirstDeliveryDate = value;
    }

    /**
     * Gets the value of the startDateTimeOfExclusivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getStartDateTimeOfExclusivity() {
        return startDateTimeOfExclusivity;
    }

    /**
     * Sets the value of the startDateTimeOfExclusivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateTimeOfExclusivity(LocalDateTime value) {
        this.startDateTimeOfExclusivity = value;
    }

    /**
     * Gets the value of the incotermInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incotermInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncotermInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncotermInformationType }
     * 
     * 
     */
    public List<IncotermInformationType> getIncotermInformation() {
        if (incotermInformation == null) {
            incotermInformation = new ArrayList<IncotermInformationType>();
        }
        return this.incotermInformation;
    }

    /**
     * Gets the value of the orderableReturnableInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OrderableReturnableInformationType }
     *     
     */
    public OrderableReturnableInformationType getOrderableReturnableInformation() {
        return orderableReturnableInformation;
    }

    /**
     * Sets the value of the orderableReturnableInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderableReturnableInformationType }
     *     
     */
    public void setOrderableReturnableInformation(OrderableReturnableInformationType value) {
        this.orderableReturnableInformation = value;
    }

    /**
     * Gets the value of the distributionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributionDetailsType }
     * 
     * 
     */
    public List<DistributionDetailsType> getDistributionDetails() {
        if (distributionDetails == null) {
            distributionDetails = new ArrayList<DistributionDetailsType>();
        }
        return this.distributionDetails;
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
