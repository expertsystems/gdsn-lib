
package gs1.gdsn.trade_item.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.gdsn.gdsn_common.xsd._3.TradeItemContextCodeType;
import gs1.shared.shared_common.xsd._3.Description1000Type;
import gs1.shared.shared_common.xsd._3.ExtensionType;
import gs1.shared.shared_common.xsd._3.IdentifierType;


/**
 * <p>Java class for ComponentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="componentNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="componentDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="componentIdentification" type="{urn:gs1:shared:shared_common:xsd:3}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="contextIdentification" type="{urn:gs1:gdsn:gdsn_common:xsd:3}TradeItemContextCodeType" minOccurs="0"/&gt;
 *         &lt;element name="gpcCategoryCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{8}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="componentMultiplePackedQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="componentQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{urn:gs1:shared:shared_common:xsd:3}ExtensionType" minOccurs="0"/&gt;
 *         &lt;element name="gDSNTradeItemClassificationAttribute" type="{urn:gs1:gdsn:trade_item:xsd:3}GDSNTradeItemClassificationAttributeType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ComponentInformationType", propOrder = {
    "componentNumber",
    "componentDescription",
    "componentIdentification",
    "contextIdentification",
    "gpcCategoryCode",
    "componentMultiplePackedQuantity",
    "componentQuantity",
    "extension",
    "gdsnTradeItemClassificationAttribute",
    "avpList"
})
public class ComponentInformationType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger componentNumber;
    protected List<Description1000Type> componentDescription;
    protected IdentifierType componentIdentification;
    protected TradeItemContextCodeType contextIdentification;
    protected String gpcCategoryCode;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger componentMultiplePackedQuantity;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger componentQuantity;
    protected ExtensionType extension;
    @XmlElement(name = "gDSNTradeItemClassificationAttribute")
    protected List<GDSNTradeItemClassificationAttributeType> gdsnTradeItemClassificationAttribute;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the componentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getComponentNumber() {
        return componentNumber;
    }

    /**
     * Sets the value of the componentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setComponentNumber(BigInteger value) {
        this.componentNumber = value;
    }

    /**
     * Gets the value of the componentDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getComponentDescription() {
        if (componentDescription == null) {
            componentDescription = new ArrayList<Description1000Type>();
        }
        return this.componentDescription;
    }

    /**
     * Gets the value of the componentIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getComponentIdentification() {
        return componentIdentification;
    }

    /**
     * Sets the value of the componentIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setComponentIdentification(IdentifierType value) {
        this.componentIdentification = value;
    }

    /**
     * Gets the value of the contextIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemContextCodeType }
     *     
     */
    public TradeItemContextCodeType getContextIdentification() {
        return contextIdentification;
    }

    /**
     * Sets the value of the contextIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemContextCodeType }
     *     
     */
    public void setContextIdentification(TradeItemContextCodeType value) {
        this.contextIdentification = value;
    }

    /**
     * Gets the value of the gpcCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpcCategoryCode() {
        return gpcCategoryCode;
    }

    /**
     * Sets the value of the gpcCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpcCategoryCode(String value) {
        this.gpcCategoryCode = value;
    }

    /**
     * Gets the value of the componentMultiplePackedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getComponentMultiplePackedQuantity() {
        return componentMultiplePackedQuantity;
    }

    /**
     * Sets the value of the componentMultiplePackedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setComponentMultiplePackedQuantity(BigInteger value) {
        this.componentMultiplePackedQuantity = value;
    }

    /**
     * Gets the value of the componentQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getComponentQuantity() {
        return componentQuantity;
    }

    /**
     * Sets the value of the componentQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setComponentQuantity(BigInteger value) {
        this.componentQuantity = value;
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
     * Gets the value of the gdsnTradeItemClassificationAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gdsnTradeItemClassificationAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGDSNTradeItemClassificationAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GDSNTradeItemClassificationAttributeType }
     * 
     * 
     */
    public List<GDSNTradeItemClassificationAttributeType> getGDSNTradeItemClassificationAttribute() {
        if (gdsnTradeItemClassificationAttribute == null) {
            gdsnTradeItemClassificationAttribute = new ArrayList<GDSNTradeItemClassificationAttributeType>();
        }
        return this.gdsnTradeItemClassificationAttribute;
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
