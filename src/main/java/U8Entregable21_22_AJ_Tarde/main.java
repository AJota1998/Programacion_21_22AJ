package U8Entregable21_22_AJ_Tarde;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

         ProcessPost p1 = new ProcessPost();

       p1.parseDOM("ficheros/posts.xml");
       p1.imprimir();

        System.out.println("---DATOS DEL POST---");
        System.out.println("\nIntroduzca el título:");
        String titulo = teclado.next();
        System.out.println("Introduzca el link:");
        String link = teclado.next();
        System.out.println("Introduzca la descripción:");
        String descripcion = teclado.next();
        System.out.println("Introduzca el pubdate:");
        String pubdate = teclado.next();
        System.out.println("Introduzca el guid");
        String guid = teclado.next();

        Post post1 = new Post(titulo, link, descripcion, pubdate, guid);

        p1.addPost(post1);
        p1.imprimir();

        System.out.println(p1.getpost());

        p1.convertToJSON();

        System.out.println("\n" + p1.numPostsStax("ficheros/posts.xml") + " posts");

    }
}
