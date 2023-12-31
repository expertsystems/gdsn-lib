
package gs1.gdsn.packaging_information.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackagingDividerInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingDividerInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfDividersHorizontal" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="numberOfDividersVertical" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="placementOfDivider" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingDividerInformationType", propOrder = {
    "numberOfDividersHorizontal",
    "numberOfDividersVertical",
    "placementOfDivider"
})
public class PackagingDividerInformationType {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfDividersHorizontal;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfDividersVertical;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected List<BigInteger> placementOfDivider;

    /**
     * Gets the value of the numberOfDividersHorizontal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfDividersHorizontal() {
        return numberOfDividersHorizontal;
    }

    /**
     * Sets the value of the numberOfDividersHorizontal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfDividersHorizontal(BigInteger value) {
        this.numberOfDividersHorizontal = value;
    }

    /**
     * Gets the value of the numberOfDividersVertical property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfDividersVertical() {
        return numberOfDividersVertical;
    }

    /**
     * Sets the value of the numberOfDividersVertical property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfDividersVertical(BigInteger value) {
        this.numberOfDividersVertical = value;
    }

    /**
     * Gets the value of the placementOfDivider property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placementOfDivider property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlacementOfDivider().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getPlacementOfDivider() {
        if (placementOfDivider == null) {
            placementOfDivider = new ArrayList<BigInteger>();
        }
        return this.placementOfDivider;
    }

}
