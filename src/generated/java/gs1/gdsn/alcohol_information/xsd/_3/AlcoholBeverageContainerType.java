
package gs1.gdsn.alcohol_information.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcoholBeverageContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcoholBeverageContainerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="containerMaterialCode" type="{urn:gs1:gdsn:alcohol_information:xsd:3}ContainerMaterialCodeType" minOccurs="0"/&gt;
 *         &lt;element name="containerProcessTypeCode" type="{urn:gs1:gdsn:alcohol_information:xsd:3}ContainerProcessTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="containerShapeCode" type="{urn:gs1:gdsn:alcohol_information:xsd:3}ContainerShapeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="containerTypeCode" type="{urn:gs1:gdsn:alcohol_information:xsd:3}ContainerTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcoholBeverageContainerType", propOrder = {
    "containerMaterialCode",
    "containerProcessTypeCode",
    "containerShapeCode",
    "containerTypeCode"
})
public class AlcoholBeverageContainerType {

    protected ContainerMaterialCodeType containerMaterialCode;
    protected List<ContainerProcessTypeCodeType> containerProcessTypeCode;
    protected ContainerShapeCodeType containerShapeCode;
    protected List<ContainerTypeCodeType> containerTypeCode;

    /**
     * Gets the value of the containerMaterialCode property.
     * 
     * @return
     *     possible object is
     *     {@link ContainerMaterialCodeType }
     *     
     */
    public ContainerMaterialCodeType getContainerMaterialCode() {
        return containerMaterialCode;
    }

    /**
     * Sets the value of the containerMaterialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerMaterialCodeType }
     *     
     */
    public void setContainerMaterialCode(ContainerMaterialCodeType value) {
        this.containerMaterialCode = value;
    }

    /**
     * Gets the value of the containerProcessTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containerProcessTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerProcessTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContainerProcessTypeCodeType }
     * 
     * 
     */
    public List<ContainerProcessTypeCodeType> getContainerProcessTypeCode() {
        if (containerProcessTypeCode == null) {
            containerProcessTypeCode = new ArrayList<ContainerProcessTypeCodeType>();
        }
        return this.containerProcessTypeCode;
    }

    /**
     * Gets the value of the containerShapeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ContainerShapeCodeType }
     *     
     */
    public ContainerShapeCodeType getContainerShapeCode() {
        return containerShapeCode;
    }

    /**
     * Sets the value of the containerShapeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerShapeCodeType }
     *     
     */
    public void setContainerShapeCode(ContainerShapeCodeType value) {
        this.containerShapeCode = value;
    }

    /**
     * Gets the value of the containerTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containerTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContainerTypeCodeType }
     * 
     * 
     */
    public List<ContainerTypeCodeType> getContainerTypeCode() {
        if (containerTypeCode == null) {
            containerTypeCode = new ArrayList<ContainerTypeCodeType>();
        }
        return this.containerTypeCode;
    }

}
