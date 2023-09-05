
package gs1.gdsn.trade_item_licensing.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.CountryType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;


/**
 * <p>Java class for TradeItemLicenseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemLicenseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeItemLicenseOwnerGLN" type="{urn:gs1:shared:shared_common:xsd:3}GLNType" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemLicenseOwnerName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tradeItemLicenseRegion" type="{urn:gs1:gdsn:gdsn_common:xsd:3}CountryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemLicenseEffectiveDateInformation" type="{urn:gs1:gdsn:trade_item_licensing:xsd:3}TradeItemLicenseEffectiveDateInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemLicenseDetail" type="{urn:gs1:gdsn:trade_item_licensing:xsd:3}TradeItemLicenseDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TradeItemLicenseType", propOrder = {
    "tradeItemLicenseOwnerGLN",
    "tradeItemLicenseOwnerName",
    "tradeItemLicenseRegion",
    "tradeItemLicenseEffectiveDateInformation",
    "tradeItemLicenseDetail",
    "avpList"
})
public class TradeItemLicenseType {

    protected String tradeItemLicenseOwnerGLN;
    protected String tradeItemLicenseOwnerName;
    protected List<CountryType> tradeItemLicenseRegion;
    protected List<TradeItemLicenseEffectiveDateInformationType> tradeItemLicenseEffectiveDateInformation;
    protected List<TradeItemLicenseDetailType> tradeItemLicenseDetail;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the tradeItemLicenseOwnerGLN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeItemLicenseOwnerGLN() {
        return tradeItemLicenseOwnerGLN;
    }

    /**
     * Sets the value of the tradeItemLicenseOwnerGLN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeItemLicenseOwnerGLN(String value) {
        this.tradeItemLicenseOwnerGLN = value;
    }

    /**
     * Gets the value of the tradeItemLicenseOwnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeItemLicenseOwnerName() {
        return tradeItemLicenseOwnerName;
    }

    /**
     * Sets the value of the tradeItemLicenseOwnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeItemLicenseOwnerName(String value) {
        this.tradeItemLicenseOwnerName = value;
    }

    /**
     * Gets the value of the tradeItemLicenseRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemLicenseRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemLicenseRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryType }
     * 
     * 
     */
    public List<CountryType> getTradeItemLicenseRegion() {
        if (tradeItemLicenseRegion == null) {
            tradeItemLicenseRegion = new ArrayList<CountryType>();
        }
        return this.tradeItemLicenseRegion;
    }

    /**
     * Gets the value of the tradeItemLicenseEffectiveDateInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemLicenseEffectiveDateInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemLicenseEffectiveDateInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeItemLicenseEffectiveDateInformationType }
     * 
     * 
     */
    public List<TradeItemLicenseEffectiveDateInformationType> getTradeItemLicenseEffectiveDateInformation() {
        if (tradeItemLicenseEffectiveDateInformation == null) {
            tradeItemLicenseEffectiveDateInformation = new ArrayList<TradeItemLicenseEffectiveDateInformationType>();
        }
        return this.tradeItemLicenseEffectiveDateInformation;
    }

    /**
     * Gets the value of the tradeItemLicenseDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemLicenseDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemLicenseDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeItemLicenseDetailType }
     * 
     * 
     */
    public List<TradeItemLicenseDetailType> getTradeItemLicenseDetail() {
        if (tradeItemLicenseDetail == null) {
            tradeItemLicenseDetail = new ArrayList<TradeItemLicenseDetailType>();
        }
        return this.tradeItemLicenseDetail;
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
