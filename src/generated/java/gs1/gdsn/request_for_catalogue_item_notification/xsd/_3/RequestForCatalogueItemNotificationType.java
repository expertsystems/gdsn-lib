
package gs1.gdsn.request_for_catalogue_item_notification.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.catalogue_item_subscription.xsd._3.CatalogueItemSubscriptionType;
import gs1.gdsn.gdsn_common.xsd._3.IsReloadReasonCodeType;


/**
 * <p>Java class for RequestForCatalogueItemNotificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestForCatalogueItemNotificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:gs1:gdsn:catalogue_item_subscription:xsd:3}CatalogueItemSubscriptionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isReload" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="isReloadReasonCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}IsReloadReasonCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestForCatalogueItemNotificationType", propOrder = {
    "isReload",
    "isReloadReasonCode"
})
public class RequestForCatalogueItemNotificationType
    extends CatalogueItemSubscriptionType
{

    protected boolean isReload;
    protected IsReloadReasonCodeType isReloadReasonCode;

    /**
     * Gets the value of the isReload property.
     * 
     */
    public boolean isIsReload() {
        return isReload;
    }

    /**
     * Sets the value of the isReload property.
     * 
     */
    public void setIsReload(boolean value) {
        this.isReload = value;
    }

    /**
     * Gets the value of the isReloadReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link IsReloadReasonCodeType }
     *     
     */
    public IsReloadReasonCodeType getIsReloadReasonCode() {
        return isReloadReasonCode;
    }

    /**
     * Sets the value of the isReloadReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsReloadReasonCodeType }
     *     
     */
    public void setIsReloadReasonCode(IsReloadReasonCodeType value) {
        this.isReloadReasonCode = value;
    }

}
