
package gs1.gdsn.safety_data_sheet.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description1000Type;


/**
 * <p>Java class for PrecautionaryStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecautionaryStatementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="precautionaryStatementsCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="precautionaryStatementsDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecautionaryStatementType", propOrder = {
    "precautionaryStatementsCode",
    "precautionaryStatementsDescription"
})
public class PrecautionaryStatementType {

    protected String precautionaryStatementsCode;
    protected List<Description1000Type> precautionaryStatementsDescription;

    /**
     * Gets the value of the precautionaryStatementsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecautionaryStatementsCode() {
        return precautionaryStatementsCode;
    }

    /**
     * Sets the value of the precautionaryStatementsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecautionaryStatementsCode(String value) {
        this.precautionaryStatementsCode = value;
    }

    /**
     * Gets the value of the precautionaryStatementsDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precautionaryStatementsDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecautionaryStatementsDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getPrecautionaryStatementsDescription() {
        if (precautionaryStatementsDescription == null) {
            precautionaryStatementsDescription = new ArrayList<Description1000Type>();
        }
        return this.precautionaryStatementsDescription;
    }

}
