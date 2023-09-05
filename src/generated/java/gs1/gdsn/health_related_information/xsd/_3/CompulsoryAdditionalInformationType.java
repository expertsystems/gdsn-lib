
package gs1.gdsn.health_related_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description5000Type;


/**
 * <p>Java class for CompulsoryAdditionalInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompulsoryAdditionalInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="compulsoryAdditionalLabelInformationTypeCode" type="{urn:gs1:gdsn:health_related_information:xsd:3}CompulsoryAdditionalLabelInformationTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="compulsoryAdditionalLabelInformation" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompulsoryAdditionalInformationType", propOrder = {
    "compulsoryAdditionalLabelInformationTypeCode",
    "compulsoryAdditionalLabelInformation"
})
public class CompulsoryAdditionalInformationType {

    protected CompulsoryAdditionalLabelInformationTypeCodeType compulsoryAdditionalLabelInformationTypeCode;
    protected List<Description5000Type> compulsoryAdditionalLabelInformation;

    /**
     * Gets the value of the compulsoryAdditionalLabelInformationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CompulsoryAdditionalLabelInformationTypeCodeType }
     *     
     */
    public CompulsoryAdditionalLabelInformationTypeCodeType getCompulsoryAdditionalLabelInformationTypeCode() {
        return compulsoryAdditionalLabelInformationTypeCode;
    }

    /**
     * Sets the value of the compulsoryAdditionalLabelInformationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompulsoryAdditionalLabelInformationTypeCodeType }
     *     
     */
    public void setCompulsoryAdditionalLabelInformationTypeCode(CompulsoryAdditionalLabelInformationTypeCodeType value) {
        this.compulsoryAdditionalLabelInformationTypeCode = value;
    }

    /**
     * Gets the value of the compulsoryAdditionalLabelInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compulsoryAdditionalLabelInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompulsoryAdditionalLabelInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getCompulsoryAdditionalLabelInformation() {
        if (compulsoryAdditionalLabelInformation == null) {
            compulsoryAdditionalLabelInformation = new ArrayList<Description5000Type>();
        }
        return this.compulsoryAdditionalLabelInformation;
    }

}
