
package gs1.gdsn.dairy_fish_meat_poultry.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.CountryCodeType;


/**
 * <p>Java class for FishCatchInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FishCatchInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="catchMethodCode" type="{urn:gs1:gdsn:dairy_fish_meat_poultry:xsd:3}CatchMethodCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productionMethodForFishAndSeafoodCode" type="{urn:gs1:gdsn:dairy_fish_meat_poultry:xsd:3}ProductionMethodForFishAndSeafoodCodeType" minOccurs="0"/&gt;
 *         &lt;element name="storageStateCode" type="{urn:gs1:gdsn:dairy_fish_meat_poultry:xsd:3}StorageStateCodeType" minOccurs="0"/&gt;
 *         &lt;element name="catchAreaCode" type="{urn:gs1:gdsn:dairy_fish_meat_poultry:xsd:3}CatchAreaCode_GDSNType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="catchCountryCode" type="{urn:gs1:shared:shared_common:xsd:3}CountryCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fishCatchDateInformation" type="{urn:gs1:gdsn:dairy_fish_meat_poultry:xsd:3}FishCatchDateInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FishCatchInformationType", propOrder = {
    "catchMethodCode",
    "productionMethodForFishAndSeafoodCode",
    "storageStateCode",
    "catchAreaCode",
    "catchCountryCode",
    "fishCatchDateInformation"
})
public class FishCatchInformationType {

    protected List<CatchMethodCodeType> catchMethodCode;
    protected ProductionMethodForFishAndSeafoodCodeType productionMethodForFishAndSeafoodCode;
    protected StorageStateCodeType storageStateCode;
    protected List<CatchAreaCodeGDSNType> catchAreaCode;
    protected List<CountryCodeType> catchCountryCode;
    protected List<FishCatchDateInformationType> fishCatchDateInformation;

    /**
     * Gets the value of the catchMethodCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catchMethodCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatchMethodCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatchMethodCodeType }
     * 
     * 
     */
    public List<CatchMethodCodeType> getCatchMethodCode() {
        if (catchMethodCode == null) {
            catchMethodCode = new ArrayList<CatchMethodCodeType>();
        }
        return this.catchMethodCode;
    }

    /**
     * Gets the value of the productionMethodForFishAndSeafoodCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProductionMethodForFishAndSeafoodCodeType }
     *     
     */
    public ProductionMethodForFishAndSeafoodCodeType getProductionMethodForFishAndSeafoodCode() {
        return productionMethodForFishAndSeafoodCode;
    }

    /**
     * Sets the value of the productionMethodForFishAndSeafoodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionMethodForFishAndSeafoodCodeType }
     *     
     */
    public void setProductionMethodForFishAndSeafoodCode(ProductionMethodForFishAndSeafoodCodeType value) {
        this.productionMethodForFishAndSeafoodCode = value;
    }

    /**
     * Gets the value of the storageStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link StorageStateCodeType }
     *     
     */
    public StorageStateCodeType getStorageStateCode() {
        return storageStateCode;
    }

    /**
     * Sets the value of the storageStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageStateCodeType }
     *     
     */
    public void setStorageStateCode(StorageStateCodeType value) {
        this.storageStateCode = value;
    }

    /**
     * Gets the value of the catchAreaCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catchAreaCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatchAreaCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatchAreaCodeGDSNType }
     * 
     * 
     */
    public List<CatchAreaCodeGDSNType> getCatchAreaCode() {
        if (catchAreaCode == null) {
            catchAreaCode = new ArrayList<CatchAreaCodeGDSNType>();
        }
        return this.catchAreaCode;
    }

    /**
     * Gets the value of the catchCountryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catchCountryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatchCountryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryCodeType }
     * 
     * 
     */
    public List<CountryCodeType> getCatchCountryCode() {
        if (catchCountryCode == null) {
            catchCountryCode = new ArrayList<CountryCodeType>();
        }
        return this.catchCountryCode;
    }

    /**
     * Gets the value of the fishCatchDateInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fishCatchDateInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFishCatchDateInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FishCatchDateInformationType }
     * 
     * 
     */
    public List<FishCatchDateInformationType> getFishCatchDateInformation() {
        if (fishCatchDateInformation == null) {
            fishCatchDateInformation = new ArrayList<FishCatchDateInformationType>();
        }
        return this.fishCatchDateInformation;
    }

}
