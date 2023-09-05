
package gs1.gdsn.safety_data_sheet.xsd._3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PHInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PHInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="exactPH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="maximumPH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="minimumPH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PHInformationType", propOrder = {
    "exactPH",
    "maximumPH",
    "minimumPH"
})
public class PHInformationType {

    protected BigDecimal exactPH;
    protected BigDecimal maximumPH;
    protected BigDecimal minimumPH;

    /**
     * Gets the value of the exactPH property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExactPH() {
        return exactPH;
    }

    /**
     * Sets the value of the exactPH property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExactPH(BigDecimal value) {
        this.exactPH = value;
    }

    /**
     * Gets the value of the maximumPH property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumPH() {
        return maximumPH;
    }

    /**
     * Sets the value of the maximumPH property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumPH(BigDecimal value) {
        this.maximumPH = value;
    }

    /**
     * Gets the value of the minimumPH property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumPH() {
        return minimumPH;
    }

    /**
     * Sets the value of the minimumPH property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumPH(BigDecimal value) {
        this.minimumPH = value;
    }

}
