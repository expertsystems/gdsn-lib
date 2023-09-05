
package gs1.gdsn.gs1_response.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.unece.cefact.namespaces.standardbusinessdocumentheader.StandardBusinessDocumentHeader;


/**
 * <p>Java class for GS1ResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GS1ResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader}StandardBusinessDocumentHeader"/&gt;
 *         &lt;element name="gS1Response" type="{urn:gs1:gdsn:gs1_response:xsd:3}GS1ResponseType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GS1ResponseMessageType", propOrder = {
    "standardBusinessDocumentHeader",
    "gs1Response"
})
public class GS1ResponseMessageType {

    @XmlElement(name = "StandardBusinessDocumentHeader", namespace = "http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader", required = true)
    protected StandardBusinessDocumentHeader standardBusinessDocumentHeader;
    @XmlElement(name = "gS1Response", required = true)
    protected List<GS1ResponseType> gs1Response;

    /**
     * Gets the value of the standardBusinessDocumentHeader property.
     * 
     * @return
     *     possible object is
     *     {@link StandardBusinessDocumentHeader }
     *     
     */
    public StandardBusinessDocumentHeader getStandardBusinessDocumentHeader() {
        return standardBusinessDocumentHeader;
    }

    /**
     * Sets the value of the standardBusinessDocumentHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardBusinessDocumentHeader }
     *     
     */
    public void setStandardBusinessDocumentHeader(StandardBusinessDocumentHeader value) {
        this.standardBusinessDocumentHeader = value;
    }

    /**
     * Gets the value of the gs1Response property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gs1Response property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGS1Response().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GS1ResponseType }
     * 
     * 
     */
    public List<GS1ResponseType> getGS1Response() {
        if (gs1Response == null) {
            gs1Response = new ArrayList<GS1ResponseType>();
        }
        return this.gs1Response;
    }

}
