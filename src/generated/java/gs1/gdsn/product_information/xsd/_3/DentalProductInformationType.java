
package gs1.gdsn.product_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DentalProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DentalProductInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dentalProductFunctionCode" type="{urn:gs1:gdsn:product_information:xsd:3}DentalProductFunctionCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DentalProductInformationType", propOrder = {
    "dentalProductFunctionCode"
})
public class DentalProductInformationType {

    protected List<DentalProductFunctionCodeType> dentalProductFunctionCode;

    /**
     * Gets the value of the dentalProductFunctionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dentalProductFunctionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDentalProductFunctionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DentalProductFunctionCodeType }
     * 
     * 
     */
    public List<DentalProductFunctionCodeType> getDentalProductFunctionCode() {
        if (dentalProductFunctionCode == null) {
            dentalProductFunctionCode = new ArrayList<DentalProductFunctionCodeType>();
        }
        return this.dentalProductFunctionCode;
    }

}
