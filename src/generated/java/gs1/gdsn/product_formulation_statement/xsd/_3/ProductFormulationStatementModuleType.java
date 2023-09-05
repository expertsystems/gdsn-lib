
package gs1.gdsn.product_formulation_statement.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductFormulationStatementModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductFormulationStatementModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productFormulationStatement" type="{urn:gs1:gdsn:product_formulation_statement:xsd:3}ProductFormulationStatementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductFormulationStatementModuleType", propOrder = {
    "productFormulationStatement"
})
public class ProductFormulationStatementModuleType {

    protected List<ProductFormulationStatementType> productFormulationStatement;

    /**
     * Gets the value of the productFormulationStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productFormulationStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductFormulationStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductFormulationStatementType }
     * 
     * 
     */
    public List<ProductFormulationStatementType> getProductFormulationStatement() {
        if (productFormulationStatement == null) {
            productFormulationStatement = new ArrayList<ProductFormulationStatementType>();
        }
        return this.productFormulationStatement;
    }

}
