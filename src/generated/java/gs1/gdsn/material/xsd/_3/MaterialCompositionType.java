
package gs1.gdsn.material.xsd._3;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.CountryType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.Description500Type;
import gs1.shared.shared_common.xsd._3.Description70Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for MaterialCompositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaterialCompositionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="materialCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="materialContent" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="materialPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="materialThreadCount" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="materialWeight" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="materialTreatment" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="materialDensityCode" type="{urn:gs1:gdsn:material:xsd:3}MaterialDensityCodeType" minOccurs="0"/&gt;
 *         &lt;element name="threadDenier" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="rawMaterialInformation" type="{urn:gs1:gdsn:material:xsd:3}RawMaterialInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="materialCountryOfOrigin" type="{urn:gs1:gdsn:gdsn_common:xsd:3}CountryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="avpList" type="{urn:gs1:gdsn:gdsn_common:xsd:3}GS1_AttributeValuePairListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialCompositionType", propOrder = {
    "materialCode",
    "materialContent",
    "materialPercentage",
    "materialThreadCount",
    "materialWeight",
    "materialTreatment",
    "materialDensityCode",
    "threadDenier",
    "rawMaterialInformation",
    "materialCountryOfOrigin",
    "avpList"
})
public class MaterialCompositionType {

    protected String materialCode;
    protected List<Description70Type> materialContent;
    protected BigDecimal materialPercentage;
    protected List<Description70Type> materialThreadCount;
    protected List<MeasurementType> materialWeight;
    protected List<Description500Type> materialTreatment;
    protected MaterialDensityCodeType materialDensityCode;
    protected BigInteger threadDenier;
    protected List<RawMaterialInformationType> rawMaterialInformation;
    protected List<CountryType> materialCountryOfOrigin;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the materialCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialCode() {
        return materialCode;
    }

    /**
     * Sets the value of the materialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialCode(String value) {
        this.materialCode = value;
    }

    /**
     * Gets the value of the materialContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getMaterialContent() {
        if (materialContent == null) {
            materialContent = new ArrayList<Description70Type>();
        }
        return this.materialContent;
    }

    /**
     * Gets the value of the materialPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaterialPercentage() {
        return materialPercentage;
    }

    /**
     * Sets the value of the materialPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaterialPercentage(BigDecimal value) {
        this.materialPercentage = value;
    }

    /**
     * Gets the value of the materialThreadCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialThreadCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialThreadCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getMaterialThreadCount() {
        if (materialThreadCount == null) {
            materialThreadCount = new ArrayList<Description70Type>();
        }
        return this.materialThreadCount;
    }

    /**
     * Gets the value of the materialWeight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialWeight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialWeight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getMaterialWeight() {
        if (materialWeight == null) {
            materialWeight = new ArrayList<MeasurementType>();
        }
        return this.materialWeight;
    }

    /**
     * Gets the value of the materialTreatment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialTreatment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialTreatment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getMaterialTreatment() {
        if (materialTreatment == null) {
            materialTreatment = new ArrayList<Description500Type>();
        }
        return this.materialTreatment;
    }

    /**
     * Gets the value of the materialDensityCode property.
     * 
     * @return
     *     possible object is
     *     {@link MaterialDensityCodeType }
     *     
     */
    public MaterialDensityCodeType getMaterialDensityCode() {
        return materialDensityCode;
    }

    /**
     * Sets the value of the materialDensityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialDensityCodeType }
     *     
     */
    public void setMaterialDensityCode(MaterialDensityCodeType value) {
        this.materialDensityCode = value;
    }

    /**
     * Gets the value of the threadDenier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getThreadDenier() {
        return threadDenier;
    }

    /**
     * Sets the value of the threadDenier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setThreadDenier(BigInteger value) {
        this.threadDenier = value;
    }

    /**
     * Gets the value of the rawMaterialInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rawMaterialInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRawMaterialInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RawMaterialInformationType }
     * 
     * 
     */
    public List<RawMaterialInformationType> getRawMaterialInformation() {
        if (rawMaterialInformation == null) {
            rawMaterialInformation = new ArrayList<RawMaterialInformationType>();
        }
        return this.rawMaterialInformation;
    }

    /**
     * Gets the value of the materialCountryOfOrigin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialCountryOfOrigin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialCountryOfOrigin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryType }
     * 
     * 
     */
    public List<CountryType> getMaterialCountryOfOrigin() {
        if (materialCountryOfOrigin == null) {
            materialCountryOfOrigin = new ArrayList<CountryType>();
        }
        return this.materialCountryOfOrigin;
    }

    /**
     * Gets the value of the avpList property.
     * 
     * @return
     *     possible object is
     *     {@link GS1AttributeValuePairListType }
     *     
     */
    public GS1AttributeValuePairListType getAvpList() {
        return avpList;
    }

    /**
     * Sets the value of the avpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GS1AttributeValuePairListType }
     *     
     */
    public void setAvpList(GS1AttributeValuePairListType value) {
        this.avpList = value;
    }

}
