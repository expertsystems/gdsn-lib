
package gs1.gdsn.catalogue_item_confirmation.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.SynchronisationConfirmationStateEnumerationType;


/**
 * <p>Java class for CatalogueItemConfirmationStateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogueItemConfirmationStateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="catalogueItemConfirmationStateCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}SynchronisationConfirmationStateEnumerationType"/&gt;
 *         &lt;element name="recipientGLN" type="{urn:gs1:shared:shared_common:xsd:3}GLNType"/&gt;
 *         &lt;element name="recipientDataPool" type="{urn:gs1:shared:shared_common:xsd:3}GLNType" minOccurs="0"/&gt;
 *         &lt;element name="messageCreatorGLN" type="{urn:gs1:shared:shared_common:xsd:3}GLNType"/&gt;
 *         &lt;element name="messageCreatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogueItemConfirmationStateType", propOrder = {
    "catalogueItemConfirmationStateCode",
    "recipientGLN",
    "recipientDataPool",
    "messageCreatorGLN",
    "messageCreatorName"
})
public class CatalogueItemConfirmationStateType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SynchronisationConfirmationStateEnumerationType catalogueItemConfirmationStateCode;
    @XmlElement(required = true)
    protected String recipientGLN;
    protected String recipientDataPool;
    @XmlElement(required = true)
    protected String messageCreatorGLN;
    protected String messageCreatorName;

    /**
     * Gets the value of the catalogueItemConfirmationStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link SynchronisationConfirmationStateEnumerationType }
     *     
     */
    public SynchronisationConfirmationStateEnumerationType getCatalogueItemConfirmationStateCode() {
        return catalogueItemConfirmationStateCode;
    }

    /**
     * Sets the value of the catalogueItemConfirmationStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchronisationConfirmationStateEnumerationType }
     *     
     */
    public void setCatalogueItemConfirmationStateCode(SynchronisationConfirmationStateEnumerationType value) {
        this.catalogueItemConfirmationStateCode = value;
    }

    /**
     * Gets the value of the recipientGLN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientGLN() {
        return recipientGLN;
    }

    /**
     * Sets the value of the recipientGLN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientGLN(String value) {
        this.recipientGLN = value;
    }

    /**
     * Gets the value of the recipientDataPool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientDataPool() {
        return recipientDataPool;
    }

    /**
     * Sets the value of the recipientDataPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientDataPool(String value) {
        this.recipientDataPool = value;
    }

    /**
     * Gets the value of the messageCreatorGLN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCreatorGLN() {
        return messageCreatorGLN;
    }

    /**
     * Sets the value of the messageCreatorGLN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCreatorGLN(String value) {
        this.messageCreatorGLN = value;
    }

    /**
     * Gets the value of the messageCreatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCreatorName() {
        return messageCreatorName;
    }

    /**
     * Sets the value of the messageCreatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCreatorName(String value) {
        this.messageCreatorName = value;
    }

}
