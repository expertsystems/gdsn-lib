
package gs1.gdsn.catalogue_item_hierarchical_withdrawal.xsd._3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import gs1.gdsn.catalogue_item_notification.xsd._3.CatalogueItemStateEnumerationType;
import gs1.gdsn.gdsn_common.xsd._3.CatalogueItemReferenceType;
import gs1.gdsn.gdsn_common.xsd._3.HierarchyDeletionReasonCodeType;
import gs1.shared.shared_common.xsd._3.Description200Type;
import gs1.shared.shared_common.xsd._3.DocumentType;
import gs1.shared.shared_common.xsd._3.EntityIdentificationType;
import gs1.shared.shared_common.xsd._3.PartyIdentificationType;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for CatalogueItemHierarchicalWithdrawalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogueItemHierarchicalWithdrawalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:gs1:shared:shared_common:xsd:3}DocumentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="catalogueItemHierarchicalWithdrawalIdentification" type="{urn:gs1:shared:shared_common:xsd:3}EntityIdentificationType"/&gt;
 *         &lt;element name="cancelDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="catalogueItemStateCode" type="{urn:gs1:gdsn:catalogue_item_notification:xsd:3}CatalogueItemStateEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="discontinueDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="hierarchyDeletionReasonCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}HierarchyDeletionReasonCodeType"/&gt;
 *         &lt;element name="hierarchyDeletionAdditionalReasonDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type" minOccurs="0"/&gt;
 *         &lt;element name="catalogueItemReference" type="{urn:gs1:gdsn:gdsn_common:xsd:3}CatalogueItemReferenceType"/&gt;
 *         &lt;element name="dataRecipient" type="{urn:gs1:shared:shared_common:xsd:3}PartyIdentificationType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="sourceDataPool" type="{urn:gs1:shared:shared_common:xsd:3}PartyIdentificationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogueItemHierarchicalWithdrawalType", propOrder = {
    "catalogueItemHierarchicalWithdrawalIdentification",
    "cancelDateTime",
    "catalogueItemStateCode",
    "discontinueDateTime",
    "hierarchyDeletionReasonCode",
    "hierarchyDeletionAdditionalReasonDescription",
    "catalogueItemReference",
    "dataRecipient",
    "sourceDataPool"
})
public class CatalogueItemHierarchicalWithdrawalType
    extends DocumentType
{

    @XmlElement(required = true)
    protected EntityIdentificationType catalogueItemHierarchicalWithdrawalIdentification;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime cancelDateTime;
    @XmlSchemaType(name = "string")
    protected CatalogueItemStateEnumerationType catalogueItemStateCode;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime discontinueDateTime;
    @XmlElement(required = true)
    protected HierarchyDeletionReasonCodeType hierarchyDeletionReasonCode;
    protected Description200Type hierarchyDeletionAdditionalReasonDescription;
    @XmlElement(required = true)
    protected CatalogueItemReferenceType catalogueItemReference;
    @XmlElement(required = true)
    protected List<PartyIdentificationType> dataRecipient;
    protected PartyIdentificationType sourceDataPool;

    /**
     * Gets the value of the catalogueItemHierarchicalWithdrawalIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdentificationType }
     *     
     */
    public EntityIdentificationType getCatalogueItemHierarchicalWithdrawalIdentification() {
        return catalogueItemHierarchicalWithdrawalIdentification;
    }

    /**
     * Sets the value of the catalogueItemHierarchicalWithdrawalIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdentificationType }
     *     
     */
    public void setCatalogueItemHierarchicalWithdrawalIdentification(EntityIdentificationType value) {
        this.catalogueItemHierarchicalWithdrawalIdentification = value;
    }

    /**
     * Gets the value of the cancelDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getCancelDateTime() {
        return cancelDateTime;
    }

    /**
     * Sets the value of the cancelDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelDateTime(LocalDateTime value) {
        this.cancelDateTime = value;
    }

    /**
     * Gets the value of the catalogueItemStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogueItemStateEnumerationType }
     *     
     */
    public CatalogueItemStateEnumerationType getCatalogueItemStateCode() {
        return catalogueItemStateCode;
    }

    /**
     * Sets the value of the catalogueItemStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogueItemStateEnumerationType }
     *     
     */
    public void setCatalogueItemStateCode(CatalogueItemStateEnumerationType value) {
        this.catalogueItemStateCode = value;
    }

    /**
     * Gets the value of the discontinueDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getDiscontinueDateTime() {
        return discontinueDateTime;
    }

    /**
     * Sets the value of the discontinueDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscontinueDateTime(LocalDateTime value) {
        this.discontinueDateTime = value;
    }

    /**
     * Gets the value of the hierarchyDeletionReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchyDeletionReasonCodeType }
     *     
     */
    public HierarchyDeletionReasonCodeType getHierarchyDeletionReasonCode() {
        return hierarchyDeletionReasonCode;
    }

    /**
     * Sets the value of the hierarchyDeletionReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchyDeletionReasonCodeType }
     *     
     */
    public void setHierarchyDeletionReasonCode(HierarchyDeletionReasonCodeType value) {
        this.hierarchyDeletionReasonCode = value;
    }

    /**
     * Gets the value of the hierarchyDeletionAdditionalReasonDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Description200Type }
     *     
     */
    public Description200Type getHierarchyDeletionAdditionalReasonDescription() {
        return hierarchyDeletionAdditionalReasonDescription;
    }

    /**
     * Sets the value of the hierarchyDeletionAdditionalReasonDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description200Type }
     *     
     */
    public void setHierarchyDeletionAdditionalReasonDescription(Description200Type value) {
        this.hierarchyDeletionAdditionalReasonDescription = value;
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
     * Gets the value of the dataRecipient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataRecipient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataRecipient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentificationType }
     * 
     * 
     */
    public List<PartyIdentificationType> getDataRecipient() {
        if (dataRecipient == null) {
            dataRecipient = new ArrayList<PartyIdentificationType>();
        }
        return this.dataRecipient;
    }

    /**
     * Gets the value of the sourceDataPool property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationType }
     *     
     */
    public PartyIdentificationType getSourceDataPool() {
        return sourceDataPool;
    }

    /**
     * Sets the value of the sourceDataPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationType }
     *     
     */
    public void setSourceDataPool(PartyIdentificationType value) {
        this.sourceDataPool = value;
    }

}
