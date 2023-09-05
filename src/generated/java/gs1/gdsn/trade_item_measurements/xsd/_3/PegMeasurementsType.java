
package gs1.gdsn.trade_item_measurements.xsd._3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for PegMeasurementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PegMeasurementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pegHoleNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="pegHoleTypeCode" type="{urn:gs1:gdsn:trade_item_measurements:xsd:3}PegHoleTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="pegHorizontal" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType"/&gt;
 *         &lt;element name="pegVertical" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PegMeasurementsType", propOrder = {
    "pegHoleNumber",
    "pegHoleTypeCode",
    "pegHorizontal",
    "pegVertical"
})
public class PegMeasurementsType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pegHoleNumber;
    protected PegHoleTypeCodeType pegHoleTypeCode;
    @XmlElement(required = true)
    protected MeasurementType pegHorizontal;
    @XmlElement(required = true)
    protected MeasurementType pegVertical;

    /**
     * Gets the value of the pegHoleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPegHoleNumber() {
        return pegHoleNumber;
    }

    /**
     * Sets the value of the pegHoleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPegHoleNumber(BigInteger value) {
        this.pegHoleNumber = value;
    }

    /**
     * Gets the value of the pegHoleTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PegHoleTypeCodeType }
     *     
     */
    public PegHoleTypeCodeType getPegHoleTypeCode() {
        return pegHoleTypeCode;
    }

    /**
     * Sets the value of the pegHoleTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PegHoleTypeCodeType }
     *     
     */
    public void setPegHoleTypeCode(PegHoleTypeCodeType value) {
        this.pegHoleTypeCode = value;
    }

    /**
     * Gets the value of the pegHorizontal property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getPegHorizontal() {
        return pegHorizontal;
    }

    /**
     * Sets the value of the pegHorizontal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setPegHorizontal(MeasurementType value) {
        this.pegHorizontal = value;
    }

    /**
     * Gets the value of the pegVertical property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getPegVertical() {
        return pegVertical;
    }

    /**
     * Sets the value of the pegVertical property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setPegVertical(MeasurementType value) {
        this.pegVertical = value;
    }

}
