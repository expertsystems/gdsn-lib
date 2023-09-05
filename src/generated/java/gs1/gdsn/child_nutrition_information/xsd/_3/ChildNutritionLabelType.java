
package gs1.gdsn.child_nutrition_information.xsd._3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import gs1.gdsn.gdsn_common.xsd._3.ReferencedFileInformationType;
import gs1.shared.shared_common.xsd._3.Description1000Type;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for ChildNutritionLabelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChildNutritionLabelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="childNutritionExpirationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="childNutritionLabelStatement" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="childNutritionProductIdentification" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="childNutritionLabelDocument" type="{urn:gs1:gdsn:gdsn_common:xsd:3}ReferencedFileInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="childNutritionQualifier" type="{urn:gs1:gdsn:child_nutrition_information:xsd:3}ChildNutritionQualifierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChildNutritionLabelType", propOrder = {
    "childNutritionExpirationDateTime",
    "childNutritionLabelStatement",
    "childNutritionProductIdentification",
    "childNutritionLabelDocument",
    "childNutritionQualifier"
})
public class ChildNutritionLabelType {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime childNutritionExpirationDateTime;
    protected List<Description1000Type> childNutritionLabelStatement;
    protected String childNutritionProductIdentification;
    protected List<ReferencedFileInformationType> childNutritionLabelDocument;
    protected List<ChildNutritionQualifierType> childNutritionQualifier;

    /**
     * Gets the value of the childNutritionExpirationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getChildNutritionExpirationDateTime() {
        return childNutritionExpirationDateTime;
    }

    /**
     * Sets the value of the childNutritionExpirationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildNutritionExpirationDateTime(LocalDateTime value) {
        this.childNutritionExpirationDateTime = value;
    }

    /**
     * Gets the value of the childNutritionLabelStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childNutritionLabelStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildNutritionLabelStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getChildNutritionLabelStatement() {
        if (childNutritionLabelStatement == null) {
            childNutritionLabelStatement = new ArrayList<Description1000Type>();
        }
        return this.childNutritionLabelStatement;
    }

    /**
     * Gets the value of the childNutritionProductIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildNutritionProductIdentification() {
        return childNutritionProductIdentification;
    }

    /**
     * Sets the value of the childNutritionProductIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildNutritionProductIdentification(String value) {
        this.childNutritionProductIdentification = value;
    }

    /**
     * Gets the value of the childNutritionLabelDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childNutritionLabelDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildNutritionLabelDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencedFileInformationType }
     * 
     * 
     */
    public List<ReferencedFileInformationType> getChildNutritionLabelDocument() {
        if (childNutritionLabelDocument == null) {
            childNutritionLabelDocument = new ArrayList<ReferencedFileInformationType>();
        }
        return this.childNutritionLabelDocument;
    }

    /**
     * Gets the value of the childNutritionQualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childNutritionQualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildNutritionQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildNutritionQualifierType }
     * 
     * 
     */
    public List<ChildNutritionQualifierType> getChildNutritionQualifier() {
        if (childNutritionQualifier == null) {
            childNutritionQualifier = new ArrayList<ChildNutritionQualifierType>();
        }
        return this.childNutritionQualifier;
    }

}
