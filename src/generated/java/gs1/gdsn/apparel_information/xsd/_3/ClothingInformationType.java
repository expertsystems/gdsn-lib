
package gs1.gdsn.apparel_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description70Type;


/**
 * <p>Java class for ClothingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClothingInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clothingCut" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="collarType" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sleeveType" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClothingInformationType", propOrder = {
    "clothingCut",
    "collarType",
    "sleeveType"
})
public class ClothingInformationType {

    protected List<Description70Type> clothingCut;
    protected List<Description70Type> collarType;
    protected List<Description70Type> sleeveType;

    /**
     * Gets the value of the clothingCut property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clothingCut property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClothingCut().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getClothingCut() {
        if (clothingCut == null) {
            clothingCut = new ArrayList<Description70Type>();
        }
        return this.clothingCut;
    }

    /**
     * Gets the value of the collarType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collarType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollarType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getCollarType() {
        if (collarType == null) {
            collarType = new ArrayList<Description70Type>();
        }
        return this.collarType;
    }

    /**
     * Gets the value of the sleeveType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sleeveType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSleeveType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getSleeveType() {
        if (sleeveType == null) {
            sleeveType = new ArrayList<Description70Type>();
        }
        return this.sleeveType;
    }

}
