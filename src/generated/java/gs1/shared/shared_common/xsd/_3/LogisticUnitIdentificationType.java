
package gs1.shared.shared_common.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogisticUnitIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogisticUnitIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sscc" type="{urn:gs1:shared:shared_common:xsd:3}SSCCType"/&gt;
 *         &lt;element name="additionalLogisticUnitIdentification" type="{urn:gs1:shared:shared_common:xsd:3}AdditionalLogisticUnitIdentificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogisticUnitIdentificationType", propOrder = {
    "sscc",
    "additionalLogisticUnitIdentification"
})
public class LogisticUnitIdentificationType {

    @XmlElement(required = true)
    protected String sscc;
    protected List<AdditionalLogisticUnitIdentificationType> additionalLogisticUnitIdentification;

    /**
     * Gets the value of the sscc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSscc() {
        return sscc;
    }

    /**
     * Sets the value of the sscc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSscc(String value) {
        this.sscc = value;
    }

    /**
     * Gets the value of the additionalLogisticUnitIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalLogisticUnitIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalLogisticUnitIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalLogisticUnitIdentificationType }
     * 
     * 
     */
    public List<AdditionalLogisticUnitIdentificationType> getAdditionalLogisticUnitIdentification() {
        if (additionalLogisticUnitIdentification == null) {
            additionalLogisticUnitIdentification = new ArrayList<AdditionalLogisticUnitIdentificationType>();
        }
        return this.additionalLogisticUnitIdentification;
    }

}
