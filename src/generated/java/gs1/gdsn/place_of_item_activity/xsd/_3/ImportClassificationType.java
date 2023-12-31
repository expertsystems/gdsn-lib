
package gs1.gdsn.place_of_item_activity.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.CountrySubdivisionCodeType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for ImportClassificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportClassificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="importClassificationCountrySubdivisionRegionOfOrigin" type="{urn:gs1:shared:shared_common:xsd:3}CountrySubdivisionCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="importClassificationTypeCode" type="{urn:gs1:gdsn:place_of_item_activity:xsd:3}ImportClassificationTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="importClassificationValue" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="statisticalReportingMeasurement" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportClassificationType", propOrder = {
    "importClassificationCountrySubdivisionRegionOfOrigin",
    "importClassificationTypeCode",
    "importClassificationValue",
    "statisticalReportingMeasurement"
})
public class ImportClassificationType {

    protected List<CountrySubdivisionCodeType> importClassificationCountrySubdivisionRegionOfOrigin;
    protected ImportClassificationTypeCodeType importClassificationTypeCode;
    protected String importClassificationValue;
    protected MeasurementType statisticalReportingMeasurement;

    /**
     * Gets the value of the importClassificationCountrySubdivisionRegionOfOrigin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importClassificationCountrySubdivisionRegionOfOrigin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportClassificationCountrySubdivisionRegionOfOrigin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountrySubdivisionCodeType }
     * 
     * 
     */
    public List<CountrySubdivisionCodeType> getImportClassificationCountrySubdivisionRegionOfOrigin() {
        if (importClassificationCountrySubdivisionRegionOfOrigin == null) {
            importClassificationCountrySubdivisionRegionOfOrigin = new ArrayList<CountrySubdivisionCodeType>();
        }
        return this.importClassificationCountrySubdivisionRegionOfOrigin;
    }

    /**
     * Gets the value of the importClassificationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ImportClassificationTypeCodeType }
     *     
     */
    public ImportClassificationTypeCodeType getImportClassificationTypeCode() {
        return importClassificationTypeCode;
    }

    /**
     * Sets the value of the importClassificationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportClassificationTypeCodeType }
     *     
     */
    public void setImportClassificationTypeCode(ImportClassificationTypeCodeType value) {
        this.importClassificationTypeCode = value;
    }

    /**
     * Gets the value of the importClassificationValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportClassificationValue() {
        return importClassificationValue;
    }

    /**
     * Sets the value of the importClassificationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportClassificationValue(String value) {
        this.importClassificationValue = value;
    }

    /**
     * Gets the value of the statisticalReportingMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getStatisticalReportingMeasurement() {
        return statisticalReportingMeasurement;
    }

    /**
     * Sets the value of the statisticalReportingMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setStatisticalReportingMeasurement(MeasurementType value) {
        this.statisticalReportingMeasurement = value;
    }

}
