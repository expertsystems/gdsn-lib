
package gs1.gdsn.allergen_information.xsd._3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.Description1000Type;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for AllergenRelatedInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllergenRelatedInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="allergenSpecificationAgency" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="allergenSpecificationName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="allergenStatement" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="allergenRelevantDataProvidedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="isAllergenRelevantDataProvided" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="allergen" type="{urn:gs1:gdsn:allergen_information:xsd:3}AllergenType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AllergenRelatedInformationType", propOrder = {
    "allergenSpecificationAgency",
    "allergenSpecificationName",
    "allergenStatement",
    "allergenRelevantDataProvidedDateTime",
    "isAllergenRelevantDataProvided",
    "allergen",
    "avpList"
})
public class AllergenRelatedInformationType {

    protected String allergenSpecificationAgency;
    protected String allergenSpecificationName;
    protected List<Description1000Type> allergenStatement;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime allergenRelevantDataProvidedDateTime;
    protected Boolean isAllergenRelevantDataProvided;
    protected List<AllergenType> allergen;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the allergenSpecificationAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllergenSpecificationAgency() {
        return allergenSpecificationAgency;
    }

    /**
     * Sets the value of the allergenSpecificationAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllergenSpecificationAgency(String value) {
        this.allergenSpecificationAgency = value;
    }

    /**
     * Gets the value of the allergenSpecificationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllergenSpecificationName() {
        return allergenSpecificationName;
    }

    /**
     * Sets the value of the allergenSpecificationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllergenSpecificationName(String value) {
        this.allergenSpecificationName = value;
    }

    /**
     * Gets the value of the allergenStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allergenStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllergenStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getAllergenStatement() {
        if (allergenStatement == null) {
            allergenStatement = new ArrayList<Description1000Type>();
        }
        return this.allergenStatement;
    }

    /**
     * Gets the value of the allergenRelevantDataProvidedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getAllergenRelevantDataProvidedDateTime() {
        return allergenRelevantDataProvidedDateTime;
    }

    /**
     * Sets the value of the allergenRelevantDataProvidedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllergenRelevantDataProvidedDateTime(LocalDateTime value) {
        this.allergenRelevantDataProvidedDateTime = value;
    }

    /**
     * Gets the value of the isAllergenRelevantDataProvided property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllergenRelevantDataProvided() {
        return isAllergenRelevantDataProvided;
    }

    /**
     * Sets the value of the isAllergenRelevantDataProvided property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllergenRelevantDataProvided(Boolean value) {
        this.isAllergenRelevantDataProvided = value;
    }

    /**
     * Gets the value of the allergen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allergen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllergen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllergenType }
     * 
     * 
     */
    public List<AllergenType> getAllergen() {
        if (allergen == null) {
            allergen = new ArrayList<AllergenType>();
        }
        return this.allergen;
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
