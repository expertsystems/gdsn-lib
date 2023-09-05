
package gs1.gdsn.safety_data_sheet.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description1000Type;


/**
 * <p>Java class for FireFightingInstructionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FireFightingInstructionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="extinguishingMediaDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fireFighterProtectiveEquipmentDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="flammablePropertiesDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FireFightingInstructionsType", propOrder = {
    "extinguishingMediaDescription",
    "fireFighterProtectiveEquipmentDescription",
    "flammablePropertiesDescription"
})
public class FireFightingInstructionsType {

    protected List<Description1000Type> extinguishingMediaDescription;
    protected List<Description1000Type> fireFighterProtectiveEquipmentDescription;
    protected List<Description1000Type> flammablePropertiesDescription;

    /**
     * Gets the value of the extinguishingMediaDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extinguishingMediaDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtinguishingMediaDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getExtinguishingMediaDescription() {
        if (extinguishingMediaDescription == null) {
            extinguishingMediaDescription = new ArrayList<Description1000Type>();
        }
        return this.extinguishingMediaDescription;
    }

    /**
     * Gets the value of the fireFighterProtectiveEquipmentDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fireFighterProtectiveEquipmentDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFireFighterProtectiveEquipmentDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getFireFighterProtectiveEquipmentDescription() {
        if (fireFighterProtectiveEquipmentDescription == null) {
            fireFighterProtectiveEquipmentDescription = new ArrayList<Description1000Type>();
        }
        return this.fireFighterProtectiveEquipmentDescription;
    }

    /**
     * Gets the value of the flammablePropertiesDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flammablePropertiesDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlammablePropertiesDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getFlammablePropertiesDescription() {
        if (flammablePropertiesDescription == null) {
            flammablePropertiesDescription = new ArrayList<Description1000Type>();
        }
        return this.flammablePropertiesDescription;
    }

}
