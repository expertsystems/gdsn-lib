
package gs1.gdsn.trade_item_disposal_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.AmountType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for ManufacturerTakeBackProgramType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManufacturerTakeBackProgramType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="doesManufacturerHaveTakeBackProgram" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerTakeBackProgramFee" type="{urn:gs1:shared:shared_common:xsd:3}AmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManufacturerTakeBackProgramType", propOrder = {
    "doesManufacturerHaveTakeBackProgram",
    "manufacturerTakeBackProgramFee"
})
public class ManufacturerTakeBackProgramType {

    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType doesManufacturerHaveTakeBackProgram;
    protected List<AmountType> manufacturerTakeBackProgramFee;

    /**
     * Gets the value of the doesManufacturerHaveTakeBackProgram property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getDoesManufacturerHaveTakeBackProgram() {
        return doesManufacturerHaveTakeBackProgram;
    }

    /**
     * Sets the value of the doesManufacturerHaveTakeBackProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setDoesManufacturerHaveTakeBackProgram(NonBinaryLogicEnumerationType value) {
        this.doesManufacturerHaveTakeBackProgram = value;
    }

    /**
     * Gets the value of the manufacturerTakeBackProgramFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerTakeBackProgramFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerTakeBackProgramFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getManufacturerTakeBackProgramFee() {
        if (manufacturerTakeBackProgramFee == null) {
            manufacturerTakeBackProgramFee = new ArrayList<AmountType>();
        }
        return this.manufacturerTakeBackProgramFee;
    }

}
