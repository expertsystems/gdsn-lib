
package gs1.gdsn.safety_data_sheet.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description1000Type;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for HazardousWasteInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HazardousWasteInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hazardousWasteAgency" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hazardousWasteCode" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hazardousWasteDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isAcutelyHazardousWaste" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="isUniversalWaste" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="nonhazardousWasteDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardousWasteInformationType", propOrder = {
    "hazardousWasteAgency",
    "hazardousWasteCode",
    "hazardousWasteDescription",
    "isAcutelyHazardousWaste",
    "isUniversalWaste",
    "nonhazardousWasteDescription"
})
public class HazardousWasteInformationType {

    protected String hazardousWasteAgency;
    protected List<String> hazardousWasteCode;
    protected List<Description1000Type> hazardousWasteDescription;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isAcutelyHazardousWaste;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isUniversalWaste;
    protected List<Description1000Type> nonhazardousWasteDescription;

    /**
     * Gets the value of the hazardousWasteAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardousWasteAgency() {
        return hazardousWasteAgency;
    }

    /**
     * Sets the value of the hazardousWasteAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardousWasteAgency(String value) {
        this.hazardousWasteAgency = value;
    }

    /**
     * Gets the value of the hazardousWasteCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousWasteCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousWasteCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHazardousWasteCode() {
        if (hazardousWasteCode == null) {
            hazardousWasteCode = new ArrayList<String>();
        }
        return this.hazardousWasteCode;
    }

    /**
     * Gets the value of the hazardousWasteDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousWasteDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousWasteDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getHazardousWasteDescription() {
        if (hazardousWasteDescription == null) {
            hazardousWasteDescription = new ArrayList<Description1000Type>();
        }
        return this.hazardousWasteDescription;
    }

    /**
     * Gets the value of the isAcutelyHazardousWaste property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsAcutelyHazardousWaste() {
        return isAcutelyHazardousWaste;
    }

    /**
     * Sets the value of the isAcutelyHazardousWaste property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsAcutelyHazardousWaste(NonBinaryLogicEnumerationType value) {
        this.isAcutelyHazardousWaste = value;
    }

    /**
     * Gets the value of the isUniversalWaste property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsUniversalWaste() {
        return isUniversalWaste;
    }

    /**
     * Sets the value of the isUniversalWaste property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsUniversalWaste(NonBinaryLogicEnumerationType value) {
        this.isUniversalWaste = value;
    }

    /**
     * Gets the value of the nonhazardousWasteDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonhazardousWasteDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonhazardousWasteDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getNonhazardousWasteDescription() {
        if (nonhazardousWasteDescription == null) {
            nonhazardousWasteDescription = new ArrayList<Description1000Type>();
        }
        return this.nonhazardousWasteDescription;
    }

}
