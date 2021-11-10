package TEMA3.cadenas;

import java.util.Scanner;

public class cadena1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduczca una palabra");
        String p1 = teclado.next();

        System.out.println("Introduzca otra palabra");
        String p2 = teclado.next();

        System.out.println("La mayor de las dos es " + palabra_larga(p1,p2));

        }
    public static String palabra_larga(String p1, String p2) {
        String plarga;
        if (p1.length()>p2.length()) {
            plarga = p1;
        } else if (p2.length()>p1.length()) {
            plarga = p2;
        } else {
            plarga = "Coinciden";
        }
        return plarga;
    }
}
