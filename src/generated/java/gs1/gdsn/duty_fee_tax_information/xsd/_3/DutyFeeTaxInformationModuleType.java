
package gs1.gdsn.duty_fee_tax_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutyFeeTaxInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutyFeeTaxInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dutyFeeTaxInformation" type="{urn:gs1:gdsn:duty_fee_tax_information:xsd:3}DutyFeeTaxInformationType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutyFeeTaxInformationModuleType", propOrder = {
    "dutyFeeTaxInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:duty_fee_tax_information:xsd:3")
public class DutyFeeTaxInformationModuleType {

    @XmlElement(required = true)
    protected List<DutyFeeTaxInformationType> dutyFeeTaxInformation;

    /**
     * Gets the value of the dutyFeeTaxInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dutyFeeTaxInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDutyFeeTaxInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DutyFeeTaxInformationType }
     * 
     * 
     */
    public List<DutyFeeTaxInformationType> getDutyFeeTaxInformation() {
        if (dutyFeeTaxInformation == null) {
            dutyFeeTaxInformation = new ArrayList<DutyFeeTaxInformationType>();
        }
        return this.dutyFeeTaxInformation;
    }

}
