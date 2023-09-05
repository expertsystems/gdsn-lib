
package gs1.gdsn.product_formulation_statement.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for CreditableVegetableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditableVegetableType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vegetableSubgroupCode" type="{urn:gs1:gdsn:product_formulation_statement:xsd:3}VegetableSubgroupCodeType"/&gt;
 *         &lt;element name="totalVegetableSubgroupAmount" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditableVegetableType", propOrder = {
    "vegetableSubgroupCode",
    "totalVegetableSubgroupAmount"
})
public class CreditableVegetableType {

    @XmlElement(required = true)
    protected VegetableSubgroupCodeType vegetableSubgroupCode;
    protected List<MeasurementType> totalVegetableSubgroupAmount;

    /**
     * Gets the value of the vegetableSubgroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link VegetableSubgroupCodeType }
     *     
     */
    public VegetableSubgroupCodeType getVegetableSubgroupCode() {
        return vegetableSubgroupCode;
    }

    /**
     * Sets the value of the vegetableSubgroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VegetableSubgroupCodeType }
     *     
     */
    public void setVegetableSubgroupCode(VegetableSubgroupCodeType value) {
        this.vegetableSubgroupCode = value;
    }

    /**
     * Gets the value of the totalVegetableSubgroupAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalVegetableSubgroupAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalVegetableSubgroupAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getTotalVegetableSubgroupAmount() {
        if (totalVegetableSubgroupAmount == null) {
            totalVegetableSubgroupAmount = new ArrayList<MeasurementType>();
        }
        return this.totalVegetableSubgroupAmount;
    }

}
