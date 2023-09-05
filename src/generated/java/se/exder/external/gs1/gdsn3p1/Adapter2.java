
package se.exder.external.gs1.gdsn3p1;

import java.time.LocalTime;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, LocalTime>
{


    public LocalTime unmarshal(String value) {
        return (java.time.LocalTime.parse(value));
    }

    public String marshal(LocalTime value) {
        return (se.expertsystems.utils.xml.JAXBDatatypeConverter.printTime(value));
    }

}
