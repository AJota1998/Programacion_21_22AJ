package UNIDAD8.XML.ej1;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws ParserConfigurationException, SAXException {

        ParseadorDOMPersonas.parse("ficheros/personasXML.xml");




        try {
            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser saxParser = spf.newSAXParser();

            DefaultHandler ParseadorSAXPersonas = new ParseadorSAXPersonas();

            saxParser.parse(new File("ficheros/personasXML.xml"), ParseadorSAXPersonas);
        }catch (ParserConfigurationException | IOException | SAXException e) {
            System.out.println("ERROR");
        }
    }
}
