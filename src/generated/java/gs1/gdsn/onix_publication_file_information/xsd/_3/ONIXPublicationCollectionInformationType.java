
package gs1.gdsn.onix_publication_file_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.CodeType;


/**
 * <p>Java class for ONIXPublicationCollectionInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ONIXPublicationCollectionInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="collectionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="collectionIdentifierTypeCode" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXSeriesIdentifierTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="collectionTypeCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="sourceName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="oNIXContributor" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXContributorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="oNIXTitleElement" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXTitleElementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ONIXPublicationCollectionInformationType", propOrder = {
    "collectionIdentifier",
    "collectionIdentifierTypeCode",
    "collectionTypeCodeReference",
    "sourceName",
    "onixContributor",
    "onixTitleElement"
})
public class ONIXPublicationCollectionInformationType {

    protected String collectionIdentifier;
    protected ONIXSeriesIdentifierTypeCodeType collectionIdentifierTypeCode;
    protected CodeType collectionTypeCodeReference;
    protected String sourceName;
    @XmlElement(name = "oNIXContributor")
    protected List<ONIXContributorType> onixContributor;
    @XmlElement(name = "oNIXTitleElement")
    protected List<ONIXTitleElementType> onixTitleElement;

    /**
     * Gets the value of the collectionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionIdentifier() {
        return collectionIdentifier;
    }

    /**
     * Sets the value of the collectionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionIdentifier(String value) {
        this.collectionIdentifier = value;
    }

    /**
     * Gets the value of the collectionIdentifierTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ONIXSeriesIdentifierTypeCodeType }
     *     
     */
    public ONIXSeriesIdentifierTypeCodeType getCollectionIdentifierTypeCode() {
        return collectionIdentifierTypeCode;
    }

    /**
     * Sets the value of the collectionIdentifierTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ONIXSeriesIdentifierTypeCodeType }
     *     
     */
    public void setCollectionIdentifierTypeCode(ONIXSeriesIdentifierTypeCodeType value) {
        this.collectionIdentifierTypeCode = value;
    }

    /**
     * Gets the value of the collectionTypeCodeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCollectionTypeCodeReference() {
        return collectionTypeCodeReference;
    }

    /**
     * Sets the value of the collectionTypeCodeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCollectionTypeCodeReference(CodeType value) {
        this.collectionTypeCodeReference = value;
    }

    /**
     * Gets the value of the sourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * Sets the value of the sourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceName(String value) {
        this.sourceName = value;
    }

    /**
     * Gets the value of the onixContributor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onixContributor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getONIXContributor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXContributorType }
     * 
     * 
     */
    public List<ONIXContributorType> getONIXContributor() {
        if (onixContributor == null) {
            onixContributor = new ArrayList<ONIXContributorType>();
        }
        return this.onixContributor;
    }

    /**
     * Gets the value of the onixTitleElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onixTitleElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getONIXTitleElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXTitleElementType }
     * 
     * 
     */
    public List<ONIXTitleElementType> getONIXTitleElement() {
        if (onixTitleElement == null) {
            onixTitleElement = new ArrayList<ONIXTitleElementType>();
        }
        return this.onixTitleElement;
    }

}
