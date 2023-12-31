
package gs1.gdsn.durable_goods_characteristics.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.Description70Type;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for DurableGoodsCharacteristicsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DurableGoodsCharacteristicsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isAssemblyRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemReconditioned" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemFinishDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemOperatingEnvironment" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="numberOfWheels" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="itemMountingInformation" type="{urn:gs1:gdsn:durable_goods_characteristics:xsd:3}ItemMountingInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "DurableGoodsCharacteristicsType", propOrder = {
    "isAssemblyRequired",
    "isTradeItemReconditioned",
    "tradeItemFinishDescription",
    "tradeItemOperatingEnvironment",
    "numberOfWheels",
    "itemMountingInformation",
    "avpList"
})
public class DurableGoodsCharacteristicsType {

    protected Boolean isAssemblyRequired;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isTradeItemReconditioned;
    protected List<Description70Type> tradeItemFinishDescription;
    protected List<String> tradeItemOperatingEnvironment;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfWheels;
    protected List<ItemMountingInformationType> itemMountingInformation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the isAssemblyRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAssemblyRequired() {
        return isAssemblyRequired;
    }

    /**
     * Sets the value of the isAssemblyRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAssemblyRequired(Boolean value) {
        this.isAssemblyRequired = value;
    }

    /**
     * Gets the value of the isTradeItemReconditioned property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsTradeItemReconditioned() {
        return isTradeItemReconditioned;
    }

    /**
     * Sets the value of the isTradeItemReconditioned property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsTradeItemReconditioned(NonBinaryLogicEnumerationType value) {
        this.isTradeItemReconditioned = value;
    }

    /**
     * Gets the value of the tradeItemFinishDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemFinishDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemFinishDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getTradeItemFinishDescription() {
        if (tradeItemFinishDescription == null) {
            tradeItemFinishDescription = new ArrayList<Description70Type>();
        }
        return this.tradeItemFinishDescription;
    }

    /**
     * Gets the value of the tradeItemOperatingEnvironment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemOperatingEnvironment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemOperatingEnvironment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTradeItemOperatingEnvironment() {
        if (tradeItemOperatingEnvironment == null) {
            tradeItemOperatingEnvironment = new ArrayList<String>();
        }
        return this.tradeItemOperatingEnvironment;
    }

    /**
     * Gets the value of the numberOfWheels property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfWheels() {
        return numberOfWheels;
    }

    /**
     * Sets the value of the numberOfWheels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfWheels(BigInteger value) {
        this.numberOfWheels = value;
    }

    /**
     * Gets the value of the itemMountingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemMountingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemMountingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemMountingInformationType }
     * 
     * 
     */
    public List<ItemMountingInformationType> getItemMountingInformation() {
        if (itemMountingInformation == null) {
            itemMountingInformation = new ArrayList<ItemMountingInformationType>();
        }
        return this.itemMountingInformation;
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
