
package gs1.gdsn.sales_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.AmountType;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for SalesInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="brandDistributionTypeCode" type="{urn:gs1:gdsn:sales_information:xsd:3}BrandDistributionTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="consumerSalesConditionCode" type="{urn:gs1:gdsn:sales_information:xsd:3}ConsumerSalesConditionTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isBasePriceDeclarationRelevant" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="isDiscountingIllegal" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="priceByMeasureTypeCode" type="{urn:gs1:gdsn:sales_information:xsd:3}PriceByMeasureTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="priceComparisonMeasurement" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="priceComparisonContentTypeCode" type="{urn:gs1:gdsn:sales_information:xsd:3}PriceComparisonContentTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="recommendedConsumerPickupAreaCode" type="{urn:gs1:gdsn:sales_information:xsd:3}RecommendedConsumerPickupAreaCodeType" minOccurs="0"/&gt;
 *         &lt;element name="sellingUnitOfMeasure" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tradeItemConditionCode" type="{urn:gs1:gdsn:sales_information:xsd:3}TradeItemConditionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="isPermitOrLicenseRequiredToSell" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="cutForSaleThicknessCode" type="{urn:gs1:gdsn:sales_information:xsd:3}CutForSaleThicknessCodeType" minOccurs="0"/&gt;
 *         &lt;element name="minimumOrderValue" type="{urn:gs1:shared:shared_common:xsd:3}AmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemExclusiveSellingLocationCode" type="{urn:gs1:gdsn:sales_information:xsd:3}TradeItemExclusiveSellingLocationCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="brandDistributionTradeItemTypeCode" type="{urn:gs1:gdsn:sales_information:xsd:3}BrandDistributionTradeItemTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="targetMarketSalesConditions" type="{urn:gs1:gdsn:sales_information:xsd:3}TargetMarketSalesConditionsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="targetMarketDiscountRestrictions" type="{urn:gs1:gdsn:sales_information:xsd:3}TargetMarketDiscountRestrictionsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesInformationType", propOrder = {
    "brandDistributionTypeCode",
    "consumerSalesConditionCode",
    "isBasePriceDeclarationRelevant",
    "isDiscountingIllegal",
    "priceByMeasureTypeCode",
    "priceComparisonMeasurement",
    "priceComparisonContentTypeCode",
    "recommendedConsumerPickupAreaCode",
    "sellingUnitOfMeasure",
    "tradeItemConditionCode",
    "isPermitOrLicenseRequiredToSell",
    "cutForSaleThicknessCode",
    "minimumOrderValue",
    "tradeItemExclusiveSellingLocationCode",
    "brandDistributionTradeItemTypeCode",
    "targetMarketSalesConditions",
    "targetMarketDiscountRestrictions"
})
public class SalesInformationType {

    protected BrandDistributionTypeCodeType brandDistributionTypeCode;
    protected List<ConsumerSalesConditionTypeCodeType> consumerSalesConditionCode;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isBasePriceDeclarationRelevant;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isDiscountingIllegal;
    protected PriceByMeasureTypeCodeType priceByMeasureTypeCode;
    protected List<MeasurementType> priceComparisonMeasurement;
    protected PriceComparisonContentTypeCodeType priceComparisonContentTypeCode;
    protected RecommendedConsumerPickupAreaCodeType recommendedConsumerPickupAreaCode;
    protected String sellingUnitOfMeasure;
    protected TradeItemConditionCodeType tradeItemConditionCode;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isPermitOrLicenseRequiredToSell;
    protected CutForSaleThicknessCodeType cutForSaleThicknessCode;
    protected List<AmountType> minimumOrderValue;
    protected List<TradeItemExclusiveSellingLocationCodeType> tradeItemExclusiveSellingLocationCode;
    protected List<BrandDistributionTradeItemTypeCodeType> brandDistributionTradeItemTypeCode;
    protected List<TargetMarketSalesConditionsType> targetMarketSalesConditions;
    protected List<TargetMarketDiscountRestrictionsType> targetMarketDiscountRestrictions;

    /**
     * Gets the value of the brandDistributionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BrandDistributionTypeCodeType }
     *     
     */
    public BrandDistributionTypeCodeType getBrandDistributionTypeCode() {
        return brandDistributionTypeCode;
    }

    /**
     * Sets the value of the brandDistributionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandDistributionTypeCodeType }
     *     
     */
    public void setBrandDistributionTypeCode(BrandDistributionTypeCodeType value) {
        this.brandDistributionTypeCode = value;
    }

    /**
     * Gets the value of the consumerSalesConditionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerSalesConditionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerSalesConditionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumerSalesConditionTypeCodeType }
     * 
     * 
     */
    public List<ConsumerSalesConditionTypeCodeType> getConsumerSalesConditionCode() {
        if (consumerSalesConditionCode == null) {
            consumerSalesConditionCode = new ArrayList<ConsumerSalesConditionTypeCodeType>();
        }
        return this.consumerSalesConditionCode;
    }

    /**
     * Gets the value of the isBasePriceDeclarationRelevant property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsBasePriceDeclarationRelevant() {
        return isBasePriceDeclarationRelevant;
    }

    /**
     * Sets the value of the isBasePriceDeclarationRelevant property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsBasePriceDeclarationRelevant(NonBinaryLogicEnumerationType value) {
        this.isBasePriceDeclarationRelevant = value;
    }

    /**
     * Gets the value of the isDiscountingIllegal property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsDiscountingIllegal() {
        return isDiscountingIllegal;
    }

    /**
     * Sets the value of the isDiscountingIllegal property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsDiscountingIllegal(NonBinaryLogicEnumerationType value) {
        this.isDiscountingIllegal = value;
    }

    /**
     * Gets the value of the priceByMeasureTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PriceByMeasureTypeCodeType }
     *     
     */
    public PriceByMeasureTypeCodeType getPriceByMeasureTypeCode() {
        return priceByMeasureTypeCode;
    }

    /**
     * Sets the value of the priceByMeasureTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceByMeasureTypeCodeType }
     *     
     */
    public void setPriceByMeasureTypeCode(PriceByMeasureTypeCodeType value) {
        this.priceByMeasureTypeCode = value;
    }

    /**
     * Gets the value of the priceComparisonMeasurement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceComparisonMeasurement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceComparisonMeasurement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getPriceComparisonMeasurement() {
        if (priceComparisonMeasurement == null) {
            priceComparisonMeasurement = new ArrayList<MeasurementType>();
        }
        return this.priceComparisonMeasurement;
    }

    /**
     * Gets the value of the priceComparisonContentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PriceComparisonContentTypeCodeType }
     *     
     */
    public PriceComparisonContentTypeCodeType getPriceComparisonContentTypeCode() {
        return priceComparisonContentTypeCode;
    }

    /**
     * Sets the value of the priceComparisonContentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceComparisonContentTypeCodeType }
     *     
     */
    public void setPriceComparisonContentTypeCode(PriceComparisonContentTypeCodeType value) {
        this.priceComparisonContentTypeCode = value;
    }

    /**
     * Gets the value of the recommendedConsumerPickupAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link RecommendedConsumerPickupAreaCodeType }
     *     
     */
    public RecommendedConsumerPickupAreaCodeType getRecommendedConsumerPickupAreaCode() {
        return recommendedConsumerPickupAreaCode;
    }

    /**
     * Sets the value of the recommendedConsumerPickupAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecommendedConsumerPickupAreaCodeType }
     *     
     */
    public void setRecommendedConsumerPickupAreaCode(RecommendedConsumerPickupAreaCodeType value) {
        this.recommendedConsumerPickupAreaCode = value;
    }

    /**
     * Gets the value of the sellingUnitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellingUnitOfMeasure() {
        return sellingUnitOfMeasure;
    }

    /**
     * Sets the value of the sellingUnitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellingUnitOfMeasure(String value) {
        this.sellingUnitOfMeasure = value;
    }

    /**
     * Gets the value of the tradeItemConditionCode property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemConditionCodeType }
     *     
     */
    public TradeItemConditionCodeType getTradeItemConditionCode() {
        return tradeItemConditionCode;
    }

    /**
     * Sets the value of the tradeItemConditionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemConditionCodeType }
     *     
     */
    public void setTradeItemConditionCode(TradeItemConditionCodeType value) {
        this.tradeItemConditionCode = value;
    }

    /**
     * Gets the value of the isPermitOrLicenseRequiredToSell property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsPermitOrLicenseRequiredToSell() {
        return isPermitOrLicenseRequiredToSell;
    }

    /**
     * Sets the value of the isPermitOrLicenseRequiredToSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsPermitOrLicenseRequiredToSell(NonBinaryLogicEnumerationType value) {
        this.isPermitOrLicenseRequiredToSell = value;
    }

    /**
     * Gets the value of the cutForSaleThicknessCode property.
     * 
     * @return
     *     possible object is
     *     {@link CutForSaleThicknessCodeType }
     *     
     */
    public CutForSaleThicknessCodeType getCutForSaleThicknessCode() {
        return cutForSaleThicknessCode;
    }

    /**
     * Sets the value of the cutForSaleThicknessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CutForSaleThicknessCodeType }
     *     
     */
    public void setCutForSaleThicknessCode(CutForSaleThicknessCodeType value) {
        this.cutForSaleThicknessCode = value;
    }

    /**
     * Gets the value of the minimumOrderValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minimumOrderValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinimumOrderValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getMinimumOrderValue() {
        if (minimumOrderValue == null) {
            minimumOrderValue = new ArrayList<AmountType>();
        }
        return this.minimumOrderValue;
    }

    /**
     * Gets the value of the tradeItemExclusiveSellingLocationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemExclusiveSellingLocationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemExclusiveSellingLocationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeItemExclusiveSellingLocationCodeType }
     * 
     * 
     */
    public List<TradeItemExclusiveSellingLocationCodeType> getTradeItemExclusiveSellingLocationCode() {
        if (tradeItemExclusiveSellingLocationCode == null) {
            tradeItemExclusiveSellingLocationCode = new ArrayList<TradeItemExclusiveSellingLocationCodeType>();
        }
        return this.tradeItemExclusiveSellingLocationCode;
    }

    /**
     * Gets the value of the brandDistributionTradeItemTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brandDistributionTradeItemTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrandDistributionTradeItemTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrandDistributionTradeItemTypeCodeType }
     * 
     * 
     */
    public List<BrandDistributionTradeItemTypeCodeType> getBrandDistributionTradeItemTypeCode() {
        if (brandDistributionTradeItemTypeCode == null) {
            brandDistributionTradeItemTypeCode = new ArrayList<BrandDistributionTradeItemTypeCodeType>();
        }
        return this.brandDistributionTradeItemTypeCode;
    }

    /**
     * Gets the value of the targetMarketSalesConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetMarketSalesConditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetMarketSalesConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetMarketSalesConditionsType }
     * 
     * 
     */
    public List<TargetMarketSalesConditionsType> getTargetMarketSalesConditions() {
        if (targetMarketSalesConditions == null) {
            targetMarketSalesConditions = new ArrayList<TargetMarketSalesConditionsType>();
        }
        return this.targetMarketSalesConditions;
    }

    /**
     * Gets the value of the targetMarketDiscountRestrictions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetMarketDiscountRestrictions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetMarketDiscountRestrictions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetMarketDiscountRestrictionsType }
     * 
     * 
     */
    public List<TargetMarketDiscountRestrictionsType> getTargetMarketDiscountRestrictions() {
        if (targetMarketDiscountRestrictions == null) {
            targetMarketDiscountRestrictions = new ArrayList<TargetMarketDiscountRestrictionsType>();
        }
        return this.targetMarketDiscountRestrictions;
    }

}
