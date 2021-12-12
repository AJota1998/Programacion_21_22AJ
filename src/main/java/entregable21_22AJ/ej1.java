package entregable21_22AJ;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String a = "Adobo";
        System.out.println("Introduzca una palabra");
        String b = teclado.next();

        do {
            System.out.println("Introduzca un carácter");
            char c = teclado.next().charAt(0);
            System.out.println("Palabra ahorcado " + a + ", " + b + ", " + c);
        } while (!a.equals(b));

    }

    //public static String palabraAhorcado(String a, String b, char c) {

    //}
}
