
package gs1.gdsn.product_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TobaccoCannabisInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TobaccoCannabisInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cannabisInformation" type="{urn:gs1:gdsn:product_information:xsd:3}CannabisInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TobaccoCannabisInformationType", propOrder = {
    "cannabisInformation"
})
public class TobaccoCannabisInformationType {

    protected List<CannabisInformationType> cannabisInformation;

    /**
     * Gets the value of the cannabisInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cannabisInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCannabisInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CannabisInformationType }
     * 
     * 
     */
    public List<CannabisInformationType> getCannabisInformation() {
        if (cannabisInformation == null) {
            cannabisInformation = new ArrayList<CannabisInformationType>();
        }
        return this.cannabisInformation;
    }

}
