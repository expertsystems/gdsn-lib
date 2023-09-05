
package gs1.gdsn.electronic_device_characteristics_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for DataStorageDeviceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataStorageDeviceInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="externalMemoryTypeCode" type="{urn:gs1:gdsn:electronic_device_characteristics_information:xsd:3}ExternalMemoryTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="internalMemoryTypeCode" type="{urn:gs1:gdsn:electronic_device_characteristics_information:xsd:3}InternalMemoryTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="maximumAvailableStorageCapacity" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataStorageDeviceInformationType", propOrder = {
    "externalMemoryTypeCode",
    "internalMemoryTypeCode",
    "maximumAvailableStorageCapacity"
})
public class DataStorageDeviceInformationType {

    protected List<ExternalMemoryTypeCodeType> externalMemoryTypeCode;
    protected InternalMemoryTypeCodeType internalMemoryTypeCode;
    protected List<MeasurementType> maximumAvailableStorageCapacity;

    /**
     * Gets the value of the externalMemoryTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalMemoryTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalMemoryTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalMemoryTypeCodeType }
     * 
     * 
     */
    public List<ExternalMemoryTypeCodeType> getExternalMemoryTypeCode() {
        if (externalMemoryTypeCode == null) {
            externalMemoryTypeCode = new ArrayList<ExternalMemoryTypeCodeType>();
        }
        return this.externalMemoryTypeCode;
    }

    /**
     * Gets the value of the internalMemoryTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link InternalMemoryTypeCodeType }
     *     
     */
    public InternalMemoryTypeCodeType getInternalMemoryTypeCode() {
        return internalMemoryTypeCode;
    }

    /**
     * Sets the value of the internalMemoryTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalMemoryTypeCodeType }
     *     
     */
    public void setInternalMemoryTypeCode(InternalMemoryTypeCodeType value) {
        this.internalMemoryTypeCode = value;
    }

    /**
     * Gets the value of the maximumAvailableStorageCapacity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maximumAvailableStorageCapacity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaximumAvailableStorageCapacity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getMaximumAvailableStorageCapacity() {
        if (maximumAvailableStorageCapacity == null) {
            maximumAvailableStorageCapacity = new ArrayList<MeasurementType>();
        }
        return this.maximumAvailableStorageCapacity;
    }

}
