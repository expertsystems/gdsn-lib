
package gs1.gdsn.trade_item.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GDSNTradeItemClassificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GDSNTradeItemClassificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gpcCategoryCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{8}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gpcCategoryDefinition" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="700"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gpcCategoryName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="105"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gDSNTradeItemClassificationAttribute" type="{urn:gs1:gdsn:trade_item:xsd:3}GDSNTradeItemClassificationAttributeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="additionalTradeItemClassification" type="{urn:gs1:gdsn:trade_item:xsd:3}AdditionalTradeItemClassificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GDSNTradeItemClassificationType", propOrder = {
    "gpcCategoryCode",
    "gpcCategoryDefinition",
    "gpcCategoryName",
    "gdsnTradeItemClassificationAttribute",
    "additionalTradeItemClassification"
})
public class GDSNTradeItemClassificationType {

    @XmlElement(required = true)
    protected String gpcCategoryCode;
    protected String gpcCategoryDefinition;
    protected String gpcCategoryName;
    @XmlElement(name = "gDSNTradeItemClassificationAttribute")
    protected List<GDSNTradeItemClassificationAttributeType> gdsnTradeItemClassificationAttribute;
    protected List<AdditionalTradeItemClassificationType> additionalTradeItemClassification;

    /**
     * Gets the value of the gpcCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpcCategoryCode() {
        return gpcCategoryCode;
    }

    /**
     * Sets the value of the gpcCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpcCategoryCode(String value) {
        this.gpcCategoryCode = value;
    }

    /**
     * Gets the value of the gpcCategoryDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpcCategoryDefinition() {
        return gpcCategoryDefinition;
    }

    /**
     * Sets the value of the gpcCategoryDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpcCategoryDefinition(String value) {
        this.gpcCategoryDefinition = value;
    }

    /**
     * Gets the value of the gpcCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpcCategoryName() {
        return gpcCategoryName;
    }

    /**
     * Sets the value of the gpcCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpcCategoryName(String value) {
        this.gpcCategoryName = value;
    }

    /**
     * Gets the value of the gdsnTradeItemClassificationAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gdsnTradeItemClassificationAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGDSNTradeItemClassificationAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GDSNTradeItemClassificationAttributeType }
     * 
     * 
     */
    public List<GDSNTradeItemClassificationAttributeType> getGDSNTradeItemClassificationAttribute() {
        if (gdsnTradeItemClassificationAttribute == null) {
            gdsnTradeItemClassificationAttribute = new ArrayList<GDSNTradeItemClassificationAttributeType>();
        }
        return this.gdsnTradeItemClassificationAttribute;
    }

    /**
     * Gets the value of the additionalTradeItemClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalTradeItemClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalTradeItemClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalTradeItemClassificationType }
     * 
     * 
     */
    public List<AdditionalTradeItemClassificationType> getAdditionalTradeItemClassification() {
        if (additionalTradeItemClassification == null) {
            additionalTradeItemClassification = new ArrayList<AdditionalTradeItemClassificationType>();
        }
        return this.additionalTradeItemClassification;
    }

}
