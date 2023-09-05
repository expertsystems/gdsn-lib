
package gs1.gdsn.medical_device_trade_item.xsd._3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import gs1.shared.shared_common.xsd._3.Description2000Type;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for MedicalDeviceSubStatusInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicalDeviceSubStatusInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceSubStatusEndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="deviceSubStatusStartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="recallPrecision" type="{urn:gs1:shared:shared_common:xsd:3}Description2000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="eUMedicalDeviceSubStatusCode" type="{urn:gs1:gdsn:medical_device_trade_item:xsd:3}EUMedicalDeviceSubStatusCodeType"/&gt;
 *         &lt;element name="recallScopeTypeCode" type="{urn:gs1:gdsn:medical_device_trade_item:xsd:3}RecallScopeTypeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicalDeviceSubStatusInformationType", propOrder = {
    "deviceSubStatusEndDateTime",
    "deviceSubStatusStartDateTime",
    "recallPrecision",
    "euMedicalDeviceSubStatusCode",
    "recallScopeTypeCode"
})
public class MedicalDeviceSubStatusInformationType {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime deviceSubStatusEndDateTime;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime deviceSubStatusStartDateTime;
    protected List<Description2000Type> recallPrecision;
    @XmlElement(name = "eUMedicalDeviceSubStatusCode", required = true)
    protected EUMedicalDeviceSubStatusCodeType euMedicalDeviceSubStatusCode;
    protected RecallScopeTypeCodeType recallScopeTypeCode;

    /**
     * Gets the value of the deviceSubStatusEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getDeviceSubStatusEndDateTime() {
        return deviceSubStatusEndDateTime;
    }

    /**
     * Sets the value of the deviceSubStatusEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSubStatusEndDateTime(LocalDateTime value) {
        this.deviceSubStatusEndDateTime = value;
    }

    /**
     * Gets the value of the deviceSubStatusStartDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getDeviceSubStatusStartDateTime() {
        return deviceSubStatusStartDateTime;
    }

    /**
     * Sets the value of the deviceSubStatusStartDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSubStatusStartDateTime(LocalDateTime value) {
        this.deviceSubStatusStartDateTime = value;
    }

    /**
     * Gets the value of the recallPrecision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recallPrecision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecallPrecision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description2000Type }
     * 
     * 
     */
    public List<Description2000Type> getRecallPrecision() {
        if (recallPrecision == null) {
            recallPrecision = new ArrayList<Description2000Type>();
        }
        return this.recallPrecision;
    }

    /**
     * Gets the value of the euMedicalDeviceSubStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link EUMedicalDeviceSubStatusCodeType }
     *     
     */
    public EUMedicalDeviceSubStatusCodeType getEUMedicalDeviceSubStatusCode() {
        return euMedicalDeviceSubStatusCode;
    }

    /**
     * Sets the value of the euMedicalDeviceSubStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUMedicalDeviceSubStatusCodeType }
     *     
     */
    public void setEUMedicalDeviceSubStatusCode(EUMedicalDeviceSubStatusCodeType value) {
        this.euMedicalDeviceSubStatusCode = value;
    }

    /**
     * Gets the value of the recallScopeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link RecallScopeTypeCodeType }
     *     
     */
    public RecallScopeTypeCodeType getRecallScopeTypeCode() {
        return recallScopeTypeCode;
    }

    /**
     * Sets the value of the recallScopeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecallScopeTypeCodeType }
     *     
     */
    public void setRecallScopeTypeCode(RecallScopeTypeCodeType value) {
        this.recallScopeTypeCode = value;
    }

}
