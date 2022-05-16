package U8Entregable21_22_AJ_Tarde;

import com.google.gson.Gson;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProcessPost {

    Document doc;
    List<Post> lista_return = new ArrayList<>();

    public void parseDOM(String nomFile) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.parse(new File(nomFile));

        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    public void imprimir() {
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

    public void addPost(Post post) {
        Element root = doc.getDocumentElement();

        NodeList nl = doc.getElementsByTagName("post");

        Element nuevopost = doc.createElement("post");

        root.appendChild(nuevopost);

        Element titulo = doc.createElement("title");
        Element link = doc.createElement("link");
        Element description = doc.createElement("description");
        Element pubdate = doc.createElement("pubdate");
        Element guid = doc.createElement("guid");

        nuevopost.appendChild(titulo);
        titulo.setTextContent(post.getTitle());

        nuevopost.appendChild(link);
        link.setTextContent(post.getLink());

        nuevopost.appendChild(description);
        description.setTextContent(post.getDescription());

        nuevopost.appendChild(pubdate);
        pubdate.setTextContent(post.getPubdate());

        nuevopost.appendChild(guid);
        guid.setTextContent(post.getGuid());
    }

    public List<Post> getpost() {
        String tl = "";
        String li = "";
        String des = "";
        String pd = "";
        String g = "";

        Element raiz = doc.getDocumentElement();

        NodeList nl = raiz.getChildNodes();

        for (int i = 0; i < nl.getLength(); i++) {

            if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                Element e = (Element) nl.item(i);

                if (e.getTagName().equals("post")) {
                    NodeList nlist2 = nl.item(i).getChildNodes();

                    for (int j = 0; j < nlist2.getLength(); j++) {
                        if (nlist2.item(j).getNodeType() == Node.ELEMENT_NODE && nlist2.item(j).getNodeName().equalsIgnoreCase("title")) {
                            Element e2 = (Element) nlist2.item(j);
                            tl = e2.getTextContent();
                        } else if (nlist2.item(j).getNodeType() == Node.ELEMENT_NODE && nlist2.item(j).getNodeName().equalsIgnoreCase("link")) {
                            Element e2 = (Element) nlist2.item(j);
                            li = e2.getTextContent();
                        } else if (nlist2.item(j).getNodeType() == Node.ELEMENT_NODE && nlist2.item(j).getNodeName().equalsIgnoreCase("description")) {
                            Element e2 = (Element) nlist2.item(j);
                            des = e2.getTextContent();
                        } else if (nlist2.item(j).getNodeType() == Node.ELEMENT_NODE && nlist2.item(j).getNodeName().equalsIgnoreCase("pubdate")) {
                            Element e2 = (Element) nlist2.item(j);
                            pd = e2.getTextContent();
                        } else if (nlist2.item(j).getNodeType() == Node.ELEMENT_NODE && nlist2.item(j).getNodeName().equalsIgnoreCase("guid")) {
                            Element e2 = (Element) nlist2.item(j);
                            g = e2.getTextContent();
                        }
                    }
                }
                Post postadd = new Post(tl, li, des, pd, g);
                lista_return.add(postadd);
            }
        }
        return lista_return;
    }

    public int numPostsStax(String filename) {
        int contador = 0;
        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream(filename));

            while (xmlReader.hasNext()) {
                XMLEvent xmlEvent = xmlReader.nextEvent();

                if(xmlEvent.isStartElement()) {
                    StartElement startTag = xmlEvent.asStartElement();

                    if(startTag.getName().equals(new QName("post"))) {
                        contador++;
                    }
                }
            }
        } catch (FileNotFoundException | XMLStreamException e) {
            System.out.println(e.getMessage());
        }
        return contador;
    }

    public void convertToJSON() {
        Gson gson = new Gson();
        String json = gson.toJson(lista_return);

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("ficheros/posts.json"));
            out.write(json);
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
