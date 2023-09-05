
package gs1.gdsn.packaging_information.xsd._3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for PackagingRecyclabilityAssessmentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingRecyclabilityAssessmentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packagingRecyclabilityAssessmentSpecificationCode" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackagingRecyclabilityAssessmentSpecificationCodeType" minOccurs="0"/&gt;
 *         &lt;element name="packagingRecyclabilityValue" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagingRecyclabilityValueEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingRecyclabilityAssessmentInformationType", propOrder = {
    "packagingRecyclabilityAssessmentSpecificationCode",
    "packagingRecyclabilityValue",
    "packagingRecyclabilityValueEffectiveDate"
})
public class PackagingRecyclabilityAssessmentInformationType {

    protected PackagingRecyclabilityAssessmentSpecificationCodeType packagingRecyclabilityAssessmentSpecificationCode;
    protected List<MeasurementType> packagingRecyclabilityValue;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime packagingRecyclabilityValueEffectiveDate;

    /**
     * Gets the value of the packagingRecyclabilityAssessmentSpecificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingRecyclabilityAssessmentSpecificationCodeType }
     *     
     */
    public PackagingRecyclabilityAssessmentSpecificationCodeType getPackagingRecyclabilityAssessmentSpecificationCode() {
        return packagingRecyclabilityAssessmentSpecificationCode;
    }

    /**
     * Sets the value of the packagingRecyclabilityAssessmentSpecificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingRecyclabilityAssessmentSpecificationCodeType }
     *     
     */
    public void setPackagingRecyclabilityAssessmentSpecificationCode(PackagingRecyclabilityAssessmentSpecificationCodeType value) {
        this.packagingRecyclabilityAssessmentSpecificationCode = value;
    }

    /**
     * Gets the value of the packagingRecyclabilityValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingRecyclabilityValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingRecyclabilityValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getPackagingRecyclabilityValue() {
        if (packagingRecyclabilityValue == null) {
            packagingRecyclabilityValue = new ArrayList<MeasurementType>();
        }
        return this.packagingRecyclabilityValue;
    }

    /**
     * Gets the value of the packagingRecyclabilityValueEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getPackagingRecyclabilityValueEffectiveDate() {
        return packagingRecyclabilityValueEffectiveDate;
    }

    /**
     * Sets the value of the packagingRecyclabilityValueEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagingRecyclabilityValueEffectiveDate(LocalDateTime value) {
        this.packagingRecyclabilityValueEffectiveDate = value;
    }

}
