
package gs1.gdsn.packaging_sustainability.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;


/**
 * <p>Java class for LifeCycleIndicatorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LifeCycleIndicatorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="massEquivalent" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}MassEquivalentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="toxicityProperties" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}ToxicityPropertiesType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="acidificationPotential" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}AcidificationPotentialType" minOccurs="0"/&gt;
 *         &lt;element name="cumulativeEnergyDemand" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}CumulativeEnergyDemandType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="freshWaterEcotoxicityPotential" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}FreshWaterEcotoxicityPotentialType" minOccurs="0"/&gt;
 *         &lt;element name="aquaticEutrophication" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}AquaticEutrophicationType" minOccurs="0"/&gt;
 *         &lt;element name="globalWarmingPotential" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}GlobalWarmingPotentialType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "LifeCycleIndicatorsType", propOrder = {
    "massEquivalent",
    "toxicityProperties",
    "acidificationPotential",
    "cumulativeEnergyDemand",
    "freshWaterEcotoxicityPotential",
    "aquaticEutrophication",
    "globalWarmingPotential",
    "avpList"
})
public class LifeCycleIndicatorsType {

    protected List<MassEquivalentType> massEquivalent;
    protected List<ToxicityPropertiesType> toxicityProperties;
    protected AcidificationPotentialType acidificationPotential;
    protected List<CumulativeEnergyDemandType> cumulativeEnergyDemand;
    protected FreshWaterEcotoxicityPotentialType freshWaterEcotoxicityPotential;
    protected AquaticEutrophicationType aquaticEutrophication;
    protected List<GlobalWarmingPotentialType> globalWarmingPotential;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the massEquivalent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the massEquivalent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMassEquivalent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MassEquivalentType }
     * 
     * 
     */
    public List<MassEquivalentType> getMassEquivalent() {
        if (massEquivalent == null) {
            massEquivalent = new ArrayList<MassEquivalentType>();
        }
        return this.massEquivalent;
    }

    /**
     * Gets the value of the toxicityProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toxicityProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToxicityProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ToxicityPropertiesType }
     * 
     * 
     */
    public List<ToxicityPropertiesType> getToxicityProperties() {
        if (toxicityProperties == null) {
            toxicityProperties = new ArrayList<ToxicityPropertiesType>();
        }
        return this.toxicityProperties;
    }

    /**
     * Gets the value of the acidificationPotential property.
     * 
     * @return
     *     possible object is
     *     {@link AcidificationPotentialType }
     *     
     */
    public AcidificationPotentialType getAcidificationPotential() {
        return acidificationPotential;
    }

    /**
     * Sets the value of the acidificationPotential property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcidificationPotentialType }
     *     
     */
    public void setAcidificationPotential(AcidificationPotentialType value) {
        this.acidificationPotential = value;
    }

    /**
     * Gets the value of the cumulativeEnergyDemand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cumulativeEnergyDemand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCumulativeEnergyDemand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CumulativeEnergyDemandType }
     * 
     * 
     */
    public List<CumulativeEnergyDemandType> getCumulativeEnergyDemand() {
        if (cumulativeEnergyDemand == null) {
            cumulativeEnergyDemand = new ArrayList<CumulativeEnergyDemandType>();
        }
        return this.cumulativeEnergyDemand;
    }

    /**
     * Gets the value of the freshWaterEcotoxicityPotential property.
     * 
     * @return
     *     possible object is
     *     {@link FreshWaterEcotoxicityPotentialType }
     *     
     */
    public FreshWaterEcotoxicityPotentialType getFreshWaterEcotoxicityPotential() {
        return freshWaterEcotoxicityPotential;
    }

    /**
     * Sets the value of the freshWaterEcotoxicityPotential property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreshWaterEcotoxicityPotentialType }
     *     
     */
    public void setFreshWaterEcotoxicityPotential(FreshWaterEcotoxicityPotentialType value) {
        this.freshWaterEcotoxicityPotential = value;
    }

    /**
     * Gets the value of the aquaticEutrophication property.
     * 
     * @return
     *     possible object is
     *     {@link AquaticEutrophicationType }
     *     
     */
    public AquaticEutrophicationType getAquaticEutrophication() {
        return aquaticEutrophication;
    }

    /**
     * Sets the value of the aquaticEutrophication property.
     * 
     * @param value
     *     allowed object is
     *     {@link AquaticEutrophicationType }
     *     
     */
    public void setAquaticEutrophication(AquaticEutrophicationType value) {
        this.aquaticEutrophication = value;
    }

    /**
     * Gets the value of the globalWarmingPotential property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalWarmingPotential property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalWarmingPotential().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalWarmingPotentialType }
     * 
     * 
     */
    public List<GlobalWarmingPotentialType> getGlobalWarmingPotential() {
        if (globalWarmingPotential == null) {
            globalWarmingPotential = new ArrayList<GlobalWarmingPotentialType>();
        }
        return this.globalWarmingPotential;
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
