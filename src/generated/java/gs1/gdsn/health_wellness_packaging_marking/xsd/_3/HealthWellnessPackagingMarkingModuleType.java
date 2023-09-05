
package gs1.gdsn.health_wellness_packaging_marking.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HealthWellnessPackagingMarkingModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HealthWellnessPackagingMarkingModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="healthWellnessPackagingMarking" type="{urn:gs1:gdsn:health_wellness_packaging_marking:xsd:3}HealthWellnessPackagingMarkingType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthWellnessPackagingMarkingModuleType", propOrder = {
    "healthWellnessPackagingMarking"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:health_wellness_packaging_marking:xsd:3")
public class HealthWellnessPackagingMarkingModuleType {

    protected HealthWellnessPackagingMarkingType healthWellnessPackagingMarking;

    /**
     * Gets the value of the healthWellnessPackagingMarking property.
     * 
     * @return
     *     possible object is
     *     {@link HealthWellnessPackagingMarkingType }
     *     
     */
    public HealthWellnessPackagingMarkingType getHealthWellnessPackagingMarking() {
        return healthWellnessPackagingMarking;
    }

    /**
     * Sets the value of the healthWellnessPackagingMarking property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthWellnessPackagingMarkingType }
     *     
     */
    public void setHealthWellnessPackagingMarking(HealthWellnessPackagingMarkingType value) {
        this.healthWellnessPackagingMarking = value;
    }

}
