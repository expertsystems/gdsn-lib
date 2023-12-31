
package gs1.shared.shared_common.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ColourType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColourType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="colourCode" type="{urn:gs1:shared:shared_common:xsd:3}ColourCodeType" minOccurs="0"/&gt;
 *         &lt;element name="colourDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="colourFamilyCode" type="{urn:gs1:shared:shared_common:xsd:3}ColourFamilyCodeType" minOccurs="0"/&gt;
 *         &lt;element name="colourTintCode" type="{urn:gs1:shared:shared_common:xsd:3}ColourTintCodeType" minOccurs="0"/&gt;
 *         &lt;element name="patternCode" type="{urn:gs1:shared:shared_common:xsd:3}PatternCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColourType", propOrder = {
    "colourCode",
    "colourDescription",
    "colourFamilyCode",
    "colourTintCode",
    "patternCode"
})
public class ColourType {

    protected ColourCodeType colourCode;
    protected List<Description80Type> colourDescription;
    protected ColourFamilyCodeType colourFamilyCode;
    protected ColourTintCodeType colourTintCode;
    protected PatternCodeType patternCode;

    /**
     * Gets the value of the colourCode property.
     * 
     * @return
     *     possible object is
     *     {@link ColourCodeType }
     *     
     */
    public ColourCodeType getColourCode() {
        return colourCode;
    }

    /**
     * Sets the value of the colourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColourCodeType }
     *     
     */
    public void setColourCode(ColourCodeType value) {
        this.colourCode = value;
    }

    /**
     * Gets the value of the colourDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colourDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColourDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getColourDescription() {
        if (colourDescription == null) {
            colourDescription = new ArrayList<Description80Type>();
        }
        return this.colourDescription;
    }

    /**
     * Gets the value of the colourFamilyCode property.
     * 
     * @return
     *     possible object is
     *     {@link ColourFamilyCodeType }
     *     
     */
    public ColourFamilyCodeType getColourFamilyCode() {
        return colourFamilyCode;
    }

    /**
     * Sets the value of the colourFamilyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColourFamilyCodeType }
     *     
     */
    public void setColourFamilyCode(ColourFamilyCodeType value) {
        this.colourFamilyCode = value;
    }

    /**
     * Gets the value of the colourTintCode property.
     * 
     * @return
     *     possible object is
     *     {@link ColourTintCodeType }
     *     
     */
    public ColourTintCodeType getColourTintCode() {
        return colourTintCode;
    }

    /**
     * Sets the value of the colourTintCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColourTintCodeType }
     *     
     */
    public void setColourTintCode(ColourTintCodeType value) {
        this.colourTintCode = value;
    }

    /**
     * Gets the value of the patternCode property.
     * 
     * @return
     *     possible object is
     *     {@link PatternCodeType }
     *     
     */
    public PatternCodeType getPatternCode() {
        return patternCode;
    }

    /**
     * Sets the value of the patternCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatternCodeType }
     *     
     */
    public void setPatternCode(PatternCodeType value) {
        this.patternCode = value;
    }

}
