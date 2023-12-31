
package gs1.gdsn.apparel_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description500Type;


/**
 * <p>Java class for ClosureFastenerInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClosureFastenerInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="closureOrFastenerTypeCode" type="{urn:gs1:gdsn:apparel_information:xsd:3}ClosureOrFastenerTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="closureOrFastenerLocation" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClosureFastenerInformationType", propOrder = {
    "closureOrFastenerTypeCode",
    "closureOrFastenerLocation"
})
public class ClosureFastenerInformationType {

    protected ClosureOrFastenerTypeCodeType closureOrFastenerTypeCode;
    protected List<Description500Type> closureOrFastenerLocation;

    /**
     * Gets the value of the closureOrFastenerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ClosureOrFastenerTypeCodeType }
     *     
     */
    public ClosureOrFastenerTypeCodeType getClosureOrFastenerTypeCode() {
        return closureOrFastenerTypeCode;
    }

    /**
     * Sets the value of the closureOrFastenerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosureOrFastenerTypeCodeType }
     *     
     */
    public void setClosureOrFastenerTypeCode(ClosureOrFastenerTypeCodeType value) {
        this.closureOrFastenerTypeCode = value;
    }

    /**
     * Gets the value of the closureOrFastenerLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the closureOrFastenerLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClosureOrFastenerLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getClosureOrFastenerLocation() {
        if (closureOrFastenerLocation == null) {
            closureOrFastenerLocation = new ArrayList<Description500Type>();
        }
        return this.closureOrFastenerLocation;
    }

}
