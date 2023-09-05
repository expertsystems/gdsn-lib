
package gs1.gdsn.safety_data_sheet.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for REACHInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REACHInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isSubstanceOfVeryHighConcern" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="isTradeItemREACHRelevant" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="rEACHUseDescriptorInformation" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}REACHUseDescriptorInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REACHInformationType", propOrder = {
    "isSubstanceOfVeryHighConcern",
    "isTradeItemREACHRelevant",
    "reachUseDescriptorInformation"
})
public class REACHInformationType {

    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isSubstanceOfVeryHighConcern;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isTradeItemREACHRelevant;
    @XmlElement(name = "rEACHUseDescriptorInformation")
    protected List<REACHUseDescriptorInformationType> reachUseDescriptorInformation;

    /**
     * Gets the value of the isSubstanceOfVeryHighConcern property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsSubstanceOfVeryHighConcern() {
        return isSubstanceOfVeryHighConcern;
    }

    /**
     * Sets the value of the isSubstanceOfVeryHighConcern property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsSubstanceOfVeryHighConcern(NonBinaryLogicEnumerationType value) {
        this.isSubstanceOfVeryHighConcern = value;
    }

    /**
     * Gets the value of the isTradeItemREACHRelevant property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsTradeItemREACHRelevant() {
        return isTradeItemREACHRelevant;
    }

    /**
     * Sets the value of the isTradeItemREACHRelevant property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsTradeItemREACHRelevant(NonBinaryLogicEnumerationType value) {
        this.isTradeItemREACHRelevant = value;
    }

    /**
     * Gets the value of the reachUseDescriptorInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reachUseDescriptorInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getREACHUseDescriptorInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REACHUseDescriptorInformationType }
     * 
     * 
     */
    public List<REACHUseDescriptorInformationType> getREACHUseDescriptorInformation() {
        if (reachUseDescriptorInformation == null) {
            reachUseDescriptorInformation = new ArrayList<REACHUseDescriptorInformationType>();
        }
        return this.reachUseDescriptorInformation;
    }

}
