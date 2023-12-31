
package gs1.gdsn.sales_information.xsd._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.AllowanceChargeTypeCodeType;
import gs1.shared.shared_common.xsd._3.AllowanceOrChargeEnumerationType;
import gs1.shared.shared_common.xsd._3.AmountType;
import gs1.shared.shared_common.xsd._3.Description500Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for ApplicableAllowanceChargeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicableAllowanceChargeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="allowanceChargeTypeCode" type="{urn:gs1:shared:shared_common:xsd:3}AllowanceChargeTypeCodeType"/&gt;
 *         &lt;element name="allowanceOrChargeType" type="{urn:gs1:shared:shared_common:xsd:3}AllowanceOrChargeEnumerationType"/&gt;
 *         &lt;element name="allowanceChargeAmount" type="{urn:gs1:shared:shared_common:xsd:3}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="allowanceChargeDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="allowanceChargePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="amountPerUnit" type="{urn:gs1:shared:shared_common:xsd:3}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="baseAmount" type="{urn:gs1:shared:shared_common:xsd:3}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="baseNumberOfUnits" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="bracketIdentifier" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicableAllowanceChargeType", propOrder = {
    "allowanceChargeTypeCode",
    "allowanceOrChargeType",
    "allowanceChargeAmount",
    "allowanceChargeDescription",
    "allowanceChargePercentage",
    "amountPerUnit",
    "baseAmount",
    "baseNumberOfUnits",
    "bracketIdentifier"
})
public class ApplicableAllowanceChargeType {

    @XmlElement(required = true)
    protected AllowanceChargeTypeCodeType allowanceChargeTypeCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AllowanceOrChargeEnumerationType allowanceOrChargeType;
    protected AmountType allowanceChargeAmount;
    protected List<Description500Type> allowanceChargeDescription;
    protected BigDecimal allowanceChargePercentage;
    protected AmountType amountPerUnit;
    protected AmountType baseAmount;
    protected MeasurementType baseNumberOfUnits;
    protected List<String> bracketIdentifier;

    /**
     * Gets the value of the allowanceChargeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link AllowanceChargeTypeCodeType }
     *     
     */
    public AllowanceChargeTypeCodeType getAllowanceChargeTypeCode() {
        return allowanceChargeTypeCode;
    }

    /**
     * Sets the value of the allowanceChargeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowanceChargeTypeCodeType }
     *     
     */
    public void setAllowanceChargeTypeCode(AllowanceChargeTypeCodeType value) {
        this.allowanceChargeTypeCode = value;
    }

    /**
     * Gets the value of the allowanceOrChargeType property.
     * 
     * @return
     *     possible object is
     *     {@link AllowanceOrChargeEnumerationType }
     *     
     */
    public AllowanceOrChargeEnumerationType getAllowanceOrChargeType() {
        return allowanceOrChargeType;
    }

    /**
     * Sets the value of the allowanceOrChargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowanceOrChargeEnumerationType }
     *     
     */
    public void setAllowanceOrChargeType(AllowanceOrChargeEnumerationType value) {
        this.allowanceOrChargeType = value;
    }

    /**
     * Gets the value of the allowanceChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAllowanceChargeAmount() {
        return allowanceChargeAmount;
    }

    /**
     * Sets the value of the allowanceChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAllowanceChargeAmount(AmountType value) {
        this.allowanceChargeAmount = value;
    }

    /**
     * Gets the value of the allowanceChargeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowanceChargeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowanceChargeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getAllowanceChargeDescription() {
        if (allowanceChargeDescription == null) {
            allowanceChargeDescription = new ArrayList<Description500Type>();
        }
        return this.allowanceChargeDescription;
    }

    /**
     * Gets the value of the allowanceChargePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAllowanceChargePercentage() {
        return allowanceChargePercentage;
    }

    /**
     * Sets the value of the allowanceChargePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAllowanceChargePercentage(BigDecimal value) {
        this.allowanceChargePercentage = value;
    }

    /**
     * Gets the value of the amountPerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountPerUnit() {
        return amountPerUnit;
    }

    /**
     * Sets the value of the amountPerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountPerUnit(AmountType value) {
        this.amountPerUnit = value;
    }

    /**
     * Gets the value of the baseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBaseAmount(AmountType value) {
        this.baseAmount = value;
    }

    /**
     * Gets the value of the baseNumberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getBaseNumberOfUnits() {
        return baseNumberOfUnits;
    }

    /**
     * Sets the value of the baseNumberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setBaseNumberOfUnits(MeasurementType value) {
        this.baseNumberOfUnits = value;
    }

    /**
     * Gets the value of the bracketIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bracketIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBracketIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBracketIdentifier() {
        if (bracketIdentifier == null) {
            bracketIdentifier = new ArrayList<String>();
        }
        return this.bracketIdentifier;
    }

}
