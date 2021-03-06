package UNIDAD8.ENTREGABLE1;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class RecorridoDOM {
    public static void parse(String nomFile) {
        try {
            //cargo el fichero XML en Memoria
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File(nomFile));

            //cojo el elemento (etiqueta) raíz
            Element raiz = doc.getDocumentElement();

            //obtengo todos los hijos del elemento raiz
            NodeList nl = raiz.getChildNodes();

            //recorro los hijos del raiz
            for (int i = 0; i < nl.getLength(); i++) {

                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    System.out.println("NODO ETIQUETA");
                    Element e = (Element) nl.item(i);
                    System.out.println("Nombre etiqueta: " + e.getTagName());
                    //como se que hay hijos de los hijos del raiz con nombre persona los busco y recorro
                    if (e.getTagName().equals("coche")) {
                        NodeList lista_personas = nl.item(i).getChildNodes();
                        for (int j = 0; j < lista_personas.getLength(); j++) {
                            if (lista_personas.item(j).getNodeType() == Node.ELEMENT_NODE) {
                                Element e2 = (Element) lista_personas.item(j);
                                System.out.print("Nombre etiqueta: " + e2.getTagName() + " - ");
                                System.out.println(e2.getTextContent());
                            }
                        }
                    }

                    //compruebo si el elemento (etiqueta) tiene atributos
                    if (e.hasAttributes()) {
                        System.out.println("Este nodo tiene atributos");

                        //obtengo los atributos y los muestro
                        NamedNodeMap nodemap = e.getAttributes();
                        for (int j = 0; j < nodemap.getLength(); j++) {
                            Node node = nodemap.item(j);
                            Attr atributo = e.getAttributeNode(node.getNodeName());
                            System.out.println("Atributo: " + atributo.getNodeName());
                            System.out.println("Valor: " + atributo.getValue());
                        }
                    }

                    //he encontrado un nodo texto
                } else if (nl.item(i).getNodeType() == Node.TEXT_NODE) {
                    System.out.println("NODO TEXTO");
                    System.out.println("Contiene: ");
                    Text texto = (Text) nl.item(i);
                    //Si el contenido es distinto de una cadena vacio muestra el contenido sin espacios delante ni detras
                    if(!texto.getTextContent().trim().equals("")) {
                        System.out.println("item:" + texto.getTextContent().trim() + ":");
                        //sino dime que hay un texto vacio
                    } else {
                        System.out.println("TEXTO VACÍO");
                    }

                    //he encontrado un nodo comentario
                } else if (nl.item(i).getNodeType() == Node.COMMENT_NODE) {
                    System.out.println("NODO COMENTARIO");
                    System.out.println("CONTIENE");
                    Comment comentario = (Comment) nl.item(i);
                    System.out.println(comentario.getTextContent());
                }
                System.out.println("-------------------------------------");
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    public void numNodosHijos() throws ParserConfigurationException, IOException, SAXException {
        int contador = 1;

        //cargo el fichero XML en Memoria
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse("ficheros/coches.xml");

        //cojo el elemento (etiqueta) raíz
        Element raiz = doc.getDocumentElement();

        //obtengo todos los hijos del elemento raiz
        NodeList nl = raiz.getChildNodes();

        for (int i = 0; i < nl.getLength(); i++) {

            if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                System.out.println(contador++ + " NODO ETIQUETA");
                Element e = (Element) nl.item(i);
                System.out.println(e.getTagName() + e.getTextContent());

            } else if (nl.item(i).getNodeType() == Node.TEXT_NODE) {
                System.out.println(contador++ + " NODO TEXTO");
                Text texto = (Text) nl.item(i);
                if(!texto.getTextContent().trim().equals("")) {
                    System.out.println(texto.getTextContent().trim() + ":");
                    //sino dime que hay un texto vacio
                } else {
                    System.out.println("TEXTO VACÍO");
                }

            } else if (nl.item(i).getNodeType() == Node.COMMENT_NODE) {
                System.out.println(contador++ + " NODO COMENTARIO");
                Comment comentario = (Comment) nl.item(i);
                System.out.println(comentario.getTextContent());
            }
        }
    }
}
