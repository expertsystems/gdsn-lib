
package se.exder.external.gs1.gdsn3p1;

import java.time.LocalDate;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, LocalDate>
{


    public LocalDate unmarshal(String value) {
        return (java.time.LocalDate.parse(value));
    }

    public String marshal(LocalDate value) {
        return (se.expertsystems.utils.xml.JAXBDatatypeConverter.printDate(value));
    }

}
