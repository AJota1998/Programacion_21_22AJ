package U8U9EXAMENTARDE_AJ.EJ2;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RecorridoSTAX {

    Scanner teclado = new Scanner(System.in);
    public void pilotomascampeonatos() {
        try {

            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader =
                    xmlInputFactory.createXMLEventReader(new FileInputStream("ficheros/ejercicio1.xml"));

            String nombrePMC = "";
            String edadPMC = "";
            String escuderiaPMC = "";
            int campeonatosPMC = 0;

            String pnombre = "";
            String pedad = "";
            String pescuderia = "";
            int pcampeonatos = 0;

            String tagActual = "";

            while (xmlReader.hasNext()) {

                XMLEvent xmlEvent = xmlReader.nextEvent();

                if (xmlEvent.isStartElement()) {

                    StartElement startTag = xmlEvent.asStartElement();

                    tagActual = startTag.getName().getLocalPart();

                } else if (xmlEvent.isCharacters()) {

                    Characters texto = xmlEvent.asCharacters();

                    if (!texto.getData().contains("\n")) {
                        if (!tagActual.equals("")) {

                            switch (tagActual) {
                                case "nombre":
                                    pnombre = texto.getData();
                                    break;
                                case "edad":
                                    pedad = texto.getData();
                                    break;
                                case "escuderia":
                                    pescuderia = texto.getData();
                                    break;
                                case "campeonatos":
                                    pcampeonatos = Integer.parseInt(texto.getData());
                                    break;
                            }
                        }
                    }
                } else if (xmlEvent.isEndElement()) {

                    EndElement endtag = xmlEvent.asEndElement();

                    if (endtag.getName().getLocalPart().equals("piloto")) {

                        if (pcampeonatos > campeonatosPMC) {

                            nombrePMC = pnombre;
                            edadPMC = pedad;
                            escuderiaPMC = pescuderia;
                            campeonatosPMC = pcampeonatos;
                        }

                        pnombre = "";
                        pedad = "";
                        pescuderia = "";
                        pcampeonatos = 0;
                    }
                }
            }

            System.out.println("Datos del piloto con más Campeonatos:");
            System.out.println("Nombre:-> " + nombrePMC);
            System.out.println("Edad:-> " + edadPMC);
            System.out.println("Escuderia:-> " + escuderiaPMC);
            System.out.println("Campeonatos:-> " + campeonatosPMC);

        } catch (FileNotFoundException | XMLStreamException e) {
            System.out.println(e.getMessage());
        }
    }


    public void numPilotosEscuderia() {

        System.out.println("Introduzca la escuderia: ");
        String escud = teclado.next();
        Integer contador = 0;

        try {

            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader =
                    xmlInputFactory.createXMLEventReader(new FileInputStream("ficheros/ejercicio1.xml"));

            while (xmlReader.hasNext()) {
                XMLEvent xmlEvent = xmlReader.nextEvent();

                if (xmlEvent.isCharacters()) {

                    Characters texto = xmlEvent.asCharacters();

                    if (texto.getData().equalsIgnoreCase(escud)) {
                        contador++;
                    }
                }
            }

            System.out.println("Hay " + contador + " pilotos de la escuderia " + escud);

        } catch (FileNotFoundException | XMLStreamException e) {
            System.out.println(e.getMessage());
        }
    }
}
