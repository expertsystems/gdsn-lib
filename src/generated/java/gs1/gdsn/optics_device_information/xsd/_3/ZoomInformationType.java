
package gs1.gdsn.optics_device_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZoomInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoomInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="zoomTimesFactor" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zoomTypeCode" type="{urn:gs1:gdsn:optics_device_information:xsd:3}ZoomTypeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoomInformationType", propOrder = {
    "zoomTimesFactor",
    "zoomTypeCode"
})
public class ZoomInformationType {

    @XmlElement(type = Float.class)
    protected List<Float> zoomTimesFactor;
    protected ZoomTypeCodeType zoomTypeCode;

    /**
     * Gets the value of the zoomTimesFactor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zoomTimesFactor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZoomTimesFactor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * 
     * 
     */
    public List<Float> getZoomTimesFactor() {
        if (zoomTimesFactor == null) {
            zoomTimesFactor = new ArrayList<Float>();
        }
        return this.zoomTimesFactor;
    }

    /**
     * Gets the value of the zoomTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ZoomTypeCodeType }
     *     
     */
    public ZoomTypeCodeType getZoomTypeCode() {
        return zoomTypeCode;
    }

    /**
     * Sets the value of the zoomTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoomTypeCodeType }
     *     
     */
    public void setZoomTypeCode(ZoomTypeCodeType value) {
        this.zoomTypeCode = value;
    }

}
