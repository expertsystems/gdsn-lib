
package gs1.gdsn.trade_item_size.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description500Type;
import gs1.shared.shared_common.xsd._3.Description80Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for NonPackagedSizeDimensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonPackagedSizeDimensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descriptiveSizeDimension" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sizeDimension" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sizeSystemCode" type="{urn:gs1:gdsn:trade_item_size:xsd:3}SizeSystemCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sizeTypeCode" type="{urn:gs1:gdsn:trade_item_size:xsd:3}SizeTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="sizeTermDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isSizeTypeVariant" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="sizeCode" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
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
@XmlType(name = "NonPackagedSizeDimensionType", propOrder = {
    "descriptiveSizeDimension",
    "sizeDimension",
    "sizeSystemCode",
    "sizeTypeCode",
    "sizeTermDescription",
    "isSizeTypeVariant",
    "sizeCode"
})
public class NonPackagedSizeDimensionType {

    protected List<Description80Type> descriptiveSizeDimension;
    protected List<MeasurementType> sizeDimension;
    protected List<SizeSystemCodeType> sizeSystemCode;
    protected SizeTypeCodeType sizeTypeCode;
    protected List<Description500Type> sizeTermDescription;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isSizeTypeVariant;
    protected List<String> sizeCode;

    /**
     * Gets the value of the descriptiveSizeDimension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptiveSizeDimension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptiveSizeDimension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getDescriptiveSizeDimension() {
        if (descriptiveSizeDimension == null) {
            descriptiveSizeDimension = new ArrayList<Description80Type>();
        }
        return this.descriptiveSizeDimension;
    }

    /**
     * Gets the value of the sizeDimension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sizeDimension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSizeDimension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getSizeDimension() {
        if (sizeDimension == null) {
            sizeDimension = new ArrayList<MeasurementType>();
        }
        return this.sizeDimension;
    }

    /**
     * Gets the value of the sizeSystemCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sizeSystemCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSizeSystemCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SizeSystemCodeType }
     * 
     * 
     */
    public List<SizeSystemCodeType> getSizeSystemCode() {
        if (sizeSystemCode == null) {
            sizeSystemCode = new ArrayList<SizeSystemCodeType>();
        }
        return this.sizeSystemCode;
    }

    /**
     * Gets the value of the sizeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link SizeTypeCodeType }
     *     
     */
    public SizeTypeCodeType getSizeTypeCode() {
        return sizeTypeCode;
    }

    /**
     * Sets the value of the sizeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeTypeCodeType }
     *     
     */
    public void setSizeTypeCode(SizeTypeCodeType value) {
        this.sizeTypeCode = value;
    }

    /**
     * Gets the value of the sizeTermDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sizeTermDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSizeTermDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getSizeTermDescription() {
        if (sizeTermDescription == null) {
            sizeTermDescription = new ArrayList<Description500Type>();
        }
        return this.sizeTermDescription;
    }

    /**
     * Gets the value of the isSizeTypeVariant property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsSizeTypeVariant() {
        return isSizeTypeVariant;
    }

    /**
     * Sets the value of the isSizeTypeVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsSizeTypeVariant(NonBinaryLogicEnumerationType value) {
        this.isSizeTypeVariant = value;
    }

    /**
     * Gets the value of the sizeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sizeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSizeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSizeCode() {
        if (sizeCode == null) {
            sizeCode = new ArrayList<String>();
        }
        return this.sizeCode;
    }

}
