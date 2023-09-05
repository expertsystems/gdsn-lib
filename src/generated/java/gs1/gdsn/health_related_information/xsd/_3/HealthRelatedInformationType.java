
package gs1.gdsn.health_related_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.Description5000Type;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;
import gs1.shared.shared_common.xsd._3.TimeMeasurementType;


/**
 * <p>Java class for HealthRelatedInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HealthRelatedInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="compulsoryAdditiveLabelInformation" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="doesTradeItemCompositionIncludeLatex" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemChemicalNotIntendedForHumanConsumption" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="nutritionalLabelTypeCode" type="{urn:gs1:gdsn:health_related_information:xsd:3}NutritionalLabelTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="expectedResultsTime" type="{urn:gs1:shared:shared_common:xsd:3}TimeMeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sunProtectionFactor" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tradeItemUVRating" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="cannabisCBDTypeCode" type="{urn:gs1:gdsn:health_related_information:xsd:3}CannabisCBDTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="nutritionalProgram" type="{urn:gs1:gdsn:health_related_information:xsd:3}NutritionalProgramType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="compulsoryAdditionalInformation" type="{urn:gs1:gdsn:health_related_information:xsd:3}CompulsoryAdditionalInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "HealthRelatedInformationType", propOrder = {
    "compulsoryAdditiveLabelInformation",
    "doesTradeItemCompositionIncludeLatex",
    "isTradeItemChemicalNotIntendedForHumanConsumption",
    "nutritionalLabelTypeCode",
    "expectedResultsTime",
    "sunProtectionFactor",
    "tradeItemUVRating",
    "cannabisCBDTypeCode",
    "nutritionalProgram",
    "compulsoryAdditionalInformation",
    "avpList"
})
public class HealthRelatedInformationType {

    protected List<Description5000Type> compulsoryAdditiveLabelInformation;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType doesTradeItemCompositionIncludeLatex;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isTradeItemChemicalNotIntendedForHumanConsumption;
    protected List<NutritionalLabelTypeCodeType> nutritionalLabelTypeCode;
    protected List<TimeMeasurementType> expectedResultsTime;
    protected String sunProtectionFactor;
    protected Float tradeItemUVRating;
    protected CannabisCBDTypeCodeType cannabisCBDTypeCode;
    protected List<NutritionalProgramType> nutritionalProgram;
    protected List<CompulsoryAdditionalInformationType> compulsoryAdditionalInformation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the compulsoryAdditiveLabelInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compulsoryAdditiveLabelInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompulsoryAdditiveLabelInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getCompulsoryAdditiveLabelInformation() {
        if (compulsoryAdditiveLabelInformation == null) {
            compulsoryAdditiveLabelInformation = new ArrayList<Description5000Type>();
        }
        return this.compulsoryAdditiveLabelInformation;
    }

    /**
     * Gets the value of the doesTradeItemCompositionIncludeLatex property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getDoesTradeItemCompositionIncludeLatex() {
        return doesTradeItemCompositionIncludeLatex;
    }

    /**
     * Sets the value of the doesTradeItemCompositionIncludeLatex property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setDoesTradeItemCompositionIncludeLatex(NonBinaryLogicEnumerationType value) {
        this.doesTradeItemCompositionIncludeLatex = value;
    }

    /**
     * Gets the value of the isTradeItemChemicalNotIntendedForHumanConsumption property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsTradeItemChemicalNotIntendedForHumanConsumption() {
        return isTradeItemChemicalNotIntendedForHumanConsumption;
    }

    /**
     * Sets the value of the isTradeItemChemicalNotIntendedForHumanConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsTradeItemChemicalNotIntendedForHumanConsumption(NonBinaryLogicEnumerationType value) {
        this.isTradeItemChemicalNotIntendedForHumanConsumption = value;
    }

    /**
     * Gets the value of the nutritionalLabelTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nutritionalLabelTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNutritionalLabelTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NutritionalLabelTypeCodeType }
     * 
     * 
     */
    public List<NutritionalLabelTypeCodeType> getNutritionalLabelTypeCode() {
        if (nutritionalLabelTypeCode == null) {
            nutritionalLabelTypeCode = new ArrayList<NutritionalLabelTypeCodeType>();
        }
        return this.nutritionalLabelTypeCode;
    }

    /**
     * Gets the value of the expectedResultsTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expectedResultsTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpectedResultsTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeMeasurementType }
     * 
     * 
     */
    public List<TimeMeasurementType> getExpectedResultsTime() {
        if (expectedResultsTime == null) {
            expectedResultsTime = new ArrayList<TimeMeasurementType>();
        }
        return this.expectedResultsTime;
    }

    /**
     * Gets the value of the sunProtectionFactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSunProtectionFactor() {
        return sunProtectionFactor;
    }

    /**
     * Sets the value of the sunProtectionFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSunProtectionFactor(String value) {
        this.sunProtectionFactor = value;
    }

    /**
     * Gets the value of the tradeItemUVRating property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTradeItemUVRating() {
        return tradeItemUVRating;
    }

    /**
     * Sets the value of the tradeItemUVRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTradeItemUVRating(Float value) {
        this.tradeItemUVRating = value;
    }

    /**
     * Gets the value of the cannabisCBDTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CannabisCBDTypeCodeType }
     *     
     */
    public CannabisCBDTypeCodeType getCannabisCBDTypeCode() {
        return cannabisCBDTypeCode;
    }

    /**
     * Sets the value of the cannabisCBDTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CannabisCBDTypeCodeType }
     *     
     */
    public void setCannabisCBDTypeCode(CannabisCBDTypeCodeType value) {
        this.cannabisCBDTypeCode = value;
    }

    /**
     * Gets the value of the nutritionalProgram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nutritionalProgram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNutritionalProgram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NutritionalProgramType }
     * 
     * 
     */
    public List<NutritionalProgramType> getNutritionalProgram() {
        if (nutritionalProgram == null) {
            nutritionalProgram = new ArrayList<NutritionalProgramType>();
        }
        return this.nutritionalProgram;
    }

    /**
     * Gets the value of the compulsoryAdditionalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compulsoryAdditionalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompulsoryAdditionalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompulsoryAdditionalInformationType }
     * 
     * 
     */
    public List<CompulsoryAdditionalInformationType> getCompulsoryAdditionalInformation() {
        if (compulsoryAdditionalInformation == null) {
            compulsoryAdditionalInformation = new ArrayList<CompulsoryAdditionalInformationType>();
        }
        return this.compulsoryAdditionalInformation;
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
