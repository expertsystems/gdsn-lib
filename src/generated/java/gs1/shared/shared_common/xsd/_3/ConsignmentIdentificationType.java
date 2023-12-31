
package gs1.shared.shared_common.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsignmentIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsignmentIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ginc" type="{urn:gs1:shared:shared_common:xsd:3}GINCType"/&gt;
 *         &lt;element name="additionalConsignmentIdentification" type="{urn:gs1:shared:shared_common:xsd:3}AdditionalConsignmentIdentificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsignmentIdentificationType", propOrder = {
    "ginc",
    "additionalConsignmentIdentification"
})
public class ConsignmentIdentificationType {

    @XmlElement(required = true)
    protected String ginc;
    protected List<AdditionalConsignmentIdentificationType> additionalConsignmentIdentification;

    /**
     * Gets the value of the ginc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGinc() {
        return ginc;
    }

    /**
     * Sets the value of the ginc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGinc(String value) {
        this.ginc = value;
    }

    /**
     * Gets the value of the additionalConsignmentIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalConsignmentIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalConsignmentIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalConsignmentIdentificationType }
     * 
     * 
     */
    public List<AdditionalConsignmentIdentificationType> getAdditionalConsignmentIdentification() {
        if (additionalConsignmentIdentification == null) {
            additionalConsignmentIdentification = new ArrayList<AdditionalConsignmentIdentificationType>();
        }
        return this.additionalConsignmentIdentification;
    }

}
