
package gs1.gdsn.chemical_regulation_information.xsd._3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import gs1.shared.shared_common.xsd._3.CodeType;
import gs1.shared.shared_common.xsd._3.Description1000Type;
import gs1.shared.shared_common.xsd._3.Description2000Type;
import se.exder.external.gs1.gdsn3p1.Adapter1;


/**
 * <p>Java class for RegulatedChemicalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegulatedChemicalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="regulatedChemicalIdentifierCodeReference" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="regulatedChemicalDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description2000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="regulatedChemicalName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="regulatedChemicalSunsetDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="technicalChemicalName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="testCriteriaDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="carcinogenicMutagenicReprotoxicTypeCode" type="{urn:gs1:gdsn:chemical_regulation_information:xsd:3}CarcinogenicMutagenicReprotoxicTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="regulatedChemicalTypeCode" type="{urn:gs1:gdsn:chemical_regulation_information:xsd:3}RegulatedChemicalTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="chemicalIngredientPropertyInformation" type="{urn:gs1:gdsn:chemical_regulation_information:xsd:3}ChemicalIngredientPropertyInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatedChemicalType", propOrder = {
    "regulatedChemicalIdentifierCodeReference",
    "regulatedChemicalDescription",
    "regulatedChemicalName",
    "regulatedChemicalSunsetDateTime",
    "technicalChemicalName",
    "testCriteriaDescription",
    "carcinogenicMutagenicReprotoxicTypeCode",
    "regulatedChemicalTypeCode",
    "chemicalIngredientPropertyInformation"
})
public class RegulatedChemicalType {

    protected CodeType regulatedChemicalIdentifierCodeReference;
    protected List<Description2000Type> regulatedChemicalDescription;
    protected String regulatedChemicalName;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime regulatedChemicalSunsetDateTime;
    protected String technicalChemicalName;
    protected List<Description1000Type> testCriteriaDescription;
    protected CarcinogenicMutagenicReprotoxicTypeCodeType carcinogenicMutagenicReprotoxicTypeCode;
    protected RegulatedChemicalTypeCodeType regulatedChemicalTypeCode;
    protected List<ChemicalIngredientPropertyInformationType> chemicalIngredientPropertyInformation;

    /**
     * Gets the value of the regulatedChemicalIdentifierCodeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getRegulatedChemicalIdentifierCodeReference() {
        return regulatedChemicalIdentifierCodeReference;
    }

    /**
     * Sets the value of the regulatedChemicalIdentifierCodeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setRegulatedChemicalIdentifierCodeReference(CodeType value) {
        this.regulatedChemicalIdentifierCodeReference = value;
    }

    /**
     * Gets the value of the regulatedChemicalDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regulatedChemicalDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegulatedChemicalDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description2000Type }
     * 
     * 
     */
    public List<Description2000Type> getRegulatedChemicalDescription() {
        if (regulatedChemicalDescription == null) {
            regulatedChemicalDescription = new ArrayList<Description2000Type>();
        }
        return this.regulatedChemicalDescription;
    }

    /**
     * Gets the value of the regulatedChemicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulatedChemicalName() {
        return regulatedChemicalName;
    }

    /**
     * Sets the value of the regulatedChemicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulatedChemicalName(String value) {
        this.regulatedChemicalName = value;
    }

    /**
     * Gets the value of the regulatedChemicalSunsetDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getRegulatedChemicalSunsetDateTime() {
        return regulatedChemicalSunsetDateTime;
    }

    /**
     * Sets the value of the regulatedChemicalSunsetDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulatedChemicalSunsetDateTime(LocalDateTime value) {
        this.regulatedChemicalSunsetDateTime = value;
    }

    /**
     * Gets the value of the technicalChemicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicalChemicalName() {
        return technicalChemicalName;
    }

    /**
     * Sets the value of the technicalChemicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalChemicalName(String value) {
        this.technicalChemicalName = value;
    }

    /**
     * Gets the value of the testCriteriaDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testCriteriaDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestCriteriaDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getTestCriteriaDescription() {
        if (testCriteriaDescription == null) {
            testCriteriaDescription = new ArrayList<Description1000Type>();
        }
        return this.testCriteriaDescription;
    }

    /**
     * Gets the value of the carcinogenicMutagenicReprotoxicTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CarcinogenicMutagenicReprotoxicTypeCodeType }
     *     
     */
    public CarcinogenicMutagenicReprotoxicTypeCodeType getCarcinogenicMutagenicReprotoxicTypeCode() {
        return carcinogenicMutagenicReprotoxicTypeCode;
    }

    /**
     * Sets the value of the carcinogenicMutagenicReprotoxicTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarcinogenicMutagenicReprotoxicTypeCodeType }
     *     
     */
    public void setCarcinogenicMutagenicReprotoxicTypeCode(CarcinogenicMutagenicReprotoxicTypeCodeType value) {
        this.carcinogenicMutagenicReprotoxicTypeCode = value;
    }

    /**
     * Gets the value of the regulatedChemicalTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatedChemicalTypeCodeType }
     *     
     */
    public RegulatedChemicalTypeCodeType getRegulatedChemicalTypeCode() {
        return regulatedChemicalTypeCode;
    }

    /**
     * Sets the value of the regulatedChemicalTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatedChemicalTypeCodeType }
     *     
     */
    public void setRegulatedChemicalTypeCode(RegulatedChemicalTypeCodeType value) {
        this.regulatedChemicalTypeCode = value;
    }

    /**
     * Gets the value of the chemicalIngredientPropertyInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chemicalIngredientPropertyInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChemicalIngredientPropertyInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChemicalIngredientPropertyInformationType }
     * 
     * 
     */
    public List<ChemicalIngredientPropertyInformationType> getChemicalIngredientPropertyInformation() {
        if (chemicalIngredientPropertyInformation == null) {
            chemicalIngredientPropertyInformation = new ArrayList<ChemicalIngredientPropertyInformationType>();
        }
        return this.chemicalIngredientPropertyInformation;
    }

}
