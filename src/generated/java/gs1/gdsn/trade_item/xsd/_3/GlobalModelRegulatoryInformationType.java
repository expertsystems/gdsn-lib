
package gs1.gdsn.trade_item.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.CountryType;


/**
 * <p>Java class for GlobalModelRegulatoryInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalModelRegulatoryInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globalModelRegulatoryAct" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="globalModelRegulatoryActCountry" type="{urn:gs1:gdsn:gdsn_common:xsd:3}CountryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalModelRegulatoryInformationType", propOrder = {
    "globalModelRegulatoryAct",
    "globalModelRegulatoryActCountry"
})
public class GlobalModelRegulatoryInformationType {

    protected String globalModelRegulatoryAct;
    protected List<CountryType> globalModelRegulatoryActCountry;

    /**
     * Gets the value of the globalModelRegulatoryAct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalModelRegulatoryAct() {
        return globalModelRegulatoryAct;
    }

    /**
     * Sets the value of the globalModelRegulatoryAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalModelRegulatoryAct(String value) {
        this.globalModelRegulatoryAct = value;
    }

    /**
     * Gets the value of the globalModelRegulatoryActCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalModelRegulatoryActCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalModelRegulatoryActCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryType }
     * 
     * 
     */
    public List<CountryType> getGlobalModelRegulatoryActCountry() {
        if (globalModelRegulatoryActCountry == null) {
            globalModelRegulatoryActCountry = new ArrayList<CountryType>();
        }
        return this.globalModelRegulatoryActCountry;
    }

}
