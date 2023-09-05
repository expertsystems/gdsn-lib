
package gs1.gdsn.optics_device_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for OpticsDeviceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpticsDeviceInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="exposureMode" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fieldOfView" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zoomInformation" type="{urn:gs1:gdsn:optics_device_information:xsd:3}ZoomInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lensInformation" type="{urn:gs1:gdsn:optics_device_information:xsd:3}LensInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpticsDeviceInformationType", propOrder = {
    "exposureMode",
    "fieldOfView",
    "zoomInformation",
    "lensInformation"
})
public class OpticsDeviceInformationType {

    protected List<String> exposureMode;
    protected List<MeasurementType> fieldOfView;
    protected List<ZoomInformationType> zoomInformation;
    protected List<LensInformationType> lensInformation;

    /**
     * Gets the value of the exposureMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exposureMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExposureMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExposureMode() {
        if (exposureMode == null) {
            exposureMode = new ArrayList<String>();
        }
        return this.exposureMode;
    }

    /**
     * Gets the value of the fieldOfView property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldOfView property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldOfView().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getFieldOfView() {
        if (fieldOfView == null) {
            fieldOfView = new ArrayList<MeasurementType>();
        }
        return this.fieldOfView;
    }

    /**
     * Gets the value of the zoomInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zoomInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZoomInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZoomInformationType }
     * 
     * 
     */
    public List<ZoomInformationType> getZoomInformation() {
        if (zoomInformation == null) {
            zoomInformation = new ArrayList<ZoomInformationType>();
        }
        return this.zoomInformation;
    }

    /**
     * Gets the value of the lensInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lensInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLensInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LensInformationType }
     * 
     * 
     */
    public List<LensInformationType> getLensInformation() {
        if (lensInformation == null) {
            lensInformation = new ArrayList<LensInformationType>();
        }
        return this.lensInformation;
    }

}
