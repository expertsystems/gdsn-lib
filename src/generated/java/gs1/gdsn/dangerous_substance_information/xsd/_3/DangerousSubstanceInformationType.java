
package gs1.gdsn.dangerous_substance_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;


/**
 * <p>Java class for DangerousSubstanceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DangerousSubstanceInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlOfHazardousSubstancesRegulationsAgency" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="controlOfHazardousSubstancesRegulationsRegulationName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dangerousSubstanceProperties" type="{urn:gs1:gdsn:dangerous_substance_information:xsd:3}DangerousSubstancePropertiesType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "DangerousSubstanceInformationType", propOrder = {
    "controlOfHazardousSubstancesRegulationsAgency",
    "controlOfHazardousSubstancesRegulationsRegulationName",
    "dangerousSubstanceProperties",
    "avpList"
})
public class DangerousSubstanceInformationType {

    protected String controlOfHazardousSubstancesRegulationsAgency;
    protected String controlOfHazardousSubstancesRegulationsRegulationName;
    protected List<DangerousSubstancePropertiesType> dangerousSubstanceProperties;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the controlOfHazardousSubstancesRegulationsAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlOfHazardousSubstancesRegulationsAgency() {
        return controlOfHazardousSubstancesRegulationsAgency;
    }

    /**
     * Sets the value of the controlOfHazardousSubstancesRegulationsAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlOfHazardousSubstancesRegulationsAgency(String value) {
        this.controlOfHazardousSubstancesRegulationsAgency = value;
    }

    /**
     * Gets the value of the controlOfHazardousSubstancesRegulationsRegulationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlOfHazardousSubstancesRegulationsRegulationName() {
        return controlOfHazardousSubstancesRegulationsRegulationName;
    }

    /**
     * Sets the value of the controlOfHazardousSubstancesRegulationsRegulationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlOfHazardousSubstancesRegulationsRegulationName(String value) {
        this.controlOfHazardousSubstancesRegulationsRegulationName = value;
    }

    /**
     * Gets the value of the dangerousSubstanceProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dangerousSubstanceProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDangerousSubstanceProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DangerousSubstancePropertiesType }
     * 
     * 
     */
    public List<DangerousSubstancePropertiesType> getDangerousSubstanceProperties() {
        if (dangerousSubstanceProperties == null) {
            dangerousSubstanceProperties = new ArrayList<DangerousSubstancePropertiesType>();
        }
        return this.dangerousSubstanceProperties;
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
