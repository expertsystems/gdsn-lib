
package gs1.gdsn.farming_and_processing_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gdsn.gdsn_common.xsd._3.FarmingAndProcessingInformationType;
import gs1.gdsn.gdsn_common.xsd._3.GS1AttributeValuePairListType;
import gs1.gdsn.gdsn_common.xsd._3.OrganicInformationType;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.NonBinaryLogicEnumerationType;


/**
 * <p>Java class for FarmingAndProcessingInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FarmingAndProcessingInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rawMaterialIrradiatedCode" type="{urn:gs1:shared:shared_common:xsd:3}NonBinaryLogicEnumerationType" minOccurs="0"/&gt;
 *         &lt;element name="rawMaterialUsedInPreparationWeight" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemOrganicInformation" type="{urn:gs1:gdsn:gdsn_common:xsd:3}OrganicInformationType" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemFarmingAndProcessing" type="{urn:gs1:gdsn:gdsn_common:xsd:3}FarmingAndProcessingInformationType" minOccurs="0"/&gt;
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
@XmlType(name = "FarmingAndProcessingInformationModuleType", propOrder = {
    "rawMaterialIrradiatedCode",
    "rawMaterialUsedInPreparationWeight",
    "tradeItemOrganicInformation",
    "tradeItemFarmingAndProcessing",
    "avpList"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:farming_and_processing_information:xsd:3")
public class FarmingAndProcessingInformationModuleType {

    @XmlSchemaType(name = "string")
    protected NonBinaryLogicEnumerationType rawMaterialIrradiatedCode;
    protected MeasurementType rawMaterialUsedInPreparationWeight;
    protected OrganicInformationType tradeItemOrganicInformation;
    protected FarmingAndProcessingInformationType tradeItemFarmingAndProcessing;
    protected GS1AttributeValuePairListType avpList;

    /**
     * Gets the value of the rawMaterialIrradiatedCode property.
     * 
     * @return
     *     possible object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public NonBinaryLogicEnumerationType getRawMaterialIrradiatedCode() {
        return rawMaterialIrradiatedCode;
    }

    /**
     * Sets the value of the rawMaterialIrradiatedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBinaryLogicEnumerationType }
     *     
     */
    public void setRawMaterialIrradiatedCode(NonBinaryLogicEnumerationType value) {
        this.rawMaterialIrradiatedCode = value;
    }

    /**
     * Gets the value of the rawMaterialUsedInPreparationWeight property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getRawMaterialUsedInPreparationWeight() {
        return rawMaterialUsedInPreparationWeight;
    }

    /**
     * Sets the value of the rawMaterialUsedInPreparationWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setRawMaterialUsedInPreparationWeight(MeasurementType value) {
        this.rawMaterialUsedInPreparationWeight = value;
    }

    /**
     * Gets the value of the tradeItemOrganicInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OrganicInformationType }
     *     
     */
    public OrganicInformationType getTradeItemOrganicInformation() {
        return tradeItemOrganicInformation;
    }

    /**
     * Sets the value of the tradeItemOrganicInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganicInformationType }
     *     
     */
    public void setTradeItemOrganicInformation(OrganicInformationType value) {
        this.tradeItemOrganicInformation = value;
    }

    /**
     * Gets the value of the tradeItemFarmingAndProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link FarmingAndProcessingInformationType }
     *     
     */
    public FarmingAndProcessingInformationType getTradeItemFarmingAndProcessing() {
        return tradeItemFarmingAndProcessing;
    }

    /**
     * Sets the value of the tradeItemFarmingAndProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmingAndProcessingInformationType }
     *     
     */
    public void setTradeItemFarmingAndProcessing(FarmingAndProcessingInformationType value) {
        this.tradeItemFarmingAndProcessing = value;
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
