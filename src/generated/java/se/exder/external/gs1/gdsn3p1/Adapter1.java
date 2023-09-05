
package se.exder.external.gs1.gdsn3p1;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, LocalDateTime>
{


    public LocalDateTime unmarshal(String value) {
        return (se.expertsystems.utils.xml.JAXBDatatypeConverter.parseJava8LocalDateTime(value));
    }

    public String marshal(LocalDateTime value) {
        return (se.expertsystems.utils.xml.JAXBDatatypeConverter.printOffsetDateTime(value));
    }

}
