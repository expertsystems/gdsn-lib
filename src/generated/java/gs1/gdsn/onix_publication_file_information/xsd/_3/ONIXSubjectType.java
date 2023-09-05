
package gs1.gdsn.onix_publication_file_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ONIXSubjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ONIXSubjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subjectSchemeIdentifierCode" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXSubjectSchemeIdentifierCodeType"/&gt;
 *         &lt;element name="mainSubject" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="300"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="subjectCode" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="subjectHeadingText" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="300"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="subjectSchemeName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="subjectSchemeVersion" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nameAsSubject" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXPublicationNameInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ONIXSubjectType", propOrder = {
    "subjectSchemeIdentifierCode",
    "mainSubject",
    "subjectCode",
    "subjectHeadingText",
    "subjectSchemeName",
    "subjectSchemeVersion",
    "nameAsSubject"
})
public class ONIXSubjectType {

    @XmlElement(required = true)
    protected ONIXSubjectSchemeIdentifierCodeType subjectSchemeIdentifierCode;
    protected List<String> mainSubject;
    protected List<String> subjectCode;
    protected String subjectHeadingText;
    protected String subjectSchemeName;
    protected String subjectSchemeVersion;
    protected List<ONIXPublicationNameInformationType> nameAsSubject;

    /**
     * Gets the value of the subjectSchemeIdentifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link ONIXSubjectSchemeIdentifierCodeType }
     *     
     */
    public ONIXSubjectSchemeIdentifierCodeType getSubjectSchemeIdentifierCode() {
        return subjectSchemeIdentifierCode;
    }

    /**
     * Sets the value of the subjectSchemeIdentifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ONIXSubjectSchemeIdentifierCodeType }
     *     
     */
    public void setSubjectSchemeIdentifierCode(ONIXSubjectSchemeIdentifierCodeType value) {
        this.subjectSchemeIdentifierCode = value;
    }

    /**
     * Gets the value of the mainSubject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mainSubject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMainSubject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMainSubject() {
        if (mainSubject == null) {
            mainSubject = new ArrayList<String>();
        }
        return this.mainSubject;
    }

    /**
     * Gets the value of the subjectCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubjectCode() {
        if (subjectCode == null) {
            subjectCode = new ArrayList<String>();
        }
        return this.subjectCode;
    }

    /**
     * Gets the value of the subjectHeadingText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectHeadingText() {
        return subjectHeadingText;
    }

    /**
     * Sets the value of the subjectHeadingText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectHeadingText(String value) {
        this.subjectHeadingText = value;
    }

    /**
     * Gets the value of the subjectSchemeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectSchemeName() {
        return subjectSchemeName;
    }

    /**
     * Sets the value of the subjectSchemeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectSchemeName(String value) {
        this.subjectSchemeName = value;
    }

    /**
     * Gets the value of the subjectSchemeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectSchemeVersion() {
        return subjectSchemeVersion;
    }

    /**
     * Sets the value of the subjectSchemeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectSchemeVersion(String value) {
        this.subjectSchemeVersion = value;
    }

    /**
     * Gets the value of the nameAsSubject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameAsSubject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameAsSubject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXPublicationNameInformationType }
     * 
     * 
     */
    public List<ONIXPublicationNameInformationType> getNameAsSubject() {
        if (nameAsSubject == null) {
            nameAsSubject = new ArrayList<ONIXPublicationNameInformationType>();
        }
        return this.nameAsSubject;
    }

}
