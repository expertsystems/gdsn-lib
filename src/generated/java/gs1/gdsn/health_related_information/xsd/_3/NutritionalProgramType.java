
package gs1.gdsn.health_related_information.xsd._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description5000Type;


/**
 * <p>Java class for NutritionalProgramType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NutritionalProgramType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nutritionalProgramCode" type="{urn:gs1:gdsn:health_related_information:xsd:3}NutritionalProgramCodeType" minOccurs="0"/&gt;
 *         &lt;element name="nutritionalProgramDetail" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nutritionalScore" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nutritionalValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="nutritionalProgramStatusCode" type="{urn:gs1:gdsn:health_related_information:xsd:3}NutritionalProgramStatusCodeType" minOccurs="0"/&gt;
 *         &lt;element name="nutritionalProgramIngredients" type="{urn:gs1:gdsn:health_related_information:xsd:3}NutritionalProgramIngredientsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NutritionalProgramType", propOrder = {
    "nutritionalProgramCode",
    "nutritionalProgramDetail",
    "nutritionalScore",
    "nutritionalValue",
    "nutritionalProgramStatusCode",
    "nutritionalProgramIngredients"
})
public class NutritionalProgramType {

    protected NutritionalProgramCodeType nutritionalProgramCode;
    protected List<Description5000Type> nutritionalProgramDetail;
    protected String nutritionalScore;
    protected BigDecimal nutritionalValue;
    protected NutritionalProgramStatusCodeType nutritionalProgramStatusCode;
    protected List<NutritionalProgramIngredientsType> nutritionalProgramIngredients;

    /**
     * Gets the value of the nutritionalProgramCode property.
     * 
     * @return
     *     possible object is
     *     {@link NutritionalProgramCodeType }
     *     
     */
    public NutritionalProgramCodeType getNutritionalProgramCode() {
        return nutritionalProgramCode;
    }

    /**
     * Sets the value of the nutritionalProgramCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NutritionalProgramCodeType }
     *     
     */
    public void setNutritionalProgramCode(NutritionalProgramCodeType value) {
        this.nutritionalProgramCode = value;
    }

    /**
     * Gets the value of the nutritionalProgramDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nutritionalProgramDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNutritionalProgramDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getNutritionalProgramDetail() {
        if (nutritionalProgramDetail == null) {
            nutritionalProgramDetail = new ArrayList<Description5000Type>();
        }
        return this.nutritionalProgramDetail;
    }

    /**
     * Gets the value of the nutritionalScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNutritionalScore() {
        return nutritionalScore;
    }

    /**
     * Sets the value of the nutritionalScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNutritionalScore(String value) {
        this.nutritionalScore = value;
    }

    /**
     * Gets the value of the nutritionalValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNutritionalValue() {
        return nutritionalValue;
    }

    /**
     * Sets the value of the nutritionalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNutritionalValue(BigDecimal value) {
        this.nutritionalValue = value;
    }

    /**
     * Gets the value of the nutritionalProgramStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link NutritionalProgramStatusCodeType }
     *     
     */
    public NutritionalProgramStatusCodeType getNutritionalProgramStatusCode() {
        return nutritionalProgramStatusCode;
    }

    /**
     * Sets the value of the nutritionalProgramStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NutritionalProgramStatusCodeType }
     *     
     */
    public void setNutritionalProgramStatusCode(NutritionalProgramStatusCodeType value) {
        this.nutritionalProgramStatusCode = value;
    }

    /**
     * Gets the value of the nutritionalProgramIngredients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nutritionalProgramIngredients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNutritionalProgramIngredients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NutritionalProgramIngredientsType }
     * 
     * 
     */
    public List<NutritionalProgramIngredientsType> getNutritionalProgramIngredients() {
        if (nutritionalProgramIngredients == null) {
            nutritionalProgramIngredients = new ArrayList<NutritionalProgramIngredientsType>();
        }
        return this.nutritionalProgramIngredients;
    }

}
