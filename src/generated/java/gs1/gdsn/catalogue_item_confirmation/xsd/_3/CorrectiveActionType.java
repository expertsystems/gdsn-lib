
package gs1.gdsn.catalogue_item_confirmation.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.CorrectiveActionCodeType;
import gs1.shared.shared_common.xsd._3.Description1000Type;


/**
 * <p>Java class for CorrectiveActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrectiveActionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="correctiveActionCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}CorrectiveActionCodeType"/&gt;
 *         &lt;element name="expectedCorrectiveInformation" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrectiveActionType", propOrder = {
    "correctiveActionCode",
    "expectedCorrectiveInformation"
})
public class CorrectiveActionType {

    @XmlElement(required = true)
    protected CorrectiveActionCodeType correctiveActionCode;
    protected Description1000Type expectedCorrectiveInformation;

    /**
     * Gets the value of the correctiveActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectiveActionCodeType }
     *     
     */
    public CorrectiveActionCodeType getCorrectiveActionCode() {
        return correctiveActionCode;
    }

    /**
     * Sets the value of the correctiveActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectiveActionCodeType }
     *     
     */
    public void setCorrectiveActionCode(CorrectiveActionCodeType value) {
        this.correctiveActionCode = value;
    }

    /**
     * Gets the value of the expectedCorrectiveInformation property.
     * 
     * @return
     *     possible object is
     *     {@link Description1000Type }
     *     
     */
    public Description1000Type getExpectedCorrectiveInformation() {
        return expectedCorrectiveInformation;
    }

    /**
     * Sets the value of the expectedCorrectiveInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description1000Type }
     *     
     */
    public void setExpectedCorrectiveInformation(Description1000Type value) {
        this.expectedCorrectiveInformation = value;
    }

}
