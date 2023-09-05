
package gs1.gdsn.packaging_information.xsd._3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import gs1.shared.shared_common.xsd._3.AmountType;
import gs1.shared.shared_common.xsd._3.IdentifierType;
import gs1.shared.shared_common.xsd._3.TargetMarketType;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for PackageDepositType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageDepositType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="depositValueEffectiveDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="depositValueEndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="returnablePackageDepositAmount" type="{urn:gs1:shared:shared_common:xsd:3}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="returnablePackageDepositIdentification" type="{urn:gs1:shared:shared_common:xsd:3}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="packagingRefundObligationName" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="returnablePackageDepositRegion" type="{urn:gs1:shared:shared_common:xsd:3}TargetMarketType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageDepositType", propOrder = {
    "depositValueEffectiveDateTime",
    "depositValueEndDateTime",
    "returnablePackageDepositAmount",
    "returnablePackageDepositIdentification",
    "packagingRefundObligationName",
    "returnablePackageDepositRegion"
})
public class PackageDepositType {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime depositValueEffectiveDateTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime depositValueEndDateTime;
    protected AmountType returnablePackageDepositAmount;
    protected IdentifierType returnablePackageDepositIdentification;
    protected List<String> packagingRefundObligationName;
    protected List<TargetMarketType> returnablePackageDepositRegion;

    /**
     * Gets the value of the depositValueEffectiveDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getDepositValueEffectiveDateTime() {
        return depositValueEffectiveDateTime;
    }

    /**
     * Sets the value of the depositValueEffectiveDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositValueEffectiveDateTime(LocalDateTime value) {
        this.depositValueEffectiveDateTime = value;
    }

    /**
     * Gets the value of the depositValueEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getDepositValueEndDateTime() {
        return depositValueEndDateTime;
    }

    /**
     * Sets the value of the depositValueEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositValueEndDateTime(LocalDateTime value) {
        this.depositValueEndDateTime = value;
    }

    /**
     * Gets the value of the returnablePackageDepositAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReturnablePackageDepositAmount() {
        return returnablePackageDepositAmount;
    }

    /**
     * Sets the value of the returnablePackageDepositAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReturnablePackageDepositAmount(AmountType value) {
        this.returnablePackageDepositAmount = value;
    }

    /**
     * Gets the value of the returnablePackageDepositIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getReturnablePackageDepositIdentification() {
        return returnablePackageDepositIdentification;
    }

    /**
     * Sets the value of the returnablePackageDepositIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setReturnablePackageDepositIdentification(IdentifierType value) {
        this.returnablePackageDepositIdentification = value;
    }

    /**
     * Gets the value of the packagingRefundObligationName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingRefundObligationName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingRefundObligationName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPackagingRefundObligationName() {
        if (packagingRefundObligationName == null) {
            packagingRefundObligationName = new ArrayList<String>();
        }
        return this.packagingRefundObligationName;
    }

    /**
     * Gets the value of the returnablePackageDepositRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnablePackageDepositRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnablePackageDepositRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetMarketType }
     * 
     * 
     */
    public List<TargetMarketType> getReturnablePackageDepositRegion() {
        if (returnablePackageDepositRegion == null) {
            returnablePackageDepositRegion = new ArrayList<TargetMarketType>();
        }
        return this.returnablePackageDepositRegion;
    }

}
