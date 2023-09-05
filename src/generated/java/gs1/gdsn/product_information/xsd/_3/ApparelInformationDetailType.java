
package gs1.gdsn.product_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApparelInformationDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApparelInformationDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apparelProductInformation" type="{urn:gs1:gdsn:product_information:xsd:3}ApparelProductInformationType" minOccurs="0"/&gt;
 *         &lt;element name="footwearProductInformation" type="{urn:gs1:gdsn:product_information:xsd:3}FootwearProductInformationType" minOccurs="0"/&gt;
 *         &lt;element name="jewelryProductInformation" type="{urn:gs1:gdsn:product_information:xsd:3}JewelryProductInformationType" minOccurs="0"/&gt;
 *         &lt;element name="apparelDetail" type="{urn:gs1:gdsn:product_information:xsd:3}ApparelDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApparelInformationDetailType", propOrder = {
    "apparelProductInformation",
    "footwearProductInformation",
    "jewelryProductInformation",
    "apparelDetail"
})
public class ApparelInformationDetailType {

    protected ApparelProductInformationType apparelProductInformation;
    protected FootwearProductInformationType footwearProductInformation;
    protected JewelryProductInformationType jewelryProductInformation;
    protected List<ApparelDetailType> apparelDetail;

    /**
     * Gets the value of the apparelProductInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ApparelProductInformationType }
     *     
     */
    public ApparelProductInformationType getApparelProductInformation() {
        return apparelProductInformation;
    }

    /**
     * Sets the value of the apparelProductInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparelProductInformationType }
     *     
     */
    public void setApparelProductInformation(ApparelProductInformationType value) {
        this.apparelProductInformation = value;
    }

    /**
     * Gets the value of the footwearProductInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FootwearProductInformationType }
     *     
     */
    public FootwearProductInformationType getFootwearProductInformation() {
        return footwearProductInformation;
    }

    /**
     * Sets the value of the footwearProductInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FootwearProductInformationType }
     *     
     */
    public void setFootwearProductInformation(FootwearProductInformationType value) {
        this.footwearProductInformation = value;
    }

    /**
     * Gets the value of the jewelryProductInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JewelryProductInformationType }
     *     
     */
    public JewelryProductInformationType getJewelryProductInformation() {
        return jewelryProductInformation;
    }

    /**
     * Sets the value of the jewelryProductInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JewelryProductInformationType }
     *     
     */
    public void setJewelryProductInformation(JewelryProductInformationType value) {
        this.jewelryProductInformation = value;
    }

    /**
     * Gets the value of the apparelDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apparelDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApparelDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApparelDetailType }
     * 
     * 
     */
    public List<ApparelDetailType> getApparelDetail() {
        if (apparelDetail == null) {
            apparelDetail = new ArrayList<ApparelDetailType>();
        }
        return this.apparelDetail;
    }

}
