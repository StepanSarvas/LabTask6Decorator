package parsers.jaxb;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class XMLParser {
    public static AllSearchData unmarshall() {
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(AllSearchData.class);
            return (AllSearchData) context.createUnmarshaller()
                    .unmarshal(new FileReader("src\\main\\resources\\data.xml"));
        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}