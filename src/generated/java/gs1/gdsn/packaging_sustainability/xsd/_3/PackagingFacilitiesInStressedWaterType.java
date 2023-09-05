
package gs1.gdsn.packaging_sustainability.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description200Type;


/**
 * <p>Java class for PackagingFacilitiesInStressedWaterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingFacilitiesInStressedWaterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="facilitiesInStressedWaterAreaPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="facilitiesInStressedWaterAreaCalculationMethod" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="numberOfFacilitiesInStressedWaterArea" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingFacilitiesInStressedWaterType", propOrder = {
    "facilitiesInStressedWaterAreaPercent",
    "facilitiesInStressedWaterAreaCalculationMethod",
    "numberOfFacilitiesInStressedWaterArea"
})
public class PackagingFacilitiesInStressedWaterType {

    protected Float facilitiesInStressedWaterAreaPercent;
    protected List<Description200Type> facilitiesInStressedWaterAreaCalculationMethod;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfFacilitiesInStressedWaterArea;

    /**
     * Gets the value of the facilitiesInStressedWaterAreaPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFacilitiesInStressedWaterAreaPercent() {
        return facilitiesInStressedWaterAreaPercent;
    }

    /**
     * Sets the value of the facilitiesInStressedWaterAreaPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFacilitiesInStressedWaterAreaPercent(Float value) {
        this.facilitiesInStressedWaterAreaPercent = value;
    }

    /**
     * Gets the value of the facilitiesInStressedWaterAreaCalculationMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilitiesInStressedWaterAreaCalculationMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilitiesInStressedWaterAreaCalculationMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description200Type }
     * 
     * 
     */
    public List<Description200Type> getFacilitiesInStressedWaterAreaCalculationMethod() {
        if (facilitiesInStressedWaterAreaCalculationMethod == null) {
            facilitiesInStressedWaterAreaCalculationMethod = new ArrayList<Description200Type>();
        }
        return this.facilitiesInStressedWaterAreaCalculationMethod;
    }

    /**
     * Gets the value of the numberOfFacilitiesInStressedWaterArea property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfFacilitiesInStressedWaterArea() {
        return numberOfFacilitiesInStressedWaterArea;
    }

    /**
     * Sets the value of the numberOfFacilitiesInStressedWaterArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfFacilitiesInStressedWaterArea(BigInteger value) {
        this.numberOfFacilitiesInStressedWaterArea = value;
    }

}
