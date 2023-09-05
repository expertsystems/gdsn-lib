
package gs1.gdsn.apparel_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.Description70Type;


/**
 * <p>Java class for ApparelInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApparelInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="styleDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="clothingInformation" type="{urn:gs1:gdsn:apparel_information:xsd:3}ClothingInformationType" minOccurs="0"/&gt;
 *         &lt;element name="hangerInformation" type="{urn:gs1:gdsn:apparel_information:xsd:3}HangerInformationType" minOccurs="0"/&gt;
 *         &lt;element name="closureFastenerInformation" type="{urn:gs1:gdsn:apparel_information:xsd:3}ClosureFastenerInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ApparelInformationType", propOrder = {
    "styleDescription",
    "clothingInformation",
    "hangerInformation",
    "closureFastenerInformation",
    "avpList"
})
public class ApparelInformationType {

    protected List<Description70Type> styleDescription;
    protected ClothingInformationType clothingInformation;
    protected HangerInformationType hangerInformation;
    protected List<ClosureFastenerInformationType> closureFastenerInformation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the styleDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the styleDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyleDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getStyleDescription() {
        if (styleDescription == null) {
            styleDescription = new ArrayList<Description70Type>();
        }
        return this.styleDescription;
    }

    /**
     * Gets the value of the clothingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ClothingInformationType }
     *     
     */
    public ClothingInformationType getClothingInformation() {
        return clothingInformation;
    }

    /**
     * Sets the value of the clothingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClothingInformationType }
     *     
     */
    public void setClothingInformation(ClothingInformationType value) {
        this.clothingInformation = value;
    }

    /**
     * Gets the value of the hangerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HangerInformationType }
     *     
     */
    public HangerInformationType getHangerInformation() {
        return hangerInformation;
    }

    /**
     * Sets the value of the hangerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HangerInformationType }
     *     
     */
    public void setHangerInformation(HangerInformationType value) {
        this.hangerInformation = value;
    }

    /**
     * Gets the value of the closureFastenerInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the closureFastenerInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClosureFastenerInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClosureFastenerInformationType }
     * 
     * 
     */
    public List<ClosureFastenerInformationType> getClosureFastenerInformation() {
        if (closureFastenerInformation == null) {
            closureFastenerInformation = new ArrayList<ClosureFastenerInformationType>();
        }
        return this.closureFastenerInformation;
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
