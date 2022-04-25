package UNIDAD8.ENTREGABLE1;

import UNIDAD8.XML.ej1.ParseadorDOMPersonas;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        //parsear con SAX
        try {

            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser saxParser = spf.newSAXParser();

            RecorridoSAX rs = new RecorridoSAX();
            DefaultHandler parseaSAX = rs;

            saxParser.parse(new File("ficheros/coches.xml"), parseaSAX);

        } catch (ParserConfigurationException | IOException | SAXException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        System.out.println();

        //Parsear con DOM
        RecorridoDOM.parse("ficheros/coches.xml");

        RecorridoDOM r1 = new RecorridoDOM();
        r1.numNodosHijos();
    }

}
