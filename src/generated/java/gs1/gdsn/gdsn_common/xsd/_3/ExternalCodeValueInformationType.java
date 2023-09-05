
package gs1.gdsn.gdsn_common.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalCodeValueInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalCodeValueInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="externalAgencyName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="externalCodeListName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="externalCodeListVersion" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="enumerationValueInformation" type="{urn:gs1:gdsn:gdsn_common:xsd:3}EnumerationValueInformationType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalCodeValueInformationType", propOrder = {
    "externalAgencyName",
    "externalCodeListName",
    "externalCodeListVersion",
    "enumerationValueInformation"
})
public class ExternalCodeValueInformationType {

    protected String externalAgencyName;
    protected String externalCodeListName;
    protected String externalCodeListVersion;
    @XmlElement(required = true)
    protected List<EnumerationValueInformationType> enumerationValueInformation;

    /**
     * Gets the value of the externalAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalAgencyName() {
        return externalAgencyName;
    }

    /**
     * Sets the value of the externalAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalAgencyName(String value) {
        this.externalAgencyName = value;
    }

    /**
     * Gets the value of the externalCodeListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCodeListName() {
        return externalCodeListName;
    }

    /**
     * Sets the value of the externalCodeListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCodeListName(String value) {
        this.externalCodeListName = value;
    }

    /**
     * Gets the value of the externalCodeListVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCodeListVersion() {
        return externalCodeListVersion;
    }

    /**
     * Sets the value of the externalCodeListVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCodeListVersion(String value) {
        this.externalCodeListVersion = value;
    }

    /**
     * Gets the value of the enumerationValueInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enumerationValueInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumerationValueInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumerationValueInformationType }
     * 
     * 
     */
    public List<EnumerationValueInformationType> getEnumerationValueInformation() {
        if (enumerationValueInformation == null) {
            enumerationValueInformation = new ArrayList<EnumerationValueInformationType>();
        }
        return this.enumerationValueInformation;
    }

}
