
package gs1.gdsn.packaging_sustainability.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description80Type;


/**
 * <p>Java class for PackagingRenewableContentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingRenewableContentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packagingRenewableContentRatio" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="packagingRenewableContentTypeCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}PackagingRenewableContentTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="packagingRenewableContentDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingRenewableContentType", propOrder = {
    "packagingRenewableContentRatio",
    "packagingRenewableContentTypeCode",
    "packagingRenewableContentDescription"
})
public class PackagingRenewableContentType {

    protected Float packagingRenewableContentRatio;
    protected PackagingRenewableContentTypeCodeType packagingRenewableContentTypeCode;
    protected List<Description80Type> packagingRenewableContentDescription;

    /**
     * Gets the value of the packagingRenewableContentRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPackagingRenewableContentRatio() {
        return packagingRenewableContentRatio;
    }

    /**
     * Sets the value of the packagingRenewableContentRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPackagingRenewableContentRatio(Float value) {
        this.packagingRenewableContentRatio = value;
    }

    /**
     * Gets the value of the packagingRenewableContentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingRenewableContentTypeCodeType }
     *     
     */
    public PackagingRenewableContentTypeCodeType getPackagingRenewableContentTypeCode() {
        return packagingRenewableContentTypeCode;
    }

    /**
     * Sets the value of the packagingRenewableContentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingRenewableContentTypeCodeType }
     *     
     */
    public void setPackagingRenewableContentTypeCode(PackagingRenewableContentTypeCodeType value) {
        this.packagingRenewableContentTypeCode = value;
    }

    /**
     * Gets the value of the packagingRenewableContentDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingRenewableContentDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingRenewableContentDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getPackagingRenewableContentDescription() {
        if (packagingRenewableContentDescription == null) {
            packagingRenewableContentDescription = new ArrayList<Description80Type>();
        }
        return this.packagingRenewableContentDescription;
    }

}
