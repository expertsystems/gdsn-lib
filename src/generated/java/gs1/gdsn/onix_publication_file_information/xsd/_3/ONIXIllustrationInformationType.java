
package gs1.gdsn.onix_publication_file_information.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description2500Type;


/**
 * <p>Java class for ONIXIllustrationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ONIXIllustrationInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="illustrationNote" type="{urn:gs1:shared:shared_common:xsd:3}Description2500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="illustrationTypeCode" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXIllustrationTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="mapScale" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="numberOfIllustrations" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ONIXIllustrationInformationType", propOrder = {
    "illustrationNote",
    "illustrationTypeCode",
    "mapScale",
    "numberOfIllustrations"
})
public class ONIXIllustrationInformationType {

    protected List<Description2500Type> illustrationNote;
    protected ONIXIllustrationTypeCodeType illustrationTypeCode;
    protected String mapScale;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfIllustrations;

    /**
     * Gets the value of the illustrationNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the illustrationNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIllustrationNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description2500Type }
     * 
     * 
     */
    public List<Description2500Type> getIllustrationNote() {
        if (illustrationNote == null) {
            illustrationNote = new ArrayList<Description2500Type>();
        }
        return this.illustrationNote;
    }

    /**
     * Gets the value of the illustrationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ONIXIllustrationTypeCodeType }
     *     
     */
    public ONIXIllustrationTypeCodeType getIllustrationTypeCode() {
        return illustrationTypeCode;
    }

    /**
     * Sets the value of the illustrationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ONIXIllustrationTypeCodeType }
     *     
     */
    public void setIllustrationTypeCode(ONIXIllustrationTypeCodeType value) {
        this.illustrationTypeCode = value;
    }

    /**
     * Gets the value of the mapScale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapScale() {
        return mapScale;
    }

    /**
     * Sets the value of the mapScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapScale(String value) {
        this.mapScale = value;
    }

    /**
     * Gets the value of the numberOfIllustrations property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfIllustrations() {
        return numberOfIllustrations;
    }

    /**
     * Sets the value of the numberOfIllustrations property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfIllustrations(BigInteger value) {
        this.numberOfIllustrations = value;
    }

}
