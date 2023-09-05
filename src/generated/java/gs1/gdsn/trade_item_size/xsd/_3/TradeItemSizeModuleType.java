
package gs1.gdsn.trade_item_size.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;


/**
 * <p>Java class for TradeItemSizeModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemSizeModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sizeGroupCode" type="{urn:gs1:gdsn:trade_item_size:xsd:3}SizeGroupCodeType" minOccurs="0"/&gt;
 *         &lt;element name="nonPackagedSizeDimension" type="{urn:gs1:gdsn:trade_item_size:xsd:3}NonPackagedSizeDimensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TradeItemSizeModuleType", propOrder = {
    "sizeGroupCode",
    "nonPackagedSizeDimension",
    "avpList"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:trade_item_size:xsd:3")
public class TradeItemSizeModuleType {

    protected SizeGroupCodeType sizeGroupCode;
    protected List<NonPackagedSizeDimensionType> nonPackagedSizeDimension;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the sizeGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link SizeGroupCodeType }
     *     
     */
    public SizeGroupCodeType getSizeGroupCode() {
        return sizeGroupCode;
    }

    /**
     * Sets the value of the sizeGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeGroupCodeType }
     *     
     */
    public void setSizeGroupCode(SizeGroupCodeType value) {
        this.sizeGroupCode = value;
    }

    /**
     * Gets the value of the nonPackagedSizeDimension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonPackagedSizeDimension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonPackagedSizeDimension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonPackagedSizeDimensionType }
     * 
     * 
     */
    public List<NonPackagedSizeDimensionType> getNonPackagedSizeDimension() {
        if (nonPackagedSizeDimension == null) {
            nonPackagedSizeDimension = new ArrayList<NonPackagedSizeDimensionType>();
        }
        return this.nonPackagedSizeDimension;
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
