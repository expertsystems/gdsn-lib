
package gs1.gdsn.healthcare_item_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description2000Type;


/**
 * <p>Java class for ClinicalStorageHandlingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClinicalStorageHandlingInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clinicalStorageHandlingTypeCode" type="{urn:gs1:gdsn:healthcare_item_information:xsd:3}ClinicalStorageHandlingTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="clinicalStorageHandlingDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description2000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClinicalStorageHandlingInformationType", propOrder = {
    "clinicalStorageHandlingTypeCode",
    "clinicalStorageHandlingDescription"
})
public class ClinicalStorageHandlingInformationType {

    protected ClinicalStorageHandlingTypeCodeType clinicalStorageHandlingTypeCode;
    protected List<Description2000Type> clinicalStorageHandlingDescription;

    /**
     * Gets the value of the clinicalStorageHandlingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ClinicalStorageHandlingTypeCodeType }
     *     
     */
    public ClinicalStorageHandlingTypeCodeType getClinicalStorageHandlingTypeCode() {
        return clinicalStorageHandlingTypeCode;
    }

    /**
     * Sets the value of the clinicalStorageHandlingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClinicalStorageHandlingTypeCodeType }
     *     
     */
    public void setClinicalStorageHandlingTypeCode(ClinicalStorageHandlingTypeCodeType value) {
        this.clinicalStorageHandlingTypeCode = value;
    }

    /**
     * Gets the value of the clinicalStorageHandlingDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clinicalStorageHandlingDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClinicalStorageHandlingDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description2000Type }
     * 
     * 
     */
    public List<Description2000Type> getClinicalStorageHandlingDescription() {
        if (clinicalStorageHandlingDescription == null) {
            clinicalStorageHandlingDescription = new ArrayList<Description2000Type>();
        }
        return this.clinicalStorageHandlingDescription;
    }

}
