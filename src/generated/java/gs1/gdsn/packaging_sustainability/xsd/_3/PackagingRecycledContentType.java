
package gs1.gdsn.packaging_sustainability.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description80Type;


/**
 * <p>Java class for PackagingRecycledContentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingRecycledContentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packagingRecycledContentRatio" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="packagingRecycledContentTypeCode" type="{urn:gs1:gdsn:packaging_sustainability:xsd:3}PackagingRecycledContentTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="packagingRecycledContentDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingRecycledContentType", propOrder = {
    "packagingRecycledContentRatio",
    "packagingRecycledContentTypeCode",
    "packagingRecycledContentDescription"
})
public class PackagingRecycledContentType {

    protected Float packagingRecycledContentRatio;
    protected PackagingRecycledContentTypeCodeType packagingRecycledContentTypeCode;
    protected List<Description80Type> packagingRecycledContentDescription;

    /**
     * Gets the value of the packagingRecycledContentRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPackagingRecycledContentRatio() {
        return packagingRecycledContentRatio;
    }

    /**
     * Sets the value of the packagingRecycledContentRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPackagingRecycledContentRatio(Float value) {
        this.packagingRecycledContentRatio = value;
    }

    /**
     * Gets the value of the packagingRecycledContentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingRecycledContentTypeCodeType }
     *     
     */
    public PackagingRecycledContentTypeCodeType getPackagingRecycledContentTypeCode() {
        return packagingRecycledContentTypeCode;
    }

    /**
     * Sets the value of the packagingRecycledContentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingRecycledContentTypeCodeType }
     *     
     */
    public void setPackagingRecycledContentTypeCode(PackagingRecycledContentTypeCodeType value) {
        this.packagingRecycledContentTypeCode = value;
    }

    /**
     * Gets the value of the packagingRecycledContentDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingRecycledContentDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingRecycledContentDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getPackagingRecycledContentDescription() {
        if (packagingRecycledContentDescription == null) {
            packagingRecycledContentDescription = new ArrayList<Description80Type>();
        }
        return this.packagingRecycledContentDescription;
    }

}
