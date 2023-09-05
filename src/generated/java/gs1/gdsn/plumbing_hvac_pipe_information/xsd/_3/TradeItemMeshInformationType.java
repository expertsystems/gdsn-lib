
package gs1.gdsn.plumbing_hvac_pipe_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeItemMeshInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeItemMeshInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="meshMaterialCode" type="{urn:gs1:gdsn:plumbing_hvac_pipe_information:xsd:3}MeshMaterialCodeType" minOccurs="0"/&gt;
 *         &lt;element name="meshSizeCode" type="{urn:gs1:gdsn:plumbing_hvac_pipe_information:xsd:3}MeshSizeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemMeshInformationType", propOrder = {
    "meshMaterialCode",
    "meshSizeCode"
})
public class TradeItemMeshInformationType {

    protected MeshMaterialCodeType meshMaterialCode;
    protected MeshSizeCodeType meshSizeCode;

    /**
     * Gets the value of the meshMaterialCode property.
     * 
     * @return
     *     possible object is
     *     {@link MeshMaterialCodeType }
     *     
     */
    public MeshMaterialCodeType getMeshMaterialCode() {
        return meshMaterialCode;
    }

    /**
     * Sets the value of the meshMaterialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeshMaterialCodeType }
     *     
     */
    public void setMeshMaterialCode(MeshMaterialCodeType value) {
        this.meshMaterialCode = value;
    }

    /**
     * Gets the value of the meshSizeCode property.
     * 
     * @return
     *     possible object is
     *     {@link MeshSizeCodeType }
     *     
     */
    public MeshSizeCodeType getMeshSizeCode() {
        return meshSizeCode;
    }

    /**
     * Sets the value of the meshSizeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeshSizeCodeType }
     *     
     */
    public void setMeshSizeCode(MeshSizeCodeType value) {
        this.meshSizeCode = value;
    }

}
