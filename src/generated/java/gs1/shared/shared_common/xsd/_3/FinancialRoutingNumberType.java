
package gs1.shared.shared_common.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialRoutingNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialRoutingNumberType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="financialRoutingNumber"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="financialRoutingNumberTypeCode" type="{urn:gs1:shared:shared_common:xsd:3}FinancialRoutingNumberTypeCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialRoutingNumberType", propOrder = {
    "financialRoutingNumber",
    "financialRoutingNumberTypeCode"
})
public class FinancialRoutingNumberType {

    @XmlElement(required = true)
    protected String financialRoutingNumber;
    @XmlElement(required = true)
    protected FinancialRoutingNumberTypeCodeType financialRoutingNumberTypeCode;

    /**
     * Gets the value of the financialRoutingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialRoutingNumber() {
        return financialRoutingNumber;
    }

    /**
     * Sets the value of the financialRoutingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialRoutingNumber(String value) {
        this.financialRoutingNumber = value;
    }

    /**
     * Gets the value of the financialRoutingNumberTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRoutingNumberTypeCodeType }
     *     
     */
    public FinancialRoutingNumberTypeCodeType getFinancialRoutingNumberTypeCode() {
        return financialRoutingNumberTypeCode;
    }

    /**
     * Sets the value of the financialRoutingNumberTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRoutingNumberTypeCodeType }
     *     
     */
    public void setFinancialRoutingNumberTypeCode(FinancialRoutingNumberTypeCodeType value) {
        this.financialRoutingNumberTypeCode = value;
    }

}
