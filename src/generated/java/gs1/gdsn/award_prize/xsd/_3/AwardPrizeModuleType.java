
package gs1.gdsn.award_prize.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AwardPrizeModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AwardPrizeModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="awardPrize" type="{urn:gs1:gdsn:award_prize:xsd:3}AwardPrizeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AwardPrizeModuleType", propOrder = {
    "awardPrize"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:award_prize:xsd:3")
public class AwardPrizeModuleType {

    protected List<AwardPrizeType> awardPrize;

    /**
     * Gets the value of the awardPrize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the awardPrize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAwardPrize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AwardPrizeType }
     * 
     * 
     */
    public List<AwardPrizeType> getAwardPrize() {
        if (awardPrize == null) {
            awardPrize = new ArrayList<AwardPrizeType>();
        }
        return this.awardPrize;
    }

}
