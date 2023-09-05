
package gs1.gdsn.video_display_device_information.xsd._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.AspectRatioInformationType;
import gs1.shared.shared_common.xsd._3.MeasurementType;


/**
 * <p>Java class for DisplayScreenInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisplayScreenInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="displayResolutionCode" type="{urn:gs1:gdsn:video_display_device_information:xsd:3}DisplayResolutionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="displayScreenBezelSize" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="displayScreenSize" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="displayScreenTypeCode" type="{urn:gs1:gdsn:video_display_device_information:xsd:3}DisplayScreenTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="horizontalViewingAngle" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="totalScreenArea" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="verticalViewingAngle" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="displayPanelBacklightType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="aspectRatioInformation" type="{urn:gs1:gdsn:gdsn_common:xsd:3}AspectRatioInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayScreenInformationType", propOrder = {
    "displayResolutionCode",
    "displayScreenBezelSize",
    "displayScreenSize",
    "displayScreenTypeCode",
    "horizontalViewingAngle",
    "totalScreenArea",
    "verticalViewingAngle",
    "displayPanelBacklightType",
    "aspectRatioInformation"
})
public class DisplayScreenInformationType {

    protected DisplayResolutionCodeType displayResolutionCode;
    protected List<MeasurementType> displayScreenBezelSize;
    protected List<MeasurementType> displayScreenSize;
    protected DisplayScreenTypeCodeType displayScreenTypeCode;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger horizontalViewingAngle;
    protected List<MeasurementType> totalScreenArea;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger verticalViewingAngle;
    protected String displayPanelBacklightType;
    protected AspectRatioInformationType aspectRatioInformation;

    /**
     * Gets the value of the displayResolutionCode property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayResolutionCodeType }
     *     
     */
    public DisplayResolutionCodeType getDisplayResolutionCode() {
        return displayResolutionCode;
    }

    /**
     * Sets the value of the displayResolutionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayResolutionCodeType }
     *     
     */
    public void setDisplayResolutionCode(DisplayResolutionCodeType value) {
        this.displayResolutionCode = value;
    }

    /**
     * Gets the value of the displayScreenBezelSize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayScreenBezelSize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayScreenBezelSize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getDisplayScreenBezelSize() {
        if (displayScreenBezelSize == null) {
            displayScreenBezelSize = new ArrayList<MeasurementType>();
        }
        return this.displayScreenBezelSize;
    }

    /**
     * Gets the value of the displayScreenSize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayScreenSize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayScreenSize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getDisplayScreenSize() {
        if (displayScreenSize == null) {
            displayScreenSize = new ArrayList<MeasurementType>();
        }
        return this.displayScreenSize;
    }

    /**
     * Gets the value of the displayScreenTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayScreenTypeCodeType }
     *     
     */
    public DisplayScreenTypeCodeType getDisplayScreenTypeCode() {
        return displayScreenTypeCode;
    }

    /**
     * Sets the value of the displayScreenTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayScreenTypeCodeType }
     *     
     */
    public void setDisplayScreenTypeCode(DisplayScreenTypeCodeType value) {
        this.displayScreenTypeCode = value;
    }

    /**
     * Gets the value of the horizontalViewingAngle property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHorizontalViewingAngle() {
        return horizontalViewingAngle;
    }

    /**
     * Sets the value of the horizontalViewingAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHorizontalViewingAngle(BigInteger value) {
        this.horizontalViewingAngle = value;
    }

    /**
     * Gets the value of the totalScreenArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalScreenArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalScreenArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getTotalScreenArea() {
        if (totalScreenArea == null) {
            totalScreenArea = new ArrayList<MeasurementType>();
        }
        return this.totalScreenArea;
    }

    /**
     * Gets the value of the verticalViewingAngle property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVerticalViewingAngle() {
        return verticalViewingAngle;
    }

    /**
     * Sets the value of the verticalViewingAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVerticalViewingAngle(BigInteger value) {
        this.verticalViewingAngle = value;
    }

    /**
     * Gets the value of the displayPanelBacklightType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayPanelBacklightType() {
        return displayPanelBacklightType;
    }

    /**
     * Sets the value of the displayPanelBacklightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayPanelBacklightType(String value) {
        this.displayPanelBacklightType = value;
    }

    /**
     * Gets the value of the aspectRatioInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AspectRatioInformationType }
     *     
     */
    public AspectRatioInformationType getAspectRatioInformation() {
        return aspectRatioInformation;
    }

    /**
     * Sets the value of the aspectRatioInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AspectRatioInformationType }
     *     
     */
    public void setAspectRatioInformation(AspectRatioInformationType value) {
        this.aspectRatioInformation = value;
    }

}
