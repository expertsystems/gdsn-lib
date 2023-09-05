
package gs1.gdsn.referenced_file_detail_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferencedFileDetailInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferencedFileDetailInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referencedFileHeader" type="{urn:gs1:gdsn:referenced_file_detail_information:xsd:3}ReferencedFileHeaderType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencedFileDetailInformationModuleType", propOrder = {
    "referencedFileHeader"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:referenced_file_detail_information:xsd:3")
public class ReferencedFileDetailInformationModuleType {

    protected List<ReferencedFileHeaderType> referencedFileHeader;

    /**
     * Gets the value of the referencedFileHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencedFileHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencedFileHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencedFileHeaderType }
     * 
     * 
     */
    public List<ReferencedFileHeaderType> getReferencedFileHeader() {
        if (referencedFileHeader == null) {
            referencedFileHeader = new ArrayList<ReferencedFileHeaderType>();
        }
        return this.referencedFileHeader;
    }

}
