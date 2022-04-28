package UNIDAD8.ENTREGABLE3;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class CrearSTAXdesdeCero {
    public static void main(String[] args) {

       Mariscos m1 = new Mariscos("Langostino Sanluqueño", "40€", "123AC", "A");
       Mariscos m2 = new Mariscos("Langostino tigre", "30€", "123KC", "B");
       Mariscos m3 = new Mariscos("Gamba Huelva", "38€", "783AC", "A");
       Mariscos m4 = new Mariscos("Navajas", "10€", "129AC", "C");
       Mariscos m5 = new Mariscos("Nécoras", "25€", "198AC", "B");
       Mariscos m6 = new Mariscos("Patas rusas", "27€", "563AC", "A");
       Mariscos m7 = new Mariscos("Coquinas", "15€", "123AL", "B");
       Mariscos m8 = new Mariscos("Almeja chirla", "9€", "143AC", "D");
       Mariscos m9 = new Mariscos("Cigala", "23€", "129AC", "B");
       Mariscos m10 = new Mariscos("Gambón", "10€", "753NC", "B");

       ArrayList<Mariscos> arrayMariscos = new ArrayList<>();

       arrayMariscos.add(m1);
       arrayMariscos.add(m2);
       arrayMariscos.add(m3);
       arrayMariscos.add(m4);
       arrayMariscos.add(m5);
       arrayMariscos.add(m6);
       arrayMariscos.add(m7);
       arrayMariscos.add(m8);
       arrayMariscos.add(m9);
       arrayMariscos.add(m10);

       try {
            //creo el objeto que me va a servir para escribir
           XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
           XMLEventWriter xmlWriter = xmlOutputFactory.createXMLEventWriter(new FileOutputStream("ficheros/crearSTAX.xml"));

           //creo el objeto que me va a servir para crear los eventos
           XMLEventFactory eventFactory = XMLEventFactory.newInstance();

           //creo el evento de principio de documento y lo escribo con el objeto escritor
           StartDocument startDocument = eventFactory.createStartDocument();
           xmlWriter.add(startDocument);

           //creo el evento para introducir el salto de línea y el salto de línea con tabulador
           Characters saltoDeLinea = eventFactory.createCharacters("\n");
           Characters saltoDeLineaTab = eventFactory.createCharacters("\n\t");
           Characters tabulador = eventFactory.createCharacters("\t");
           xmlWriter.add(saltoDeLinea);

           //creo el evento necesario para crear la etiqueta raiz
           StartElement MariscosStartElement = eventFactory.createStartElement("", "", "Mariscos");
           xmlWriter.add(MariscosStartElement);
           xmlWriter.add(saltoDeLineaTab);

           //Recorro y voy creando etiquetas (eventos)
           //variable para comprobar el último elemento, ya que quiero otra salida
           int longitud = 0;

           for (Mariscos m: arrayMariscos) {

               //creo las etiquetas de apertura que va a tener
               StartElement MariscoStart = eventFactory.createStartElement("", "", "Marisco");
               StartElement nombreStart = eventFactory.createStartElement("", "", "Nombre");
               StartElement calidad_saborStart = eventFactory.createStartElement("", "", "CalidadSabor");
               StartElement preciokgStart = eventFactory.createStartElement("", "", "Preciokg");

               //creo un atributo
               Attribute numerolote = eventFactory.createAttribute("numerolote", m.getNumerolote());

               //creo las etiquetas de cierre
               EndElement MariscoEnd = eventFactory.createEndElement("", "", "Marisco");
               EndElement nombreEnd = eventFactory.createEndElement("", "", "Nombre");
               EndElement calidad_saborEnd = eventFactory.createEndElement("", "", "CalidadSabor");
               EndElement preciokgEnd = eventFactory.createEndElement("", "", "Preciokg");

               //creo los contenidos
               Characters nombre = eventFactory.createCharacters(m.getNombre());
               Characters calidad_sabor = eventFactory.createCharacters(m.getCalidadSabor());
               Characters preciokg = eventFactory.createCharacters(m.getCalidadSabor());

               //Añado todos los elementos

               xmlWriter.add(MariscoStart);
               xmlWriter.add(numerolote);

               xmlWriter.add(saltoDeLineaTab);
               xmlWriter.add(tabulador);

               xmlWriter.add(nombreStart);
               xmlWriter.add(nombre);
               xmlWriter.add(nombreEnd);
               xmlWriter.add(saltoDeLineaTab);
               xmlWriter.add(tabulador);

               xmlWriter.add(preciokgStart);
               xmlWriter.add(preciokg);
               xmlWriter.add(preciokgEnd);
               xmlWriter.add(saltoDeLineaTab);
               xmlWriter.add(tabulador);

               xmlWriter.add(calidad_saborStart);
               xmlWriter.add(calidad_sabor);
               xmlWriter.add(calidad_saborEnd);
               xmlWriter.add(saltoDeLineaTab);


               xmlWriter.add(MariscoEnd);

               if (longitud == arrayMariscos.size() - 1 ) {
                   xmlWriter.add(saltoDeLinea);
               } else {
                   xmlWriter.add(saltoDeLineaTab);
               }

               longitud++;
           }

           EndElement MariscosEndElement = eventFactory.createEndElement("", "", "Mariscos");
           xmlWriter.add(MariscosEndElement);
           xmlWriter.add(saltoDeLinea);

           EndDocument endDocument = eventFactory.createEndDocument();
           xmlWriter.add(endDocument);

       } catch (XMLStreamException | FileNotFoundException e) {
           System.out.println(Arrays.toString(e.getStackTrace()));
       }
    }
}
