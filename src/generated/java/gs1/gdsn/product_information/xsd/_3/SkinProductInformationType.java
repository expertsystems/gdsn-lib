
package gs1.gdsn.product_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SkinProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SkinProductInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="skinProductFunctionOrTreatmentCode" type="{urn:gs1:gdsn:product_information:xsd:3}SkinProductFunctionOrTreatmentCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="targetSkinTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}TargetSkinTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SkinProductInformationType", propOrder = {
    "skinProductFunctionOrTreatmentCode",
    "targetSkinTypeCode"
})
public class SkinProductInformationType {

    protected List<SkinProductFunctionOrTreatmentCodeType> skinProductFunctionOrTreatmentCode;
    protected List<TargetSkinTypeCodeType> targetSkinTypeCode;

    /**
     * Gets the value of the skinProductFunctionOrTreatmentCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skinProductFunctionOrTreatmentCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSkinProductFunctionOrTreatmentCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SkinProductFunctionOrTreatmentCodeType }
     * 
     * 
     */
    public List<SkinProductFunctionOrTreatmentCodeType> getSkinProductFunctionOrTreatmentCode() {
        if (skinProductFunctionOrTreatmentCode == null) {
            skinProductFunctionOrTreatmentCode = new ArrayList<SkinProductFunctionOrTreatmentCodeType>();
        }
        return this.skinProductFunctionOrTreatmentCode;
    }

    /**
     * Gets the value of the targetSkinTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetSkinTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetSkinTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetSkinTypeCodeType }
     * 
     * 
     */
    public List<TargetSkinTypeCodeType> getTargetSkinTypeCode() {
        if (targetSkinTypeCode == null) {
            targetSkinTypeCode = new ArrayList<TargetSkinTypeCodeType>();
        }
        return this.targetSkinTypeCode;
    }

}
