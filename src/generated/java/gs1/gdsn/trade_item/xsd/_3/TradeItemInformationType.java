
package gs1.gdsn.trade_item.xsd._3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.Description70Type;
import gs1.shared.shared_common.xsd._3.ExtensionType;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for TradeItemInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consumerProductVariantDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="consumerProductVariantStartEffectiveDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="consumerProductVariantCancelledDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="consumerProductVariantDiscontinuedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="consumerProductVariantEndEffectiveDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="consumerProductVariantIdentification" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="consumerProductVariantReasonCode" type="{urn:gs1:gdsn:trade_item:xsd:3}ReasonForCPVCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemComponents" type="{urn:gs1:gdsn:trade_item:xsd:3}TradeItemComponentsType" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{urn:gs1:shared:shared_common:xsd:3}ExtensionType" minOccurs="0"/&gt;
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
@XmlType(name = "TradeItemInformationType", propOrder = {
    "consumerProductVariantDescription",
    "consumerProductVariantStartEffectiveDateTime",
    "consumerProductVariantCancelledDateTime",
    "consumerProductVariantDiscontinuedDateTime",
    "consumerProductVariantEndEffectiveDateTime",
    "consumerProductVariantIdentification",
    "consumerProductVariantReasonCode",
    "tradeItemComponents",
    "extension",
    "avpList"
})
public class TradeItemInformationType {

    protected List<Description70Type> consumerProductVariantDescription;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime consumerProductVariantStartEffectiveDateTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime consumerProductVariantCancelledDateTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime consumerProductVariantDiscontinuedDateTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime consumerProductVariantEndEffectiveDateTime;
    protected String consumerProductVariantIdentification;
    protected List<ReasonForCPVCodeType> consumerProductVariantReasonCode;
    protected TradeItemComponentsType tradeItemComponents;
    protected ExtensionType extension;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the consumerProductVariantDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerProductVariantDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerProductVariantDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getConsumerProductVariantDescription() {
        if (consumerProductVariantDescription == null) {
            consumerProductVariantDescription = new ArrayList<Description70Type>();
        }
        return this.consumerProductVariantDescription;
    }

    /**
     * Gets the value of the consumerProductVariantStartEffectiveDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getConsumerProductVariantStartEffectiveDateTime() {
        return consumerProductVariantStartEffectiveDateTime;
    }

    /**
     * Sets the value of the consumerProductVariantStartEffectiveDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerProductVariantStartEffectiveDateTime(LocalDateTime value) {
        this.consumerProductVariantStartEffectiveDateTime = value;
    }

    /**
     * Gets the value of the consumerProductVariantCancelledDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getConsumerProductVariantCancelledDateTime() {
        return consumerProductVariantCancelledDateTime;
    }

    /**
     * Sets the value of the consumerProductVariantCancelledDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerProductVariantCancelledDateTime(LocalDateTime value) {
        this.consumerProductVariantCancelledDateTime = value;
    }

    /**
     * Gets the value of the consumerProductVariantDiscontinuedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getConsumerProductVariantDiscontinuedDateTime() {
        return consumerProductVariantDiscontinuedDateTime;
    }

    /**
     * Sets the value of the consumerProductVariantDiscontinuedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerProductVariantDiscontinuedDateTime(LocalDateTime value) {
        this.consumerProductVariantDiscontinuedDateTime = value;
    }

    /**
     * Gets the value of the consumerProductVariantEndEffectiveDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getConsumerProductVariantEndEffectiveDateTime() {
        return consumerProductVariantEndEffectiveDateTime;
    }

    /**
     * Sets the value of the consumerProductVariantEndEffectiveDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerProductVariantEndEffectiveDateTime(LocalDateTime value) {
        this.consumerProductVariantEndEffectiveDateTime = value;
    }

    /**
     * Gets the value of the consumerProductVariantIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerProductVariantIdentification() {
        return consumerProductVariantIdentification;
    }

    /**
     * Sets the value of the consumerProductVariantIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerProductVariantIdentification(String value) {
        this.consumerProductVariantIdentification = value;
    }

    /**
     * Gets the value of the consumerProductVariantReasonCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerProductVariantReasonCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerProductVariantReasonCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReasonForCPVCodeType }
     * 
     * 
     */
    public List<ReasonForCPVCodeType> getConsumerProductVariantReasonCode() {
        if (consumerProductVariantReasonCode == null) {
            consumerProductVariantReasonCode = new ArrayList<ReasonForCPVCodeType>();
        }
        return this.consumerProductVariantReasonCode;
    }

    /**
     * Gets the value of the tradeItemComponents property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemComponentsType }
     *     
     */
    public TradeItemComponentsType getTradeItemComponents() {
        return tradeItemComponents;
    }

    /**
     * Sets the value of the tradeItemComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemComponentsType }
     *     
     */
    public void setTradeItemComponents(TradeItemComponentsType value) {
        this.tradeItemComponents = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setExtension(ExtensionType value) {
        this.extension = value;
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
