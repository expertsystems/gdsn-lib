
package gs1.gdsn.product_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HouseholdOfficeFurnishingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HouseholdOfficeFurnishingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pillowShapeCode" type="{urn:gs1:gdsn:product_information:xsd:3}PillowShapeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rugTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}RugTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tablewareTypeCode" type="{urn:gs1:gdsn:product_information:xsd:3}TablewareTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseholdOfficeFurnishingType", propOrder = {
    "pillowShapeCode",
    "rugTypeCode",
    "tablewareTypeCode"
})
public class HouseholdOfficeFurnishingType {

    protected List<PillowShapeCodeType> pillowShapeCode;
    protected List<RugTypeCodeType> rugTypeCode;
    protected List<TablewareTypeCodeType> tablewareTypeCode;

    /**
     * Gets the value of the pillowShapeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pillowShapeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPillowShapeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PillowShapeCodeType }
     * 
     * 
     */
    public List<PillowShapeCodeType> getPillowShapeCode() {
        if (pillowShapeCode == null) {
            pillowShapeCode = new ArrayList<PillowShapeCodeType>();
        }
        return this.pillowShapeCode;
    }

    /**
     * Gets the value of the rugTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rugTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRugTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RugTypeCodeType }
     * 
     * 
     */
    public List<RugTypeCodeType> getRugTypeCode() {
        if (rugTypeCode == null) {
            rugTypeCode = new ArrayList<RugTypeCodeType>();
        }
        return this.rugTypeCode;
    }

    /**
     * Gets the value of the tablewareTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tablewareTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTablewareTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TablewareTypeCodeType }
     * 
     * 
     */
    public List<TablewareTypeCodeType> getTablewareTypeCode() {
        if (tablewareTypeCode == null) {
            tablewareTypeCode = new ArrayList<TablewareTypeCodeType>();
        }
        return this.tablewareTypeCode;
    }

}
