
package gs1.gdsn.gdsn_common.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GS1_AttributeValuePairListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GS1_AttributeValuePairListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="compoundStringAVP" type="{urn:gs1:gdsn:gdsn_common:xsd:3}CompoundStringAttributeValuePairType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="stringAVP" type="{urn:gs1:gdsn:gdsn_common:xsd:3}StringAttributeValuePairType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GS1_AttributeValuePairListType", propOrder = {
    "compoundStringAVP",
    "stringAVP"
})
public class GS1AttributeValuePairListType {

    protected List<CompoundStringAttributeValuePairType> compoundStringAVP;
    protected List<StringAttributeValuePairType> stringAVP;

    /**
     * Gets the value of the compoundStringAVP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compoundStringAVP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompoundStringAVP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompoundStringAttributeValuePairType }
     * 
     * 
     */
    public List<CompoundStringAttributeValuePairType> getCompoundStringAVP() {
        if (compoundStringAVP == null) {
            compoundStringAVP = new ArrayList<CompoundStringAttributeValuePairType>();
        }
        return this.compoundStringAVP;
    }

    /**
     * Gets the value of the stringAVP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stringAVP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStringAVP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringAttributeValuePairType }
     * 
     * 
     */
    public List<StringAttributeValuePairType> getStringAVP() {
        if (stringAVP == null) {
            stringAVP = new ArrayList<StringAttributeValuePairType>();
        }
        return this.stringAVP;
    }

}
