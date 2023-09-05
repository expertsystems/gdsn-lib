
package gs1.gdsn.variable_trade_item_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VariableTradeItemInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariableTradeItemInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="variableTradeItemInformation" type="{urn:gs1:gdsn:variable_trade_item_information:xsd:3}VariableTradeItemInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableTradeItemInformationModuleType", propOrder = {
    "variableTradeItemInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:variable_trade_item_information:xsd:3")
public class VariableTradeItemInformationModuleType {

    protected VariableTradeItemInformationType variableTradeItemInformation;

    /**
     * Gets the value of the variableTradeItemInformation property.
     * 
     * @return
     *     possible object is
     *     {@link VariableTradeItemInformationType }
     *     
     */
    public VariableTradeItemInformationType getVariableTradeItemInformation() {
        return variableTradeItemInformation;
    }

    /**
     * Sets the value of the variableTradeItemInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableTradeItemInformationType }
     *     
     */
    public void setVariableTradeItemInformation(VariableTradeItemInformationType value) {
        this.variableTradeItemInformation = value;
    }

}
