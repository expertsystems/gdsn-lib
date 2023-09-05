
package gs1.gdsn.consumer_instructions.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsumerInstructionsModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerInstructionsModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consumerInstructions" type="{urn:gs1:gdsn:consumer_instructions:xsd:3}ConsumerInstructionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerInstructionsModuleType", propOrder = {
    "consumerInstructions"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:consumer_instructions:xsd:3")
public class ConsumerInstructionsModuleType {

    protected ConsumerInstructionsType consumerInstructions;

    /**
     * Gets the value of the consumerInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerInstructionsType }
     *     
     */
    public ConsumerInstructionsType getConsumerInstructions() {
        return consumerInstructions;
    }

    /**
     * Sets the value of the consumerInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerInstructionsType }
     *     
     */
    public void setConsumerInstructions(ConsumerInstructionsType value) {
        this.consumerInstructions = value;
    }

}
