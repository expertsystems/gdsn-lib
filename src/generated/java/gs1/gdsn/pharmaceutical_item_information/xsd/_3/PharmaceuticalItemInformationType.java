
package gs1.gdsn.pharmaceutical_item_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.ExternalCodeValueInformationType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.Description2500Type;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for PharmaceuticalItemInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PharmaceuticalItemInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isTradeItemConsideredDopingProduct" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemMarkedNoShake" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="drugInteractions" type="{urn:gs1:shared:shared_common:xsd:3}Description2500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="drugPreparations" type="{urn:gs1:shared:shared_common:xsd:3}Description2500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="drugSideEffectsAndWarnings" type="{urn:gs1:shared:shared_common:xsd:3}Description2500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isOrphanDrug" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="dosage" type="{urn:gs1:gdsn:pharmaceutical_item_information:xsd:3}DosageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="psychotropicSubstance" type="{urn:gs1:gdsn:gdsn_common:xsd:3}ExternalCodeValueInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PharmaceuticalItemInformationType", propOrder = {
    "isTradeItemConsideredDopingProduct",
    "isTradeItemMarkedNoShake",
    "drugInteractions",
    "drugPreparations",
    "drugSideEffectsAndWarnings",
    "isOrphanDrug",
    "dosage",
    "psychotropicSubstance",
    "avpList"
})
public class PharmaceuticalItemInformationType {

    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isTradeItemConsideredDopingProduct;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isTradeItemMarkedNoShake;
    protected List<Description2500Type> drugInteractions;
    protected List<Description2500Type> drugPreparations;
    protected List<Description2500Type> drugSideEffectsAndWarnings;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isOrphanDrug;
    protected List<DosageType> dosage;
    protected List<ExternalCodeValueInformationType> psychotropicSubstance;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the isTradeItemConsideredDopingProduct property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsTradeItemConsideredDopingProduct() {
        return isTradeItemConsideredDopingProduct;
    }

    /**
     * Sets the value of the isTradeItemConsideredDopingProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsTradeItemConsideredDopingProduct(NonBinaryLogicEnumerationType value) {
        this.isTradeItemConsideredDopingProduct = value;
    }

    /**
     * Gets the value of the isTradeItemMarkedNoShake property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsTradeItemMarkedNoShake() {
        return isTradeItemMarkedNoShake;
    }

    /**
     * Sets the value of the isTradeItemMarkedNoShake property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsTradeItemMarkedNoShake(NonBinaryLogicEnumerationType value) {
        this.isTradeItemMarkedNoShake = value;
    }

    /**
     * Gets the value of the drugInteractions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drugInteractions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrugInteractions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description2500Type }
     * 
     * 
     */
    public List<Description2500Type> getDrugInteractions() {
        if (drugInteractions == null) {
            drugInteractions = new ArrayList<Description2500Type>();
        }
        return this.drugInteractions;
    }

    /**
     * Gets the value of the drugPreparations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drugPreparations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrugPreparations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description2500Type }
     * 
     * 
     */
    public List<Description2500Type> getDrugPreparations() {
        if (drugPreparations == null) {
            drugPreparations = new ArrayList<Description2500Type>();
        }
        return this.drugPreparations;
    }

    /**
     * Gets the value of the drugSideEffectsAndWarnings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drugSideEffectsAndWarnings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrugSideEffectsAndWarnings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description2500Type }
     * 
     * 
     */
    public List<Description2500Type> getDrugSideEffectsAndWarnings() {
        if (drugSideEffectsAndWarnings == null) {
            drugSideEffectsAndWarnings = new ArrayList<Description2500Type>();
        }
        return this.drugSideEffectsAndWarnings;
    }

    /**
     * Gets the value of the isOrphanDrug property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsOrphanDrug() {
        return isOrphanDrug;
    }

    /**
     * Sets the value of the isOrphanDrug property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsOrphanDrug(NonBinaryLogicEnumerationType value) {
        this.isOrphanDrug = value;
    }

    /**
     * Gets the value of the dosage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dosage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDosage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DosageType }
     * 
     * 
     */
    public List<DosageType> getDosage() {
        if (dosage == null) {
            dosage = new ArrayList<DosageType>();
        }
        return this.dosage;
    }

    /**
     * Gets the value of the psychotropicSubstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the psychotropicSubstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPsychotropicSubstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalCodeValueInformationType }
     * 
     * 
     */
    public List<ExternalCodeValueInformationType> getPsychotropicSubstance() {
        if (psychotropicSubstance == null) {
            psychotropicSubstance = new ArrayList<ExternalCodeValueInformationType>();
        }
        return this.psychotropicSubstance;
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
