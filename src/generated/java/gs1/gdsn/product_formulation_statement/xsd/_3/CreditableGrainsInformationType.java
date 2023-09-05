
package gs1.gdsn.product_formulation_statement.xsd._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for CreditableGrainsInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditableGrainsInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="creditableGrainStandard"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="creditableGrainAmountPerPortion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="doesTradeItemContainNoncreditableGrains" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="doesTradeItemMeetWholeGrainRichCriteria" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="noncreditableGrain" type="{urn:gs1:gdsn:product_formulation_statement:xsd:3}NoncreditableGrainType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="creditableGrain" type="{urn:gs1:gdsn:product_formulation_statement:xsd:3}CreditableGrainType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditableGrainsInformationType", propOrder = {
    "creditableGrainStandard",
    "creditableGrainAmountPerPortion",
    "doesTradeItemContainNoncreditableGrains",
    "doesTradeItemMeetWholeGrainRichCriteria",
    "noncreditableGrain",
    "creditableGrain"
})
public class CreditableGrainsInformationType {

    @XmlElement(required = true)
    protected String creditableGrainStandard;
    protected BigDecimal creditableGrainAmountPerPortion;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType doesTradeItemContainNoncreditableGrains;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType doesTradeItemMeetWholeGrainRichCriteria;
    protected List<NoncreditableGrainType> noncreditableGrain;
    protected List<CreditableGrainType> creditableGrain;

    /**
     * Gets the value of the creditableGrainStandard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditableGrainStandard() {
        return creditableGrainStandard;
    }

    /**
     * Sets the value of the creditableGrainStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditableGrainStandard(String value) {
        this.creditableGrainStandard = value;
    }

    /**
     * Gets the value of the creditableGrainAmountPerPortion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditableGrainAmountPerPortion() {
        return creditableGrainAmountPerPortion;
    }

    /**
     * Sets the value of the creditableGrainAmountPerPortion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditableGrainAmountPerPortion(BigDecimal value) {
        this.creditableGrainAmountPerPortion = value;
    }

    /**
     * Gets the value of the doesTradeItemContainNoncreditableGrains property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getDoesTradeItemContainNoncreditableGrains() {
        return doesTradeItemContainNoncreditableGrains;
    }

    /**
     * Sets the value of the doesTradeItemContainNoncreditableGrains property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setDoesTradeItemContainNoncreditableGrains(NonBinaryLogicEnumerationType value) {
        this.doesTradeItemContainNoncreditableGrains = value;
    }

    /**
     * Gets the value of the doesTradeItemMeetWholeGrainRichCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getDoesTradeItemMeetWholeGrainRichCriteria() {
        return doesTradeItemMeetWholeGrainRichCriteria;
    }

    /**
     * Sets the value of the doesTradeItemMeetWholeGrainRichCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setDoesTradeItemMeetWholeGrainRichCriteria(NonBinaryLogicEnumerationType value) {
        this.doesTradeItemMeetWholeGrainRichCriteria = value;
    }

    /**
     * Gets the value of the noncreditableGrain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noncreditableGrain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoncreditableGrain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoncreditableGrainType }
     * 
     * 
     */
    public List<NoncreditableGrainType> getNoncreditableGrain() {
        if (noncreditableGrain == null) {
            noncreditableGrain = new ArrayList<NoncreditableGrainType>();
        }
        return this.noncreditableGrain;
    }

    /**
     * Gets the value of the creditableGrain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditableGrain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditableGrain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditableGrainType }
     * 
     * 
     */
    public List<CreditableGrainType> getCreditableGrain() {
        if (creditableGrain == null) {
            creditableGrain = new ArrayList<CreditableGrainType>();
        }
        return this.creditableGrain;
    }

}
