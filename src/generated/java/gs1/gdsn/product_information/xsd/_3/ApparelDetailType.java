
package gs1.gdsn.product_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApparelDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApparelDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apparelDetailApplicationCode" type="{urn:gs1:gdsn:product_information:xsd:3}ApparelDetailApplicationCodeType" minOccurs="0"/&gt;
 *         &lt;element name="apparelDetailPlacementCode" type="{urn:gs1:gdsn:product_information:xsd:3}ApparelDetailPlacementCodeType" minOccurs="0"/&gt;
 *         &lt;element name="apparelDetailSizeCode" type="{urn:gs1:gdsn:product_information:xsd:3}ApparelDetailSizeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="apparelDetailTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}ApparelDetailTypeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApparelDetailType", propOrder = {
    "apparelDetailApplicationCode",
    "apparelDetailPlacementCode",
    "apparelDetailSizeCode",
    "apparelDetailTypeCode"
})
public class ApparelDetailType {

    protected ApparelDetailApplicationCodeType apparelDetailApplicationCode;
    protected ApparelDetailPlacementCodeType apparelDetailPlacementCode;
    protected ApparelDetailSizeCodeType apparelDetailSizeCode;
    protected ApparelDetailTypeCodeType apparelDetailTypeCode;

    /**
     * Gets the value of the apparelDetailApplicationCode property.
     * 
     * @return
     *     possible object is
     *     {@link ApparelDetailApplicationCodeType }
     *     
     */
    public ApparelDetailApplicationCodeType getApparelDetailApplicationCode() {
        return apparelDetailApplicationCode;
    }

    /**
     * Sets the value of the apparelDetailApplicationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparelDetailApplicationCodeType }
     *     
     */
    public void setApparelDetailApplicationCode(ApparelDetailApplicationCodeType value) {
        this.apparelDetailApplicationCode = value;
    }

    /**
     * Gets the value of the apparelDetailPlacementCode property.
     * 
     * @return
     *     possible object is
     *     {@link ApparelDetailPlacementCodeType }
     *     
     */
    public ApparelDetailPlacementCodeType getApparelDetailPlacementCode() {
        return apparelDetailPlacementCode;
    }

    /**
     * Sets the value of the apparelDetailPlacementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparelDetailPlacementCodeType }
     *     
     */
    public void setApparelDetailPlacementCode(ApparelDetailPlacementCodeType value) {
        this.apparelDetailPlacementCode = value;
    }

    /**
     * Gets the value of the apparelDetailSizeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ApparelDetailSizeCodeType }
     *     
     */
    public ApparelDetailSizeCodeType getApparelDetailSizeCode() {
        return apparelDetailSizeCode;
    }

    /**
     * Sets the value of the apparelDetailSizeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparelDetailSizeCodeType }
     *     
     */
    public void setApparelDetailSizeCode(ApparelDetailSizeCodeType value) {
        this.apparelDetailSizeCode = value;
    }

    /**
     * Gets the value of the apparelDetailTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ApparelDetailTypeCodeType }
     *     
     */
    public ApparelDetailTypeCodeType getApparelDetailTypeCode() {
        return apparelDetailTypeCode;
    }

    /**
     * Sets the value of the apparelDetailTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparelDetailTypeCodeType }
     *     
     */
    public void setApparelDetailTypeCode(ApparelDetailTypeCodeType value) {
        this.apparelDetailTypeCode = value;
    }

}
