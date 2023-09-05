
package gs1.gdsn.dairy_fish_meat_poultry.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.CodeType;
import gs1.shared.shared_common.xsd._3.Description200Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for FishMeatPoultryContentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FishMeatPoultryContentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fishMeatPoultryTypeCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType"/&gt;
 *         &lt;element name="minimumFishMeatPoultryContent" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="meatPoultryCut" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="minimumAmountOfAnimalProtein" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FishMeatPoultryContentType", propOrder = {
    "fishMeatPoultryTypeCodeReference",
    "minimumFishMeatPoultryContent",
    "meatPoultryCut",
    "minimumAmountOfAnimalProtein"
})
public class FishMeatPoultryContentType {

    @XmlElement(required = true)
    protected CodeType fishMeatPoultryTypeCodeReference;
    @XmlElement(required = true)
    protected List<MeasurementType> minimumFishMeatPoultryContent;
    protected List<Description200Type> meatPoultryCut;
    protected List<MeasurementType> minimumAmountOfAnimalProtein;

    /**
     * Gets the value of the fishMeatPoultryTypeCodeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getFishMeatPoultryTypeCodeReference() {
        return fishMeatPoultryTypeCodeReference;
    }

    /**
     * Sets the value of the fishMeatPoultryTypeCodeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setFishMeatPoultryTypeCodeReference(CodeType value) {
        this.fishMeatPoultryTypeCodeReference = value;
    }

    /**
     * Gets the value of the minimumFishMeatPoultryContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minimumFishMeatPoultryContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinimumFishMeatPoultryContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getMinimumFishMeatPoultryContent() {
        if (minimumFishMeatPoultryContent == null) {
            minimumFishMeatPoultryContent = new ArrayList<MeasurementType>();
        }
        return this.minimumFishMeatPoultryContent;
    }

    /**
     * Gets the value of the meatPoultryCut property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meatPoultryCut property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeatPoultryCut().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description200Type }
     * 
     * 
     */
    public List<Description200Type> getMeatPoultryCut() {
        if (meatPoultryCut == null) {
            meatPoultryCut = new ArrayList<Description200Type>();
        }
        return this.meatPoultryCut;
    }

    /**
     * Gets the value of the minimumAmountOfAnimalProtein property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minimumAmountOfAnimalProtein property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinimumAmountOfAnimalProtein().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getMinimumAmountOfAnimalProtein() {
        if (minimumAmountOfAnimalProtein == null) {
            minimumAmountOfAnimalProtein = new ArrayList<MeasurementType>();
        }
        return this.minimumAmountOfAnimalProtein;
    }

}
