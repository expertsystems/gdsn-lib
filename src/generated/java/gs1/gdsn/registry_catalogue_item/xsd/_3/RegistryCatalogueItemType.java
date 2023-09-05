
package gs1.gdsn.registry_catalogue_item.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.CatalogueItemReferenceType;
import gs1.shared.shared_common.xsd._3.DocumentType;
import gs1.shared.shared_common.xsd._3.EntityIdentificationType;


/**
 * <p>Java class for RegistryCatalogueItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistryCatalogueItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:gs1:shared:shared_common:xsd:3}DocumentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="registryCatalogueItemIdentification" type="{urn:gs1:shared:shared_common:xsd:3}EntityIdentificationType"/&gt;
 *         &lt;element name="gpcCategoryCode" maxOccurs="unbounded"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{8}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sourceDataPool" type="{urn:gs1:shared:shared_common:xsd:3}GLNType"/&gt;
 *         &lt;element name="registryCatalogueItemStateCode" type="{urn:gs1:gdsn:registry_catalogue_item:xsd:3}RegistryCatalogueItemStateEnumerationType"/&gt;
 *         &lt;element name="catalogueItemReference" type="{urn:gs1:gdsn:gdsn_common:xsd:3}CatalogueItemReferenceType"/&gt;
 *         &lt;element name="catalogueItemDates" type="{urn:gs1:gdsn:registry_catalogue_item:xsd:3}CatalogueItemDatesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistryCatalogueItemType", propOrder = {
    "registryCatalogueItemIdentification",
    "gpcCategoryCode",
    "sourceDataPool",
    "registryCatalogueItemStateCode",
    "catalogueItemReference",
    "catalogueItemDates"
})
public class RegistryCatalogueItemType
    extends DocumentType
{

    @XmlElement(required = true)
    protected EntityIdentificationType registryCatalogueItemIdentification;
    @XmlElement(required = true)
    protected List<String> gpcCategoryCode;
    @XmlElement(required = true)
    protected String sourceDataPool;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RegistryCatalogueItemStateEnumerationType registryCatalogueItemStateCode;
    @XmlElement(required = true)
    protected CatalogueItemReferenceType catalogueItemReference;
    protected CatalogueItemDatesType catalogueItemDates;

    /**
     * Gets the value of the registryCatalogueItemIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdentificationType }
     *     
     */
    public EntityIdentificationType getRegistryCatalogueItemIdentification() {
        return registryCatalogueItemIdentification;
    }

    /**
     * Sets the value of the registryCatalogueItemIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdentificationType }
     *     
     */
    public void setRegistryCatalogueItemIdentification(EntityIdentificationType value) {
        this.registryCatalogueItemIdentification = value;
    }

    /**
     * Gets the value of the gpcCategoryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gpcCategoryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGpcCategoryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGpcCategoryCode() {
        if (gpcCategoryCode == null) {
            gpcCategoryCode = new ArrayList<String>();
        }
        return this.gpcCategoryCode;
    }

    /**
     * Gets the value of the sourceDataPool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDataPool() {
        return sourceDataPool;
    }

    /**
     * Sets the value of the sourceDataPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDataPool(String value) {
        this.sourceDataPool = value;
    }

    /**
     * Gets the value of the registryCatalogueItemStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryCatalogueItemStateEnumerationType }
     *     
     */
    public RegistryCatalogueItemStateEnumerationType getRegistryCatalogueItemStateCode() {
        return registryCatalogueItemStateCode;
    }

    /**
     * Sets the value of the registryCatalogueItemStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryCatalogueItemStateEnumerationType }
     *     
     */
    public void setRegistryCatalogueItemStateCode(RegistryCatalogueItemStateEnumerationType value) {
        this.registryCatalogueItemStateCode = value;
    }

    /**
     * Gets the value of the catalogueItemReference property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogueItemReferenceType }
     *     
     */
    public CatalogueItemReferenceType getCatalogueItemReference() {
        return catalogueItemReference;
    }

    /**
     * Sets the value of the catalogueItemReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogueItemReferenceType }
     *     
     */
    public void setCatalogueItemReference(CatalogueItemReferenceType value) {
        this.catalogueItemReference = value;
    }

    /**
     * Gets the value of the catalogueItemDates property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogueItemDatesType }
     *     
     */
    public CatalogueItemDatesType getCatalogueItemDates() {
        return catalogueItemDates;
    }

    /**
     * Sets the value of the catalogueItemDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogueItemDatesType }
     *     
     */
    public void setCatalogueItemDates(CatalogueItemDatesType value) {
        this.catalogueItemDates = value;
    }

}
