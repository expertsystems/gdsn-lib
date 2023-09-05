
package gs1.gdsn.safety_data_sheet.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description1000Type;


/**
 * <p>Java class for StorageCompatibilityInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StorageCompatibilityInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="storageCompatibilityAgency" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="storageCompatibilityCode" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="storageCompatibilityDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageCompatibilityInformationType", propOrder = {
    "storageCompatibilityAgency",
    "storageCompatibilityCode",
    "storageCompatibilityDescription"
})
public class StorageCompatibilityInformationType {

    protected String storageCompatibilityAgency;
    protected List<String> storageCompatibilityCode;
    protected List<Description1000Type> storageCompatibilityDescription;

    /**
     * Gets the value of the storageCompatibilityAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageCompatibilityAgency() {
        return storageCompatibilityAgency;
    }

    /**
     * Sets the value of the storageCompatibilityAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageCompatibilityAgency(String value) {
        this.storageCompatibilityAgency = value;
    }

    /**
     * Gets the value of the storageCompatibilityCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storageCompatibilityCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStorageCompatibilityCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStorageCompatibilityCode() {
        if (storageCompatibilityCode == null) {
            storageCompatibilityCode = new ArrayList<String>();
        }
        return this.storageCompatibilityCode;
    }

    /**
     * Gets the value of the storageCompatibilityDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storageCompatibilityDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStorageCompatibilityDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getStorageCompatibilityDescription() {
        if (storageCompatibilityDescription == null) {
            storageCompatibilityDescription = new ArrayList<Description1000Type>();
        }
        return this.storageCompatibilityDescription;
    }

}
