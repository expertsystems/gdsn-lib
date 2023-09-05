
package gs1.gdsn.electronic_device_characteristics_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for ImageDeviceResolutionInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageDeviceResolutionInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maximumResolution" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="resolutionTypeCode" type="{urn:gs1:gdsn:electronic_device_characteristics_information:xsd:3}ResolutionTypeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageDeviceResolutionInformationType", propOrder = {
    "maximumResolution",
    "resolutionTypeCode"
})
public class ImageDeviceResolutionInformationType {

    protected List<MeasurementType> maximumResolution;
    protected ResolutionTypeCodeType resolutionTypeCode;

    /**
     * Gets the value of the maximumResolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maximumResolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaximumResolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getMaximumResolution() {
        if (maximumResolution == null) {
            maximumResolution = new ArrayList<MeasurementType>();
        }
        return this.maximumResolution;
    }

    /**
     * Gets the value of the resolutionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionTypeCodeType }
     *     
     */
    public ResolutionTypeCodeType getResolutionTypeCode() {
        return resolutionTypeCode;
    }

    /**
     * Sets the value of the resolutionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionTypeCodeType }
     *     
     */
    public void setResolutionTypeCode(ResolutionTypeCodeType value) {
        this.resolutionTypeCode = value;
    }

}
