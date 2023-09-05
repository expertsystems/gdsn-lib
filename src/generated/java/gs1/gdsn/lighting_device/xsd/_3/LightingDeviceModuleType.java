
package gs1.gdsn.lighting_device.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for LightingDeviceModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LightingDeviceModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lightOutput" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lightBulbInformation" type="{urn:gs1:gdsn:lighting_device:xsd:3}LightBulbInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LightingDeviceModuleType", propOrder = {
    "lightOutput",
    "lightBulbInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:lighting_device:xsd:3")
public class LightingDeviceModuleType {

    protected List<MeasurementType> lightOutput;
    protected List<LightBulbInformationType> lightBulbInformation;

    /**
     * Gets the value of the lightOutput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lightOutput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLightOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getLightOutput() {
        if (lightOutput == null) {
            lightOutput = new ArrayList<MeasurementType>();
        }
        return this.lightOutput;
    }

    /**
     * Gets the value of the lightBulbInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lightBulbInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLightBulbInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LightBulbInformationType }
     * 
     * 
     */
    public List<LightBulbInformationType> getLightBulbInformation() {
        if (lightBulbInformation == null) {
            lightBulbInformation = new ArrayList<LightBulbInformationType>();
        }
        return this.lightBulbInformation;
    }

}
