
package gs1.gdsn.alcohol_information.xsd._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.gdsn.gdsn_common.xsd._3.MeasurementPrecisionCodeType;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.TimeMeasurementType;


/**
 * <p>Java class for AlcoholInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcoholInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alcoholicBeverageSubregion" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="alcoholicPermissionLevel" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="degreeOfOriginalWort" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="percentageOfAlcoholByVolume" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="vintner" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="alcoholProof" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="alcoholicBeverageSugarContent" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vintage" type="{http://www.w3.org/2001/XMLSchema}gYear" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemAQualityVintageAlcoholProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="alcoholUnits" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="alcoholBeverageAge" type="{urn:gs1:shared:shared_common:xsd:3}TimeMeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isCaskStrength" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="beerStyleCode" type="{urn:gs1:gdsn:alcohol_information:xsd:3}BeerStyleTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="alcoholBeverageFilteringMethodTypeCode" type="{urn:gs1:gdsn:alcohol_information:xsd:3}AlcoholBeverageFilteringMethodTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="alcoholBeverageProductionMethodTypeCode" type="{urn:gs1:gdsn:alcohol_information:xsd:3}AlcoholBeverageProductionMethodTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="alcoholBeverageDistilledFromCode" type="{urn:gs1:gdsn:alcohol_information:xsd:3}AlcoholBeverageDistilledFromCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="primaryAddedFlavouringCode" type="{urn:gs1:gdsn:alcohol_information:xsd:3}PrimaryAddedFlavouringCodeType" minOccurs="0"/&gt;
 *         &lt;element name="secondaryAddedFlavouringCode" type="{urn:gs1:gdsn:alcohol_information:xsd:3}SecondaryAddedFlavouringCodeType" minOccurs="0"/&gt;
 *         &lt;element name="alcoholBeverageTypeCode" type="{urn:gs1:gdsn:alcohol_information:xsd:3}AlcoholBeverageTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="alcoholicBeverageColourCode" type="{urn:gs1:gdsn:alcohol_information:xsd:3}AlcoholicBeverageColourCodeType" minOccurs="0"/&gt;
 *         &lt;element name="bitternessOfBeerMeasurement" type="{urn:gs1:gdsn:alcohol_information:xsd:3}BitternessOfBeerMeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="originOfWineCode" type="{urn:gs1:gdsn:alcohol_information:xsd:3}OriginOfWineCodeType" minOccurs="0"/&gt;
 *         &lt;element name="percentageOfAlcoholByVolumeMeasurementPrecisionCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}MeasurementPrecisionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="sweetnessLevelOfAlcoholicBeverageCode" type="{urn:gs1:gdsn:alcohol_information:xsd:3}SweetnessLevelOfAlcoholicBeverageCodeType" minOccurs="0"/&gt;
 *         &lt;element name="alcoholBeverageContainer" type="{urn:gs1:gdsn:alcohol_information:xsd:3}AlcoholBeverageContainerType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AlcoholInformationType", propOrder = {
    "alcoholicBeverageSubregion",
    "alcoholicPermissionLevel",
    "degreeOfOriginalWort",
    "percentageOfAlcoholByVolume",
    "vintner",
    "alcoholProof",
    "alcoholicBeverageSugarContent",
    "vintage",
    "isTradeItemAQualityVintageAlcoholProduct",
    "alcoholUnits",
    "alcoholBeverageAge",
    "isCaskStrength",
    "beerStyleCode",
    "alcoholBeverageFilteringMethodTypeCode",
    "alcoholBeverageProductionMethodTypeCode",
    "alcoholBeverageDistilledFromCode",
    "primaryAddedFlavouringCode",
    "secondaryAddedFlavouringCode",
    "alcoholBeverageTypeCode",
    "alcoholicBeverageColourCode",
    "bitternessOfBeerMeasurement",
    "originOfWineCode",
    "percentageOfAlcoholByVolumeMeasurementPrecisionCode",
    "sweetnessLevelOfAlcoholicBeverageCode",
    "alcoholBeverageContainer",
    "avpList"
})
public class AlcoholInformationType {

    protected String alcoholicBeverageSubregion;
    protected String alcoholicPermissionLevel;
    protected BigDecimal degreeOfOriginalWort;
    protected BigDecimal percentageOfAlcoholByVolume;
    protected List<String> vintner;
    protected Float alcoholProof;
    protected List<MeasurementType> alcoholicBeverageSugarContent;
    @XmlSchemaType(name = "gYear")
    protected List<XMLGregorianCalendar> vintage;
    protected Boolean isTradeItemAQualityVintageAlcoholProduct;
    protected BigDecimal alcoholUnits;
    protected List<TimeMeasurementType> alcoholBeverageAge;
    protected Boolean isCaskStrength;
    protected List<BeerStyleTypeCodeType> beerStyleCode;
    protected List<AlcoholBeverageFilteringMethodTypeCodeType> alcoholBeverageFilteringMethodTypeCode;
    protected AlcoholBeverageProductionMethodTypeCodeType alcoholBeverageProductionMethodTypeCode;
    protected List<AlcoholBeverageDistilledFromCodeType> alcoholBeverageDistilledFromCode;
    protected PrimaryAddedFlavouringCodeType primaryAddedFlavouringCode;
    protected SecondaryAddedFlavouringCodeType secondaryAddedFlavouringCode;
    protected List<AlcoholBeverageTypeCodeType> alcoholBeverageTypeCode;
    protected AlcoholicBeverageColourCodeType alcoholicBeverageColourCode;
    protected List<BitternessOfBeerMeasurementType> bitternessOfBeerMeasurement;
    protected OriginOfWineCodeType originOfWineCode;
    protected MeasurementPrecisionCodeType percentageOfAlcoholByVolumeMeasurementPrecisionCode;
    protected SweetnessLevelOfAlcoholicBeverageCodeType sweetnessLevelOfAlcoholicBeverageCode;
    protected List<AlcoholBeverageContainerType> alcoholBeverageContainer;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the alcoholicBeverageSubregion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlcoholicBeverageSubregion() {
        return alcoholicBeverageSubregion;
    }

    /**
     * Sets the value of the alcoholicBeverageSubregion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlcoholicBeverageSubregion(String value) {
        this.alcoholicBeverageSubregion = value;
    }

    /**
     * Gets the value of the alcoholicPermissionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlcoholicPermissionLevel() {
        return alcoholicPermissionLevel;
    }

    /**
     * Sets the value of the alcoholicPermissionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlcoholicPermissionLevel(String value) {
        this.alcoholicPermissionLevel = value;
    }

    /**
     * Gets the value of the degreeOfOriginalWort property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDegreeOfOriginalWort() {
        return degreeOfOriginalWort;
    }

    /**
     * Sets the value of the degreeOfOriginalWort property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDegreeOfOriginalWort(BigDecimal value) {
        this.degreeOfOriginalWort = value;
    }

    /**
     * Gets the value of the percentageOfAlcoholByVolume property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentageOfAlcoholByVolume() {
        return percentageOfAlcoholByVolume;
    }

    /**
     * Sets the value of the percentageOfAlcoholByVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageOfAlcoholByVolume(BigDecimal value) {
        this.percentageOfAlcoholByVolume = value;
    }

    /**
     * Gets the value of the vintner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vintner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVintner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVintner() {
        if (vintner == null) {
            vintner = new ArrayList<String>();
        }
        return this.vintner;
    }

    /**
     * Gets the value of the alcoholProof property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAlcoholProof() {
        return alcoholProof;
    }

    /**
     * Sets the value of the alcoholProof property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAlcoholProof(Float value) {
        this.alcoholProof = value;
    }

    /**
     * Gets the value of the alcoholicBeverageSugarContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alcoholicBeverageSugarContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlcoholicBeverageSugarContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getAlcoholicBeverageSugarContent() {
        if (alcoholicBeverageSugarContent == null) {
            alcoholicBeverageSugarContent = new ArrayList<MeasurementType>();
        }
        return this.alcoholicBeverageSugarContent;
    }

    /**
     * Gets the value of the vintage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vintage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVintage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getVintage() {
        if (vintage == null) {
            vintage = new ArrayList<XMLGregorianCalendar>();
        }
        return this.vintage;
    }

    /**
     * Gets the value of the isTradeItemAQualityVintageAlcoholProduct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTradeItemAQualityVintageAlcoholProduct() {
        return isTradeItemAQualityVintageAlcoholProduct;
    }

    /**
     * Sets the value of the isTradeItemAQualityVintageAlcoholProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTradeItemAQualityVintageAlcoholProduct(Boolean value) {
        this.isTradeItemAQualityVintageAlcoholProduct = value;
    }

    /**
     * Gets the value of the alcoholUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAlcoholUnits() {
        return alcoholUnits;
    }

    /**
     * Sets the value of the alcoholUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAlcoholUnits(BigDecimal value) {
        this.alcoholUnits = value;
    }

    /**
     * Gets the value of the alcoholBeverageAge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alcoholBeverageAge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlcoholBeverageAge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeMeasurementType }
     * 
     * 
     */
    public List<TimeMeasurementType> getAlcoholBeverageAge() {
        if (alcoholBeverageAge == null) {
            alcoholBeverageAge = new ArrayList<TimeMeasurementType>();
        }
        return this.alcoholBeverageAge;
    }

    /**
     * Gets the value of the isCaskStrength property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCaskStrength() {
        return isCaskStrength;
    }

    /**
     * Sets the value of the isCaskStrength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCaskStrength(Boolean value) {
        this.isCaskStrength = value;
    }

    /**
     * Gets the value of the beerStyleCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beerStyleCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeerStyleCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeerStyleTypeCodeType }
     * 
     * 
     */
    public List<BeerStyleTypeCodeType> getBeerStyleCode() {
        if (beerStyleCode == null) {
            beerStyleCode = new ArrayList<BeerStyleTypeCodeType>();
        }
        return this.beerStyleCode;
    }

    /**
     * Gets the value of the alcoholBeverageFilteringMethodTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alcoholBeverageFilteringMethodTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlcoholBeverageFilteringMethodTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlcoholBeverageFilteringMethodTypeCodeType }
     * 
     * 
     */
    public List<AlcoholBeverageFilteringMethodTypeCodeType> getAlcoholBeverageFilteringMethodTypeCode() {
        if (alcoholBeverageFilteringMethodTypeCode == null) {
            alcoholBeverageFilteringMethodTypeCode = new ArrayList<AlcoholBeverageFilteringMethodTypeCodeType>();
        }
        return this.alcoholBeverageFilteringMethodTypeCode;
    }

    /**
     * Gets the value of the alcoholBeverageProductionMethodTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link AlcoholBeverageProductionMethodTypeCodeType }
     *     
     */
    public AlcoholBeverageProductionMethodTypeCodeType getAlcoholBeverageProductionMethodTypeCode() {
        return alcoholBeverageProductionMethodTypeCode;
    }

    /**
     * Sets the value of the alcoholBeverageProductionMethodTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcoholBeverageProductionMethodTypeCodeType }
     *     
     */
    public void setAlcoholBeverageProductionMethodTypeCode(AlcoholBeverageProductionMethodTypeCodeType value) {
        this.alcoholBeverageProductionMethodTypeCode = value;
    }

    /**
     * Gets the value of the alcoholBeverageDistilledFromCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alcoholBeverageDistilledFromCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlcoholBeverageDistilledFromCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlcoholBeverageDistilledFromCodeType }
     * 
     * 
     */
    public List<AlcoholBeverageDistilledFromCodeType> getAlcoholBeverageDistilledFromCode() {
        if (alcoholBeverageDistilledFromCode == null) {
            alcoholBeverageDistilledFromCode = new ArrayList<AlcoholBeverageDistilledFromCodeType>();
        }
        return this.alcoholBeverageDistilledFromCode;
    }

    /**
     * Gets the value of the primaryAddedFlavouringCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryAddedFlavouringCodeType }
     *     
     */
    public PrimaryAddedFlavouringCodeType getPrimaryAddedFlavouringCode() {
        return primaryAddedFlavouringCode;
    }

    /**
     * Sets the value of the primaryAddedFlavouringCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryAddedFlavouringCodeType }
     *     
     */
    public void setPrimaryAddedFlavouringCode(PrimaryAddedFlavouringCodeType value) {
        this.primaryAddedFlavouringCode = value;
    }

    /**
     * Gets the value of the secondaryAddedFlavouringCode property.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryAddedFlavouringCodeType }
     *     
     */
    public SecondaryAddedFlavouringCodeType getSecondaryAddedFlavouringCode() {
        return secondaryAddedFlavouringCode;
    }

    /**
     * Sets the value of the secondaryAddedFlavouringCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryAddedFlavouringCodeType }
     *     
     */
    public void setSecondaryAddedFlavouringCode(SecondaryAddedFlavouringCodeType value) {
        this.secondaryAddedFlavouringCode = value;
    }

    /**
     * Gets the value of the alcoholBeverageTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alcoholBeverageTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlcoholBeverageTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlcoholBeverageTypeCodeType }
     * 
     * 
     */
    public List<AlcoholBeverageTypeCodeType> getAlcoholBeverageTypeCode() {
        if (alcoholBeverageTypeCode == null) {
            alcoholBeverageTypeCode = new ArrayList<AlcoholBeverageTypeCodeType>();
        }
        return this.alcoholBeverageTypeCode;
    }

    /**
     * Gets the value of the alcoholicBeverageColourCode property.
     * 
     * @return
     *     possible object is
     *     {@link AlcoholicBeverageColourCodeType }
     *     
     */
    public AlcoholicBeverageColourCodeType getAlcoholicBeverageColourCode() {
        return alcoholicBeverageColourCode;
    }

    /**
     * Sets the value of the alcoholicBeverageColourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcoholicBeverageColourCodeType }
     *     
     */
    public void setAlcoholicBeverageColourCode(AlcoholicBeverageColourCodeType value) {
        this.alcoholicBeverageColourCode = value;
    }

    /**
     * Gets the value of the bitternessOfBeerMeasurement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bitternessOfBeerMeasurement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBitternessOfBeerMeasurement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BitternessOfBeerMeasurementType }
     * 
     * 
     */
    public List<BitternessOfBeerMeasurementType> getBitternessOfBeerMeasurement() {
        if (bitternessOfBeerMeasurement == null) {
            bitternessOfBeerMeasurement = new ArrayList<BitternessOfBeerMeasurementType>();
        }
        return this.bitternessOfBeerMeasurement;
    }

    /**
     * Gets the value of the originOfWineCode property.
     * 
     * @return
     *     possible object is
     *     {@link OriginOfWineCodeType }
     *     
     */
    public OriginOfWineCodeType getOriginOfWineCode() {
        return originOfWineCode;
    }

    /**
     * Sets the value of the originOfWineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginOfWineCodeType }
     *     
     */
    public void setOriginOfWineCode(OriginOfWineCodeType value) {
        this.originOfWineCode = value;
    }

    /**
     * Gets the value of the percentageOfAlcoholByVolumeMeasurementPrecisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public MeasurementPrecisionCodeType getPercentageOfAlcoholByVolumeMeasurementPrecisionCode() {
        return percentageOfAlcoholByVolumeMeasurementPrecisionCode;
    }

    /**
     * Sets the value of the percentageOfAlcoholByVolumeMeasurementPrecisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public void setPercentageOfAlcoholByVolumeMeasurementPrecisionCode(MeasurementPrecisionCodeType value) {
        this.percentageOfAlcoholByVolumeMeasurementPrecisionCode = value;
    }

    /**
     * Gets the value of the sweetnessLevelOfAlcoholicBeverageCode property.
     * 
     * @return
     *     possible object is
     *     {@link SweetnessLevelOfAlcoholicBeverageCodeType }
     *     
     */
    public SweetnessLevelOfAlcoholicBeverageCodeType getSweetnessLevelOfAlcoholicBeverageCode() {
        return sweetnessLevelOfAlcoholicBeverageCode;
    }

    /**
     * Sets the value of the sweetnessLevelOfAlcoholicBeverageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SweetnessLevelOfAlcoholicBeverageCodeType }
     *     
     */
    public void setSweetnessLevelOfAlcoholicBeverageCode(SweetnessLevelOfAlcoholicBeverageCodeType value) {
        this.sweetnessLevelOfAlcoholicBeverageCode = value;
    }

    /**
     * Gets the value of the alcoholBeverageContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alcoholBeverageContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlcoholBeverageContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlcoholBeverageContainerType }
     * 
     * 
     */
    public List<AlcoholBeverageContainerType> getAlcoholBeverageContainer() {
        if (alcoholBeverageContainer == null) {
            alcoholBeverageContainer = new ArrayList<AlcoholBeverageContainerType>();
        }
        return this.alcoholBeverageContainer;
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
