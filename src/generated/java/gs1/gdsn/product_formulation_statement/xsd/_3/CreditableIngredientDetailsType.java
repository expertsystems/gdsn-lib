
package gs1.gdsn.product_formulation_statement.xsd._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description500Type;


/**
 * <p>Java class for CreditableIngredientDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditableIngredientDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="creditableIngredientDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="creditableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creditableIngredientAmountPerRawPortion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="yieldServingsPerUnit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creditableAlternativeProtein" type="{urn:gs1:gdsn:product_formulation_statement:xsd:3}CreditableAlternativeProteinType" minOccurs="0"/&gt;
 *         &lt;element name="creditableGrainsInformation" type="{urn:gs1:gdsn:product_formulation_statement:xsd:3}CreditableGrainsInformationType" minOccurs="0"/&gt;
 *         &lt;element name="creditableVegetable" type="{urn:gs1:gdsn:product_formulation_statement:xsd:3}CreditableVegetableType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditableIngredientDetailsType", propOrder = {
    "creditableIngredientDescription",
    "creditableAmount",
    "creditableIngredientAmountPerRawPortion",
    "yieldServingsPerUnit",
    "creditableAlternativeProtein",
    "creditableGrainsInformation",
    "creditableVegetable"
})
public class CreditableIngredientDetailsType {

    @XmlElement(required = true)
    protected List<Description500Type> creditableIngredientDescription;
    protected BigDecimal creditableAmount;
    protected BigDecimal creditableIngredientAmountPerRawPortion;
    protected BigDecimal yieldServingsPerUnit;
    protected CreditableAlternativeProteinType creditableAlternativeProtein;
    protected CreditableGrainsInformationType creditableGrainsInformation;
    protected List<CreditableVegetableType> creditableVegetable;

    /**
     * Gets the value of the creditableIngredientDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditableIngredientDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditableIngredientDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getCreditableIngredientDescription() {
        if (creditableIngredientDescription == null) {
            creditableIngredientDescription = new ArrayList<Description500Type>();
        }
        return this.creditableIngredientDescription;
    }

    /**
     * Gets the value of the creditableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditableAmount() {
        return creditableAmount;
    }

    /**
     * Sets the value of the creditableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditableAmount(BigDecimal value) {
        this.creditableAmount = value;
    }

    /**
     * Gets the value of the creditableIngredientAmountPerRawPortion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditableIngredientAmountPerRawPortion() {
        return creditableIngredientAmountPerRawPortion;
    }

    /**
     * Sets the value of the creditableIngredientAmountPerRawPortion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditableIngredientAmountPerRawPortion(BigDecimal value) {
        this.creditableIngredientAmountPerRawPortion = value;
    }

    /**
     * Gets the value of the yieldServingsPerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYieldServingsPerUnit() {
        return yieldServingsPerUnit;
    }

    /**
     * Sets the value of the yieldServingsPerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYieldServingsPerUnit(BigDecimal value) {
        this.yieldServingsPerUnit = value;
    }

    /**
     * Gets the value of the creditableAlternativeProtein property.
     * 
     * @return
     *     possible object is
     *     {@link CreditableAlternativeProteinType }
     *     
     */
    public CreditableAlternativeProteinType getCreditableAlternativeProtein() {
        return creditableAlternativeProtein;
    }

    /**
     * Sets the value of the creditableAlternativeProtein property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditableAlternativeProteinType }
     *     
     */
    public void setCreditableAlternativeProtein(CreditableAlternativeProteinType value) {
        this.creditableAlternativeProtein = value;
    }

    /**
     * Gets the value of the creditableGrainsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CreditableGrainsInformationType }
     *     
     */
    public CreditableGrainsInformationType getCreditableGrainsInformation() {
        return creditableGrainsInformation;
    }

    /**
     * Sets the value of the creditableGrainsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditableGrainsInformationType }
     *     
     */
    public void setCreditableGrainsInformation(CreditableGrainsInformationType value) {
        this.creditableGrainsInformation = value;
    }

    /**
     * Gets the value of the creditableVegetable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditableVegetable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditableVegetable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditableVegetableType }
     * 
     * 
     */
    public List<CreditableVegetableType> getCreditableVegetable() {
        if (creditableVegetable == null) {
            creditableVegetable = new ArrayList<CreditableVegetableType>();
        }
        return this.creditableVegetable;
    }

}
