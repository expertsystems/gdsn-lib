
package gs1.gdsn.variable_trade_item_information.xsd._3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for VariableTradeItemInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariableTradeItemInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isTradeItemAVariableUnit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="variableTradeItemTypeCode" type="{urn:gs1:gdsn:variable_trade_item_information:xsd:3}VariableTradeItemTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="variableWeightAllowableDeviationPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="variableWeightRangeMaximum" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="variableWeightRangeMinimum" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
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
@XmlType(name = "VariableTradeItemInformationType", propOrder = {
    "isTradeItemAVariableUnit",
    "variableTradeItemTypeCode",
    "variableWeightAllowableDeviationPercentage",
    "variableWeightRangeMaximum",
    "variableWeightRangeMinimum",
    "avpList"
})
public class VariableTradeItemInformationType {

    protected Boolean isTradeItemAVariableUnit;
    protected VariableTradeItemTypeCodeType variableTradeItemTypeCode;
    protected BigDecimal variableWeightAllowableDeviationPercentage;
    protected MeasurementType variableWeightRangeMaximum;
    protected MeasurementType variableWeightRangeMinimum;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the isTradeItemAVariableUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTradeItemAVariableUnit() {
        return isTradeItemAVariableUnit;
    }

    /**
     * Sets the value of the isTradeItemAVariableUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTradeItemAVariableUnit(Boolean value) {
        this.isTradeItemAVariableUnit = value;
    }

    /**
     * Gets the value of the variableTradeItemTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link VariableTradeItemTypeCodeType }
     *     
     */
    public VariableTradeItemTypeCodeType getVariableTradeItemTypeCode() {
        return variableTradeItemTypeCode;
    }

    /**
     * Sets the value of the variableTradeItemTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableTradeItemTypeCodeType }
     *     
     */
    public void setVariableTradeItemTypeCode(VariableTradeItemTypeCodeType value) {
        this.variableTradeItemTypeCode = value;
    }

    /**
     * Gets the value of the variableWeightAllowableDeviationPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVariableWeightAllowableDeviationPercentage() {
        return variableWeightAllowableDeviationPercentage;
    }

    /**
     * Sets the value of the variableWeightAllowableDeviationPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVariableWeightAllowableDeviationPercentage(BigDecimal value) {
        this.variableWeightAllowableDeviationPercentage = value;
    }

    /**
     * Gets the value of the variableWeightRangeMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getVariableWeightRangeMaximum() {
        return variableWeightRangeMaximum;
    }

    /**
     * Sets the value of the variableWeightRangeMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setVariableWeightRangeMaximum(MeasurementType value) {
        this.variableWeightRangeMaximum = value;
    }

    /**
     * Gets the value of the variableWeightRangeMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getVariableWeightRangeMinimum() {
        return variableWeightRangeMinimum;
    }

    /**
     * Sets the value of the variableWeightRangeMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setVariableWeightRangeMinimum(MeasurementType value) {
        this.variableWeightRangeMinimum = value;
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
