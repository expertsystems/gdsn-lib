
package gs1.gdsn.sales_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.CountryType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for TargetMarketDiscountRestrictionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetMarketDiscountRestrictionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isDiscountingIllegalInTargetMarket" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType"/&gt;
 *         &lt;element name="discountRestrictionTargetMarketCountry" type="{urn:gs1:gdsn:gdsn_common:xsd:3}CountryType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetMarketDiscountRestrictionsType", propOrder = {
    "isDiscountingIllegalInTargetMarket",
    "discountRestrictionTargetMarketCountry"
})
public class TargetMarketDiscountRestrictionsType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isDiscountingIllegalInTargetMarket;
    @XmlElement(required = true)
    protected List<CountryType> discountRestrictionTargetMarketCountry;

    /**
     * Gets the value of the isDiscountingIllegalInTargetMarket property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsDiscountingIllegalInTargetMarket() {
        return isDiscountingIllegalInTargetMarket;
    }

    /**
     * Sets the value of the isDiscountingIllegalInTargetMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsDiscountingIllegalInTargetMarket(NonBinaryLogicEnumerationType value) {
        this.isDiscountingIllegalInTargetMarket = value;
    }

    /**
     * Gets the value of the discountRestrictionTargetMarketCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountRestrictionTargetMarketCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountRestrictionTargetMarketCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryType }
     * 
     * 
     */
    public List<CountryType> getDiscountRestrictionTargetMarketCountry() {
        if (discountRestrictionTargetMarketCountry == null) {
            discountRestrictionTargetMarketCountry = new ArrayList<CountryType>();
        }
        return this.discountRestrictionTargetMarketCountry;
    }

}
