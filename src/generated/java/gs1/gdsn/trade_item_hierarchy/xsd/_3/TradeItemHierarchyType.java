
package gs1.gdsn.trade_item_hierarchy.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for TradeItemHierarchyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemHierarchyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isNonGTINLogisticsUnitPackedIrregularly" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemPackedIrregularly" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="layerHeight" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="quantityOfCompleteLayersContainedInATradeItem" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="quantityOfInnerPack" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="quantityOfLayersPerPallet" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="quantityOfNextLevelTradeItemWithinInnerPack" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="quantityOfTradeItemsContainedInACompleteLayer" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="quantityOfTradeItemsPerPallet" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="quantityOfTradeItemsPerPalletLayer" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="suggestedConsumerPack" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="unitsPerTradeItem" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TradeItemHierarchyType", propOrder = {
    "isNonGTINLogisticsUnitPackedIrregularly",
    "isTradeItemPackedIrregularly",
    "layerHeight",
    "quantityOfCompleteLayersContainedInATradeItem",
    "quantityOfInnerPack",
    "quantityOfLayersPerPallet",
    "quantityOfNextLevelTradeItemWithinInnerPack",
    "quantityOfTradeItemsContainedInACompleteLayer",
    "quantityOfTradeItemsPerPallet",
    "quantityOfTradeItemsPerPalletLayer",
    "suggestedConsumerPack",
    "unitsPerTradeItem",
    "avpList"
})
public class TradeItemHierarchyType {

    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isNonGTINLogisticsUnitPackedIrregularly;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isTradeItemPackedIrregularly;
    protected MeasurementType layerHeight;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantityOfCompleteLayersContainedInATradeItem;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantityOfInnerPack;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantityOfLayersPerPallet;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantityOfNextLevelTradeItemWithinInnerPack;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantityOfTradeItemsContainedInACompleteLayer;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantityOfTradeItemsPerPallet;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantityOfTradeItemsPerPalletLayer;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger suggestedConsumerPack;
    protected List<MeasurementType> unitsPerTradeItem;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the isNonGTINLogisticsUnitPackedIrregularly property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsNonGTINLogisticsUnitPackedIrregularly() {
        return isNonGTINLogisticsUnitPackedIrregularly;
    }

    /**
     * Sets the value of the isNonGTINLogisticsUnitPackedIrregularly property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsNonGTINLogisticsUnitPackedIrregularly(NonBinaryLogicEnumerationType value) {
        this.isNonGTINLogisticsUnitPackedIrregularly = value;
    }

    /**
     * Gets the value of the isTradeItemPackedIrregularly property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsTradeItemPackedIrregularly() {
        return isTradeItemPackedIrregularly;
    }

    /**
     * Sets the value of the isTradeItemPackedIrregularly property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsTradeItemPackedIrregularly(NonBinaryLogicEnumerationType value) {
        this.isTradeItemPackedIrregularly = value;
    }

    /**
     * Gets the value of the layerHeight property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getLayerHeight() {
        return layerHeight;
    }

    /**
     * Sets the value of the layerHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setLayerHeight(MeasurementType value) {
        this.layerHeight = value;
    }

    /**
     * Gets the value of the quantityOfCompleteLayersContainedInATradeItem property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityOfCompleteLayersContainedInATradeItem() {
        return quantityOfCompleteLayersContainedInATradeItem;
    }

    /**
     * Sets the value of the quantityOfCompleteLayersContainedInATradeItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityOfCompleteLayersContainedInATradeItem(BigInteger value) {
        this.quantityOfCompleteLayersContainedInATradeItem = value;
    }

    /**
     * Gets the value of the quantityOfInnerPack property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityOfInnerPack() {
        return quantityOfInnerPack;
    }

    /**
     * Sets the value of the quantityOfInnerPack property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityOfInnerPack(BigInteger value) {
        this.quantityOfInnerPack = value;
    }

    /**
     * Gets the value of the quantityOfLayersPerPallet property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityOfLayersPerPallet() {
        return quantityOfLayersPerPallet;
    }

    /**
     * Sets the value of the quantityOfLayersPerPallet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityOfLayersPerPallet(BigInteger value) {
        this.quantityOfLayersPerPallet = value;
    }

    /**
     * Gets the value of the quantityOfNextLevelTradeItemWithinInnerPack property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityOfNextLevelTradeItemWithinInnerPack() {
        return quantityOfNextLevelTradeItemWithinInnerPack;
    }

    /**
     * Sets the value of the quantityOfNextLevelTradeItemWithinInnerPack property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityOfNextLevelTradeItemWithinInnerPack(BigInteger value) {
        this.quantityOfNextLevelTradeItemWithinInnerPack = value;
    }

    /**
     * Gets the value of the quantityOfTradeItemsContainedInACompleteLayer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityOfTradeItemsContainedInACompleteLayer() {
        return quantityOfTradeItemsContainedInACompleteLayer;
    }

    /**
     * Sets the value of the quantityOfTradeItemsContainedInACompleteLayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityOfTradeItemsContainedInACompleteLayer(BigInteger value) {
        this.quantityOfTradeItemsContainedInACompleteLayer = value;
    }

    /**
     * Gets the value of the quantityOfTradeItemsPerPallet property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityOfTradeItemsPerPallet() {
        return quantityOfTradeItemsPerPallet;
    }

    /**
     * Sets the value of the quantityOfTradeItemsPerPallet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityOfTradeItemsPerPallet(BigInteger value) {
        this.quantityOfTradeItemsPerPallet = value;
    }

    /**
     * Gets the value of the quantityOfTradeItemsPerPalletLayer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityOfTradeItemsPerPalletLayer() {
        return quantityOfTradeItemsPerPalletLayer;
    }

    /**
     * Sets the value of the quantityOfTradeItemsPerPalletLayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityOfTradeItemsPerPalletLayer(BigInteger value) {
        this.quantityOfTradeItemsPerPalletLayer = value;
    }

    /**
     * Gets the value of the suggestedConsumerPack property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSuggestedConsumerPack() {
        return suggestedConsumerPack;
    }

    /**
     * Sets the value of the suggestedConsumerPack property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSuggestedConsumerPack(BigInteger value) {
        this.suggestedConsumerPack = value;
    }

    /**
     * Gets the value of the unitsPerTradeItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitsPerTradeItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitsPerTradeItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getUnitsPerTradeItem() {
        if (unitsPerTradeItem == null) {
            unitsPerTradeItem = new ArrayList<MeasurementType>();
        }
        return this.unitsPerTradeItem;
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
