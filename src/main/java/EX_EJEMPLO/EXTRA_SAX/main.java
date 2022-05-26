package EX_EJEMPLO.EXTRA_SAX;

import UNIDAD8.ENTREGABLE1.RecorridoSAX;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        try {

            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser saxParser = spf.newSAXParser();

            RecorridoSAX rs = new RecorridoSAX();
            DefaultHandler parseaSAX = rs;

            saxParser.parse(new File("ficheros/ejercicio2.xml"), parseaSAX);

        } catch (ParserConfigurationException | IOException | SAXException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        System.out.println();
    }
}
