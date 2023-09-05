
package gs1.gdsn.sustainability_module.xsd._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.gdsn.gdsn_common.xsd._3.SustainabilityFeatureCodeType;
import gs1.shared.shared_common.xsd._3.Description5000Type;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for SustainabilityInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SustainabilityInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="doesTradeItemContainPesticide" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemRigidPlasticPackagingContainer" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemROHSCompliant" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="postConsumerRecycledContentPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="renewablePlantBasedPlasticComponentsPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="rOHSComplianceFailureMaterial" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="totalRecyclableContentPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemSustainabilityFeatureCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}SustainabilityFeatureCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemSustainabilityStatement" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "SustainabilityInformationType", propOrder = {
    "doesTradeItemContainPesticide",
    "isTradeItemRigidPlasticPackagingContainer",
    "isTradeItemROHSCompliant",
    "postConsumerRecycledContentPercentage",
    "renewablePlantBasedPlasticComponentsPercent",
    "rohsComplianceFailureMaterial",
    "totalRecyclableContentPercentage",
    "tradeItemSustainabilityFeatureCode",
    "tradeItemSustainabilityStatement",
    "avpList"
})
public class SustainabilityInformationType {

    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType doesTradeItemContainPesticide;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isTradeItemRigidPlasticPackagingContainer;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isTradeItemROHSCompliant;
    protected BigDecimal postConsumerRecycledContentPercentage;
    protected BigDecimal renewablePlantBasedPlasticComponentsPercent;
    @XmlElement(name = "rOHSComplianceFailureMaterial")
    protected List<String> rohsComplianceFailureMaterial;
    protected BigDecimal totalRecyclableContentPercentage;
    protected List<SustainabilityFeatureCodeType> tradeItemSustainabilityFeatureCode;
    protected List<Description5000Type> tradeItemSustainabilityStatement;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the doesTradeItemContainPesticide property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getDoesTradeItemContainPesticide() {
        return doesTradeItemContainPesticide;
    }

    /**
     * Sets the value of the doesTradeItemContainPesticide property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setDoesTradeItemContainPesticide(NonBinaryLogicEnumerationType value) {
        this.doesTradeItemContainPesticide = value;
    }

    /**
     * Gets the value of the isTradeItemRigidPlasticPackagingContainer property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsTradeItemRigidPlasticPackagingContainer() {
        return isTradeItemRigidPlasticPackagingContainer;
    }

    /**
     * Sets the value of the isTradeItemRigidPlasticPackagingContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsTradeItemRigidPlasticPackagingContainer(NonBinaryLogicEnumerationType value) {
        this.isTradeItemRigidPlasticPackagingContainer = value;
    }

    /**
     * Gets the value of the isTradeItemROHSCompliant property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsTradeItemROHSCompliant() {
        return isTradeItemROHSCompliant;
    }

    /**
     * Sets the value of the isTradeItemROHSCompliant property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsTradeItemROHSCompliant(NonBinaryLogicEnumerationType value) {
        this.isTradeItemROHSCompliant = value;
    }

    /**
     * Gets the value of the postConsumerRecycledContentPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPostConsumerRecycledContentPercentage() {
        return postConsumerRecycledContentPercentage;
    }

    /**
     * Sets the value of the postConsumerRecycledContentPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPostConsumerRecycledContentPercentage(BigDecimal value) {
        this.postConsumerRecycledContentPercentage = value;
    }

    /**
     * Gets the value of the renewablePlantBasedPlasticComponentsPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRenewablePlantBasedPlasticComponentsPercent() {
        return renewablePlantBasedPlasticComponentsPercent;
    }

    /**
     * Sets the value of the renewablePlantBasedPlasticComponentsPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRenewablePlantBasedPlasticComponentsPercent(BigDecimal value) {
        this.renewablePlantBasedPlasticComponentsPercent = value;
    }

    /**
     * Gets the value of the rohsComplianceFailureMaterial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rohsComplianceFailureMaterial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getROHSComplianceFailureMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getROHSComplianceFailureMaterial() {
        if (rohsComplianceFailureMaterial == null) {
            rohsComplianceFailureMaterial = new ArrayList<String>();
        }
        return this.rohsComplianceFailureMaterial;
    }

    /**
     * Gets the value of the totalRecyclableContentPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalRecyclableContentPercentage() {
        return totalRecyclableContentPercentage;
    }

    /**
     * Sets the value of the totalRecyclableContentPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalRecyclableContentPercentage(BigDecimal value) {
        this.totalRecyclableContentPercentage = value;
    }

    /**
     * Gets the value of the tradeItemSustainabilityFeatureCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemSustainabilityFeatureCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemSustainabilityFeatureCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SustainabilityFeatureCodeType }
     * 
     * 
     */
    public List<SustainabilityFeatureCodeType> getTradeItemSustainabilityFeatureCode() {
        if (tradeItemSustainabilityFeatureCode == null) {
            tradeItemSustainabilityFeatureCode = new ArrayList<SustainabilityFeatureCodeType>();
        }
        return this.tradeItemSustainabilityFeatureCode;
    }

    /**
     * Gets the value of the tradeItemSustainabilityStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemSustainabilityStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemSustainabilityStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getTradeItemSustainabilityStatement() {
        if (tradeItemSustainabilityStatement == null) {
            tradeItemSustainabilityStatement = new ArrayList<Description5000Type>();
        }
        return this.tradeItemSustainabilityStatement;
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
