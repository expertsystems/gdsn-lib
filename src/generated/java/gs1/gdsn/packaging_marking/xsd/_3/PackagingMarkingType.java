
package gs1.gdsn.packaging_marking.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.Description5000Type;
import gs1.shared.shared_common.xsd._3.Description500Type;
import gs1.shared.shared_common.xsd._3.LanguageCodeType;


/**
 * <p>Java class for PackagingMarkingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingMarkingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consumerPackageDisclaimer" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hasBatchNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isNetContentDeclarationIndicated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isPackagingMarkedReturnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isPriceOnPack" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemMarkedAsRecyclable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="offerOnPack" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="packagingMarkedLabelAccreditationCode" type="{urn:gs1:gdsn:packaging_marking:xsd:3}PackagingMarkedLabelAccreditationCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingMarkedLanguageCode" type="{urn:gs1:shared:shared_common:xsd:3}LanguageCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingMarkedRecyclableScheme" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="serialNumberLocationCode" type="{urn:gs1:gdsn:packaging_marking:xsd:3}SerialNumberLocationCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="warningCopyDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="localPackagingMarkedLabelAccreditationCodeReference" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tradeItemMarkingsDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="consumerWarningInformation" type="{urn:gs1:gdsn:packaging_marking:xsd:3}ConsumerWarningInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemIdentificationMarking" type="{urn:gs1:gdsn:packaging_marking:xsd:3}TradeItemIdentificationMarkingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingDate" type="{urn:gs1:gdsn:packaging_marking:xsd:3}PackagingDateType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PackagingMarkingType", propOrder = {
    "consumerPackageDisclaimer",
    "hasBatchNumber",
    "isNetContentDeclarationIndicated",
    "isPackagingMarkedReturnable",
    "isPriceOnPack",
    "isTradeItemMarkedAsRecyclable",
    "offerOnPack",
    "packagingMarkedLabelAccreditationCode",
    "packagingMarkedLanguageCode",
    "packagingMarkedRecyclableScheme",
    "serialNumberLocationCode",
    "warningCopyDescription",
    "localPackagingMarkedLabelAccreditationCodeReference",
    "tradeItemMarkingsDescription",
    "consumerWarningInformation",
    "tradeItemIdentificationMarking",
    "packagingDate",
    "avpList"
})
public class PackagingMarkingType {

    protected List<Description5000Type> consumerPackageDisclaimer;
    protected Boolean hasBatchNumber;
    protected Boolean isNetContentDeclarationIndicated;
    protected Boolean isPackagingMarkedReturnable;
    protected Boolean isPriceOnPack;
    protected Boolean isTradeItemMarkedAsRecyclable;
    protected String offerOnPack;
    protected List<PackagingMarkedLabelAccreditationCodeType> packagingMarkedLabelAccreditationCode;
    protected List<LanguageCodeType> packagingMarkedLanguageCode;
    protected List<String> packagingMarkedRecyclableScheme;
    protected List<SerialNumberLocationCodeType> serialNumberLocationCode;
    protected List<Description5000Type> warningCopyDescription;
    protected List<String> localPackagingMarkedLabelAccreditationCodeReference;
    protected List<Description500Type> tradeItemMarkingsDescription;
    protected List<ConsumerWarningInformationType> consumerWarningInformation;
    protected List<TradeItemIdentificationMarkingType> tradeItemIdentificationMarking;
    protected List<PackagingDateType> packagingDate;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the consumerPackageDisclaimer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerPackageDisclaimer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerPackageDisclaimer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getConsumerPackageDisclaimer() {
        if (consumerPackageDisclaimer == null) {
            consumerPackageDisclaimer = new ArrayList<Description5000Type>();
        }
        return this.consumerPackageDisclaimer;
    }

    /**
     * Gets the value of the hasBatchNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBatchNumber() {
        return hasBatchNumber;
    }

    /**
     * Sets the value of the hasBatchNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBatchNumber(Boolean value) {
        this.hasBatchNumber = value;
    }

    /**
     * Gets the value of the isNetContentDeclarationIndicated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNetContentDeclarationIndicated() {
        return isNetContentDeclarationIndicated;
    }

    /**
     * Sets the value of the isNetContentDeclarationIndicated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNetContentDeclarationIndicated(Boolean value) {
        this.isNetContentDeclarationIndicated = value;
    }

    /**
     * Gets the value of the isPackagingMarkedReturnable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPackagingMarkedReturnable() {
        return isPackagingMarkedReturnable;
    }

    /**
     * Sets the value of the isPackagingMarkedReturnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPackagingMarkedReturnable(Boolean value) {
        this.isPackagingMarkedReturnable = value;
    }

    /**
     * Gets the value of the isPriceOnPack property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPriceOnPack() {
        return isPriceOnPack;
    }

    /**
     * Sets the value of the isPriceOnPack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPriceOnPack(Boolean value) {
        this.isPriceOnPack = value;
    }

    /**
     * Gets the value of the isTradeItemMarkedAsRecyclable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTradeItemMarkedAsRecyclable() {
        return isTradeItemMarkedAsRecyclable;
    }

    /**
     * Sets the value of the isTradeItemMarkedAsRecyclable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTradeItemMarkedAsRecyclable(Boolean value) {
        this.isTradeItemMarkedAsRecyclable = value;
    }

    /**
     * Gets the value of the offerOnPack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferOnPack() {
        return offerOnPack;
    }

    /**
     * Sets the value of the offerOnPack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferOnPack(String value) {
        this.offerOnPack = value;
    }

    /**
     * Gets the value of the packagingMarkedLabelAccreditationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingMarkedLabelAccreditationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingMarkedLabelAccreditationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingMarkedLabelAccreditationCodeType }
     * 
     * 
     */
    public List<PackagingMarkedLabelAccreditationCodeType> getPackagingMarkedLabelAccreditationCode() {
        if (packagingMarkedLabelAccreditationCode == null) {
            packagingMarkedLabelAccreditationCode = new ArrayList<PackagingMarkedLabelAccreditationCodeType>();
        }
        return this.packagingMarkedLabelAccreditationCode;
    }

    /**
     * Gets the value of the packagingMarkedLanguageCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingMarkedLanguageCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingMarkedLanguageCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageCodeType }
     * 
     * 
     */
    public List<LanguageCodeType> getPackagingMarkedLanguageCode() {
        if (packagingMarkedLanguageCode == null) {
            packagingMarkedLanguageCode = new ArrayList<LanguageCodeType>();
        }
        return this.packagingMarkedLanguageCode;
    }

    /**
     * Gets the value of the packagingMarkedRecyclableScheme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingMarkedRecyclableScheme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingMarkedRecyclableScheme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPackagingMarkedRecyclableScheme() {
        if (packagingMarkedRecyclableScheme == null) {
            packagingMarkedRecyclableScheme = new ArrayList<String>();
        }
        return this.packagingMarkedRecyclableScheme;
    }

    /**
     * Gets the value of the serialNumberLocationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialNumberLocationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerialNumberLocationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SerialNumberLocationCodeType }
     * 
     * 
     */
    public List<SerialNumberLocationCodeType> getSerialNumberLocationCode() {
        if (serialNumberLocationCode == null) {
            serialNumberLocationCode = new ArrayList<SerialNumberLocationCodeType>();
        }
        return this.serialNumberLocationCode;
    }

    /**
     * Gets the value of the warningCopyDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warningCopyDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarningCopyDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getWarningCopyDescription() {
        if (warningCopyDescription == null) {
            warningCopyDescription = new ArrayList<Description5000Type>();
        }
        return this.warningCopyDescription;
    }

    /**
     * Gets the value of the localPackagingMarkedLabelAccreditationCodeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localPackagingMarkedLabelAccreditationCodeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalPackagingMarkedLabelAccreditationCodeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLocalPackagingMarkedLabelAccreditationCodeReference() {
        if (localPackagingMarkedLabelAccreditationCodeReference == null) {
            localPackagingMarkedLabelAccreditationCodeReference = new ArrayList<String>();
        }
        return this.localPackagingMarkedLabelAccreditationCodeReference;
    }

    /**
     * Gets the value of the tradeItemMarkingsDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemMarkingsDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemMarkingsDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getTradeItemMarkingsDescription() {
        if (tradeItemMarkingsDescription == null) {
            tradeItemMarkingsDescription = new ArrayList<Description500Type>();
        }
        return this.tradeItemMarkingsDescription;
    }

    /**
     * Gets the value of the consumerWarningInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerWarningInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerWarningInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumerWarningInformationType }
     * 
     * 
     */
    public List<ConsumerWarningInformationType> getConsumerWarningInformation() {
        if (consumerWarningInformation == null) {
            consumerWarningInformation = new ArrayList<ConsumerWarningInformationType>();
        }
        return this.consumerWarningInformation;
    }

    /**
     * Gets the value of the tradeItemIdentificationMarking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemIdentificationMarking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemIdentificationMarking().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeItemIdentificationMarkingType }
     * 
     * 
     */
    public List<TradeItemIdentificationMarkingType> getTradeItemIdentificationMarking() {
        if (tradeItemIdentificationMarking == null) {
            tradeItemIdentificationMarking = new ArrayList<TradeItemIdentificationMarkingType>();
        }
        return this.tradeItemIdentificationMarking;
    }

    /**
     * Gets the value of the packagingDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingDateType }
     * 
     * 
     */
    public List<PackagingDateType> getPackagingDate() {
        if (packagingDate == null) {
            packagingDate = new ArrayList<PackagingDateType>();
        }
        return this.packagingDate;
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
