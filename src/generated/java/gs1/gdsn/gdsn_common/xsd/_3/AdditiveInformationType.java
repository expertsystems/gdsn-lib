
package gs1.gdsn.gdsn_common.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.CodeType;


/**
 * <p>Java class for AdditiveInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditiveInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additiveName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="levelOfContainmentCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}LevelOfContainmentCodeType"/&gt;
 *         &lt;element name="additiveTypeCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditiveInformationType", propOrder = {
    "additiveName",
    "levelOfContainmentCode",
    "additiveTypeCodeReference"
})
public class AdditiveInformationType {

    @XmlElement(required = true)
    protected String additiveName;
    @XmlElement(required = true)
    protected LevelOfContainmentCodeType levelOfContainmentCode;
    protected List<CodeType> additiveTypeCodeReference;

    /**
     * Gets the value of the additiveName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditiveName() {
        return additiveName;
    }

    /**
     * Sets the value of the additiveName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditiveName(String value) {
        this.additiveName = value;
    }

    /**
     * Gets the value of the levelOfContainmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link LevelOfContainmentCodeType }
     *     
     */
    public LevelOfContainmentCodeType getLevelOfContainmentCode() {
        return levelOfContainmentCode;
    }

    /**
     * Sets the value of the levelOfContainmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelOfContainmentCodeType }
     *     
     */
    public void setLevelOfContainmentCode(LevelOfContainmentCodeType value) {
        this.levelOfContainmentCode = value;
    }

    /**
     * Gets the value of the additiveTypeCodeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additiveTypeCodeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditiveTypeCodeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getAdditiveTypeCodeReference() {
        if (additiveTypeCodeReference == null) {
            additiveTypeCodeReference = new ArrayList<CodeType>();
        }
        return this.additiveTypeCodeReference;
    }

}
