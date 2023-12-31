
package gs1.gdsn.marketing_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import gs1.gdsn.gdsn_common.xsd._3.FormattedDescription250Type;
import gs1.gdsn.gdsn_common.xsd._3.FormattedDescription4000Type;
import gs1.gdsn.gdsn_common.xsd._3.FormattedDescription5000Type;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.CodeType;
import gs1.shared.shared_common.xsd._3.Description1000Type;
import gs1.shared.shared_common.xsd._3.Description200Type;
import gs1.shared.shared_common.xsd._3.Description500Type;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;
import gs1.shared.shared_common.xsd._3.TargetMarketType;


/**
 * <p>Java class for MarketingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketingInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="builtInProductType" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="couponFamilyCode" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gradeCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="specialItemCode" type="{urn:gs1:gdsn:marketing_information:xsd:3}SpecialItemCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemFeatureBenefit" type="{urn:gs1:gdsn:gdsn_common:xsd:3}FormattedDescription250Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemFeatureCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemIncludedAccessories" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemMarketingMessage" type="{urn:gs1:gdsn:gdsn_common:xsd:3}FormattedDescription4000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="designer" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="educationalFocusDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="targetOccasionOrTheme" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isImitationOrSubstitute" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="necessaryTradeItemToUseDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shortTradeItemMarketingMessage" type="{urn:gs1:gdsn:gdsn_common:xsd:3}FormattedDescription250Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemKeyWords" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemTechnologyDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="autographedBy" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isTradeItemConsideredCollectibleOrMemorabilia" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemIntroductionYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *         &lt;element name="usageColourDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="brandMarketingDescription" type="{urn:gs1:gdsn:gdsn_common:xsd:3}FormattedDescription5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tastingNotes" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemStory" type="{urn:gs1:gdsn:gdsn_common:xsd:3}FormattedDescription5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="imitationOrSubstituteFor" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="channelSpecificMarketingInformation" type="{urn:gs1:gdsn:marketing_information:xsd:3}ChannelSpecificMarketingInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="illegalToAdvertiseTargetMarket" type="{urn:gs1:shared:shared_common:xsd:3}TargetMarketType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="marketingCampaign" type="{urn:gs1:gdsn:marketing_information:xsd:3}MarketingCampaignType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="season" type="{urn:gs1:gdsn:marketing_information:xsd:3}SeasonType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="targetConsumer" type="{urn:gs1:gdsn:marketing_information:xsd:3}TargetConsumerType" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemCaseInformation" type="{urn:gs1:gdsn:marketing_information:xsd:3}TradeItemCaseInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="basicTasteInformation" type="{urn:gs1:gdsn:marketing_information:xsd:3}BasicTasteInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "MarketingInformationType", propOrder = {
    "builtInProductType",
    "couponFamilyCode",
    "gradeCodeReference",
    "specialItemCode",
    "tradeItemFeatureBenefit",
    "tradeItemFeatureCodeReference",
    "tradeItemIncludedAccessories",
    "tradeItemMarketingMessage",
    "designer",
    "educationalFocusDescription",
    "targetOccasionOrTheme",
    "isImitationOrSubstitute",
    "necessaryTradeItemToUseDescription",
    "shortTradeItemMarketingMessage",
    "tradeItemKeyWords",
    "tradeItemTechnologyDescription",
    "autographedBy",
    "isTradeItemConsideredCollectibleOrMemorabilia",
    "tradeItemIntroductionYear",
    "usageColourDescription",
    "brandMarketingDescription",
    "tastingNotes",
    "tradeItemStory",
    "imitationOrSubstituteFor",
    "channelSpecificMarketingInformation",
    "illegalToAdvertiseTargetMarket",
    "marketingCampaign",
    "season",
    "targetConsumer",
    "tradeItemCaseInformation",
    "basicTasteInformation",
    "avpList"
})
public class MarketingInformationType {

    protected List<String> builtInProductType;
    protected List<String> couponFamilyCode;
    protected List<CodeType> gradeCodeReference;
    protected List<SpecialItemCodeType> specialItemCode;
    protected List<FormattedDescription250Type> tradeItemFeatureBenefit;
    protected List<CodeType> tradeItemFeatureCodeReference;
    protected List<Description1000Type> tradeItemIncludedAccessories;
    protected List<FormattedDescription4000Type> tradeItemMarketingMessage;
    protected List<Description200Type> designer;
    protected List<Description1000Type> educationalFocusDescription;
    protected List<Description500Type> targetOccasionOrTheme;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isImitationOrSubstitute;
    protected List<Description500Type> necessaryTradeItemToUseDescription;
    protected List<FormattedDescription250Type> shortTradeItemMarketingMessage;
    protected List<Description1000Type> tradeItemKeyWords;
    protected List<Description1000Type> tradeItemTechnologyDescription;
    protected List<String> autographedBy;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isTradeItemConsideredCollectibleOrMemorabilia;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar tradeItemIntroductionYear;
    protected List<Description500Type> usageColourDescription;
    protected List<FormattedDescription5000Type> brandMarketingDescription;
    protected List<Description500Type> tastingNotes;
    protected List<FormattedDescription5000Type> tradeItemStory;
    protected List<Description500Type> imitationOrSubstituteFor;
    protected List<ChannelSpecificMarketingInformationType> channelSpecificMarketingInformation;
    protected List<TargetMarketType> illegalToAdvertiseTargetMarket;
    protected List<MarketingCampaignType> marketingCampaign;
    protected List<SeasonType> season;
    protected TargetConsumerType targetConsumer;
    protected List<TradeItemCaseInformationType> tradeItemCaseInformation;
    protected List<BasicTasteInformationType> basicTasteInformation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the builtInProductType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the builtInProductType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuiltInProductType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBuiltInProductType() {
        if (builtInProductType == null) {
            builtInProductType = new ArrayList<String>();
        }
        return this.builtInProductType;
    }

    /**
     * Gets the value of the couponFamilyCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the couponFamilyCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCouponFamilyCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCouponFamilyCode() {
        if (couponFamilyCode == null) {
            couponFamilyCode = new ArrayList<String>();
        }
        return this.couponFamilyCode;
    }

    /**
     * Gets the value of the gradeCodeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gradeCodeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGradeCodeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getGradeCodeReference() {
        if (gradeCodeReference == null) {
            gradeCodeReference = new ArrayList<CodeType>();
        }
        return this.gradeCodeReference;
    }

    /**
     * Gets the value of the specialItemCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialItemCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialItemCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialItemCodeType }
     * 
     * 
     */
    public List<SpecialItemCodeType> getSpecialItemCode() {
        if (specialItemCode == null) {
            specialItemCode = new ArrayList<SpecialItemCodeType>();
        }
        return this.specialItemCode;
    }

    /**
     * Gets the value of the tradeItemFeatureBenefit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemFeatureBenefit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemFeatureBenefit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormattedDescription250Type }
     * 
     * 
     */
    public List<FormattedDescription250Type> getTradeItemFeatureBenefit() {
        if (tradeItemFeatureBenefit == null) {
            tradeItemFeatureBenefit = new ArrayList<FormattedDescription250Type>();
        }
        return this.tradeItemFeatureBenefit;
    }

    /**
     * Gets the value of the tradeItemFeatureCodeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemFeatureCodeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemFeatureCodeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getTradeItemFeatureCodeReference() {
        if (tradeItemFeatureCodeReference == null) {
            tradeItemFeatureCodeReference = new ArrayList<CodeType>();
        }
        return this.tradeItemFeatureCodeReference;
    }

    /**
     * Gets the value of the tradeItemIncludedAccessories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemIncludedAccessories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemIncludedAccessories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getTradeItemIncludedAccessories() {
        if (tradeItemIncludedAccessories == null) {
            tradeItemIncludedAccessories = new ArrayList<Description1000Type>();
        }
        return this.tradeItemIncludedAccessories;
    }

    /**
     * Gets the value of the tradeItemMarketingMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemMarketingMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemMarketingMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormattedDescription4000Type }
     * 
     * 
     */
    public List<FormattedDescription4000Type> getTradeItemMarketingMessage() {
        if (tradeItemMarketingMessage == null) {
            tradeItemMarketingMessage = new ArrayList<FormattedDescription4000Type>();
        }
        return this.tradeItemMarketingMessage;
    }

    /**
     * Gets the value of the designer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the designer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesigner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description200Type }
     * 
     * 
     */
    public List<Description200Type> getDesigner() {
        if (designer == null) {
            designer = new ArrayList<Description200Type>();
        }
        return this.designer;
    }

    /**
     * Gets the value of the educationalFocusDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the educationalFocusDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEducationalFocusDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getEducationalFocusDescription() {
        if (educationalFocusDescription == null) {
            educationalFocusDescription = new ArrayList<Description1000Type>();
        }
        return this.educationalFocusDescription;
    }

    /**
     * Gets the value of the targetOccasionOrTheme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetOccasionOrTheme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetOccasionOrTheme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getTargetOccasionOrTheme() {
        if (targetOccasionOrTheme == null) {
            targetOccasionOrTheme = new ArrayList<Description500Type>();
        }
        return this.targetOccasionOrTheme;
    }

    /**
     * Gets the value of the isImitationOrSubstitute property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsImitationOrSubstitute() {
        return isImitationOrSubstitute;
    }

    /**
     * Sets the value of the isImitationOrSubstitute property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsImitationOrSubstitute(NonBinaryLogicEnumerationType value) {
        this.isImitationOrSubstitute = value;
    }

    /**
     * Gets the value of the necessaryTradeItemToUseDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the necessaryTradeItemToUseDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNecessaryTradeItemToUseDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getNecessaryTradeItemToUseDescription() {
        if (necessaryTradeItemToUseDescription == null) {
            necessaryTradeItemToUseDescription = new ArrayList<Description500Type>();
        }
        return this.necessaryTradeItemToUseDescription;
    }

    /**
     * Gets the value of the shortTradeItemMarketingMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shortTradeItemMarketingMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShortTradeItemMarketingMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormattedDescription250Type }
     * 
     * 
     */
    public List<FormattedDescription250Type> getShortTradeItemMarketingMessage() {
        if (shortTradeItemMarketingMessage == null) {
            shortTradeItemMarketingMessage = new ArrayList<FormattedDescription250Type>();
        }
        return this.shortTradeItemMarketingMessage;
    }

    /**
     * Gets the value of the tradeItemKeyWords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemKeyWords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemKeyWords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getTradeItemKeyWords() {
        if (tradeItemKeyWords == null) {
            tradeItemKeyWords = new ArrayList<Description1000Type>();
        }
        return this.tradeItemKeyWords;
    }

    /**
     * Gets the value of the tradeItemTechnologyDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemTechnologyDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemTechnologyDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getTradeItemTechnologyDescription() {
        if (tradeItemTechnologyDescription == null) {
            tradeItemTechnologyDescription = new ArrayList<Description1000Type>();
        }
        return this.tradeItemTechnologyDescription;
    }

    /**
     * Gets the value of the autographedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autographedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutographedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAutographedBy() {
        if (autographedBy == null) {
            autographedBy = new ArrayList<String>();
        }
        return this.autographedBy;
    }

    /**
     * Gets the value of the isTradeItemConsideredCollectibleOrMemorabilia property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsTradeItemConsideredCollectibleOrMemorabilia() {
        return isTradeItemConsideredCollectibleOrMemorabilia;
    }

    /**
     * Sets the value of the isTradeItemConsideredCollectibleOrMemorabilia property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsTradeItemConsideredCollectibleOrMemorabilia(NonBinaryLogicEnumerationType value) {
        this.isTradeItemConsideredCollectibleOrMemorabilia = value;
    }

    /**
     * Gets the value of the tradeItemIntroductionYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradeItemIntroductionYear() {
        return tradeItemIntroductionYear;
    }

    /**
     * Sets the value of the tradeItemIntroductionYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTradeItemIntroductionYear(XMLGregorianCalendar value) {
        this.tradeItemIntroductionYear = value;
    }

    /**
     * Gets the value of the usageColourDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageColourDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageColourDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getUsageColourDescription() {
        if (usageColourDescription == null) {
            usageColourDescription = new ArrayList<Description500Type>();
        }
        return this.usageColourDescription;
    }

    /**
     * Gets the value of the brandMarketingDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brandMarketingDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrandMarketingDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormattedDescription5000Type }
     * 
     * 
     */
    public List<FormattedDescription5000Type> getBrandMarketingDescription() {
        if (brandMarketingDescription == null) {
            brandMarketingDescription = new ArrayList<FormattedDescription5000Type>();
        }
        return this.brandMarketingDescription;
    }

    /**
     * Gets the value of the tastingNotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tastingNotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTastingNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getTastingNotes() {
        if (tastingNotes == null) {
            tastingNotes = new ArrayList<Description500Type>();
        }
        return this.tastingNotes;
    }

    /**
     * Gets the value of the tradeItemStory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemStory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemStory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormattedDescription5000Type }
     * 
     * 
     */
    public List<FormattedDescription5000Type> getTradeItemStory() {
        if (tradeItemStory == null) {
            tradeItemStory = new ArrayList<FormattedDescription5000Type>();
        }
        return this.tradeItemStory;
    }

    /**
     * Gets the value of the imitationOrSubstituteFor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imitationOrSubstituteFor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImitationOrSubstituteFor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getImitationOrSubstituteFor() {
        if (imitationOrSubstituteFor == null) {
            imitationOrSubstituteFor = new ArrayList<Description500Type>();
        }
        return this.imitationOrSubstituteFor;
    }

    /**
     * Gets the value of the channelSpecificMarketingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelSpecificMarketingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelSpecificMarketingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChannelSpecificMarketingInformationType }
     * 
     * 
     */
    public List<ChannelSpecificMarketingInformationType> getChannelSpecificMarketingInformation() {
        if (channelSpecificMarketingInformation == null) {
            channelSpecificMarketingInformation = new ArrayList<ChannelSpecificMarketingInformationType>();
        }
        return this.channelSpecificMarketingInformation;
    }

    /**
     * Gets the value of the illegalToAdvertiseTargetMarket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the illegalToAdvertiseTargetMarket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIllegalToAdvertiseTargetMarket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetMarketType }
     * 
     * 
     */
    public List<TargetMarketType> getIllegalToAdvertiseTargetMarket() {
        if (illegalToAdvertiseTargetMarket == null) {
            illegalToAdvertiseTargetMarket = new ArrayList<TargetMarketType>();
        }
        return this.illegalToAdvertiseTargetMarket;
    }

    /**
     * Gets the value of the marketingCampaign property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketingCampaign property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketingCampaign().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketingCampaignType }
     * 
     * 
     */
    public List<MarketingCampaignType> getMarketingCampaign() {
        if (marketingCampaign == null) {
            marketingCampaign = new ArrayList<MarketingCampaignType>();
        }
        return this.marketingCampaign;
    }

    /**
     * Gets the value of the season property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the season property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeasonType }
     * 
     * 
     */
    public List<SeasonType> getSeason() {
        if (season == null) {
            season = new ArrayList<SeasonType>();
        }
        return this.season;
    }

    /**
     * Gets the value of the targetConsumer property.
     * 
     * @return
     *     possible object is
     *     {@link TargetConsumerType }
     *     
     */
    public TargetConsumerType getTargetConsumer() {
        return targetConsumer;
    }

    /**
     * Sets the value of the targetConsumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetConsumerType }
     *     
     */
    public void setTargetConsumer(TargetConsumerType value) {
        this.targetConsumer = value;
    }

    /**
     * Gets the value of the tradeItemCaseInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemCaseInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemCaseInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeItemCaseInformationType }
     * 
     * 
     */
    public List<TradeItemCaseInformationType> getTradeItemCaseInformation() {
        if (tradeItemCaseInformation == null) {
            tradeItemCaseInformation = new ArrayList<TradeItemCaseInformationType>();
        }
        return this.tradeItemCaseInformation;
    }

    /**
     * Gets the value of the basicTasteInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basicTasteInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasicTasteInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicTasteInformationType }
     * 
     * 
     */
    public List<BasicTasteInformationType> getBasicTasteInformation() {
        if (basicTasteInformation == null) {
            basicTasteInformation = new ArrayList<BasicTasteInformationType>();
        }
        return this.basicTasteInformation;
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
