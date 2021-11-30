package INTERNET;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int numero = teclado.nextInt();
        char caracter = (char) numero;

        System.out.println("En el código ASCII es " + caracter);
    }
}
