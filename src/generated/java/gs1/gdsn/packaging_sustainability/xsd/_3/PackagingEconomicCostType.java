
package gs1.gdsn.packaging_sustainability.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.AmountType;
import gs1.shared.shared_common.xsd._3.Description80Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for PackagingEconomicCostType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingEconomicCostType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="totalPackagingEconomicCostAmountBasis" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="totalPackagingEconomicCostMeasurementCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}TotalPackagingEconomicCostMeasurementCodeType" minOccurs="0"/&gt;
 *         &lt;element name="totalPackagingEconomicCostMeasurementDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="totalPackagingEconomicCostAmount" type="{urn:gs1:shared:shared_common:xsd:3}AmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingEconomicCostType", propOrder = {
    "totalPackagingEconomicCostAmountBasis",
    "totalPackagingEconomicCostMeasurementCode",
    "totalPackagingEconomicCostMeasurementDescription",
    "totalPackagingEconomicCostAmount"
})
public class PackagingEconomicCostType {

    protected MeasurementType totalPackagingEconomicCostAmountBasis;
    protected TotalPackagingEconomicCostMeasurementCodeType totalPackagingEconomicCostMeasurementCode;
    protected List<Description80Type> totalPackagingEconomicCostMeasurementDescription;
    protected List<AmountType> totalPackagingEconomicCostAmount;

    /**
     * Gets the value of the totalPackagingEconomicCostAmountBasis property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getTotalPackagingEconomicCostAmountBasis() {
        return totalPackagingEconomicCostAmountBasis;
    }

    /**
     * Sets the value of the totalPackagingEconomicCostAmountBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setTotalPackagingEconomicCostAmountBasis(MeasurementType value) {
        this.totalPackagingEconomicCostAmountBasis = value;
    }

    /**
     * Gets the value of the totalPackagingEconomicCostMeasurementCode property.
     * 
     * @return
     *     possible object is
     *     {@link TotalPackagingEconomicCostMeasurementCodeType }
     *     
     */
    public TotalPackagingEconomicCostMeasurementCodeType getTotalPackagingEconomicCostMeasurementCode() {
        return totalPackagingEconomicCostMeasurementCode;
    }

    /**
     * Sets the value of the totalPackagingEconomicCostMeasurementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalPackagingEconomicCostMeasurementCodeType }
     *     
     */
    public void setTotalPackagingEconomicCostMeasurementCode(TotalPackagingEconomicCostMeasurementCodeType value) {
        this.totalPackagingEconomicCostMeasurementCode = value;
    }

    /**
     * Gets the value of the totalPackagingEconomicCostMeasurementDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalPackagingEconomicCostMeasurementDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalPackagingEconomicCostMeasurementDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getTotalPackagingEconomicCostMeasurementDescription() {
        if (totalPackagingEconomicCostMeasurementDescription == null) {
            totalPackagingEconomicCostMeasurementDescription = new ArrayList<Description80Type>();
        }
        return this.totalPackagingEconomicCostMeasurementDescription;
    }

    /**
     * Gets the value of the totalPackagingEconomicCostAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalPackagingEconomicCostAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalPackagingEconomicCostAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getTotalPackagingEconomicCostAmount() {
        if (totalPackagingEconomicCostAmount == null) {
            totalPackagingEconomicCostAmount = new ArrayList<AmountType>();
        }
        return this.totalPackagingEconomicCostAmount;
    }

}
