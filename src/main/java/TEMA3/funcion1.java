package TEMA3;

import java.util.Scanner;

public class funcion1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        int numero = teclado.nextInt();

        eco(numero);

    }
    static void eco (int numero) {
        for (int i = 0; i <= numero; i++) {
            System.out.println("Eco... ");
        }
    }
}
