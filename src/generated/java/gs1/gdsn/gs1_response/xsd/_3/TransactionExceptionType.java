
package gs1.gdsn.gs1_response.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.EntityIdentificationType;


/**
 * <p>Java class for TransactionExceptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionExceptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entityIdentification" type="{urn:gs1:shared:shared_common:xsd:3}EntityIdentificationType"/&gt;
 *         &lt;element name="gS1Error" type="{urn:gs1:gdsn:gs1_response:xsd:3}GS1ErrorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="commandException" type="{urn:gs1:gdsn:gs1_response:xsd:3}CommandExceptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionExceptionType", propOrder = {
    "entityIdentification",
    "gs1Error",
    "commandException"
})
public class TransactionExceptionType {

    @XmlElement(required = true)
    protected EntityIdentificationType entityIdentification;
    @XmlElement(name = "gS1Error")
    protected List<GS1ErrorType> gs1Error;
    protected List<CommandExceptionType> commandException;

    /**
     * Gets the value of the entityIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdentificationType }
     *     
     */
    public EntityIdentificationType getEntityIdentification() {
        return entityIdentification;
    }

    /**
     * Sets the value of the entityIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdentificationType }
     *     
     */
    public void setEntityIdentification(EntityIdentificationType value) {
        this.entityIdentification = value;
    }

    /**
     * Gets the value of the gs1Error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gs1Error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGS1Error().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GS1ErrorType }
     * 
     * 
     */
    public List<GS1ErrorType> getGS1Error() {
        if (gs1Error == null) {
            gs1Error = new ArrayList<GS1ErrorType>();
        }
        return this.gs1Error;
    }

    /**
     * Gets the value of the commandException property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commandException property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommandException().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommandExceptionType }
     * 
     * 
     */
    public List<CommandExceptionType> getCommandException() {
        if (commandException == null) {
            commandException = new ArrayList<CommandExceptionType>();
        }
        return this.commandException;
    }

}
