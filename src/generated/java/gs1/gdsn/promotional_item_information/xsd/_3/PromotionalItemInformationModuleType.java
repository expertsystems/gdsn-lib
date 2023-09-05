
package gs1.gdsn.promotional_item_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionalItemInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionalItemInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isTradeItemAPromotionalUnit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="promotionalItemInformation" type="{urn:gs1:gdsn:promotional_item_information:xsd:3}PromotionalItemInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionalItemInformationModuleType", propOrder = {
    "isTradeItemAPromotionalUnit",
    "promotionalItemInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:promotional_item_information:xsd:3")
public class PromotionalItemInformationModuleType {

    protected Boolean isTradeItemAPromotionalUnit;
    protected List<PromotionalItemInformationType> promotionalItemInformation;

    /**
     * Gets the value of the isTradeItemAPromotionalUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTradeItemAPromotionalUnit() {
        return isTradeItemAPromotionalUnit;
    }

    /**
     * Sets the value of the isTradeItemAPromotionalUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTradeItemAPromotionalUnit(Boolean value) {
        this.isTradeItemAPromotionalUnit = value;
    }

    /**
     * Gets the value of the promotionalItemInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionalItemInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionalItemInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionalItemInformationType }
     * 
     * 
     */
    public List<PromotionalItemInformationType> getPromotionalItemInformation() {
        if (promotionalItemInformation == null) {
            promotionalItemInformation = new ArrayList<PromotionalItemInformationType>();
        }
        return this.promotionalItemInformation;
    }

}
