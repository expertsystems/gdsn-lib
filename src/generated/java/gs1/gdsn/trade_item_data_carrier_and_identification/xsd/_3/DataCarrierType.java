
package gs1.gdsn.trade_item_data_carrier_and_identification.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;


/**
 * <p>Java class for DataCarrierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataCarrierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicationIdentifierTypeCode" type="{urn:gs1:gdsn:trade_item_data_carrier_and_identification:xsd:3}ApplicationIdentifierTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dataCarrierFamilyTypeCode" type="{urn:gs1:gdsn:trade_item_data_carrier_and_identification:xsd:3}DataCarrierFamilyTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="dataCarrierPresenceCode" type="{urn:gs1:gdsn:trade_item_data_carrier_and_identification:xsd:3}DataCarrierPresenceCodeType" minOccurs="0"/&gt;
 *         &lt;element name="dataCarrierTypeCode" type="{urn:gs1:gdsn:trade_item_data_carrier_and_identification:xsd:3}DataCarrierTypeCodeType" minOccurs="0"/&gt;
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
@XmlType(name = "DataCarrierType", propOrder = {
    "applicationIdentifierTypeCode",
    "dataCarrierFamilyTypeCode",
    "dataCarrierPresenceCode",
    "dataCarrierTypeCode",
    "avpList"
})
public class DataCarrierType {

    protected List<ApplicationIdentifierTypeCodeType> applicationIdentifierTypeCode;
    protected DataCarrierFamilyTypeCodeType dataCarrierFamilyTypeCode;
    protected DataCarrierPresenceCodeType dataCarrierPresenceCode;
    protected DataCarrierTypeCodeType dataCarrierTypeCode;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the applicationIdentifierTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationIdentifierTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationIdentifierTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationIdentifierTypeCodeType }
     * 
     * 
     */
    public List<ApplicationIdentifierTypeCodeType> getApplicationIdentifierTypeCode() {
        if (applicationIdentifierTypeCode == null) {
            applicationIdentifierTypeCode = new ArrayList<ApplicationIdentifierTypeCodeType>();
        }
        return this.applicationIdentifierTypeCode;
    }

    /**
     * Gets the value of the dataCarrierFamilyTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DataCarrierFamilyTypeCodeType }
     *     
     */
    public DataCarrierFamilyTypeCodeType getDataCarrierFamilyTypeCode() {
        return dataCarrierFamilyTypeCode;
    }

    /**
     * Sets the value of the dataCarrierFamilyTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataCarrierFamilyTypeCodeType }
     *     
     */
    public void setDataCarrierFamilyTypeCode(DataCarrierFamilyTypeCodeType value) {
        this.dataCarrierFamilyTypeCode = value;
    }

    /**
     * Gets the value of the dataCarrierPresenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link DataCarrierPresenceCodeType }
     *     
     */
    public DataCarrierPresenceCodeType getDataCarrierPresenceCode() {
        return dataCarrierPresenceCode;
    }

    /**
     * Sets the value of the dataCarrierPresenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataCarrierPresenceCodeType }
     *     
     */
    public void setDataCarrierPresenceCode(DataCarrierPresenceCodeType value) {
        this.dataCarrierPresenceCode = value;
    }

    /**
     * Gets the value of the dataCarrierTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DataCarrierTypeCodeType }
     *     
     */
    public DataCarrierTypeCodeType getDataCarrierTypeCode() {
        return dataCarrierTypeCode;
    }

    /**
     * Sets the value of the dataCarrierTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataCarrierTypeCodeType }
     *     
     */
    public void setDataCarrierTypeCode(DataCarrierTypeCodeType value) {
        this.dataCarrierTypeCode = value;
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
