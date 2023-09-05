
package gs1.gdsn.safety_data_sheet.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description1000Type;


/**
 * <p>Java class for ProtectiveEquipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProtectiveEquipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="protectiveEquipmentAdditionalDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="protectiveEquipmentBodyAreaCode" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}ProtectiveEquipmentBodyAreaCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="protectiveEquipment" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="protectiveEquipmentStatusCode" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}RecommendedStatusCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtectiveEquipmentType", propOrder = {
    "protectiveEquipmentAdditionalDescription",
    "protectiveEquipmentBodyAreaCode",
    "protectiveEquipment",
    "protectiveEquipmentStatusCode"
})
public class ProtectiveEquipmentType {

    protected List<Description1000Type> protectiveEquipmentAdditionalDescription;
    protected List<ProtectiveEquipmentBodyAreaCodeType> protectiveEquipmentBodyAreaCode;
    protected List<Description1000Type> protectiveEquipment;
    protected RecommendedStatusCodeType protectiveEquipmentStatusCode;

    /**
     * Gets the value of the protectiveEquipmentAdditionalDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protectiveEquipmentAdditionalDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtectiveEquipmentAdditionalDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getProtectiveEquipmentAdditionalDescription() {
        if (protectiveEquipmentAdditionalDescription == null) {
            protectiveEquipmentAdditionalDescription = new ArrayList<Description1000Type>();
        }
        return this.protectiveEquipmentAdditionalDescription;
    }

    /**
     * Gets the value of the protectiveEquipmentBodyAreaCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protectiveEquipmentBodyAreaCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtectiveEquipmentBodyAreaCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProtectiveEquipmentBodyAreaCodeType }
     * 
     * 
     */
    public List<ProtectiveEquipmentBodyAreaCodeType> getProtectiveEquipmentBodyAreaCode() {
        if (protectiveEquipmentBodyAreaCode == null) {
            protectiveEquipmentBodyAreaCode = new ArrayList<ProtectiveEquipmentBodyAreaCodeType>();
        }
        return this.protectiveEquipmentBodyAreaCode;
    }

    /**
     * Gets the value of the protectiveEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protectiveEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtectiveEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getProtectiveEquipment() {
        if (protectiveEquipment == null) {
            protectiveEquipment = new ArrayList<Description1000Type>();
        }
        return this.protectiveEquipment;
    }

    /**
     * Gets the value of the protectiveEquipmentStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link RecommendedStatusCodeType }
     *     
     */
    public RecommendedStatusCodeType getProtectiveEquipmentStatusCode() {
        return protectiveEquipmentStatusCode;
    }

    /**
     * Sets the value of the protectiveEquipmentStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecommendedStatusCodeType }
     *     
     */
    public void setProtectiveEquipmentStatusCode(RecommendedStatusCodeType value) {
        this.protectiveEquipmentStatusCode = value;
    }

}
