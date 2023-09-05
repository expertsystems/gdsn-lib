
package gs1.gdsn.marketing_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasicTasteInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicTasteInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="strongnessOfBasicTasteCode" type="{urn:gs1:gdsn:marketing_information:xsd:3}StrongnessOfBasicTasteCodeType"/&gt;
 *         &lt;element name="typeOfBasicTasteCode" type="{urn:gs1:gdsn:marketing_information:xsd:3}TypeOfBasicTasteCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicTasteInformationType", propOrder = {
    "strongnessOfBasicTasteCode",
    "typeOfBasicTasteCode"
})
public class BasicTasteInformationType {

    @XmlElement(required = true)
    protected StrongnessOfBasicTasteCodeType strongnessOfBasicTasteCode;
    @XmlElement(required = true)
    protected TypeOfBasicTasteCodeType typeOfBasicTasteCode;

    /**
     * Gets the value of the strongnessOfBasicTasteCode property.
     * 
     * @return
     *     possible object is
     *     {@link StrongnessOfBasicTasteCodeType }
     *     
     */
    public StrongnessOfBasicTasteCodeType getStrongnessOfBasicTasteCode() {
        return strongnessOfBasicTasteCode;
    }

    /**
     * Sets the value of the strongnessOfBasicTasteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrongnessOfBasicTasteCodeType }
     *     
     */
    public void setStrongnessOfBasicTasteCode(StrongnessOfBasicTasteCodeType value) {
        this.strongnessOfBasicTasteCode = value;
    }

    /**
     * Gets the value of the typeOfBasicTasteCode property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfBasicTasteCodeType }
     *     
     */
    public TypeOfBasicTasteCodeType getTypeOfBasicTasteCode() {
        return typeOfBasicTasteCode;
    }

    /**
     * Sets the value of the typeOfBasicTasteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfBasicTasteCodeType }
     *     
     */
    public void setTypeOfBasicTasteCode(TypeOfBasicTasteCodeType value) {
        this.typeOfBasicTasteCode = value;
    }

}
