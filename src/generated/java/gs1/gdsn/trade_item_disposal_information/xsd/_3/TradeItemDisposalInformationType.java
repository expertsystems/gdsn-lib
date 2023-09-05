
package gs1.gdsn.trade_item_disposal_information.xsd._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for TradeItemDisposalInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemDisposalInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="areHazardousComponentsRemovable" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="componentsLabeledForDisassemblyRecyclingPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="doesTradeItemHaveRefuseObligations" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemConsumerUpgradeableOrMaintainable" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemDesignedForEasyDisassembly" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemUniversalWaste" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="typeOfWasteCode" type="{urn:gs1:gdsn:trade_item_disposal_information:xsd:3}TypeOfWasteCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerTakeBackProgram" type="{urn:gs1:gdsn:trade_item_disposal_information:xsd:3}ManufacturerTakeBackProgramType" minOccurs="0"/&gt;
 *         &lt;element name="sparePartsAvailabilityInformation" type="{urn:gs1:gdsn:trade_item_disposal_information:xsd:3}SparePartsAvailabilityInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemWasteManagement" type="{urn:gs1:gdsn:trade_item_disposal_information:xsd:3}TradeItemWasteManagementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemDisposalInformationType", propOrder = {
    "areHazardousComponentsRemovable",
    "componentsLabeledForDisassemblyRecyclingPercent",
    "doesTradeItemHaveRefuseObligations",
    "isTradeItemConsumerUpgradeableOrMaintainable",
    "isTradeItemDesignedForEasyDisassembly",
    "isTradeItemUniversalWaste",
    "typeOfWasteCode",
    "manufacturerTakeBackProgram",
    "sparePartsAvailabilityInformation",
    "tradeItemWasteManagement"
})
public class TradeItemDisposalInformationType {

    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType areHazardousComponentsRemovable;
    protected BigDecimal componentsLabeledForDisassemblyRecyclingPercent;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType doesTradeItemHaveRefuseObligations;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isTradeItemConsumerUpgradeableOrMaintainable;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isTradeItemDesignedForEasyDisassembly;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isTradeItemUniversalWaste;
    protected List<TypeOfWasteCodeType> typeOfWasteCode;
    protected ManufacturerTakeBackProgramType manufacturerTakeBackProgram;
    protected List<SparePartsAvailabilityInformationType> sparePartsAvailabilityInformation;
    protected List<TradeItemWasteManagementType> tradeItemWasteManagement;

    /**
     * Gets the value of the areHazardousComponentsRemovable property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getAreHazardousComponentsRemovable() {
        return areHazardousComponentsRemovable;
    }

    /**
     * Sets the value of the areHazardousComponentsRemovable property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setAreHazardousComponentsRemovable(NonBinaryLogicEnumerationType value) {
        this.areHazardousComponentsRemovable = value;
    }

    /**
     * Gets the value of the componentsLabeledForDisassemblyRecyclingPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getComponentsLabeledForDisassemblyRecyclingPercent() {
        return componentsLabeledForDisassemblyRecyclingPercent;
    }

    /**
     * Sets the value of the componentsLabeledForDisassemblyRecyclingPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setComponentsLabeledForDisassemblyRecyclingPercent(BigDecimal value) {
        this.componentsLabeledForDisassemblyRecyclingPercent = value;
    }

    /**
     * Gets the value of the doesTradeItemHaveRefuseObligations property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getDoesTradeItemHaveRefuseObligations() {
        return doesTradeItemHaveRefuseObligations;
    }

    /**
     * Sets the value of the doesTradeItemHaveRefuseObligations property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setDoesTradeItemHaveRefuseObligations(NonBinaryLogicEnumerationType value) {
        this.doesTradeItemHaveRefuseObligations = value;
    }

    /**
     * Gets the value of the isTradeItemConsumerUpgradeableOrMaintainable property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsTradeItemConsumerUpgradeableOrMaintainable() {
        return isTradeItemConsumerUpgradeableOrMaintainable;
    }

    /**
     * Sets the value of the isTradeItemConsumerUpgradeableOrMaintainable property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsTradeItemConsumerUpgradeableOrMaintainable(NonBinaryLogicEnumerationType value) {
        this.isTradeItemConsumerUpgradeableOrMaintainable = value;
    }

    /**
     * Gets the value of the isTradeItemDesignedForEasyDisassembly property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsTradeItemDesignedForEasyDisassembly() {
        return isTradeItemDesignedForEasyDisassembly;
    }

    /**
     * Sets the value of the isTradeItemDesignedForEasyDisassembly property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsTradeItemDesignedForEasyDisassembly(NonBinaryLogicEnumerationType value) {
        this.isTradeItemDesignedForEasyDisassembly = value;
    }

    /**
     * Gets the value of the isTradeItemUniversalWaste property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsTradeItemUniversalWaste() {
        return isTradeItemUniversalWaste;
    }

    /**
     * Sets the value of the isTradeItemUniversalWaste property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsTradeItemUniversalWaste(NonBinaryLogicEnumerationType value) {
        this.isTradeItemUniversalWaste = value;
    }

    /**
     * Gets the value of the typeOfWasteCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeOfWasteCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeOfWasteCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeOfWasteCodeType }
     * 
     * 
     */
    public List<TypeOfWasteCodeType> getTypeOfWasteCode() {
        if (typeOfWasteCode == null) {
            typeOfWasteCode = new ArrayList<TypeOfWasteCodeType>();
        }
        return this.typeOfWasteCode;
    }

    /**
     * Gets the value of the manufacturerTakeBackProgram property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturerTakeBackProgramType }
     *     
     */
    public ManufacturerTakeBackProgramType getManufacturerTakeBackProgram() {
        return manufacturerTakeBackProgram;
    }

    /**
     * Sets the value of the manufacturerTakeBackProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturerTakeBackProgramType }
     *     
     */
    public void setManufacturerTakeBackProgram(ManufacturerTakeBackProgramType value) {
        this.manufacturerTakeBackProgram = value;
    }

    /**
     * Gets the value of the sparePartsAvailabilityInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sparePartsAvailabilityInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSparePartsAvailabilityInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SparePartsAvailabilityInformationType }
     * 
     * 
     */
    public List<SparePartsAvailabilityInformationType> getSparePartsAvailabilityInformation() {
        if (sparePartsAvailabilityInformation == null) {
            sparePartsAvailabilityInformation = new ArrayList<SparePartsAvailabilityInformationType>();
        }
        return this.sparePartsAvailabilityInformation;
    }

    /**
     * Gets the value of the tradeItemWasteManagement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemWasteManagement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemWasteManagement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeItemWasteManagementType }
     * 
     * 
     */
    public List<TradeItemWasteManagementType> getTradeItemWasteManagement() {
        if (tradeItemWasteManagement == null) {
            tradeItemWasteManagement = new ArrayList<TradeItemWasteManagementType>();
        }
        return this.tradeItemWasteManagement;
    }

}
