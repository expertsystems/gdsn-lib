
package gs1.gdsn.product_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HairProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HairProductInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hairProductFunctionOrTreatmentCode" type="{urn:gs1:gdsn:product_information:xsd:3}HairProductFunctionOrTreatmentCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="targetHairTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}TargetHairTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="naturalHairColourCode" type="{urn:gs1:gdsn:product_information:xsd:3}NaturalHairColourCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HairProductInformationType", propOrder = {
    "hairProductFunctionOrTreatmentCode",
    "targetHairTypeCode",
    "naturalHairColourCode"
})
public class HairProductInformationType {

    protected List<HairProductFunctionOrTreatmentCodeType> hairProductFunctionOrTreatmentCode;
    protected List<TargetHairTypeCodeType> targetHairTypeCode;
    protected List<NaturalHairColourCodeType> naturalHairColourCode;

    /**
     * Gets the value of the hairProductFunctionOrTreatmentCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hairProductFunctionOrTreatmentCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHairProductFunctionOrTreatmentCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HairProductFunctionOrTreatmentCodeType }
     * 
     * 
     */
    public List<HairProductFunctionOrTreatmentCodeType> getHairProductFunctionOrTreatmentCode() {
        if (hairProductFunctionOrTreatmentCode == null) {
            hairProductFunctionOrTreatmentCode = new ArrayList<HairProductFunctionOrTreatmentCodeType>();
        }
        return this.hairProductFunctionOrTreatmentCode;
    }

    /**
     * Gets the value of the targetHairTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetHairTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetHairTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetHairTypeCodeType }
     * 
     * 
     */
    public List<TargetHairTypeCodeType> getTargetHairTypeCode() {
        if (targetHairTypeCode == null) {
            targetHairTypeCode = new ArrayList<TargetHairTypeCodeType>();
        }
        return this.targetHairTypeCode;
    }

    /**
     * Gets the value of the naturalHairColourCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the naturalHairColourCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNaturalHairColourCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalHairColourCodeType }
     * 
     * 
     */
    public List<NaturalHairColourCodeType> getNaturalHairColourCode() {
        if (naturalHairColourCode == null) {
            naturalHairColourCode = new ArrayList<NaturalHairColourCodeType>();
        }
        return this.naturalHairColourCode;
    }

}
