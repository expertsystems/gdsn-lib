
package gs1.gdsn.warranty_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.gdsn.gdsn_common.xsd._3.ReferencedFileInformationType;
import gs1.shared.shared_common.xsd._3.Description2500Type;


/**
 * <p>Java class for WarrantyInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WarrantyInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="warrantyDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description2500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="warrantyEffectiveDateType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="warrantyType" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isExtendedWarrantyFreeOfFees" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="referencedFileInformation" type="{urn:gs1:gdsn:gdsn_common:xsd:3}ReferencedFileInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="warrantyConditions" type="{urn:gs1:gdsn:warranty_information:xsd:3}WarrantyConditionsType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "WarrantyInformationType", propOrder = {
    "warrantyDescription",
    "warrantyEffectiveDateType",
    "warrantyType",
    "isExtendedWarrantyFreeOfFees",
    "referencedFileInformation",
    "warrantyConditions",
    "avpList"
})
public class WarrantyInformationType {

    protected List<Description2500Type> warrantyDescription;
    protected String warrantyEffectiveDateType;
    protected List<String> warrantyType;
    protected Boolean isExtendedWarrantyFreeOfFees;
    protected List<ReferencedFileInformationType> referencedFileInformation;
    protected List<WarrantyConditionsType> warrantyConditions;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the warrantyDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warrantyDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarrantyDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description2500Type }
     * 
     * 
     */
    public List<Description2500Type> getWarrantyDescription() {
        if (warrantyDescription == null) {
            warrantyDescription = new ArrayList<Description2500Type>();
        }
        return this.warrantyDescription;
    }

    /**
     * Gets the value of the warrantyEffectiveDateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyEffectiveDateType() {
        return warrantyEffectiveDateType;
    }

    /**
     * Sets the value of the warrantyEffectiveDateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyEffectiveDateType(String value) {
        this.warrantyEffectiveDateType = value;
    }

    /**
     * Gets the value of the warrantyType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warrantyType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarrantyType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWarrantyType() {
        if (warrantyType == null) {
            warrantyType = new ArrayList<String>();
        }
        return this.warrantyType;
    }

    /**
     * Gets the value of the isExtendedWarrantyFreeOfFees property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExtendedWarrantyFreeOfFees() {
        return isExtendedWarrantyFreeOfFees;
    }

    /**
     * Sets the value of the isExtendedWarrantyFreeOfFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExtendedWarrantyFreeOfFees(Boolean value) {
        this.isExtendedWarrantyFreeOfFees = value;
    }

    /**
     * Gets the value of the referencedFileInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencedFileInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencedFileInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencedFileInformationType }
     * 
     * 
     */
    public List<ReferencedFileInformationType> getReferencedFileInformation() {
        if (referencedFileInformation == null) {
            referencedFileInformation = new ArrayList<ReferencedFileInformationType>();
        }
        return this.referencedFileInformation;
    }

    /**
     * Gets the value of the warrantyConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warrantyConditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarrantyConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarrantyConditionsType }
     * 
     * 
     */
    public List<WarrantyConditionsType> getWarrantyConditions() {
        if (warrantyConditions == null) {
            warrantyConditions = new ArrayList<WarrantyConditionsType>();
        }
        return this.warrantyConditions;
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
