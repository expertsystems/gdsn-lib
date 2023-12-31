
package gs1.gdsn.packaging_information.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description1000Type;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for PackagingInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="doPackagingMaterialsContainLatex" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="numberOfPackagesForSetPiecesGTIN" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="packagingSustainabilityStatement" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packaging" type="{urn:gs1:gdsn:packaging_information:xsd:3}PackagingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingInformationModuleType", propOrder = {
    "doPackagingMaterialsContainLatex",
    "numberOfPackagesForSetPiecesGTIN",
    "packagingSustainabilityStatement",
    "packaging"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:packaging_information:xsd:3")
public class PackagingInformationModuleType {

    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType doPackagingMaterialsContainLatex;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfPackagesForSetPiecesGTIN;
    protected List<Description1000Type> packagingSustainabilityStatement;
    protected List<PackagingType> packaging;

    /**
     * Gets the value of the doPackagingMaterialsContainLatex property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getDoPackagingMaterialsContainLatex() {
        return doPackagingMaterialsContainLatex;
    }

    /**
     * Sets the value of the doPackagingMaterialsContainLatex property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setDoPackagingMaterialsContainLatex(NonBinaryLogicEnumerationType value) {
        this.doPackagingMaterialsContainLatex = value;
    }

    /**
     * Gets the value of the numberOfPackagesForSetPiecesGTIN property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPackagesForSetPiecesGTIN() {
        return numberOfPackagesForSetPiecesGTIN;
    }

    /**
     * Sets the value of the numberOfPackagesForSetPiecesGTIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPackagesForSetPiecesGTIN(BigInteger value) {
        this.numberOfPackagesForSetPiecesGTIN = value;
    }

    /**
     * Gets the value of the packagingSustainabilityStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingSustainabilityStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingSustainabilityStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getPackagingSustainabilityStatement() {
        if (packagingSustainabilityStatement == null) {
            packagingSustainabilityStatement = new ArrayList<Description1000Type>();
        }
        return this.packagingSustainabilityStatement;
    }

    /**
     * Gets the value of the packaging property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packaging property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackaging().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingType }
     * 
     * 
     */
    public List<PackagingType> getPackaging() {
        if (packaging == null) {
            packaging = new ArrayList<PackagingType>();
        }
        return this.packaging;
    }

}
