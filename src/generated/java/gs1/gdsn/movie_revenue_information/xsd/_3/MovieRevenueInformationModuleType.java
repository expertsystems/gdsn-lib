
package gs1.gdsn.movie_revenue_information.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MovieRevenueInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MovieRevenueInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="movieRevenueInformation" type="{urn:gs1:gdsn:movie_revenue_information:xsd:3}MovieRevenueInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovieRevenueInformationModuleType", propOrder = {
    "movieRevenueInformation"
})
@XmlRootElement(namespace = "urn:gs1:gdsn:movie_revenue_information:xsd:3")
public class MovieRevenueInformationModuleType {

    protected MovieRevenueInformationType movieRevenueInformation;

    /**
     * Gets the value of the movieRevenueInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MovieRevenueInformationType }
     *     
     */
    public MovieRevenueInformationType getMovieRevenueInformation() {
        return movieRevenueInformation;
    }

    /**
     * Sets the value of the movieRevenueInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovieRevenueInformationType }
     *     
     */
    public void setMovieRevenueInformation(MovieRevenueInformationType value) {
        this.movieRevenueInformation = value;
    }

}
