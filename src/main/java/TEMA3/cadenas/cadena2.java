package TEMA3.cadenas;

import java.util.Locale;
import java.util.Scanner;

public class cadena2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase palabra a palabra, para terminar introduzca fin");
        String palabra = teclado.next();
        String parrafo = palabra;

        while (!palabra.equalsIgnoreCase("fin")) {
            System.out.println("Introduce otra palabra, para terminar introduzca fin");
            palabra = teclado.next();
            if (palabra.equalsIgnoreCase("fin")) {
                parrafo = parrafo;
            } else {
                parrafo = (parrafo + " " + palabra);
            }
        }
        System.out.println(parrafo);
    }
}
