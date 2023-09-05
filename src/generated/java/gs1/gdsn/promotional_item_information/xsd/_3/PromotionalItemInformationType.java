
package gs1.gdsn.promotional_item_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.TradeItemIdentificationType;


/**
 * <p>Java class for PromotionalItemInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionalItemInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="freeQuantityOfNextLowerLevelTradeItem" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="freeQuantityOfProduct" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="promotionTypeCode" type="{urn:gs1:gdsn:promotional_item_information:xsd:3}PromotionTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="nonPromotionalTradeItem" type="{urn:gs1:shared:shared_common:xsd:3}TradeItemIdentificationType" minOccurs="0"/&gt;
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
@XmlType(name = "PromotionalItemInformationType", propOrder = {
    "freeQuantityOfNextLowerLevelTradeItem",
    "freeQuantityOfProduct",
    "promotionTypeCode",
    "nonPromotionalTradeItem",
    "avpList"
})
public class PromotionalItemInformationType {

    protected List<MeasurementType> freeQuantityOfNextLowerLevelTradeItem;
    protected List<MeasurementType> freeQuantityOfProduct;
    protected PromotionTypeCodeType promotionTypeCode;
    protected TradeItemIdentificationType nonPromotionalTradeItem;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the freeQuantityOfNextLowerLevelTradeItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeQuantityOfNextLowerLevelTradeItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeQuantityOfNextLowerLevelTradeItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getFreeQuantityOfNextLowerLevelTradeItem() {
        if (freeQuantityOfNextLowerLevelTradeItem == null) {
            freeQuantityOfNextLowerLevelTradeItem = new ArrayList<MeasurementType>();
        }
        return this.freeQuantityOfNextLowerLevelTradeItem;
    }

    /**
     * Gets the value of the freeQuantityOfProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeQuantityOfProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeQuantityOfProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getFreeQuantityOfProduct() {
        if (freeQuantityOfProduct == null) {
            freeQuantityOfProduct = new ArrayList<MeasurementType>();
        }
        return this.freeQuantityOfProduct;
    }

    /**
     * Gets the value of the promotionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionTypeCodeType }
     *     
     */
    public PromotionTypeCodeType getPromotionTypeCode() {
        return promotionTypeCode;
    }

    /**
     * Sets the value of the promotionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionTypeCodeType }
     *     
     */
    public void setPromotionTypeCode(PromotionTypeCodeType value) {
        this.promotionTypeCode = value;
    }

    /**
     * Gets the value of the nonPromotionalTradeItem property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemIdentificationType }
     *     
     */
    public TradeItemIdentificationType getNonPromotionalTradeItem() {
        return nonPromotionalTradeItem;
    }

    /**
     * Sets the value of the nonPromotionalTradeItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemIdentificationType }
     *     
     */
    public void setNonPromotionalTradeItem(TradeItemIdentificationType value) {
        this.nonPromotionalTradeItem = value;
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
