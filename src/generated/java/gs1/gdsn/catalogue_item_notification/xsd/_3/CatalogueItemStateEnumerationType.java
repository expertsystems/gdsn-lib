
package gs1.gdsn.catalogue_item_notification.xsd._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogueItemStateEnumerationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CatalogueItemStateEnumerationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CANCELED"/&gt;
 *     &lt;enumeration value="DISCONTINUED"/&gt;
 *     &lt;enumeration value="IN_PROGRESS"/&gt;
 *     &lt;enumeration value="REGISTERED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CatalogueItemStateEnumerationType")
@XmlEnum
public enum CatalogueItemStateEnumerationType {

    CANCELED,
    DISCONTINUED,
    IN_PROGRESS,
    REGISTERED;

    public String value() {
        return name();
    }

    public static CatalogueItemStateEnumerationType fromValue(String v) {
        return valueOf(v);
    }

}
