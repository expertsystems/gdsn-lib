
package gs1.gdsn.trade_item.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description200Type;


/**
 * <p>Java class for AdditionalTradeItemClassificationValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalTradeItemClassificationValueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalTradeItemClassificationCodeValue"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="additionalTradeItemClassificationCodeDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="additionalTradeItemClassificationVersion" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="additionalTradeItemClassificationCodeSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="additionalTradeItemClassificationProperty" type="{urn:gs1:gdsn:trade_item:xsd:3}AdditionalTradeItemClassificationPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalTradeItemClassificationValueType", propOrder = {
    "additionalTradeItemClassificationCodeValue",
    "additionalTradeItemClassificationCodeDescription",
    "additionalTradeItemClassificationVersion",
    "additionalTradeItemClassificationCodeSequenceNumber",
    "additionalTradeItemClassificationProperty"
})
public class AdditionalTradeItemClassificationValueType {

    @XmlElement(required = true)
    protected String additionalTradeItemClassificationCodeValue;
    protected List<Description200Type> additionalTradeItemClassificationCodeDescription;
    protected String additionalTradeItemClassificationVersion;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger additionalTradeItemClassificationCodeSequenceNumber;
    protected List<AdditionalTradeItemClassificationPropertyType> additionalTradeItemClassificationProperty;

    /**
     * Gets the value of the additionalTradeItemClassificationCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalTradeItemClassificationCodeValue() {
        return additionalTradeItemClassificationCodeValue;
    }

    /**
     * Sets the value of the additionalTradeItemClassificationCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalTradeItemClassificationCodeValue(String value) {
        this.additionalTradeItemClassificationCodeValue = value;
    }

    /**
     * Gets the value of the additionalTradeItemClassificationCodeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalTradeItemClassificationCodeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalTradeItemClassificationCodeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description200Type }
     * 
     * 
     */
    public List<Description200Type> getAdditionalTradeItemClassificationCodeDescription() {
        if (additionalTradeItemClassificationCodeDescription == null) {
            additionalTradeItemClassificationCodeDescription = new ArrayList<Description200Type>();
        }
        return this.additionalTradeItemClassificationCodeDescription;
    }

    /**
     * Gets the value of the additionalTradeItemClassificationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalTradeItemClassificationVersion() {
        return additionalTradeItemClassificationVersion;
    }

    /**
     * Sets the value of the additionalTradeItemClassificationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalTradeItemClassificationVersion(String value) {
        this.additionalTradeItemClassificationVersion = value;
    }

    /**
     * Gets the value of the additionalTradeItemClassificationCodeSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdditionalTradeItemClassificationCodeSequenceNumber() {
        return additionalTradeItemClassificationCodeSequenceNumber;
    }

    /**
     * Sets the value of the additionalTradeItemClassificationCodeSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAdditionalTradeItemClassificationCodeSequenceNumber(BigInteger value) {
        this.additionalTradeItemClassificationCodeSequenceNumber = value;
    }

    /**
     * Gets the value of the additionalTradeItemClassificationProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalTradeItemClassificationProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalTradeItemClassificationProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalTradeItemClassificationPropertyType }
     * 
     * 
     */
    public List<AdditionalTradeItemClassificationPropertyType> getAdditionalTradeItemClassificationProperty() {
        if (additionalTradeItemClassificationProperty == null) {
            additionalTradeItemClassificationProperty = new ArrayList<AdditionalTradeItemClassificationPropertyType>();
        }
        return this.additionalTradeItemClassificationProperty;
    }

}
