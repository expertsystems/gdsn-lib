
package gs1.gdsn.gdsn_common.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.CodeType;
import gs1.shared.shared_common.xsd._3.Description1000Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for HazardousInformationDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HazardousInformationDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="classOfDangerousGoods" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dangerousGoodsClassificationCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dangerousGoodsHazardousCode" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dangerousGoodsPackingGroup" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="dangerousGoodsShippingName" type="{urn:gs1:gdsn:gdsn_common:xsd:3}LanguageOptionalDescription1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dangerousGoodsSpecialProvisions" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dangerousGoodsTechnicalName" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dangerousGoodsTransportCategoryCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}DangerousGoodsTransportCategoryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="eRGNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="extremelyHazardousSubstanceQuantity" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="hazardousClassSubsidiaryRiskCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="netMassOfExplosives" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="unitedNationsDangerousGoodsNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{4}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dangerousGoodsLimitedQuantityIndex" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="dangerousGoodsSubsidiaryClass" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "HazardousInformationDetailType", propOrder = {
    "classOfDangerousGoods",
    "dangerousGoodsClassificationCode",
    "dangerousGoodsHazardousCode",
    "dangerousGoodsPackingGroup",
    "dangerousGoodsShippingName",
    "dangerousGoodsSpecialProvisions",
    "dangerousGoodsTechnicalName",
    "dangerousGoodsTransportCategoryCode",
    "ergNumber",
    "extremelyHazardousSubstanceQuantity",
    "hazardousClassSubsidiaryRiskCode",
    "netMassOfExplosives",
    "unitedNationsDangerousGoodsNumber",
    "dangerousGoodsLimitedQuantityIndex",
    "dangerousGoodsSubsidiaryClass",
    "dangerousHazardousLabel",
    "avpList"
})
public class HazardousInformationDetailType {

    protected String classOfDangerousGoods;
    protected String dangerousGoodsClassificationCode;
    protected List<String> dangerousGoodsHazardousCode;
    protected CodeType dangerousGoodsPackingGroup;
    protected List<LanguageOptionalDescription1000Type> dangerousGoodsShippingName;
    protected List<String> dangerousGoodsSpecialProvisions;
    protected List<Description1000Type> dangerousGoodsTechnicalName;
    protected DangerousGoodsTransportCategoryCodeType dangerousGoodsTransportCategoryCode;
    @XmlElement(name = "eRGNumber")
    protected String ergNumber;
    protected MeasurementType extremelyHazardousSubstanceQuantity;
    protected String hazardousClassSubsidiaryRiskCode;
    protected MeasurementType netMassOfExplosives;
    protected String unitedNationsDangerousGoodsNumber;
    protected MeasurementType dangerousGoodsLimitedQuantityIndex;
    protected List<String> dangerousGoodsSubsidiaryClass;
    protected List<DangerousHazardousLabelType> dangerousHazardousLabel;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the classOfDangerousGoods property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassOfDangerousGoods() {
        return classOfDangerousGoods;
    }

    /**
     * Sets the value of the classOfDangerousGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassOfDangerousGoods(String value) {
        this.classOfDangerousGoods = value;
    }

    /**
     * Gets the value of the dangerousGoodsClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDangerousGoodsClassificationCode() {
        return dangerousGoodsClassificationCode;
    }

    /**
     * Sets the value of the dangerousGoodsClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDangerousGoodsClassificationCode(String value) {
        this.dangerousGoodsClassificationCode = value;
    }

    /**
     * Gets the value of the dangerousGoodsHazardousCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dangerousGoodsHazardousCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDangerousGoodsHazardousCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDangerousGoodsHazardousCode() {
        if (dangerousGoodsHazardousCode == null) {
            dangerousGoodsHazardousCode = new ArrayList<String>();
        }
        return this.dangerousGoodsHazardousCode;
    }

    /**
     * Gets the value of the dangerousGoodsPackingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDangerousGoodsPackingGroup() {
        return dangerousGoodsPackingGroup;
    }

    /**
     * Sets the value of the dangerousGoodsPackingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDangerousGoodsPackingGroup(CodeType value) {
        this.dangerousGoodsPackingGroup = value;
    }

    /**
     * Gets the value of the dangerousGoodsShippingName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dangerousGoodsShippingName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDangerousGoodsShippingName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageOptionalDescription1000Type }
     * 
     * 
     */
    public List<LanguageOptionalDescription1000Type> getDangerousGoodsShippingName() {
        if (dangerousGoodsShippingName == null) {
            dangerousGoodsShippingName = new ArrayList<LanguageOptionalDescription1000Type>();
        }
        return this.dangerousGoodsShippingName;
    }

    /**
     * Gets the value of the dangerousGoodsSpecialProvisions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dangerousGoodsSpecialProvisions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDangerousGoodsSpecialProvisions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDangerousGoodsSpecialProvisions() {
        if (dangerousGoodsSpecialProvisions == null) {
            dangerousGoodsSpecialProvisions = new ArrayList<String>();
        }
        return this.dangerousGoodsSpecialProvisions;
    }

    /**
     * Gets the value of the dangerousGoodsTechnicalName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dangerousGoodsTechnicalName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDangerousGoodsTechnicalName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getDangerousGoodsTechnicalName() {
        if (dangerousGoodsTechnicalName == null) {
            dangerousGoodsTechnicalName = new ArrayList<Description1000Type>();
        }
        return this.dangerousGoodsTechnicalName;
    }

    /**
     * Gets the value of the dangerousGoodsTransportCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link DangerousGoodsTransportCategoryCodeType }
     *     
     */
    public DangerousGoodsTransportCategoryCodeType getDangerousGoodsTransportCategoryCode() {
        return dangerousGoodsTransportCategoryCode;
    }

    /**
     * Sets the value of the dangerousGoodsTransportCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DangerousGoodsTransportCategoryCodeType }
     *     
     */
    public void setDangerousGoodsTransportCategoryCode(DangerousGoodsTransportCategoryCodeType value) {
        this.dangerousGoodsTransportCategoryCode = value;
    }

    /**
     * Gets the value of the ergNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERGNumber() {
        return ergNumber;
    }

    /**
     * Sets the value of the ergNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERGNumber(String value) {
        this.ergNumber = value;
    }

    /**
     * Gets the value of the extremelyHazardousSubstanceQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getExtremelyHazardousSubstanceQuantity() {
        return extremelyHazardousSubstanceQuantity;
    }

    /**
     * Sets the value of the extremelyHazardousSubstanceQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setExtremelyHazardousSubstanceQuantity(MeasurementType value) {
        this.extremelyHazardousSubstanceQuantity = value;
    }

    /**
     * Gets the value of the hazardousClassSubsidiaryRiskCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardousClassSubsidiaryRiskCode() {
        return hazardousClassSubsidiaryRiskCode;
    }

    /**
     * Sets the value of the hazardousClassSubsidiaryRiskCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardousClassSubsidiaryRiskCode(String value) {
        this.hazardousClassSubsidiaryRiskCode = value;
    }

    /**
     * Gets the value of the netMassOfExplosives property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getNetMassOfExplosives() {
        return netMassOfExplosives;
    }

    /**
     * Sets the value of the netMassOfExplosives property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setNetMassOfExplosives(MeasurementType value) {
        this.netMassOfExplosives = value;
    }

    /**
     * Gets the value of the unitedNationsDangerousGoodsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitedNationsDangerousGoodsNumber() {
        return unitedNationsDangerousGoodsNumber;
    }

    /**
     * Sets the value of the unitedNationsDangerousGoodsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitedNationsDangerousGoodsNumber(String value) {
        this.unitedNationsDangerousGoodsNumber = value;
    }

    /**
     * Gets the value of the dangerousGoodsLimitedQuantityIndex property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getDangerousGoodsLimitedQuantityIndex() {
        return dangerousGoodsLimitedQuantityIndex;
    }

    /**
     * Sets the value of the dangerousGoodsLimitedQuantityIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setDangerousGoodsLimitedQuantityIndex(MeasurementType value) {
        this.dangerousGoodsLimitedQuantityIndex = value;
    }

    /**
     * Gets the value of the dangerousGoodsSubsidiaryClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dangerousGoodsSubsidiaryClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDangerousGoodsSubsidiaryClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDangerousGoodsSubsidiaryClass() {
        if (dangerousGoodsSubsidiaryClass == null) {
            dangerousGoodsSubsidiaryClass = new ArrayList<String>();
        }
        return this.dangerousGoodsSubsidiaryClass;
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
