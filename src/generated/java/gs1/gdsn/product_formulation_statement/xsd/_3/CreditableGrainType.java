
package gs1.gdsn.product_formulation_statement.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditableGrainType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditableGrainType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="creditableGrainGroupCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="exhibitGroup" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
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
@XmlType(name = "CreditableGrainType", propOrder = {
    "creditableGrainGroupCode",
    "exhibitGroup"
})
public class CreditableGrainType {

    @XmlElement(required = true)
    protected String creditableGrainGroupCode;
    protected String exhibitGroup;

    /**
     * Gets the value of the creditableGrainGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditableGrainGroupCode() {
        return creditableGrainGroupCode;
    }

    /**
     * Sets the value of the creditableGrainGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditableGrainGroupCode(String value) {
        this.creditableGrainGroupCode = value;
    }

    /**
     * Gets the value of the exhibitGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExhibitGroup() {
        return exhibitGroup;
    }

    /**
     * Sets the value of the exhibitGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExhibitGroup(String value) {
        this.exhibitGroup = value;
    }

}
