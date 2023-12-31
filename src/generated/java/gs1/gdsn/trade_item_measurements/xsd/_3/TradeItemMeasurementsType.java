
package gs1.gdsn.trade_item_measurements.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.AdditionalTradeItemDimensionsType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.Description500Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for TradeItemMeasurementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemMeasurementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="depth" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="diameter" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="height" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="inBoxCubeDimension" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="individualUnitMaximumSize" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="individualUnitMinimumSize" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="netContent" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemCompositionDepth" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemCompositionWidth" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="width" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="netContentStatement" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tensileStrength" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="velocity" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="acceleration" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="frontFaceTypeCode" type="{urn:gs1:gdsn:trade_item_measurements:xsd:3}FrontFaceTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="shearStrength" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pegMeasurements" type="{urn:gs1:gdsn:trade_item_measurements:xsd:3}PegMeasurementsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="additionalTradeItemDimensions" type="{urn:gs1:gdsn:gdsn_common:xsd:3}AdditionalTradeItemDimensionsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemNesting" type="{urn:gs1:gdsn:trade_item_measurements:xsd:3}TradeItemNestingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemOrientation" type="{urn:gs1:gdsn:trade_item_measurements:xsd:3}TradeItemOrientationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemWeight" type="{urn:gs1:gdsn:trade_item_measurements:xsd:3}TradeItemWeightType" minOccurs="0"/&gt;
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
@XmlType(name = "TradeItemMeasurementsType", propOrder = {
    "depth",
    "diameter",
    "height",
    "inBoxCubeDimension",
    "individualUnitMaximumSize",
    "individualUnitMinimumSize",
    "netContent",
    "tradeItemCompositionDepth",
    "tradeItemCompositionWidth",
    "width",
    "netContentStatement",
    "tensileStrength",
    "velocity",
    "acceleration",
    "frontFaceTypeCode",
    "shearStrength",
    "pegMeasurements",
    "additionalTradeItemDimensions",
    "tradeItemNesting",
    "tradeItemOrientation",
    "tradeItemWeight",
    "avpList"
})
public class TradeItemMeasurementsType {

    protected MeasurementType depth;
    protected MeasurementType diameter;
    protected MeasurementType height;
    protected MeasurementType inBoxCubeDimension;
    protected MeasurementType individualUnitMaximumSize;
    protected MeasurementType individualUnitMinimumSize;
    protected List<MeasurementType> netContent;
    protected MeasurementType tradeItemCompositionDepth;
    protected MeasurementType tradeItemCompositionWidth;
    protected MeasurementType width;
    protected List<Description500Type> netContentStatement;
    protected List<MeasurementType> tensileStrength;
    protected List<MeasurementType> velocity;
    protected List<Description500Type> acceleration;
    protected FrontFaceTypeCodeType frontFaceTypeCode;
    protected List<MeasurementType> shearStrength;
    protected List<PegMeasurementsType> pegMeasurements;
    protected List<AdditionalTradeItemDimensionsType> additionalTradeItemDimensions;
    protected List<TradeItemNestingType> tradeItemNesting;
    protected List<TradeItemOrientationType> tradeItemOrientation;
    protected TradeItemWeightType tradeItemWeight;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setDepth(MeasurementType value) {
        this.depth = value;
    }

    /**
     * Gets the value of the diameter property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getDiameter() {
        return diameter;
    }

    /**
     * Sets the value of the diameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setDiameter(MeasurementType value) {
        this.diameter = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setHeight(MeasurementType value) {
        this.height = value;
    }

    /**
     * Gets the value of the inBoxCubeDimension property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getInBoxCubeDimension() {
        return inBoxCubeDimension;
    }

    /**
     * Sets the value of the inBoxCubeDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setInBoxCubeDimension(MeasurementType value) {
        this.inBoxCubeDimension = value;
    }

    /**
     * Gets the value of the individualUnitMaximumSize property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getIndividualUnitMaximumSize() {
        return individualUnitMaximumSize;
    }

    /**
     * Sets the value of the individualUnitMaximumSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setIndividualUnitMaximumSize(MeasurementType value) {
        this.individualUnitMaximumSize = value;
    }

    /**
     * Gets the value of the individualUnitMinimumSize property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getIndividualUnitMinimumSize() {
        return individualUnitMinimumSize;
    }

    /**
     * Sets the value of the individualUnitMinimumSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setIndividualUnitMinimumSize(MeasurementType value) {
        this.individualUnitMinimumSize = value;
    }

    /**
     * Gets the value of the netContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getNetContent() {
        if (netContent == null) {
            netContent = new ArrayList<MeasurementType>();
        }
        return this.netContent;
    }

    /**
     * Gets the value of the tradeItemCompositionDepth property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getTradeItemCompositionDepth() {
        return tradeItemCompositionDepth;
    }

    /**
     * Sets the value of the tradeItemCompositionDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setTradeItemCompositionDepth(MeasurementType value) {
        this.tradeItemCompositionDepth = value;
    }

    /**
     * Gets the value of the tradeItemCompositionWidth property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getTradeItemCompositionWidth() {
        return tradeItemCompositionWidth;
    }

    /**
     * Sets the value of the tradeItemCompositionWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setTradeItemCompositionWidth(MeasurementType value) {
        this.tradeItemCompositionWidth = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setWidth(MeasurementType value) {
        this.width = value;
    }

    /**
     * Gets the value of the netContentStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netContentStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetContentStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getNetContentStatement() {
        if (netContentStatement == null) {
            netContentStatement = new ArrayList<Description500Type>();
        }
        return this.netContentStatement;
    }

    /**
     * Gets the value of the tensileStrength property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tensileStrength property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTensileStrength().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getTensileStrength() {
        if (tensileStrength == null) {
            tensileStrength = new ArrayList<MeasurementType>();
        }
        return this.tensileStrength;
    }

    /**
     * Gets the value of the velocity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the velocity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVelocity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getVelocity() {
        if (velocity == null) {
            velocity = new ArrayList<MeasurementType>();
        }
        return this.velocity;
    }

    /**
     * Gets the value of the acceleration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acceleration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcceleration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getAcceleration() {
        if (acceleration == null) {
            acceleration = new ArrayList<Description500Type>();
        }
        return this.acceleration;
    }

    /**
     * Gets the value of the frontFaceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link FrontFaceTypeCodeType }
     *     
     */
    public FrontFaceTypeCodeType getFrontFaceTypeCode() {
        return frontFaceTypeCode;
    }

    /**
     * Sets the value of the frontFaceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrontFaceTypeCodeType }
     *     
     */
    public void setFrontFaceTypeCode(FrontFaceTypeCodeType value) {
        this.frontFaceTypeCode = value;
    }

    /**
     * Gets the value of the shearStrength property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shearStrength property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShearStrength().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getShearStrength() {
        if (shearStrength == null) {
            shearStrength = new ArrayList<MeasurementType>();
        }
        return this.shearStrength;
    }

    /**
     * Gets the value of the pegMeasurements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pegMeasurements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPegMeasurements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PegMeasurementsType }
     * 
     * 
     */
    public List<PegMeasurementsType> getPegMeasurements() {
        if (pegMeasurements == null) {
            pegMeasurements = new ArrayList<PegMeasurementsType>();
        }
        return this.pegMeasurements;
    }

    /**
     * Gets the value of the additionalTradeItemDimensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalTradeItemDimensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalTradeItemDimensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalTradeItemDimensionsType }
     * 
     * 
     */
    public List<AdditionalTradeItemDimensionsType> getAdditionalTradeItemDimensions() {
        if (additionalTradeItemDimensions == null) {
            additionalTradeItemDimensions = new ArrayList<AdditionalTradeItemDimensionsType>();
        }
        return this.additionalTradeItemDimensions;
    }

    /**
     * Gets the value of the tradeItemNesting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemNesting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemNesting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeItemNestingType }
     * 
     * 
     */
    public List<TradeItemNestingType> getTradeItemNesting() {
        if (tradeItemNesting == null) {
            tradeItemNesting = new ArrayList<TradeItemNestingType>();
        }
        return this.tradeItemNesting;
    }

    /**
     * Gets the value of the tradeItemOrientation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemOrientation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemOrientation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeItemOrientationType }
     * 
     * 
     */
    public List<TradeItemOrientationType> getTradeItemOrientation() {
        if (tradeItemOrientation == null) {
            tradeItemOrientation = new ArrayList<TradeItemOrientationType>();
        }
        return this.tradeItemOrientation;
    }

    /**
     * Gets the value of the tradeItemWeight property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemWeightType }
     *     
     */
    public TradeItemWeightType getTradeItemWeight() {
        return tradeItemWeight;
    }

    /**
     * Sets the value of the tradeItemWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemWeightType }
     *     
     */
    public void setTradeItemWeight(TradeItemWeightType value) {
        this.tradeItemWeight = value;
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
