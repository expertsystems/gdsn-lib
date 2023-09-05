
package gs1.gdsn.packaging_sustainability.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;


/**
 * <p>Java class for PackagingSustainabilityEconomicIndicatorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingSustainabilityEconomicIndicatorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="communityInvestmentRatio" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="packagedUnpackagedShelfLifeRatio" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="packagedProductWastagePercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="packagingEconomicCost" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}PackagingEconomicCostType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PackagingSustainabilityEconomicIndicatorsType", propOrder = {
    "communityInvestmentRatio",
    "packagedUnpackagedShelfLifeRatio",
    "packagedProductWastagePercent",
    "packagingEconomicCost",
    "avpList"
})
public class PackagingSustainabilityEconomicIndicatorsType {

    protected Float communityInvestmentRatio;
    protected Float packagedUnpackagedShelfLifeRatio;
    protected Float packagedProductWastagePercent;
    protected List<PackagingEconomicCostType> packagingEconomicCost;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the communityInvestmentRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCommunityInvestmentRatio() {
        return communityInvestmentRatio;
    }

    /**
     * Sets the value of the communityInvestmentRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCommunityInvestmentRatio(Float value) {
        this.communityInvestmentRatio = value;
    }

    /**
     * Gets the value of the packagedUnpackagedShelfLifeRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPackagedUnpackagedShelfLifeRatio() {
        return packagedUnpackagedShelfLifeRatio;
    }

    /**
     * Sets the value of the packagedUnpackagedShelfLifeRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPackagedUnpackagedShelfLifeRatio(Float value) {
        this.packagedUnpackagedShelfLifeRatio = value;
    }

    /**
     * Gets the value of the packagedProductWastagePercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPackagedProductWastagePercent() {
        return packagedProductWastagePercent;
    }

    /**
     * Sets the value of the packagedProductWastagePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPackagedProductWastagePercent(Float value) {
        this.packagedProductWastagePercent = value;
    }

    /**
     * Gets the value of the packagingEconomicCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingEconomicCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingEconomicCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingEconomicCostType }
     * 
     * 
     */
    public List<PackagingEconomicCostType> getPackagingEconomicCost() {
        if (packagingEconomicCost == null) {
            packagingEconomicCost = new ArrayList<PackagingEconomicCostType>();
        }
        return this.packagingEconomicCost;
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
