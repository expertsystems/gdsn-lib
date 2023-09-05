
package gs1.shared.shared_common.xsd._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentActionEnumerationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DocumentActionEnumerationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADD"/&gt;
 *     &lt;enumeration value="CHANGE_BY_REFRESH"/&gt;
 *     &lt;enumeration value="DELETE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentActionEnumerationType")
@XmlEnum
public enum DocumentActionEnumerationType {

    ADD,
    CHANGE_BY_REFRESH,
    DELETE;

    public String value() {
        return name();
    }

    public static DocumentActionEnumerationType fromValue(String v) {
        return valueOf(v);
    }

}
