
package gs1.gdsn.gdsn_common.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AspectRatioInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AspectRatioInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aspectRatioDescriptionCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}AspectRatioDescriptionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="aspectRatioDimensionCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}AspectRatioDimensionCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AspectRatioInformationType", propOrder = {
    "aspectRatioDescriptionCode",
    "aspectRatioDimensionCode"
})
public class AspectRatioInformationType {

    protected AspectRatioDescriptionCodeType aspectRatioDescriptionCode;
    protected AspectRatioDimensionCodeType aspectRatioDimensionCode;

    /**
     * Gets the value of the aspectRatioDescriptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link AspectRatioDescriptionCodeType }
     *     
     */
    public AspectRatioDescriptionCodeType getAspectRatioDescriptionCode() {
        return aspectRatioDescriptionCode;
    }

    /**
     * Sets the value of the aspectRatioDescriptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AspectRatioDescriptionCodeType }
     *     
     */
    public void setAspectRatioDescriptionCode(AspectRatioDescriptionCodeType value) {
        this.aspectRatioDescriptionCode = value;
    }

    /**
     * Gets the value of the aspectRatioDimensionCode property.
     * 
     * @return
     *     possible object is
     *     {@link AspectRatioDimensionCodeType }
     *     
     */
    public AspectRatioDimensionCodeType getAspectRatioDimensionCode() {
        return aspectRatioDimensionCode;
    }

    /**
     * Sets the value of the aspectRatioDimensionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AspectRatioDimensionCodeType }
     *     
     */
    public void setAspectRatioDimensionCode(AspectRatioDimensionCodeType value) {
        this.aspectRatioDimensionCode = value;
    }

}
