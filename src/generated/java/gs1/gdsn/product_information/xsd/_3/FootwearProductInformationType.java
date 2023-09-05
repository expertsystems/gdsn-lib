
package gs1.gdsn.product_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FootwearProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FootwearProductInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="heelStyleCode" type="{urn:gs1:gdsn:product_information:xsd:3}HeelStyleCodeType" minOccurs="0"/&gt;
 *         &lt;element name="footwearOutsoleTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}FootwearOutsoleTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="footwearStyleCode" type="{urn:gs1:gdsn:product_information:xsd:3}FootwearStyleCodeType" minOccurs="0"/&gt;
 *         &lt;element name="toeStyleTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}ToeStyleTypeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FootwearProductInformationType", propOrder = {
    "heelStyleCode",
    "footwearOutsoleTypeCode",
    "footwearStyleCode",
    "toeStyleTypeCode"
})
public class FootwearProductInformationType {

    protected HeelStyleCodeType heelStyleCode;
    protected FootwearOutsoleTypeCodeType footwearOutsoleTypeCode;
    protected FootwearStyleCodeType footwearStyleCode;
    protected ToeStyleTypeCodeType toeStyleTypeCode;

    /**
     * Gets the value of the heelStyleCode property.
     * 
     * @return
     *     possible object is
     *     {@link HeelStyleCodeType }
     *     
     */
    public HeelStyleCodeType getHeelStyleCode() {
        return heelStyleCode;
    }

    /**
     * Sets the value of the heelStyleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeelStyleCodeType }
     *     
     */
    public void setHeelStyleCode(HeelStyleCodeType value) {
        this.heelStyleCode = value;
    }

    /**
     * Gets the value of the footwearOutsoleTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link FootwearOutsoleTypeCodeType }
     *     
     */
    public FootwearOutsoleTypeCodeType getFootwearOutsoleTypeCode() {
        return footwearOutsoleTypeCode;
    }

    /**
     * Sets the value of the footwearOutsoleTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FootwearOutsoleTypeCodeType }
     *     
     */
    public void setFootwearOutsoleTypeCode(FootwearOutsoleTypeCodeType value) {
        this.footwearOutsoleTypeCode = value;
    }

    /**
     * Gets the value of the footwearStyleCode property.
     * 
     * @return
     *     possible object is
     *     {@link FootwearStyleCodeType }
     *     
     */
    public FootwearStyleCodeType getFootwearStyleCode() {
        return footwearStyleCode;
    }

    /**
     * Sets the value of the footwearStyleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FootwearStyleCodeType }
     *     
     */
    public void setFootwearStyleCode(FootwearStyleCodeType value) {
        this.footwearStyleCode = value;
    }

    /**
     * Gets the value of the toeStyleTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ToeStyleTypeCodeType }
     *     
     */
    public ToeStyleTypeCodeType getToeStyleTypeCode() {
        return toeStyleTypeCode;
    }

    /**
     * Sets the value of the toeStyleTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToeStyleTypeCodeType }
     *     
     */
    public void setToeStyleTypeCode(ToeStyleTypeCodeType value) {
        this.toeStyleTypeCode = value;
    }

}
