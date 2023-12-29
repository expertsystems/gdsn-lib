
package gs1.gdsn.sustainability_module.xsd._3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SustainabilityProgramInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SustainabilityProgramInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sustainabilityScore"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sustainabilityProgramCode" type="{urn:gs1:gdsn:sustainability_module:xsd:3}SustainabilityProgramCodeType" minOccurs="0"/&gt;
 *         &lt;element name="sustainabilityValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SustainabilityProgramInformationType", propOrder = {
    "sustainabilityScore",
    "sustainabilityProgramCode",
    "sustainabilityValue"
})
public class SustainabilityProgramInformationType {

    @XmlElement(required = true)
    protected String sustainabilityScore;
    protected SustainabilityProgramCodeType sustainabilityProgramCode;
    protected BigDecimal sustainabilityValue;

    /**
     * Gets the value of the sustainabilityScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSustainabilityScore() {
        return sustainabilityScore;
    }

    /**
     * Sets the value of the sustainabilityScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSustainabilityScore(String value) {
        this.sustainabilityScore = value;
    }

    /**
     * Gets the value of the sustainabilityProgramCode property.
     * 
     * @return
     *     possible object is
     *     {@link SustainabilityProgramCodeType }
     *     
     */
    public SustainabilityProgramCodeType getSustainabilityProgramCode() {
        return sustainabilityProgramCode;
    }

    /**
     * Sets the value of the sustainabilityProgramCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SustainabilityProgramCodeType }
     *     
     */
    public void setSustainabilityProgramCode(SustainabilityProgramCodeType value) {
        this.sustainabilityProgramCode = value;
    }

    /**
     * Gets the value of the sustainabilityValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSustainabilityValue() {
        return sustainabilityValue;
    }

    /**
     * Sets the value of the sustainabilityValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSustainabilityValue(BigDecimal value) {
        this.sustainabilityValue = value;
    }

}
