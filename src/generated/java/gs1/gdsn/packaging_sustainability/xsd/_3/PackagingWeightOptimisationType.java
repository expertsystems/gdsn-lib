
package gs1.gdsn.packaging_sustainability.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description80Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for PackagingWeightOptimisationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingWeightOptimisationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packagingWeight" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="proofOfOptimizedPackagingWeightStandardCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}ProofOfOptimizedPackagingWeightStandardCodeType" minOccurs="0"/&gt;
 *         &lt;element name="proofOfOptimizedPackagingWeightStandardDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingWeightReduction" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}PackagingWeightReductionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingWeightOptimisationType", propOrder = {
    "packagingWeight",
    "proofOfOptimizedPackagingWeightStandardCode",
    "proofOfOptimizedPackagingWeightStandardDescription",
    "packagingWeightReduction"
})
public class PackagingWeightOptimisationType {

    protected MeasurementType packagingWeight;
    protected ProofOfOptimizedPackagingWeightStandardCodeType proofOfOptimizedPackagingWeightStandardCode;
    protected List<Description80Type> proofOfOptimizedPackagingWeightStandardDescription;
    protected PackagingWeightReductionType packagingWeightReduction;

    /**
     * Gets the value of the packagingWeight property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getPackagingWeight() {
        return packagingWeight;
    }

    /**
     * Sets the value of the packagingWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setPackagingWeight(MeasurementType value) {
        this.packagingWeight = value;
    }

    /**
     * Gets the value of the proofOfOptimizedPackagingWeightStandardCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProofOfOptimizedPackagingWeightStandardCodeType }
     *     
     */
    public ProofOfOptimizedPackagingWeightStandardCodeType getProofOfOptimizedPackagingWeightStandardCode() {
        return proofOfOptimizedPackagingWeightStandardCode;
    }

    /**
     * Sets the value of the proofOfOptimizedPackagingWeightStandardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProofOfOptimizedPackagingWeightStandardCodeType }
     *     
     */
    public void setProofOfOptimizedPackagingWeightStandardCode(ProofOfOptimizedPackagingWeightStandardCodeType value) {
        this.proofOfOptimizedPackagingWeightStandardCode = value;
    }

    /**
     * Gets the value of the proofOfOptimizedPackagingWeightStandardDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proofOfOptimizedPackagingWeightStandardDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProofOfOptimizedPackagingWeightStandardDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getProofOfOptimizedPackagingWeightStandardDescription() {
        if (proofOfOptimizedPackagingWeightStandardDescription == null) {
            proofOfOptimizedPackagingWeightStandardDescription = new ArrayList<Description80Type>();
        }
        return this.proofOfOptimizedPackagingWeightStandardDescription;
    }

    /**
     * Gets the value of the packagingWeightReduction property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingWeightReductionType }
     *     
     */
    public PackagingWeightReductionType getPackagingWeightReduction() {
        return packagingWeightReduction;
    }

    /**
     * Sets the value of the packagingWeightReduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingWeightReductionType }
     *     
     */
    public void setPackagingWeightReduction(PackagingWeightReductionType value) {
        this.packagingWeightReduction = value;
    }

}
