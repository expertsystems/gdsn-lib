
package gs1.gdsn.plumbing_hvac_pipe_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for TradeItemWorkingPressureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemWorkingPressureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="workingPressureRatingClassCode" type="{urn:gs1:gdsn:plumbing_hvac_pipe_information:xsd:3}WorkingPressureRatingClassCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="workingPressureRatingMaximum" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="workingPressureRatingMinimum" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemWorkingPressureType", propOrder = {
    "workingPressureRatingClassCode",
    "workingPressureRatingMaximum",
    "workingPressureRatingMinimum"
})
public class TradeItemWorkingPressureType {

    protected List<WorkingPressureRatingClassCodeType> workingPressureRatingClassCode;
    protected List<MeasurementType> workingPressureRatingMaximum;
    protected List<MeasurementType> workingPressureRatingMinimum;

    /**
     * Gets the value of the workingPressureRatingClassCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workingPressureRatingClassCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkingPressureRatingClassCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkingPressureRatingClassCodeType }
     * 
     * 
     */
    public List<WorkingPressureRatingClassCodeType> getWorkingPressureRatingClassCode() {
        if (workingPressureRatingClassCode == null) {
            workingPressureRatingClassCode = new ArrayList<WorkingPressureRatingClassCodeType>();
        }
        return this.workingPressureRatingClassCode;
    }

    /**
     * Gets the value of the workingPressureRatingMaximum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workingPressureRatingMaximum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkingPressureRatingMaximum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getWorkingPressureRatingMaximum() {
        if (workingPressureRatingMaximum == null) {
            workingPressureRatingMaximum = new ArrayList<MeasurementType>();
        }
        return this.workingPressureRatingMaximum;
    }

    /**
     * Gets the value of the workingPressureRatingMinimum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workingPressureRatingMinimum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkingPressureRatingMinimum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getWorkingPressureRatingMinimum() {
        if (workingPressureRatingMinimum == null) {
            workingPressureRatingMinimum = new ArrayList<MeasurementType>();
        }
        return this.workingPressureRatingMinimum;
    }

}
