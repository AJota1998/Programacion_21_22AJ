package TEMA3.cadenas;

import java.util.Scanner;

public class cadena3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una frase");
        String frase = teclado.nextLine();              //NextLine es para frase, Next es para palabras

        int longitud = frase.length();
        System.out.println(frase.charAt(longitud / 2));
    }
}
