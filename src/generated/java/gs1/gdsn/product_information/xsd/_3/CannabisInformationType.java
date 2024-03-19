
package gs1.gdsn.product_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CannabisInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CannabisInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cannabisCBDTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}CannabisCBDTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cannabinoidTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}CannabinoidTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="cannabinoidContentInformation" type="{urn:gs1:gdsn:product_information:xsd:3}CannabinoidContentInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cannabisPlantInformation" type="{urn:gs1:gdsn:product_information:xsd:3}CannabisPlantInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CannabisInformationType", propOrder = {
    "cannabisCBDTypeCode",
    "cannabinoidTypeCode",
    "cannabinoidContentInformation",
    "cannabisPlantInformation"
})
public class CannabisInformationType {

    protected List<CannabisCBDTypeCodeType> cannabisCBDTypeCode;
    protected CannabinoidTypeCodeType cannabinoidTypeCode;
    protected List<CannabinoidContentInformationType> cannabinoidContentInformation;
    protected List<CannabisPlantInformationType> cannabisPlantInformation;

    /**
     * Gets the value of the cannabisCBDTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cannabisCBDTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCannabisCBDTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CannabisCBDTypeCodeType }
     * 
     * 
     */
    public List<CannabisCBDTypeCodeType> getCannabisCBDTypeCode() {
        if (cannabisCBDTypeCode == null) {
            cannabisCBDTypeCode = new ArrayList<CannabisCBDTypeCodeType>();
        }
        return this.cannabisCBDTypeCode;
    }

    /**
     * Gets the value of the cannabinoidTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CannabinoidTypeCodeType }
     *     
     */
    public CannabinoidTypeCodeType getCannabinoidTypeCode() {
        return cannabinoidTypeCode;
    }

    /**
     * Sets the value of the cannabinoidTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CannabinoidTypeCodeType }
     *     
     */
    public void setCannabinoidTypeCode(CannabinoidTypeCodeType value) {
        this.cannabinoidTypeCode = value;
    }

    /**
     * Gets the value of the cannabinoidContentInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cannabinoidContentInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCannabinoidContentInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CannabinoidContentInformationType }
     * 
     * 
     */
    public List<CannabinoidContentInformationType> getCannabinoidContentInformation() {
        if (cannabinoidContentInformation == null) {
            cannabinoidContentInformation = new ArrayList<CannabinoidContentInformationType>();
        }
        return this.cannabinoidContentInformation;
    }

    /**
     * Gets the value of the cannabisPlantInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cannabisPlantInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCannabisPlantInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CannabisPlantInformationType }
     * 
     * 
     */
    public List<CannabisPlantInformationType> getCannabisPlantInformation() {
        if (cannabisPlantInformation == null) {
            cannabisPlantInformation = new ArrayList<CannabisPlantInformationType>();
        }
        return this.cannabisPlantInformation;
    }

}
