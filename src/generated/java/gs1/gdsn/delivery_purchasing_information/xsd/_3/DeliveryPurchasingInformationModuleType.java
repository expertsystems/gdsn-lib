
package gs1.gdsn.delivery_purchasing_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;


/**
 * <p>Java class for DeliveryPurchasingInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryPurchasingInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deliveryPurchasingInformation" type="{urn:gs1:gdsn:delivery_purchasing_information:xsd:3}DeliveryPurchasingInformationType" minOccurs="0"/&gt;
 *         &lt;element name="avpList" type="{urn:gs1:gdsn:gdsn_common:xsd:3}GS1_AttributeValuePairListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryPurchasingInformationModuleType", propOrder = {
    "deliveryPurchasingInformation",
    "avpList"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:delivery_purchasing_information:xsd:3")
public class DeliveryPurchasingInformationModuleType {

    protected DeliveryPurchasingInformationType deliveryPurchasingInformation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the deliveryPurchasingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryPurchasingInformationType }
     *     
     */
    public DeliveryPurchasingInformationType getDeliveryPurchasingInformation() {
        return deliveryPurchasingInformation;
    }

    /**
     * Sets the value of the deliveryPurchasingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryPurchasingInformationType }
     *     
     */
    public void setDeliveryPurchasingInformation(DeliveryPurchasingInformationType value) {
        this.deliveryPurchasingInformation = value;
    }

    /**
     * Gets the value of the avpList property.
     * 
     * @return
     *     possible object is
     *     {@link GS1AttributeValuePairListType }
     *     
     */
    public GS1AttributeValuePairListType getAvpList() {
        return avpList;
    }

    /**
     * Sets the value of the avpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GS1AttributeValuePairListType }
     *     
     */
    public void setAvpList(GS1AttributeValuePairListType value) {
        this.avpList = value;
    }

}
