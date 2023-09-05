
package gs1.gdsn.transportation_hazardous_classification.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportationHazardousClassificationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportationHazardousClassificationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transportationClassification" type="{urn:gs1:gdsn:transportation_hazardous_classification:xsd:3}TransportationClassificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportationHazardousClassificationModuleType", propOrder = {
    "transportationClassification"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:transportation_hazardous_classification:xsd:3")
public class TransportationHazardousClassificationModuleType {

    protected List<TransportationClassificationType> transportationClassification;

    /**
     * Gets the value of the transportationClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportationClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportationClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportationClassificationType }
     * 
     * 
     */
    public List<TransportationClassificationType> getTransportationClassification() {
        if (transportationClassification == null) {
            transportationClassification = new ArrayList<TransportationClassificationType>();
        }
        return this.transportationClassification;
    }

}
