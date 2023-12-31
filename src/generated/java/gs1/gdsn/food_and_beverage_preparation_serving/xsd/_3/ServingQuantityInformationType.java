
package gs1.gdsn.food_and_beverage_preparation_serving.xsd._3;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.MeasurementPrecisionCodeType;
import gs1.shared.shared_common.xsd._3.Description500Type;


/**
 * <p>Java class for ServingQuantityInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServingQuantityInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maximumNumberOfSmallestUnitsPerPackage" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="numberOfServingsPerPackage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="numberOfServingsPerPackageMeasurementPrecisionCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}MeasurementPrecisionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="numberOfSmallestUnitsPerPackage" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="numberOfServingsRangeDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServingQuantityInformationType", propOrder = {
    "maximumNumberOfSmallestUnitsPerPackage",
    "numberOfServingsPerPackage",
    "numberOfServingsPerPackageMeasurementPrecisionCode",
    "numberOfSmallestUnitsPerPackage",
    "numberOfServingsRangeDescription"
})
public class ServingQuantityInformationType {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumNumberOfSmallestUnitsPerPackage;
    protected BigDecimal numberOfServingsPerPackage;
    protected MeasurementPrecisionCodeType numberOfServingsPerPackageMeasurementPrecisionCode;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfSmallestUnitsPerPackage;
    protected List<Description500Type> numberOfServingsRangeDescription;

    /**
     * Gets the value of the maximumNumberOfSmallestUnitsPerPackage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfSmallestUnitsPerPackage() {
        return maximumNumberOfSmallestUnitsPerPackage;
    }

    /**
     * Sets the value of the maximumNumberOfSmallestUnitsPerPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfSmallestUnitsPerPackage(BigInteger value) {
        this.maximumNumberOfSmallestUnitsPerPackage = value;
    }

    /**
     * Gets the value of the numberOfServingsPerPackage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfServingsPerPackage() {
        return numberOfServingsPerPackage;
    }

    /**
     * Sets the value of the numberOfServingsPerPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfServingsPerPackage(BigDecimal value) {
        this.numberOfServingsPerPackage = value;
    }

    /**
     * Gets the value of the numberOfServingsPerPackageMeasurementPrecisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public MeasurementPrecisionCodeType getNumberOfServingsPerPackageMeasurementPrecisionCode() {
        return numberOfServingsPerPackageMeasurementPrecisionCode;
    }

    /**
     * Sets the value of the numberOfServingsPerPackageMeasurementPrecisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public void setNumberOfServingsPerPackageMeasurementPrecisionCode(MeasurementPrecisionCodeType value) {
        this.numberOfServingsPerPackageMeasurementPrecisionCode = value;
    }

    /**
     * Gets the value of the numberOfSmallestUnitsPerPackage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSmallestUnitsPerPackage() {
        return numberOfSmallestUnitsPerPackage;
    }

    /**
     * Sets the value of the numberOfSmallestUnitsPerPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSmallestUnitsPerPackage(BigInteger value) {
        this.numberOfSmallestUnitsPerPackage = value;
    }

    /**
     * Gets the value of the numberOfServingsRangeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberOfServingsRangeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberOfServingsRangeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getNumberOfServingsRangeDescription() {
        if (numberOfServingsRangeDescription == null) {
            numberOfServingsRangeDescription = new ArrayList<Description500Type>();
        }
        return this.numberOfServingsRangeDescription;
    }

}
