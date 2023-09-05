
package gs1.gdsn.packaging_sustainability.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description200Type;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for PackagingSubstanceHazardousEnvironmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingSubstanceHazardousEnvironmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="haveYouMinimizedHazardousSubstance" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="hazardousSubstancesMinimizationCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}HazardousSubstancesMinimizationCodeType" minOccurs="0"/&gt;
 *         &lt;element name="relevantSupportingSubstanceHazardousDocumentation" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingSubstanceHazardousEnvironmentType", propOrder = {
    "haveYouMinimizedHazardousSubstance",
    "hazardousSubstancesMinimizationCode",
    "relevantSupportingSubstanceHazardousDocumentation"
})
public class PackagingSubstanceHazardousEnvironmentType {

    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType haveYouMinimizedHazardousSubstance;
    protected HazardousSubstancesMinimizationCodeType hazardousSubstancesMinimizationCode;
    protected List<Description200Type> relevantSupportingSubstanceHazardousDocumentation;

    /**
     * Gets the value of the haveYouMinimizedHazardousSubstance property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getHaveYouMinimizedHazardousSubstance() {
        return haveYouMinimizedHazardousSubstance;
    }

    /**
     * Sets the value of the haveYouMinimizedHazardousSubstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setHaveYouMinimizedHazardousSubstance(NonBinaryLogicEnumerationType value) {
        this.haveYouMinimizedHazardousSubstance = value;
    }

    /**
     * Gets the value of the hazardousSubstancesMinimizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link HazardousSubstancesMinimizationCodeType }
     *     
     */
    public HazardousSubstancesMinimizationCodeType getHazardousSubstancesMinimizationCode() {
        return hazardousSubstancesMinimizationCode;
    }

    /**
     * Sets the value of the hazardousSubstancesMinimizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousSubstancesMinimizationCodeType }
     *     
     */
    public void setHazardousSubstancesMinimizationCode(HazardousSubstancesMinimizationCodeType value) {
        this.hazardousSubstancesMinimizationCode = value;
    }

    /**
     * Gets the value of the relevantSupportingSubstanceHazardousDocumentation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relevantSupportingSubstanceHazardousDocumentation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelevantSupportingSubstanceHazardousDocumentation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description200Type }
     * 
     * 
     */
    public List<Description200Type> getRelevantSupportingSubstanceHazardousDocumentation() {
        if (relevantSupportingSubstanceHazardousDocumentation == null) {
            relevantSupportingSubstanceHazardousDocumentation = new ArrayList<Description200Type>();
        }
        return this.relevantSupportingSubstanceHazardousDocumentation;
    }

}
