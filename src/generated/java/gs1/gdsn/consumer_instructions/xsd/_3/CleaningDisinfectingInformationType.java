
package gs1.gdsn.consumer_instructions.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CleaningDisinfectingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CleaningDisinfectingInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="typeOfCleaningDisinfectionProcessCode" type="{urn:gs1:gdsn:consumer_instructions:xsd:3}TypeOfCleaningDisinfectionProcessCodeType" minOccurs="0"/&gt;
 *         &lt;element name="isPreCleaningNecessary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="typeOfCleaningCode" type="{urn:gs1:gdsn:consumer_instructions:xsd:3}TypeOfCleaningCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="typeOfDisinfectionCode" type="{urn:gs1:gdsn:consumer_instructions:xsd:3}TypeOfDisinfectionCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CleaningDisinfectingInformationType", propOrder = {
    "typeOfCleaningDisinfectionProcessCode",
    "isPreCleaningNecessary",
    "typeOfCleaningCode",
    "typeOfDisinfectionCode"
})
public class CleaningDisinfectingInformationType {

    protected TypeOfCleaningDisinfectionProcessCodeType typeOfCleaningDisinfectionProcessCode;
    protected Boolean isPreCleaningNecessary;
    protected List<TypeOfCleaningCodeType> typeOfCleaningCode;
    protected List<TypeOfDisinfectionCodeType> typeOfDisinfectionCode;

    /**
     * Gets the value of the typeOfCleaningDisinfectionProcessCode property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfCleaningDisinfectionProcessCodeType }
     *     
     */
    public TypeOfCleaningDisinfectionProcessCodeType getTypeOfCleaningDisinfectionProcessCode() {
        return typeOfCleaningDisinfectionProcessCode;
    }

    /**
     * Sets the value of the typeOfCleaningDisinfectionProcessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfCleaningDisinfectionProcessCodeType }
     *     
     */
    public void setTypeOfCleaningDisinfectionProcessCode(TypeOfCleaningDisinfectionProcessCodeType value) {
        this.typeOfCleaningDisinfectionProcessCode = value;
    }

    /**
     * Gets the value of the isPreCleaningNecessary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPreCleaningNecessary() {
        return isPreCleaningNecessary;
    }

    /**
     * Sets the value of the isPreCleaningNecessary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPreCleaningNecessary(Boolean value) {
        this.isPreCleaningNecessary = value;
    }

    /**
     * Gets the value of the typeOfCleaningCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeOfCleaningCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeOfCleaningCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeOfCleaningCodeType }
     * 
     * 
     */
    public List<TypeOfCleaningCodeType> getTypeOfCleaningCode() {
        if (typeOfCleaningCode == null) {
            typeOfCleaningCode = new ArrayList<TypeOfCleaningCodeType>();
        }
        return this.typeOfCleaningCode;
    }

    /**
     * Gets the value of the typeOfDisinfectionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeOfDisinfectionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeOfDisinfectionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeOfDisinfectionCodeType }
     * 
     * 
     */
    public List<TypeOfDisinfectionCodeType> getTypeOfDisinfectionCode() {
        if (typeOfDisinfectionCode == null) {
            typeOfDisinfectionCode = new ArrayList<TypeOfDisinfectionCodeType>();
        }
        return this.typeOfDisinfectionCode;
    }

}
