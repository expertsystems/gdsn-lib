
package gs1.gdsn.safety_data_sheet.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REACHUseDescriptorInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REACHUseDescriptorInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rEACHChemicalProductUseDescriptorCodeType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="rEACHEnvironmentReleaseUseCategoryCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="rEACHProcessUseDescriptorCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="rEACHSectorUseDescriptorCode" minOccurs="0"&gt;
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
@XmlType(name = "REACHUseDescriptorInformationType", propOrder = {
    "reachChemicalProductUseDescriptorCodeType",
    "reachEnvironmentReleaseUseCategoryCode",
    "reachProcessUseDescriptorCode",
    "reachSectorUseDescriptorCode"
})
public class REACHUseDescriptorInformationType {

    @XmlElement(name = "rEACHChemicalProductUseDescriptorCodeType")
    protected String reachChemicalProductUseDescriptorCodeType;
    @XmlElement(name = "rEACHEnvironmentReleaseUseCategoryCode")
    protected String reachEnvironmentReleaseUseCategoryCode;
    @XmlElement(name = "rEACHProcessUseDescriptorCode")
    protected String reachProcessUseDescriptorCode;
    @XmlElement(name = "rEACHSectorUseDescriptorCode")
    protected String reachSectorUseDescriptorCode;

    /**
     * Gets the value of the reachChemicalProductUseDescriptorCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREACHChemicalProductUseDescriptorCodeType() {
        return reachChemicalProductUseDescriptorCodeType;
    }

    /**
     * Sets the value of the reachChemicalProductUseDescriptorCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREACHChemicalProductUseDescriptorCodeType(String value) {
        this.reachChemicalProductUseDescriptorCodeType = value;
    }

    /**
     * Gets the value of the reachEnvironmentReleaseUseCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREACHEnvironmentReleaseUseCategoryCode() {
        return reachEnvironmentReleaseUseCategoryCode;
    }

    /**
     * Sets the value of the reachEnvironmentReleaseUseCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREACHEnvironmentReleaseUseCategoryCode(String value) {
        this.reachEnvironmentReleaseUseCategoryCode = value;
    }

    /**
     * Gets the value of the reachProcessUseDescriptorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREACHProcessUseDescriptorCode() {
        return reachProcessUseDescriptorCode;
    }

    /**
     * Sets the value of the reachProcessUseDescriptorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREACHProcessUseDescriptorCode(String value) {
        this.reachProcessUseDescriptorCode = value;
    }

    /**
     * Gets the value of the reachSectorUseDescriptorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREACHSectorUseDescriptorCode() {
        return reachSectorUseDescriptorCode;
    }

    /**
     * Sets the value of the reachSectorUseDescriptorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREACHSectorUseDescriptorCode(String value) {
        this.reachSectorUseDescriptorCode = value;
    }

}
