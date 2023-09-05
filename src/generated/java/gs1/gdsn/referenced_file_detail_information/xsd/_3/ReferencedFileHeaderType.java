
package gs1.gdsn.referenced_file_detail_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.ReferencedFileInformationType;


/**
 * <p>Java class for ReferencedFileHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferencedFileHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:gs1:gdsn:gdsn_common:xsd:3}ReferencedFileInformationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referencedFileDetail" type="{urn:gs1:gdsn:referenced_file_detail_information:xsd:3}ReferencedFileDetailType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencedFileHeaderType", propOrder = {
    "referencedFileDetail"
})
public class ReferencedFileHeaderType
    extends ReferencedFileInformationType
{

    protected ReferencedFileDetailType referencedFileDetail;

    /**
     * Gets the value of the referencedFileDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencedFileDetailType }
     *     
     */
    public ReferencedFileDetailType getReferencedFileDetail() {
        return referencedFileDetail;
    }

    /**
     * Sets the value of the referencedFileDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencedFileDetailType }
     *     
     */
    public void setReferencedFileDetail(ReferencedFileDetailType value) {
        this.referencedFileDetail = value;
    }

}
