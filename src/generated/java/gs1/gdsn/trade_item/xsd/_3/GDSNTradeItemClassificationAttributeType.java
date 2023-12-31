
package gs1.gdsn.trade_item.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GDSNTradeItemClassificationAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GDSNTradeItemClassificationAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gpcAttributeTypeCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{8}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gpcAttributeValueCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{8}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gpcAttributeTypeDefinition" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="700"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gpcAttributeTypeName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="105"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gpcAttributeValueName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="105"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GDSNTradeItemClassificationAttributeType", propOrder = {
    "gpcAttributeTypeCode",
    "gpcAttributeValueCode",
    "gpcAttributeTypeDefinition",
    "gpcAttributeTypeName",
    "gpcAttributeValueName"
})
public class GDSNTradeItemClassificationAttributeType {

    @XmlElement(required = true)
    protected String gpcAttributeTypeCode;
    protected String gpcAttributeValueCode;
    protected String gpcAttributeTypeDefinition;
    protected String gpcAttributeTypeName;
    protected String gpcAttributeValueName;

    /**
     * Gets the value of the gpcAttributeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpcAttributeTypeCode() {
        return gpcAttributeTypeCode;
    }

    /**
     * Sets the value of the gpcAttributeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpcAttributeTypeCode(String value) {
        this.gpcAttributeTypeCode = value;
    }

    /**
     * Gets the value of the gpcAttributeValueCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpcAttributeValueCode() {
        return gpcAttributeValueCode;
    }

    /**
     * Sets the value of the gpcAttributeValueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpcAttributeValueCode(String value) {
        this.gpcAttributeValueCode = value;
    }

    /**
     * Gets the value of the gpcAttributeTypeDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpcAttributeTypeDefinition() {
        return gpcAttributeTypeDefinition;
    }

    /**
     * Sets the value of the gpcAttributeTypeDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpcAttributeTypeDefinition(String value) {
        this.gpcAttributeTypeDefinition = value;
    }

    /**
     * Gets the value of the gpcAttributeTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpcAttributeTypeName() {
        return gpcAttributeTypeName;
    }

    /**
     * Sets the value of the gpcAttributeTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpcAttributeTypeName(String value) {
        this.gpcAttributeTypeName = value;
    }

    /**
     * Gets the value of the gpcAttributeValueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpcAttributeValueName() {
        return gpcAttributeValueName;
    }

    /**
     * Sets the value of the gpcAttributeValueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpcAttributeValueName(String value) {
        this.gpcAttributeValueName = value;
    }

}
