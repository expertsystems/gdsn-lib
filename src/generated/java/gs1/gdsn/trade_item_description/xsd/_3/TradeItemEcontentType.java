
package gs1.gdsn.trade_item_description.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.Description5000Type;


/**
 * <p>Java class for TradeItemEcontentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemEcontentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="econtentEnvironmentTypeCode" type="{urn:gs1:gdsn:trade_item_description:xsd:3}EContentEnvironmentTypeCodeType"/&gt;
 *         &lt;element name="econtentTradeItemStatement" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemEcontentType", propOrder = {
    "econtentEnvironmentTypeCode",
    "econtentTradeItemStatement"
})
public class TradeItemEcontentType {

    @XmlElement(required = true)
    protected EContentEnvironmentTypeCodeType econtentEnvironmentTypeCode;
    @XmlElement(required = true)
    protected List<Description5000Type> econtentTradeItemStatement;

    /**
     * Gets the value of the econtentEnvironmentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link EContentEnvironmentTypeCodeType }
     *     
     */
    public EContentEnvironmentTypeCodeType getEcontentEnvironmentTypeCode() {
        return econtentEnvironmentTypeCode;
    }

    /**
     * Sets the value of the econtentEnvironmentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EContentEnvironmentTypeCodeType }
     *     
     */
    public void setEcontentEnvironmentTypeCode(EContentEnvironmentTypeCodeType value) {
        this.econtentEnvironmentTypeCode = value;
    }

    /**
     * Gets the value of the econtentTradeItemStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the econtentTradeItemStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEcontentTradeItemStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getEcontentTradeItemStatement() {
        if (econtentTradeItemStatement == null) {
            econtentTradeItemStatement = new ArrayList<Description5000Type>();
        }
        return this.econtentTradeItemStatement;
    }

}
