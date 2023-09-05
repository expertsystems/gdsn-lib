
package gs1.gdsn.dairy_fish_meat_poultry.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DairyFishMeatPoultryItemModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DairyFishMeatPoultryItemModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dairyFishMeatPoultryInformation" type="{urn:gs1:gdsn:dairy_fish_meat_poultry:xsd:3}DairyFishMeatPoultryInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DairyFishMeatPoultryItemModuleType", propOrder = {
    "dairyFishMeatPoultryInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:dairy_fish_meat_poultry:xsd:3")
public class DairyFishMeatPoultryItemModuleType {

    protected DairyFishMeatPoultryInformationType dairyFishMeatPoultryInformation;

    /**
     * Gets the value of the dairyFishMeatPoultryInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DairyFishMeatPoultryInformationType }
     *     
     */
    public DairyFishMeatPoultryInformationType getDairyFishMeatPoultryInformation() {
        return dairyFishMeatPoultryInformation;
    }

    /**
     * Sets the value of the dairyFishMeatPoultryInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DairyFishMeatPoultryInformationType }
     *     
     */
    public void setDairyFishMeatPoultryInformation(DairyFishMeatPoultryInformationType value) {
        this.dairyFishMeatPoultryInformation = value;
    }

}
