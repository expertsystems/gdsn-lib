
package gs1.gdsn.packaging_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.TransactionalMeasurementType;
import gs1.shared.shared_common.xsd._3.Description200Type;


/**
 * <p>Java class for NumberOfUnitInShippingContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberOfUnitInShippingContainerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shippingContainerQuantity" type="{urn:gs1:gdsn:gdsn_common:xsd:3}TransactionalMeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shippingContainerQuantityDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shippingContainerTypeCode" type="{urn:gs1:gdsn:packaging_information:xsd:3}ShippingContainerTypeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfUnitInShippingContainerType", propOrder = {
    "shippingContainerQuantity",
    "shippingContainerQuantityDescription",
    "shippingContainerTypeCode"
})
public class NumberOfUnitInShippingContainerType {

    protected List<TransactionalMeasurementType> shippingContainerQuantity;
    protected List<Description200Type> shippingContainerQuantityDescription;
    protected ShippingContainerTypeCodeType shippingContainerTypeCode;

    /**
     * Gets the value of the shippingContainerQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingContainerQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingContainerQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionalMeasurementType }
     * 
     * 
     */
    public List<TransactionalMeasurementType> getShippingContainerQuantity() {
        if (shippingContainerQuantity == null) {
            shippingContainerQuantity = new ArrayList<TransactionalMeasurementType>();
        }
        return this.shippingContainerQuantity;
    }

    /**
     * Gets the value of the shippingContainerQuantityDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingContainerQuantityDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingContainerQuantityDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description200Type }
     * 
     * 
     */
    public List<Description200Type> getShippingContainerQuantityDescription() {
        if (shippingContainerQuantityDescription == null) {
            shippingContainerQuantityDescription = new ArrayList<Description200Type>();
        }
        return this.shippingContainerQuantityDescription;
    }

    /**
     * Gets the value of the shippingContainerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingContainerTypeCodeType }
     *     
     */
    public ShippingContainerTypeCodeType getShippingContainerTypeCode() {
        return shippingContainerTypeCode;
    }

    /**
     * Sets the value of the shippingContainerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingContainerTypeCodeType }
     *     
     */
    public void setShippingContainerTypeCode(ShippingContainerTypeCodeType value) {
        this.shippingContainerTypeCode = value;
    }

}
