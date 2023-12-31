
package gs1.gdsn.transportation_hazardous_classification.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportationClassificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportationClassificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="marinePollutantTechnicalName" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="reportableQuantityTechnicalName" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="transportationModeRegulatoryAgency" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="regulatedTransportationMode" type="{urn:gs1:gdsn:transportation_hazardous_classification:xsd:3}RegulatedTransportationModeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportationClassificationType", propOrder = {
    "marinePollutantTechnicalName",
    "reportableQuantityTechnicalName",
    "transportationModeRegulatoryAgency",
    "regulatedTransportationMode"
})
public class TransportationClassificationType {

    protected List<String> marinePollutantTechnicalName;
    protected List<String> reportableQuantityTechnicalName;
    protected List<String> transportationModeRegulatoryAgency;
    protected List<RegulatedTransportationModeType> regulatedTransportationMode;

    /**
     * Gets the value of the marinePollutantTechnicalName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marinePollutantTechnicalName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarinePollutantTechnicalName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMarinePollutantTechnicalName() {
        if (marinePollutantTechnicalName == null) {
            marinePollutantTechnicalName = new ArrayList<String>();
        }
        return this.marinePollutantTechnicalName;
    }

    /**
     * Gets the value of the reportableQuantityTechnicalName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportableQuantityTechnicalName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportableQuantityTechnicalName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReportableQuantityTechnicalName() {
        if (reportableQuantityTechnicalName == null) {
            reportableQuantityTechnicalName = new ArrayList<String>();
        }
        return this.reportableQuantityTechnicalName;
    }

    /**
     * Gets the value of the transportationModeRegulatoryAgency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportationModeRegulatoryAgency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportationModeRegulatoryAgency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTransportationModeRegulatoryAgency() {
        if (transportationModeRegulatoryAgency == null) {
            transportationModeRegulatoryAgency = new ArrayList<String>();
        }
        return this.transportationModeRegulatoryAgency;
    }

    /**
     * Gets the value of the regulatedTransportationMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regulatedTransportationMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegulatedTransportationMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegulatedTransportationModeType }
     * 
     * 
     */
    public List<RegulatedTransportationModeType> getRegulatedTransportationMode() {
        if (regulatedTransportationMode == null) {
            regulatedTransportationMode = new ArrayList<RegulatedTransportationModeType>();
        }
        return this.regulatedTransportationMode;
    }

}
