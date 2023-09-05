
package gs1.gdsn.trade_item.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.ReferencedTradeItemTypeCodeType;
import gs1.shared.shared_common.xsd._3.AdditionalTradeItemIdentificationType;


/**
 * <p>Java class for NonGTINReferencedItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonGTINReferencedItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referencedTradeItemTypeCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}ReferencedTradeItemTypeCodeType"/&gt;
 *         &lt;element name="additionalTradeItemIdentification" type="{urn:gs1:shared:shared_common:xsd:3}AdditionalTradeItemIdentificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonGTINReferencedItemType", propOrder = {
    "referencedTradeItemTypeCode",
    "additionalTradeItemIdentification"
})
public class NonGTINReferencedItemType {

    @XmlElement(required = true)
    protected ReferencedTradeItemTypeCodeType referencedTradeItemTypeCode;
    protected List<AdditionalTradeItemIdentificationType> additionalTradeItemIdentification;

    /**
     * Gets the value of the referencedTradeItemTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencedTradeItemTypeCodeType }
     *     
     */
    public ReferencedTradeItemTypeCodeType getReferencedTradeItemTypeCode() {
        return referencedTradeItemTypeCode;
    }

    /**
     * Sets the value of the referencedTradeItemTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencedTradeItemTypeCodeType }
     *     
     */
    public void setReferencedTradeItemTypeCode(ReferencedTradeItemTypeCodeType value) {
        this.referencedTradeItemTypeCode = value;
    }

    /**
     * Gets the value of the additionalTradeItemIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalTradeItemIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalTradeItemIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalTradeItemIdentificationType }
     * 
     * 
     */
    public List<AdditionalTradeItemIdentificationType> getAdditionalTradeItemIdentification() {
        if (additionalTradeItemIdentification == null) {
            additionalTradeItemIdentification = new ArrayList<AdditionalTradeItemIdentificationType>();
        }
        return this.additionalTradeItemIdentification;
    }

}
