
package gs1.gdsn.packaging_sustainability.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description80Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for PackagingWeightReductionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingWeightReductionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packagingWeightReduction" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="packagingWeightReductionProtocolName" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="proofOfPackagingWeightReductionStandardCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}ProofOfPackagingWeightReductionStandardCodeType" minOccurs="0"/&gt;
 *         &lt;element name="proofOfPackagingWeightReductionDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="previousPackagingWeight" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingWeightReductionType", propOrder = {
    "packagingWeightReduction",
    "packagingWeightReductionProtocolName",
    "proofOfPackagingWeightReductionStandardCode",
    "proofOfPackagingWeightReductionDescription",
    "previousPackagingWeight"
})
public class PackagingWeightReductionType {

    protected MeasurementType packagingWeightReduction;
    protected List<Description80Type> packagingWeightReductionProtocolName;
    protected ProofOfPackagingWeightReductionStandardCodeType proofOfPackagingWeightReductionStandardCode;
    protected List<Description80Type> proofOfPackagingWeightReductionDescription;
    protected MeasurementType previousPackagingWeight;

    /**
     * Gets the value of the packagingWeightReduction property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getPackagingWeightReduction() {
        return packagingWeightReduction;
    }

    /**
     * Sets the value of the packagingWeightReduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setPackagingWeightReduction(MeasurementType value) {
        this.packagingWeightReduction = value;
    }

    /**
     * Gets the value of the packagingWeightReductionProtocolName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingWeightReductionProtocolName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingWeightReductionProtocolName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getPackagingWeightReductionProtocolName() {
        if (packagingWeightReductionProtocolName == null) {
            packagingWeightReductionProtocolName = new ArrayList<Description80Type>();
        }
        return this.packagingWeightReductionProtocolName;
    }

    /**
     * Gets the value of the proofOfPackagingWeightReductionStandardCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProofOfPackagingWeightReductionStandardCodeType }
     *     
     */
    public ProofOfPackagingWeightReductionStandardCodeType getProofOfPackagingWeightReductionStandardCode() {
        return proofOfPackagingWeightReductionStandardCode;
    }

    /**
     * Sets the value of the proofOfPackagingWeightReductionStandardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProofOfPackagingWeightReductionStandardCodeType }
     *     
     */
    public void setProofOfPackagingWeightReductionStandardCode(ProofOfPackagingWeightReductionStandardCodeType value) {
        this.proofOfPackagingWeightReductionStandardCode = value;
    }

    /**
     * Gets the value of the proofOfPackagingWeightReductionDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proofOfPackagingWeightReductionDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProofOfPackagingWeightReductionDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getProofOfPackagingWeightReductionDescription() {
        if (proofOfPackagingWeightReductionDescription == null) {
            proofOfPackagingWeightReductionDescription = new ArrayList<Description80Type>();
        }
        return this.proofOfPackagingWeightReductionDescription;
    }

    /**
     * Gets the value of the previousPackagingWeight property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getPreviousPackagingWeight() {
        return previousPackagingWeight;
    }

    /**
     * Sets the value of the previousPackagingWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setPreviousPackagingWeight(MeasurementType value) {
        this.previousPackagingWeight = value;
    }

}
