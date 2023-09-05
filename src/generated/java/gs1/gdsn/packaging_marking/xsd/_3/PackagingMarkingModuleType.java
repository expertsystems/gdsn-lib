
package gs1.gdsn.packaging_marking.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackagingMarkingModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingMarkingModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packagingMarking" type="{urn:gs1:gdsn:packaging_marking:xsd:3}PackagingMarkingType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingMarkingModuleType", propOrder = {
    "packagingMarking"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:packaging_marking:xsd:3")
public class PackagingMarkingModuleType {

    protected PackagingMarkingType packagingMarking;

    /**
     * Gets the value of the packagingMarking property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingMarkingType }
     *     
     */
    public PackagingMarkingType getPackagingMarking() {
        return packagingMarking;
    }

    /**
     * Sets the value of the packagingMarking property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingMarkingType }
     *     
     */
    public void setPackagingMarking(PackagingMarkingType value) {
        this.packagingMarking = value;
    }

}
