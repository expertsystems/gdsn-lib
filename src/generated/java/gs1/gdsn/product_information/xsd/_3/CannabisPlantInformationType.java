
package gs1.gdsn.product_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description250Type;


/**
 * <p>Java class for CannabisPlantInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CannabisPlantInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cannabisCommonName" type="{urn:gs1:shared:shared_common:xsd:3}Description250Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cannabisPlantTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}CannabisPlantTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="isCannabisPlantAHybrid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CannabisPlantInformationType", propOrder = {
    "cannabisCommonName",
    "cannabisPlantTypeCode",
    "isCannabisPlantAHybrid"
})
public class CannabisPlantInformationType {

    protected List<Description250Type> cannabisCommonName;
    protected CannabisPlantTypeCodeType cannabisPlantTypeCode;
    protected Boolean isCannabisPlantAHybrid;

    /**
     * Gets the value of the cannabisCommonName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cannabisCommonName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCannabisCommonName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description250Type }
     * 
     * 
     */
    public List<Description250Type> getCannabisCommonName() {
        if (cannabisCommonName == null) {
            cannabisCommonName = new ArrayList<Description250Type>();
        }
        return this.cannabisCommonName;
    }

    /**
     * Gets the value of the cannabisPlantTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CannabisPlantTypeCodeType }
     *     
     */
    public CannabisPlantTypeCodeType getCannabisPlantTypeCode() {
        return cannabisPlantTypeCode;
    }

    /**
     * Sets the value of the cannabisPlantTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CannabisPlantTypeCodeType }
     *     
     */
    public void setCannabisPlantTypeCode(CannabisPlantTypeCodeType value) {
        this.cannabisPlantTypeCode = value;
    }

    /**
     * Gets the value of the isCannabisPlantAHybrid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCannabisPlantAHybrid() {
        return isCannabisPlantAHybrid;
    }

    /**
     * Sets the value of the isCannabisPlantAHybrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCannabisPlantAHybrid(Boolean value) {
        this.isCannabisPlantAHybrid = value;
    }

}
