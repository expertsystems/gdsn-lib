
package gs1.gdsn.trade_item.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description70Type;


/**
 * <p>Java class for TradeItemComponentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemComponentsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contentsDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nonMarkedTradeItemComponents" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="numberOfPiecesInSet" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="totalNumberOfComponents" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="multipleContainerQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="componentInformation" type="{urn:gs1:gdsn:trade_item:xsd:3}ComponentInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemComponentsType", propOrder = {
    "contentsDescription",
    "nonMarkedTradeItemComponents",
    "numberOfPiecesInSet",
    "totalNumberOfComponents",
    "multipleContainerQuantity",
    "componentInformation"
})
public class TradeItemComponentsType {

    protected List<Description70Type> contentsDescription;
    protected List<Description70Type> nonMarkedTradeItemComponents;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfPiecesInSet;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalNumberOfComponents;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger multipleContainerQuantity;
    protected List<ComponentInformationType> componentInformation;

    /**
     * Gets the value of the contentsDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentsDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentsDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getContentsDescription() {
        if (contentsDescription == null) {
            contentsDescription = new ArrayList<Description70Type>();
        }
        return this.contentsDescription;
    }

    /**
     * Gets the value of the nonMarkedTradeItemComponents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonMarkedTradeItemComponents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonMarkedTradeItemComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getNonMarkedTradeItemComponents() {
        if (nonMarkedTradeItemComponents == null) {
            nonMarkedTradeItemComponents = new ArrayList<Description70Type>();
        }
        return this.nonMarkedTradeItemComponents;
    }

    /**
     * Gets the value of the numberOfPiecesInSet property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPiecesInSet() {
        return numberOfPiecesInSet;
    }

    /**
     * Sets the value of the numberOfPiecesInSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPiecesInSet(BigInteger value) {
        this.numberOfPiecesInSet = value;
    }

    /**
     * Gets the value of the totalNumberOfComponents property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberOfComponents() {
        return totalNumberOfComponents;
    }

    /**
     * Sets the value of the totalNumberOfComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberOfComponents(BigInteger value) {
        this.totalNumberOfComponents = value;
    }

    /**
     * Gets the value of the multipleContainerQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMultipleContainerQuantity() {
        return multipleContainerQuantity;
    }

    /**
     * Sets the value of the multipleContainerQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMultipleContainerQuantity(BigInteger value) {
        this.multipleContainerQuantity = value;
    }

    /**
     * Gets the value of the componentInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponentInformationType }
     * 
     * 
     */
    public List<ComponentInformationType> getComponentInformation() {
        if (componentInformation == null) {
            componentInformation = new ArrayList<ComponentInformationType>();
        }
        return this.componentInformation;
    }

}
