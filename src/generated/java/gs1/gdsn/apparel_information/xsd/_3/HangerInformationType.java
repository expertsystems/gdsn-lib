
package gs1.gdsn.apparel_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for HangerInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HangerInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="doesItemComeWithHanger" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemHanging" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="standardTypeHangerAgencyCode" type="{urn:gs1:gdsn:apparel_information:xsd:3}HangerStandardAgencyCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HangerInformationType", propOrder = {
    "doesItemComeWithHanger",
    "isTradeItemHanging",
    "standardTypeHangerAgencyCode"
})
public class HangerInformationType {

    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType doesItemComeWithHanger;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isTradeItemHanging;
    protected HangerStandardAgencyCodeType standardTypeHangerAgencyCode;

    /**
     * Gets the value of the doesItemComeWithHanger property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getDoesItemComeWithHanger() {
        return doesItemComeWithHanger;
    }

    /**
     * Sets the value of the doesItemComeWithHanger property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setDoesItemComeWithHanger(NonBinaryLogicEnumerationType value) {
        this.doesItemComeWithHanger = value;
    }

    /**
     * Gets the value of the isTradeItemHanging property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsTradeItemHanging() {
        return isTradeItemHanging;
    }

    /**
     * Sets the value of the isTradeItemHanging property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsTradeItemHanging(NonBinaryLogicEnumerationType value) {
        this.isTradeItemHanging = value;
    }

    /**
     * Gets the value of the standardTypeHangerAgencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link HangerStandardAgencyCodeType }
     *     
     */
    public HangerStandardAgencyCodeType getStandardTypeHangerAgencyCode() {
        return standardTypeHangerAgencyCode;
    }

    /**
     * Sets the value of the standardTypeHangerAgencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HangerStandardAgencyCodeType }
     *     
     */
    public void setStandardTypeHangerAgencyCode(HangerStandardAgencyCodeType value) {
        this.standardTypeHangerAgencyCode = value;
    }

}
