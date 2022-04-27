package UNIDAD8.ENTREGABLE2;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ModificarDOM {

    static Document doc;

    public void parse(String nomFile) {
        try {
            //cargo el fichero XML en Memoria
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.parse(new File(nomFile));

        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    public void imprimir() {
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
                //como se que hay hijos de los hijos del raiz con nombre coche los busco y recorro
                if (e.getTagName().equals("coche")) {
                    NodeList lista_coche = nl.item(i).getChildNodes();
                    for (int j = 0; j < lista_coche.getLength(); j++) {
                        if (lista_coche.item(j).getNodeType() == Node.ELEMENT_NODE) {
                            Element e2 = (Element) lista_coche.item(j);
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
        System.out.println("FIN");
    }

    public void addcomentario() {
        //cojo el elemento raiz
        Element root = doc.getDocumentElement();

        //obtener una lista de nodos si son coche
        NodeList nl = doc.getElementsByTagName("coche");

        for (int i = 0; i < nl.getLength(); i++) {
            Comment nodocomentario = doc.createComment("<!--COMENTARIO AÑADIDO DESDE DOM-->");
            root.insertBefore(nodocomentario, nl.item(i));

        }
    }

    public void addcoche() {

        Element root = doc.getDocumentElement();

        NodeList nl = doc.getElementsByTagName("coche");

        Element nuevocoche = doc.createElement("coche");

        root.appendChild(nuevocoche);

        Element modelo = doc.createElement("modelo");
        Element kilometros = doc.createElement("kilometros");

        nuevocoche.appendChild(modelo);
        modelo.setTextContent("Dacia Logan");

        nuevocoche.appendChild(kilometros);
        kilometros.setTextContent("89098");
    }

    public void reemplazarcoche() {
        Element root = doc.getDocumentElement();

        NodeList nl = doc.getElementsByTagName("coche");

        Element cocheAreemplazar = doc.createElement("coche");
        Element modelo = doc.createElement("modelo");
        Element kilometros = doc.createElement("kilometros");

        modelo.setTextContent("Dacia Logan");
        cocheAreemplazar.appendChild(modelo);

        kilometros.setTextContent("12908");
        cocheAreemplazar.appendChild(kilometros);

        root.replaceChild(cocheAreemplazar, nl.item(0));
    }

    public void volcar() throws TransformerException {

        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();

        Node root = doc.getDocumentElement();
        DOMSource origenDOM = new DOMSource(root);

        //creacion fichero de destino
        File nuevocoches = new File("ficheros/nuevocoches.xml");
        StreamResult destino = new StreamResult("ficheros/nuevocoches.xml");
        transformer.transform(origenDOM, destino);
    }
}


