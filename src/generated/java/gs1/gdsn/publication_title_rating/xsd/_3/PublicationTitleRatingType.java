
package gs1.gdsn.publication_title_rating.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.shared.shared_common.xsd._3.CodeType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for PublicationTitleRatingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicationTitleRatingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasParentalAdvisorySticker" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="ratingContentDescriptorCode" type="{urn:gs1:gdsn:publication_title_rating:xsd:3}RatingContentDescriptorCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="titleRatingCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" minOccurs="0"/&gt;
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
@XmlType(name = "PublicationTitleRatingType", propOrder = {
    "hasParentalAdvisorySticker",
    "ratingContentDescriptorCode",
    "titleRatingCodeReference",
    "avpList"
})
public class PublicationTitleRatingType {

    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType hasParentalAdvisorySticker;
    protected List<RatingContentDescriptorCodeType> ratingContentDescriptorCode;
    protected CodeType titleRatingCodeReference;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the hasParentalAdvisorySticker property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getHasParentalAdvisorySticker() {
        return hasParentalAdvisorySticker;
    }

    /**
     * Sets the value of the hasParentalAdvisorySticker property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setHasParentalAdvisorySticker(NonBinaryLogicEnumerationType value) {
        this.hasParentalAdvisorySticker = value;
    }

    /**
     * Gets the value of the ratingContentDescriptorCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingContentDescriptorCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingContentDescriptorCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatingContentDescriptorCodeType }
     * 
     * 
     */
    public List<RatingContentDescriptorCodeType> getRatingContentDescriptorCode() {
        if (ratingContentDescriptorCode == null) {
            ratingContentDescriptorCode = new ArrayList<RatingContentDescriptorCodeType>();
        }
        return this.ratingContentDescriptorCode;
    }

    /**
     * Gets the value of the titleRatingCodeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTitleRatingCodeReference() {
        return titleRatingCodeReference;
    }

    /**
     * Sets the value of the titleRatingCodeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTitleRatingCodeReference(CodeType value) {
        this.titleRatingCodeReference = value;
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
