package T1.TEMA3.cadenas;

import java.util.Scanner;

public class cadena4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una frase");
        String frase = teclado.nextLine();
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (caracter == ' ') {
                contador++;
            }
        }
        System.out.println("Número de espacios en blanco = " + contador);
    }
}
