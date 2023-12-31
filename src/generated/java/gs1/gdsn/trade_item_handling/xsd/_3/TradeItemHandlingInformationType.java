
package gs1.gdsn.trade_item_handling.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.CodeType;
import gs1.shared.shared_common.xsd._3.Description1000Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for TradeItemHandlingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemHandlingInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clampPressure" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="handlingInstructionsCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="handlingInstructionsDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemStacking" type="{urn:gs1:gdsn:trade_item_handling:xsd:3}TradeItemStackingType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TradeItemHandlingInformationType", propOrder = {
    "clampPressure",
    "handlingInstructionsCodeReference",
    "handlingInstructionsDescription",
    "tradeItemStacking",
    "avpList"
})
public class TradeItemHandlingInformationType {

    protected MeasurementType clampPressure;
    protected List<CodeType> handlingInstructionsCodeReference;
    protected List<Description1000Type> handlingInstructionsDescription;
    protected List<TradeItemStackingType> tradeItemStacking;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the clampPressure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getClampPressure() {
        return clampPressure;
    }

    /**
     * Sets the value of the clampPressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setClampPressure(MeasurementType value) {
        this.clampPressure = value;
    }

    /**
     * Gets the value of the handlingInstructionsCodeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlingInstructionsCodeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlingInstructionsCodeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getHandlingInstructionsCodeReference() {
        if (handlingInstructionsCodeReference == null) {
            handlingInstructionsCodeReference = new ArrayList<CodeType>();
        }
        return this.handlingInstructionsCodeReference;
    }

    /**
     * Gets the value of the handlingInstructionsDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlingInstructionsDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlingInstructionsDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getHandlingInstructionsDescription() {
        if (handlingInstructionsDescription == null) {
            handlingInstructionsDescription = new ArrayList<Description1000Type>();
        }
        return this.handlingInstructionsDescription;
    }

    /**
     * Gets the value of the tradeItemStacking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemStacking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemStacking().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeItemStackingType }
     * 
     * 
     */
    public List<TradeItemStackingType> getTradeItemStacking() {
        if (tradeItemStacking == null) {
            tradeItemStacking = new ArrayList<TradeItemStackingType>();
        }
        return this.tradeItemStacking;
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
