
package gs1.gdsn.packaging_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for PackagingDimensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingDimensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packagingDepth" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="packagingHeight" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="packagingWidth" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingDimensionType", propOrder = {
    "packagingDepth",
    "packagingHeight",
    "packagingWidth"
})
public class PackagingDimensionType {

    protected MeasurementType packagingDepth;
    protected MeasurementType packagingHeight;
    protected MeasurementType packagingWidth;

    /**
     * Gets the value of the packagingDepth property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getPackagingDepth() {
        return packagingDepth;
    }

    /**
     * Sets the value of the packagingDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setPackagingDepth(MeasurementType value) {
        this.packagingDepth = value;
    }

    /**
     * Gets the value of the packagingHeight property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getPackagingHeight() {
        return packagingHeight;
    }

    /**
     * Sets the value of the packagingHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setPackagingHeight(MeasurementType value) {
        this.packagingHeight = value;
    }

    /**
     * Gets the value of the packagingWidth property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getPackagingWidth() {
        return packagingWidth;
    }

    /**
     * Sets the value of the packagingWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setPackagingWidth(MeasurementType value) {
        this.packagingWidth = value;
    }

}
