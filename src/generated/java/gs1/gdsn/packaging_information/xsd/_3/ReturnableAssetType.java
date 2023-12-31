
package gs1.gdsn.packaging_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.AdditionalReturnableAssetIdentificationType;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;
import gs1.shared.shared_common.xsd._3.QuantityType;


/**
 * <p>Java class for ReturnableAssetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnableAssetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alternativeReturnableAssetIdentification" type="{urn:gs1:shared:shared_common:xsd:3}AdditionalReturnableAssetIdentificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="grai" type="{urn:gs1:shared:shared_common:xsd:3}GRAIType" minOccurs="0"/&gt;
 *         &lt;element name="isReturnableAssetEmpty" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="returnableAssetCapacityContent" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="returnableAssetsContainedQuantity" type="{urn:gs1:shared:shared_common:xsd:3}QuantityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="returnableAssetOwnerId" type="{urn:gs1:shared:shared_common:xsd:3}GLNType" minOccurs="0"/&gt;
 *         &lt;element name="returnableAssetOwnerName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="returnableAssetPackageDeposit" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackageDepositType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnableAssetType", propOrder = {
    "alternativeReturnableAssetIdentification",
    "grai",
    "isReturnableAssetEmpty",
    "returnableAssetCapacityContent",
    "returnableAssetsContainedQuantity",
    "returnableAssetOwnerId",
    "returnableAssetOwnerName",
    "returnableAssetPackageDeposit"
})
public class ReturnableAssetType {

    protected List<AdditionalReturnableAssetIdentificationType> alternativeReturnableAssetIdentification;
    protected String grai;
    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType isReturnableAssetEmpty;
    protected List<MeasurementType> returnableAssetCapacityContent;
    protected List<QuantityType> returnableAssetsContainedQuantity;
    protected String returnableAssetOwnerId;
    protected String returnableAssetOwnerName;
    protected List<PackageDepositType> returnableAssetPackageDeposit;

    /**
     * Gets the value of the alternativeReturnableAssetIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeReturnableAssetIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeReturnableAssetIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalReturnableAssetIdentificationType }
     * 
     * 
     */
    public List<AdditionalReturnableAssetIdentificationType> getAlternativeReturnableAssetIdentification() {
        if (alternativeReturnableAssetIdentification == null) {
            alternativeReturnableAssetIdentification = new ArrayList<AdditionalReturnableAssetIdentificationType>();
        }
        return this.alternativeReturnableAssetIdentification;
    }

    /**
     * Gets the value of the grai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrai() {
        return grai;
    }

    /**
     * Sets the value of the grai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrai(String value) {
        this.grai = value;
    }

    /**
     * Gets the value of the isReturnableAssetEmpty property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getIsReturnableAssetEmpty() {
        return isReturnableAssetEmpty;
    }

    /**
     * Sets the value of the isReturnableAssetEmpty property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setIsReturnableAssetEmpty(NonBinaryLogicEnumerationType value) {
        this.isReturnableAssetEmpty = value;
    }

    /**
     * Gets the value of the returnableAssetCapacityContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnableAssetCapacityContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnableAssetCapacityContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getReturnableAssetCapacityContent() {
        if (returnableAssetCapacityContent == null) {
            returnableAssetCapacityContent = new ArrayList<MeasurementType>();
        }
        return this.returnableAssetCapacityContent;
    }

    /**
     * Gets the value of the returnableAssetsContainedQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnableAssetsContainedQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnableAssetsContainedQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityType }
     * 
     * 
     */
    public List<QuantityType> getReturnableAssetsContainedQuantity() {
        if (returnableAssetsContainedQuantity == null) {
            returnableAssetsContainedQuantity = new ArrayList<QuantityType>();
        }
        return this.returnableAssetsContainedQuantity;
    }

    /**
     * Gets the value of the returnableAssetOwnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnableAssetOwnerId() {
        return returnableAssetOwnerId;
    }

    /**
     * Sets the value of the returnableAssetOwnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnableAssetOwnerId(String value) {
        this.returnableAssetOwnerId = value;
    }

    /**
     * Gets the value of the returnableAssetOwnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnableAssetOwnerName() {
        return returnableAssetOwnerName;
    }

    /**
     * Sets the value of the returnableAssetOwnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnableAssetOwnerName(String value) {
        this.returnableAssetOwnerName = value;
    }

    /**
     * Gets the value of the returnableAssetPackageDeposit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnableAssetPackageDeposit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnableAssetPackageDeposit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageDepositType }
     * 
     * 
     */
    public List<PackageDepositType> getReturnableAssetPackageDeposit() {
        if (returnableAssetPackageDeposit == null) {
            returnableAssetPackageDeposit = new ArrayList<PackageDepositType>();
        }
        return this.returnableAssetPackageDeposit;
    }

}
