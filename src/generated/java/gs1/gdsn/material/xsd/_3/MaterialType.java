
package gs1.gdsn.material.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.gdsn.gdsn_common.xsd._3.MaterialAgencyCodeType;
import gs1.shared.shared_common.xsd._3.Description5000Type;
import gs1.shared.shared_common.xsd._3.Description500Type;


/**
 * <p>Java class for MaterialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaterialType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="materialAgencyCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}MaterialAgencyCodeType" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemMaterialDesignationDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="materialStatement" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemMaterialDesignationCode" type="{urn:gs1:gdsn:material:xsd:3}TradeItemMaterialDesignationCodeType" minOccurs="0"/&gt;
 *         &lt;element name="isDesignationIntendedForSingleUse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canMaterialsBeSeparatedManually" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="numberOfDesignationUnits" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="materialComposition" type="{urn:gs1:gdsn:material:xsd:3}MaterialCompositionType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "MaterialType", propOrder = {
    "materialAgencyCode",
    "tradeItemMaterialDesignationDescription",
    "materialStatement",
    "tradeItemMaterialDesignationCode",
    "isDesignationIntendedForSingleUse",
    "canMaterialsBeSeparatedManually",
    "numberOfDesignationUnits",
    "materialComposition",
    "avpList"
})
public class MaterialType {

    protected MaterialAgencyCodeType materialAgencyCode;
    protected List<Description500Type> tradeItemMaterialDesignationDescription;
    protected List<Description5000Type> materialStatement;
    protected TradeItemMaterialDesignationCodeType tradeItemMaterialDesignationCode;
    protected Boolean isDesignationIntendedForSingleUse;
    protected Boolean canMaterialsBeSeparatedManually;
    protected BigInteger numberOfDesignationUnits;
    protected List<MaterialCompositionType> materialComposition;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the materialAgencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link MaterialAgencyCodeType }
     *     
     */
    public MaterialAgencyCodeType getMaterialAgencyCode() {
        return materialAgencyCode;
    }

    /**
     * Sets the value of the materialAgencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialAgencyCodeType }
     *     
     */
    public void setMaterialAgencyCode(MaterialAgencyCodeType value) {
        this.materialAgencyCode = value;
    }

    /**
     * Gets the value of the tradeItemMaterialDesignationDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemMaterialDesignationDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemMaterialDesignationDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getTradeItemMaterialDesignationDescription() {
        if (tradeItemMaterialDesignationDescription == null) {
            tradeItemMaterialDesignationDescription = new ArrayList<Description500Type>();
        }
        return this.tradeItemMaterialDesignationDescription;
    }

    /**
     * Gets the value of the materialStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getMaterialStatement() {
        if (materialStatement == null) {
            materialStatement = new ArrayList<Description5000Type>();
        }
        return this.materialStatement;
    }

    /**
     * Gets the value of the tradeItemMaterialDesignationCode property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemMaterialDesignationCodeType }
     *     
     */
    public TradeItemMaterialDesignationCodeType getTradeItemMaterialDesignationCode() {
        return tradeItemMaterialDesignationCode;
    }

    /**
     * Sets the value of the tradeItemMaterialDesignationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemMaterialDesignationCodeType }
     *     
     */
    public void setTradeItemMaterialDesignationCode(TradeItemMaterialDesignationCodeType value) {
        this.tradeItemMaterialDesignationCode = value;
    }

    /**
     * Gets the value of the isDesignationIntendedForSingleUse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDesignationIntendedForSingleUse() {
        return isDesignationIntendedForSingleUse;
    }

    /**
     * Sets the value of the isDesignationIntendedForSingleUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDesignationIntendedForSingleUse(Boolean value) {
        this.isDesignationIntendedForSingleUse = value;
    }

    /**
     * Gets the value of the canMaterialsBeSeparatedManually property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanMaterialsBeSeparatedManually() {
        return canMaterialsBeSeparatedManually;
    }

    /**
     * Sets the value of the canMaterialsBeSeparatedManually property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanMaterialsBeSeparatedManually(Boolean value) {
        this.canMaterialsBeSeparatedManually = value;
    }

    /**
     * Gets the value of the numberOfDesignationUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfDesignationUnits() {
        return numberOfDesignationUnits;
    }

    /**
     * Sets the value of the numberOfDesignationUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfDesignationUnits(BigInteger value) {
        this.numberOfDesignationUnits = value;
    }

    /**
     * Gets the value of the materialComposition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialComposition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialComposition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialCompositionType }
     * 
     * 
     */
    public List<MaterialCompositionType> getMaterialComposition() {
        if (materialComposition == null) {
            materialComposition = new ArrayList<MaterialCompositionType>();
        }
        return this.materialComposition;
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
