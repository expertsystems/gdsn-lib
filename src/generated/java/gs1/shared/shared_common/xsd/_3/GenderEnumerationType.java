
package gs1.shared.shared_common.xsd._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenderEnumerationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GenderEnumerationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FEMALE"/&gt;
 *     &lt;enumeration value="MALE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GenderEnumerationType")
@XmlEnum
public enum GenderEnumerationType {

    FEMALE,
    MALE;

    public String value() {
        return name();
    }

    public static GenderEnumerationType fromValue(String v) {
        return valueOf(v);
    }

}
