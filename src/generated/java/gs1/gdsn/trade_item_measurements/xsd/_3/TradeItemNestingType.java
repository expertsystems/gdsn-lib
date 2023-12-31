
package gs1.gdsn.trade_item_measurements.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for TradeItemNestingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemNestingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nestingDirectionCode" type="{urn:gs1:gdsn:trade_item_measurements:xsd:3}NestingDirectionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="nestingIncrement" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nestingTypeCode" type="{urn:gs1:gdsn:trade_item_measurements:xsd:3}NestingTypeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemNestingType", propOrder = {
    "nestingDirectionCode",
    "nestingIncrement",
    "nestingTypeCode"
})
public class TradeItemNestingType {

    protected NestingDirectionCodeType nestingDirectionCode;
    protected List<MeasurementType> nestingIncrement;
    protected NestingTypeCodeType nestingTypeCode;

    /**
     * Gets the value of the nestingDirectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link NestingDirectionCodeType }
     *     
     */
    public NestingDirectionCodeType getNestingDirectionCode() {
        return nestingDirectionCode;
    }

    /**
     * Sets the value of the nestingDirectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NestingDirectionCodeType }
     *     
     */
    public void setNestingDirectionCode(NestingDirectionCodeType value) {
        this.nestingDirectionCode = value;
    }

    /**
     * Gets the value of the nestingIncrement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nestingIncrement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNestingIncrement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getNestingIncrement() {
        if (nestingIncrement == null) {
            nestingIncrement = new ArrayList<MeasurementType>();
        }
        return this.nestingIncrement;
    }

    /**
     * Gets the value of the nestingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link NestingTypeCodeType }
     *     
     */
    public NestingTypeCodeType getNestingTypeCode() {
        return nestingTypeCode;
    }

    /**
     * Sets the value of the nestingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NestingTypeCodeType }
     *     
     */
    public void setNestingTypeCode(NestingTypeCodeType value) {
        this.nestingTypeCode = value;
    }

}
