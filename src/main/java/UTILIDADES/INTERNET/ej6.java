package UTILIDADES.INTERNET;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es divisible entre 2");
        } else {
            System.out.println("El número " + numero + " no es divisible entre 2");
        }
    }
}
