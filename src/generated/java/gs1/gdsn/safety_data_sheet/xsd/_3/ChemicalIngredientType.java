
package gs1.gdsn.safety_data_sheet.xsd._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.gdsn.gdsn_common.xsd._3.MeasurementPrecisionCodeType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for ChemicalIngredientType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChemicalIngredientType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chemicalIngredientConcentration" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="chemicalIngredientConcentrationBasis" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="chemicalIngredientIdentification" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="chemicalIngredientName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="rEACHChemicalRegistrationNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="chemicalIngredientConcentrationLowerValue" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="chemicalIngredientConcentrationMeasurementPrecision" type="{urn:gs1:gdsn:gdsn_common:xsd:3}MeasurementPrecisionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="chemicalIngredientConcentrationUpperValue" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lowerExplosiveLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="upperExplosiveLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="lethalDoseConcentrationInformation" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}LethalDoseConcentrationInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ChemicalIngredientType", propOrder = {
    "chemicalIngredientConcentration",
    "chemicalIngredientConcentrationBasis",
    "chemicalIngredientIdentification",
    "chemicalIngredientName",
    "reachChemicalRegistrationNumber",
    "chemicalIngredientConcentrationLowerValue",
    "chemicalIngredientConcentrationMeasurementPrecision",
    "chemicalIngredientConcentrationUpperValue",
    "lowerExplosiveLimit",
    "upperExplosiveLimit",
    "lethalDoseConcentrationInformation",
    "avpList"
})
public class ChemicalIngredientType {

    protected MeasurementType chemicalIngredientConcentration;
    protected MeasurementType chemicalIngredientConcentrationBasis;
    protected String chemicalIngredientIdentification;
    protected String chemicalIngredientName;
    @XmlElement(name = "rEACHChemicalRegistrationNumber")
    protected String reachChemicalRegistrationNumber;
    protected List<MeasurementType> chemicalIngredientConcentrationLowerValue;
    protected MeasurementPrecisionCodeType chemicalIngredientConcentrationMeasurementPrecision;
    protected List<MeasurementType> chemicalIngredientConcentrationUpperValue;
    protected BigDecimal lowerExplosiveLimit;
    protected BigDecimal upperExplosiveLimit;
    protected List<LethalDoseConcentrationInformationType> lethalDoseConcentrationInformation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the chemicalIngredientConcentration property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getChemicalIngredientConcentration() {
        return chemicalIngredientConcentration;
    }

    /**
     * Sets the value of the chemicalIngredientConcentration property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setChemicalIngredientConcentration(MeasurementType value) {
        this.chemicalIngredientConcentration = value;
    }

    /**
     * Gets the value of the chemicalIngredientConcentrationBasis property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getChemicalIngredientConcentrationBasis() {
        return chemicalIngredientConcentrationBasis;
    }

    /**
     * Sets the value of the chemicalIngredientConcentrationBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setChemicalIngredientConcentrationBasis(MeasurementType value) {
        this.chemicalIngredientConcentrationBasis = value;
    }

    /**
     * Gets the value of the chemicalIngredientIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChemicalIngredientIdentification() {
        return chemicalIngredientIdentification;
    }

    /**
     * Sets the value of the chemicalIngredientIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChemicalIngredientIdentification(String value) {
        this.chemicalIngredientIdentification = value;
    }

    /**
     * Gets the value of the chemicalIngredientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChemicalIngredientName() {
        return chemicalIngredientName;
    }

    /**
     * Sets the value of the chemicalIngredientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChemicalIngredientName(String value) {
        this.chemicalIngredientName = value;
    }

    /**
     * Gets the value of the reachChemicalRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREACHChemicalRegistrationNumber() {
        return reachChemicalRegistrationNumber;
    }

    /**
     * Sets the value of the reachChemicalRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREACHChemicalRegistrationNumber(String value) {
        this.reachChemicalRegistrationNumber = value;
    }

    /**
     * Gets the value of the chemicalIngredientConcentrationLowerValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chemicalIngredientConcentrationLowerValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChemicalIngredientConcentrationLowerValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getChemicalIngredientConcentrationLowerValue() {
        if (chemicalIngredientConcentrationLowerValue == null) {
            chemicalIngredientConcentrationLowerValue = new ArrayList<MeasurementType>();
        }
        return this.chemicalIngredientConcentrationLowerValue;
    }

    /**
     * Gets the value of the chemicalIngredientConcentrationMeasurementPrecision property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public MeasurementPrecisionCodeType getChemicalIngredientConcentrationMeasurementPrecision() {
        return chemicalIngredientConcentrationMeasurementPrecision;
    }

    /**
     * Sets the value of the chemicalIngredientConcentrationMeasurementPrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public void setChemicalIngredientConcentrationMeasurementPrecision(MeasurementPrecisionCodeType value) {
        this.chemicalIngredientConcentrationMeasurementPrecision = value;
    }

    /**
     * Gets the value of the chemicalIngredientConcentrationUpperValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chemicalIngredientConcentrationUpperValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChemicalIngredientConcentrationUpperValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getChemicalIngredientConcentrationUpperValue() {
        if (chemicalIngredientConcentrationUpperValue == null) {
            chemicalIngredientConcentrationUpperValue = new ArrayList<MeasurementType>();
        }
        return this.chemicalIngredientConcentrationUpperValue;
    }

    /**
     * Gets the value of the lowerExplosiveLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLowerExplosiveLimit() {
        return lowerExplosiveLimit;
    }

    /**
     * Sets the value of the lowerExplosiveLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLowerExplosiveLimit(BigDecimal value) {
        this.lowerExplosiveLimit = value;
    }

    /**
     * Gets the value of the upperExplosiveLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpperExplosiveLimit() {
        return upperExplosiveLimit;
    }

    /**
     * Sets the value of the upperExplosiveLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUpperExplosiveLimit(BigDecimal value) {
        this.upperExplosiveLimit = value;
    }

    /**
     * Gets the value of the lethalDoseConcentrationInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lethalDoseConcentrationInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLethalDoseConcentrationInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LethalDoseConcentrationInformationType }
     * 
     * 
     */
    public List<LethalDoseConcentrationInformationType> getLethalDoseConcentrationInformation() {
        if (lethalDoseConcentrationInformation == null) {
            lethalDoseConcentrationInformation = new ArrayList<LethalDoseConcentrationInformationType>();
        }
        return this.lethalDoseConcentrationInformation;
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
