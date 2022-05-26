package EX_EJEMPLO.EJ1;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ParseDOM {

    private static Document doc;

    public static void parseDOM() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.parse(new File("ficheros/examenEjemplo.xml"));

        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void imprimirDOM() {
        Element raiz = doc.getDocumentElement();

        NodeList nl = raiz.getChildNodes();

        for (int i = 0; i < nl.getLength(); i++) {

            if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                System.out.println("NODO ETIQUETA");
                Element e = (Element) nl.item(i);
                System.out.println("Nombre etiqueta: " + e.getTagName());

                if (e.getTagName().equals("post")) {
                    NodeList lista_post = nl.item(i).getChildNodes();

                    for (int j = 0; j < lista_post.getLength(); j++) {
                        if (lista_post.item(j).getNodeType() == Node.ELEMENT_NODE) {
                            Element e2 = (Element) lista_post.item(j);
                            System.out.print("Nombre etiqueta: " + e2.getTagName() + " --> ");
                            System.out.println(e2.getTextContent());
                        }
                    }
                }
                if (e.hasAttributes()) {
                    System.out.println("Este nodo tiene atributos");

                    NamedNodeMap nodemap = e.getAttributes();
                    for (int j = 0; j < nodemap.getLength(); j++) {
                        Node node = nodemap.item(j);
                        Attr atributo = e.getAttributeNode(node.getNodeName());
                        System.out.println("Atributo: " + atributo.getNodeName());
                        System.out.println("Valor: " + atributo.getValue());
                    }
                }
            } else if (nl.item(i).getNodeType() == Node.TEXT_NODE) {
                System.out.println("NODO TEXTO");
                System.out.println("Contiene: ");
                Text texto = (Text) nl.item(i);
                if (!texto.getTextContent().trim().equals("")) {
                    System.out.println("item:" + texto.getTextContent().trim() + ":");
                } else {
                    System.out.println("TEXTO VACÍO");
                }
            } else if (nl.item(i).getNodeType() == Node.COMMENT_NODE) {
                System.out.println("NODO COMENTARIO");
                System.out.println("CONTIENE");
                Comment comentario = (Comment) nl.item(i);
                System.out.println(comentario.getTextContent());
            }
            System.out.println("-------------------------------------");
        }
    }


    public static void annadirLibro() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca titulo: ");
        String ntitulo = teclado.nextLine();

        System.out.print("Introduzca autor: ");
        String nautor = teclado.nextLine();

        System.out.print("Introduzca editorial: ");
        String neditorial = teclado.nextLine();

        System.out.print("Introduzca número de páginas: ");
        int npaginas = teclado.nextInt();
        teclado.nextLine();

        Element root = doc.getDocumentElement();

        Element nuevoLibro = doc.createElement("libro");

        root.appendChild(nuevoLibro);

        Element titulo = doc.createElement("titulo");
        nuevoLibro.appendChild(titulo);
        titulo.setTextContent(ntitulo);

        Element autor = doc.createElement("autor");
        nuevoLibro.appendChild(autor);
        autor.setTextContent(nautor);

        Element editorial = doc.createElement("editorial");
        nuevoLibro.appendChild(editorial);
        editorial.setTextContent(neditorial);

        Element paginas = doc.createElement("paginas");
        nuevoLibro.appendChild(paginas);
        paginas.setTextContent(Integer.toString(npaginas));
    }


    public static void insertarPaisEditorial() {
        Element root = doc.getDocumentElement();

        NodeList nl = root.getChildNodes();

        for (int i = 0; i < nl.getLength(); i++) {

            if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {

                Element e = (Element) nl.item(i);

                NodeList nl2 = e.getChildNodes();

                for (int j = 0; j < nl2.getLength(); j++) {

                    if (nl2.item(j).getNodeType() == Node.ELEMENT_NODE) {

                        Element e2 = (Element) nl2.item(j);

                        if (e2.getTagName().equalsIgnoreCase("editorial")) {

                            Element pais = doc.createElement("pais");
                            pais.setTextContent("España");
                            e2.appendChild(pais);
                        }
                    }
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

            File ejercicio2 = new File("ficheros/ejercicio2.xml");
            StreamResult destino = new StreamResult(ejercicio2);

            transformer.transform(origenDOM, destino);

        } catch (TransformerException e) {
            System.out.println(e.getMessage());
        }
    }
}
