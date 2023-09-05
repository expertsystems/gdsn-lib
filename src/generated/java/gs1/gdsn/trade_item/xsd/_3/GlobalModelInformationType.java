
package gs1.gdsn.trade_item.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.ContactType;
import gs1.shared.shared_common.xsd._3.Description250Type;


/**
 * <p>Java class for GlobalModelInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalModelInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globalModelNumber"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="globalModelDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description250Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="globalModelContactInformation" type="{urn:gs1:shared:shared_common:xsd:3}ContactType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="globalModelRegulatoryInformation" type="{urn:gs1:gdsn:trade_item:xsd:3}GlobalModelRegulatoryInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "GlobalModelInformationType", propOrder = {
    "globalModelNumber",
    "globalModelDescription",
    "globalModelContactInformation",
    "globalModelRegulatoryInformation",
    "avpList"
})
public class GlobalModelInformationType {

    @XmlElement(required = true)
    protected String globalModelNumber;
    protected List<Description250Type> globalModelDescription;
    protected List<ContactType> globalModelContactInformation;
    protected List<GlobalModelRegulatoryInformationType> globalModelRegulatoryInformation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the globalModelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalModelNumber() {
        return globalModelNumber;
    }

    /**
     * Sets the value of the globalModelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalModelNumber(String value) {
        this.globalModelNumber = value;
    }

    /**
     * Gets the value of the globalModelDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalModelDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalModelDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description250Type }
     * 
     * 
     */
    public List<Description250Type> getGlobalModelDescription() {
        if (globalModelDescription == null) {
            globalModelDescription = new ArrayList<Description250Type>();
        }
        return this.globalModelDescription;
    }

    /**
     * Gets the value of the globalModelContactInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalModelContactInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalModelContactInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactType }
     * 
     * 
     */
    public List<ContactType> getGlobalModelContactInformation() {
        if (globalModelContactInformation == null) {
            globalModelContactInformation = new ArrayList<ContactType>();
        }
        return this.globalModelContactInformation;
    }

    /**
     * Gets the value of the globalModelRegulatoryInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalModelRegulatoryInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalModelRegulatoryInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalModelRegulatoryInformationType }
     * 
     * 
     */
    public List<GlobalModelRegulatoryInformationType> getGlobalModelRegulatoryInformation() {
        if (globalModelRegulatoryInformation == null) {
            globalModelRegulatoryInformation = new ArrayList<GlobalModelRegulatoryInformationType>();
        }
        return this.globalModelRegulatoryInformation;
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
