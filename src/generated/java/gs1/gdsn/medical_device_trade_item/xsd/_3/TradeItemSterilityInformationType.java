
package gs1.gdsn.medical_device_trade_item.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for TradeItemSterilityInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemSterilityInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="initialManufacturerSterilisationCode" type="{urn:gs1:gdsn:medical_device_trade_item:xsd:3}SterilisationTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="initialSterilisationPriorToUseCode" type="{urn:gs1:gdsn:medical_device_trade_item:xsd:3}SterilisationTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemRequiredToRemainSterile" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerSpecifiedAcceptableResterilisationCode" type="{urn:gs1:gdsn:medical_device_trade_item:xsd:3}SterilisationTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemSterilityInformationType", propOrder = {
    "initialManufacturerSterilisationCode",
    "initialSterilisationPriorToUseCode",
    "isTradeItemRequiredToRemainSterile",
    "manufacturerSpecifiedAcceptableResterilisationCode"
})
public class TradeItemSterilityInformationType {

    protected List<SterilisationTypeCodeType> initialManufacturerSterilisationCode;
    protected List<SterilisationTypeCodeType> initialSterilisationPriorToUseCode;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isTradeItemRequiredToRemainSterile;
    protected List<SterilisationTypeCodeType> manufacturerSpecifiedAcceptableResterilisationCode;

    /**
     * Gets the value of the initialManufacturerSterilisationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the initialManufacturerSterilisationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInitialManufacturerSterilisationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SterilisationTypeCodeType }
     * 
     * 
     */
    public List<SterilisationTypeCodeType> getInitialManufacturerSterilisationCode() {
        if (initialManufacturerSterilisationCode == null) {
            initialManufacturerSterilisationCode = new ArrayList<SterilisationTypeCodeType>();
        }
        return this.initialManufacturerSterilisationCode;
    }

    /**
     * Gets the value of the initialSterilisationPriorToUseCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the initialSterilisationPriorToUseCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInitialSterilisationPriorToUseCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SterilisationTypeCodeType }
     * 
     * 
     */
    public List<SterilisationTypeCodeType> getInitialSterilisationPriorToUseCode() {
        if (initialSterilisationPriorToUseCode == null) {
            initialSterilisationPriorToUseCode = new ArrayList<SterilisationTypeCodeType>();
        }
        return this.initialSterilisationPriorToUseCode;
    }

    /**
     * Gets the value of the isTradeItemRequiredToRemainSterile property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsTradeItemRequiredToRemainSterile() {
        return isTradeItemRequiredToRemainSterile;
    }

    /**
     * Sets the value of the isTradeItemRequiredToRemainSterile property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsTradeItemRequiredToRemainSterile(NonBinaryLogicEnumerationType value) {
        this.isTradeItemRequiredToRemainSterile = value;
    }

    /**
     * Gets the value of the manufacturerSpecifiedAcceptableResterilisationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerSpecifiedAcceptableResterilisationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerSpecifiedAcceptableResterilisationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SterilisationTypeCodeType }
     * 
     * 
     */
    public List<SterilisationTypeCodeType> getManufacturerSpecifiedAcceptableResterilisationCode() {
        if (manufacturerSpecifiedAcceptableResterilisationCode == null) {
            manufacturerSpecifiedAcceptableResterilisationCode = new ArrayList<SterilisationTypeCodeType>();
        }
        return this.manufacturerSpecifiedAcceptableResterilisationCode;
    }

}
