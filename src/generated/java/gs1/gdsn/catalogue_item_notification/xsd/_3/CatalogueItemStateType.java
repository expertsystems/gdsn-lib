
package gs1.gdsn.catalogue_item_notification.xsd._3;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for CatalogueItemStateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogueItemStateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="catalogueItemStateCode" type="{urn:gs1:gdsn:catalogue_item_notification:xsd:3}CatalogueItemStateEnumerationType"/&gt;
 *         &lt;element name="cancelDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="discontinueDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogueItemStateType", propOrder = {
    "catalogueItemStateCode",
    "cancelDateTime",
    "discontinueDateTime"
})
public class CatalogueItemStateType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CatalogueItemStateEnumerationType catalogueItemStateCode;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime cancelDateTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime discontinueDateTime;

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

}
