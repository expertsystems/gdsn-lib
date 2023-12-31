
package gs1.gdsn.trade_item_description.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.FormattedDescription500Type;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.gdsn.gdsn_common.xsd._3.LanguageOptionalDescription500Type;
import gs1.shared.shared_common.xsd._3.CodeType;
import gs1.shared.shared_common.xsd._3.ColourType;
import gs1.shared.shared_common.xsd._3.Description2000Type;
import gs1.shared.shared_common.xsd._3.Description200Type;
import gs1.shared.shared_common.xsd._3.Description35Type;
import gs1.shared.shared_common.xsd._3.Description500Type;


/**
 * <p>Java class for TradeItemDescriptionInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemDescriptionInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalTradeItemDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description2000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="descriptionShort" type="{urn:gs1:shared:shared_common:xsd:3}Description35Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="functionalName" type="{urn:gs1:shared:shared_common:xsd:3}Description35Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="invoiceName" type="{urn:gs1:shared:shared_common:xsd:3}Description35Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="labelDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productRange" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="regulatedProductName" type="{urn:gs1:gdsn:gdsn_common:xsd:3}FormattedDescription500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemFormDescription" type="{urn:gs1:gdsn:gdsn_common:xsd:3}LanguageOptionalDescription500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemGroupIdentificationCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="variantDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemDesignedToBeDivisible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemFormCode" type="{urn:gs1:gdsn:trade_item_description:xsd:3}TradeItemFormCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="opacityTypeCode" type="{urn:gs1:gdsn:trade_item_description:xsd:3}OpacityTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="brandNameInformation" type="{urn:gs1:gdsn:trade_item_description:xsd:3}BrandNameInformationType" minOccurs="0"/&gt;
 *         &lt;element name="colour" type="{urn:gs1:shared:shared_common:xsd:3}ColourType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemEcontent" type="{urn:gs1:gdsn:trade_item_description:xsd:3}TradeItemEcontentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemVariant" type="{urn:gs1:gdsn:trade_item_description:xsd:3}TradeItemVariantType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TradeItemDescriptionInformationType", propOrder = {
    "additionalTradeItemDescription",
    "descriptionShort",
    "functionalName",
    "invoiceName",
    "labelDescription",
    "productRange",
    "regulatedProductName",
    "tradeItemDescription",
    "tradeItemFormDescription",
    "tradeItemGroupIdentificationCodeReference",
    "variantDescription",
    "isTradeItemDesignedToBeDivisible",
    "tradeItemFormCode",
    "opacityTypeCode",
    "brandNameInformation",
    "colour",
    "tradeItemEcontent",
    "tradeItemVariant",
    "avpList"
})
public class TradeItemDescriptionInformationType {

    protected List<Description2000Type> additionalTradeItemDescription;
    protected List<Description35Type> descriptionShort;
    protected List<Description35Type> functionalName;
    protected List<Description35Type> invoiceName;
    protected List<Description500Type> labelDescription;
    protected String productRange;
    protected List<FormattedDescription500Type> regulatedProductName;
    protected List<Description200Type> tradeItemDescription;
    protected List<LanguageOptionalDescription500Type> tradeItemFormDescription;
    protected List<CodeType> tradeItemGroupIdentificationCodeReference;
    protected List<Description500Type> variantDescription;
    protected Boolean isTradeItemDesignedToBeDivisible;
    protected List<TradeItemFormCodeType> tradeItemFormCode;
    protected OpacityTypeCodeType opacityTypeCode;
    protected BrandNameInformationType brandNameInformation;
    protected List<ColourType> colour;
    protected List<TradeItemEcontentType> tradeItemEcontent;
    protected List<TradeItemVariantType> tradeItemVariant;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the additionalTradeItemDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalTradeItemDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalTradeItemDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description2000Type }
     * 
     * 
     */
    public List<Description2000Type> getAdditionalTradeItemDescription() {
        if (additionalTradeItemDescription == null) {
            additionalTradeItemDescription = new ArrayList<Description2000Type>();
        }
        return this.additionalTradeItemDescription;
    }

    /**
     * Gets the value of the descriptionShort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionShort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionShort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description35Type }
     * 
     * 
     */
    public List<Description35Type> getDescriptionShort() {
        if (descriptionShort == null) {
            descriptionShort = new ArrayList<Description35Type>();
        }
        return this.descriptionShort;
    }

    /**
     * Gets the value of the functionalName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the functionalName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunctionalName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description35Type }
     * 
     * 
     */
    public List<Description35Type> getFunctionalName() {
        if (functionalName == null) {
            functionalName = new ArrayList<Description35Type>();
        }
        return this.functionalName;
    }

    /**
     * Gets the value of the invoiceName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description35Type }
     * 
     * 
     */
    public List<Description35Type> getInvoiceName() {
        if (invoiceName == null) {
            invoiceName = new ArrayList<Description35Type>();
        }
        return this.invoiceName;
    }

    /**
     * Gets the value of the labelDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labelDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabelDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getLabelDescription() {
        if (labelDescription == null) {
            labelDescription = new ArrayList<Description500Type>();
        }
        return this.labelDescription;
    }

    /**
     * Gets the value of the productRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductRange() {
        return productRange;
    }

    /**
     * Sets the value of the productRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductRange(String value) {
        this.productRange = value;
    }

    /**
     * Gets the value of the regulatedProductName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regulatedProductName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegulatedProductName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormattedDescription500Type }
     * 
     * 
     */
    public List<FormattedDescription500Type> getRegulatedProductName() {
        if (regulatedProductName == null) {
            regulatedProductName = new ArrayList<FormattedDescription500Type>();
        }
        return this.regulatedProductName;
    }

    /**
     * Gets the value of the tradeItemDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description200Type }
     * 
     * 
     */
    public List<Description200Type> getTradeItemDescription() {
        if (tradeItemDescription == null) {
            tradeItemDescription = new ArrayList<Description200Type>();
        }
        return this.tradeItemDescription;
    }

    /**
     * Gets the value of the tradeItemFormDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemFormDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemFormDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageOptionalDescription500Type }
     * 
     * 
     */
    public List<LanguageOptionalDescription500Type> getTradeItemFormDescription() {
        if (tradeItemFormDescription == null) {
            tradeItemFormDescription = new ArrayList<LanguageOptionalDescription500Type>();
        }
        return this.tradeItemFormDescription;
    }

    /**
     * Gets the value of the tradeItemGroupIdentificationCodeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemGroupIdentificationCodeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemGroupIdentificationCodeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getTradeItemGroupIdentificationCodeReference() {
        if (tradeItemGroupIdentificationCodeReference == null) {
            tradeItemGroupIdentificationCodeReference = new ArrayList<CodeType>();
        }
        return this.tradeItemGroupIdentificationCodeReference;
    }

    /**
     * Gets the value of the variantDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variantDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariantDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getVariantDescription() {
        if (variantDescription == null) {
            variantDescription = new ArrayList<Description500Type>();
        }
        return this.variantDescription;
    }

    /**
     * Gets the value of the isTradeItemDesignedToBeDivisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTradeItemDesignedToBeDivisible() {
        return isTradeItemDesignedToBeDivisible;
    }

    /**
     * Sets the value of the isTradeItemDesignedToBeDivisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTradeItemDesignedToBeDivisible(Boolean value) {
        this.isTradeItemDesignedToBeDivisible = value;
    }

    /**
     * Gets the value of the tradeItemFormCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemFormCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemFormCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeItemFormCodeType }
     * 
     * 
     */
    public List<TradeItemFormCodeType> getTradeItemFormCode() {
        if (tradeItemFormCode == null) {
            tradeItemFormCode = new ArrayList<TradeItemFormCodeType>();
        }
        return this.tradeItemFormCode;
    }

    /**
     * Gets the value of the opacityTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link OpacityTypeCodeType }
     *     
     */
    public OpacityTypeCodeType getOpacityTypeCode() {
        return opacityTypeCode;
    }

    /**
     * Sets the value of the opacityTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpacityTypeCodeType }
     *     
     */
    public void setOpacityTypeCode(OpacityTypeCodeType value) {
        this.opacityTypeCode = value;
    }

    /**
     * Gets the value of the brandNameInformation property.
     * 
     * @return
     *     possible object is
     *     {@link BrandNameInformationType }
     *     
     */
    public BrandNameInformationType getBrandNameInformation() {
        return brandNameInformation;
    }

    /**
     * Sets the value of the brandNameInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandNameInformationType }
     *     
     */
    public void setBrandNameInformation(BrandNameInformationType value) {
        this.brandNameInformation = value;
    }

    /**
     * Gets the value of the colour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColourType }
     * 
     * 
     */
    public List<ColourType> getColour() {
        if (colour == null) {
            colour = new ArrayList<ColourType>();
        }
        return this.colour;
    }

    /**
     * Gets the value of the tradeItemEcontent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemEcontent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemEcontent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeItemEcontentType }
     * 
     * 
     */
    public List<TradeItemEcontentType> getTradeItemEcontent() {
        if (tradeItemEcontent == null) {
            tradeItemEcontent = new ArrayList<TradeItemEcontentType>();
        }
        return this.tradeItemEcontent;
    }

    /**
     * Gets the value of the tradeItemVariant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemVariant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemVariant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeItemVariantType }
     * 
     * 
     */
    public List<TradeItemVariantType> getTradeItemVariant() {
        if (tradeItemVariant == null) {
            tradeItemVariant = new ArrayList<TradeItemVariantType>();
        }
        return this.tradeItemVariant;
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
