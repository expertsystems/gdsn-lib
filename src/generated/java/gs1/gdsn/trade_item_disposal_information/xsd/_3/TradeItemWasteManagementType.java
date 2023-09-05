
package gs1.gdsn.trade_item_disposal_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for TradeItemWasteManagementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemWasteManagementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wasteAmount" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="wasteDirectiveApplianceType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="wasteDirectiveName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="wasteDirectiveRegistrationNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemWasteManagementType", propOrder = {
    "wasteAmount",
    "wasteDirectiveApplianceType",
    "wasteDirectiveName",
    "wasteDirectiveRegistrationNumber"
})
public class TradeItemWasteManagementType {

    protected List<MeasurementType> wasteAmount;
    protected String wasteDirectiveApplianceType;
    protected String wasteDirectiveName;
    protected String wasteDirectiveRegistrationNumber;

    /**
     * Gets the value of the wasteAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wasteAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWasteAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getWasteAmount() {
        if (wasteAmount == null) {
            wasteAmount = new ArrayList<MeasurementType>();
        }
        return this.wasteAmount;
    }

    /**
     * Gets the value of the wasteDirectiveApplianceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWasteDirectiveApplianceType() {
        return wasteDirectiveApplianceType;
    }

    /**
     * Sets the value of the wasteDirectiveApplianceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWasteDirectiveApplianceType(String value) {
        this.wasteDirectiveApplianceType = value;
    }

    /**
     * Gets the value of the wasteDirectiveName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWasteDirectiveName() {
        return wasteDirectiveName;
    }

    /**
     * Sets the value of the wasteDirectiveName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWasteDirectiveName(String value) {
        this.wasteDirectiveName = value;
    }

    /**
     * Gets the value of the wasteDirectiveRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWasteDirectiveRegistrationNumber() {
        return wasteDirectiveRegistrationNumber;
    }

    /**
     * Sets the value of the wasteDirectiveRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWasteDirectiveRegistrationNumber(String value) {
        this.wasteDirectiveRegistrationNumber = value;
    }

}
