
package gs1.gdsn.gdsn_common.xsd._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SynchronisationConfirmationStateEnumerationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SynchronisationConfirmationStateEnumerationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RECEIVED"/&gt;
 *     &lt;enumeration value="REJECTED"/&gt;
 *     &lt;enumeration value="REVIEW"/&gt;
 *     &lt;enumeration value="SYNCHRONISED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SynchronisationConfirmationStateEnumerationType")
@XmlEnum
public enum SynchronisationConfirmationStateEnumerationType {

    RECEIVED,
    REJECTED,
    REVIEW,
    SYNCHRONISED;

    public String value() {
        return name();
    }

    public static SynchronisationConfirmationStateEnumerationType fromValue(String v) {
        return valueOf(v);
    }

}
