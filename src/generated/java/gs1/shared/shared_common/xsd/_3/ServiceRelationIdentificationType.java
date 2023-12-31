
package gs1.shared.shared_common.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceRelationIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceRelationIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gsrn" type="{urn:gs1:shared:shared_common:xsd:3}GSRNType"/&gt;
 *         &lt;element name="additionalServiceRelationIdentification" type="{urn:gs1:shared:shared_common:xsd:3}AdditionalServiceRelationIdentificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRelationIdentificationType", propOrder = {
    "gsrn",
    "additionalServiceRelationIdentification"
})
public class ServiceRelationIdentificationType {

    @XmlElement(required = true)
    protected String gsrn;
    protected List<AdditionalServiceRelationIdentificationType> additionalServiceRelationIdentification;

    /**
     * Gets the value of the gsrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGsrn() {
        return gsrn;
    }

    /**
     * Sets the value of the gsrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGsrn(String value) {
        this.gsrn = value;
    }

    /**
     * Gets the value of the additionalServiceRelationIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalServiceRelationIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalServiceRelationIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalServiceRelationIdentificationType }
     * 
     * 
     */
    public List<AdditionalServiceRelationIdentificationType> getAdditionalServiceRelationIdentification() {
        if (additionalServiceRelationIdentification == null) {
            additionalServiceRelationIdentification = new ArrayList<AdditionalServiceRelationIdentificationType>();
        }
        return this.additionalServiceRelationIdentification;
    }

}
