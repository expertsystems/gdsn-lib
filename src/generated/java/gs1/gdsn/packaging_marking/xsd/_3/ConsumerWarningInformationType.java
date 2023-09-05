
package gs1.gdsn.packaging_marking.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description5000Type;


/**
 * <p>Java class for ConsumerWarningInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerWarningInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consumerWarningTypeCode" type="{urn:gs1:gdsn:packaging_marking:xsd:3}ConsumerWarningTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="consumerWarningDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerWarningInformationType", propOrder = {
    "consumerWarningTypeCode",
    "consumerWarningDescription"
})
public class ConsumerWarningInformationType {

    protected ConsumerWarningTypeCodeType consumerWarningTypeCode;
    protected List<Description5000Type> consumerWarningDescription;

    /**
     * Gets the value of the consumerWarningTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerWarningTypeCodeType }
     *     
     */
    public ConsumerWarningTypeCodeType getConsumerWarningTypeCode() {
        return consumerWarningTypeCode;
    }

    /**
     * Sets the value of the consumerWarningTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerWarningTypeCodeType }
     *     
     */
    public void setConsumerWarningTypeCode(ConsumerWarningTypeCodeType value) {
        this.consumerWarningTypeCode = value;
    }

    /**
     * Gets the value of the consumerWarningDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerWarningDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerWarningDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getConsumerWarningDescription() {
        if (consumerWarningDescription == null) {
            consumerWarningDescription = new ArrayList<Description5000Type>();
        }
        return this.consumerWarningDescription;
    }

}
