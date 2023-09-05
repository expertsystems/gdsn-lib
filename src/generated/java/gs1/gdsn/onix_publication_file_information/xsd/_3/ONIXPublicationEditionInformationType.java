
package gs1.gdsn.onix_publication_file_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description2500Type;


/**
 * <p>Java class for ONIXPublicationEditionInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ONIXPublicationEditionInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="editionNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="editionStatement" type="{urn:gs1:shared:shared_common:xsd:3}Description2500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="editionTypeCode" type="{urn:gs1:gdsn:onix_publication_file_information:xsd:3}ONIXEditionTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="editionVersionNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ONIXPublicationEditionInformationType", propOrder = {
    "editionNumber",
    "editionStatement",
    "editionTypeCode",
    "editionVersionNumber"
})
public class ONIXPublicationEditionInformationType {

    protected String editionNumber;
    protected List<Description2500Type> editionStatement;
    protected List<ONIXEditionTypeCodeType> editionTypeCode;
    protected String editionVersionNumber;

    /**
     * Gets the value of the editionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditionNumber() {
        return editionNumber;
    }

    /**
     * Sets the value of the editionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditionNumber(String value) {
        this.editionNumber = value;
    }

    /**
     * Gets the value of the editionStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the editionStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEditionStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description2500Type }
     * 
     * 
     */
    public List<Description2500Type> getEditionStatement() {
        if (editionStatement == null) {
            editionStatement = new ArrayList<Description2500Type>();
        }
        return this.editionStatement;
    }

    /**
     * Gets the value of the editionTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the editionTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEditionTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ONIXEditionTypeCodeType }
     * 
     * 
     */
    public List<ONIXEditionTypeCodeType> getEditionTypeCode() {
        if (editionTypeCode == null) {
            editionTypeCode = new ArrayList<ONIXEditionTypeCodeType>();
        }
        return this.editionTypeCode;
    }

    /**
     * Gets the value of the editionVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditionVersionNumber() {
        return editionVersionNumber;
    }

    /**
     * Sets the value of the editionVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditionVersionNumber(String value) {
        this.editionVersionNumber = value;
    }

}
