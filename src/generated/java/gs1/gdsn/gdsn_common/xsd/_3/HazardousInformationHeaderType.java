
package gs1.gdsn.gdsn_common.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description1000Type;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for HazardousInformationHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HazardousInformationHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aDRDangerousGoodsLimitedQuantitiesCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="aDRDangerousGoodsPackagingTypeCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="aDRTunnelRestrictionCode" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dangerousGoodsRegulationAgency" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dangerousGoodsRegulationCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="flashPointTemperature" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hazardousMaterialAdditionalInformation" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dangerousGoodsLimitedQuantitiesCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dangerousGoodsPackagingTypeCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hazardousInformationDetail" type="{urn:gs1:gdsn:gdsn_common:xsd:3}HazardousInformationDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "HazardousInformationHeaderType", propOrder = {
    "adrDangerousGoodsLimitedQuantitiesCode",
    "adrDangerousGoodsPackagingTypeCode",
    "adrTunnelRestrictionCode",
    "dangerousGoodsRegulationAgency",
    "dangerousGoodsRegulationCode",
    "flashPointTemperature",
    "hazardousMaterialAdditionalInformation",
    "dangerousGoodsLimitedQuantitiesCode",
    "dangerousGoodsPackagingTypeCode",
    "hazardousInformationDetail",
    "avpList"
})
public class HazardousInformationHeaderType {

    @XmlElement(name = "aDRDangerousGoodsLimitedQuantitiesCode")
    protected String adrDangerousGoodsLimitedQuantitiesCode;
    @XmlElement(name = "aDRDangerousGoodsPackagingTypeCode")
    protected String adrDangerousGoodsPackagingTypeCode;
    @XmlElement(name = "aDRTunnelRestrictionCode")
    protected List<String> adrTunnelRestrictionCode;
    protected String dangerousGoodsRegulationAgency;
    protected String dangerousGoodsRegulationCode;
    protected List<MeasurementType> flashPointTemperature;
    protected List<Description1000Type> hazardousMaterialAdditionalInformation;
    protected String dangerousGoodsLimitedQuantitiesCode;
    protected String dangerousGoodsPackagingTypeCode;
    protected List<HazardousInformationDetailType> hazardousInformationDetail;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the adrDangerousGoodsLimitedQuantitiesCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADRDangerousGoodsLimitedQuantitiesCode() {
        return adrDangerousGoodsLimitedQuantitiesCode;
    }

    /**
     * Sets the value of the adrDangerousGoodsLimitedQuantitiesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADRDangerousGoodsLimitedQuantitiesCode(String value) {
        this.adrDangerousGoodsLimitedQuantitiesCode = value;
    }

    /**
     * Gets the value of the adrDangerousGoodsPackagingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADRDangerousGoodsPackagingTypeCode() {
        return adrDangerousGoodsPackagingTypeCode;
    }

    /**
     * Sets the value of the adrDangerousGoodsPackagingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADRDangerousGoodsPackagingTypeCode(String value) {
        this.adrDangerousGoodsPackagingTypeCode = value;
    }

    /**
     * Gets the value of the adrTunnelRestrictionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adrTunnelRestrictionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getADRTunnelRestrictionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getADRTunnelRestrictionCode() {
        if (adrTunnelRestrictionCode == null) {
            adrTunnelRestrictionCode = new ArrayList<String>();
        }
        return this.adrTunnelRestrictionCode;
    }

    /**
     * Gets the value of the dangerousGoodsRegulationAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDangerousGoodsRegulationAgency() {
        return dangerousGoodsRegulationAgency;
    }

    /**
     * Sets the value of the dangerousGoodsRegulationAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDangerousGoodsRegulationAgency(String value) {
        this.dangerousGoodsRegulationAgency = value;
    }

    /**
     * Gets the value of the dangerousGoodsRegulationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDangerousGoodsRegulationCode() {
        return dangerousGoodsRegulationCode;
    }

    /**
     * Sets the value of the dangerousGoodsRegulationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDangerousGoodsRegulationCode(String value) {
        this.dangerousGoodsRegulationCode = value;
    }

    /**
     * Gets the value of the flashPointTemperature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flashPointTemperature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlashPointTemperature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getFlashPointTemperature() {
        if (flashPointTemperature == null) {
            flashPointTemperature = new ArrayList<MeasurementType>();
        }
        return this.flashPointTemperature;
    }

    /**
     * Gets the value of the hazardousMaterialAdditionalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousMaterialAdditionalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousMaterialAdditionalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getHazardousMaterialAdditionalInformation() {
        if (hazardousMaterialAdditionalInformation == null) {
            hazardousMaterialAdditionalInformation = new ArrayList<Description1000Type>();
        }
        return this.hazardousMaterialAdditionalInformation;
    }

    /**
     * Gets the value of the dangerousGoodsLimitedQuantitiesCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDangerousGoodsLimitedQuantitiesCode() {
        return dangerousGoodsLimitedQuantitiesCode;
    }

    /**
     * Sets the value of the dangerousGoodsLimitedQuantitiesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDangerousGoodsLimitedQuantitiesCode(String value) {
        this.dangerousGoodsLimitedQuantitiesCode = value;
    }

    /**
     * Gets the value of the dangerousGoodsPackagingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDangerousGoodsPackagingTypeCode() {
        return dangerousGoodsPackagingTypeCode;
    }

    /**
     * Sets the value of the dangerousGoodsPackagingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDangerousGoodsPackagingTypeCode(String value) {
        this.dangerousGoodsPackagingTypeCode = value;
    }

    /**
     * Gets the value of the hazardousInformationDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousInformationDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousInformationDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousInformationDetailType }
     * 
     * 
     */
    public List<HazardousInformationDetailType> getHazardousInformationDetail() {
        if (hazardousInformationDetail == null) {
            hazardousInformationDetail = new ArrayList<HazardousInformationDetailType>();
        }
        return this.hazardousInformationDetail;
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
