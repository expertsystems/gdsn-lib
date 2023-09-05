
package org.unece.cefact.namespaces.standardbusinessdocumentheader;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfServiceTransaction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TypeOfServiceTransaction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RequestingServiceTransaction"/&gt;
 *     &lt;enumeration value="RespondingServiceTransaction"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfServiceTransaction")
@XmlEnum
public enum TypeOfServiceTransaction {

    @XmlEnumValue("RequestingServiceTransaction")
    REQUESTING_SERVICE_TRANSACTION("RequestingServiceTransaction"),
    @XmlEnumValue("RespondingServiceTransaction")
    RESPONDING_SERVICE_TRANSACTION("RespondingServiceTransaction");
    private final String value;

    TypeOfServiceTransaction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfServiceTransaction fromValue(String v) {
        for (TypeOfServiceTransaction c: TypeOfServiceTransaction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
