
package gs1.gdsn.packaging_sustainability.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description80Type;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for PackagingRecoveryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingRecoveryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="doesPackagingRecoveryRateTypeCodeMeetTheStandard" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="packagingRecoveryRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="packagingRecoveryRateDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingRecoveryRateTypeCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}PackagingRecoveryRateTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="totalPackagingRecoveryRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingRecoveryType", propOrder = {
    "doesPackagingRecoveryRateTypeCodeMeetTheStandard",
    "packagingRecoveryRate",
    "packagingRecoveryRateDescription",
    "packagingRecoveryRateTypeCode",
    "totalPackagingRecoveryRate"
})
public class PackagingRecoveryType {

    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType doesPackagingRecoveryRateTypeCodeMeetTheStandard;
    protected Float packagingRecoveryRate;
    protected List<Description80Type> packagingRecoveryRateDescription;
    protected PackagingRecoveryRateTypeCodeType packagingRecoveryRateTypeCode;
    protected Float totalPackagingRecoveryRate;

    /**
     * Gets the value of the doesPackagingRecoveryRateTypeCodeMeetTheStandard property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getDoesPackagingRecoveryRateTypeCodeMeetTheStandard() {
        return doesPackagingRecoveryRateTypeCodeMeetTheStandard;
    }

    /**
     * Sets the value of the doesPackagingRecoveryRateTypeCodeMeetTheStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setDoesPackagingRecoveryRateTypeCodeMeetTheStandard(NonBinaryLogicEnumerationType value) {
        this.doesPackagingRecoveryRateTypeCodeMeetTheStandard = value;
    }

    /**
     * Gets the value of the packagingRecoveryRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPackagingRecoveryRate() {
        return packagingRecoveryRate;
    }

    /**
     * Sets the value of the packagingRecoveryRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPackagingRecoveryRate(Float value) {
        this.packagingRecoveryRate = value;
    }

    /**
     * Gets the value of the packagingRecoveryRateDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingRecoveryRateDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingRecoveryRateDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getPackagingRecoveryRateDescription() {
        if (packagingRecoveryRateDescription == null) {
            packagingRecoveryRateDescription = new ArrayList<Description80Type>();
        }
        return this.packagingRecoveryRateDescription;
    }

    /**
     * Gets the value of the packagingRecoveryRateTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingRecoveryRateTypeCodeType }
     *     
     */
    public PackagingRecoveryRateTypeCodeType getPackagingRecoveryRateTypeCode() {
        return packagingRecoveryRateTypeCode;
    }

    /**
     * Sets the value of the packagingRecoveryRateTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingRecoveryRateTypeCodeType }
     *     
     */
    public void setPackagingRecoveryRateTypeCode(PackagingRecoveryRateTypeCodeType value) {
        this.packagingRecoveryRateTypeCode = value;
    }

    /**
     * Gets the value of the totalPackagingRecoveryRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTotalPackagingRecoveryRate() {
        return totalPackagingRecoveryRate;
    }

    /**
     * Sets the value of the totalPackagingRecoveryRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTotalPackagingRecoveryRate(Float value) {
        this.totalPackagingRecoveryRate = value;
    }

}
