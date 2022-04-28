package UNIDAD8.ENTREGABLE3;


import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MostrarSTAX {
    public static void main(String[] args) {

        try {
            //obtenemos el lector de XML
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("ficheros/coches.xml"));

            //recorro la lista de eventos.
            while (xmlReader.hasNext()) {

                //obtengo el elemento siguiente que voy a tratar
                XMLEvent xmlEvent = xmlReader.nextEvent();

                //si es un evento de apertura de etiqueta
                if(xmlEvent.isStartElement()) {

                    //obtengo la información de la etiqueta
                    StartElement startTag = xmlEvent.asStartElement();

                    //inicio la apertura de la etiqueta, en este caso la cierro porque sé que no tengo atributos
                    System.out.println("<" + startTag.getName().getLocalPart() + ">");

                    //comprobación del resto de condiciones
                } else if (xmlEvent.isEndElement()) {
                    EndElement endtag = xmlEvent.asEndElement();
                    System.out.println("</" + endtag.getName().getLocalPart() + ">");

                } else if (xmlEvent.isStartDocument()) {
                    System.out.println("COMIENZO EL PARSEO CON STAX");

                } else if (xmlEvent.isEndDocument()) {
                    System.out.println("FIN DEL PARSEO CON STAX");

                } else if (xmlEvent.isCharacters()) {
                    Characters texto = xmlEvent.asCharacters();

                    //si el texto no es un salto de linea
                    if (!texto.getData().contains("\n")) {
                        System.out.println("  " + texto.getData());
                    }
                }
            }
        } catch (FileNotFoundException | XMLStreamException e) {
            System.out.println(e.getMessage());
        }

    }
}
