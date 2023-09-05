
package gs1.gdsn.safety_data_sheet.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.gdsn.gdsn_common.xsd._3.MeasurementPrecisionCodeType;
import gs1.shared.shared_common.xsd._3.Description200Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for LethalDoseConcentrationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LethalDoseConcentrationInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lethalConcentration50" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="lethalConcentration50Basis" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="lethalDose50" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="lethalDose50Basis" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="routeOfExposureCode" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}RouteOfExposureCodeType" minOccurs="0"/&gt;
 *         &lt;element name="testSpeciesCode" type="{urn:gs1:gdsn:safety_data_sheet:xsd:3}TestSpeciesCodeType" minOccurs="0"/&gt;
 *         &lt;element name="testSpeciesDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lethalConcentration50MeasurementPrecision" type="{urn:gs1:gdsn:gdsn_common:xsd:3}MeasurementPrecisionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="lethalDose50MeasurementPrecision" type="{urn:gs1:gdsn:gdsn_common:xsd:3}MeasurementPrecisionCodeType" minOccurs="0"/&gt;
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
@XmlType(name = "LethalDoseConcentrationInformationType", propOrder = {
    "lethalConcentration50",
    "lethalConcentration50Basis",
    "lethalDose50",
    "lethalDose50Basis",
    "routeOfExposureCode",
    "testSpeciesCode",
    "testSpeciesDescription",
    "lethalConcentration50MeasurementPrecision",
    "lethalDose50MeasurementPrecision",
    "avpList"
})
public class LethalDoseConcentrationInformationType {

    protected MeasurementType lethalConcentration50;
    protected MeasurementType lethalConcentration50Basis;
    protected MeasurementType lethalDose50;
    protected MeasurementType lethalDose50Basis;
    protected RouteOfExposureCodeType routeOfExposureCode;
    protected TestSpeciesCodeType testSpeciesCode;
    protected List<Description200Type> testSpeciesDescription;
    protected MeasurementPrecisionCodeType lethalConcentration50MeasurementPrecision;
    protected MeasurementPrecisionCodeType lethalDose50MeasurementPrecision;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the lethalConcentration50 property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getLethalConcentration50() {
        return lethalConcentration50;
    }

    /**
     * Sets the value of the lethalConcentration50 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setLethalConcentration50(MeasurementType value) {
        this.lethalConcentration50 = value;
    }

    /**
     * Gets the value of the lethalConcentration50Basis property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getLethalConcentration50Basis() {
        return lethalConcentration50Basis;
    }

    /**
     * Sets the value of the lethalConcentration50Basis property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setLethalConcentration50Basis(MeasurementType value) {
        this.lethalConcentration50Basis = value;
    }

    /**
     * Gets the value of the lethalDose50 property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getLethalDose50() {
        return lethalDose50;
    }

    /**
     * Sets the value of the lethalDose50 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setLethalDose50(MeasurementType value) {
        this.lethalDose50 = value;
    }

    /**
     * Gets the value of the lethalDose50Basis property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getLethalDose50Basis() {
        return lethalDose50Basis;
    }

    /**
     * Sets the value of the lethalDose50Basis property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setLethalDose50Basis(MeasurementType value) {
        this.lethalDose50Basis = value;
    }

    /**
     * Gets the value of the routeOfExposureCode property.
     * 
     * @return
     *     possible object is
     *     {@link RouteOfExposureCodeType }
     *     
     */
    public RouteOfExposureCodeType getRouteOfExposureCode() {
        return routeOfExposureCode;
    }

    /**
     * Sets the value of the routeOfExposureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteOfExposureCodeType }
     *     
     */
    public void setRouteOfExposureCode(RouteOfExposureCodeType value) {
        this.routeOfExposureCode = value;
    }

    /**
     * Gets the value of the testSpeciesCode property.
     * 
     * @return
     *     possible object is
     *     {@link TestSpeciesCodeType }
     *     
     */
    public TestSpeciesCodeType getTestSpeciesCode() {
        return testSpeciesCode;
    }

    /**
     * Sets the value of the testSpeciesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestSpeciesCodeType }
     *     
     */
    public void setTestSpeciesCode(TestSpeciesCodeType value) {
        this.testSpeciesCode = value;
    }

    /**
     * Gets the value of the testSpeciesDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testSpeciesDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestSpeciesDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description200Type }
     * 
     * 
     */
    public List<Description200Type> getTestSpeciesDescription() {
        if (testSpeciesDescription == null) {
            testSpeciesDescription = new ArrayList<Description200Type>();
        }
        return this.testSpeciesDescription;
    }

    /**
     * Gets the value of the lethalConcentration50MeasurementPrecision property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public MeasurementPrecisionCodeType getLethalConcentration50MeasurementPrecision() {
        return lethalConcentration50MeasurementPrecision;
    }

    /**
     * Sets the value of the lethalConcentration50MeasurementPrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public void setLethalConcentration50MeasurementPrecision(MeasurementPrecisionCodeType value) {
        this.lethalConcentration50MeasurementPrecision = value;
    }

    /**
     * Gets the value of the lethalDose50MeasurementPrecision property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public MeasurementPrecisionCodeType getLethalDose50MeasurementPrecision() {
        return lethalDose50MeasurementPrecision;
    }

    /**
     * Sets the value of the lethalDose50MeasurementPrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementPrecisionCodeType }
     *     
     */
    public void setLethalDose50MeasurementPrecision(MeasurementPrecisionCodeType value) {
        this.lethalDose50MeasurementPrecision = value;
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
