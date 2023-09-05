
package gs1.gdsn.regulated_trade_item.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for RegulatedTradeItemModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegulatedTradeItemModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="doesTradeItemContainElectricalComponents" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="regulatoryInformation" type="{urn:gs1:gdsn:regulated_trade_item:xsd:3}RegulatoryInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatedTradeItemModuleType", propOrder = {
    "doesTradeItemContainElectricalComponents",
    "regulatoryInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:regulated_trade_item:xsd:3")
public class RegulatedTradeItemModuleType {

    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType doesTradeItemContainElectricalComponents;
    protected List<RegulatoryInformationType> regulatoryInformation;

    /**
     * Gets the value of the doesTradeItemContainElectricalComponents property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getDoesTradeItemContainElectricalComponents() {
        return doesTradeItemContainElectricalComponents;
    }

    /**
     * Sets the value of the doesTradeItemContainElectricalComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setDoesTradeItemContainElectricalComponents(NonBinaryLogicEnumerationType value) {
        this.doesTradeItemContainElectricalComponents = value;
    }

    /**
     * Gets the value of the regulatoryInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regulatoryInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegulatoryInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegulatoryInformationType }
     * 
     * 
     */
    public List<RegulatoryInformationType> getRegulatoryInformation() {
        if (regulatoryInformation == null) {
            regulatoryInformation = new ArrayList<RegulatoryInformationType>();
        }
        return this.regulatoryInformation;
    }

}
