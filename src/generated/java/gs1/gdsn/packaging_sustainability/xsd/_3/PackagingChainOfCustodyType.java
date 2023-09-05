
package gs1.gdsn.packaging_sustainability.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description80Type;


/**
 * <p>Java class for PackagingChainOfCustodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingChainOfCustodyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packagingChainOfCustodyEventSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="packagingChainOfCustodySourceCertifiedCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}PackagingChainOfCustodySourceCertifiedCodeType" minOccurs="0"/&gt;
 *         &lt;element name="sourceCertificationSystemProtocolCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}SourceCertificationSystemProtocolCodeType" minOccurs="0"/&gt;
 *         &lt;element name="sourceCertificationSystemProtocolDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingChainOfCustodyType", propOrder = {
    "packagingChainOfCustodyEventSequenceNumber",
    "packagingChainOfCustodySourceCertifiedCode",
    "sourceCertificationSystemProtocolCode",
    "sourceCertificationSystemProtocolDescription"
})
public class PackagingChainOfCustodyType {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger packagingChainOfCustodyEventSequenceNumber;
    protected PackagingChainOfCustodySourceCertifiedCodeType packagingChainOfCustodySourceCertifiedCode;
    protected SourceCertificationSystemProtocolCodeType sourceCertificationSystemProtocolCode;
    protected List<Description80Type> sourceCertificationSystemProtocolDescription;

    /**
     * Gets the value of the packagingChainOfCustodyEventSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPackagingChainOfCustodyEventSequenceNumber() {
        return packagingChainOfCustodyEventSequenceNumber;
    }

    /**
     * Sets the value of the packagingChainOfCustodyEventSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPackagingChainOfCustodyEventSequenceNumber(BigInteger value) {
        this.packagingChainOfCustodyEventSequenceNumber = value;
    }

    /**
     * Gets the value of the packagingChainOfCustodySourceCertifiedCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingChainOfCustodySourceCertifiedCodeType }
     *     
     */
    public PackagingChainOfCustodySourceCertifiedCodeType getPackagingChainOfCustodySourceCertifiedCode() {
        return packagingChainOfCustodySourceCertifiedCode;
    }

    /**
     * Sets the value of the packagingChainOfCustodySourceCertifiedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingChainOfCustodySourceCertifiedCodeType }
     *     
     */
    public void setPackagingChainOfCustodySourceCertifiedCode(PackagingChainOfCustodySourceCertifiedCodeType value) {
        this.packagingChainOfCustodySourceCertifiedCode = value;
    }

    /**
     * Gets the value of the sourceCertificationSystemProtocolCode property.
     * 
     * @return
     *     possible object is
     *     {@link SourceCertificationSystemProtocolCodeType }
     *     
     */
    public SourceCertificationSystemProtocolCodeType getSourceCertificationSystemProtocolCode() {
        return sourceCertificationSystemProtocolCode;
    }

    /**
     * Sets the value of the sourceCertificationSystemProtocolCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceCertificationSystemProtocolCodeType }
     *     
     */
    public void setSourceCertificationSystemProtocolCode(SourceCertificationSystemProtocolCodeType value) {
        this.sourceCertificationSystemProtocolCode = value;
    }

    /**
     * Gets the value of the sourceCertificationSystemProtocolDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceCertificationSystemProtocolDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceCertificationSystemProtocolDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getSourceCertificationSystemProtocolDescription() {
        if (sourceCertificationSystemProtocolDescription == null) {
            sourceCertificationSystemProtocolDescription = new ArrayList<Description80Type>();
        }
        return this.sourceCertificationSystemProtocolDescription;
    }

}
