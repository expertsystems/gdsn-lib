
package gs1.gdsn.registry_catalogue_item.xsd._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistryCatalogueItemStateEnumerationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RegistryCatalogueItemStateEnumerationType"&gt;
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
@XmlType(name = "RegistryCatalogueItemStateEnumerationType")
@XmlEnum
public enum RegistryCatalogueItemStateEnumerationType {

    CANCELED,
    DISCONTINUED,
    IN_PROGRESS,
    REGISTERED;

    public String value() {
        return name();
    }

    public static RegistryCatalogueItemStateEnumerationType fromValue(String v) {
        return valueOf(v);
    }

}
