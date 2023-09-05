
package gs1.gdsn.trade_item.xsd._3;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import gs1.shared.shared_common.xsd._3.AmountType;
import gs1.shared.shared_common.xsd._3.CodeType;
import gs1.shared.shared_common.xsd._3.Description1000Type;
import gs1.shared.shared_common.xsd._3.Description5000Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for AdditionalTradeItemClassificationPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalTradeItemClassificationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalTradeItemClassificationPropertyCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="additionalTradeItemClassificationPropertyDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="propertyAmount" type="{urn:gs1:shared:shared_common:xsd:3}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="propertyCode" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="propertyDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="propertyDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="propertyFloat" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="propertyInteger" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="propertyMeasurement" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="propertyString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalTradeItemClassificationPropertyType", propOrder = {
    "additionalTradeItemClassificationPropertyCode",
    "additionalTradeItemClassificationPropertyDescription",
    "propertyAmount",
    "propertyCode",
    "propertyDateTime",
    "propertyDescription",
    "propertyFloat",
    "propertyInteger",
    "propertyMeasurement",
    "propertyString"
})
public class AdditionalTradeItemClassificationPropertyType {

    @XmlElement(required = true)
    protected String additionalTradeItemClassificationPropertyCode;
    protected List<Description1000Type> additionalTradeItemClassificationPropertyDescription;
    protected AmountType propertyAmount;
    protected CodeType propertyCode;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime propertyDateTime;
    protected List<Description5000Type> propertyDescription;
    protected Float propertyFloat;
    protected BigInteger propertyInteger;
    protected List<MeasurementType> propertyMeasurement;
    protected String propertyString;

    /**
     * Gets the value of the additionalTradeItemClassificationPropertyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalTradeItemClassificationPropertyCode() {
        return additionalTradeItemClassificationPropertyCode;
    }

    /**
     * Sets the value of the additionalTradeItemClassificationPropertyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalTradeItemClassificationPropertyCode(String value) {
        this.additionalTradeItemClassificationPropertyCode = value;
    }

    /**
     * Gets the value of the additionalTradeItemClassificationPropertyDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalTradeItemClassificationPropertyDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalTradeItemClassificationPropertyDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getAdditionalTradeItemClassificationPropertyDescription() {
        if (additionalTradeItemClassificationPropertyDescription == null) {
            additionalTradeItemClassificationPropertyDescription = new ArrayList<Description1000Type>();
        }
        return this.additionalTradeItemClassificationPropertyDescription;
    }

    /**
     * Gets the value of the propertyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPropertyAmount() {
        return propertyAmount;
    }

    /**
     * Sets the value of the propertyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPropertyAmount(AmountType value) {
        this.propertyAmount = value;
    }

    /**
     * Gets the value of the propertyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPropertyCode() {
        return propertyCode;
    }

    /**
     * Sets the value of the propertyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPropertyCode(CodeType value) {
        this.propertyCode = value;
    }

    /**
     * Gets the value of the propertyDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getPropertyDateTime() {
        return propertyDateTime;
    }

    /**
     * Sets the value of the propertyDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyDateTime(LocalDateTime value) {
        this.propertyDateTime = value;
    }

    /**
     * Gets the value of the propertyDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getPropertyDescription() {
        if (propertyDescription == null) {
            propertyDescription = new ArrayList<Description5000Type>();
        }
        return this.propertyDescription;
    }

    /**
     * Gets the value of the propertyFloat property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPropertyFloat() {
        return propertyFloat;
    }

    /**
     * Sets the value of the propertyFloat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPropertyFloat(Float value) {
        this.propertyFloat = value;
    }

    /**
     * Gets the value of the propertyInteger property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPropertyInteger() {
        return propertyInteger;
    }

    /**
     * Sets the value of the propertyInteger property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPropertyInteger(BigInteger value) {
        this.propertyInteger = value;
    }

    /**
     * Gets the value of the propertyMeasurement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyMeasurement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyMeasurement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getPropertyMeasurement() {
        if (propertyMeasurement == null) {
            propertyMeasurement = new ArrayList<MeasurementType>();
        }
        return this.propertyMeasurement;
    }

    /**
     * Gets the value of the propertyString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyString() {
        return propertyString;
    }

    /**
     * Sets the value of the propertyString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyString(String value) {
        this.propertyString = value;
    }

}
