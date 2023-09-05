
package gs1.gdsn.gdsn_common.xsd._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentCommandEnumerationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DocumentCommandEnumerationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADD"/&gt;
 *     &lt;enumeration value="CHANGE_BY_REFRESH"/&gt;
 *     &lt;enumeration value="CORRECT"/&gt;
 *     &lt;enumeration value="DELETE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentCommandEnumerationType")
@XmlEnum
public enum DocumentCommandEnumerationType {

    ADD,
    CHANGE_BY_REFRESH,
    CORRECT,
    DELETE;

    public String value() {
        return name();
    }

    public static DocumentCommandEnumerationType fromValue(String v) {
        return valueOf(v);
    }

}
