
package gs1.gdsn.electronic_device_characteristics_information.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description500Type;


/**
 * <p>Java class for AudioVideoConnectorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioVideoConnectorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="audioVisualConnectionInputDirectionCode" type="{urn:gs1:gdsn:electronic_device_characteristics_information:xsd:3}AudioVisualConnectionInputDirectionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="audioVisualConnectionLocationCode" type="{urn:gs1:gdsn:electronic_device_characteristics_information:xsd:3}AudioVisualConnectionLocationCodeType" minOccurs="0"/&gt;
 *         &lt;element name="audioVisualConnectionQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="audioVisualConnectionTypeCode" type="{urn:gs1:gdsn:electronic_device_characteristics_information:xsd:3}AudioVisualConnectionTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="connectorFinishDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioVideoConnectorType", propOrder = {
    "audioVisualConnectionInputDirectionCode",
    "audioVisualConnectionLocationCode",
    "audioVisualConnectionQuantity",
    "audioVisualConnectionTypeCode",
    "connectorFinishDescription"
})
public class AudioVideoConnectorType {

    protected AudioVisualConnectionInputDirectionCodeType audioVisualConnectionInputDirectionCode;
    protected AudioVisualConnectionLocationCodeType audioVisualConnectionLocationCode;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger audioVisualConnectionQuantity;
    protected AudioVisualConnectionTypeCodeType audioVisualConnectionTypeCode;
    protected List<Description500Type> connectorFinishDescription;

    /**
     * Gets the value of the audioVisualConnectionInputDirectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link AudioVisualConnectionInputDirectionCodeType }
     *     
     */
    public AudioVisualConnectionInputDirectionCodeType getAudioVisualConnectionInputDirectionCode() {
        return audioVisualConnectionInputDirectionCode;
    }

    /**
     * Sets the value of the audioVisualConnectionInputDirectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioVisualConnectionInputDirectionCodeType }
     *     
     */
    public void setAudioVisualConnectionInputDirectionCode(AudioVisualConnectionInputDirectionCodeType value) {
        this.audioVisualConnectionInputDirectionCode = value;
    }

    /**
     * Gets the value of the audioVisualConnectionLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link AudioVisualConnectionLocationCodeType }
     *     
     */
    public AudioVisualConnectionLocationCodeType getAudioVisualConnectionLocationCode() {
        return audioVisualConnectionLocationCode;
    }

    /**
     * Sets the value of the audioVisualConnectionLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioVisualConnectionLocationCodeType }
     *     
     */
    public void setAudioVisualConnectionLocationCode(AudioVisualConnectionLocationCodeType value) {
        this.audioVisualConnectionLocationCode = value;
    }

    /**
     * Gets the value of the audioVisualConnectionQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAudioVisualConnectionQuantity() {
        return audioVisualConnectionQuantity;
    }

    /**
     * Sets the value of the audioVisualConnectionQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAudioVisualConnectionQuantity(BigInteger value) {
        this.audioVisualConnectionQuantity = value;
    }

    /**
     * Gets the value of the audioVisualConnectionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link AudioVisualConnectionTypeCodeType }
     *     
     */
    public AudioVisualConnectionTypeCodeType getAudioVisualConnectionTypeCode() {
        return audioVisualConnectionTypeCode;
    }

    /**
     * Sets the value of the audioVisualConnectionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioVisualConnectionTypeCodeType }
     *     
     */
    public void setAudioVisualConnectionTypeCode(AudioVisualConnectionTypeCodeType value) {
        this.audioVisualConnectionTypeCode = value;
    }

    /**
     * Gets the value of the connectorFinishDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectorFinishDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectorFinishDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getConnectorFinishDescription() {
        if (connectorFinishDescription == null) {
            connectorFinishDescription = new ArrayList<Description500Type>();
        }
        return this.connectorFinishDescription;
    }

}
