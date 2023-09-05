
package gs1.gdsn.catalogue_item_notification.xsd._3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogueItemChildItemLinkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogueItemChildItemLinkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="catalogueItem" type="{urn:gs1:gdsn:catalogue_item_notification:xsd:3}CatalogueItemType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogueItemChildItemLinkType", propOrder = {
    "quantity",
    "catalogueItem"
})
public class CatalogueItemChildItemLinkType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantity;
    @XmlElement(required = true)
    protected CatalogueItemType catalogueItem;

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the catalogueItem property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogueItemType }
     *     
     */
    public CatalogueItemType getCatalogueItem() {
        return catalogueItem;
    }

    /**
     * Sets the value of the catalogueItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogueItemType }
     *     
     */
    public void setCatalogueItem(CatalogueItemType value) {
        this.catalogueItem = value;
    }

}
