
package gs1.gdsn.place_of_item_activity.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.gdsn.gdsn_common.xsd._3.PlaceOfProductActivityType;


/**
 * <p>Java class for PlaceOfItemActivityModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlaceOfItemActivityModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="importClassification" type="{urn:gs1:gdsn:place_of_item_activity:xsd:3}ImportClassificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="placeOfProductActivity" type="{urn:gs1:gdsn:gdsn_common:xsd:3}PlaceOfProductActivityType" minOccurs="0"/&gt;
 *         &lt;element name="avpList" type="{urn:gs1:gdsn:gdsn_common:xsd:3}GS1_AttributeValuePairListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceOfItemActivityModuleType", propOrder = {
    "importClassification",
    "placeOfProductActivity",
    "avpList"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:place_of_item_activity:xsd:3")
public class PlaceOfItemActivityModuleType {

    protected List<ImportClassificationType> importClassification;
    protected PlaceOfProductActivityType placeOfProductActivity;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the importClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportClassificationType }
     * 
     * 
     */
    public List<ImportClassificationType> getImportClassification() {
        if (importClassification == null) {
            importClassification = new ArrayList<ImportClassificationType>();
        }
        return this.importClassification;
    }

    /**
     * Gets the value of the placeOfProductActivity property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfProductActivityType }
     *     
     */
    public PlaceOfProductActivityType getPlaceOfProductActivity() {
        return placeOfProductActivity;
    }

    /**
     * Sets the value of the placeOfProductActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfProductActivityType }
     *     
     */
    public void setPlaceOfProductActivity(PlaceOfProductActivityType value) {
        this.placeOfProductActivity = value;
    }

    /**
     * Gets the value of the avpList property.
     * 
     * @return
     *     possible object is
     *     {@link GS1AttributeValuePairListType }
     *     
     */
    public GS1AttributeValuePairListType getAvpList() {
        return avpList;
    }

    /**
     * Sets the value of the avpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GS1AttributeValuePairListType }
     *     
     */
    public void setAvpList(GS1AttributeValuePairListType value) {
        this.avpList = value;
    }

}
