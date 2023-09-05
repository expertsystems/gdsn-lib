
package gs1.gdsn.product_formulation_statement.xsd._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for CreditableAlternativeProteinType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditableAlternativeProteinType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="containedAlternativeProteinPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creditableAlternativeProteinPerPortion" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditableAlternativeProteinType", propOrder = {
    "containedAlternativeProteinPercent",
    "creditableAlternativeProteinPerPortion"
})
public class CreditableAlternativeProteinType {

    protected BigDecimal containedAlternativeProteinPercent;
    protected List<MeasurementType> creditableAlternativeProteinPerPortion;

    /**
     * Gets the value of the containedAlternativeProteinPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getContainedAlternativeProteinPercent() {
        return containedAlternativeProteinPercent;
    }

    /**
     * Sets the value of the containedAlternativeProteinPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setContainedAlternativeProteinPercent(BigDecimal value) {
        this.containedAlternativeProteinPercent = value;
    }

    /**
     * Gets the value of the creditableAlternativeProteinPerPortion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditableAlternativeProteinPerPortion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditableAlternativeProteinPerPortion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getCreditableAlternativeProteinPerPortion() {
        if (creditableAlternativeProteinPerPortion == null) {
            creditableAlternativeProteinPerPortion = new ArrayList<MeasurementType>();
        }
        return this.creditableAlternativeProteinPerPortion;
    }

}
