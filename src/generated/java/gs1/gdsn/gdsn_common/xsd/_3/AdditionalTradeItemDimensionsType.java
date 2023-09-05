
package gs1.gdsn.gdsn_common.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for AdditionalTradeItemDimensionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalTradeItemDimensionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="depth" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dimensionTypeCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}DimensionTypeCodeType"/&gt;
 *         &lt;element name="height" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="width" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="grossWeight" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="diameter" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalTradeItemDimensionsType", propOrder = {
    "depth",
    "dimensionTypeCode",
    "height",
    "width",
    "grossWeight",
    "diameter"
})
public class AdditionalTradeItemDimensionsType {

    protected List<MeasurementType> depth;
    @XmlElement(required = true)
    protected DimensionTypeCodeType dimensionTypeCode;
    protected List<MeasurementType> height;
    protected List<MeasurementType> width;
    protected List<MeasurementType> grossWeight;
    protected List<MeasurementType> diameter;

    /**
     * Gets the value of the depth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getDepth() {
        if (depth == null) {
            depth = new ArrayList<MeasurementType>();
        }
        return this.depth;
    }

    /**
     * Gets the value of the dimensionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionTypeCodeType }
     *     
     */
    public DimensionTypeCodeType getDimensionTypeCode() {
        return dimensionTypeCode;
    }

    /**
     * Sets the value of the dimensionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionTypeCodeType }
     *     
     */
    public void setDimensionTypeCode(DimensionTypeCodeType value) {
        this.dimensionTypeCode = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the height property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getHeight() {
        if (height == null) {
            height = new ArrayList<MeasurementType>();
        }
        return this.height;
    }

    /**
     * Gets the value of the width property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the width property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWidth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getWidth() {
        if (width == null) {
            width = new ArrayList<MeasurementType>();
        }
        return this.width;
    }

    /**
     * Gets the value of the grossWeight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grossWeight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrossWeight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getGrossWeight() {
        if (grossWeight == null) {
            grossWeight = new ArrayList<MeasurementType>();
        }
        return this.grossWeight;
    }

    /**
     * Gets the value of the diameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getDiameter() {
        if (diameter == null) {
            diameter = new ArrayList<MeasurementType>();
        }
        return this.diameter;
    }

}
