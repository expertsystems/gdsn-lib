
package gs1.gdsn.catalogue_item_confirmation.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.ConfirmationStatusReasonCodeType;
import gs1.shared.shared_common.xsd._3.Description1000Type;


/**
 * <p>Java class for CatalogueItemConfirmationStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogueItemConfirmationStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="confirmationStatusCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}ConfirmationStatusReasonCodeType"/&gt;
 *         &lt;element name="confirmationStatusCodeDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type"/&gt;
 *         &lt;element name="additionalConfirmationStatusLongDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" minOccurs="0"/&gt;
 *         &lt;element name="correctiveAction" type="{urn:gs1:gdsn:catalogue_item_confirmation:xsd:3}CorrectiveActionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogueItemConfirmationStatusType", propOrder = {
    "confirmationStatusCode",
    "confirmationStatusCodeDescription",
    "additionalConfirmationStatusLongDescription",
    "correctiveAction"
})
public class CatalogueItemConfirmationStatusType {

    @XmlElement(required = true)
    protected ConfirmationStatusReasonCodeType confirmationStatusCode;
    @XmlElement(required = true)
    protected Description1000Type confirmationStatusCodeDescription;
    protected Description1000Type additionalConfirmationStatusLongDescription;
    protected CorrectiveActionType correctiveAction;

    /**
     * Gets the value of the confirmationStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationStatusReasonCodeType }
     *     
     */
    public ConfirmationStatusReasonCodeType getConfirmationStatusCode() {
        return confirmationStatusCode;
    }

    /**
     * Sets the value of the confirmationStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationStatusReasonCodeType }
     *     
     */
    public void setConfirmationStatusCode(ConfirmationStatusReasonCodeType value) {
        this.confirmationStatusCode = value;
    }

    /**
     * Gets the value of the confirmationStatusCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Description1000Type }
     *     
     */
    public Description1000Type getConfirmationStatusCodeDescription() {
        return confirmationStatusCodeDescription;
    }

    /**
     * Sets the value of the confirmationStatusCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description1000Type }
     *     
     */
    public void setConfirmationStatusCodeDescription(Description1000Type value) {
        this.confirmationStatusCodeDescription = value;
    }

    /**
     * Gets the value of the additionalConfirmationStatusLongDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Description1000Type }
     *     
     */
    public Description1000Type getAdditionalConfirmationStatusLongDescription() {
        return additionalConfirmationStatusLongDescription;
    }

    /**
     * Sets the value of the additionalConfirmationStatusLongDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description1000Type }
     *     
     */
    public void setAdditionalConfirmationStatusLongDescription(Description1000Type value) {
        this.additionalConfirmationStatusLongDescription = value;
    }

    /**
     * Gets the value of the correctiveAction property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectiveActionType }
     *     
     */
    public CorrectiveActionType getCorrectiveAction() {
        return correctiveAction;
    }

    /**
     * Sets the value of the correctiveAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectiveActionType }
     *     
     */
    public void setCorrectiveAction(CorrectiveActionType value) {
        this.correctiveAction = value;
    }

}
