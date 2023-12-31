
package gs1.gdsn.food_and_beverage_preparation_serving.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.gdsn.gdsn_common.xsd._3.PreparationTypeCodeType;


/**
 * <p>Java class for FoodAndBeveragePreparationServingModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FoodAndBeveragePreparationServingModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="manufacturerPreparationTypeCode" type="{urn:gs1:gdsn:gdsn_common:xsd:3}PreparationTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="servingQuantityInformation" type="{urn:gs1:gdsn:food_and_beverage_preparation_serving:xsd:3}ServingQuantityInformationType" minOccurs="0"/&gt;
 *         &lt;element name="preparationServing" type="{urn:gs1:gdsn:food_and_beverage_preparation_serving:xsd:3}PreparationServingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productPreparationTextureInformation" type="{urn:gs1:gdsn:food_and_beverage_preparation_serving:xsd:3}ProductPreparationTextureInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="avpList" type="{urn:gs1:gdsn:gdsn_common:xsd:3}GS1_AttributeValuePairListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoodAndBeveragePreparationServingModuleType", propOrder = {
    "manufacturerPreparationTypeCode",
    "servingQuantityInformation",
    "preparationServing",
    "productPreparationTextureInformation",
    "avpList"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:food_and_beverage_preparation_serving:xsd:3")
public class FoodAndBeveragePreparationServingModuleType {

    protected List<PreparationTypeCodeType> manufacturerPreparationTypeCode;
    protected ServingQuantityInformationType servingQuantityInformation;
    protected List<PreparationServingType> preparationServing;
    protected List<ProductPreparationTextureInformationType> productPreparationTextureInformation;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the manufacturerPreparationTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerPreparationTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerPreparationTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreparationTypeCodeType }
     * 
     * 
     */
    public List<PreparationTypeCodeType> getManufacturerPreparationTypeCode() {
        if (manufacturerPreparationTypeCode == null) {
            manufacturerPreparationTypeCode = new ArrayList<PreparationTypeCodeType>();
        }
        return this.manufacturerPreparationTypeCode;
    }

    /**
     * Gets the value of the servingQuantityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ServingQuantityInformationType }
     *     
     */
    public ServingQuantityInformationType getServingQuantityInformation() {
        return servingQuantityInformation;
    }

    /**
     * Sets the value of the servingQuantityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServingQuantityInformationType }
     *     
     */
    public void setServingQuantityInformation(ServingQuantityInformationType value) {
        this.servingQuantityInformation = value;
    }

    /**
     * Gets the value of the preparationServing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preparationServing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreparationServing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreparationServingType }
     * 
     * 
     */
    public List<PreparationServingType> getPreparationServing() {
        if (preparationServing == null) {
            preparationServing = new ArrayList<PreparationServingType>();
        }
        return this.preparationServing;
    }

    /**
     * Gets the value of the productPreparationTextureInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productPreparationTextureInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductPreparationTextureInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPreparationTextureInformationType }
     * 
     * 
     */
    public List<ProductPreparationTextureInformationType> getProductPreparationTextureInformation() {
        if (productPreparationTextureInformation == null) {
            productPreparationTextureInformation = new ArrayList<ProductPreparationTextureInformationType>();
        }
        return this.productPreparationTextureInformation;
    }

    /**
     * Gets the value of the avpList property.
     * 
     * @return
     *     possible object is
     *     {@link GS1AttributeValuePairListType }
     *     
     */
    public GS1AttributeValuePairListType getAvpList() {
        return avpList;
    }

    /**
     * Sets the value of the avpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GS1AttributeValuePairListType }
     *     
     */
    public void setAvpList(GS1AttributeValuePairListType value) {
        this.avpList = value;
    }

}
