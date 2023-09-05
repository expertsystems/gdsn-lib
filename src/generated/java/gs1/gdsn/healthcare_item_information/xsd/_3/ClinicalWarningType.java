
package gs1.gdsn.healthcare_item_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description2000Type;


/**
 * <p>Java class for ClinicalWarningType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClinicalWarningType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clinicalWarningAgencyCode" type="{urn:gs1:gdsn:healthcare_item_information:xsd:3}ClinicalWarningAgencyCodeType"/&gt;
 *         &lt;element name="clinicalWarningCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="warningsOrContraIndicationDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description2000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClinicalWarningType", propOrder = {
    "clinicalWarningAgencyCode",
    "clinicalWarningCode",
    "warningsOrContraIndicationDescription"
})
public class ClinicalWarningType {

    @XmlElement(required = true)
    protected ClinicalWarningAgencyCodeType clinicalWarningAgencyCode;
    @XmlElement(required = true)
    protected String clinicalWarningCode;
    protected List<Description2000Type> warningsOrContraIndicationDescription;

    /**
     * Gets the value of the clinicalWarningAgencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link ClinicalWarningAgencyCodeType }
     *     
     */
    public ClinicalWarningAgencyCodeType getClinicalWarningAgencyCode() {
        return clinicalWarningAgencyCode;
    }

    /**
     * Sets the value of the clinicalWarningAgencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClinicalWarningAgencyCodeType }
     *     
     */
    public void setClinicalWarningAgencyCode(ClinicalWarningAgencyCodeType value) {
        this.clinicalWarningAgencyCode = value;
    }

    /**
     * Gets the value of the clinicalWarningCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClinicalWarningCode() {
        return clinicalWarningCode;
    }

    /**
     * Sets the value of the clinicalWarningCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClinicalWarningCode(String value) {
        this.clinicalWarningCode = value;
    }

    /**
     * Gets the value of the warningsOrContraIndicationDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warningsOrContraIndicationDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarningsOrContraIndicationDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description2000Type }
     * 
     * 
     */
    public List<Description2000Type> getWarningsOrContraIndicationDescription() {
        if (warningsOrContraIndicationDescription == null) {
            warningsOrContraIndicationDescription = new ArrayList<Description2000Type>();
        }
        return this.warningsOrContraIndicationDescription;
    }

}
