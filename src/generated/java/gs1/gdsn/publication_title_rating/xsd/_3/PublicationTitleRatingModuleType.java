
package gs1.gdsn.publication_title_rating.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicationTitleRatingModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicationTitleRatingModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publicationTitleRating" type="{urn:gs1:gdsn:publication_title_rating:xsd:3}PublicationTitleRatingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicationTitleRatingModuleType", propOrder = {
    "publicationTitleRating"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:publication_title_rating:xsd:3")
public class PublicationTitleRatingModuleType {

    protected List<PublicationTitleRatingType> publicationTitleRating;

    /**
     * Gets the value of the publicationTitleRating property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicationTitleRating property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicationTitleRating().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublicationTitleRatingType }
     * 
     * 
     */
    public List<PublicationTitleRatingType> getPublicationTitleRating() {
        if (publicationTitleRating == null) {
            publicationTitleRating = new ArrayList<PublicationTitleRatingType>();
        }
        return this.publicationTitleRating;
    }

}
