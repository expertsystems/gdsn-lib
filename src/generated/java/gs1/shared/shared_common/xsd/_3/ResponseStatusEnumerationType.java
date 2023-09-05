
package gs1.shared.shared_common.xsd._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseStatusEnumerationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ResponseStatusEnumerationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCEPTED"/&gt;
 *     &lt;enumeration value="MODIFIED"/&gt;
 *     &lt;enumeration value="NO_ACTION"/&gt;
 *     &lt;enumeration value="REJECTED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResponseStatusEnumerationType")
@XmlEnum
public enum ResponseStatusEnumerationType {

    ACCEPTED,
    MODIFIED,
    NO_ACTION,
    REJECTED;

    public String value() {
        return name();
    }

    public static ResponseStatusEnumerationType fromValue(String v) {
        return valueOf(v);
    }

}
