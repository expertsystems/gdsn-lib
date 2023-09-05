
package gs1.gdsn.dairy_fish_meat_poultry.xsd._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for DairyFishMeatPoultryInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DairyFishMeatPoultryInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="casingTareWeight" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="fatInMilkContent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="isHomogenised" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="saltMoistureContentCode" type="{urn:gs1:gdsn:dairy_fish_meat_poultry:xsd:3}SaltMoistureContentCodeType" minOccurs="0"/&gt;
 *         &lt;element name="cheeseInformation" type="{urn:gs1:gdsn:dairy_fish_meat_poultry:xsd:3}CheeseInformationType" minOccurs="0"/&gt;
 *         &lt;element name="fishMeatPoultryContent" type="{urn:gs1:gdsn:dairy_fish_meat_poultry:xsd:3}FishMeatPoultryContentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fishReportingInformation" type="{urn:gs1:gdsn:dairy_fish_meat_poultry:xsd:3}FishReportingInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "DairyFishMeatPoultryInformationType", propOrder = {
    "casingTareWeight",
    "fatInMilkContent",
    "isHomogenised",
    "saltMoistureContentCode",
    "cheeseInformation",
    "fishMeatPoultryContent",
    "fishReportingInformation",
    "avpList"
})
public class DairyFishMeatPoultryInformationType {

    protected MeasurementType casingTareWeight;
    protected BigDecimal fatInMilkContent;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isHomogenised;
    protected SaltMoistureContentCodeType saltMoistureContentCode;
    protected CheeseInformationType cheeseInformation;
    protected List<FishMeatPoultryContentType> fishMeatPoultryContent;
    protected List<FishReportingInformationType> fishReportingInformation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the casingTareWeight property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getCasingTareWeight() {
        return casingTareWeight;
    }

    /**
     * Sets the value of the casingTareWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setCasingTareWeight(MeasurementType value) {
        this.casingTareWeight = value;
    }

    /**
     * Gets the value of the fatInMilkContent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFatInMilkContent() {
        return fatInMilkContent;
    }

    /**
     * Sets the value of the fatInMilkContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFatInMilkContent(BigDecimal value) {
        this.fatInMilkContent = value;
    }

    /**
     * Gets the value of the isHomogenised property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsHomogenised() {
        return isHomogenised;
    }

    /**
     * Sets the value of the isHomogenised property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsHomogenised(NonBinaryLogicEnumerationType value) {
        this.isHomogenised = value;
    }

    /**
     * Gets the value of the saltMoistureContentCode property.
     * 
     * @return
     *     possible object is
     *     {@link SaltMoistureContentCodeType }
     *     
     */
    public SaltMoistureContentCodeType getSaltMoistureContentCode() {
        return saltMoistureContentCode;
    }

    /**
     * Sets the value of the saltMoistureContentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaltMoistureContentCodeType }
     *     
     */
    public void setSaltMoistureContentCode(SaltMoistureContentCodeType value) {
        this.saltMoistureContentCode = value;
    }

    /**
     * Gets the value of the cheeseInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CheeseInformationType }
     *     
     */
    public CheeseInformationType getCheeseInformation() {
        return cheeseInformation;
    }

    /**
     * Sets the value of the cheeseInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheeseInformationType }
     *     
     */
    public void setCheeseInformation(CheeseInformationType value) {
        this.cheeseInformation = value;
    }

    /**
     * Gets the value of the fishMeatPoultryContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fishMeatPoultryContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFishMeatPoultryContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FishMeatPoultryContentType }
     * 
     * 
     */
    public List<FishMeatPoultryContentType> getFishMeatPoultryContent() {
        if (fishMeatPoultryContent == null) {
            fishMeatPoultryContent = new ArrayList<FishMeatPoultryContentType>();
        }
        return this.fishMeatPoultryContent;
    }

    /**
     * Gets the value of the fishReportingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fishReportingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFishReportingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FishReportingInformationType }
     * 
     * 
     */
    public List<FishReportingInformationType> getFishReportingInformation() {
        if (fishReportingInformation == null) {
            fishReportingInformation = new ArrayList<FishReportingInformationType>();
        }
        return this.fishReportingInformation;
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
