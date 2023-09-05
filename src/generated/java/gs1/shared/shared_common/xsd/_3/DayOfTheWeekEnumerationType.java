
package gs1.shared.shared_common.xsd._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DayOfTheWeekEnumerationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DayOfTheWeekEnumerationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FRIDAY"/&gt;
 *     &lt;enumeration value="MONDAY"/&gt;
 *     &lt;enumeration value="SATURDAY"/&gt;
 *     &lt;enumeration value="SUNDAY"/&gt;
 *     &lt;enumeration value="THURSDAY"/&gt;
 *     &lt;enumeration value="TUESDAY"/&gt;
 *     &lt;enumeration value="WEDNESDAY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DayOfTheWeekEnumerationType")
@XmlEnum
public enum DayOfTheWeekEnumerationType {

    FRIDAY,
    MONDAY,
    SATURDAY,
    SUNDAY,
    THURSDAY,
    TUESDAY,
    WEDNESDAY;

    public String value() {
        return name();
    }

    public static DayOfTheWeekEnumerationType fromValue(String v) {
        return valueOf(v);
    }

}
