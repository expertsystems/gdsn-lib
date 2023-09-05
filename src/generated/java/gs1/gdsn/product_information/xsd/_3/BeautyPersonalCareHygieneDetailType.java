
package gs1.gdsn.product_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BeautyPersonalCareHygieneDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeautyPersonalCareHygieneDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="perfumeFragranceDilutionClassCode" type="{urn:gs1:gdsn:product_information:xsd:3}PerfumeFragranceDilutionClassCodeType" minOccurs="0"/&gt;
 *         &lt;element name="dentalProductInformation" type="{urn:gs1:gdsn:product_information:xsd:3}DentalProductInformationType" minOccurs="0"/&gt;
 *         &lt;element name="hairProductInformation" type="{urn:gs1:gdsn:product_information:xsd:3}HairProductInformationType" minOccurs="0"/&gt;
 *         &lt;element name="skinProductInformation" type="{urn:gs1:gdsn:product_information:xsd:3}SkinProductInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeautyPersonalCareHygieneDetailType", propOrder = {
    "perfumeFragranceDilutionClassCode",
    "dentalProductInformation",
    "hairProductInformation",
    "skinProductInformation"
})
public class BeautyPersonalCareHygieneDetailType {

    protected PerfumeFragranceDilutionClassCodeType perfumeFragranceDilutionClassCode;
    protected DentalProductInformationType dentalProductInformation;
    protected HairProductInformationType hairProductInformation;
    protected SkinProductInformationType skinProductInformation;

    /**
     * Gets the value of the perfumeFragranceDilutionClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link PerfumeFragranceDilutionClassCodeType }
     *     
     */
    public PerfumeFragranceDilutionClassCodeType getPerfumeFragranceDilutionClassCode() {
        return perfumeFragranceDilutionClassCode;
    }

    /**
     * Sets the value of the perfumeFragranceDilutionClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerfumeFragranceDilutionClassCodeType }
     *     
     */
    public void setPerfumeFragranceDilutionClassCode(PerfumeFragranceDilutionClassCodeType value) {
        this.perfumeFragranceDilutionClassCode = value;
    }

    /**
     * Gets the value of the dentalProductInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DentalProductInformationType }
     *     
     */
    public DentalProductInformationType getDentalProductInformation() {
        return dentalProductInformation;
    }

    /**
     * Sets the value of the dentalProductInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DentalProductInformationType }
     *     
     */
    public void setDentalProductInformation(DentalProductInformationType value) {
        this.dentalProductInformation = value;
    }

    /**
     * Gets the value of the hairProductInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HairProductInformationType }
     *     
     */
    public HairProductInformationType getHairProductInformation() {
        return hairProductInformation;
    }

    /**
     * Sets the value of the hairProductInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HairProductInformationType }
     *     
     */
    public void setHairProductInformation(HairProductInformationType value) {
        this.hairProductInformation = value;
    }

    /**
     * Gets the value of the skinProductInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SkinProductInformationType }
     *     
     */
    public SkinProductInformationType getSkinProductInformation() {
        return skinProductInformation;
    }

    /**
     * Sets the value of the skinProductInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkinProductInformationType }
     *     
     */
    public void setSkinProductInformation(SkinProductInformationType value) {
        this.skinProductInformation = value;
    }

}
