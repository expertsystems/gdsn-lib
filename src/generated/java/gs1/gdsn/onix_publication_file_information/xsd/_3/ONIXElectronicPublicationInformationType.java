
package gs1.gdsn.onix_publication_file_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ONIXElectronicPublicationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ONIXElectronicPublicationInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="epubTechnicalProtectionTypeCode" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXEpubTechnicalProtectionTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="epubUsageLimit" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="epubUsageStatus" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="epubUsageType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
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
@XmlType(name = "ONIXElectronicPublicationInformationType", propOrder = {
    "epubTechnicalProtectionTypeCode",
    "epubUsageLimit",
    "epubUsageStatus",
    "epubUsageType"
})
public class ONIXElectronicPublicationInformationType {

    protected List<ONIXEpubTechnicalProtectionTypeCodeType> epubTechnicalProtectionTypeCode;
    protected String epubUsageLimit;
    protected String epubUsageStatus;
    protected String epubUsageType;

    /**
     * Gets the value of the epubTechnicalProtectionTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the epubTechnicalProtectionTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEpubTechnicalProtectionTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXEpubTechnicalProtectionTypeCodeType }
     * 
     * 
     */
    public List<ONIXEpubTechnicalProtectionTypeCodeType> getEpubTechnicalProtectionTypeCode() {
        if (epubTechnicalProtectionTypeCode == null) {
            epubTechnicalProtectionTypeCode = new ArrayList<ONIXEpubTechnicalProtectionTypeCodeType>();
        }
        return this.epubTechnicalProtectionTypeCode;
    }

    /**
     * Gets the value of the epubUsageLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpubUsageLimit() {
        return epubUsageLimit;
    }

    /**
     * Sets the value of the epubUsageLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpubUsageLimit(String value) {
        this.epubUsageLimit = value;
    }

    /**
     * Gets the value of the epubUsageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpubUsageStatus() {
        return epubUsageStatus;
    }

    /**
     * Sets the value of the epubUsageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpubUsageStatus(String value) {
        this.epubUsageStatus = value;
    }

    /**
     * Gets the value of the epubUsageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpubUsageType() {
        return epubUsageType;
    }

    /**
     * Sets the value of the epubUsageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpubUsageType(String value) {
        this.epubUsageType = value;
    }

}
