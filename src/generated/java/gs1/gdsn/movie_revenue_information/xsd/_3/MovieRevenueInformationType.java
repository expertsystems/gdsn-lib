
package gs1.gdsn.movie_revenue_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.AmountType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for MovieRevenueInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MovieRevenueInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="boxOfficeRevenueDomestic" type="{urn:gs1:shared:shared_common:xsd:3}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="boxOfficeRevenueFirstWeekDomestic" type="{urn:gs1:shared:shared_common:xsd:3}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="boxOfficeRevenueUS" type="{urn:gs1:shared:shared_common:xsd:3}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="boxOfficeRevenueWorldwideUSDollars" type="{urn:gs1:shared:shared_common:xsd:3}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="isEligibleForRevenueShare" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
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
@XmlType(name = "MovieRevenueInformationType", propOrder = {
    "boxOfficeRevenueDomestic",
    "boxOfficeRevenueFirstWeekDomestic",
    "boxOfficeRevenueUS",
    "boxOfficeRevenueWorldwideUSDollars",
    "isEligibleForRevenueShare",
    "avpList"
})
public class MovieRevenueInformationType {

    protected AmountType boxOfficeRevenueDomestic;
    protected AmountType boxOfficeRevenueFirstWeekDomestic;
    protected AmountType boxOfficeRevenueUS;
    protected AmountType boxOfficeRevenueWorldwideUSDollars;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isEligibleForRevenueShare;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the boxOfficeRevenueDomestic property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBoxOfficeRevenueDomestic() {
        return boxOfficeRevenueDomestic;
    }

    /**
     * Sets the value of the boxOfficeRevenueDomestic property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBoxOfficeRevenueDomestic(AmountType value) {
        this.boxOfficeRevenueDomestic = value;
    }

    /**
     * Gets the value of the boxOfficeRevenueFirstWeekDomestic property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBoxOfficeRevenueFirstWeekDomestic() {
        return boxOfficeRevenueFirstWeekDomestic;
    }

    /**
     * Sets the value of the boxOfficeRevenueFirstWeekDomestic property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBoxOfficeRevenueFirstWeekDomestic(AmountType value) {
        this.boxOfficeRevenueFirstWeekDomestic = value;
    }

    /**
     * Gets the value of the boxOfficeRevenueUS property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBoxOfficeRevenueUS() {
        return boxOfficeRevenueUS;
    }

    /**
     * Sets the value of the boxOfficeRevenueUS property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBoxOfficeRevenueUS(AmountType value) {
        this.boxOfficeRevenueUS = value;
    }

    /**
     * Gets the value of the boxOfficeRevenueWorldwideUSDollars property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBoxOfficeRevenueWorldwideUSDollars() {
        return boxOfficeRevenueWorldwideUSDollars;
    }

    /**
     * Sets the value of the boxOfficeRevenueWorldwideUSDollars property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBoxOfficeRevenueWorldwideUSDollars(AmountType value) {
        this.boxOfficeRevenueWorldwideUSDollars = value;
    }

    /**
     * Gets the value of the isEligibleForRevenueShare property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsEligibleForRevenueShare() {
        return isEligibleForRevenueShare;
    }

    /**
     * Sets the value of the isEligibleForRevenueShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsEligibleForRevenueShare(NonBinaryLogicEnumerationType value) {
        this.isEligibleForRevenueShare = value;
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
