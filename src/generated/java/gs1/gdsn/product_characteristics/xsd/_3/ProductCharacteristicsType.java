
package gs1.gdsn.product_characteristics.xsd._3;

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
import gs1.shared.shared_common.xsd._3.Description5000Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for ProductCharacteristicsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductCharacteristicsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productCharacteristicCode" type="{urn:gs1:gdsn:product_characteristics:xsd:3}ProductCharacteristicCodeType"/&gt;
 *         &lt;element name="productCharacteristicValueAmount" type="{urn:gs1:shared:shared_common:xsd:3}AmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productCharacteristicValueCode" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="productCharacteristicValueDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productCharacteristicValueDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productCharacteristicValueInteger" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productCharacteristicValueMeasurement" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productCharacteristicValueNumeric" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productCharacteristicValueString" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="productCharacteristicSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductCharacteristicsType", propOrder = {
    "productCharacteristicCode",
    "productCharacteristicValueAmount",
    "productCharacteristicValueCode",
    "productCharacteristicValueDateTime",
    "productCharacteristicValueDescription",
    "productCharacteristicValueInteger",
    "productCharacteristicValueMeasurement",
    "productCharacteristicValueNumeric",
    "productCharacteristicValueString",
    "productCharacteristicSequenceNumber"
})
public class ProductCharacteristicsType {

    @XmlElement(required = true)
    protected ProductCharacteristicCodeType productCharacteristicCode;
    protected List<AmountType> productCharacteristicValueAmount;
    protected List<String> productCharacteristicValueCode;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected List<LocalDateTime> productCharacteristicValueDateTime;
    protected List<Description5000Type> productCharacteristicValueDescription;
    protected List<BigInteger> productCharacteristicValueInteger;
    protected List<MeasurementType> productCharacteristicValueMeasurement;
    @XmlElement(type = Float.class)
    protected List<Float> productCharacteristicValueNumeric;
    protected List<String> productCharacteristicValueString;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger productCharacteristicSequenceNumber;

    /**
     * Gets the value of the productCharacteristicCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCharacteristicCodeType }
     *     
     */
    public ProductCharacteristicCodeType getProductCharacteristicCode() {
        return productCharacteristicCode;
    }

    /**
     * Sets the value of the productCharacteristicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCharacteristicCodeType }
     *     
     */
    public void setProductCharacteristicCode(ProductCharacteristicCodeType value) {
        this.productCharacteristicCode = value;
    }

    /**
     * Gets the value of the productCharacteristicValueAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCharacteristicValueAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCharacteristicValueAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getProductCharacteristicValueAmount() {
        if (productCharacteristicValueAmount == null) {
            productCharacteristicValueAmount = new ArrayList<AmountType>();
        }
        return this.productCharacteristicValueAmount;
    }

    /**
     * Gets the value of the productCharacteristicValueCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCharacteristicValueCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCharacteristicValueCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProductCharacteristicValueCode() {
        if (productCharacteristicValueCode == null) {
            productCharacteristicValueCode = new ArrayList<String>();
        }
        return this.productCharacteristicValueCode;
    }

    /**
     * Gets the value of the productCharacteristicValueDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCharacteristicValueDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCharacteristicValueDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<LocalDateTime> getProductCharacteristicValueDateTime() {
        if (productCharacteristicValueDateTime == null) {
            productCharacteristicValueDateTime = new ArrayList<LocalDateTime>();
        }
        return this.productCharacteristicValueDateTime;
    }

    /**
     * Gets the value of the productCharacteristicValueDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCharacteristicValueDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCharacteristicValueDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getProductCharacteristicValueDescription() {
        if (productCharacteristicValueDescription == null) {
            productCharacteristicValueDescription = new ArrayList<Description5000Type>();
        }
        return this.productCharacteristicValueDescription;
    }

    /**
     * Gets the value of the productCharacteristicValueInteger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCharacteristicValueInteger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCharacteristicValueInteger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getProductCharacteristicValueInteger() {
        if (productCharacteristicValueInteger == null) {
            productCharacteristicValueInteger = new ArrayList<BigInteger>();
        }
        return this.productCharacteristicValueInteger;
    }

    /**
     * Gets the value of the productCharacteristicValueMeasurement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCharacteristicValueMeasurement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCharacteristicValueMeasurement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getProductCharacteristicValueMeasurement() {
        if (productCharacteristicValueMeasurement == null) {
            productCharacteristicValueMeasurement = new ArrayList<MeasurementType>();
        }
        return this.productCharacteristicValueMeasurement;
    }

    /**
     * Gets the value of the productCharacteristicValueNumeric property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCharacteristicValueNumeric property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCharacteristicValueNumeric().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * 
     * 
     */
    public List<Float> getProductCharacteristicValueNumeric() {
        if (productCharacteristicValueNumeric == null) {
            productCharacteristicValueNumeric = new ArrayList<Float>();
        }
        return this.productCharacteristicValueNumeric;
    }

    /**
     * Gets the value of the productCharacteristicValueString property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCharacteristicValueString property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCharacteristicValueString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProductCharacteristicValueString() {
        if (productCharacteristicValueString == null) {
            productCharacteristicValueString = new ArrayList<String>();
        }
        return this.productCharacteristicValueString;
    }

    /**
     * Gets the value of the productCharacteristicSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductCharacteristicSequenceNumber() {
        return productCharacteristicSequenceNumber;
    }

    /**
     * Sets the value of the productCharacteristicSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductCharacteristicSequenceNumber(BigInteger value) {
        this.productCharacteristicSequenceNumber = value;
    }

}
