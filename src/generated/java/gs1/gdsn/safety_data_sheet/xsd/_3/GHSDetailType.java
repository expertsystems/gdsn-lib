
package gs1.gdsn.safety_data_sheet.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GHSDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GHSDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gHSSignalWordsCode" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}GHSSignalWordsCodeType" minOccurs="0"/&gt;
 *         &lt;element name="gHSSymbolDescriptionCode" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}GHSSymbolDescriptionCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hazardStatement" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}HazardStatementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="precautionaryStatement" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}PrecautionaryStatementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GHSDetailType", propOrder = {
    "ghsSignalWordsCode",
    "ghsSymbolDescriptionCode",
    "hazardStatement",
    "precautionaryStatement"
})
public class GHSDetailType {

    @XmlElement(name = "gHSSignalWordsCode")
    protected GHSSignalWordsCodeType ghsSignalWordsCode;
    @XmlElement(name = "gHSSymbolDescriptionCode")
    protected List<GHSSymbolDescriptionCodeType> ghsSymbolDescriptionCode;
    protected List<HazardStatementType> hazardStatement;
    protected List<PrecautionaryStatementType> precautionaryStatement;

    /**
     * Gets the value of the ghsSignalWordsCode property.
     * 
     * @return
     *     possible object is
     *     {@link GHSSignalWordsCodeType }
     *     
     */
    public GHSSignalWordsCodeType getGHSSignalWordsCode() {
        return ghsSignalWordsCode;
    }

    /**
     * Sets the value of the ghsSignalWordsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GHSSignalWordsCodeType }
     *     
     */
    public void setGHSSignalWordsCode(GHSSignalWordsCodeType value) {
        this.ghsSignalWordsCode = value;
    }

    /**
     * Gets the value of the ghsSymbolDescriptionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ghsSymbolDescriptionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGHSSymbolDescriptionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GHSSymbolDescriptionCodeType }
     * 
     * 
     */
    public List<GHSSymbolDescriptionCodeType> getGHSSymbolDescriptionCode() {
        if (ghsSymbolDescriptionCode == null) {
            ghsSymbolDescriptionCode = new ArrayList<GHSSymbolDescriptionCodeType>();
        }
        return this.ghsSymbolDescriptionCode;
    }

    /**
     * Gets the value of the hazardStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardStatementType }
     * 
     * 
     */
    public List<HazardStatementType> getHazardStatement() {
        if (hazardStatement == null) {
            hazardStatement = new ArrayList<HazardStatementType>();
        }
        return this.hazardStatement;
    }

    /**
     * Gets the value of the precautionaryStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precautionaryStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecautionaryStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrecautionaryStatementType }
     * 
     * 
     */
    public List<PrecautionaryStatementType> getPrecautionaryStatement() {
        if (precautionaryStatement == null) {
            precautionaryStatement = new ArrayList<PrecautionaryStatementType>();
        }
        return this.precautionaryStatement;
    }

}
