package ENTREGABLES.primerentregable;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) { // Me ha faltado tiempo para plantearlo bien.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número de 6 dígitos");
        long n = teclado.nextLong();

            while (n < 100000 || n > 999999) {
                System.out.println("Número incorrecto, introduce uno válido");
                n = teclado.nextLong();
            }
            long aux = 0;
            long inverso = 0;
            long cifra;




    }
}
