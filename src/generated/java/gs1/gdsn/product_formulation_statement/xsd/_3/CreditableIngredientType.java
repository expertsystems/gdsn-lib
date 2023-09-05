
package gs1.gdsn.product_formulation_statement.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for CreditableIngredientType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditableIngredientType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="creditableIngredientTypeCode" type="{urn:gs1:gdsn:product_formulation_statement:xsd:3}CreditableIngredientTypeCodeType"/&gt;
 *         &lt;element name="totalCreditableIngredientTypeAmount" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="creditableIngredientDetails" type="{urn:gs1:gdsn:product_formulation_statement:xsd:3}CreditableIngredientDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditableIngredientType", propOrder = {
    "creditableIngredientTypeCode",
    "totalCreditableIngredientTypeAmount",
    "creditableIngredientDetails"
})
public class CreditableIngredientType {

    @XmlElement(required = true)
    protected CreditableIngredientTypeCodeType creditableIngredientTypeCode;
    protected List<MeasurementType> totalCreditableIngredientTypeAmount;
    protected List<CreditableIngredientDetailsType> creditableIngredientDetails;

    /**
     * Gets the value of the creditableIngredientTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CreditableIngredientTypeCodeType }
     *     
     */
    public CreditableIngredientTypeCodeType getCreditableIngredientTypeCode() {
        return creditableIngredientTypeCode;
    }

    /**
     * Sets the value of the creditableIngredientTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditableIngredientTypeCodeType }
     *     
     */
    public void setCreditableIngredientTypeCode(CreditableIngredientTypeCodeType value) {
        this.creditableIngredientTypeCode = value;
    }

    /**
     * Gets the value of the totalCreditableIngredientTypeAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalCreditableIngredientTypeAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalCreditableIngredientTypeAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getTotalCreditableIngredientTypeAmount() {
        if (totalCreditableIngredientTypeAmount == null) {
            totalCreditableIngredientTypeAmount = new ArrayList<MeasurementType>();
        }
        return this.totalCreditableIngredientTypeAmount;
    }

    /**
     * Gets the value of the creditableIngredientDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditableIngredientDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditableIngredientDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditableIngredientDetailsType }
     * 
     * 
     */
    public List<CreditableIngredientDetailsType> getCreditableIngredientDetails() {
        if (creditableIngredientDetails == null) {
            creditableIngredientDetails = new ArrayList<CreditableIngredientDetailsType>();
        }
        return this.creditableIngredientDetails;
    }

}
