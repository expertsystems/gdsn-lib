
package gs1.gdsn.trade_item_lifespan.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;
import gs1.shared.shared_common.xsd._3.TimeMeasurementType;


/**
 * <p>Java class for TradeItemLifespanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemLifespanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="doesTradeItemHaveAutoReaderTracker" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="minimumTradeItemLifespanFromTimeOfArrival" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="minimumTradeItemLifespanFromTimeOfProduction" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="openedTradeItemLifespan" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="supplierSpecifiedMinimumConsumerStorageDays" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="itemMinimumDurability" type="{urn:gs1:shared:shared_common:xsd:3}TimeMeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="itemPeriodSafeToUseAfterOpening" type="{urn:gs1:shared:shared_common:xsd:3}TimeMeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TradeItemLifespanType", propOrder = {
    "doesTradeItemHaveAutoReaderTracker",
    "minimumTradeItemLifespanFromTimeOfArrival",
    "minimumTradeItemLifespanFromTimeOfProduction",
    "openedTradeItemLifespan",
    "supplierSpecifiedMinimumConsumerStorageDays",
    "itemMinimumDurability",
    "itemPeriodSafeToUseAfterOpening",
    "avpList"
})
public class TradeItemLifespanType {

    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType doesTradeItemHaveAutoReaderTracker;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minimumTradeItemLifespanFromTimeOfArrival;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minimumTradeItemLifespanFromTimeOfProduction;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger openedTradeItemLifespan;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger supplierSpecifiedMinimumConsumerStorageDays;
    protected List<TimeMeasurementType> itemMinimumDurability;
    protected List<TimeMeasurementType> itemPeriodSafeToUseAfterOpening;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the doesTradeItemHaveAutoReaderTracker property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getDoesTradeItemHaveAutoReaderTracker() {
        return doesTradeItemHaveAutoReaderTracker;
    }

    /**
     * Sets the value of the doesTradeItemHaveAutoReaderTracker property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setDoesTradeItemHaveAutoReaderTracker(NonBinaryLogicEnumerationType value) {
        this.doesTradeItemHaveAutoReaderTracker = value;
    }

    /**
     * Gets the value of the minimumTradeItemLifespanFromTimeOfArrival property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumTradeItemLifespanFromTimeOfArrival() {
        return minimumTradeItemLifespanFromTimeOfArrival;
    }

    /**
     * Sets the value of the minimumTradeItemLifespanFromTimeOfArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumTradeItemLifespanFromTimeOfArrival(BigInteger value) {
        this.minimumTradeItemLifespanFromTimeOfArrival = value;
    }

    /**
     * Gets the value of the minimumTradeItemLifespanFromTimeOfProduction property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumTradeItemLifespanFromTimeOfProduction() {
        return minimumTradeItemLifespanFromTimeOfProduction;
    }

    /**
     * Sets the value of the minimumTradeItemLifespanFromTimeOfProduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumTradeItemLifespanFromTimeOfProduction(BigInteger value) {
        this.minimumTradeItemLifespanFromTimeOfProduction = value;
    }

    /**
     * Gets the value of the openedTradeItemLifespan property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpenedTradeItemLifespan() {
        return openedTradeItemLifespan;
    }

    /**
     * Sets the value of the openedTradeItemLifespan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpenedTradeItemLifespan(BigInteger value) {
        this.openedTradeItemLifespan = value;
    }

    /**
     * Gets the value of the supplierSpecifiedMinimumConsumerStorageDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSupplierSpecifiedMinimumConsumerStorageDays() {
        return supplierSpecifiedMinimumConsumerStorageDays;
    }

    /**
     * Sets the value of the supplierSpecifiedMinimumConsumerStorageDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSupplierSpecifiedMinimumConsumerStorageDays(BigInteger value) {
        this.supplierSpecifiedMinimumConsumerStorageDays = value;
    }

    /**
     * Gets the value of the itemMinimumDurability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemMinimumDurability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemMinimumDurability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeMeasurementType }
     * 
     * 
     */
    public List<TimeMeasurementType> getItemMinimumDurability() {
        if (itemMinimumDurability == null) {
            itemMinimumDurability = new ArrayList<TimeMeasurementType>();
        }
        return this.itemMinimumDurability;
    }

    /**
     * Gets the value of the itemPeriodSafeToUseAfterOpening property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemPeriodSafeToUseAfterOpening property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemPeriodSafeToUseAfterOpening().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeMeasurementType }
     * 
     * 
     */
    public List<TimeMeasurementType> getItemPeriodSafeToUseAfterOpening() {
        if (itemPeriodSafeToUseAfterOpening == null) {
            itemPeriodSafeToUseAfterOpening = new ArrayList<TimeMeasurementType>();
        }
        return this.itemPeriodSafeToUseAfterOpening;
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
