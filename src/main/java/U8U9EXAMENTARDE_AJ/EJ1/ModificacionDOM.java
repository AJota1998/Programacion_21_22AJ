package U8U9EXAMENTARDE_AJ.EJ1;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ModificacionDOM {
    private static Document doc;

    public static void parseDOM() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.parse(new File("ficheros/pilotos.xml"));

        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addPiloto() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca nombre ");
        String nombrepiloto = teclado.nextLine();

        System.out.print("Introduzca edad ");
        String edadpiloto = teclado.nextLine();

        System.out.print("Introduzca escuderia ");
        String escuderiapiloto = teclado.nextLine();

        System.out.print("Introduzca campeonatos ");
        int campeonatospilotos = teclado.nextInt();
        teclado.nextLine();

        Element root = doc.getDocumentElement();

        Element nuevopiloto = doc.createElement("piloto");

        root.appendChild(nuevopiloto);

        Element nombre = doc.createElement("nombre");
        nuevopiloto.appendChild(nombre);
        nombre.setTextContent(nombrepiloto);

        Element edad = doc.createElement("edad");
        nuevopiloto.appendChild(edad);
        edad.setTextContent(edadpiloto);

        Element escuderia = doc.createElement("escuderia");
        nuevopiloto.appendChild(escuderia);
        escuderia.setTextContent(escuderiapiloto);

        Element campeonatos = doc.createElement("campeonatos");
        nuevopiloto.appendChild(campeonatos);
        campeonatos.setTextContent(Integer.toString(campeonatospilotos));
    }


    public static void insertarPaisOrigen() {
        Element root = doc.getDocumentElement();

        NodeList nl = root.getChildNodes();

        for (int i = 0; i < nl.getLength(); i++) {

            if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {

                Element e = (Element) nl.item(i);
                if (e.getTagName().equalsIgnoreCase("piloto")) {

                    Element pais = doc.createElement("pais");
                    pais.setTextContent("Spain");
                    e.appendChild(pais);
                }
            }
        }
    }

    public static void guardarEnFichero() {
        try {

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(doc);

            File ejercicio1 = new File("ficheros/ejercicio1.xml");
            StreamResult destino = new StreamResult(ejercicio1);

            transformer.transform(origenDOM, destino);

        } catch (TransformerException e) {
            System.out.println(e.getMessage());
        }
    }
}
