
package gs1.gdsn.product_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JewelryProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JewelryProductInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="jewelryStyleCode" type="{urn:gs1:gdsn:product_information:xsd:3}JewelryStyleCodeType" minOccurs="0"/&gt;
 *         &lt;element name="jewelrySetContentsCode" type="{urn:gs1:gdsn:product_information:xsd:3}JewelrySetContentsCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="necklaceTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}NecklaceTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ringTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}RingTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="watchCaseShapeCode" type="{urn:gs1:gdsn:product_information:xsd:3}WatchCaseShapeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JewelryProductInformationType", propOrder = {
    "jewelryStyleCode",
    "jewelrySetContentsCode",
    "necklaceTypeCode",
    "ringTypeCode",
    "watchCaseShapeCode"
})
public class JewelryProductInformationType {

    protected JewelryStyleCodeType jewelryStyleCode;
    protected List<JewelrySetContentsCodeType> jewelrySetContentsCode;
    protected List<NecklaceTypeCodeType> necklaceTypeCode;
    protected List<RingTypeCodeType> ringTypeCode;
    protected WatchCaseShapeCodeType watchCaseShapeCode;

    /**
     * Gets the value of the jewelryStyleCode property.
     * 
     * @return
     *     possible object is
     *     {@link JewelryStyleCodeType }
     *     
     */
    public JewelryStyleCodeType getJewelryStyleCode() {
        return jewelryStyleCode;
    }

    /**
     * Sets the value of the jewelryStyleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JewelryStyleCodeType }
     *     
     */
    public void setJewelryStyleCode(JewelryStyleCodeType value) {
        this.jewelryStyleCode = value;
    }

    /**
     * Gets the value of the jewelrySetContentsCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jewelrySetContentsCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJewelrySetContentsCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JewelrySetContentsCodeType }
     * 
     * 
     */
    public List<JewelrySetContentsCodeType> getJewelrySetContentsCode() {
        if (jewelrySetContentsCode == null) {
            jewelrySetContentsCode = new ArrayList<JewelrySetContentsCodeType>();
        }
        return this.jewelrySetContentsCode;
    }

    /**
     * Gets the value of the necklaceTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the necklaceTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNecklaceTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NecklaceTypeCodeType }
     * 
     * 
     */
    public List<NecklaceTypeCodeType> getNecklaceTypeCode() {
        if (necklaceTypeCode == null) {
            necklaceTypeCode = new ArrayList<NecklaceTypeCodeType>();
        }
        return this.necklaceTypeCode;
    }

    /**
     * Gets the value of the ringTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ringTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRingTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RingTypeCodeType }
     * 
     * 
     */
    public List<RingTypeCodeType> getRingTypeCode() {
        if (ringTypeCode == null) {
            ringTypeCode = new ArrayList<RingTypeCodeType>();
        }
        return this.ringTypeCode;
    }

    /**
     * Gets the value of the watchCaseShapeCode property.
     * 
     * @return
     *     possible object is
     *     {@link WatchCaseShapeCodeType }
     *     
     */
    public WatchCaseShapeCodeType getWatchCaseShapeCode() {
        return watchCaseShapeCode;
    }

    /**
     * Sets the value of the watchCaseShapeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WatchCaseShapeCodeType }
     *     
     */
    public void setWatchCaseShapeCode(WatchCaseShapeCodeType value) {
        this.watchCaseShapeCode = value;
    }

}
