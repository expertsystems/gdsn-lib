
package gs1.gdsn.product_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for TerpeneInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerpeneInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="terpeneTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}TerpeneTypeCodeType"/&gt;
 *         &lt;element name="maximumTerpeneContent" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="minimumTerpeneContent" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerpeneInformationType", propOrder = {
    "terpeneTypeCode",
    "maximumTerpeneContent",
    "minimumTerpeneContent"
})
public class TerpeneInformationType {

    @XmlElement(required = true)
    protected TerpeneTypeCodeType terpeneTypeCode;
    protected MeasurementType maximumTerpeneContent;
    protected MeasurementType minimumTerpeneContent;

    /**
     * Gets the value of the terpeneTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TerpeneTypeCodeType }
     *     
     */
    public TerpeneTypeCodeType getTerpeneTypeCode() {
        return terpeneTypeCode;
    }

    /**
     * Sets the value of the terpeneTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerpeneTypeCodeType }
     *     
     */
    public void setTerpeneTypeCode(TerpeneTypeCodeType value) {
        this.terpeneTypeCode = value;
    }

    /**
     * Gets the value of the maximumTerpeneContent property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getMaximumTerpeneContent() {
        return maximumTerpeneContent;
    }

    /**
     * Sets the value of the maximumTerpeneContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setMaximumTerpeneContent(MeasurementType value) {
        this.maximumTerpeneContent = value;
    }

    /**
     * Gets the value of the minimumTerpeneContent property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getMinimumTerpeneContent() {
        return minimumTerpeneContent;
    }

    /**
     * Sets the value of the minimumTerpeneContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setMinimumTerpeneContent(MeasurementType value) {
        this.minimumTerpeneContent = value;
    }

}
