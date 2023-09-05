
package gs1.gdsn.trade_item.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.AdditionalTradeItemClassificationCodeListCodeType;


/**
 * <p>Java class for AdditionalTradeItemClassificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalTradeItemClassificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalTradeItemClassificationSystemCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}AdditionalTradeItemClassificationCodeListCodeType" minOccurs="0"/&gt;
 *         &lt;element name="additionalTradeItemClassificationValue" type="{urn:gs1:gdsn:trade_item:xsd:3}AdditionalTradeItemClassificationValueType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalTradeItemClassificationType", propOrder = {
    "additionalTradeItemClassificationSystemCode",
    "additionalTradeItemClassificationValue"
})
public class AdditionalTradeItemClassificationType {

    protected AdditionalTradeItemClassificationCodeListCodeType additionalTradeItemClassificationSystemCode;
    protected List<AdditionalTradeItemClassificationValueType> additionalTradeItemClassificationValue;

    /**
     * Gets the value of the additionalTradeItemClassificationSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalTradeItemClassificationCodeListCodeType }
     *     
     */
    public AdditionalTradeItemClassificationCodeListCodeType getAdditionalTradeItemClassificationSystemCode() {
        return additionalTradeItemClassificationSystemCode;
    }

    /**
     * Sets the value of the additionalTradeItemClassificationSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalTradeItemClassificationCodeListCodeType }
     *     
     */
    public void setAdditionalTradeItemClassificationSystemCode(AdditionalTradeItemClassificationCodeListCodeType value) {
        this.additionalTradeItemClassificationSystemCode = value;
    }

    /**
     * Gets the value of the additionalTradeItemClassificationValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalTradeItemClassificationValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalTradeItemClassificationValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalTradeItemClassificationValueType }
     * 
     * 
     */
    public List<AdditionalTradeItemClassificationValueType> getAdditionalTradeItemClassificationValue() {
        if (additionalTradeItemClassificationValue == null) {
            additionalTradeItemClassificationValue = new ArrayList<AdditionalTradeItemClassificationValueType>();
        }
        return this.additionalTradeItemClassificationValue;
    }

}
