
package gs1.gdsn.trade_item.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.gdsn.gdsn_common.xsd._3.PartyInRoleType;
import gs1.gdsn.gdsn_common.xsd._3.PreliminaryItemStatusCodeType;
import gs1.gdsn.gdsn_common.xsd._3.TradeChannelCodeType;
import gs1.gdsn.gdsn_common.xsd._3.TradeItemContextCodeType;
import gs1.gdsn.gdsn_common.xsd._3.TradeItemUnitDescriptorCodeType;
import gs1.shared.shared_common.xsd._3.Description2500Type;
import gs1.shared.shared_common.xsd._3.TargetMarketType;
import gs1.shared.shared_common.xsd._3.TradeItemIdentificationType;


/**
 * <p>Java class for TradeItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:gs1:shared:shared_common:xsd:3}TradeItemIdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contextIdentification" type="{urn:gs1:gdsn:gdsn_common:xsd:3}TradeItemContextCodeType" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemABaseUnit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemAConsumerUnit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemADespatchUnit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemAnInvoiceUnit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemAnOrderableUnit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemAService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemNonphysical" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemRecalled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="preliminaryItemStatusCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}PreliminaryItemStatusCodeType" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemUnitDescriptorCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}TradeItemUnitDescriptorCodeType" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemTradeChannelCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}TradeChannelCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemReinstated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="productInformationLegalDisclaimer" type="{urn:gs1:shared:shared_common:xsd:3}Description2500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemUnitOfUse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="brandOwner" type="{urn:gs1:gdsn:gdsn_common:xsd:3}PartyInRoleType" minOccurs="0"/&gt;
 *         &lt;element name="informationProviderOfTradeItem" type="{urn:gs1:gdsn:gdsn_common:xsd:3}PartyInRoleType"/&gt;
 *         &lt;element name="manufacturerOfTradeItem" type="{urn:gs1:gdsn:gdsn_common:xsd:3}PartyInRoleType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="partyInRole" type="{urn:gs1:gdsn:gdsn_common:xsd:3}PartyInRoleType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="displayUnitInformation" type="{urn:gs1:gdsn:trade_item:xsd:3}DisplayUnitInformationType" minOccurs="0"/&gt;
 *         &lt;element name="gdsnTradeItemClassification" type="{urn:gs1:gdsn:trade_item:xsd:3}GDSNTradeItemClassificationType"/&gt;
 *         &lt;element name="nextLowerLevelTradeItemInformation" type="{urn:gs1:gdsn:trade_item:xsd:3}NextLowerLevelTradeItemInformationType" minOccurs="0"/&gt;
 *         &lt;element name="referencedTradeItem" type="{urn:gs1:gdsn:trade_item:xsd:3}ReferencedTradeItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="targetMarket" type="{urn:gs1:shared:shared_common:xsd:3}TargetMarketType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="tradeItemContactInformation" type="{urn:gs1:gdsn:trade_item:xsd:3}TradeItemContactInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemInformation" type="{urn:gs1:gdsn:trade_item:xsd:3}TradeItemInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemSynchronisationDates" type="{urn:gs1:gdsn:trade_item:xsd:3}TradeItemSynchronisationDatesType"/&gt;
 *         &lt;element name="nonGTINReferencedItem" type="{urn:gs1:gdsn:trade_item:xsd:3}NonGTINReferencedItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="globalModelInformation" type="{urn:gs1:gdsn:trade_item:xsd:3}GlobalModelInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="avpList" type="{urn:gs1:gdsn:gdsn_common:xsd:3}GS1_AttributeValuePairListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemType", propOrder = {
    "contextIdentification",
    "isTradeItemABaseUnit",
    "isTradeItemAConsumerUnit",
    "isTradeItemADespatchUnit",
    "isTradeItemAnInvoiceUnit",
    "isTradeItemAnOrderableUnit",
    "isTradeItemAService",
    "isTradeItemNonphysical",
    "isTradeItemRecalled",
    "preliminaryItemStatusCode",
    "tradeItemUnitDescriptorCode",
    "tradeItemTradeChannelCode",
    "isTradeItemReinstated",
    "productInformationLegalDisclaimer",
    "isTradeItemUnitOfUse",
    "brandOwner",
    "informationProviderOfTradeItem",
    "manufacturerOfTradeItem",
    "partyInRole",
    "displayUnitInformation",
    "gdsnTradeItemClassification",
    "nextLowerLevelTradeItemInformation",
    "referencedTradeItem",
    "targetMarket",
    "tradeItemContactInformation",
    "tradeItemInformation",
    "tradeItemSynchronisationDates",
    "nonGTINReferencedItem",
    "globalModelInformation",
    "avpList"
})
public class TradeItemType
    extends TradeItemIdentificationType
{

    protected TradeItemContextCodeType contextIdentification;
    protected Boolean isTradeItemABaseUnit;
    protected Boolean isTradeItemAConsumerUnit;
    protected Boolean isTradeItemADespatchUnit;
    protected Boolean isTradeItemAnInvoiceUnit;
    protected Boolean isTradeItemAnOrderableUnit;
    protected Boolean isTradeItemAService;
    protected Boolean isTradeItemNonphysical;
    protected Boolean isTradeItemRecalled;
    protected PreliminaryItemStatusCodeType preliminaryItemStatusCode;
    protected TradeItemUnitDescriptorCodeType tradeItemUnitDescriptorCode;
    protected List<TradeChannelCodeType> tradeItemTradeChannelCode;
    protected Boolean isTradeItemReinstated;
    protected List<Description2500Type> productInformationLegalDisclaimer;
    protected Boolean isTradeItemUnitOfUse;
    protected PartyInRoleType brandOwner;
    @XmlElement(required = true)
    protected PartyInRoleType informationProviderOfTradeItem;
    protected List<PartyInRoleType> manufacturerOfTradeItem;
    protected List<PartyInRoleType> partyInRole;
    protected DisplayUnitInformationType displayUnitInformation;
    @XmlElement(required = true)
    protected GDSNTradeItemClassificationType gdsnTradeItemClassification;
    protected NextLowerLevelTradeItemInformationType nextLowerLevelTradeItemInformation;
    protected List<ReferencedTradeItemType> referencedTradeItem;
    @XmlElement(required = true)
    protected List<TargetMarketType> targetMarket;
    protected List<TradeItemContactInformationType> tradeItemContactInformation;
    protected List<TradeItemInformationType> tradeItemInformation;
    @XmlElement(required = true)
    protected TradeItemSynchronisationDatesType tradeItemSynchronisationDates;
    protected List<NonGTINReferencedItemType> nonGTINReferencedItem;
    protected List<GlobalModelInformationType> globalModelInformation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the contextIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemContextCodeType }
     *     
     */
    public TradeItemContextCodeType getContextIdentification() {
        return contextIdentification;
    }

    /**
     * Sets the value of the contextIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemContextCodeType }
     *     
     */
    public void setContextIdentification(TradeItemContextCodeType value) {
        this.contextIdentification = value;
    }

    /**
     * Gets the value of the isTradeItemABaseUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTradeItemABaseUnit() {
        return isTradeItemABaseUnit;
    }

    /**
     * Sets the value of the isTradeItemABaseUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTradeItemABaseUnit(Boolean value) {
        this.isTradeItemABaseUnit = value;
    }

    /**
     * Gets the value of the isTradeItemAConsumerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTradeItemAConsumerUnit() {
        return isTradeItemAConsumerUnit;
    }

    /**
     * Sets the value of the isTradeItemAConsumerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTradeItemAConsumerUnit(Boolean value) {
        this.isTradeItemAConsumerUnit = value;
    }

    /**
     * Gets the value of the isTradeItemADespatchUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTradeItemADespatchUnit() {
        return isTradeItemADespatchUnit;
    }

    /**
     * Sets the value of the isTradeItemADespatchUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTradeItemADespatchUnit(Boolean value) {
        this.isTradeItemADespatchUnit = value;
    }

    /**
     * Gets the value of the isTradeItemAnInvoiceUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTradeItemAnInvoiceUnit() {
        return isTradeItemAnInvoiceUnit;
    }

    /**
     * Sets the value of the isTradeItemAnInvoiceUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTradeItemAnInvoiceUnit(Boolean value) {
        this.isTradeItemAnInvoiceUnit = value;
    }

    /**
     * Gets the value of the isTradeItemAnOrderableUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTradeItemAnOrderableUnit() {
        return isTradeItemAnOrderableUnit;
    }

    /**
     * Sets the value of the isTradeItemAnOrderableUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTradeItemAnOrderableUnit(Boolean value) {
        this.isTradeItemAnOrderableUnit = value;
    }

    /**
     * Gets the value of the isTradeItemAService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTradeItemAService() {
        return isTradeItemAService;
    }

    /**
     * Sets the value of the isTradeItemAService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTradeItemAService(Boolean value) {
        this.isTradeItemAService = value;
    }

    /**
     * Gets the value of the isTradeItemNonphysical property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTradeItemNonphysical() {
        return isTradeItemNonphysical;
    }

    /**
     * Sets the value of the isTradeItemNonphysical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTradeItemNonphysical(Boolean value) {
        this.isTradeItemNonphysical = value;
    }

    /**
     * Gets the value of the isTradeItemRecalled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTradeItemRecalled() {
        return isTradeItemRecalled;
    }

    /**
     * Sets the value of the isTradeItemRecalled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTradeItemRecalled(Boolean value) {
        this.isTradeItemRecalled = value;
    }

    /**
     * Gets the value of the preliminaryItemStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link PreliminaryItemStatusCodeType }
     *     
     */
    public PreliminaryItemStatusCodeType getPreliminaryItemStatusCode() {
        return preliminaryItemStatusCode;
    }

    /**
     * Sets the value of the preliminaryItemStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreliminaryItemStatusCodeType }
     *     
     */
    public void setPreliminaryItemStatusCode(PreliminaryItemStatusCodeType value) {
        this.preliminaryItemStatusCode = value;
    }

    /**
     * Gets the value of the tradeItemUnitDescriptorCode property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemUnitDescriptorCodeType }
     *     
     */
    public TradeItemUnitDescriptorCodeType getTradeItemUnitDescriptorCode() {
        return tradeItemUnitDescriptorCode;
    }

    /**
     * Sets the value of the tradeItemUnitDescriptorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemUnitDescriptorCodeType }
     *     
     */
    public void setTradeItemUnitDescriptorCode(TradeItemUnitDescriptorCodeType value) {
        this.tradeItemUnitDescriptorCode = value;
    }

    /**
     * Gets the value of the tradeItemTradeChannelCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemTradeChannelCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemTradeChannelCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeChannelCodeType }
     * 
     * 
     */
    public List<TradeChannelCodeType> getTradeItemTradeChannelCode() {
        if (tradeItemTradeChannelCode == null) {
            tradeItemTradeChannelCode = new ArrayList<TradeChannelCodeType>();
        }
        return this.tradeItemTradeChannelCode;
    }

    /**
     * Gets the value of the isTradeItemReinstated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTradeItemReinstated() {
        return isTradeItemReinstated;
    }

    /**
     * Sets the value of the isTradeItemReinstated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTradeItemReinstated(Boolean value) {
        this.isTradeItemReinstated = value;
    }

    /**
     * Gets the value of the productInformationLegalDisclaimer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productInformationLegalDisclaimer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductInformationLegalDisclaimer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description2500Type }
     * 
     * 
     */
    public List<Description2500Type> getProductInformationLegalDisclaimer() {
        if (productInformationLegalDisclaimer == null) {
            productInformationLegalDisclaimer = new ArrayList<Description2500Type>();
        }
        return this.productInformationLegalDisclaimer;
    }

    /**
     * Gets the value of the isTradeItemUnitOfUse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTradeItemUnitOfUse() {
        return isTradeItemUnitOfUse;
    }

    /**
     * Sets the value of the isTradeItemUnitOfUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTradeItemUnitOfUse(Boolean value) {
        this.isTradeItemUnitOfUse = value;
    }

    /**
     * Gets the value of the brandOwner property.
     * 
     * @return
     *     possible object is
     *     {@link PartyInRoleType }
     *     
     */
    public PartyInRoleType getBrandOwner() {
        return brandOwner;
    }

    /**
     * Sets the value of the brandOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInRoleType }
     *     
     */
    public void setBrandOwner(PartyInRoleType value) {
        this.brandOwner = value;
    }

    /**
     * Gets the value of the informationProviderOfTradeItem property.
     * 
     * @return
     *     possible object is
     *     {@link PartyInRoleType }
     *     
     */
    public PartyInRoleType getInformationProviderOfTradeItem() {
        return informationProviderOfTradeItem;
    }

    /**
     * Sets the value of the informationProviderOfTradeItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInRoleType }
     *     
     */
    public void setInformationProviderOfTradeItem(PartyInRoleType value) {
        this.informationProviderOfTradeItem = value;
    }

    /**
     * Gets the value of the manufacturerOfTradeItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerOfTradeItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerOfTradeItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyInRoleType }
     * 
     * 
     */
    public List<PartyInRoleType> getManufacturerOfTradeItem() {
        if (manufacturerOfTradeItem == null) {
            manufacturerOfTradeItem = new ArrayList<PartyInRoleType>();
        }
        return this.manufacturerOfTradeItem;
    }

    /**
     * Gets the value of the partyInRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyInRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyInRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyInRoleType }
     * 
     * 
     */
    public List<PartyInRoleType> getPartyInRole() {
        if (partyInRole == null) {
            partyInRole = new ArrayList<PartyInRoleType>();
        }
        return this.partyInRole;
    }

    /**
     * Gets the value of the displayUnitInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayUnitInformationType }
     *     
     */
    public DisplayUnitInformationType getDisplayUnitInformation() {
        return displayUnitInformation;
    }

    /**
     * Sets the value of the displayUnitInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayUnitInformationType }
     *     
     */
    public void setDisplayUnitInformation(DisplayUnitInformationType value) {
        this.displayUnitInformation = value;
    }

    /**
     * Gets the value of the gdsnTradeItemClassification property.
     * 
     * @return
     *     possible object is
     *     {@link GDSNTradeItemClassificationType }
     *     
     */
    public GDSNTradeItemClassificationType getGdsnTradeItemClassification() {
        return gdsnTradeItemClassification;
    }

    /**
     * Sets the value of the gdsnTradeItemClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link GDSNTradeItemClassificationType }
     *     
     */
    public void setGdsnTradeItemClassification(GDSNTradeItemClassificationType value) {
        this.gdsnTradeItemClassification = value;
    }

    /**
     * Gets the value of the nextLowerLevelTradeItemInformation property.
     * 
     * @return
     *     possible object is
     *     {@link NextLowerLevelTradeItemInformationType }
     *     
     */
    public NextLowerLevelTradeItemInformationType getNextLowerLevelTradeItemInformation() {
        return nextLowerLevelTradeItemInformation;
    }

    /**
     * Sets the value of the nextLowerLevelTradeItemInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NextLowerLevelTradeItemInformationType }
     *     
     */
    public void setNextLowerLevelTradeItemInformation(NextLowerLevelTradeItemInformationType value) {
        this.nextLowerLevelTradeItemInformation = value;
    }

    /**
     * Gets the value of the referencedTradeItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencedTradeItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencedTradeItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencedTradeItemType }
     * 
     * 
     */
    public List<ReferencedTradeItemType> getReferencedTradeItem() {
        if (referencedTradeItem == null) {
            referencedTradeItem = new ArrayList<ReferencedTradeItemType>();
        }
        return this.referencedTradeItem;
    }

    /**
     * Gets the value of the targetMarket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetMarket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetMarket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetMarketType }
     * 
     * 
     */
    public List<TargetMarketType> getTargetMarket() {
        if (targetMarket == null) {
            targetMarket = new ArrayList<TargetMarketType>();
        }
        return this.targetMarket;
    }

    /**
     * Gets the value of the tradeItemContactInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemContactInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemContactInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeItemContactInformationType }
     * 
     * 
     */
    public List<TradeItemContactInformationType> getTradeItemContactInformation() {
        if (tradeItemContactInformation == null) {
            tradeItemContactInformation = new ArrayList<TradeItemContactInformationType>();
        }
        return this.tradeItemContactInformation;
    }

    /**
     * Gets the value of the tradeItemInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeItemInformationType }
     * 
     * 
     */
    public List<TradeItemInformationType> getTradeItemInformation() {
        if (tradeItemInformation == null) {
            tradeItemInformation = new ArrayList<TradeItemInformationType>();
        }
        return this.tradeItemInformation;
    }

    /**
     * Gets the value of the tradeItemSynchronisationDates property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemSynchronisationDatesType }
     *     
     */
    public TradeItemSynchronisationDatesType getTradeItemSynchronisationDates() {
        return tradeItemSynchronisationDates;
    }

    /**
     * Sets the value of the tradeItemSynchronisationDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemSynchronisationDatesType }
     *     
     */
    public void setTradeItemSynchronisationDates(TradeItemSynchronisationDatesType value) {
        this.tradeItemSynchronisationDates = value;
    }

    /**
     * Gets the value of the nonGTINReferencedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonGTINReferencedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonGTINReferencedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonGTINReferencedItemType }
     * 
     * 
     */
    public List<NonGTINReferencedItemType> getNonGTINReferencedItem() {
        if (nonGTINReferencedItem == null) {
            nonGTINReferencedItem = new ArrayList<NonGTINReferencedItemType>();
        }
        return this.nonGTINReferencedItem;
    }

    /**
     * Gets the value of the globalModelInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalModelInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalModelInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalModelInformationType }
     * 
     * 
     */
    public List<GlobalModelInformationType> getGlobalModelInformation() {
        if (globalModelInformation == null) {
            globalModelInformation = new ArrayList<GlobalModelInformationType>();
        }
        return this.globalModelInformation;
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
