
package gs1.gdsn.packaging_sustainability.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description80Type;


/**
 * <p>Java class for PackagingReuseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingReuseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfCyclesPriorToWithdrawal" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="packagingReuseRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="packagingReusabilityStandardCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}PackagingReusabilityStandardCodeType" minOccurs="0"/&gt;
 *         &lt;element name="packagingReusabilityStandardDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingReuseType", propOrder = {
    "numberOfCyclesPriorToWithdrawal",
    "packagingReuseRate",
    "packagingReusabilityStandardCode",
    "packagingReusabilityStandardDescription"
})
public class PackagingReuseType {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfCyclesPriorToWithdrawal;
    protected Float packagingReuseRate;
    protected PackagingReusabilityStandardCodeType packagingReusabilityStandardCode;
    protected List<Description80Type> packagingReusabilityStandardDescription;

    /**
     * Gets the value of the numberOfCyclesPriorToWithdrawal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfCyclesPriorToWithdrawal() {
        return numberOfCyclesPriorToWithdrawal;
    }

    /**
     * Sets the value of the numberOfCyclesPriorToWithdrawal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfCyclesPriorToWithdrawal(BigInteger value) {
        this.numberOfCyclesPriorToWithdrawal = value;
    }

    /**
     * Gets the value of the packagingReuseRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPackagingReuseRate() {
        return packagingReuseRate;
    }

    /**
     * Sets the value of the packagingReuseRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPackagingReuseRate(Float value) {
        this.packagingReuseRate = value;
    }

    /**
     * Gets the value of the packagingReusabilityStandardCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingReusabilityStandardCodeType }
     *     
     */
    public PackagingReusabilityStandardCodeType getPackagingReusabilityStandardCode() {
        return packagingReusabilityStandardCode;
    }

    /**
     * Sets the value of the packagingReusabilityStandardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingReusabilityStandardCodeType }
     *     
     */
    public void setPackagingReusabilityStandardCode(PackagingReusabilityStandardCodeType value) {
        this.packagingReusabilityStandardCode = value;
    }

    /**
     * Gets the value of the packagingReusabilityStandardDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingReusabilityStandardDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingReusabilityStandardDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getPackagingReusabilityStandardDescription() {
        if (packagingReusabilityStandardDescription == null) {
            packagingReusabilityStandardDescription = new ArrayList<Description80Type>();
        }
        return this.packagingReusabilityStandardDescription;
    }

}
