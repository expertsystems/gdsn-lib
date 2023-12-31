
package gs1.gdsn.food_and_beverage_properties_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;


/**
 * <p>Java class for FoodAndBeveragePropertiesInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FoodAndBeveragePropertiesInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="microbiologicalInformation" type="{urn:gs1:gdsn:food_and_beverage_properties_information:xsd:3}MicrobiologicalInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="physiochemicalCharacteristic" type="{urn:gs1:gdsn:food_and_beverage_properties_information:xsd:3}PhysiochemicalCharacteristicType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "FoodAndBeveragePropertiesInformationModuleType", propOrder = {
    "microbiologicalInformation",
    "physiochemicalCharacteristic",
    "avpList"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:food_and_beverage_properties_information:xsd:3")
public class FoodAndBeveragePropertiesInformationModuleType {

    protected List<MicrobiologicalInformationType> microbiologicalInformation;
    protected List<PhysiochemicalCharacteristicType> physiochemicalCharacteristic;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the microbiologicalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the microbiologicalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMicrobiologicalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MicrobiologicalInformationType }
     * 
     * 
     */
    public List<MicrobiologicalInformationType> getMicrobiologicalInformation() {
        if (microbiologicalInformation == null) {
            microbiologicalInformation = new ArrayList<MicrobiologicalInformationType>();
        }
        return this.microbiologicalInformation;
    }

    /**
     * Gets the value of the physiochemicalCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physiochemicalCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysiochemicalCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysiochemicalCharacteristicType }
     * 
     * 
     */
    public List<PhysiochemicalCharacteristicType> getPhysiochemicalCharacteristic() {
        if (physiochemicalCharacteristic == null) {
            physiochemicalCharacteristic = new ArrayList<PhysiochemicalCharacteristicType>();
        }
        return this.physiochemicalCharacteristic;
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
