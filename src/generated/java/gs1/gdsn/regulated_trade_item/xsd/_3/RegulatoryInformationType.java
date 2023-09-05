
package gs1.gdsn.regulated_trade_item.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.CodeType;
import gs1.shared.shared_common.xsd._3.Description5000Type;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for RegulatoryInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegulatoryInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="regulationTypeCode" type="{urn:gs1:gdsn:regulated_trade_item:xsd:3}RegulationTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="regulatoryAct" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="regulatoryAgency" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isPackagingMarkedWithRegulatoryCompliance" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemRegulationCompliant" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="regulatoryActComplianceLevelCode" type="{urn:gs1:gdsn:regulated_trade_item:xsd:3}RegulatoryActComplianceLevelCodeType" minOccurs="0"/&gt;
 *         &lt;element name="regulationCommunityLevelCode" type="{urn:gs1:gdsn:regulated_trade_item:xsd:3}RegulationCommunityLevelCodeType" minOccurs="0"/&gt;
 *         &lt;element name="regulationRestrictionsAndDescriptors" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="regulationRestrictionCommunityIdentifier" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="regulationLevelCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="regulationPictogramOrWarningQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="permitIdentification" type="{urn:gs1:gdsn:regulated_trade_item:xsd:3}PermitIdentificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "RegulatoryInformationType", propOrder = {
    "regulationTypeCode",
    "regulatoryAct",
    "regulatoryAgency",
    "isPackagingMarkedWithRegulatoryCompliance",
    "isTradeItemRegulationCompliant",
    "regulatoryActComplianceLevelCode",
    "regulationCommunityLevelCode",
    "regulationRestrictionsAndDescriptors",
    "regulationRestrictionCommunityIdentifier",
    "regulationLevelCodeReference",
    "regulationPictogramOrWarningQuantity",
    "permitIdentification",
    "avpList"
})
public class RegulatoryInformationType {

    protected List<RegulationTypeCodeType> regulationTypeCode;
    protected String regulatoryAct;
    protected String regulatoryAgency;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isPackagingMarkedWithRegulatoryCompliance;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isTradeItemRegulationCompliant;
    protected RegulatoryActComplianceLevelCodeType regulatoryActComplianceLevelCode;
    protected RegulationCommunityLevelCodeType regulationCommunityLevelCode;
    protected List<Description5000Type> regulationRestrictionsAndDescriptors;
    protected List<String> regulationRestrictionCommunityIdentifier;
    protected List<CodeType> regulationLevelCodeReference;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger regulationPictogramOrWarningQuantity;
    protected List<PermitIdentificationType> permitIdentification;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the regulationTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regulationTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegulationTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegulationTypeCodeType }
     * 
     * 
     */
    public List<RegulationTypeCodeType> getRegulationTypeCode() {
        if (regulationTypeCode == null) {
            regulationTypeCode = new ArrayList<RegulationTypeCodeType>();
        }
        return this.regulationTypeCode;
    }

    /**
     * Gets the value of the regulatoryAct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulatoryAct() {
        return regulatoryAct;
    }

    /**
     * Sets the value of the regulatoryAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulatoryAct(String value) {
        this.regulatoryAct = value;
    }

    /**
     * Gets the value of the regulatoryAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulatoryAgency() {
        return regulatoryAgency;
    }

    /**
     * Sets the value of the regulatoryAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulatoryAgency(String value) {
        this.regulatoryAgency = value;
    }

    /**
     * Gets the value of the isPackagingMarkedWithRegulatoryCompliance property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsPackagingMarkedWithRegulatoryCompliance() {
        return isPackagingMarkedWithRegulatoryCompliance;
    }

    /**
     * Sets the value of the isPackagingMarkedWithRegulatoryCompliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsPackagingMarkedWithRegulatoryCompliance(NonBinaryLogicEnumerationType value) {
        this.isPackagingMarkedWithRegulatoryCompliance = value;
    }

    /**
     * Gets the value of the isTradeItemRegulationCompliant property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsTradeItemRegulationCompliant() {
        return isTradeItemRegulationCompliant;
    }

    /**
     * Sets the value of the isTradeItemRegulationCompliant property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsTradeItemRegulationCompliant(NonBinaryLogicEnumerationType value) {
        this.isTradeItemRegulationCompliant = value;
    }

    /**
     * Gets the value of the regulatoryActComplianceLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryActComplianceLevelCodeType }
     *     
     */
    public RegulatoryActComplianceLevelCodeType getRegulatoryActComplianceLevelCode() {
        return regulatoryActComplianceLevelCode;
    }

    /**
     * Sets the value of the regulatoryActComplianceLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryActComplianceLevelCodeType }
     *     
     */
    public void setRegulatoryActComplianceLevelCode(RegulatoryActComplianceLevelCodeType value) {
        this.regulatoryActComplianceLevelCode = value;
    }

    /**
     * Gets the value of the regulationCommunityLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link RegulationCommunityLevelCodeType }
     *     
     */
    public RegulationCommunityLevelCodeType getRegulationCommunityLevelCode() {
        return regulationCommunityLevelCode;
    }

    /**
     * Sets the value of the regulationCommunityLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulationCommunityLevelCodeType }
     *     
     */
    public void setRegulationCommunityLevelCode(RegulationCommunityLevelCodeType value) {
        this.regulationCommunityLevelCode = value;
    }

    /**
     * Gets the value of the regulationRestrictionsAndDescriptors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regulationRestrictionsAndDescriptors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegulationRestrictionsAndDescriptors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getRegulationRestrictionsAndDescriptors() {
        if (regulationRestrictionsAndDescriptors == null) {
            regulationRestrictionsAndDescriptors = new ArrayList<Description5000Type>();
        }
        return this.regulationRestrictionsAndDescriptors;
    }

    /**
     * Gets the value of the regulationRestrictionCommunityIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regulationRestrictionCommunityIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegulationRestrictionCommunityIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRegulationRestrictionCommunityIdentifier() {
        if (regulationRestrictionCommunityIdentifier == null) {
            regulationRestrictionCommunityIdentifier = new ArrayList<String>();
        }
        return this.regulationRestrictionCommunityIdentifier;
    }

    /**
     * Gets the value of the regulationLevelCodeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regulationLevelCodeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegulationLevelCodeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getRegulationLevelCodeReference() {
        if (regulationLevelCodeReference == null) {
            regulationLevelCodeReference = new ArrayList<CodeType>();
        }
        return this.regulationLevelCodeReference;
    }

    /**
     * Gets the value of the regulationPictogramOrWarningQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRegulationPictogramOrWarningQuantity() {
        return regulationPictogramOrWarningQuantity;
    }

    /**
     * Sets the value of the regulationPictogramOrWarningQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRegulationPictogramOrWarningQuantity(BigInteger value) {
        this.regulationPictogramOrWarningQuantity = value;
    }

    /**
     * Gets the value of the permitIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permitIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermitIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermitIdentificationType }
     * 
     * 
     */
    public List<PermitIdentificationType> getPermitIdentification() {
        if (permitIdentification == null) {
            permitIdentification = new ArrayList<PermitIdentificationType>();
        }
        return this.permitIdentification;
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
