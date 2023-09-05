
package gs1.gdsn.onix_publication_file_information.xsd._3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import gs1.shared.shared_common.xsd._3.Description5000Type;
import se.exder.external.gs1.gdsn3p1.Adapter3;


/**
 * <p>Java class for ONIXAdditionalPublicationDescriptionInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ONIXAdditionalPublicationDescriptionInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contentDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="contentDateRoleTypeCode" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXContentDateRoleTypeCodeType"/&gt;
 *         &lt;element name="additionalPublicationDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="descriptionSource" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="300"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="publicationDescriptionTypeCode" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXPublicationDescriptionTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="textAuthor" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXContributorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ONIXAdditionalPublicationDescriptionInformationType", propOrder = {
    "contentDate",
    "contentDateRoleTypeCode",
    "additionalPublicationDescription",
    "descriptionSource",
    "publicationDescriptionTypeCode",
    "textAuthor"
})
public class ONIXAdditionalPublicationDescriptionInformationType {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate contentDate;
    @XmlElement(required = true)
    protected ONIXContentDateRoleTypeCodeType contentDateRoleTypeCode;
    protected List<Description5000Type> additionalPublicationDescription;
    protected String descriptionSource;
    protected List<ONIXPublicationDescriptionTypeCodeType> publicationDescriptionTypeCode;
    protected List<ONIXContributorType> textAuthor;

    /**
     * Gets the value of the contentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getContentDate() {
        return contentDate;
    }

    /**
     * Sets the value of the contentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentDate(LocalDate value) {
        this.contentDate = value;
    }

    /**
     * Gets the value of the contentDateRoleTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ONIXContentDateRoleTypeCodeType }
     *     
     */
    public ONIXContentDateRoleTypeCodeType getContentDateRoleTypeCode() {
        return contentDateRoleTypeCode;
    }

    /**
     * Sets the value of the contentDateRoleTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ONIXContentDateRoleTypeCodeType }
     *     
     */
    public void setContentDateRoleTypeCode(ONIXContentDateRoleTypeCodeType value) {
        this.contentDateRoleTypeCode = value;
    }

    /**
     * Gets the value of the additionalPublicationDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalPublicationDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalPublicationDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getAdditionalPublicationDescription() {
        if (additionalPublicationDescription == null) {
            additionalPublicationDescription = new ArrayList<Description5000Type>();
        }
        return this.additionalPublicationDescription;
    }

    /**
     * Gets the value of the descriptionSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionSource() {
        return descriptionSource;
    }

    /**
     * Sets the value of the descriptionSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionSource(String value) {
        this.descriptionSource = value;
    }

    /**
     * Gets the value of the publicationDescriptionTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicationDescriptionTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicationDescriptionTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXPublicationDescriptionTypeCodeType }
     * 
     * 
     */
    public List<ONIXPublicationDescriptionTypeCodeType> getPublicationDescriptionTypeCode() {
        if (publicationDescriptionTypeCode == null) {
            publicationDescriptionTypeCode = new ArrayList<ONIXPublicationDescriptionTypeCodeType>();
        }
        return this.publicationDescriptionTypeCode;
    }

    /**
     * Gets the value of the textAuthor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textAuthor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextAuthor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXContributorType }
     * 
     * 
     */
    public List<ONIXContributorType> getTextAuthor() {
        if (textAuthor == null) {
            textAuthor = new ArrayList<ONIXContributorType>();
        }
        return this.textAuthor;
    }

}
