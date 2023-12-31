
package gs1.gdsn.packaging_marking.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description500Type;


/**
 * <p>Java class for PackagingDateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingDateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeItemDateOnPackagingFormatName" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tradeItemDateOnPackagingFormatTypeCode" type="{urn:gs1:gdsn:packaging_marking:xsd:3}DateOnPackagingFormatTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemDateOnPackagingTypeCode" type="{urn:gs1:gdsn:packaging_marking:xsd:3}TradeItemDateOnPackagingTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemDateOnPackagingLocation" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="consumerFriendlyDateOnPackagingDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="typeOfProductChangesAfterDateCode" type="{urn:gs1:gdsn:packaging_marking:xsd:3}TypeOfProductChangesAfterDateCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingDateType", propOrder = {
    "tradeItemDateOnPackagingFormatName",
    "tradeItemDateOnPackagingFormatTypeCode",
    "tradeItemDateOnPackagingTypeCode",
    "tradeItemDateOnPackagingLocation",
    "consumerFriendlyDateOnPackagingDescription",
    "typeOfProductChangesAfterDateCode"
})
public class PackagingDateType {

    protected List<String> tradeItemDateOnPackagingFormatName;
    protected DateOnPackagingFormatTypeCodeType tradeItemDateOnPackagingFormatTypeCode;
    protected TradeItemDateOnPackagingTypeCodeType tradeItemDateOnPackagingTypeCode;
    protected String tradeItemDateOnPackagingLocation;
    protected List<Description500Type> consumerFriendlyDateOnPackagingDescription;
    protected List<TypeOfProductChangesAfterDateCodeType> typeOfProductChangesAfterDateCode;

    /**
     * Gets the value of the tradeItemDateOnPackagingFormatName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemDateOnPackagingFormatName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemDateOnPackagingFormatName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTradeItemDateOnPackagingFormatName() {
        if (tradeItemDateOnPackagingFormatName == null) {
            tradeItemDateOnPackagingFormatName = new ArrayList<String>();
        }
        return this.tradeItemDateOnPackagingFormatName;
    }

    /**
     * Gets the value of the tradeItemDateOnPackagingFormatTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DateOnPackagingFormatTypeCodeType }
     *     
     */
    public DateOnPackagingFormatTypeCodeType getTradeItemDateOnPackagingFormatTypeCode() {
        return tradeItemDateOnPackagingFormatTypeCode;
    }

    /**
     * Sets the value of the tradeItemDateOnPackagingFormatTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnPackagingFormatTypeCodeType }
     *     
     */
    public void setTradeItemDateOnPackagingFormatTypeCode(DateOnPackagingFormatTypeCodeType value) {
        this.tradeItemDateOnPackagingFormatTypeCode = value;
    }

    /**
     * Gets the value of the tradeItemDateOnPackagingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemDateOnPackagingTypeCodeType }
     *     
     */
    public TradeItemDateOnPackagingTypeCodeType getTradeItemDateOnPackagingTypeCode() {
        return tradeItemDateOnPackagingTypeCode;
    }

    /**
     * Sets the value of the tradeItemDateOnPackagingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemDateOnPackagingTypeCodeType }
     *     
     */
    public void setTradeItemDateOnPackagingTypeCode(TradeItemDateOnPackagingTypeCodeType value) {
        this.tradeItemDateOnPackagingTypeCode = value;
    }

    /**
     * Gets the value of the tradeItemDateOnPackagingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeItemDateOnPackagingLocation() {
        return tradeItemDateOnPackagingLocation;
    }

    /**
     * Sets the value of the tradeItemDateOnPackagingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeItemDateOnPackagingLocation(String value) {
        this.tradeItemDateOnPackagingLocation = value;
    }

    /**
     * Gets the value of the consumerFriendlyDateOnPackagingDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerFriendlyDateOnPackagingDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerFriendlyDateOnPackagingDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getConsumerFriendlyDateOnPackagingDescription() {
        if (consumerFriendlyDateOnPackagingDescription == null) {
            consumerFriendlyDateOnPackagingDescription = new ArrayList<Description500Type>();
        }
        return this.consumerFriendlyDateOnPackagingDescription;
    }

    /**
     * Gets the value of the typeOfProductChangesAfterDateCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeOfProductChangesAfterDateCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeOfProductChangesAfterDateCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeOfProductChangesAfterDateCodeType }
     * 
     * 
     */
    public List<TypeOfProductChangesAfterDateCodeType> getTypeOfProductChangesAfterDateCode() {
        if (typeOfProductChangesAfterDateCode == null) {
            typeOfProductChangesAfterDateCode = new ArrayList<TypeOfProductChangesAfterDateCodeType>();
        }
        return this.typeOfProductChangesAfterDateCode;
    }

}
