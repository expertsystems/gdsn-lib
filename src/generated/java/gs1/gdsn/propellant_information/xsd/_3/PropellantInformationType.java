
package gs1.gdsn.propellant_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for PropellantInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropellantInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="doesTradeItemContainPropellant" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="flammableAerosolContainmentCode" type="{urn:gs1:gdsn:propellant_information:xsd:3}FlammableAerosolContainmentCodeType" minOccurs="0"/&gt;
 *         &lt;element name="flammableGasWeight" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="avpList" type="{urn:gs1:gdsn:gdsn_common:xsd:3}GS1_AttributeValuePairListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropellantInformationType", propOrder = {
    "doesTradeItemContainPropellant",
    "flammableAerosolContainmentCode",
    "flammableGasWeight",
    "avpList"
})
public class PropellantInformationType {

    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType doesTradeItemContainPropellant;
    protected FlammableAerosolContainmentCodeType flammableAerosolContainmentCode;
    protected MeasurementType flammableGasWeight;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the doesTradeItemContainPropellant property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getDoesTradeItemContainPropellant() {
        return doesTradeItemContainPropellant;
    }

    /**
     * Sets the value of the doesTradeItemContainPropellant property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setDoesTradeItemContainPropellant(NonBinaryLogicEnumerationType value) {
        this.doesTradeItemContainPropellant = value;
    }

    /**
     * Gets the value of the flammableAerosolContainmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link FlammableAerosolContainmentCodeType }
     *     
     */
    public FlammableAerosolContainmentCodeType getFlammableAerosolContainmentCode() {
        return flammableAerosolContainmentCode;
    }

    /**
     * Sets the value of the flammableAerosolContainmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlammableAerosolContainmentCodeType }
     *     
     */
    public void setFlammableAerosolContainmentCode(FlammableAerosolContainmentCodeType value) {
        this.flammableAerosolContainmentCode = value;
    }

    /**
     * Gets the value of the flammableGasWeight property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getFlammableGasWeight() {
        return flammableGasWeight;
    }

    /**
     * Sets the value of the flammableGasWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setFlammableGasWeight(MeasurementType value) {
        this.flammableGasWeight = value;
    }

    /**
     * Gets the value of the avpList property.
     * 
     * @return
     *     possible object is
     *     {@link GS1AttributeValuePairListType }
     *     
     */
    public GS1AttributeValuePairListType getAvpList() {
        return avpList;
    }

    /**
     * Sets the value of the avpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GS1AttributeValuePairListType }
     *     
     */
    public void setAvpList(GS1AttributeValuePairListType value) {
        this.avpList = value;
    }

}
