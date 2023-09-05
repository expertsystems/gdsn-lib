
package gs1.gdsn.plumbing_hvac_pipe_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.IdentifierType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for PlumbingHVACPipeInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlumbingHVACPipeInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bendAngleCode" type="{urn:gs1:gdsn:plumbing_hvac_pipe_information:xsd:3}BendAngleCodeType" minOccurs="0"/&gt;
 *         &lt;element name="nominalInsideDiameter" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="nominalOutsideDiameter" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="pipeScheduleIdentification" type="{urn:gs1:shared:shared_common:xsd:3}IdentifierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="plumbingControlTypeCode" type="{urn:gs1:gdsn:plumbing_hvac_pipe_information:xsd:3}PlumbingControlTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="plumbingHVACConnectionAgencyCode" type="{urn:gs1:gdsn:plumbing_hvac_pipe_information:xsd:3}PlumbingHVACConnectionAgencyCodeType" minOccurs="0"/&gt;
 *         &lt;element name="plumbingHVACConnectionCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="plumbingHVACConnectionTypeCode" type="{urn:gs1:gdsn:plumbing_hvac_pipe_information:xsd:3}PlumbingHVACConnectionTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="threadTypeCode" type="{urn:gs1:gdsn:plumbing_hvac_pipe_information:xsd:3}ThreadTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemMeshInformation" type="{urn:gs1:gdsn:plumbing_hvac_pipe_information:xsd:3}TradeItemMeshInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemWorkingPressure" type="{urn:gs1:gdsn:plumbing_hvac_pipe_information:xsd:3}TradeItemWorkingPressureType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="avpList" type="{urn:gs1:gdsn:gdsn_common:xsd:3}GS1_AttributeValuePairListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlumbingHVACPipeInformationType", propOrder = {
    "bendAngleCode",
    "nominalInsideDiameter",
    "nominalOutsideDiameter",
    "pipeScheduleIdentification",
    "plumbingControlTypeCode",
    "plumbingHVACConnectionAgencyCode",
    "plumbingHVACConnectionCode",
    "plumbingHVACConnectionTypeCode",
    "threadTypeCode",
    "tradeItemMeshInformation",
    "tradeItemWorkingPressure",
    "avpList"
})
public class PlumbingHVACPipeInformationType {

    protected BendAngleCodeType bendAngleCode;
    protected MeasurementType nominalInsideDiameter;
    protected MeasurementType nominalOutsideDiameter;
    protected List<IdentifierType> pipeScheduleIdentification;
    protected List<PlumbingControlTypeCodeType> plumbingControlTypeCode;
    protected PlumbingHVACConnectionAgencyCodeType plumbingHVACConnectionAgencyCode;
    protected String plumbingHVACConnectionCode;
    protected PlumbingHVACConnectionTypeCodeType plumbingHVACConnectionTypeCode;
    protected ThreadTypeCodeType threadTypeCode;
    protected List<TradeItemMeshInformationType> tradeItemMeshInformation;
    protected List<TradeItemWorkingPressureType> tradeItemWorkingPressure;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the bendAngleCode property.
     * 
     * @return
     *     possible object is
     *     {@link BendAngleCodeType }
     *     
     */
    public BendAngleCodeType getBendAngleCode() {
        return bendAngleCode;
    }

    /**
     * Sets the value of the bendAngleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BendAngleCodeType }
     *     
     */
    public void setBendAngleCode(BendAngleCodeType value) {
        this.bendAngleCode = value;
    }

    /**
     * Gets the value of the nominalInsideDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getNominalInsideDiameter() {
        return nominalInsideDiameter;
    }

    /**
     * Sets the value of the nominalInsideDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setNominalInsideDiameter(MeasurementType value) {
        this.nominalInsideDiameter = value;
    }

    /**
     * Gets the value of the nominalOutsideDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getNominalOutsideDiameter() {
        return nominalOutsideDiameter;
    }

    /**
     * Sets the value of the nominalOutsideDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setNominalOutsideDiameter(MeasurementType value) {
        this.nominalOutsideDiameter = value;
    }

    /**
     * Gets the value of the pipeScheduleIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pipeScheduleIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPipeScheduleIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getPipeScheduleIdentification() {
        if (pipeScheduleIdentification == null) {
            pipeScheduleIdentification = new ArrayList<IdentifierType>();
        }
        return this.pipeScheduleIdentification;
    }

    /**
     * Gets the value of the plumbingControlTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plumbingControlTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlumbingControlTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlumbingControlTypeCodeType }
     * 
     * 
     */
    public List<PlumbingControlTypeCodeType> getPlumbingControlTypeCode() {
        if (plumbingControlTypeCode == null) {
            plumbingControlTypeCode = new ArrayList<PlumbingControlTypeCodeType>();
        }
        return this.plumbingControlTypeCode;
    }

    /**
     * Gets the value of the plumbingHVACConnectionAgencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link PlumbingHVACConnectionAgencyCodeType }
     *     
     */
    public PlumbingHVACConnectionAgencyCodeType getPlumbingHVACConnectionAgencyCode() {
        return plumbingHVACConnectionAgencyCode;
    }

    /**
     * Sets the value of the plumbingHVACConnectionAgencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlumbingHVACConnectionAgencyCodeType }
     *     
     */
    public void setPlumbingHVACConnectionAgencyCode(PlumbingHVACConnectionAgencyCodeType value) {
        this.plumbingHVACConnectionAgencyCode = value;
    }

    /**
     * Gets the value of the plumbingHVACConnectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlumbingHVACConnectionCode() {
        return plumbingHVACConnectionCode;
    }

    /**
     * Sets the value of the plumbingHVACConnectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlumbingHVACConnectionCode(String value) {
        this.plumbingHVACConnectionCode = value;
    }

    /**
     * Gets the value of the plumbingHVACConnectionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PlumbingHVACConnectionTypeCodeType }
     *     
     */
    public PlumbingHVACConnectionTypeCodeType getPlumbingHVACConnectionTypeCode() {
        return plumbingHVACConnectionTypeCode;
    }

    /**
     * Sets the value of the plumbingHVACConnectionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlumbingHVACConnectionTypeCodeType }
     *     
     */
    public void setPlumbingHVACConnectionTypeCode(PlumbingHVACConnectionTypeCodeType value) {
        this.plumbingHVACConnectionTypeCode = value;
    }

    /**
     * Gets the value of the threadTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ThreadTypeCodeType }
     *     
     */
    public ThreadTypeCodeType getThreadTypeCode() {
        return threadTypeCode;
    }

    /**
     * Sets the value of the threadTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreadTypeCodeType }
     *     
     */
    public void setThreadTypeCode(ThreadTypeCodeType value) {
        this.threadTypeCode = value;
    }

    /**
     * Gets the value of the tradeItemMeshInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemMeshInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemMeshInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeItemMeshInformationType }
     * 
     * 
     */
    public List<TradeItemMeshInformationType> getTradeItemMeshInformation() {
        if (tradeItemMeshInformation == null) {
            tradeItemMeshInformation = new ArrayList<TradeItemMeshInformationType>();
        }
        return this.tradeItemMeshInformation;
    }

    /**
     * Gets the value of the tradeItemWorkingPressure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemWorkingPressure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemWorkingPressure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeItemWorkingPressureType }
     * 
     * 
     */
    public List<TradeItemWorkingPressureType> getTradeItemWorkingPressure() {
        if (tradeItemWorkingPressure == null) {
            tradeItemWorkingPressure = new ArrayList<TradeItemWorkingPressureType>();
        }
        return this.tradeItemWorkingPressure;
    }

    /**
     * Gets the value of the avpList property.
     * 
     * @return
     *     possible object is
     *     {@link GS1AttributeValuePairListType }
     *     
     */
    public GS1AttributeValuePairListType getAvpList() {
        return avpList;
    }

    /**
     * Sets the value of the avpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GS1AttributeValuePairListType }
     *     
     */
    public void setAvpList(GS1AttributeValuePairListType value) {
        this.avpList = value;
    }

}
