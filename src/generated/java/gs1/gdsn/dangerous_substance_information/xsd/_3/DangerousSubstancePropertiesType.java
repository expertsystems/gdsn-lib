
package gs1.gdsn.dangerous_substance_information.xsd._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.DangerousHazardousLabelType;
import gs1.gdsn.gdsn_common.xsd._3.ExternalCodeValueInformationType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.gdsn.gdsn_common.xsd._3.PhaseOfMatterCodeType;
import gs1.shared.shared_common.xsd._3.CodeType;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for DangerousSubstancePropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DangerousSubstancePropertiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dangerousSubstanceGasDensity" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="dangerousSubstanceHeatOfCombustion" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="dangerousSubstanceName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dangerousSubstancePhaseOfMatterCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}PhaseOfMatterCodeType" minOccurs="0"/&gt;
 *         &lt;element name="dangerousSubstancesWaterSolubilityCode" type="{urn:gs1:gdsn:dangerous_substance_information:xsd:3}DangerousSubstancesWaterSolubilityCodeType" minOccurs="0"/&gt;
 *         &lt;element name="flammableSubstanceMaximumPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="flammableSubstanceMinimumPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="isDangerousSubstance" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="isDangerousSubstanceAMixture" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="dangerousSubstanceHazardSymbolCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dangerousSubstanceWasteCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}ExternalCodeValueInformationType" minOccurs="0"/&gt;
 *         &lt;element name="riskPhraseCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}ExternalCodeValueInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="safetyPhraseCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}ExternalCodeValueInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="waterHazardCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}ExternalCodeValueInformationType" minOccurs="0"/&gt;
 *         &lt;element name="dangerousHazardousLabel" type="{urn:gs1:gdsn:gdsn_common:xsd:3}DangerousHazardousLabelType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "DangerousSubstancePropertiesType", propOrder = {
    "dangerousSubstanceGasDensity",
    "dangerousSubstanceHeatOfCombustion",
    "dangerousSubstanceName",
    "dangerousSubstancePhaseOfMatterCode",
    "dangerousSubstancesWaterSolubilityCode",
    "flammableSubstanceMaximumPercent",
    "flammableSubstanceMinimumPercent",
    "isDangerousSubstance",
    "isDangerousSubstanceAMixture",
    "dangerousSubstanceHazardSymbolCodeReference",
    "dangerousSubstanceWasteCode",
    "riskPhraseCode",
    "safetyPhraseCode",
    "waterHazardCode",
    "dangerousHazardousLabel",
    "avpList"
})
public class DangerousSubstancePropertiesType {

    protected MeasurementType dangerousSubstanceGasDensity;
    protected MeasurementType dangerousSubstanceHeatOfCombustion;
    protected String dangerousSubstanceName;
    protected PhaseOfMatterCodeType dangerousSubstancePhaseOfMatterCode;
    protected DangerousSubstancesWaterSolubilityCodeType dangerousSubstancesWaterSolubilityCode;
    protected BigDecimal flammableSubstanceMaximumPercent;
    protected BigDecimal flammableSubstanceMinimumPercent;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isDangerousSubstance;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isDangerousSubstanceAMixture;
    protected List<CodeType> dangerousSubstanceHazardSymbolCodeReference;
    protected ExternalCodeValueInformationType dangerousSubstanceWasteCode;
    protected List<ExternalCodeValueInformationType> riskPhraseCode;
    protected List<ExternalCodeValueInformationType> safetyPhraseCode;
    protected ExternalCodeValueInformationType waterHazardCode;
    protected List<DangerousHazardousLabelType> dangerousHazardousLabel;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the dangerousSubstanceGasDensity property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getDangerousSubstanceGasDensity() {
        return dangerousSubstanceGasDensity;
    }

    /**
     * Sets the value of the dangerousSubstanceGasDensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setDangerousSubstanceGasDensity(MeasurementType value) {
        this.dangerousSubstanceGasDensity = value;
    }

    /**
     * Gets the value of the dangerousSubstanceHeatOfCombustion property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getDangerousSubstanceHeatOfCombustion() {
        return dangerousSubstanceHeatOfCombustion;
    }

    /**
     * Sets the value of the dangerousSubstanceHeatOfCombustion property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setDangerousSubstanceHeatOfCombustion(MeasurementType value) {
        this.dangerousSubstanceHeatOfCombustion = value;
    }

    /**
     * Gets the value of the dangerousSubstanceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDangerousSubstanceName() {
        return dangerousSubstanceName;
    }

    /**
     * Sets the value of the dangerousSubstanceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDangerousSubstanceName(String value) {
        this.dangerousSubstanceName = value;
    }

    /**
     * Gets the value of the dangerousSubstancePhaseOfMatterCode property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseOfMatterCodeType }
     *     
     */
    public PhaseOfMatterCodeType getDangerousSubstancePhaseOfMatterCode() {
        return dangerousSubstancePhaseOfMatterCode;
    }

    /**
     * Sets the value of the dangerousSubstancePhaseOfMatterCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseOfMatterCodeType }
     *     
     */
    public void setDangerousSubstancePhaseOfMatterCode(PhaseOfMatterCodeType value) {
        this.dangerousSubstancePhaseOfMatterCode = value;
    }

    /**
     * Gets the value of the dangerousSubstancesWaterSolubilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link DangerousSubstancesWaterSolubilityCodeType }
     *     
     */
    public DangerousSubstancesWaterSolubilityCodeType getDangerousSubstancesWaterSolubilityCode() {
        return dangerousSubstancesWaterSolubilityCode;
    }

    /**
     * Sets the value of the dangerousSubstancesWaterSolubilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DangerousSubstancesWaterSolubilityCodeType }
     *     
     */
    public void setDangerousSubstancesWaterSolubilityCode(DangerousSubstancesWaterSolubilityCodeType value) {
        this.dangerousSubstancesWaterSolubilityCode = value;
    }

    /**
     * Gets the value of the flammableSubstanceMaximumPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlammableSubstanceMaximumPercent() {
        return flammableSubstanceMaximumPercent;
    }

    /**
     * Sets the value of the flammableSubstanceMaximumPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlammableSubstanceMaximumPercent(BigDecimal value) {
        this.flammableSubstanceMaximumPercent = value;
    }

    /**
     * Gets the value of the flammableSubstanceMinimumPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlammableSubstanceMinimumPercent() {
        return flammableSubstanceMinimumPercent;
    }

    /**
     * Sets the value of the flammableSubstanceMinimumPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlammableSubstanceMinimumPercent(BigDecimal value) {
        this.flammableSubstanceMinimumPercent = value;
    }

    /**
     * Gets the value of the isDangerousSubstance property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsDangerousSubstance() {
        return isDangerousSubstance;
    }

    /**
     * Sets the value of the isDangerousSubstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsDangerousSubstance(NonBinaryLogicEnumerationType value) {
        this.isDangerousSubstance = value;
    }

    /**
     * Gets the value of the isDangerousSubstanceAMixture property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsDangerousSubstanceAMixture() {
        return isDangerousSubstanceAMixture;
    }

    /**
     * Sets the value of the isDangerousSubstanceAMixture property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsDangerousSubstanceAMixture(NonBinaryLogicEnumerationType value) {
        this.isDangerousSubstanceAMixture = value;
    }

    /**
     * Gets the value of the dangerousSubstanceHazardSymbolCodeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dangerousSubstanceHazardSymbolCodeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDangerousSubstanceHazardSymbolCodeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getDangerousSubstanceHazardSymbolCodeReference() {
        if (dangerousSubstanceHazardSymbolCodeReference == null) {
            dangerousSubstanceHazardSymbolCodeReference = new ArrayList<CodeType>();
        }
        return this.dangerousSubstanceHazardSymbolCodeReference;
    }

    /**
     * Gets the value of the dangerousSubstanceWasteCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalCodeValueInformationType }
     *     
     */
    public ExternalCodeValueInformationType getDangerousSubstanceWasteCode() {
        return dangerousSubstanceWasteCode;
    }

    /**
     * Sets the value of the dangerousSubstanceWasteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalCodeValueInformationType }
     *     
     */
    public void setDangerousSubstanceWasteCode(ExternalCodeValueInformationType value) {
        this.dangerousSubstanceWasteCode = value;
    }

    /**
     * Gets the value of the riskPhraseCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riskPhraseCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiskPhraseCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalCodeValueInformationType }
     * 
     * 
     */
    public List<ExternalCodeValueInformationType> getRiskPhraseCode() {
        if (riskPhraseCode == null) {
            riskPhraseCode = new ArrayList<ExternalCodeValueInformationType>();
        }
        return this.riskPhraseCode;
    }

    /**
     * Gets the value of the safetyPhraseCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the safetyPhraseCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSafetyPhraseCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalCodeValueInformationType }
     * 
     * 
     */
    public List<ExternalCodeValueInformationType> getSafetyPhraseCode() {
        if (safetyPhraseCode == null) {
            safetyPhraseCode = new ArrayList<ExternalCodeValueInformationType>();
        }
        return this.safetyPhraseCode;
    }

    /**
     * Gets the value of the waterHazardCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalCodeValueInformationType }
     *     
     */
    public ExternalCodeValueInformationType getWaterHazardCode() {
        return waterHazardCode;
    }

    /**
     * Sets the value of the waterHazardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalCodeValueInformationType }
     *     
     */
    public void setWaterHazardCode(ExternalCodeValueInformationType value) {
        this.waterHazardCode = value;
    }

    /**
     * Gets the value of the dangerousHazardousLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dangerousHazardousLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDangerousHazardousLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DangerousHazardousLabelType }
     * 
     * 
     */
    public List<DangerousHazardousLabelType> getDangerousHazardousLabel() {
        if (dangerousHazardousLabel == null) {
            dangerousHazardousLabel = new ArrayList<DangerousHazardousLabelType>();
        }
        return this.dangerousHazardousLabel;
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
