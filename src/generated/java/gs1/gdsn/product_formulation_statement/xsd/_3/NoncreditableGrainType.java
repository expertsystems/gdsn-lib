
package gs1.gdsn.product_formulation_statement.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description500Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for NoncreditableGrainType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoncreditableGrainType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="noncreditableGrainAmount" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="noncreditableGrainDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoncreditableGrainType", propOrder = {
    "noncreditableGrainAmount",
    "noncreditableGrainDescription"
})
public class NoncreditableGrainType {

    protected List<MeasurementType> noncreditableGrainAmount;
    protected List<Description500Type> noncreditableGrainDescription;

    /**
     * Gets the value of the noncreditableGrainAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noncreditableGrainAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoncreditableGrainAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getNoncreditableGrainAmount() {
        if (noncreditableGrainAmount == null) {
            noncreditableGrainAmount = new ArrayList<MeasurementType>();
        }
        return this.noncreditableGrainAmount;
    }

    /**
     * Gets the value of the noncreditableGrainDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noncreditableGrainDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoncreditableGrainDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getNoncreditableGrainDescription() {
        if (noncreditableGrainDescription == null) {
            noncreditableGrainDescription = new ArrayList<Description500Type>();
        }
        return this.noncreditableGrainDescription;
    }

}
