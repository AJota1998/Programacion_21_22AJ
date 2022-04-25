package UNIDAD8.ENTREGABLE1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class RecorridoSAX extends DefaultHandler {

    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("COMIENZA EL PARSEADO DEL FICHERO CON SAX");
    }

    public void endDocument() throws SAXException {
        super.endDocument();
        System.out.println("\nFIN DEL PARSEO CON SAX");
    }

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        System.out.print("<" + qName);

        if (attributes != null) {
            for (int i = 0; i < attributes.getLength(); i++) {
                System.out.print(" " + attributes.getQName(i) + "=\"" + attributes.getValue(i) + "\"");
            }
        }
        System.out.print(">");
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);

        System.out.print("</" + qName + ">");
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);

        String content = new String(ch, start, length);
        System.out.print(content);
    }
}

