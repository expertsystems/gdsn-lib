
package gs1.gdsn.product_formulation_statement.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.NutritionAgencyCodeType;
import gs1.gdsn.gdsn_common.xsd._3.ReferencedFileInformationType;
import gs1.shared.shared_common.xsd._3.Description5000Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for ProductFormulationStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductFormulationStatementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productFormulationStatementRegulatoryBodyCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}NutritionAgencyCodeType"/&gt;
 *         &lt;element name="productFormulationStatementDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="totalPortionWeightAsPurchased" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productFormulationStatementDocument" type="{urn:gs1:gdsn:gdsn_common:xsd:3}ReferencedFileInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="creditableIngredient" type="{urn:gs1:gdsn:product_formulation_statement:xsd:3}CreditableIngredientType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductFormulationStatementType", propOrder = {
    "productFormulationStatementRegulatoryBodyCode",
    "productFormulationStatementDescription",
    "totalPortionWeightAsPurchased",
    "productFormulationStatementDocument",
    "creditableIngredient"
})
public class ProductFormulationStatementType {

    @XmlElement(required = true)
    protected NutritionAgencyCodeType productFormulationStatementRegulatoryBodyCode;
    protected List<Description5000Type> productFormulationStatementDescription;
    protected List<MeasurementType> totalPortionWeightAsPurchased;
    protected List<ReferencedFileInformationType> productFormulationStatementDocument;
    protected List<CreditableIngredientType> creditableIngredient;

    /**
     * Gets the value of the productFormulationStatementRegulatoryBodyCode property.
     * 
     * @return
     *     possible object is
     *     {@link NutritionAgencyCodeType }
     *     
     */
    public NutritionAgencyCodeType getProductFormulationStatementRegulatoryBodyCode() {
        return productFormulationStatementRegulatoryBodyCode;
    }

    /**
     * Sets the value of the productFormulationStatementRegulatoryBodyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NutritionAgencyCodeType }
     *     
     */
    public void setProductFormulationStatementRegulatoryBodyCode(NutritionAgencyCodeType value) {
        this.productFormulationStatementRegulatoryBodyCode = value;
    }

    /**
     * Gets the value of the productFormulationStatementDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productFormulationStatementDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductFormulationStatementDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getProductFormulationStatementDescription() {
        if (productFormulationStatementDescription == null) {
            productFormulationStatementDescription = new ArrayList<Description5000Type>();
        }
        return this.productFormulationStatementDescription;
    }

    /**
     * Gets the value of the totalPortionWeightAsPurchased property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalPortionWeightAsPurchased property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalPortionWeightAsPurchased().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getTotalPortionWeightAsPurchased() {
        if (totalPortionWeightAsPurchased == null) {
            totalPortionWeightAsPurchased = new ArrayList<MeasurementType>();
        }
        return this.totalPortionWeightAsPurchased;
    }

    /**
     * Gets the value of the productFormulationStatementDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productFormulationStatementDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductFormulationStatementDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencedFileInformationType }
     * 
     * 
     */
    public List<ReferencedFileInformationType> getProductFormulationStatementDocument() {
        if (productFormulationStatementDocument == null) {
            productFormulationStatementDocument = new ArrayList<ReferencedFileInformationType>();
        }
        return this.productFormulationStatementDocument;
    }

    /**
     * Gets the value of the creditableIngredient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditableIngredient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditableIngredient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditableIngredientType }
     * 
     * 
     */
    public List<CreditableIngredientType> getCreditableIngredient() {
        if (creditableIngredient == null) {
            creditableIngredient = new ArrayList<CreditableIngredientType>();
        }
        return this.creditableIngredient;
    }

}
